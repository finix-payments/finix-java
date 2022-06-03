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
import invoker.Environment;
import invoker.FinixClient;
import model.*;

import org.junit.jupiter.api.*;


import java.math.BigDecimal;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * API tests for TransfersApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running TransferApi")
@Disabled
public class TransfersApiTest {

    private FinixClient finixClient;
    private final TransfersApi api = new TransfersApi();
    private TestInfo testInfo;
    private TestReporter testReporter;


    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter){
        this.testInfo =testInfo;
        this.testReporter =testReporter;
        testReporter.publishEntry("Running "+testInfo.getDisplayName()+ " with tag " + testInfo.getTags());
    }
    @Test
    @BeforeAll
    @DisplayName("Finix Client")
    void contextLoads() {
        finixClient= new FinixClient("USsRhsHYZGBPnQw8CByJyEQW","8a14c2f9-d94b-4c72-8f5c-a62908e5b30e", Environment.SANDBOX);
        //  System.out.println(finixClient == null);
        assertEquals(true , finixClient!=null);

    }

    /**
     * Create a Transfer
     *
     * Create a transfer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @DisplayName("Create a Transfer")
    public void createTransferTest() throws ApiException {
        /*	{
	    "fee": 603,
	    "currency": "USD",
	    "merchant": "MUeDVrf2ahuKc9Eg5TeZugvs",
	    "tags": {
	        "order_number": "21DFASJSAKAS"
	    },
	    "source": "PIk3AG7aUSCyNgYpDwCKkwDC",
	    "amount": 6031,
	    "processor": "DUMMY_V1"
	}*/
        CreateTransferRequest createTransferRequest = CreateTransferRequest.builder()
                .source("PIe2YvpcjvoVJ6PzoRPBK137")
                .merchant("MUeDVrf2ahuKc9Eg5TeZugvs")
                .tags(Map.of("order_number", "21DFASJSAKAS"))
                .currency(Currency.USD)
                .amount(100L)
                .processor("DUMMY_V1")
                .build();
        Transfer transfer = finixClient.Transfers.create(createTransferRequest);
        assertEquals("PIe2YvpcjvoVJ6PzoRPBK137",transfer.getSource(),()->"Should return " + "PIe2YvpcjvoVJ6PzoRPBK137" + " but returns " + transfer.getSource());
        //System.out.println(transfer.toJson());
    }

    /**
     * Refund or Reverse a Transfer
     *
     * Reverse a transfer with a &#x60;type&#x60; of **DEBIT**. This creates a new &#x60;Transfer&#x60; resource with a &#x60;type&#x60; of **REVERSAL**
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @DisplayName("Refund or Reverse a Transfer")
    public void createTransferReversalTest() throws ApiException {
        String transferId = "TRacB6Q6GcW6yvFUKawSnMEP";
        CreateReversalRequest createReversalRequest = CreateReversalRequest.builder()
                .refundAmount(BigDecimal.valueOf(100))
                .tags(Map.of("test" , "refund"))
                .build();
        Transfer transfer = finixClient.Transfers.createTransferReversal(transferId, createReversalRequest);
        assertEquals(BigDecimal.valueOf(100),transfer.getAmount(),()->"Should return " + "100" + " but returns " + transfer.getAmount());
        // System.out.println(transfer.getState());
        // TODO: test validations
    }
    @Test
    @DisplayName("Create a Sale")
    public void createSale() throws ApiException{
        /*{
	    "merchant": "MUeDVrf2ahuKc9Eg5TeZugvs",
	    "currency": "USD",
	    "amount": 662154,
	    "source": "PIe2YvpcjvoVJ6PzoRPBK137",
	    "tags": {
	        "test": "sale"
	    }
	}'*/
        CreateTransferRequest createTransferRequest = CreateTransferRequest.builder()
                .merchant("MUeDVrf2ahuKc9Eg5TeZugvs")
                .currency(Currency.USD)
                .amount(Long.valueOf(662154))
                .source("PIe2YvpcjvoVJ6PzoRPBK137")
                .tags(Map.of( "test", "sale"))
                .build();
        Transfer transfer = finixClient.Transfers.create(createTransferRequest);
        assertEquals("PIe2YvpcjvoVJ6PzoRPBK137",transfer.getSource(),()->"Should return " + "PIe2YvpcjvoVJ6PzoRPBK137" + " but returns " + transfer.getSource());
        //System.out.println(transfer.getMerchantIdentity());
    }


    /**
     * Get a Transfer
     *
     * Retrieve a transfer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @DisplayName("Get a Transfer")
    public void getTest() throws ApiException {
        Transfer transfer = finixClient.Transfers.get("TRvtThmhZtk56z6dtCt8hUDR");
        assertEquals("TRvtThmhZtk56z6dtCt8hUDR", transfer.getId(),()-> "Should return "+"TRvtThmhZtk56z6dtCt8hUDR" + " but returns " +transfer.getId());
    }


    /**
     * List Transfers for an Application
     *
     * Get all transfers objects within application
     *
     * @throws ApiException if the Api call fails
     */
    //@Test
    public void listApplicationTransfersTest() throws ApiException {
        String applicationId = null;
        TransfersList response = api.listByApplicationId(applicationId);
        // TODO: test validations
    }

    /**
     * List Identity Transfers
     *
     * All transfers associated to this identity
     *
     * @throws ApiException if the Api call fails
     */
    //@Test
    public void listIdentityTransfersTest() throws ApiException {
        String identityId = null;
        Integer limit = null;
        Long offset = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        Boolean sortSorted = null;
        Boolean sortUnsorted = null;
        TransfersList response = api.listByIdentityId(identityId, limit, offset, pageNumber, pageSize, sortSorted, sortUnsorted);
        // TODO: test validations
    }

    /**
     * List Merchant Transfers
     *
     * Get list of all the tranfers in the merchant object
     *
     * @throws ApiException if the Api call fails
     */
    //@Test
    public void listMerchantTransfersTest() throws ApiException {
        String merchantId = null;
        Integer limit = null;
        Long offset = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        Boolean readyToSettle = null;
        Boolean sortSorted = null;
        Boolean sortUnsorted = null;
        TransfersList response = api.listByMerchantId(merchantId, limit, offset, pageNumber, pageSize, readyToSettle, sortSorted, sortUnsorted);
        // TODO: test validations
    }

    /**
     * List Payment Instrument Transfers
     *
     * Get list of all the transfers in the payment instrument object
     *
     * @throws ApiException if the Api call fails
     */
    //@Test
    public void listPaymentInstrumentTransfersTest() throws ApiException {
        String paymentInstrumentId = null;
        Integer limit = null;
        Long offset = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        Boolean sortSorted = null;
        Boolean sortUnsorted = null;
        TransfersList response = api.listByPaymentInstrumentId(paymentInstrumentId, limit, offset, pageNumber, pageSize, sortSorted, sortUnsorted);
        // TODO: test validations
    }

    /**
     * List Settlement Transfers
     *
     * Find all transfers for a settlement
     *
     * @throws ApiException if the Api call fails
     */
    //@Test
    public void listSettlementTransfersTest() throws ApiException {
        String settlementId = null;
        TransfersList response = api.listBySettlementId(settlementId);
        // TODO: test validations
    }

    /**
     * List Reversals on a Transfer
     *
     * Retrieve a list of reversals for a transfer.
     *
     * @throws ApiException if the Api call fails
     */
   // @Test
    public void listTransferReversalsTest() throws ApiException {
        String transferId = null;
        Integer limit = null;
        Long offset = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        Boolean sortSorted = null;
        Boolean sortUnsorted = null;
        TransfersList response = api.listTransfersReversals(transferId, limit, offset, pageNumber, pageSize, sortSorted, sortUnsorted);
        // TODO: test validations
    }

    /**
     * List Transfers
     *
     * Retrieve a list of transfers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @DisplayName("List Transfers")
    public void listTransfersTest() throws ApiException {
        String sort = null;
        Integer offset = null;
        Integer limit = null;
        Integer amount = null;
        Integer amountGte = null;
        Integer amountGt = null;
        Integer amountLte = null;
        Integer amountLt = null;
        String createdAtGte = null;
        String createdAtLte = null;
        String idempotencyId = null;
        String id = null;
        String state = null;
        String readyToSettleAtGte = null;
        String readyToSettleAtLte = null;
        Integer statementDescriptor = null;
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
        TransfersList transfersList = finixClient.Transfers.list(sort, offset, limit, amount, amountGte, amountGt, amountLte, amountLt, createdAtGte, createdAtLte, idempotencyId, id, state, readyToSettleAtGte, readyToSettleAtLte, statementDescriptor, traceId, updatedAtGte, updatedAtLte, instrumentBin, instrumentAccountLast4, instrumentBrandType, merchantIdentityId, merchantIdentityName, instrumentName, instrumentType, merchantId, merchantMid, instrumentCardLast4, merchantProcessorId, type);
       assertEquals(20,transfersList.getPage().getLimit(),()->"Should return " + "20" + " but returns " + transfersList.getPage().getLimit()); }

    /**
     * Update a Transfer
     *
     * Update a transfer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @DisplayName("Update a Transfer")
    public void updateTest() throws ApiException {
        /*{
  	  "tags": {
  	      "order_number": "12121212"
  	  }
          }'*/
        String transferId = "TRvtThmhZtk56z6dtCt8hUDR";
        UpdateTransferRequest updateTransferRequest = UpdateTransferRequest.builder()
                .tags(Map.of("order_number", "12121212"))
                .build();
        Transfer transfer = finixClient.Transfers.update(transferId, updateTransferRequest);
        assertEquals("TRvtThmhZtk56z6dtCt8hUDR",transfer.getId(),()->"Should return " + "TRvtThmhZtk56z6dtCt8hUDR" + " but returns " + transfer.getId());

    }

}
