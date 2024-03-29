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
 * API tests for AuthorizationsApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running AuthorizationsApi")
public class AuthorizationsApiTest {
    public String AuthorizationId;
    private TestInfo testInfo;
    private TestReporter testReporter;
    private FinixClient finixClient;
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
    /**
     * Create an Authorization
     *
     * Create an &#x60;Authorization&#x60; to process a transaction.  &#x60;Authorizations&#x60; can have two possible &#x60;states&#x60;:  - **SUCCEEDED**  - **FAILED**  If the &#x60;Authorization&#x60; has **SUCCEEDED** , it must be captured before &#x60;expires_at&#x60; passes or the funds will be released.  Learn how to prevent duplicate authorizations by passing an [Idempotency ID](#section/Idempotency-Requests) in the payload.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @AfterEach
    @DisplayName("Create an authorization")
    public void createAuthorizationTest() throws ApiException {
        Map<String, String> localMap = new HashMap<>();
        localMap.put("order_number", "21DFASJSAKAS");
        CreateAuthorizationRequest createAuthorizationRequest = CreateAuthorizationRequest.builder()
                .source("PIe2YvpcjvoVJ6PzoRPBK137")
                .merchant("MUeDVrf2ahuKc9Eg5TeZugvs")
                .tags(localMap)
                .currency(Currency.USD)
                .amount(100L)
                .build();
        Authorization response = finixClient.Authorizations.create(createAuthorizationRequest);
        AuthorizationId = response.getId();
        assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
        assertEquals(createAuthorizationRequest.getSource(), response.getSource());
        assertEquals(createAuthorizationRequest.getAmount(), response.getAmount());
        assertEquals(Authorization.StateEnum.SUCCEEDED, response.getState());
    }

    /**
     * Create an Authorization with 3D Secure
     */
    @Test
    @DisplayName("Create an Authorization with 3D Secure")
    public void create3DSecureAuthorizationTest() throws ApiException {
        Map<String, String> localMap = new HashMap<>();
        localMap.put("order_number", "21DFASJSAKAS");
        CreateAuthorizationRequest createAuthorizationRequest = CreateAuthorizationRequest.builder()
                .merchant("MUeDVrf2ahuKc9Eg5TeZugvs")
                ._3dSecureAuthentication(CreateAuthorizationRequest3dSecureAuthentication.builder()
                        .electronicCommerceIndicator("AUTHENTICATED")
                        .cardholderAuthentication("BwABBJQ1AgAAAAAgJDUCAAAAAAA=")
                        .transactionId("EaOMucALHQqLAEGAgk")
                        .build())
                .source("PIe2YvpcjvoVJ6PzoRPBK137")
                .tags(localMap)
                .currency(Currency.USD)
                .amount(100L)
                .build();
        Authorization response = finixClient.Authorizations.create(createAuthorizationRequest);
        assertEquals(createAuthorizationRequest.getSource(),response.getSource(),()->"Should return " + "PIe2YvpcjvoVJ6PzoRPBK137" + " but returns " + response.getSource());
        assertEquals(createAuthorizationRequest.getAmount(), response.getAmount());
        assertEquals(Authorization.StateEnum.SUCCEEDED, response.getState());
    }

    /**
     * Create an Authorization with Level 2 Processing
     */
    @Test
    @DisplayName("Create an Authorization with Level 2 Processing")
    public void create2DAuthorizationTest() throws ApiException {
        Map<String, String> localMap = new HashMap<>();
        localMap.put("order_number", "21DFASJSAKAS");
        CreateAuthorizationRequest createAuthorizationRequest = CreateAuthorizationRequest.builder()
                .merchant("MUeDVrf2ahuKc9Eg5TeZugvs")
                .source("PIe2YvpcjvoVJ6PzoRPBK137")
                .additionalPurchaseData(AdditionalPurchaseData.builder()
                        .customerReferenceNumber("321xyz")
                        .salesTax(200l)
                        .build())
                .tags(localMap)
                .currency(Currency.USD)
                .amount(1000L)
                .build();
        Authorization response = finixClient.Authorizations.create(createAuthorizationRequest);
        assertEquals("PIe2YvpcjvoVJ6PzoRPBK137",response.getSource(),()->"Should return " + "PIe2YvpcjvoVJ6PzoRPBK137" + " but returns " + response.getSource());
        assertEquals(createAuthorizationRequest.getAmount(), response.getAmount());
        assertEquals(Authorization.StateEnum.SUCCEEDED, response.getState());
    }
    /**
     * Create an Authorization with Level 3 Processing
     */
    @Test
    @DisplayName("Create an Authorization with Level 3 Processing")
    public void create3DProcessingAuthorizationTest() throws ApiException {
        Map<String, String> localMap = new HashMap<>();
        localMap.put("order_number", "21DFASJSAKAS");
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
        CreateAuthorizationRequest createAuthorizationRequest = CreateAuthorizationRequest.builder()
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
                .amount(1000L)
                .build();
        Authorization response = finixClient.Authorizations.create(createAuthorizationRequest);
        assertEquals("PIe2YvpcjvoVJ6PzoRPBK137",response.getSource(),()->"Should return " + "PIe2YvpcjvoVJ6PzoRPBK137" + " but returns " + response.getSource());
        assertEquals(createAuthorizationRequest.getAmount(), response.getAmount());
        assertEquals(Authorization.StateEnum.SUCCEEDED, response.getState());
    }
    /**
     * Get an Authorization
     *
     * Retrieve the details of a previously created &#x60;Authorization&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Get an Authorization")
    public void getAuthorizationTest() throws ApiException {
        String authorizationId = "AU9j85tCcnJ7DvkFjNtmZ7g1";
        Authorization response = finixClient.Authorizations.get(authorizationId);
        assertEquals("PIe2YvpcjvoVJ6PzoRPBK137",response.getSource(),()->"Should return " + "PIe2YvpcjvoVJ6PzoRPBK137" + " but returns " + response.getSource());
        assertEquals(authorizationId, response.getId());
    }

    /**
     * List Authorizations
     *
     * Retrieve a list of &#x60;Authorizations&#x60;. 
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("List Authorizations")
    public void listAuthorizationsTest() throws ApiException{
        String sort = null;
        String beforeCursor = null;
        Long limit = null;
        String idempotencyId = null;
        String state = null;
        String createdAtGte = null;
        String createdAtLte = null;
        String updatedAtGte = null;
        String updatedAtLte = null;
        String isVoid = null;
        Long amount = null;
        Long amountLt = null;
        Long amountGt = null;
        Long amountLte = null;
        Long amountGte = null;
        String traceId = null;
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
        String afterCursor = null;

        FinixList<Authorization> authorizationList = finixClient.Authorizations.list(ListAuthorizationsQueryParams.builder()
                .sort(sort)
                .beforeCursor(beforeCursor)
                .limit(limit)
                .idempotencyId(idempotencyId)
                .state(state)
                .createdAtGte(createdAtGte)
                .createdAtLte(createdAtLte)
                .updatedAtGte(updatedAtGte)
                .updatedAtLte(updatedAtLte)
                .isVoid(isVoid)
                .amount(amount)
                .amountLt(amountLt)
                .amountGt(amountGt)
                .amountLte(amountLte)
                .amountGte(amountGte)
                .traceId(traceId)
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
                .afterCursor(afterCursor)
                .build());
        assertTrue(authorizationList.size() >= 0);
        if (authorizationList.size() == 0){
                assertEquals(false, authorizationList.getHasMore());
        }
        if (authorizationList.getHasMore() == true){
            FinixList<Authorization> nextList = authorizationList.listNext(1);
            assertTrue( nextList != null);
            assertEquals(1, nextList.size());
        }
  }

    /**
     * Update an Authorization
     *
     * If successful, the transfer field of the &#x60;Authorization&#x60; will contain the ID of the &#x60;Transfer&#x60; resource that&#39;ll move funds.   By default, &#x60;Transfers&#x60; are in a **PENDING** state. The **PENDING** state means the system hasn&#39;t submitted the request to capture funds. Capture requests get submitted via batch request.   Once the &#x60;Authorization&#x60; is updated with a &#x60;capture_amount&#x60; (i.e. *Captured*), the state of the &#x60;Transfer&#x60; will update to **SUCCEEDED**.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Capture an Authorization")
    public void putAuthorizationTest() throws ApiException {
        String authorizationId = AuthorizationId;
        UpdateAuthorizationRequest updateAuthorizationRequest = UpdateAuthorizationRequest.builder()
                .fee(Long.valueOf(0))
                .captureAmount(100L)
                .build();
        AuthorizationCaptured response = finixClient.Authorizations.update(authorizationId, updateAuthorizationRequest);
        assertEquals("PIe2YvpcjvoVJ6PzoRPBK137",response.getSource(),()->"Should return " + "PIe2YvpcjvoVJ6PzoRPBK137" + " but returns " + response.getSource());
        assertEquals(updateAuthorizationRequest.getCaptureAmount(), response.getAmount());
    }
    /**
     * Void an Authorization
     */
    @Test
    @DisplayName("Void an Authorization")
    public void putVoidAuthorization() throws ApiException{
        String id = AuthorizationId;
        UpdateAuthorizationRequest updateAuthorizationRequest = UpdateAuthorizationRequest.builder()
                .voidMe(true)
                .build();
        AuthorizationCaptured response = finixClient.Authorizations.update(id, updateAuthorizationRequest);
        assertEquals("PIe2YvpcjvoVJ6PzoRPBK137",response.getSource(),()->"Should return " + "PIe2YvpcjvoVJ6PzoRPBK137" + " but returns " + response.getSource());
        assertEquals("PENDING", response.getVoidState());
    }
    /**
     * Capture an Authorization with Level 2/Level 3 Processing
     */
    @Test
    @DisplayName("Capture an Authorization with Level 2/Level 3 Processing")
    public void CaptureAuthorizationTest() throws ApiException{
        String id = AuthorizationId;
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
        UpdateAuthorizationRequest updateAuthorizationRequest = UpdateAuthorizationRequest.builder().build().builder()
                .additionalPurchaseData(AdditionalPurchaseData.builder()
                        .itemData(additionalPurchaseDataItemDataList)
                        .discountAmount(100l)
                        .customerReferenceNumber("321xyz")
                        .shippingAmount(100l)
                        .customsDutyAmount(10l)
                        .build())
                .fee(0L)
                .captureAmount(100L)
                .build();
        AuthorizationCaptured response = finixClient.Authorizations.update(id, updateAuthorizationRequest);
        assertEquals("PIe2YvpcjvoVJ6PzoRPBK137",response.getSource(),()->"Should return " + "PIe2YvpcjvoVJ6PzoRPBK137" + " but returns " + response.getSource());
        assertEquals(id, response.getId());
    }

}
