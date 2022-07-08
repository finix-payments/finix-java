package payloads;

import invoker.ApiException;
import invoker.Environment;
import invoker.FinixClient;
import model.*;
import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.MethodName.class)
@DisplayName("PullFromCardTest")
public class PullFromCardTest {
    private TestInfo testInfo;
    private TestReporter testReporter;
    private FinixClient finixClient;
    private String localIdentityId;
    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter){
        this.testInfo =testInfo;
        this.testReporter =testReporter;
        testReporter.publishEntry("Running "+testInfo.getDisplayName()+ " with tag " + testInfo.getTags());
    }
    @Test
    @BeforeAll
    @DisplayName("Finix Client")
   // @Order(1)
    void contextLoads() {
        finixClient= new FinixClient("USte61SqeNkAZnpfavK3fQNG","bd98703c-d72c-458e-8873-4295f5bac713", Environment.SANDBOX);
        assertEquals(true , finixClient!=null);
    }
    @Test
    @DisplayName("Pull From Card - Step 1: Create a Sender Identity")
    //@Order(2)
    void createSenderIdentity() throws ApiException {
        /* "tags": {
	        "key": "value"
	    },
	    "entity": {
	        "phone": "7145677612",
	        "first_name": "Amy",
	        "last_name": "Curry",
	        "email": "Amy@gmail.com",
	        "personal_address": {
	            "city": "San Mateo",
	            "country": "USA",
	            "region": "CA",
	            "line2": "Apartment 7",
	            "line1": "741 Douglass St",
	            "postal_code": "94114"
	        }
	    }*/
        Map<String,String> localMap= new HashMap<>();
        localMap.put("key", "value");
        CreateIdentityRequest createIdentityRequest = CreateIdentityRequest.builder()
                .tags(localMap)
                .entity(CreateIdentityRequestEntity.builder()
                        .phone("7145677612")
                        .firstName("Amy")
                        .lastName("Curry")
                        .email("Amy@gmail.com")
                        .personalAddress(CreateIdentityRequestEntityPersonalAddress.builder()
                                        .city("San Mateo")
                                        .country("USA")
                                        .region("CA")
                                        .line2("Apartment 7")
                                        .line1("741 Douglass St")
                                        .postalCode("94114")
                                .build())
                        .build())
                .build();
        Identity response=finixClient.Identities.create(createIdentityRequest);
        localIdentityId = response.getId();
        assertEquals("APpJbVTLdEuwGfcxBJvb1qNH",response.getApplication(),()->" Should return " + "APpJbVTLdEuwGfcxBJvb1qNH" + " but returns " + response.getApplication());
    }
    @Test
    @DisplayName("Pull From Card - Step 2: Add a Payment Instrument for the Sender")
    //@Order(3)
    void addPaymentInstrumentForSender() throws ApiException {
        /*"name": "Alex Serna",
	    "expiration_year": 2029,
	    "tags": {
	        "card_name": "Business Card"
	    },
	    "number": "4895142232120006",
	    "expiration_month": 12,
	    "address": {
	        "city": "San Francisco",
	        "region": "CA",
	        "postal_code": "94404",
	        "line1": "900 Metro Center Blv",
	        "country": "USA"
	    },
	    "security_code": "022",
	    "type": "PAYMENT_CARD",
	    "identity": "ID7xXmm4Qwq7FRreERno2KRC"*/
        Map<String,String> localMap = new HashMap<>();
        localMap.put("card_name", "Business Card");
        CreatePaymentInstrumentRequest createPaymentInstrumentRequest = CreatePaymentInstrumentRequest.builder()
                .name("Alex Serna")
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
                .identity("ID7xXmm4Qwq7FRreERno2KRC")
                .build();
        PaymentInstrument response = finixClient.PaymentInstruments.create(createPaymentInstrumentRequest);
    }

    @Test
    @DisplayName("Pull From Card - Step 3: Verify Address Verification System (AVS) and CVV")
    //@Order(4)
    void verifyAVSCVVTest() throws ApiException {
        String instrumentId ="PIRp4Cu3fG7DFQPdzhGcePL";
        CreateVerificationRequest createVerificationRequest = CreateVerificationRequest.builder()
                .processor("VISA_V1")
                .build();
        Verification response = finixClient.PaymentInstruments.createPaymentInstrumentVerification(instrumentId,createVerificationRequest);
        //System.out.println(response);
    }
    //@Test
    //@Order(5)
    @DisplayName("Pull From Card - Step 4: Provision a Sender Account")
    void provisionSenderAccountTest() throws ApiException {
        String identityId ="IDqeE5eaMBksiphXMfv3gJZw";

        CreateMerchantUnderwritingRequest createMerchantUnderwritingRequest = CreateMerchantUnderwritingRequest.builder()
                .processor("VISA_V1")
                .build();
        Merchant response = finixClient.Merchants.create(identityId,createMerchantUnderwritingRequest);
    }
    @Test
    @DisplayName("Pull From Card - Step 5: Pull Funds")
    //@Order(6)
    void pullFundsTest() throws ApiException {
        /*{
	    "currency": "USD",
	    "amount": 20000,
	    "source": "PIaHGpBQYDc5fTpNxHgqoKMY",
	    "operation_key": "PULL_FROM_CARD",
	    "tags": {
	        "order_number": "21DFASJSAKAS"
	    }
	}'*/
        Map<String, String> localMap = new HashMap<>();
        localMap.put("order_number", "21DFASJSAKAS");
        CreateTransferRequest createTransferRequest = CreateTransferRequest.builder()
                .currency(Currency.USD)
                .amount(20000l)
                .source("PIaHGpBQYDc5fTpNxHgqoKMY")
                .operationKey(CreateTransferRequest.OperationKeyEnum.PULL_FROM_CARD)
                .tags(localMap)
                .build();
        Transfer response=finixClient.Transfers.create(createTransferRequest);
       // System.out.println(response);
    }
    @Test
    @DisplayName("Pull From Card - Reverse a Pull-from-Card Transfer")
    void reversePullFromCardTransferTest() throws ApiException {
        String transferId = "TRu3LV1eGb7Pk1QDFqFQ3WGb";
        Map<String,String> tags= new HashMap<>();
        tags.put("test" , "refund");
        CreateReversalRequest createReversalRequest = CreateReversalRequest.builder()
                .refundAmount(100l)
                .tags(tags)
                .build();
        Transfer response = finixClient.Transfers.createTransferReversal(transferId,createReversalRequest);
        //System.out.println(response);
    }

}
