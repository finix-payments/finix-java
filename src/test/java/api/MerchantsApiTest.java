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
 * API tests for MerchantsApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running MerchantsApiTest")
public class MerchantsApiTest {
    private FinixClient finixClient;
    private String merchantId;
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
        finixClient = new FinixClient("UStxEci4vXxGDWLQhNvao7YY", "25038781-2369-4113-8187-34780e91052e", Environment.SANDBOX);
        assertEquals(true, finixClient != null);
    }




    /**
     * Get a Merchant
     *
     * Retrieve the details of a &#x60;Merchant&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Get a Merchant")
    public void getMerchantTest() throws ApiException {
        String merchantId = "MUucec6fHeaWo3VHYoSkUySM";
        Merchant response = finixClient.Merchants.get(merchantId);
        assertEquals(merchantId, response.getId());
        assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
    }


    /**
     * List Merchants
     *
     * Retrieve a list of &#x60;Merchants&#x60;. 
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("List Merchants")
    public void listMerchantsTest() throws ApiException{
        String id = null;
        String createdAtGte = null;
        String createdAtLte = null;
        String sort = null;
        String afterCursor = null;
        Long limit = null;
        String beforeCursor = null;

        FinixList<Merchant> merchantsList = finixClient.Merchants.list(ListMerchantsQueryParams.builder()
                .id(id)
                .createdAtGte(createdAtGte)
                .createdAtLte(createdAtLte)
                .sort(sort)
                .afterCursor(afterCursor)
                .limit(limit)
                .beforeCursor(beforeCursor)
                .build());
        assertTrue(merchantsList.size() >= 0);
        if (merchantsList.size() == 0){
            assertEquals(false, merchantsList.getHasMore());
        }
        if (merchantsList.getHasMore() == true) {
            FinixList<Merchant> nextList = merchantsList.listNext(1);
            assertTrue(nextList != null);
            assertEquals(1, nextList.size());
        }
    }

    /**
     * Update a Merchant
     *
     * Update a &#x60;Merchant&#x60; to change the information saved or enable Level 2/3 processing.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Update Merchant to Enable Level 2/Level 3 Processing")
    public void putMerchantTest() throws ApiException {
        String merchantId = "MUeDVrf2ahuKc9Eg5TeZugvs";
        UpdateMerchantRequest updateMerchantRequest = UpdateMerchantRequest.builder()
                .levelTwoLevelThreeDataEnabled(true)
                .build();
        Merchant response = finixClient.Merchants.update(merchantId, updateMerchantRequest);
        assertEquals(merchantId, response.getId());
        assertEquals(true, response.getLevelTwoLevelThreeDataEnabled(), "Level 2/3 should be enabled but instead is "+ response.getLevelTwoLevelThreeDataEnabled());
    }

}
