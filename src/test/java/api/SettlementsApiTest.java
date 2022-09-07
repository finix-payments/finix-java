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
 * API tests for SettlementsApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running SettlementsApiTest")
public class SettlementsApiTest {
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
        finixClient = new FinixClient("USpumes23XhzHwXqiy9bfX2B", "c69d39e3-f9ff-4735-8c3e-abca86441906", Environment.SANDBOX);
        assertEquals(true , finixClient!=null);
    }

    /**
     * Get a Settlement
     *
     * Retreive the details of a &#x60;Settlement&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Fetch a Batch Settlement")
    public void getSettlementTest() throws ApiException {
        String settlementId = "STmCc8GbjjX33SdymwNhb9Et";
        Settlement response = finixClient.Settlements.get(settlementId);
        assertEquals(settlementId, response.getId());
        assertEquals("AP3AB2itAWrrrPVS6spvrGYp",response.getApplication(),()->" Should return " + "AP3AB2itAWrrrPVS6spvrGYp" + " but returns " + response.getApplication());
    }

    /**
     * List Settlement Funding Transfers
     *
     * Retrieve the &#x60;Transfers&#x60; in a &#x60;Settlement&#x60; that have &#x60;type&#x60; **CREDIT**.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("List Funding Transfers in a Batch Settlement")
    public void getSettlementFundingTransfersTest() throws ApiException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        String settlementId = "STmCc8GbjjX33SdymwNhb9Et";
        Long limit = 20L;
        FinixList<Transfer> settlementFundingList = finixClient.Settlements.listFundingTransfers(settlementId, ListSettlementFundingTransfersQueryParams.builder()
                .limit(limit)
                .build());
        assertTrue(settlementFundingList.size() >= 0);
        if (settlementFundingList.getHasMore() == true) {
            FinixList<Transfer> nextList = settlementFundingList.listNext(1);
            assertTrue(nextList != null);
            assertEquals(1, nextList.size());
        }
    }

    /**
     * List Settlement Transfers
     *
     * Retrieve the &#x60;Transfers&#x60; in a &#x60;Settlement&#x60; that have &#x60;type&#x60; **DEBIT** or **REFUND**.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("List Settlement Transfers")
    public void listSettlementTransfersTest() throws ApiException{
        String settlementId = "STmCc8GbjjX33SdymwNhb9Et";
        Long limit = 20L;
        FinixList<Transfer> settlementTransferList = finixClient.Settlements.listTransfersBySettlementId(settlementId, ListSettlementTransfersQueryParams.builder()
                .limit(limit)
                .build());
        assertTrue(settlementTransferList.size() >= 0);
        if (settlementTransferList.size() == 0){
            assertEquals(false, settlementTransferList.getHasMore());
        }
        if (settlementTransferList.getHasMore() == true) {
            FinixList<Transfer> nextList = settlementTransferList.listNext(1);
            assertTrue(nextList != null);
            assertEquals(1, nextList.size());
        }
    }

    /**
     * List Settlements
     *
     * Retrieve a list of &#x60;Settlements&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("List Settlements")
    public void listSettlementsTest() throws ApiException{
        FinixList<Settlement> settlementsList = finixClient.Settlements.list(ListSettlementsQueryParams.builder()
                .build());
        assertTrue(settlementsList.size() >= 0);
        if (settlementsList.size() == 0){
            assertEquals(false, settlementsList.getHasMore());
        }
        if (settlementsList.getHasMore() == true) {
            FinixList<Settlement> nextList = settlementsList.listNext(1);
            assertTrue(nextList != null);
            assertEquals(1, nextList.size());
        }
    }

    /**
     * Remove Settlement Transfers
     *
     * Remove a &#x60;Transfer&#x60; from a &#x60;Settlement&#x60;.  As long as the &#x60;Settlement&#x60; hasn&#39;t been funded, you can remove the &#x60;Transfer&#x60; or an array of &#x60;Transfers&#x60;, along with its corresponding &#x60;fee&#x60; from a batch &#x60;Settlement&#x60;.   Note: Per the JSON API for deleting a resource, our API doesn&#39;t have a response body when removing a &#x60;Transfer&#x60; from a &#x60;Settlement&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Remove Settlement Transfers")
    public void removeSettlementTransfersTest() throws ApiException {
        String settlementId = "STmCc8GbjjX33SdymwNhb9Et";
        List<String> localList = new ArrayList<>();
        localList.add("TRr61njQxaa7AJf6E1C3QwCc");
        RemoveSettlementTransfer removeSettlementTransfer = RemoveSettlementTransfer.builder()
                .transfers(localList)
                .build();
        try {
            finixClient.Settlements.removeTransfersFromSettlement(settlementId, removeSettlementTransfer);
        } catch (ApiException apiException) {
            assertTrue(apiException.getMessage().contains("Entries [" + removeSettlementTransfer.getTransfers().get(0) + "] not found in settlement " + settlementId));
        }
    }

}
