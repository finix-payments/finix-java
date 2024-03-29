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
 * API tests for BalanceTransfersApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running BalanceTransfersApiTest")
public class BalanceTransfersApiTest {
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
        finixClient= new FinixClient("USbkjk46XqUTQHN3i2jaVnc1","ac915962-2757-49ea-aeee-10960a408b99", Environment.SANDBOX);
        assertEquals(true , finixClient!=null);
    }
    /**
     * Create a Balance Transfer
     *
     * Create a &#x60;balance_transfer&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Create a Balance Transfer")
    public void createBalanceTransferTest() throws ApiException {
        Map<String, String> localMap = new HashMap<>();
        localMap.put("example", "documentation tag");
        CreateBalanceTransferRequest createBalanceTransferRequest = CreateBalanceTransferRequest.builder()
                .description("Need to increase buffer given the high number of NSFs on merchant fee debits")
                .tags(localMap)
                .destination(CreateBalanceTransferRequest.DestinationEnum.FOR_BENEFIT_OF_ACCOUNT)
                .currency(Currency.USD)
                .amount(4000L)
                .source(CreateBalanceTransferRequest.SourceEnum.OPERATING_ACCOUNT)
                .processorType("LITLE_V1")
                .build();
        BalanceTransfer response = finixClient.BalanceTransfers.create(createBalanceTransferRequest);
        assertEquals(CreateBalanceTransferRequest.SourceEnum.OPERATING_ACCOUNT.toString(),response.getSource(),()->"Should return " + "OPERATING_ACCOUNT" + " but returns " + response.getSource());
        assertEquals(createBalanceTransferRequest.getAmount(), response.getAmount());
        assertEquals(createBalanceTransferRequest.getDescription(), response.getDescription());
    }

    /**
     * Get a Balance Transfer
     *
     * Retrieve the details of a &#x60;balance_transfer&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Get a Balance Transfer")
    public void getBalanceTransfersTest() throws ApiException {
        String balanceTransfersId = "BT_v3KQqgpDPqskH8VH6isFyz";
        BalanceTransfer response = finixClient.BalanceTransfers.get(balanceTransfersId);
        assertEquals(CreateBalanceTransferRequest.SourceEnum.OPERATING_ACCOUNT.toString(),response.getSource(),()->"Should return " + "OPERATING_ACCOUNT" + " but returns " + response.getSource());
        assertEquals(4000L, response.getAmount());
        assertEquals(balanceTransfersId, response.getId());
    }

    /**
     * List Balance Transfers
     *
     * Retrieve a list of &#x60;balance_transfers&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("List Balance Transfers")
    public void listBalanceTransfersTest() throws ApiException{
        Long limit = null;
        Long offset = null;
        Long pageNumber = null;
        Long pageSize = null;
        String createdAtGte = null;
        String createdAtLte = null;
        String updatedAtGte = null;
        String updatedAtLte = null;
        String idempotencyId = null;
        Long amount = null;
        String description = null;
        String destination = null;
        String externalReferenceId = null;
        String referenceId = null;
        String source = null;

        FinixList<BalanceTransfer> balanceTransfersList = finixClient.BalanceTransfers.list(ListBalanceTransfersQueryParams.builder()
                .limit(limit)
                .offset(offset)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .createdAtGte(createdAtGte)
                .createdAtLte(createdAtLte)
                .updatedAtGte(updatedAtGte)
                .updatedAtLte(updatedAtLte)
                .idempotencyId(idempotencyId)
                .amount(amount)
                .description(description)
                .destination(destination)
                .externalReferenceId(externalReferenceId)
                .referenceId(referenceId)
                .source(source)
                .build());
        assertTrue(balanceTransfersList.size() >= 0);
        if (balanceTransfersList.size() == 0){
            assertEquals(false, balanceTransfersList.getHasMore());
        }
        if (balanceTransfersList.getHasMore() == true){
            FinixList<BalanceTransfer> nextList = balanceTransfersList.listNext(1);
            assertTrue( nextList != null);
            assertEquals(1, nextList.size());
        }
    }
}
