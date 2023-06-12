/*
 * Credentials API
 * Azion Orchestration
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
import org.openapitools.client.model.AuthToken;
import org.openapitools.client.model.CreateCredentialRequest;
import org.openapitools.client.model.Response;
import org.openapitools.client.model.ResponseWithTotal;
import org.openapitools.client.model.UpdateCredentialRequest;
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
     * Create credential
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCredentialTest() throws ApiException {
        CreateCredentialRequest createCredentialRequest = null;
        AuthToken response = api.createCredential(createCredentialRequest);
        // TODO: test validations
    }

    /**
     * Delete the Credential
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCredentialTest() throws ApiException {
        Long credentialId = null;
        api.deleteCredential(credentialId);
        // TODO: test validations
    }

    /**
     * Return all credentials
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findAllTest() throws ApiException {
        String filter = null;
        Long page = null;
        Long pageSize = null;
        String sort = null;
        String orderBy = null;
        ResponseWithTotal response = api.findAll(filter, page, pageSize, sort, orderBy);
        // TODO: test validations
    }

    /**
     * Load the Credential
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadCredentialTest() throws ApiException {
        Long credentialId = null;
        Response response = api.loadCredential(credentialId);
        // TODO: test validations
    }

    /**
     * Update the Credential
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCredentialTest() throws ApiException {
        Long credentialId = null;
        UpdateCredentialRequest updateCredentialRequest = null;
        Response response = api.updateCredential(credentialId, updateCredentialRequest);
        // TODO: test validations
    }

}