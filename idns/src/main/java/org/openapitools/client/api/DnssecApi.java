/*
 * Intelligent DNS API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.DnsSec;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.ErrorsResponse;
import org.openapitools.client.model.GetOrPatchDnsSecResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DnssecApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DnssecApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DnssecApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getZoneDnsSec
     * @param zoneId The hosted zone id (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> DNSSEC status retrieved </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Zone not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getZoneDnsSecCall(Integer zoneId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/intelligent_dns/{zone_id}/dnssec"
            .replace("{" + "zone_id" + "}", localVarApiClient.escapeString(zoneId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json; version=3"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "tokenAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getZoneDnsSecValidateBeforeCall(Integer zoneId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling getZoneDnsSec(Async)");
        }

        return getZoneDnsSecCall(zoneId, _callback);

    }

    /**
     * Retrieve the DNSSEC zone status
     * 
     * @param zoneId The hosted zone id (required)
     * @return GetOrPatchDnsSecResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> DNSSEC status retrieved </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Zone not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public GetOrPatchDnsSecResponse getZoneDnsSec(Integer zoneId) throws ApiException {
        ApiResponse<GetOrPatchDnsSecResponse> localVarResp = getZoneDnsSecWithHttpInfo(zoneId);
        return localVarResp.getData();
    }

    /**
     * Retrieve the DNSSEC zone status
     * 
     * @param zoneId The hosted zone id (required)
     * @return ApiResponse&lt;GetOrPatchDnsSecResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> DNSSEC status retrieved </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Zone not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetOrPatchDnsSecResponse> getZoneDnsSecWithHttpInfo(Integer zoneId) throws ApiException {
        okhttp3.Call localVarCall = getZoneDnsSecValidateBeforeCall(zoneId, null);
        Type localVarReturnType = new TypeToken<GetOrPatchDnsSecResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve the DNSSEC zone status (asynchronously)
     * 
     * @param zoneId The hosted zone id (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> DNSSEC status retrieved </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Zone not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getZoneDnsSecAsync(Integer zoneId, final ApiCallback<GetOrPatchDnsSecResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getZoneDnsSecValidateBeforeCall(zoneId, _callback);
        Type localVarReturnType = new TypeToken<GetOrPatchDnsSecResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for putZoneDnsSec
     * @param zoneId The hosted zone id (required)
     * @param dnsSec  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> DNSSEC status updated </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Zone updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Zone update error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Zone not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call putZoneDnsSecCall(Integer zoneId, DnsSec dnsSec, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = dnsSec;

        // create path and map variables
        String localVarPath = "/intelligent_dns/{zone_id}/dnssec"
            .replace("{" + "zone_id" + "}", localVarApiClient.escapeString(zoneId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json; version=3"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "tokenAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call putZoneDnsSecValidateBeforeCall(Integer zoneId, DnsSec dnsSec, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling putZoneDnsSec(Async)");
        }

        return putZoneDnsSecCall(zoneId, dnsSec, _callback);

    }

    /**
     * Update the DNSSEC zone
     * 
     * @param zoneId The hosted zone id (required)
     * @param dnsSec  (optional)
     * @return GetOrPatchDnsSecResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> DNSSEC status updated </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Zone updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Zone update error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Zone not found </td><td>  -  </td></tr>
     </table>
     */
    public GetOrPatchDnsSecResponse putZoneDnsSec(Integer zoneId, DnsSec dnsSec) throws ApiException {
        ApiResponse<GetOrPatchDnsSecResponse> localVarResp = putZoneDnsSecWithHttpInfo(zoneId, dnsSec);
        return localVarResp.getData();
    }

    /**
     * Update the DNSSEC zone
     * 
     * @param zoneId The hosted zone id (required)
     * @param dnsSec  (optional)
     * @return ApiResponse&lt;GetOrPatchDnsSecResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> DNSSEC status updated </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Zone updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Zone update error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Zone not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetOrPatchDnsSecResponse> putZoneDnsSecWithHttpInfo(Integer zoneId, DnsSec dnsSec) throws ApiException {
        okhttp3.Call localVarCall = putZoneDnsSecValidateBeforeCall(zoneId, dnsSec, null);
        Type localVarReturnType = new TypeToken<GetOrPatchDnsSecResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update the DNSSEC zone (asynchronously)
     * 
     * @param zoneId The hosted zone id (required)
     * @param dnsSec  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> DNSSEC status updated </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Zone updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Zone update error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Zone not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call putZoneDnsSecAsync(Integer zoneId, DnsSec dnsSec, final ApiCallback<GetOrPatchDnsSecResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = putZoneDnsSecValidateBeforeCall(zoneId, dnsSec, _callback);
        Type localVarReturnType = new TypeToken<GetOrPatchDnsSecResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
