# azionapi-java-sdk

Java client packages for the Azion APIs, generated with
[OpenAPI Generator](https://openapi-generator.tech) (`java` generator, `okhttp-gson`
library, Java 8 bytecode). Each top-level directory is an independent Maven/Gradle
project (`org.openapitools:openapi-java-client`, package `org.openapitools.client`) with
its own `README.md` (endpoint and model reference) and `docs/`.

## Packages

| Directory | API classes |
|-----------|-------------|
| `credentials` | `DefaultApi` |
| `data_streaming` | `DataStreamingApi`, `DataStreamingDomainApi`, `DataStreamingTemplatesApi` |
| `digital_certificates` | `CreateCsrApi`, `CreateDigitalCertificateApi`, `DeleteDigitalCertificateApi`, `OverwriteDigitalCertificateApi`, `RetrieveDigitalCertificateByIdApi`, `RetrieveDigitalCertificateListApi`, `UpdateDigitalCertificateApi` |
| `domains` | `DomainsApi` |
| `edgeapplications` | `EdgeApplicationsCacheSettingsApi`, `EdgeApplicationsDeviceGroupsApi`, `EdgeApplicationsEdgeFunctionsInstancesApi`, `EdgeApplicationsMainSettingsApi`, `EdgeApplicationsOriginsApi`, `EdgeApplicationsRulesEngineApi` |
| `edgefirewall` | `DefaultApi` |
| `edgefunctions` | `EdgeFunctionsApi` |
| `edgefunctionsinstance_edgefirewall` | `DefaultApi` |
| `edgenode` | `DefaultApi` |
| `idns` | `DnssecApi`, `RecordsApi`, `ZonesApi` |
| `networklist` | `DefaultApi` |
| `personal_tokens` | `PersonalTokenApi` |
| `realtimepurge` | `RealTimePurgeApi` |
| `services` | `DefaultApi` |
| `storage` | `BucketsApi`, `StorageApi` |
| `storageapi` | `DefaultApi` |
| `variables` | `ApiApi`, `VariablesApi` |
| `waf` | `WafApi` |

## Requirements

- JDK 8 or later (CI builds with JDK 17)
- Maven 3 (or the Gradle wrapper shipped in each package)

## Installation

Every package has the same Maven coordinates, so install the one you need into your
local repository and depend on it from your project:

```bash
cd personal_tokens
mvn clean install -DskipTests
```

## Usage

Authenticate with an Azion personal token in the `Authorization` header using the
`Token` prefix:

```java
import org.openapitools.client.ApiClient;
import org.openapitools.client.Configuration;
import org.openapitools.client.api.PersonalTokenApi;

ApiClient client = Configuration.getDefaultApiClient();
client.setApiKey(System.getenv("AZION_TOKEN"));
client.setApiKeyPrefix("Token");

PersonalTokenApi api = new PersonalTokenApi(client);
System.out.println(api.listPersonalToken());
```

Each package README lists every endpoint and model of that API.

## Tests

Functional tests live in `tests/vitest/` and run in CI (`.github/workflows/ci-tests.yml`):

```bash
cd tests/vitest
npm ci
npm test   # needs JDK 17 and Maven on PATH
```

They compile every package with its own `pom.xml`, check through a reflection probe
(`tests/vitest/harness/Probe.java`) that every endpoint documented in the package README
builds a request with the right HTTP verb and route, and run real HTTP calls against a
local API double (authentication header, JSON body, path parameters, model
deserialization and `ApiException` on HTTP errors).

## Versioning

Every push to `main` is tagged with the next SemVer version (`vX.Y.Z`) by
`.github/workflows/bump_version.yml`. Notable changes are recorded in `CHANGELOG.md`.

## Contributing and security

See [CONTRIBUTING.md](CONTRIBUTING.md). Report vulnerabilities privately as described in
[SECURITY.md](SECURITY.md).

## License

[MIT](LICENSE)
