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
 * API tests for FeeProfilesApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running FeeProfilesApiTest")
public class FeeProfilesApiTest {
    private FinixClient finixClient;
    private String feeProfileId;
    private TestInfo testInfo;
    private TestReporter testReporter;

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tag " + testInfo.getTags());
    }

    /**
     * Create a Context Loads
     */
    @Test
    @BeforeAll
    @DisplayName("Finix Client")
    void contextLoads() {
        finixClient = new FinixClient("USimz3zSq5R2PqiEBXY6rSiJ", "8bacba32-9550-48ff-b567-fe7648947041", Environment.SANDBOX);
        assertEquals(true, finixClient != null);
    }

    /**
     * Create a Fee Profile
     * <p>
     * Create fee profiles
     *
     * @throws ApiException if the Api call fails
     *                      <p>
     *                      *
     *                      EDITED
     *                      Test Function Name Generations from OPENAPI Spec with x-java-method-name
     */
    @Test
    @DisplayName("Create a Fee Profile")
    @Order(1)
    public void createFeeProfileTest() throws ApiException {
        Map<String, String> localMap = new HashMap<>();
        localMap.put("app pricing", "simple");
        CreateFeeProfileRequest createFeeProfileRequest = CreateFeeProfileRequest.builder()
                .achFixedFee(30L)
                .basisPoints(200L)
                .application("APmuwPBaW8pVcwb4vCTHQH32")
                .tags(localMap)
                .chargeInterchange(false)
                .fixedFee(100L)
                .achBasisPoints(300L)
                .build();
        FeeProfile response = finixClient.FeeProfiles.create(createFeeProfileRequest);
        feeProfileId = response.getId();
        assertEquals( 300L, response.getAchBasisPoints(),"Response should return ach_basis_points with value of 300 but returns" + response.getAchBasisPoints());
        assertEquals( "APmuwPBaW8pVcwb4vCTHQH32", response.getApplication(),"Response should return application of 'APmuwPBaW8pVcwb4vCTHQH32' but returns" + response.getApplication());
        assertEquals(false, response.getChargeInterchange());
    }

    /**
     * Fetch a Fee Profile
     * <p>
     * Get fee profile
     *
     * @throws ApiException if the Api call fails
     *                      <p>
     *                      *
     *                      EDITED
     *                      Test Function Name Generations from OPENAPI Spec with x-java-method-name
     */
    @Test
    @DisplayName("Fetch a Fee Profile")
    @Order(2)
    public void getFeeProfileTest() throws ApiException {
        FeeProfile response = finixClient.FeeProfiles.get(feeProfileId);
        assertEquals(response.getId(), feeProfileId, "Response should return fee profile id of " + feeProfileId + " but returns " + response.getId());
    }

    /**
     * List Fee Profiles
     * <p>
     * Get all fee profiles
     *
     * @throws ApiException if the Api call fails
     *                      <p>
     *                      *
     *                      EDITED
     *                      Test Function Name Generations from OPENAPI Spec with x-java-method-name
     */
    @Test
    @DisplayName("List Fee Profiles")
    public void listFeeProfilesTest() throws ApiException{
        Long limit = 20L;
        FinixList<FeeProfile> feeProfilesList = finixClient.FeeProfiles.list(ListFeeProfilesQueryParams.builder()
                .limit(limit)
                .build());
        assertTrue(feeProfilesList.size() >= 0);
        if (feeProfilesList.size() == 0){
            assertEquals(false, feeProfilesList.getHasMore());
        }
        if (feeProfilesList.getHasMore() == true) {
            FinixList<FeeProfile> nextList = feeProfilesList.listNext(1);
            assertTrue(nextList != null);
            assertEquals(1, nextList.size());
        }
    }
}
