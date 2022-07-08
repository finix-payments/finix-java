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
@DisplayName("PushToCardTest")
public class PushToCardTest {
    private TestInfo testInfo;
    private TestReporter testReporter;
    private FinixClient finixClient;
    private String localPaymentInstrumentId;

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tag " + testInfo.getTags());
    }

    @Test
    @BeforeAll
    @DisplayName("Finix Client")
    void contextLoads() {
        finixClient = new FinixClient("USte61SqeNkAZnpfavK3fQNG", "bd98703c-d72c-458e-8873-4295f5bac713", Environment.SANDBOX);
        assertEquals(true, finixClient != null);
    }
    @Test
    @DisplayName("Push to Card")
    void pushToCardTest() throws ApiException {
        Map<String,String> tags= new HashMap<>();
        tags.put("key", "value");
        CreateIdentityRequest createIdentityRequest = CreateIdentityRequest.builder()
                .tags(tags)
                .entity(CreateIdentityRequestEntity.builder()
                        .phone("7145677612")
                        .firstName("Ricardo")
                        .lastName("Kline")
                        .email("Ricardo@gmail.com")
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
        Identity response = finixClient.Identities.create(createIdentityRequest);
        //System.out.println(response);
    }
    @Test
    @DisplayName("Push to Card - Step 2: Add a Payment Instrument for the Recipient")
   // @BeforeAll
    void addPaymentInstrumentForRecipientTest() throws ApiException {
        Map<String,String> tags = new HashMap<>();
        tags.put("card_name", "Business Card");
        CreatePaymentInstrumentRequest createPaymentInstrumentRequest = CreatePaymentInstrumentRequest.builder()
                .name("Alex Lopez")
                .expirationYear(2029L)
                .tags(tags)
                .number("4895142232120006")
                .expirationMonth(12L)
                .address(CreatePaymentInstrumentRequestAddress.builder()
                        .city("San Francisco")
                        .region("CA")
                        .postalCode("94404")
                        .line1("900 Metro Center Blv")
                        .country("USA")
                        .build())
                .securityCode("022")
                .type(CreatePaymentInstrumentRequest.TypeEnum.PAYMENT_CARD)
                .identity("IDqeE5eaMBksiphXMfv3gJZw")
                .build();
        PaymentInstrument response = finixClient.PaymentInstruments.create(createPaymentInstrumentRequest);
        //System.out.println(response);
      //  localPaymentInstrumentId = response.getId();
    }
    @Test
    @DisplayName("Push to Card - Step 3: Verify card is eligible to receive push-to-card disbursements")
    void verifyCardEligibleToPushToCardDisbursementsTest() throws ApiException {
        String paymentInstrumentId= "PI77BEnaiYZDya1U6T38n72F";
        CreateVerificationRequest createVerificationRequest = CreateVerificationRequest.builder()
                .processor("VISA_V1")
                .build();
        Verification response = finixClient.PaymentInstruments.createPaymentInstrumentVerification(paymentInstrumentId,createVerificationRequest);
        //System.out.println(response);
    }
    @Test
    @DisplayName("Push to Card - Step 4: Provision Recipient Account")
    void provisionRecipientAccountTest() throws ApiException {
        String identityId ="IDqeE5eaMBksiphXMfv3gJZw";
        CreateMerchantUnderwritingRequest createMerchantUnderwritingRequest = CreateMerchantUnderwritingRequest.builder()
                .processor("VISA_V1")
                .build();
        Merchant response = finixClient.Merchants.create(identityId,createMerchantUnderwritingRequest);

    }
    @Test
    @DisplayName("Push to Card - Step 5: Send Payout")
    void sentPayoutTest() throws ApiException{
        Map<String,String> tags = new HashMap<>();
        tags.put("order_number", "21DFASJSAKAS");
        CreateTransferRequest createTransferRequest = CreateTransferRequest.builder()
                .currency(Currency.USD)
                .amount(1510l)
                .destination("PIRp4Cu3fG7DFQPdzhGcePL")
                .tags(tags)
                .build();
        Transfer response = finixClient.Transfers.create(createTransferRequest);
       // System.out.println(response);
    }
}
