/*
 * Finix API
 */


package api;

import invoker.ApiException;
import invoker.ApiResponse;
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
 * API tests for TransfersApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running TransferApi")

public class TransfersApiTest {
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
    /**
     * Create a Transfer
     *
     * Create a &#x60;Transfer&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Create a Transfer")
    public void createTransferTest() throws ApiException {
        Map<String,String> localMap = new HashMap<>();
        localMap.put("order_number", "21DFASJSAKAS");
        CreateTransferRequest createTransferRequest = CreateTransferRequest.builder()
                .source("PIe2YvpcjvoVJ6PzoRPBK137")
                .merchant("MUeDVrf2ahuKc9Eg5TeZugvs")
                .tags(localMap)
                .currency(Currency.USD)
                .amount(100L)
                .processor("DUMMY_V1")
                .build();
        Transfer transfer = finixClient.Transfers.create(createTransferRequest);
        assertEquals("PIe2YvpcjvoVJ6PzoRPBK137",transfer.getSource(),()->"Should return " + "PIe2YvpcjvoVJ6PzoRPBK137" + " but returns " + transfer.getSource());
    }
    /**
     * Create a Sale
     */
    @Test
    @DisplayName("Create a Sale")
    public void createSaleTest() throws ApiException{
        Map<String,String> localMap = new HashMap<>();
        localMap.put("test", "sale");
        CreateTransferRequest createTransferRequest = CreateTransferRequest.builder()
                .merchant("MUeDVrf2ahuKc9Eg5TeZugvs")
                .currency(Currency.USD)
                .amount(Long.valueOf(662154))
                .source("PIe2YvpcjvoVJ6PzoRPBK137")
                .tags(localMap)
                .build();
        Transfer transfer = finixClient.Transfers.create(createTransferRequest);
        assertEquals("PIe2YvpcjvoVJ6PzoRPBK137",transfer.getSource(),()->"Should return " + "PIe2YvpcjvoVJ6PzoRPBK137" + " but returns " + transfer.getSource());
    }
    /**
     * Debit a Bank Account (ie eCheck)
     */
    @Test
    @DisplayName("Debit a Bank Account (ie eCheck)")
    public void createDebitBankAccountTest() throws ApiException{
        Map<String,String> localMap = new HashMap<>();
        localMap.put("order_number", "21DFASJSAKAS");
        CreateTransferRequest createTransferRequest = CreateTransferRequest.builder()
                .fee(603l)
                .currency(Currency.USD)
                .merchant("MUeDVrf2ahuKc9Eg5TeZugvs")
                .tags(localMap)
                .source("PIk3AG7aUSCyNgYpDwCKkwDC")
                .amount(6031l)
                .processor("DUMMY_V1")
                .build();
        Transfer transfer = finixClient.Transfers.create(createTransferRequest);
    }
    /**
     * Create a 3D Secure Sale
     */
    @Test
    @DisplayName("Create a 3D Secure Sale")
    public void create3DSecureSaleTest() throws ApiException{
        Map<String,String> localMap = new HashMap<>();
        localMap.put("test", "sale");
        CreateTransferRequest createTransferRequest = CreateTransferRequest.builder()
                .merchant("MUeDVrf2ahuKc9Eg5TeZugvs")
                ._3dSecureAuthentication(CreateTransferRequest3dSecureAuthentication.builder()
                        .electronicCommerceIndicator("AUTHENTICATED")
                        .cardholderAuthentication("BwABBJQ1AgAAAAAgJDUCAAAAAAA")
                        .transactionId("EaOMucALHQqLAEGAgk")
                        .build())
                .source("PIe2YvpcjvoVJ6PzoRPBK137")
                .tags(localMap)
                .currency(Currency.USD)
                .amount(92169L)
                .build();
        Transfer transfer = finixClient.Transfers.create(createTransferRequest);
        assertEquals("APgPDQrLD52TYvqazjHJJchM", transfer.getApplication(),()-> "Should return "+"APgPDQrLD52TYvqazjHJJchM" + " but returns " +transfer.getApplication());
    }
    /**
     * Create a Sale with Level 3 Processing
     */
    @Test
    @DisplayName("Create a Sale with Level 3 Processing")
    public void createSaleLevel3Processing() throws ApiException {
        Map<String,String> localMap = new HashMap<>();
        localMap.put("test", "sale");
        List<AdditionalPurchaseDataItemDataInner> additionalPurchaseDataItemDataList = new ArrayList<>();
        additionalPurchaseDataItemDataList.add(AdditionalPurchaseDataItemDataInner.builder()
                .amountIncludingSalesTax(500l)
                .unitOfMeasure("BX")
                .merchantProductCode("1149611")
                .amountExcludingSalesTax(400l)
                .costPerUnit(500l)
                .commodityCode("175-62-20")
                .itemDescription(String.valueOf(100))
                .itemDescription("printing paper")
                .quantity(1l)
                .build());
        additionalPurchaseDataItemDataList.add(AdditionalPurchaseDataItemDataInner.builder()
                .amountIncludingSalesTax(500l)
                .unitOfMeasure("CTN")
                .merchantProductCode("2149612")
                .amountExcludingSalesTax(400l)
                .costPerUnit(500l)
                .commodityCode("207-72-54")
                .itemDescription(String.valueOf(0))
                .itemDescription("printing ink")
                .quantity(1l)
                .build());
        CreateTransferRequest createTransferRequest = CreateTransferRequest.builder()
                .merchant("MUeDVrf2ahuKc9Eg5TeZugvs")
                .source("PIe2YvpcjvoVJ6PzoRPBK137")
                .additionalPurchaseData(AdditionalPurchaseData.builder()
                        .itemData(additionalPurchaseDataItemDataList)
                        .discountAmount(100l)
                        .customerReferenceNumber("321xyz")
                        .shippingAmount(100l)
                        .customsDutyAmount(10l)
                        .build())
                .tags(localMap)
                .currency(Currency.USD)
                .amount(1000l)
                .build();
        Transfer resposne = finixClient.Transfers.create(createTransferRequest);
        assertEquals("APgPDQrLD52TYvqazjHJJchM", resposne.getApplication(),()-> "Should return "+"APgPDQrLD52TYvqazjHJJchM" + " but returns " +resposne.getApplication());
    }
    /**
     * Create a Sale with Level 2 Processing
     */
    @Test
    @DisplayName("Create a Sale with Level 2 Processing")
    public void createSaleLevel2ProcessingTest() throws ApiException {
        Map<String,String> localMap = new HashMap<>();
        localMap.put("test", "sale");
        CreateTransferRequest createTransferRequest = CreateTransferRequest.builder()
                .merchant("MUeDVrf2ahuKc9Eg5TeZugvs")
                .source("PIe2YvpcjvoVJ6PzoRPBK137")
                .additionalPurchaseData(AdditionalPurchaseData.builder()
                        .customerReferenceNumber("321xyz")
                        .salesTax(200l)
                        .build())
                .tags(localMap)
                .currency(Currency.USD)
                .amount(1000l)
                .build();
        Transfer transfer = finixClient.Transfers.create(createTransferRequest);
        assertEquals("APgPDQrLD52TYvqazjHJJchM", transfer.getApplication(),()-> "Should return "+"APgPDQrLD52TYvqazjHJJchM" + " but returns " +transfer.getApplication());
    }
    /**
     * Refund or Reverse a Transfer
     *
     * Reverse a transfer with a &#x60;type&#x60; of **DEBIT**. This reversal creates a new &#x60;Transfer&#x60; resource with a &#x60;type&#x60; of **REVERSAL**.   The refund can get delivered in most cases without the physical card. The card only needs to be swiped (to receive the refund) when:  - The payment type is **DEBIT**, and the transaction is no longer in the batch. - The payment type is **CREDIT**, and the transaction is no longer in the batch and is older than 45 days.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Refund or Reverse a Transfer")
    public void createTransferReversalTest() throws ApiException {
        Map<String,String> localMap = new HashMap<>();
        localMap.put("test", "refund");
        String transferId = "TRacB6Q6GcW6yvFUKawSnMEP";
        CreateReversalRequest createReversalRequest = CreateReversalRequest.builder()
                .refundAmount(100l)
                .tags(localMap)
                .build();
        Transfer transfer = finixClient.Transfers.createTransferReversal(transferId, createReversalRequest);
        assertEquals(Long.valueOf(100),transfer.getAmount(),()->"Should return " + "100" + " but returns " + transfer.getAmount());
    }

    /**
     * Get a Transfer
     *
     * Retrieve a &#x60;transfer&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Get a Transfer")
    public void getTest() throws ApiException {
        Transfer transfer = finixClient.Transfers.get("TRvtThmhZtk56z6dtCt8hUDR");
        assertEquals("TRvtThmhZtk56z6dtCt8hUDR", transfer.getId(),()-> "Should return "+"TRvtThmhZtk56z6dtCt8hUDR" + " but returns " +transfer.getId());
    }

    /**
     * List Reversals on a Transfer
     *
     * Retrieve a list of reversals for a &#x60;Transfer&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("List Reversals on a Transfer")
    public void listTransferReversalsTest() throws ApiException{
        String transferId = "TRvtThmhZtk56z6dtCt8hUDR";
        Long limit = null;
        String afterCursor = null;
        String beforeCursor = null;

        FinixList<Transfer> transfersReversalsList = finixClient.Transfers.listTransfersReversals(transferId, ListTransferReversalsQueryParams.builder()
                .limit(limit)
                .afterCursor("TRw6rC8cajRQ2MKozpJ5U1zj")
                .beforeCursor(beforeCursor)
                .build());
        assertTrue(transfersReversalsList.size() >= 0);
        if (transfersReversalsList.size() == 0){
            assertEquals(false, transfersReversalsList.getHasMore());
        }
        if (transfersReversalsList.getHasMore() == true) {
            FinixList<Transfer> nextList = transfersReversalsList.listNext(1);
            assertTrue(nextList != null);
            assertEquals(1, nextList.size());
        }
    }

    /**
     * List Transfers
     *
     * Retrieve a list of &#x60;Transfers&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("List Transfers")
    public void listTransfersTest() throws ApiException{
        String sort = null;
        String afterCursor = null;
        Long limit = null;
        Long amount = null;
        Long amountGte = null;
        Long amountGt = null;
        Long amountLte = null;
        Long amountLt = null;
        String createdAtGte = null;
        String createdAtLte = null;
        String idempotencyId = null;
        String id = null;
        String state = null;
        String readyToSettleAtGte = null;
        String readyToSettleAtLte = null;
        Long statementDescriptor = null;
        String traceId = null;
        String updatedAtGte = null;
        String updatedAtLte = null;
        String instrumentBin = null;
        String instrumentAccountLast4 = null;
        String instrumentBrandType = null;
        String merchantIdentityId = null;
        String merchantIdentityName = null;
        String instrumentName = null;
        String instrumentType = null;
        String merchantId = null;
        String merchantMid = null;
        String instrumentCardLast4 = null;
        String merchantProcessorId = null;
        String type = null;
        String beforeCursor = null;

        FinixList<Transfer> transfersList = finixClient.Transfers.list(ListTransfersQueryParams.builder()
                .sort(sort)
                .afterCursor(afterCursor)
                .limit(limit)
                .amount(amount)
                .amountGte(amountGte)
                .amountGt(amountGt)
                .amountLte(amountLte)
                .amountLt(amountLt)
                .createdAtGte(createdAtGte)
                .createdAtLte(createdAtLte)
                .idempotencyId(idempotencyId)
                .id(id)
                .state(state)
                .readyToSettleAtGte(readyToSettleAtGte)
                .readyToSettleAtLte(readyToSettleAtLte)
                .statementDescriptor(statementDescriptor)
                .traceId(traceId)
                .updatedAtGte(updatedAtGte)
                .updatedAtLte(updatedAtLte)
                .instrumentBin(instrumentBin)
                .instrumentAccountLast4(instrumentAccountLast4)
                .instrumentBrandType(instrumentBrandType)
                .merchantIdentityId(merchantIdentityId)
                .merchantIdentityName(merchantIdentityName)
                .instrumentName(instrumentName)
                .instrumentType(instrumentType)
                .merchantId(merchantId)
                .merchantMid(merchantMid)
                .instrumentCardLast4(instrumentCardLast4)
                .merchantProcessorId(merchantProcessorId)
                .type(type)
                .beforeCursor(beforeCursor)
                .build());
        assertTrue(transfersList.size() >= 0);
        if (transfersList.size() == 0){
            assertEquals(false, transfersList.getHasMore());
        }
        if (transfersList.getHasMore() == true) {
            FinixList<Transfer> nextList = transfersList.listNext(1);
            assertTrue(nextList != null);
            assertEquals(1, nextList.size());
        }
    }

    /**
     * Update a Transfer
     *
     * Update a &#x60;Transfer&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Update a Transfer")
    public void updateTest() throws ApiException {
        Map<String,String> localMap = new HashMap<>();
        localMap.put("order_number", "12121212");
        String transferId = "TRvtThmhZtk56z6dtCt8hUDR";
        UpdateTransferRequest updateTransferRequest = UpdateTransferRequest.builder()
                .tags(localMap)
                .build();
        Transfer transfer = finixClient.Transfers.update(transferId, updateTransferRequest);
        assertEquals("TRvtThmhZtk56z6dtCt8hUDR",transfer.getId(),()->"Should return " + "TRvtThmhZtk56z6dtCt8hUDR" + " but returns " + transfer.getId());
    }

    @Test 
    @DisplayName("Unexpected Enum Input")
    public void unexpectedEnumTest() throws ApiException {
        ApiResponse<Transfer> localVarResp =  finixClient.Transfers.getTransferWithHttpInfo("TRvtThmhZtk56z6dtCt8hUDR");
        System.out.println(localVarResp.getData());

    }
    
}
