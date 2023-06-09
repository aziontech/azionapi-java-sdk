# DefaultApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**edgeFirewallGet**](DefaultApi.md#edgeFirewallGet) | **GET** /edge_firewall | List all user edge firewall |
| [**edgeFirewallPost**](DefaultApi.md#edgeFirewallPost) | **POST** /edge_firewall | Create a edge firewall |
| [**edgeFirewallUuidDelete**](DefaultApi.md#edgeFirewallUuidDelete) | **DELETE** /edge_firewall/{uuid} | Delete an edge firewall by uuid |
| [**edgeFirewallUuidGet**](DefaultApi.md#edgeFirewallUuidGet) | **GET** /edge_firewall/{uuid} | Retrieve an edge firewall set by uuid |
| [**edgeFirewallUuidPatch**](DefaultApi.md#edgeFirewallUuidPatch) | **PATCH** /edge_firewall/{uuid} | Update some edge firewall attributes, like \&quot;active\&quot; |
| [**edgeFirewallUuidPut**](DefaultApi.md#edgeFirewallUuidPut) | **PUT** /edge_firewall/{uuid} | Overwrite some edge firewall attributes, like \&quot;active\&quot; |


<a id="edgeFirewallGet"></a>
# **edgeFirewallGet**
> ListEdgeFirewallResponse edgeFirewallGet(page, pageSize, sort, orderBy)

List all user edge firewall

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String sort = "sort_example"; // String | 
    String orderBy = "orderBy_example"; // String | 
    try {
      ListEdgeFirewallResponse result = apiInstance.edgeFirewallGet(page, pageSize, sort, orderBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallGet");
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
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **orderBy** | **String**|  | [optional] |

### Return type

[**ListEdgeFirewallResponse**](ListEdgeFirewallResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of edge firewalls |  -  |

<a id="edgeFirewallPost"></a>
# **edgeFirewallPost**
> edgeFirewallPost(createEdgeFirewallRequest)

Create a edge firewall

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    CreateEdgeFirewallRequest createEdgeFirewallRequest = new CreateEdgeFirewallRequest(); // CreateEdgeFirewallRequest | 
    try {
      apiInstance.edgeFirewallPost(createEdgeFirewallRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallPost");
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
| **createEdgeFirewallRequest** | [**CreateEdgeFirewallRequest**](CreateEdgeFirewallRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Edge firewall created |  -  |
| **400** | Internal Server Error |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeFirewallUuidDelete"></a>
# **edgeFirewallUuidDelete**
> edgeFirewallUuidDelete(uuid)

Delete an edge firewall by uuid

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    try {
      apiInstance.edgeFirewallUuidDelete(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallUuidDelete");
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
| **uuid** | **String**|  | |

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
| **204** | Successfully deleted |  -  |

<a id="edgeFirewallUuidGet"></a>
# **edgeFirewallUuidGet**
> EdgeFirewallResponse edgeFirewallUuidGet(uuid)

Retrieve an edge firewall set by uuid

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    try {
      EdgeFirewallResponse result = apiInstance.edgeFirewallUuidGet(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallUuidGet");
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
| **uuid** | **String**|  | |

### Return type

[**EdgeFirewallResponse**](EdgeFirewallResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An edge firewall object |  -  |

<a id="edgeFirewallUuidPatch"></a>
# **edgeFirewallUuidPatch**
> ListEdgeFirewallResponse edgeFirewallUuidPatch(uuid, body)

Update some edge firewall attributes, like \&quot;active\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    ListEdgeFirewallResponse body = new ListEdgeFirewallResponse(); // ListEdgeFirewallResponse | 
    try {
      ListEdgeFirewallResponse result = apiInstance.edgeFirewallUuidPatch(uuid, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallUuidPatch");
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
| **uuid** | **String**|  | |
| **body** | **ListEdgeFirewallResponse**|  | |

### Return type

[**ListEdgeFirewallResponse**](ListEdgeFirewallResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeFirewallUuidPut"></a>
# **edgeFirewallUuidPut**
> ListEdgeFirewallResponse edgeFirewallUuidPut(uuid, body)

Overwrite some edge firewall attributes, like \&quot;active\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    ListEdgeFirewallResponse body = new ListEdgeFirewallResponse(); // ListEdgeFirewallResponse | 
    try {
      ListEdgeFirewallResponse result = apiInstance.edgeFirewallUuidPut(uuid, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallUuidPut");
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
| **uuid** | **String**|  | |
| **body** | **ListEdgeFirewallResponse**|  | |

### Return type

[**ListEdgeFirewallResponse**](ListEdgeFirewallResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

