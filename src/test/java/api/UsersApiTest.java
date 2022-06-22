/*
 * Finix API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2022-02-01
 * Contact: support@finixpayments.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package api;

import invoker.ApiException;
import model.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Disabled
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    /**
     * Create an Application User
     *
     * This is the equivalent of provisioning API keys (i.e. credentials) for an &#x60;Application&#x60;.  &gt; Each Application can have multiple &#x60;Users&#x60; which allows each merchant to have multiple API keys that can be independently enabled and disabled. Merchants only have read access to the API.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    public void createApplicationUserTest() throws ApiException {
        String applicationId = null;
        CreateUserRequest createUserRequest = null;

        User response = api.createApplicationUser(applicationId, createUserRequest);
        // TODO: test validations
    }

    /**
     * Create Merchant user
     *
     * Create a merchant user
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    public void createMerchantUserTest() throws ApiException {
        String identityId = null;
        CreateUserRequest createUserRequest = null;

        //User response = api.createMerchantUser(identityId, createUserRequest);
        // TODO: test validations
    }

    /**
     * Find a User by ID
     *
     * Retrieve a specific user with the ID of the &#x60;User&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    public void getUserTest() throws ApiException {
        String userId = null;

        User response = api.get(userId);
        // TODO: test validations
    }

    /**
     * List Users on an Application
     *
     * Get  all users of the specific application
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    public void listApplicationUsersTest() throws ApiException {
        String applicationId = null;

       // UsersList response = api.listByApplicationId(applicationId);
        // TODO: test validations
    }

    /**
     * Users
     *
     * Get users for an identity
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    public void listIdentityUsersTest() throws ApiException {
        String identityId = null;

        //UsersList response = api.listByIdentityId(identityId);
        // TODO: test validations
    }

    /**
     * List Users
     *
     * Get a &#x60;User&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    public void listUsersTest() throws ApiException {
        String id = null;

        UsersList response = api.list(ListUsersQueryParams.builder()
                .id(id)
                .build());
        // TODO: test validations
    }

    /**
     * Update User
     *
     * You can update the &#x60;User&#x60; with new tags or to disable the &#x60;User&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    public void putUserTest() throws ApiException {
        String userId = null;
        UpdateUserRequest updateUserRequest = null;

        User response = api.update(userId, updateUserRequest);
        // TODO: test validations
    }

}
