# openapi-java-client

Object Storage
- API version: 1.0.0 (v1)
  - Build date: 2023-12-15T14:58:01.416543Z[GMT]

REST API OpenAPI documentation for the Object Storage


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
  <version>1.0.0 (v1)</version>
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
     implementation "org.openapitools:openapi-java-client:1.0.0 (v1)"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0 (v1).jar`
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
import org.openapitools.client.api.StorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azion.com");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    StorageApi apiInstance = new StorageApi(defaultClient);
    BucketCreate bucketCreate = new BucketCreate(); // BucketCreate | 
    try {
      ResponseBucket result = apiInstance.storageApiBucketsCreate(bucketCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#storageApiBucketsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.azion.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*StorageApi* | [**storageApiBucketsCreate**](docs/StorageApi.md#storageApiBucketsCreate) | **POST** /v4/storage/buckets | Create a new bucket
*StorageApi* | [**storageApiBucketsDestroy**](docs/StorageApi.md#storageApiBucketsDestroy) | **DELETE** /v4/storage/buckets/{name} | Delete a bucket
*StorageApi* | [**storageApiBucketsList**](docs/StorageApi.md#storageApiBucketsList) | **GET** /v4/storage/buckets | List buckets
*StorageApi* | [**storageApiBucketsObjectsCreate**](docs/StorageApi.md#storageApiBucketsObjectsCreate) | **POST** /v4/storage/buckets/{bucket_name}/objects/{object_key} | Create new object key
*StorageApi* | [**storageApiBucketsObjectsDestroy**](docs/StorageApi.md#storageApiBucketsObjectsDestroy) | **DELETE** /v4/storage/buckets/{bucket_name}/objects/{object_key} | Delete object key
*StorageApi* | [**storageApiBucketsObjectsList**](docs/StorageApi.md#storageApiBucketsObjectsList) | **GET** /v4/storage/buckets/{bucket_name}/objects | List buckets objects
*StorageApi* | [**storageApiBucketsObjectsRetrieve**](docs/StorageApi.md#storageApiBucketsObjectsRetrieve) | **GET** /v4/storage/buckets/{bucket_name}/objects/{object_key} | Download object
*StorageApi* | [**storageApiBucketsObjectsUpdate**](docs/StorageApi.md#storageApiBucketsObjectsUpdate) | **PUT** /v4/storage/buckets/{bucket_name}/objects/{object_key} | Update the object key
*StorageApi* | [**storageApiBucketsPartialUpdate**](docs/StorageApi.md#storageApiBucketsPartialUpdate) | **PATCH** /v4/storage/buckets/{name} | Update bucket info


## Documentation for Models

 - [Bucket](docs/Bucket.md)
 - [BucketCreate](docs/BucketCreate.md)
 - [BucketObject](docs/BucketObject.md)
 - [EdgeAccessEnum](docs/EdgeAccessEnum.md)
 - [ObjectResponseData](docs/ObjectResponseData.md)
 - [PaginatedBucketList](docs/PaginatedBucketList.md)
 - [PaginatedBucketObjectList](docs/PaginatedBucketObjectList.md)
 - [ResponseBucket](docs/ResponseBucket.md)
 - [StateEnum](docs/StateEnum.md)
 - [SuccessBucketOperation](docs/SuccessBucketOperation.md)
 - [SuccessObjectOperation](docs/SuccessObjectOperation.md)


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


