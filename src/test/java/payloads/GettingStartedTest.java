package payloads;

import invoker.ApiException;
import invoker.Environment;
import invoker.FinixClient;
import model.*;
import org.junit.jupiter.api.*;
import payloads.utils.JsonLoader;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running GettingStartedTest")
public class GettingStartedTest {
    private FinixClient finixClient;
    JsonLoader loadJson = new JsonLoader();
    private String identityId,merchantId,paymentInstrumentId;
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
        assertEquals(true , finixClient!=null);

    }
    @Test
    @BeforeAll
    @DisplayName("Getting Started - Step 1: Create an Identity for a Merchant")
    public void createIdentityTest() throws ApiException, IOException {
        Map<String,String> localMap = new HashMap<>();
        localMap.put("Studio Rating", "4.7");
        CreateIdentityRequest createIdentityRequest  = CreateIdentityRequest.builder()
                .additionalUnderwritingData(CreateIdentityRequestAdditionalUnderwritingData.builder()
                        .merchantAgreementAccepted(true)
                        .merchantAgreementIpAddress("42.1.1.113")
                        .volumeDistributionByBusinessType(CreateIdentityRequestAdditionalUnderwritingDataVolumeDistributionByBusinessType
                                .builder()
                                .otherVolumePercentage(Long.valueOf(0))
                                .consumerToConsumerVolumePercentage(Long.valueOf(0))
                                .businessToConsumerVolumePercentage(0l)
                                .businessToBusinessVolumePercentage(100l)
                                .personToPersonVolumePercentage(0l)
                                .build())
                        .averageAchTransferAmount(200000l)
                        .annualAchVolume(200000l)
                        .creditCheckUserAgent( "Mozilla 5.0(Macintosh; IntelMac OS X 10 _14_6)")
                        .refundPolicy(CreateIdentityRequestAdditionalUnderwritingData.RefundPolicyEnum.MERCHANDISE_EXCHANGE_ONLY)
                        .creditCheckTimestamp("2021-04-28T16:42:55Z")
                        .creditCheckAllowed(true)
                        .merchantAgreementTimestamp("2021-04-28T16:42:55Z")
                        .businessDescription("SB3 vegan cafe")
                        .averageCardTransferAmount(200000l)
                        .creditCheckIpAddress("42.1.1.113")
                        .merchantAgreementUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6)")
                        .cardVolumeDistribution(CreateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution.builder()
                                .cardPresentPercentage(30l)
                                .mailOrderTelephoneOrderPercentage(10l)
                                .ecommercePercentage(60l)
                                .build())
                        .build())
                .tags(localMap)
                .entity(CreateIdentityRequestEntity.builder()
                        .lastName("Sunkhronos")
                        .maxTransactionAmount(12000000l)
                        .hasAcceptedCreditCardsPreviously(true)
                        .defaultStatementDescriptor("Petes Coffee")
                        .personalAddress(CreateIdentityRequestEntityPersonalAddress.builder()
                                .city("San Mateo")
                                .country("USA")
                                .region("CA")
                                .line2( "Apartment 7")
                                .line1("741 Douglass St")
                                .postalCode("94114")
                                .build())
                        .incorporationDate(CreateIdentityRequestEntityIncorporationDate.builder()
                                .year(1978l)
                                .day(27l)
                                .month(6l)
                                .build())
                        .businessAddress(CreateIdentityRequestEntityBusinessAddress.builder()
                                .city("San Mateo")
                                .country("USA")
                                .region("CA")
                                .line2( "Apartment 7")
                                .line1("741 Douglass St")
                                .postalCode("94114")
                                .build())
                        .ownershipType(CreateIdentityRequestEntity.OwnershipTypeEnum.PRIVATE)
                        .firstName("dwayne")
                        .title("CEO")
                        .businessTaxId("123456789")
                        .doingBusinessAs("Petes Coffee")
                        .principalPercentageOwnership(50l)
                        .email("user@example.org")
                        .mcc("0742")
                        .phone("1234567890")
                        .businessName( "Petes Coffee")
                        .taxId("123456789")
                        .businessType(CreateIdentityRequestEntity.BusinessTypeEnum.INDIVIDUAL_SOLE_PROPRIETORSHIP)
                        .businessPhone("+1 (408) 756-4497")
                        .dob(CreateIdentityRequestEntityDob.builder()
                                .year(1978l)
                                .day(27l)
                                .month(6l)
                                .build())
                        .url("www.PetesCoffee.com")
                        .annualCardVolume(12000000l)
                        .build())
                .build();
        Identity response = finixClient.Identities.create(createIdentityRequest);
        Reader reader = loadJson.jsonReader("createIdentity.json");
        Identity identity =  loadJson.getGson().fromJson(reader,Identity.class);
        identityId = response.getId();
        //System.out.println(response);
        //assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
       // assertEquals(identity.getApplication(),response.getApplication(),()->" Should return " + identity.getApplication() + " but returns " + response.getApplication());

    }
    @Test
    @DisplayName("Getting Started - Step 1.5: Add Additional Beneficial Owners for a Merchant")
    public void createAssociatedIdentityTest() throws ApiException, IOException {
        CreateIdentityRequest createIdentityRequest = CreateIdentityRequest.builder()
                .entity(CreateIdentityRequestEntity.builder()
                        .firstName("John")
                        .lastName("Smith")
                        .title("Founder")
                        .dob(CreateIdentityRequestEntityDob.builder()
                                .month(1l)
                                .day(1l)
                                .year(2013l)
                                .build())
                        .principalPercentageOwnership(25l)
                        .phone("1234567890")
                        .personalAddress(CreateIdentityRequestEntityPersonalAddress.builder()
                                .city("San Francisco")
                                .region("CA")
                                .postalCode("90650")
                                .line1("123 Main Street")
                                .country("USA")
                                .build())
                        .email("john.smith@company1.com")
                        .taxId("123456789")
                        .build())
                .build();
        Identity response = finixClient.Identities.createAssociatedIdentity(identityId,createIdentityRequest);
        Reader reader = loadJson.jsonReader("createAssociatedIdentity.json");
        Identity identity =  loadJson.getGson().fromJson(reader,Identity.class);
        assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
       // System.out.println(response.getApplication());
        assertEquals(identity.getApplication(),response.getApplication(),()->" Should return " + identity.getApplication() + " but returns " + response.getApplication());
    }
    @Test
    @DisplayName("Getting Started - Step 2: Tokenize a Bank Account for Funding your Merchant")
    public void createTokenizeBankAccountTest() throws ApiException, IOException {
        Map<String,String> localMap = new HashMap<>();
        localMap.put("Bank Account", "Company Account");
        CreatePaymentInstrumentRequest createPaymentInstrumentRequest =  CreatePaymentInstrumentRequest.builder()
                .accountType(CreatePaymentInstrumentRequest.AccountTypeEnum.SAVINGS)
                .name("Alice")
                .tags(localMap)
                .country("USA")
                .bankCode("123123123")
                .accountNumber("123123123")
                .type(CreatePaymentInstrumentRequest.TypeEnum.BANK_ACCOUNT)
                .identity(identityId)
                .build();
        PaymentInstrument response =  finixClient.PaymentInstruments.create(createPaymentInstrumentRequest);
        Reader reader = loadJson.jsonReader("createTokenizeBankAccount.json");
        identityId = response.getIdentity();
        //System.out.println(response);
        //      PaymentInstrument request = (PaymentInstrument) loadJson.getGson().fromJson(String.valueOf(reader.read()),PaymentInstrument.class);
         // assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
        //assertEquals(identity.getApplication(),response.getApplication(),()->" Should return " + identity.getApplication() + " but returns " + response.getApplication());
    }
    @Test
    //@BeforeAll
    @DisplayName("Getting Started - Step 3: Provision Merchant Account")
    public void provisionMerchantAccountTest() throws ApiException, IOException {
        Map<String,String> localMap = new HashMap<>();
        localMap.put("key", "value_2");
        CreateMerchantUnderwritingRequest createMerchantUnderwritingRequest = CreateMerchantUnderwritingRequest.builder()
                .processor("DUMMY_V1")
                .tags(localMap)
                .build();
        Merchant response = finixClient.Merchants.create(identityId, createMerchantUnderwritingRequest);
        merchantId = response.getId();
        // assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
        // Reader reader = loadJson.jsonReader("provisionMerchantAccount.json");
        //Merchant identity =  loadJson.getGson().fromJson(reader,Merchant.class);
       //  assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
       // assertEquals(identity.getApplication(),response.getApplication(),()->" Should return " + identity.getApplication() + " but returns " + response.getApplication());
    }
    @Test
    @DisplayName("Getting Started - Step 4: Create an Identity for a Buyer")
    public void createBuyerIdentityTest() throws ApiException{
        Map<String,String> localMap = new HashMap<>();
        localMap.put("key", "value");
        CreateIdentityRequest createIdentityRequest = CreateIdentityRequest.builder()
                .tags(localMap)
                .entity(CreateIdentityRequestEntity.builder()
                        .phone("7145677613")
                        .firstName("Collen")
                        .lastName("Wade")
                        .email("therock@gmail.com")
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
     //   assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
    }
    @Test
    @DisplayName("Getting Started - Step 5: Tokenize a Card")
    public void createTokenizeCardTest() throws ApiException {
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
                .identity(identityId)
                .build();
        PaymentInstrument response = finixClient.PaymentInstruments.create(createPaymentInstrumentRequest);
        paymentInstrumentId = response.getId();
        //System.out.println(response);
     //   assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());

    }

    @Test
    @DisplayName("Getting Started - Step 6: Create Sale")
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
        //System.out.println(transfer);
   //     assertEquals("APgPDQrLD52TYvqazjHJJchM",transfer.getApplication(),()->"Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + transfer.getApplication());
    }

    @Test
    @DisplayName("Tokenization With Hosted Fields - Step 5: Associate to an Identity")
    public void createTokenizeHostedFieldTest() throws ApiException {
        finixClient= new FinixClient("USte61SqeNkAZnpfavK3fQNG","bd98703c-d72c-458e-8873-4295f5bac713", Environment.SANDBOX);
        Map<String,String> localMap = new HashMap<>();
        localMap.put("card_name", "Business Card");
        CreatePaymentInstrumentRequest createPaymentInstrumentRequest =  CreatePaymentInstrumentRequest.builder()
                .token("TKiMxe323RE5Dq3wLVtG8kSW")
                .type(CreatePaymentInstrumentRequest.TypeEnum.TOKEN)
                .identity(identityId)
                .build();
         PaymentInstrument response = finixClient.PaymentInstruments.create(createPaymentInstrumentRequest);
       // assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
    }
    @Test
    @DisplayName("Card Present Integration - Step 1: Provision Merchant with triPOS")
    public void createCardPresentIntegrationTest() throws ApiException {
        finixClient= new FinixClient("USjHFGYvecE4LBitYG8KDE2g","b698f403-d9b7-4157-82d8-162cea8c8cc3", Environment.SANDBOX);
        String identityId="IDsbTBawhnLBAVeinRb84vFR";
        CreateMerchantUnderwritingRequest createMerchantUnderwritingRequest = CreateMerchantUnderwritingRequest.builder()
                .processor("VANTIV_V1")
                .gateway(CreateMerchantUnderwritingRequest.GatewayEnum.CLOUD_V1)
                .build();
        Merchant response= finixClient.Merchants.create(identityId, createMerchantUnderwritingRequest);
        System.out.println(response.toJson());
    }

    @Test
    @DisplayName("Card Present Integration - Step 3: Activate Device")
    void activateDeviceTest() throws ApiException{
        finixClient= new FinixClient("USjHFGYvecE4LBitYG8KDE2g","b698f403-d9b7-4157-82d8-162cea8c8cc3", Environment.SANDBOX);
        String deviceId="DVf2H8sh4LZZC52GTUrwCPPf";
        Object updateDevice = ("'{\"activation_code\": \"C887298\", \"action\":\"ACTIVATE\"}'");
        System.out.println(updateDevice);
        Device device = finixClient.Devices.update(deviceId,updateDevice);
    }

}
