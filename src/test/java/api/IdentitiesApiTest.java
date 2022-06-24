/*
 * Finix API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2022-02-01
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

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * API tests for IdentitiesApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running IdentitiesApi")
public class IdentitiesApiTest {
    private FinixClient finixClient;
    private String identity;
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
    void contextLoads() {
        finixClient= new FinixClient("USsRhsHYZGBPnQw8CByJyEQW","8a14c2f9-d94b-4c72-8f5c-a62908e5b30e", Environment.SANDBOX);
        assertEquals(true , finixClient!=null);

    }
    /**
     * Create an Associated Identity
     *
     * Create an associated &#x60;Identity&#x60; for [every owner with 25% or more ownership](/guides/onboarding/#step-3-add-associated-identities) over the merchant.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Create an Associated Identity")
    public void createAssociatedIdentityTest() throws ApiException {
        String identityId = "IDpYDM7J9n57q849o9E9yNrG";
        CreateIdentityRequest createIdentityRequest = CreateIdentityRequest.builder()
                .entity(CreateIdentityRequestEntity.builder()
                        .build())
                .build();
        Identity response = finixClient.Identities.createAssociatedIdentity(identityId, createIdentityRequest);
        assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
    }
    /**
     * Create an Identity for a Buyer
     */
    @Test
    @DisplayName("Create an Identity for a Buyer")
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
        assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
    }
    /**
     * Create an Identity
     *
     * Create an &#x60;Identity&#x60; for your merchant or buyer.  Creating &#x60;Identities&#x60; for merchants requires [providing their KYC details](/guides/getting-started/#step-1-create-an-identity-for-a-merchant).  Related Guides: [Getting Started](/guides/getting-started/#step-1-create-an-identity-for-a-merchant), [Onboarding](/guides/onboarding/)
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @BeforeAll
    @DisplayName("Create an Identity for a Merchant")
    public void createIdentityTest() throws ApiException {
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
        identity = response.getId();
        assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
    }
    /**
     * Create a Bank Account
     */
    @Test
    @DisplayName("Create a Bank Account")
    @BeforeEach
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
                .identity(identity)
                .build();
        PaymentInstrument response =  finixClient.PaymentInstruments.create(createPaymentInstrumentRequest);
        assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
    }

    /**
     * Fetch an Identity
     *
     * Retrieve the details of a previously created &#x60;Identity&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Fetch an Identity")
    public void getIdentityTest() throws ApiException {
        String identityId = "IDpYDM7J9n57q849o9E9yNrG";
        Identity response = finixClient.Identities.get(identityId);
        assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
    }


    /**
     * List Identities
     *
     * Retrieves a list of &#x60;Identities&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("List Identities")
    public void listIdentitiesTest() throws ApiException {
        String sort = null;
        String afterCursor = null;
        Long limit = null;
        String id = null;
        String createdAtGte = null;
        String createdAtLte = null;
        String defaultStatementDescriptor = null;
        String businessName = null;
        String businessType = null;
        String email = null;
        String firstName = null;
        String lastName = null;
        String title = null;
        String beforeCursor = null;

        IdentitiesList response = finixClient.Identities.list(ListIdentitiesQueryParams.builder()
                .sort(sort)
                .afterCursor(afterCursor)
                .limit(limit)
                .id(id)
                .createdAtGte(createdAtGte)
                .createdAtLte(createdAtLte)
                .defaultStatementDescriptor(defaultStatementDescriptor)
                .businessName(businessName)
                .businessType(businessType)
                .email(email)
                .firstName(firstName)
                .lastName(lastName)
                .title(title)
                .beforeCursor(beforeCursor)
                .build());
        assertEquals("20",response.getPage().getLimit().toString(),()->" Should return " + "20" + " but returns " + response.getPage().getLimit());

    }

    /**
     * List Associated Identities
     *
     * Retrieve a list of &#x60;Associated Identities&#x60; for an &#x60;Identity&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("List Associated Identities")
    public void listIdentityAssociatedIdentitiesTest() throws ApiException {
        String identityId = "IDpYDM7J9n57q849o9E9yNrG";

        IdentitiesList response = finixClient.Identities.listAssocaiatedIdentities(identityId, ListIdentityAssociatedIdentitiesQueryParams.builder().build());
        Integer count = response.getEmbedded().getIdentities().size();
        assertTrue(count >= 1, "Should have 1 or more identities returned");
    }

    /**
     * Update an Identity
     *
     * Update an existing &#x60;Identity&#x60;.  If you are updating the &#x60;Identity&#x60; of a &#x60;Merchant&#x60; that’s already been onboarded, you need to [verify the merchant again](#operation/createMerchantVerification).
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Update an Identity")
    public void putIdentityTest() throws ApiException {
        Map<String,String> localMap = new HashMap<>();
        localMap.put("key", "value_2");
        String identityId = "IDpYDM7J9n57q849o9E9yNrG";
        UpdateIdentityRequest updateIdentityRequest = UpdateIdentityRequest.builder()
                .tags(localMap)
                .entity(UpdateIdentityRequestEntity.builder()
                        .businessPhone("+1 (408) 756-4497")
                        .firstName("Bernard")
                        .lastName("Jones")
                        .title("CTO")
                        .dob(UpdateIdentityRequestEntityDob.builder()
                                .year(1998l)
                                .day(2l)
                                .month(5l)
                                .build())
                        .ownershipType("PRIVATE")
                        .hasAcceptedCreditCardsPreviously(true)
                        .mcc("0742")
                        .phone("7144177878")
                        .businessTaxId("123456789")
                        .maxTransactionAmount(1200000l)
                        .principalPercentageOwnership(50l)
                        .doingBusinessAs("Bobs Burgers")
                        .annualCardVolume(12000000l)
                        .defaultStatementDescriptor("Bobs Burgers")
                        .url("www.BobsBurgers.com")
                        .businessName("Bobs Burgers")
                        .personalAddress(CreateIdentityRequestEntityPersonalAddress.builder()
                                .city("San Mateo")
                                .country("USA")
                                .region("CA")
                                .line2("Apartment 7")
                                .line1("741 Douglass St")
                                .postalCode("94114")
                                .build())
                        .email("user@example.org")
                        .taxId("999999999")
                        .build())
                .build();
        Identity response = finixClient.Identities.update(identityId, updateIdentityRequest);
        assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
    }
    /**
     * Provision a Merchant
     */
    @Test
    @DisplayName("Provision a Merchant")
    public void createIdentityMerchantTest() throws ApiException {
        Map<String,String> localMap = new HashMap<>();
        localMap.put("key", "value_2");
        String identityId = identity;
        CreateMerchantUnderwritingRequest createMerchantUnderwritingRequest = CreateMerchantUnderwritingRequest.builder()
                .processor("DUMMY_V1")
                .tags(localMap)
                .build();
        Merchant response = finixClient.Merchants.create(identityId, createMerchantUnderwritingRequest);
        merchantId = response.getId();
        assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
    }


    /**
     * Verify an Identity
     * @throws ApiException
     */
    @Test
    @AfterAll
    @DisplayName("Verify an Identity")
    public void createIdentityVerificationTest() throws ApiException {
        String identityId = identity;
        CreateVerificationRequest verificationForm = CreateVerificationRequest.builder()
                .processor("DUMMY_V1").build();
        Verification response = finixClient.Identities.createIdentityVerification(identityId, verificationForm);
        assertEquals(identityId, response.getIdentity(), ()->"Should return " +identityId + " but returns "+ response.getIdentity());
    }

    /**
     * Verify a Merchant
     *
     * Verify a merchant either to reattempt provisioning, or when the merchant&#39;s &#x60;Identity&#x60; was updated.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Verify a Merchant")
    @AfterAll
    public void createMerchantVerificationTest() throws ApiException {
//        String merchantId = "MUucec6fHeaWo3VHYoSkUySM";
        CreateVerificationRequest verificationForm = CreateVerificationRequest.builder().build();
        Verification response = finixClient.Merchants.createMerchantVerification(merchantId, verificationForm);

        assertEquals(merchantId, response.getMerchant(), ()->"Should return " +merchantId + " but returns "+ response.getMerchant());
    }

}
