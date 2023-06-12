/*
 * Services API
 * Azion Services
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.CreateResourceRequest;
import org.openapitools.client.model.CreateServiceRequest;
import org.openapitools.client.model.ResourceDetail;
import org.openapitools.client.model.ResourceResponseWithTotal;
import org.openapitools.client.model.ServiceResponse;
import org.openapitools.client.model.ServiceResponseWithTotals;
import org.openapitools.client.model.UpdateResourceRequest;
import org.openapitools.client.model.UpdateServiceRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Disabled
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * Delete Service Resource by ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteResourceTest() throws ApiException {
        Long serviceId = null;
        Long resourceId = null;
        api.deleteResource(serviceId, resourceId);
        // TODO: test validations
    }

    /**
     * Delete Service by ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteServiceTest() throws ApiException {
        Long id = null;
        api.deleteService(id);
        // TODO: test validations
    }

    /**
     * Return Service Resource by ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResourceTest() throws ApiException {
        Long serviceId = null;
        Long resourceId = null;
        ResourceDetail response = api.getResource(serviceId, resourceId);
        // TODO: test validations
    }

    /**
     * Return Service Resources by page
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResourcesTest() throws ApiException {
        Long serviceId = null;
        Long page = null;
        Long pageSize = null;
        String filter = null;
        String orderBy = null;
        String sort = null;
        ResourceResponseWithTotal response = api.getResources(serviceId, page, pageSize, filter, orderBy, sort);
        // TODO: test validations
    }

    /**
     * Return Service by ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getServiceTest() throws ApiException {
        Long id = null;
        Boolean withVars = null;
        ServiceResponse response = api.getService(id, withVars);
        // TODO: test validations
    }

    /**
     * Return Services by page
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getServicesTest() throws ApiException {
        Long page = null;
        Long pageSize = null;
        String filter = null;
        String orderBy = null;
        String sort = null;
        ServiceResponseWithTotals response = api.getServices(page, pageSize, filter, orderBy, sort);
        // TODO: test validations
    }

    /**
     * Create Service
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void newServiceTest() throws ApiException {
        CreateServiceRequest createServiceRequest = null;
        ServiceResponse response = api.newService(createServiceRequest);
        // TODO: test validations
    }

    /**
     * Update Service by ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchServiceTest() throws ApiException {
        Long id = null;
        UpdateServiceRequest updateServiceRequest = null;
        ServiceResponse response = api.patchService(id, updateServiceRequest);
        // TODO: test validations
    }

    /**
     * Update Service Resource by ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchServiceResourceTest() throws ApiException {
        Long serviceId = null;
        Long resourceId = null;
        UpdateResourceRequest updateResourceRequest = null;
        ResourceDetail response = api.patchServiceResource(serviceId, resourceId, updateResourceRequest);
        // TODO: test validations
    }

    /**
     * Create Service Resource
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postResourceTest() throws ApiException {
        Long serviceId = null;
        CreateResourceRequest createResourceRequest = null;
        ResourceDetail response = api.postResource(serviceId, createResourceRequest);
        // TODO: test validations
    }

}