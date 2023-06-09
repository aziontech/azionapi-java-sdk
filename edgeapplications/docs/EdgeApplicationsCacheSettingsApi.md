# EdgeApplicationsCacheSettingsApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdDelete**](EdgeApplicationsCacheSettingsApi.md#edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdDelete) | **DELETE** /edge_applications/{edge_application_id}/cache_settings/{cache_settings_id} | /edge_applications/:edge_application_id:/cache_settings/:cache_settings_id: |
| [**edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGet**](EdgeApplicationsCacheSettingsApi.md#edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGet) | **GET** /edge_applications/{edge_application_id}/cache_settings/{cache_settings_id} | /edge_applications/:edge_application_id:/cache_settings/:cache_settings_id: |
| [**edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPatch**](EdgeApplicationsCacheSettingsApi.md#edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPatch) | **PATCH** /edge_applications/{edge_application_id}/cache_settings/{cache_settings_id} | /edge_applications/:edge_application_id:/cache_settings/:cache_settings_id: |
| [**edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPut**](EdgeApplicationsCacheSettingsApi.md#edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPut) | **PUT** /edge_applications/{edge_application_id}/cache_settings/{cache_settings_id} | /edge_applications/:edge_application_id:/cache_settings/ca |
| [**edgeApplicationsEdgeApplicationIdCacheSettingsGet**](EdgeApplicationsCacheSettingsApi.md#edgeApplicationsEdgeApplicationIdCacheSettingsGet) | **GET** /edge_applications/{edge_application_id}/cache_settings | /edge_applications/{edge_application_id}/cache_settings |
| [**edgeApplicationsEdgeApplicationIdCacheSettingsPost**](EdgeApplicationsCacheSettingsApi.md#edgeApplicationsEdgeApplicationIdCacheSettingsPost) | **POST** /edge_applications/{edge_application_id}/cache_settings | /edge_applications/:edge_application_id:/cache_settings |


<a id="edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdDelete"></a>
# **edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdDelete**
> edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdDelete(edgeApplicationId, cacheSettingsId, accept, contentType)

/edge_applications/:edge_application_id:/cache_settings/:cache_settings_id:

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsCacheSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsCacheSettingsApi apiInstance = new EdgeApplicationsCacheSettingsApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    Long cacheSettingsId = 56L; // Long | 
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | The type of coding used in the Body (application/json). <br>  Example: Content-Type: application/json
    try {
      apiInstance.edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdDelete(edgeApplicationId, cacheSettingsId, accept, contentType);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsCacheSettingsApi#edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdDelete");
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
| **edgeApplicationId** | **Long**|  | |
| **cacheSettingsId** | **Long**|  | |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**| The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json | [optional] |

### Return type

null (empty response body)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGet"></a>
# **edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGet**
> ApplicationCacheGetOneResponse edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGet(edgeApplicationId, cacheSettingsId, accept)

/edge_applications/:edge_application_id:/cache_settings/:cache_settings_id:

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsCacheSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsCacheSettingsApi apiInstance = new EdgeApplicationsCacheSettingsApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    Long cacheSettingsId = 56L; // Long | 
    String accept = "application/json; version=3"; // String | 
    try {
      ApplicationCacheGetOneResponse result = apiInstance.edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGet(edgeApplicationId, cacheSettingsId, accept);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsCacheSettingsApi#edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGet");
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
| **edgeApplicationId** | **Long**|  | |
| **cacheSettingsId** | **Long**|  | |
| **accept** | **String**|  | [optional] |

### Return type

[**ApplicationCacheGetOneResponse**](ApplicationCacheGetOneResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPatch"></a>
# **edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPatch**
> ApplicationCachePatchResponse edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPatch(edgeApplicationId, cacheSettingsId, accept, applicationCachePatchRequest)

/edge_applications/:edge_application_id:/cache_settings/:cache_settings_id:

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsCacheSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsCacheSettingsApi apiInstance = new EdgeApplicationsCacheSettingsApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    Long cacheSettingsId = 56L; // Long | 
    String accept = "application/json; version=3"; // String | 
    ApplicationCachePatchRequest applicationCachePatchRequest = new ApplicationCachePatchRequest(); // ApplicationCachePatchRequest | 
    try {
      ApplicationCachePatchResponse result = apiInstance.edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPatch(edgeApplicationId, cacheSettingsId, accept, applicationCachePatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsCacheSettingsApi#edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPatch");
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
| **edgeApplicationId** | **Long**|  | |
| **cacheSettingsId** | **Long**|  | |
| **accept** | **String**|  | [optional] |
| **applicationCachePatchRequest** | [**ApplicationCachePatchRequest**](ApplicationCachePatchRequest.md)|  | [optional] |

### Return type

[**ApplicationCachePatchResponse**](ApplicationCachePatchResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json; version=3
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPut"></a>
# **edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPut**
> ApplicationCachePutResponse edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPut(edgeApplicationId, cacheSettingsId, accept, contentType, applicationCachePutRequest)

/edge_applications/:edge_application_id:/cache_settings/ca

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsCacheSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsCacheSettingsApi apiInstance = new EdgeApplicationsCacheSettingsApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    Long cacheSettingsId = 56L; // Long | 
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | The type of coding used in the Body (application/json). <br>  Example: Content-Type: application/json
    ApplicationCachePutRequest applicationCachePutRequest = new ApplicationCachePutRequest(); // ApplicationCachePutRequest | 
    try {
      ApplicationCachePutResponse result = apiInstance.edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPut(edgeApplicationId, cacheSettingsId, accept, contentType, applicationCachePutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsCacheSettingsApi#edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPut");
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
| **edgeApplicationId** | **Long**|  | |
| **cacheSettingsId** | **Long**|  | |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**| The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json | [optional] |
| **applicationCachePutRequest** | [**ApplicationCachePutRequest**](ApplicationCachePutRequest.md)|  | [optional] |

### Return type

[**ApplicationCachePutResponse**](ApplicationCachePutResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json; version=3
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeApplicationsEdgeApplicationIdCacheSettingsGet"></a>
# **edgeApplicationsEdgeApplicationIdCacheSettingsGet**
> ApplicationCacheGetResponse edgeApplicationsEdgeApplicationIdCacheSettingsGet(edgeApplicationId, page, pageSize, filter, orderBy, sort, accept)

/edge_applications/{edge_application_id}/cache_settings

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsCacheSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsCacheSettingsApi apiInstance = new EdgeApplicationsCacheSettingsApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    Long page = 56L; // Long | 
    Long pageSize = 56L; // Long | 
    String filter = "filter_example"; // String | 
    String orderBy = "orderBy_example"; // String | 
    String sort = "sort_example"; // String | 
    String accept = "application/json; version=3"; // String | 
    try {
      ApplicationCacheGetResponse result = apiInstance.edgeApplicationsEdgeApplicationIdCacheSettingsGet(edgeApplicationId, page, pageSize, filter, orderBy, sort, accept);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsCacheSettingsApi#edgeApplicationsEdgeApplicationIdCacheSettingsGet");
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
| **edgeApplicationId** | **Long**|  | |
| **page** | **Long**|  | [optional] |
| **pageSize** | **Long**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **orderBy** | **String**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |

### Return type

[**ApplicationCacheGetResponse**](ApplicationCacheGetResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeApplicationsEdgeApplicationIdCacheSettingsPost"></a>
# **edgeApplicationsEdgeApplicationIdCacheSettingsPost**
> ApplicationCacheCreateResponse edgeApplicationsEdgeApplicationIdCacheSettingsPost(edgeApplicationId, accept, contentType, applicationCacheCreateRequest)

/edge_applications/:edge_application_id:/cache_settings

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsCacheSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsCacheSettingsApi apiInstance = new EdgeApplicationsCacheSettingsApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | The type of coding used in the Body (application/json). <br>  Example: Content-Type: application/json
    ApplicationCacheCreateRequest applicationCacheCreateRequest = new ApplicationCacheCreateRequest(); // ApplicationCacheCreateRequest | 
    try {
      ApplicationCacheCreateResponse result = apiInstance.edgeApplicationsEdgeApplicationIdCacheSettingsPost(edgeApplicationId, accept, contentType, applicationCacheCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsCacheSettingsApi#edgeApplicationsEdgeApplicationIdCacheSettingsPost");
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
| **edgeApplicationId** | **Long**|  | |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**| The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json | [optional] |
| **applicationCacheCreateRequest** | [**ApplicationCacheCreateRequest**](ApplicationCacheCreateRequest.md)|  | [optional] |

### Return type

[**ApplicationCacheCreateResponse**](ApplicationCacheCreateResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json; version=3
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

