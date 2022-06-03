/*
 * Finix API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2018-01-01
 * Contact: support@finixpayments.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package api;

import invoker.ApiException;
import model.CreateIdentityRequest;
import model.Error401Unauthorized;
import model.Error403ForbiddenList;
import model.Error404NotFoundList;
import model.Error406NotAcceptable;
import model.ErrorGeneric;
import model.IdentitiesList;
import model.Identity;
import model.UpdateIdentityRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IdentitiesApi
 */
@Disabled
public class IdentitiesApiTest {

    private final IdentitiesApi api = new IdentitiesApi();

    /**
     * Create an Associated Identity
     *
     * Create an associated &#x60;Identity&#x60; for [every owner with 25% or more ownership](/guides/building-your-merchant-onboarding-flow/#step-3-add-associated-identities) over the merchant.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAssociatedIdentityTest() throws ApiException {
        String identityId = null;
        CreateIdentityRequest createIdentityRequest = null;
        Identity response = api.createAssociatedIdentity(identityId, createIdentityRequest);
        // TODO: test validations
    }

    /**
     * Create an Identity
     *
     * Create an &#x60;Identity&#x60; for your merchant or buyer.  Creating &#x60;Identities&#x60; for merchants requires [providing their KYC details](/guides/getting-started/#step-1-create-an-identity-for-a-merchant).  Related Guides: [Getting Started](/guides/getting-started/#step-1-create-an-identity-for-a-merchant), [Onboarding](/guides/onboarding/)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createIdentityTest() throws ApiException {
        CreateIdentityRequest createIdentityRequest = null;
        Identity response = api.create(createIdentityRequest);
        // TODO: test validations
    }

    /**
     * Fetch an Identity
     *
     * Retrieve the details of a specific &#x60;Identity&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getIdentityTest() throws ApiException {
        String identityId = null;
        Identity response = api.get(identityId);
        // TODO: test validations
    }

    /**
     * List Application Identities
     *
     * Return a collection of identities, if there are no identities, an empty collection will be returned. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listApplicationIdentitiesTest() throws ApiException {
        String applicationId = null;
        IdentitiesList response = api.listByApplicationId(applicationId);
        // TODO: test validations
    }

    /**
     * List Identities
     *
     * Retrieves a list of &#x60;Identities&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listIdentitiesTest() throws ApiException {
        String sort = null;
        Integer offset = null;
        Integer limit = null;
        String id = null;
        String createdAtGte = null;
        String createdAtLte = null;
        String defaultStatementDescriptor = null;
        String businessName = null;
        String businessType = null;
        String email = null;
        String firstName = null;
        String lastName = null;
        String title = null;
        IdentitiesList response = api.list(sort, offset, limit, id, createdAtGte, createdAtLte, defaultStatementDescriptor, businessName, businessType, email, firstName, lastName, title);
        // TODO: test validations
    }

    /**
     * List Associated Identities
     *
     * Retrieve a list of Associated Identities for an Identity.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listIdentityAssociatedIdentitiesTest() throws ApiException {
        String identityId = null;
        Integer limit = null;
        Long offset = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        Boolean sortSorted = null;
        Boolean sortUnsorted = null;
        IdentitiesList response = api.listAssocaiatedIdentities(identityId, limit, offset, pageNumber, pageSize, sortSorted, sortUnsorted);
        // TODO: test validations
    }

    /**
     * Update an Identity
     *
     * Update an existing &#x60;Identity&#x60;.  If you are updating a the &#x60;Identity&#x60; of a &#x60;Merchant&#x60; that’s already been onboarded, you need to [verify the merchant again](#operation/createMerchantVerification).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putIdentityTest() throws ApiException {
        String identityId = null;
        UpdateIdentityRequest updateIdentityRequest = null;
        Identity response = api.update(identityId, updateIdentityRequest);
        // TODO: test validations
    }

}
