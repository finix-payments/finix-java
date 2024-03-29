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
 * API tests for MerchantProfilesApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running MerchantProfilesApiTest")
public class MerchantProfilesApiTest {

    private FinixClient finixClient;
    private String merchantProfileId;
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
        finixClient= new FinixClient("USimz3zSq5R2PqiEBXY6rSiJ","8bacba32-9550-48ff-b567-fe7648947041", Environment.SANDBOX);
        assertEquals(true , finixClient!=null);
    }
    /**
     * Show Merchant Profile
     *
     * Retrieve the details of a merchant profile.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Fetch a merchant profile")
    public void getMerchantProfileTest() throws ApiException {
        String merchantProfileId = "MP7dqAPFRBM8gN9hb3Guumif";
        MerchantProfile response = finixClient.MerchantProfiles.get(merchantProfileId);
        assertEquals(merchantProfileId, response.getId(), "Response should return merchant profile id of "+merchantProfileId+" but returns "+response.getId());
    }

    /**
     * List Merchant Profiles
     *
     * Retrieve a list of merchant_profiles.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Fetch a list of merchant profiles")
    public void listMerchantProfilesTest() throws ApiException{
        Long limit = 20L;
        FinixList<MerchantProfile> merchantProfilesList = finixClient.MerchantProfiles.list(ListMerchantProfilesQueryParams.builder()
                .limit(limit)
                .build());
        assertTrue(merchantProfilesList.size() >= 0);
        if (merchantProfilesList.size() == 0){
            assertEquals(false, merchantProfilesList.getHasMore());
        }
        if (merchantProfilesList.getHasMore() == true) {
            FinixList<MerchantProfile> nextList = merchantProfilesList.listNext(1);
            assertTrue(nextList != null);
            assertEquals(1, nextList.size());
        }    }

    /**
     * Put Merchant Profile
     *
     * Update a merchant profile
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Put Merchant Profile")
    public void putMerchantProfileTest() throws ApiException {
        String merchantProfileId = "MP7dqAPFRBM8gN9hb3Guumif";
        String riskProfileId = "RP7akGm3WVYf9Z7omCeeCpgB";
        MerchantProfile response = finixClient.MerchantProfiles.update(merchantProfileId, UpdateMerchantProfileRequest.builder()
                .riskProfile(riskProfileId)
                .build());
        assertEquals(merchantProfileId, response.getId());
        assertEquals(riskProfileId, response.getRiskProfile(), "Response should return risk profile of "+riskProfileId+ " but returns "+ response.getRiskProfile());
    }

}
