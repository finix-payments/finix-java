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
import invoker.Environment;
import invoker.FinixClient;
import model.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * API tests for VerificationsApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running VerificationsApiTest")

@Disabled
public class VerificationsApiTest {
    private FinixClient finixClient;
    private TestInfo testInfo;
    private TestReporter testReporter;
    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter){
        this.testInfo =testInfo;
        this.testReporter =testReporter;
        testReporter.publishEntry("Running "+testInfo.getDisplayName()+ " with tag " + testInfo.getTags());
    }
    /**
     * Create a Context Loads
     */
    @Test
    @BeforeAll
    @DisplayName("Finix Client")
    void contextLoads() {
        finixClient= new FinixClient("USsRhsHYZGBPnQw8CByJyEQW","8a14c2f9-d94b-4c72-8f5c-a62908e5b30e", Environment.SANDBOX);
        assertEquals(true , finixClient!=null);

    }
    private final VerificationsApi api = new VerificationsApi();

    /**
     * Perform a Verification
     *
     * Create a &#x60;verification&#x60; to verify an &#x60;Identity&#x60; or &#x60;Payment Instrument&#x60;.  Verifications can also be created directly on the resources you want to verify: - &#x60;POST /merchants/{id}/verifications&#x60; - &#x60;POST /payment_instruments/{id}/verifications&#x60;
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    public void createVerificationTest() throws ApiException {
        CreateVerificationRequest verificationForm = null;

        Verification response = api.create(verificationForm);
        // TODO: test validations
    }

    /**
     * Get a Verification
     *
     * Retrieve the details of a &#x60;Verification&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    public void getVerificationTest() throws ApiException {
        String verificationId = null;

        Verification response = api.get(verificationId);
        // TODO: test validations
    }

    /**
     * List Identity Verifications
     *
     * All verifications of this identity
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    public void listIdentityVerificationsTest() throws ApiException {
        String identityId = null;
        Long limit = null;
        Long offset = null;
        Long pageNumber = null;
        Long pageSize = null;

//        VerificationsList response = api.listByIdentityId(identityId, limit, offset, pageNumber, pageSize);
        // TODO: test validations
    }

    /**
     * List Merchant Verifications
     *
     * Get a list of all the &#x60;Verifications&#x60; in the &#x60;Merchant&#x60; object.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    public void listMerchantVerificationsTest() throws ApiException {
        String merchantId = null;
        Long limit = null;
        String afterCursor = null;
        String beforeCursor = null;

        VerificationsList response = api.listByMerchantId(merchantId, ListMerchantVerificationsQueryParams.builder()
                .limit(limit)
                .afterCursor(afterCursor)
                .beforeCursor(beforeCursor)
                .build());
        // TODO: test validations
    }


    /**
     * List Verifications
     *
     * Retrieve a list of &#x60;Verifications&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    public void listVerificationsTest() throws ApiException {
        String id = "MU31oiYcWR6Bvx3tqYQ7WEr9";

        VerificationsList response = finixClient.Verifications.list(ListVerificationsQueryParams.builder()
                .id(id)
                .build());

        String raw = (String) response.getEmbedded().getVerifications().stream().findFirst().get().getRaw();
//        System.out.println(raw);
        assertEquals("RawDummyMerchantUnderwriteResult", raw,()->"Should return RawDummyMerchantUnderwriteResult but returns" + raw );
        assertEquals(20,response.getPage().getLimit(),()->"Should return " + "20" + " but returns " + response.getPage().getLimit());
    }

    /**
     * Update a Verification
     *
     * Update an existing &#x60;Verification&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    public void putVerificationTest() throws ApiException {
        String verificationId = null;
        CreateVerificationRequest verificationForm = null;

        Verification response = api.update(verificationId, verificationForm);
        // TODO: test validations
    }

}
