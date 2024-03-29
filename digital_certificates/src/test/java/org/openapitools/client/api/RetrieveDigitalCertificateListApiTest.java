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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.DC200List;
import org.openapitools.client.model.DC400;
import org.openapitools.client.model.DC401;
import org.openapitools.client.model.DC403;
import org.openapitools.client.model.DC404;
import org.openapitools.client.model.DC406;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RetrieveDigitalCertificateListApi
 */
@Disabled
public class RetrieveDigitalCertificateListApiTest {

    private final RetrieveDigitalCertificateListApi api = new RetrieveDigitalCertificateListApi();

    /**
     * List all existing digital certificates and CSRs registered to your account
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listDigitalCertificatesTest() throws ApiException {
        String orderBy = null;
        String sort = null;
        String name = null;
        String search = null;
        DC200List response = api.listDigitalCertificates(orderBy, sort, name, search);
        // TODO: test validations
    }

}
