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
@DisplayName("OnboardingTest")
public class OnboardingTest {
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
    void contextLoads() {
        finixClient= new FinixClient("USsRhsHYZGBPnQw8CByJyEQW","8a14c2f9-d94b-4c72-8f5c-a62908e5b30e", Environment.SANDBOX);
        assertEquals(true , finixClient!=null);
    }
    @Test
    @DisplayName("Onboarding - Step 2: Create a Merchant Identity")
    @BeforeAll
    @Order(1)
    void createMerchantIdentityTest() throws ApiException {
        Map<String,String> localMap = new HashMap<>();
        localMap.put("Studio Rating", "4.7");
        CreateIdentityRequest createIdentityRequest = CreateIdentityRequest.builder()
                .additionalUnderwritingData(CreateIdentityRequestAdditionalUnderwritingData.builder()
                        .merchantAgreementAccepted(true)
                        .merchantAgreementIpAddress("42.1.1.113")
                        .volumeDistributionByBusinessType(CreateIdentityRequestAdditionalUnderwritingDataVolumeDistributionByBusinessType.builder()
                                .otherVolumePercentage(0l)
                                .consumerToConsumerVolumePercentage(0l)
                                .businessToConsumerVolumePercentage(0l)
                                .businessToBusinessVolumePercentage(100l)
                                .personToPersonVolumePercentage(0l)
                                .build())
                        .averageAchTransferAmount(200000l)
                        .annualAchVolume(200000l)
                        .creditCheckUserAgent("Mozilla 5.0(Macintosh; IntelMac OS X 10 _14_6)")
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
                                .line2("Apartment 7")
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
                                .line2("Apartment 8")
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
                        .businessName("Petes Coffee")
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
        localIdentityId = response.getId();
        assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
    }
    @Test
    @DisplayName("Onboarding - Step 3: Add Associated Identities")
    @Order(2)
    void addAssociatedIdentitiesTest() throws ApiException {
        String identityId ="IDgXNAaoy5d4TLkp5ze6gScA";
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
        assertEquals("APcVnXxyWotD6TGRWV2bRWuD",response.getApplication(),()->" Should return " + "APcVnXxyWotD6TGRWV2bRWuD" + " but returns " + response.getApplication());
    }
    @Test
    @DisplayName("Onboarding - Step 4: Add a bank account")
    @Order(3)
    @AfterEach
    void addBankAccountTest() throws ApiException {
        Map<String,String > localMap = new HashMap<>();
        localMap.put("Bank Account", "Company Account");
        CreatePaymentInstrumentRequest createPaymentInstrumentRequest = CreatePaymentInstrumentRequest.builder()
                .accountType(CreatePaymentInstrumentRequest.AccountTypeEnum.SAVINGS)
                .name("Alice")
                .tags(localMap)
                .country("USA")
                .bankCode("123123123")
                .accountNumber("123123123")
                .type(CreatePaymentInstrumentRequest.TypeEnum.BANK_ACCOUNT)
                .identity(localIdentityId)
                .build();
        PaymentInstrument response= finixClient.PaymentInstruments.create(createPaymentInstrumentRequest);
        localIdentityId=response.getIdentity();
    }
    @Test
    @DisplayName("Onboarding - Step 5: Verify the User")
   @Order(4)
    @AfterAll
    void verifyUserTest() throws ApiException{
        String identityId=localIdentityId;
        Map<String,String> localMap= new HashMap<>();
        localMap.put("key_2", "value_2");
        CreateMerchantUnderwritingRequest createMerchantUnderwritingRequest = CreateMerchantUnderwritingRequest.builder()
                .processor("DUMMY_V1")
                .tags(localMap)
                .build();
        Merchant response = finixClient.Merchants.create(identityId,createMerchantUnderwritingRequest);
    }
}
