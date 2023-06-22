/*
 * Web Application Firewall API
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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.WAFDomains200;
import org.openapitools.client.model.WAFEvents200;
import org.openapitools.client.model.WAFEvents400;
import org.openapitools.client.model.WAFEvents401;
import org.openapitools.client.model.WAFEvents404;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WafApi
 */
@Disabled
public class WafApiTest {

    private final WafApi api = new WafApi();

    /**
     * Find domains attached to a WAF
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWAFDomainsTest() throws ApiException {
        Long wafId = null;
        String name = null;
        WAFDomains200 response = api.getWAFDomains(wafId, name);
        // TODO: test validations
    }

    /**
     * Find WAF log events
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWAFEventsTest() throws ApiException {
        Long wafId = null;
        Long hourRange = null;
        String domainsIds = null;
        Long networkListId = null;
        WAFEvents200 response = api.getWAFEvents(wafId, hourRange, domainsIds, networkListId);
        // TODO: test validations
    }

}
