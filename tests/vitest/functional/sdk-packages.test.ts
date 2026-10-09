import { execFile } from 'node:child_process'
import { readFileSync, readdirSync } from 'node:fs'
import { createServer, type IncomingMessage, type Server } from 'node:http'
import type { AddressInfo } from 'node:net'
import path from 'node:path'
import { promisify } from 'node:util'
import { afterAll, beforeAll, describe, expect, it } from 'vitest'
import { PACKAGES, ROOT, classpath } from '../src'

const run = promisify(execFile)

async function probe(pkg: string, ...args: string[]) {
  const { stdout } = await run('java', ['-cp', classpath(pkg), 'Probe', ...args], { maxBuffer: 16 * 1024 * 1024 })
  return JSON.parse(stdout)
}

function apiClasses(pkg: string): string[] {
  const dir = path.join(ROOT, pkg, 'src/main/java/org/openapitools/client/api')
  return readdirSync(dir).filter((f) => f.endsWith('Api.java')).map((f) => f.replace(/\.java$/, ''))
}

// Placeholders the probe uses for path parameters, mapped back to a generic "{param}".
function normalize(route: string): string {
  return route
    .replace(/__P\d+__/g, '{param}')
    .replace(/00000000-0000-0000-0000-\d{12}/g, '{param}')
    .replace(/\b900\d{3}\b/g, '{param}')
    .replace(/\{[^}]+\}/g, '{param}')
}

// Endpoint table of the package README: *ApiClass* | [**method**](...) | **VERB** /path | ...
function documentedEndpoints(pkg: string) {
  const readme = readFileSync(path.join(ROOT, pkg, 'README.md'), 'utf8')
  return [...readme.matchAll(/^\*(\w+)\* \| \[\*\*(\w+)\*\*\]\([^)]*\) \| \*\*(\w+)\*\* (\S+) \|/gm)].map(
    ([, className, name, method, route]) => `${className}.${name} ${method} ${normalize(route)}`,
  )
}

// API classes left in the source tree by an older generation: they still compile but are
// no longer in the package README (the current generator output). Pinned so that a
// regeneration that removes them, or a new undocumented class, makes the suite fail.
const KNOWN_UNDOCUMENTED: Record<string, string[]> = {
  storage: ['BucketsApi'],
  variables: ['ApiApi'],
}

describe('generated packages', () => {
  it('finds every package of the SDK', () => {
    expect(PACKAGES.length).toBeGreaterThanOrEqual(18)
  })

  describe.each(PACKAGES)('%s', (pkg) => {
    it('compiles and maps every documented endpoint to the right HTTP verb and route', async () => {
      const documented = documentedEndpoints(pkg)
      expect(documented.length).toBeGreaterThan(0)
      const documentedClasses = new Set(documented.map((e) => e.split('.')[0]))
      const undocumented = apiClasses(pkg).filter((c) => !documentedClasses.has(c))
      expect(undocumented.sort()).toEqual(KNOWN_UNDOCUMENTED[pkg] ?? [])
      const { basePath, routes } = await probe(pkg, 'routes', ...documentedClasses)
      expect(basePath).toMatch(/^https?:\/\//)
      const prefix = new URL(basePath).pathname.replace(/\/$/, '')
      const generated = (routes as { className: string; name: string; method: string; path: string }[]).map(
        (r) => `${r.className}.${r.name} ${r.method} ${normalize(r.path.slice(prefix.length))}`,
      )
      expect(generated.sort()).toEqual(documented.sort())
    })
  })
})

interface Captured { method: string; url: string; headers: IncomingMessage['headers']; body: string }

describe('HTTP round trip against a local API double', () => {
  let server: Server
  let baseUrl: string
  const captured: Captured[] = []
  const responses = new Map<string, { status: number; body: unknown }>()

  beforeAll(async () => {
    server = createServer((req, res) => {
      let body = ''
      req.on('data', (chunk) => (body += chunk))
      req.on('end', () => {
        captured.push({ method: req.method ?? '', url: req.url ?? '', headers: req.headers, body })
        const reply = responses.get(`${req.method} ${req.url}`) ?? { status: 404, body: { detail: 'Not found.' } }
        res.writeHead(reply.status, { 'Content-Type': 'application/json' })
        res.end(JSON.stringify(reply.body))
      })
    })
    await new Promise<void>((resolve) => server.listen(0, '127.0.0.1', resolve))
    baseUrl = `http://127.0.0.1:${(server.address() as AddressInfo).port}`
  })

  afterAll(() => new Promise<void>((resolve) => server.close(() => resolve())))

  async function call(pkg: string, api: string, method: string, args: unknown[]) {
    const before = captured.length
    const result = await probe(pkg, 'call', baseUrl, api, method, JSON.stringify(args))
    expect(captured.length).toBe(before + 1)
    return { result, request: captured[captured.length - 1] }
  }

  it('personal_tokens: GET by id sends the token header and deserializes the model', async () => {
    const id = '7f3a1c2e-0000-4000-8000-000000000001'
    responses.set(`GET /iam/personal_tokens/${id}`, {
      status: 200,
      body: { uuid: id, name: 'ci', created: '2026-01-02T03:04:05Z', expires_at: '2027-01-02T03:04:05Z', description: 'pipeline' },
    })
    const { result, request } = await call('personal_tokens', 'PersonalTokenApi', 'getPersonalToken', [id])
    expect(request.method).toBe('GET')
    expect(request.headers.authorization).toBe('Token test-token')
    expect(request.headers.accept).toContain('application/json')
    expect(result.error).toBeNull()
    expect(result.dataType).toBe('PersonalTokenResponseGet')
    expect(result.data).toMatchObject({ uuid: id, name: 'ci', description: 'pipeline' })
  })

  it('variables: list returns typed Variable objects', async () => {
    const variable = { uuid: '0b1e8a52-0000-4000-8000-0000000000a1', key: 'API_URL', value: 'https://example.test', secret: false, last_editor: 'ci', created_at: '2026-01-01T00:00:00Z', updated_at: '2026-01-01T00:00:00Z' }
    responses.set('GET /variables', { status: 200, body: [variable] })
    const { result, request } = await call('variables', 'VariablesApi', 'apiVariablesList', [])
    expect(request.headers.authorization).toBe('Token test-token')
    expect(result.error).toBeNull()
    expect(result.data).toHaveLength(1)
    expect(result.data[0]).toMatchObject({ uuid: '0b1e8a52-0000-4000-8000-0000000000a1', key: 'API_URL', value: 'https://example.test', secret: false })
  })

  it('domains: POST serializes the JSON body and sends the versioned headers', async () => {
    responses.set('POST /domains', {
      status: 201,
      body: { results: { id: 10, name: 'site', cnames: ['www.example.test'], cname_access_only: false, digital_certificate_id: null, edge_application_id: 5, is_active: true, domain_name: 'abc.map.azionedge.net' }, schema_version: 3 },
    })
    const payload = { name: 'site', cnames: ['www.example.test'], cname_access_only: false, edge_application_id: 5, is_active: true }
    const { result, request } = await call('domains', 'DomainsApi', 'createDomain', [
      'application/json; version=3',
      'application/json; version=3',
      payload,
    ])
    expect(request.method).toBe('POST')
    expect(request.headers['content-type']).toContain('application/json')
    expect(request.headers.accept).toBe('application/json; version=3')
    expect(JSON.parse(request.body)).toMatchObject(payload)
    expect(result.error).toBeNull()
    expect(result.dataType).toBe('DomainResponseWithResult')
    expect(result.data.results).toMatchObject({ id: 10, name: 'site', cnames: ['www.example.test'] })
  })

  it('domains: path parameters are encoded into the route and HTTP errors raise ApiException', async () => {
    responses.set('GET /domains/42', { status: 200, body: { results: { id: 42, name: 'x' }, schema_version: 3 } })
    const ok = await call('domains', 'DomainsApi', 'getDomain', ['42', null])
    expect(ok.request.url).toBe('/domains/42')
    expect(ok.result.data.results.id).toBe(42)
    const missing = await call('domains', 'DomainsApi', 'getDomain', ['999', null])
    expect(missing.request.url).toBe('/domains/999')
    expect(missing.result.error).toEqual({ status: 404 })
  })
})
