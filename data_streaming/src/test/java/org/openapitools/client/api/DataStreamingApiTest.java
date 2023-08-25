/*
 * Data Streaming - OpenAPI
 * The Data Streaming API allows you to manage your existing data streamings and templates. Data Streaming allows you to feed your stream processing, SIEM, and big data platforms with the event logs from your applications on Azion in real time. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.CreateNewDataStreaming201Response;
import org.openapitools.client.model.CreateNewDataStreamingRequest;
import org.openapitools.client.model.DataStreamingResponseWithResults;
import org.openapitools.client.model.DataStreamingsById;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataStreamingApi
 */
@Disabled
public class DataStreamingApiTest {

    private final DataStreamingApi api = new DataStreamingApi();

    /**
     * Create a new data streaming
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewDataStreamingTest() throws ApiException {
        CreateNewDataStreamingRequest createNewDataStreamingRequest = null;
        CreateNewDataStreaming201Response response = api.createNewDataStreaming(createNewDataStreamingRequest);
        // TODO: test validations
    }

    /**
     * Delete data streaming
     *
     * Use the DELETE method to remove a data streaming from your account. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDataStreamingByIdTest() throws ApiException {
        Integer dataStreamingId = null;
        api.deleteDataStreamingById(dataStreamingId);
        // TODO: test validations
    }

    /**
     * Edit data streaming
     *
     * Use the PATCH method to change only select settings of your data streaming. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editDataStreamingByIdTest() throws ApiException {
        Integer dataStreamingId = null;
        CreateNewDataStreamingRequest createNewDataStreamingRequest = null;
        CreateNewDataStreaming201Response response = api.editDataStreamingById(dataStreamingId, createNewDataStreamingRequest);
        // TODO: test validations
    }

    /**
     * Get expecific data streaming by Data Streaming ID
     *
     * Use the GET method and add the data streaming&#39;s ID to the URI of the request to get more data on a specific data streaming.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listDataStreamingByIdTest() throws ApiException {
        Integer dataStreamingId = null;
        DataStreamingsById response = api.listDataStreamingById(dataStreamingId);
        // TODO: test validations
    }

    /**
     * List all exist data streamings
     *
     * Use the GET method to list all data streamings, both active and inactive, and its properties.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listDataStreamingsTest() throws ApiException {
        DataStreamingResponseWithResults response = api.listDataStreamings();
        // TODO: test validations
    }

    /**
     * Overwrite data streaming
     *
     * Use the PUT method to overwrite the data streaming. Although  you can change a single property using the PUT method, you must pass all fields for the request to be completed. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void overwriteDataStreamingByIdTest() throws ApiException {
        Integer dataStreamingId = null;
        CreateNewDataStreamingRequest createNewDataStreamingRequest = null;
        CreateNewDataStreaming201Response response = api.overwriteDataStreamingById(dataStreamingId, createNewDataStreamingRequest);
        // TODO: test validations
    }

}