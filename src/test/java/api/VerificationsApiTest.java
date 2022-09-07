/*
 * Finix API
 */


package api;

import invoker.ApiException;
import invoker.Environment;
import invoker.FinixClient;
import model.*;
import org.junit.jupiter.api.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * API tests for VerificationsApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running VerificationsApiTest")

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
        finixClient= new FinixClient("USpumes23XhzHwXqiy9bfX2B","c69d39e3-f9ff-4735-8c3e-abca86441906", Environment.SANDBOX);
        assertEquals(true , finixClient!=null);
    }
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
    @DisplayName("Create a Verification with merchant information")
    public void createVerificationTest() throws ApiException {
        String merchantId = "MU31oiYcWR6Bvx3tqYQ7WEr9";
        String processor = "DUMMY_V1";
        CreateVerificationRequest createVerificationRequest = CreateVerificationRequest.builder()
                .merchant(merchantId)
                .processor(processor).build();
        Verification response = finixClient.Verifications.create(createVerificationRequest);
        assertEquals(merchantId, response.getMerchant(), "Should return "+ merchantId + " but returns " + response.getMerchant());
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
    @DisplayName("Get a Verification")
    public void getVerificationTest() throws ApiException {
        String verificationId = "VIcrdHd2vBu5RDZJWNGTQihc";
        Verification response = finixClient.Verifications.get(verificationId);
        assertEquals(verificationId, response.getId(), "Should return " + verificationId + " but returns "+response.getId());
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
    @DisplayName("List Merchant Verifications")
    public void listMerchantVerificationsTest() throws ApiException {
        String merchantId = "MU31oiYcWR6Bvx3tqYQ7WEr9";
        FinixList<Verification> verificationsList = finixClient.Verifications.listByMerchantId(merchantId, ListMerchantVerificationsQueryParams.builder().build());
        assertTrue(verificationsList.size() >= 0);
        if (verificationsList.size() == 0){
            assertEquals(false, verificationsList.getHasMore());
        }
        if (verificationsList.getHasMore() == true) {
            FinixList<Verification> nextList = verificationsList.listNext(1);
            assertTrue(nextList != null);
            assertEquals(1, nextList.size());
        }
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
    @DisplayName("List Verifications")
    public void listVerificationsTest() throws ApiException {
        FinixList<Verification> verificationsList = finixClient.Verifications.list(ListVerificationsQueryParams.builder().build());
        assertTrue(verificationsList.size() >= 0);
        if (verificationsList.size() == 0){
            assertEquals(false, verificationsList.getHasMore());
        }
        if (verificationsList.getHasMore() == true) {
            FinixList<Verification> nextList = verificationsList.listNext(1);
            assertTrue(nextList != null);
            assertEquals(1, nextList.size());
        }
    }

    /**
     * Test Raw as String
     */
    @Test
    @DisplayName("Test Raw as String")
    public void checkRawInVerification() throws ApiException{
        String verificationId = "VIcrdHd2vBu5RDZJWNGTQihc";
        Verification verification = finixClient.Verifications.get(verificationId);
        String raw = (String) verification.getRaw();
        assertEquals("RawDummyMerchantUnderwriteResult", raw,()->"Should return RawDummyMerchantUnderwriteResult but returns" + raw );
    }
}
