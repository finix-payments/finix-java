/*
 * Finix API
 */


package api;

import invoker.ApiException;
import invoker.Environment;
import invoker.FinixClient;
import model.*;
import org.junit.jupiter.api.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * API tests for PaymentInstrumentsApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running PaymentInstrumentsApiTest")
public class PaymentInstrumentsApiTest {
    private FinixClient finixClient;
    private String paymentInstrumentId;
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
     * SKIPPING: don't have a working example
     * Create an Apple Pay Session
     *
     * Create an &#x60;apple_pay_session&#x60; to process Apple Pay transactions on the web.  To create an Apple Pay Session, pass a &#x60;validation_url&#x60; while creating an &#x60;apple_pay_sessions&#x60; resource. Finix returns a &#x60;merchantSession&#x60; object which you can use to create a payment. For more information, see [Apple Pay](guides/payments/alternative-payment-methods/apple-pay/). 
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    //@Test
    public void createApplePaySessionTest() throws ApiException {
        ApplePaySessionRequest applePaySessionRequest = ApplePaySessionRequest.builder()
                .displayName("Finix Test Merchant")
                .domain("www.finixtestmerchant.com")
                .merchantIdentity("IDmULj61C8ke6Y7qQiKENJ7")
                .validationUrl("https://apple-pay-gateway-cert.apple.com/paymentservices/paymentSession")
                .build();

        FinixClient tempClient = new FinixClient("USsRhsHYZGBPnQw8CByJyEQW","8a14c2f9-d94b-4c72-8f5c-a62908e5b30e", Environment.SANDBOX);
        ApplePaySession response = tempClient.PaymentInstruments.createApplePaySession(applePaySessionRequest);
        assertTrue(response.getId() instanceof String, "Response should return id with type of String but returns " + response.getId().getClass());
    }

    /**
     * Create a Payment Instrument
     *
     * Create a &#x60;Payment Instrument&#x60; resource using a card or bank account.  To accept payment detail, review our guide on how to [tokenize cards using hosted fields](/guides/payments/tokenization-with-hosted-fields).
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Create a Payment Instrument")
    @BeforeEach
    public void createPaymentInstrumentTest() throws ApiException, IOException {
        Map<String,String> localMap = new HashMap<>();
        localMap.put("card_name", "Business Card");
        CreatePaymentInstrumentRequest createPaymentInstrumentRequest =  CreatePaymentInstrumentRequest.builder()
                .name("Amy White")
                .expirationYear(2029l)
                .tags(localMap)
                .number("4895142232120006")
                .expirationMonth(12l)
                .address(CreatePaymentInstrumentRequestAddress.builder()
                        .city("San Francisco")
                        .region("CA")
                        .postalCode("94404")
                        .line1("900 Metro Center Blv")
                        .country("USA")
                        .build())
                .securityCode("022")
                .type(CreatePaymentInstrumentRequest.TypeEnum.PAYMENT_CARD)
                .identity("IDgWxBhfGYLLdkhxx2ddYf9K")
                .build();
        PaymentInstrument response = finixClient.PaymentInstruments.create(createPaymentInstrumentRequest);
        paymentInstrumentId = response.getId();
        assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
        assertEquals(createPaymentInstrumentRequest.getTags().get("card_name"), response.getTags().get("card_name"));
        assertEquals(createPaymentInstrumentRequest.getExpirationMonth(), response.getExpirationMonth());
    }
    /**
     * Create a Bank Account
     */
    @Test
    @DisplayName("Create a Bank Account")
    public void createBankAccount() throws ApiException{
        Map<String,String> localMap = new HashMap<>();
        localMap.put("Bank Account", "Company Account");
        CreatePaymentInstrumentRequest createPaymentInstrumentRequest =  CreatePaymentInstrumentRequest.builder()
                .accountType(CreatePaymentInstrumentRequest.AccountTypeEnum.CHECKING)
                .name("Alice")
                .tags(localMap)
                .country("USA")
                .bankCode("123123123")
                .accountNumber("123123123")
                .type(CreatePaymentInstrumentRequest.TypeEnum.BANK_ACCOUNT)
                .identity("IDpYDM7J9n57q849o9E9yNrG")
                .build();
        PaymentInstrument response =  finixClient.PaymentInstruments.create(createPaymentInstrumentRequest);
        assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
        assertEquals(createPaymentInstrumentRequest.getName(), response.getName());
        assertEquals(createPaymentInstrumentRequest.getBankCode(), response.getBankCode());
    }


    /**
     * Verify a Payment Instrument
     *
     * Verify a &#x60;Payment Instrument&#x60; to determine if it&#39;s elligable for Push To Card transactions.   &gt; Only verify &#x60;Payment Instruments&#x60; for [Push To Card](/guides/push-to-card) customers.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Payment instrument verification")
    @AfterAll
    public void createPaymentInstrumentVerificationTest() throws ApiException {
        Map<String,String> localMap = new HashMap<>();
        localMap.put("card_name", "Business_Card");
        CreateVerificationRequest verificationForm = CreateVerificationRequest.builder()
               .processor("DUMMY_V1")
               .merchant("MUgWbPVvtKbzjKNNGKqdQYV7")
               .identity("ID2CGJmjqyYaQAu6qyuvGeWK")
               .tags(localMap)
               .build();
        try{
            Verification response = finixClient.Verifications.create(verificationForm);
            assertEquals(verificationForm.getMerchant(), response.getMerchant());
            assertEquals(verificationForm.getProcessor(), response.getProcessor());
            assertEquals(verificationForm.getIdentity(), response.getMerchantIdentity());
        } catch(ApiException e){
            assertEquals(422, e.getCode());
        }        
    }



    /**
     * Get a Payment Instrument
     *
     * Retrieve the details of a &#x60;Payment Instrument&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Fetch a Bank Account")
    public void getPaymentInstrumentTest() throws ApiException {
        String paymentInstrumentId = "PI8sdzepdapDehPWKFTcre1m";
        PaymentInstrument response = finixClient.PaymentInstruments.get(paymentInstrumentId);
        assertEquals(paymentInstrumentId, response.getId());
        assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
    }

    /**
     * Fetch a Payment Card
     *
     * Retrieve the details of a &#x60;Payment Instrument&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @DisplayName("Fetch a Payment Card")
    public void getPaymentInstrumentCardTest() throws ApiException {
        String paymentInstrumentId = "PIe2YvpcjvoVJ6PzoRPBK137";
        PaymentInstrument response = finixClient.PaymentInstruments.get(paymentInstrumentId);
        assertEquals(paymentInstrumentId, response.getId());
        assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
    }

    /**
     * Fetch a Apple payment instrument
     *
     * Retrieve the details of a &#x60;Payment Instrument&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @DisplayName("Fetch a Apple payment instrument")
    public void getApplePayPaymentInstrumentTest() throws ApiException {
        String paymentInstrumentId = "PI4gTM3twQ5XyXfM4rTuFvpo";
        PaymentInstrument response = finixClient.PaymentInstruments.get(paymentInstrumentId);
        assertEquals(paymentInstrumentId, response.getId());
        assertEquals(response.getType(), PaymentInstrument.TypeEnum.APPLE_PAY,()->" Should return UNKOWN_DEFAULT but returns " + response.getType());
    }


    /**
     * List Payment Instruments
     *
     * Retrieve a list of &#x60;Payment Instruments&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("List All Payment Instruments")
    public void listPaymentInstrumentsTest() throws ApiException{
        Long limit = null;
        String afterCursor = null;
        String accountLast4 = null;
        String accountRoutingNumber = null;
        String application = null;
        String bin = null;
        String createdAtGte = null;
        String createdAtLte = null;
        String expirationMonth = null;
        String expirationYear = null;
        String lastFour = null;
        String name = null;
        String ownerIdentityId = null;
        String type = null;
        String beforeCursor = null;

        FinixList<PaymentInstrument> paymentInstrumentsList = finixClient.PaymentInstruments.list(ListPaymentInstrumentsQueryParams.builder()
                .limit(limit)
                .afterCursor(afterCursor)
                .accountLast4(accountLast4)
                .accountRoutingNumber(accountRoutingNumber)
                .application(application)
                .bin(bin)
                .createdAtGte(createdAtGte)
                .createdAtLte(createdAtLte)
                .expirationMonth(expirationMonth)
                .expirationYear(expirationYear)
                .lastFour(lastFour)
                .name(name)
                .ownerIdentityId(ownerIdentityId)
                .type(type)
                .beforeCursor(beforeCursor)
                .build());
        assertTrue(paymentInstrumentsList.size() >= 0);
        if (paymentInstrumentsList.size() == 0){
            assertEquals(false, paymentInstrumentsList.getHasMore());
        }
        if (paymentInstrumentsList.getHasMore() == true) {
            FinixList<PaymentInstrument> nextList = paymentInstrumentsList.listNext(1);
            assertTrue(nextList != null);
            assertEquals(1, nextList.size());
        }
    }


    /**
     * Update a Payment Instrument
     *
     * Update a &#x60;Payment Instrument&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Update a Payment Instrument")
    public void updatePaymentInstrumentTest() throws ApiException, IOException {
        Map<String,String> localMap = new HashMap<>();
        localMap.put("Test", "update_test");
        String paymentInstrumentId = "PIe2YvpcjvoVJ6PzoRPBK137";
        UpdatePaymentInstrumentRequest updatePaymentInstrumentRequest = UpdatePaymentInstrumentRequest.builder()
                .tags(localMap)
                .build();
        PaymentInstrument response = finixClient.PaymentInstruments.update(paymentInstrumentId, updatePaymentInstrumentRequest);
        assertEquals(localMap.get("Test"), response.getTags().get("Test"));
        assertEquals(paymentInstrumentId,response.getId(),()->" Should return " + paymentInstrumentId + " but returns " + response.getId());
    }
}
