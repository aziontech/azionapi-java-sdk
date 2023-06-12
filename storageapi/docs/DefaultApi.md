# DefaultApi

All URIs are relative to *https://storage-api.azion.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteVersion**](DefaultApi.md#deleteVersion) | **DELETE** /storage/{version_id}/delete |  |
| [**storageVersionIdPost**](DefaultApi.md#storageVersionIdPost) | **POST** /storage/{version_id} |  |


<a id="deleteVersion"></a>
# **deleteVersion**
> deleteVersion(versionId)



Delete a version. A version is just um path prefix/sub-namespace for a set of files.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://storage-api.azion.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String versionId = "versionId_example"; // String | The version identifier
    try {
      apiInstance.deleteVersion(versionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **versionId** | **String**| The version identifier | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The resource was deleted successfully. |  -  |

<a id="storageVersionIdPost"></a>
# **storageVersionIdPost**
> Object storageVersionIdPost(xAzionStaticPath, versionId, body)



Upload file and transfer to remote storage

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://storage-api.azion.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String xAzionStaticPath = "xAzionStaticPath_example"; // String | Required in order to get the path and file name. i.e.: assets/css/main.css
    String versionId = "versionId_example"; // String | 
    File body = new File("/path/to/file"); // File | 
    try {
      Object result = apiInstance.storageVersionIdPost(xAzionStaticPath, versionId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#storageVersionIdPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xAzionStaticPath** | **String**| Required in order to get the path and file name. i.e.: assets/css/main.css | |
| **versionId** | **String**|  | |
| **body** | **File**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: b2/x-auto
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
