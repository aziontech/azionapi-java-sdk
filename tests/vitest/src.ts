import { readdirSync, statSync } from 'node:fs'
import path from 'node:path'

export const ROOT = path.resolve(__dirname, '../..')
export const HARNESS = path.resolve(__dirname, 'harness')
export const BUILD = path.resolve(__dirname, '.build')

// Every top-level directory with a pom.xml is a generated package.
export const PACKAGES = readdirSync(ROOT).filter((d) => {
  try {
    return statSync(path.join(ROOT, d, 'pom.xml')).isFile()
  } catch {
    return false
  }
})

export function classpath(pkg: string): string {
  const target = path.join(ROOT, pkg, 'target')
  return [path.join(target, 'classes'), path.join(target, 'dependency', '*'), path.join(BUILD, 'probe')].join(path.delimiter)
}
