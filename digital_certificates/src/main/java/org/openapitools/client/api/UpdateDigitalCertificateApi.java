/*
 * Digital Certificates API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.0
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


import org.openapitools.client.model.DC200;
import org.openapitools.client.model.DC400;
import org.openapitools.client.model.DC403;
import org.openapitools.client.model.DC404;
import org.openapitools.client.model.UpdateDigitalCertificateRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class UpdateDigitalCertificateApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UpdateDigitalCertificateApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UpdateDigitalCertificateApi(ApiClient apiClient) {
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
     * Build call for updateDigitalCertificate
     * @param digitalCertificateId ID of certificate to update (required)
     * @param updateDigitalCertificateRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateDigitalCertificateCall(Integer digitalCertificateId, UpdateDigitalCertificateRequest updateDigitalCertificateRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateDigitalCertificateRequest;

        // create path and map variables
        String localVarPath = "/digital_certificates/{digital_certificate_id}"
            .replace("{" + "digital_certificate_id" + "}", localVarApiClient.escapeString(digitalCertificateId.toString()));

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
    private okhttp3.Call updateDigitalCertificateValidateBeforeCall(Integer digitalCertificateId, UpdateDigitalCertificateRequest updateDigitalCertificateRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'digitalCertificateId' is set
        if (digitalCertificateId == null) {
            throw new ApiException("Missing the required parameter 'digitalCertificateId' when calling updateDigitalCertificate(Async)");
        }

        // verify the required parameter 'updateDigitalCertificateRequest' is set
        if (updateDigitalCertificateRequest == null) {
            throw new ApiException("Missing the required parameter 'updateDigitalCertificateRequest' when calling updateDigitalCertificate(Async)");
        }

        return updateDigitalCertificateCall(digitalCertificateId, updateDigitalCertificateRequest, _callback);

    }

    /**
     * Change only select settings of your digital certificate or CSR.
     * 
     * @param digitalCertificateId ID of certificate to update (required)
     * @param updateDigitalCertificateRequest  (required)
     * @return DC200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public DC200 updateDigitalCertificate(Integer digitalCertificateId, UpdateDigitalCertificateRequest updateDigitalCertificateRequest) throws ApiException {
        ApiResponse<DC200> localVarResp = updateDigitalCertificateWithHttpInfo(digitalCertificateId, updateDigitalCertificateRequest);
        return localVarResp.getData();
    }

    /**
     * Change only select settings of your digital certificate or CSR.
     * 
     * @param digitalCertificateId ID of certificate to update (required)
     * @param updateDigitalCertificateRequest  (required)
     * @return ApiResponse&lt;DC200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DC200> updateDigitalCertificateWithHttpInfo(Integer digitalCertificateId, UpdateDigitalCertificateRequest updateDigitalCertificateRequest) throws ApiException {
        okhttp3.Call localVarCall = updateDigitalCertificateValidateBeforeCall(digitalCertificateId, updateDigitalCertificateRequest, null);
        Type localVarReturnType = new TypeToken<DC200>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Change only select settings of your digital certificate or CSR. (asynchronously)
     * 
     * @param digitalCertificateId ID of certificate to update (required)
     * @param updateDigitalCertificateRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateDigitalCertificateAsync(Integer digitalCertificateId, UpdateDigitalCertificateRequest updateDigitalCertificateRequest, final ApiCallback<DC200> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateDigitalCertificateValidateBeforeCall(digitalCertificateId, updateDigitalCertificateRequest, _callback);
        Type localVarReturnType = new TypeToken<DC200>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
