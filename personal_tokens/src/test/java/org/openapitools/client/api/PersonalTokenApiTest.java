/*
 * Personal Tokens - OpenAPI
 * The Personal Tokens API allows you to manage your existing personal tokens. 
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
import org.openapitools.client.model.PersonalTokenResponseGet;
import org.openapitools.client.model.PersonalTokenResponseWithResults;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PersonalTokenApi
 */
@Disabled
public class PersonalTokenApiTest {

    private final PersonalTokenApi api = new PersonalTokenApi();

    /**
     * Get a personal token info
     *
     * Get a personal token info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPersonalTokenTest() throws ApiException {
        UUID personalTokenId = null;
        PersonalTokenResponseGet response = api.getPersonalToken(personalTokenId);
        // TODO: test validations
    }

    /**
     * List all existing personal token
     *
     * List all existing personal token
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPersonalTokenTest() throws ApiException {
        PersonalTokenResponseWithResults response = api.listPersonalToken();
        // TODO: test validations
    }

}