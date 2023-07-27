# openapi-java-client

Personal Tokens - OpenAPI
- API version: 1.0.0
  - Build date: 2023-07-14T19:12:06.817083Z[GMT]

The Personal Tokens API allows you to manage your existing personal tokens.



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PersonalTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    PersonalTokenApi apiInstance = new PersonalTokenApi(defaultClient);
    CreatePersonalTokenRequest createPersonalTokenRequest = new CreatePersonalTokenRequest(); // CreatePersonalTokenRequest | 
    try {
      CreatePersonalTokenResponse result = apiInstance.createPersonalToken(createPersonalTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonalTokenApi#createPersonalToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.azionapi.net*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PersonalTokenApi* | [**createPersonalToken**](docs/PersonalTokenApi.md#createPersonalToken) | **POST** /iam/personal_tokens | Create a new personal token
*PersonalTokenApi* | [**deletePersonalToken**](docs/PersonalTokenApi.md#deletePersonalToken) | **DELETE** /iam/personal_tokens/{personalTokenId} | Delete a personal token by id
*PersonalTokenApi* | [**getPersonalToken**](docs/PersonalTokenApi.md#getPersonalToken) | **GET** /iam/personal_tokens/{personalTokenId} | Get a personal token info
*PersonalTokenApi* | [**listPersonalToken**](docs/PersonalTokenApi.md#listPersonalToken) | **GET** /iam/personal_tokens | List all existing personal token


## Documentation for Models

 - [CreatePersonalTokenRequest](docs/CreatePersonalTokenRequest.md)
 - [CreatePersonalTokenResponse](docs/CreatePersonalTokenResponse.md)
 - [PersonalTokenResponseGet](docs/PersonalTokenResponseGet.md)
 - [PersonalTokenResponseWithResults](docs/PersonalTokenResponseWithResults.md)
 - [PersonalTokenResponseWithResultsLinks](docs/PersonalTokenResponseWithResultsLinks.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="tokenAuth"></a>
### tokenAuth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


