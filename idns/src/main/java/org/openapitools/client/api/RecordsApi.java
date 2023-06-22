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


import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.ErrorsResponse;
import org.openapitools.client.model.GetRecordsResponse;
import org.openapitools.client.model.PostOrPutRecordResponse;
import org.openapitools.client.model.RecordPostOrPut;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class RecordsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RecordsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RecordsApi(ApiClient apiClient) {
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
     * Build call for deleteZoneRecord
     * @param zoneId The hosted zone id (required)
     * @param recordId The zone record id (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Record removed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Record not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteZoneRecordCall(Integer zoneId, Integer recordId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/intelligent_dns/{zone_id}/records/{record_id}"
            .replace("{" + "zone_id" + "}", localVarApiClient.escapeString(zoneId.toString()))
            .replace("{" + "record_id" + "}", localVarApiClient.escapeString(recordId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteZoneRecordValidateBeforeCall(Integer zoneId, Integer recordId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling deleteZoneRecord(Async)");
        }

        // verify the required parameter 'recordId' is set
        if (recordId == null) {
            throw new ApiException("Missing the required parameter 'recordId' when calling deleteZoneRecord(Async)");
        }

        return deleteZoneRecordCall(zoneId, recordId, _callback);

    }

    /**
     * Remove an Intelligent DNS zone record
     * 
     * @param zoneId The hosted zone id (required)
     * @param recordId The zone record id (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Record removed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Record not found </td><td>  -  </td></tr>
     </table>
     */
    public String deleteZoneRecord(Integer zoneId, Integer recordId) throws ApiException {
        ApiResponse<String> localVarResp = deleteZoneRecordWithHttpInfo(zoneId, recordId);
        return localVarResp.getData();
    }

    /**
     * Remove an Intelligent DNS zone record
     * 
     * @param zoneId The hosted zone id (required)
     * @param recordId The zone record id (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Record removed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Record not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> deleteZoneRecordWithHttpInfo(Integer zoneId, Integer recordId) throws ApiException {
        okhttp3.Call localVarCall = deleteZoneRecordValidateBeforeCall(zoneId, recordId, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Remove an Intelligent DNS zone record (asynchronously)
     * 
     * @param zoneId The hosted zone id (required)
     * @param recordId The zone record id (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Record removed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Record not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteZoneRecordAsync(Integer zoneId, Integer recordId, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteZoneRecordValidateBeforeCall(zoneId, recordId, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getZoneRecords
     * @param zoneId The hosted zone id (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zones collection retrieved </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getZoneRecordsCall(Integer zoneId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/intelligent_dns/{zone_id}/records"
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
    private okhttp3.Call getZoneRecordsValidateBeforeCall(Integer zoneId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling getZoneRecords(Async)");
        }

        return getZoneRecordsCall(zoneId, _callback);

    }

    /**
     * Get a collection of Intelligent DNS zone records
     * 
     * @param zoneId The hosted zone id (required)
     * @return GetRecordsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zones collection retrieved </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public GetRecordsResponse getZoneRecords(Integer zoneId) throws ApiException {
        ApiResponse<GetRecordsResponse> localVarResp = getZoneRecordsWithHttpInfo(zoneId);
        return localVarResp.getData();
    }

    /**
     * Get a collection of Intelligent DNS zone records
     * 
     * @param zoneId The hosted zone id (required)
     * @return ApiResponse&lt;GetRecordsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zones collection retrieved </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetRecordsResponse> getZoneRecordsWithHttpInfo(Integer zoneId) throws ApiException {
        okhttp3.Call localVarCall = getZoneRecordsValidateBeforeCall(zoneId, null);
        Type localVarReturnType = new TypeToken<GetRecordsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a collection of Intelligent DNS zone records (asynchronously)
     * 
     * @param zoneId The hosted zone id (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zones collection retrieved </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getZoneRecordsAsync(Integer zoneId, final ApiCallback<GetRecordsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getZoneRecordsValidateBeforeCall(zoneId, _callback);
        Type localVarReturnType = new TypeToken<GetRecordsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for postZoneRecord
     * @param zoneId The hosted zone id (required)
     * @param recordPostOrPut  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Record added </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postZoneRecordCall(Integer zoneId, RecordPostOrPut recordPostOrPut, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = recordPostOrPut;

        // create path and map variables
        String localVarPath = "/intelligent_dns/{zone_id}/records"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postZoneRecordValidateBeforeCall(Integer zoneId, RecordPostOrPut recordPostOrPut, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling postZoneRecord(Async)");
        }

        return postZoneRecordCall(zoneId, recordPostOrPut, _callback);

    }

    /**
     * Create a new Intelligent DNS zone record
     * 
     * @param zoneId The hosted zone id (required)
     * @param recordPostOrPut  (optional)
     * @return PostOrPutRecordResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Record added </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public PostOrPutRecordResponse postZoneRecord(Integer zoneId, RecordPostOrPut recordPostOrPut) throws ApiException {
        ApiResponse<PostOrPutRecordResponse> localVarResp = postZoneRecordWithHttpInfo(zoneId, recordPostOrPut);
        return localVarResp.getData();
    }

    /**
     * Create a new Intelligent DNS zone record
     * 
     * @param zoneId The hosted zone id (required)
     * @param recordPostOrPut  (optional)
     * @return ApiResponse&lt;PostOrPutRecordResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Record added </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PostOrPutRecordResponse> postZoneRecordWithHttpInfo(Integer zoneId, RecordPostOrPut recordPostOrPut) throws ApiException {
        okhttp3.Call localVarCall = postZoneRecordValidateBeforeCall(zoneId, recordPostOrPut, null);
        Type localVarReturnType = new TypeToken<PostOrPutRecordResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new Intelligent DNS zone record (asynchronously)
     * 
     * @param zoneId The hosted zone id (required)
     * @param recordPostOrPut  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Record added </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postZoneRecordAsync(Integer zoneId, RecordPostOrPut recordPostOrPut, final ApiCallback<PostOrPutRecordResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = postZoneRecordValidateBeforeCall(zoneId, recordPostOrPut, _callback);
        Type localVarReturnType = new TypeToken<PostOrPutRecordResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for putZoneRecord
     * @param zoneId The hosted zone id (required)
     * @param recordId The zone record id (required)
     * @param recordPostOrPut  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Record updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Record update error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call putZoneRecordCall(Integer zoneId, Integer recordId, RecordPostOrPut recordPostOrPut, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = recordPostOrPut;

        // create path and map variables
        String localVarPath = "/intelligent_dns/{zone_id}/records/{record_id}"
            .replace("{" + "zone_id" + "}", localVarApiClient.escapeString(zoneId.toString()))
            .replace("{" + "record_id" + "}", localVarApiClient.escapeString(recordId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call putZoneRecordValidateBeforeCall(Integer zoneId, Integer recordId, RecordPostOrPut recordPostOrPut, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling putZoneRecord(Async)");
        }

        // verify the required parameter 'recordId' is set
        if (recordId == null) {
            throw new ApiException("Missing the required parameter 'recordId' when calling putZoneRecord(Async)");
        }

        return putZoneRecordCall(zoneId, recordId, recordPostOrPut, _callback);

    }

    /**
     * Update an Intelligent DNS zone record
     * 
     * @param zoneId The hosted zone id (required)
     * @param recordId The zone record id (required)
     * @param recordPostOrPut  (optional)
     * @return PostOrPutRecordResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Record updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Record update error </td><td>  -  </td></tr>
     </table>
     */
    public PostOrPutRecordResponse putZoneRecord(Integer zoneId, Integer recordId, RecordPostOrPut recordPostOrPut) throws ApiException {
        ApiResponse<PostOrPutRecordResponse> localVarResp = putZoneRecordWithHttpInfo(zoneId, recordId, recordPostOrPut);
        return localVarResp.getData();
    }

    /**
     * Update an Intelligent DNS zone record
     * 
     * @param zoneId The hosted zone id (required)
     * @param recordId The zone record id (required)
     * @param recordPostOrPut  (optional)
     * @return ApiResponse&lt;PostOrPutRecordResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Record updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Record update error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PostOrPutRecordResponse> putZoneRecordWithHttpInfo(Integer zoneId, Integer recordId, RecordPostOrPut recordPostOrPut) throws ApiException {
        okhttp3.Call localVarCall = putZoneRecordValidateBeforeCall(zoneId, recordId, recordPostOrPut, null);
        Type localVarReturnType = new TypeToken<PostOrPutRecordResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update an Intelligent DNS zone record (asynchronously)
     * 
     * @param zoneId The hosted zone id (required)
     * @param recordId The zone record id (required)
     * @param recordPostOrPut  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Record updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Record update error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call putZoneRecordAsync(Integer zoneId, Integer recordId, RecordPostOrPut recordPostOrPut, final ApiCallback<PostOrPutRecordResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = putZoneRecordValidateBeforeCall(zoneId, recordId, recordPostOrPut, _callback);
        Type localVarReturnType = new TypeToken<PostOrPutRecordResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
