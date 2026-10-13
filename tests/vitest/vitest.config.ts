import { defineConfig } from 'vitest/config'

export default defineConfig({
  test: {
    // Compiling 18 Maven projects takes a while on a cold cache.
    globalSetup: ['./globalSetup.ts'],
    hookTimeout: 1_800_000,
    testTimeout: 120_000,
    include: ['functional/**/*.test.ts'],
  },
})
