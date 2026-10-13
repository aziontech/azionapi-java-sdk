import { execFile } from 'node:child_process'
import { mkdirSync } from 'node:fs'
import path from 'node:path'
import { promisify } from 'node:util'
import { BUILD, HARNESS, PACKAGES, ROOT } from './src'

const run = promisify(execFile)
const MVN = process.env.MVN_BIN ?? 'mvn'
const PARALLEL = Number(process.env.BUILD_PARALLELISM ?? 4)

// Compile every package exactly as published (its own pom.xml) and collect its runtime
// dependencies, then compile the reflection probe once.
export default async function setup() {
  const queue = [...PACKAGES]
  const worker = async () => {
    for (let pkg = queue.shift(); pkg; pkg = queue.shift()) {
      await run(
        MVN,
        ['-q', '-B', 'compile', 'dependency:copy-dependencies', '-DincludeScope=runtime', '-Dmaven.javadoc.skip=true'],
        { cwd: path.join(ROOT, pkg), maxBuffer: 64 * 1024 * 1024 },
      ).catch((err) => {
        throw new Error(`mvn build failed for ${pkg}:\n${err.stdout}\n${err.stderr}`)
      })
    }
  }
  await Promise.all(Array.from({ length: PARALLEL }, worker))
  mkdirSync(path.join(BUILD, 'probe'), { recursive: true })
  await run('javac', ['-cp', path.join(ROOT, PACKAGES[0], 'target', 'dependency', '*'), '-d', path.join(BUILD, 'probe'), path.join(HARNESS, 'Probe.java')])
}
