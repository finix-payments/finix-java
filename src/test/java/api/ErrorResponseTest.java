package api;

import invoker.ApiException;
import invoker.Environment;
import invoker.FinixClient;
import model.*;
import org.junit.jupiter.api.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running ErrorResponseTest")
public class ErrorResponseTest {

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
     *
     *
     */
    @Test
    @DisplayName("401 error - Unauthorized error wrong password")
    public void wrongPasswordException()  {
        try {
            String userName = "USpumes23XhzHwXqiy9bfX2B";
            String wrongPassword = "123123";
            FinixClient invalidClient= new FinixClient(userName,wrongPassword, Environment.SANDBOX);
            String settlementId = "STmCc8GbjjX33SdymwNhb9Et";
            Long limit = 20L;
            FinixList<FeeProfile> feeProfilesList = invalidClient.FeeProfiles.list(ListFeeProfilesQueryParams.builder()
                    .limit(limit)
                    .build());
        } catch (Exception genericError) {
            if (genericError instanceof ApiException){
                ApiException e = (ApiException) genericError;
                assertEquals(401, e.getCode());
                ArrayList<HashMap<String, String>> errorBodyList = e.getBody();
                assertEquals(1, errorBodyList.size());
                assertEquals("Unauthorized", errorBodyList.get(0).get("message"));
            }

        }
    }

    @Test
    @DisplayName("401 error - Unauthorized error invalid username")
    public void invalidUsernameException()  {
        try {
            String wrongUsername = "123123";
            String password = "c69d39e3-f9ff-4735-8c3e-abca86441906";
            FinixClient invalidClient= new FinixClient(wrongUsername,password, Environment.SANDBOX);
            Long limit = 20L;
            FinixList<FeeProfile> feeProfilesList = invalidClient.FeeProfiles.list(ListFeeProfilesQueryParams.builder()
                    .limit(limit)
                    .build());
        } catch (Exception genericError) {
            if (genericError instanceof ApiException){
                ApiException e = (ApiException) genericError;
                assertEquals(401, e.getCode());
                ArrayList<HashMap<String, String>> errorBodyList = e.getBody();
                assertEquals(1, errorBodyList.size());
                assertEquals("Unauthorized", errorBodyList.get(0).get("message"));
            }
        }
    }

    @Test
    @DisplayName("404 error - Not found")
    public void notFoundException()  {
        try {
            String nextCursor = "FPoBFDWvqhCC9kmJoLUj92nB";
            FinixList<FeeProfile> feeProfilesList = finixClient.FeeProfiles.list(ListFeeProfilesQueryParams.builder()
                    .afterCursor(nextCursor)
                    .build());

        } catch (Exception genericError) {
            if (genericError instanceof ApiException){
                ApiException e = (ApiException) genericError;
                assertEquals(404, e.getCode());
                ArrayList<HashMap<String, String>> errorBodyList = e.getBody();
                assertEquals(1, errorBodyList.size());
                assertEquals("NOT_FOUND", errorBodyList.get(0).get("code"));
            }
        }
    }

    @Test
    @DisplayName("402 error - Refused/Declined payments -- declined authorization")
    public void declinedAuthorizationException()  {
        try {
            Map<String,String> localMap = new HashMap<>();
            localMap.put("card_name", "Business Card");
            CreatePaymentInstrumentRequest createPaymentInstrumentRequest =  CreatePaymentInstrumentRequest.builder()
                    .name("Amy White")
                    .expirationYear(2029l)
                    .tags(localMap)
                    .number("4000000000009979")
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
            String paymentInstrumentId = response.getId();
            CreateAuthorizationRequest createAuthorizationRequest = CreateAuthorizationRequest.builder()
                    .source(paymentInstrumentId)
                    .merchant("MUeDVrf2ahuKc9Eg5TeZugvs")
                    .currency(Currency.USD)
                    .amount(123L)
                    .build();
            Authorization authorization = finixClient.Authorizations.create(createAuthorizationRequest);
        } catch (ApiException e) {
            assertEquals(402, e.getCode());
            ArrayList<HashMap<String, String>> errorBodyList = e.getBody();
            assertTrue(errorBodyList.size() >= 0);
            assertEquals("DECLINED", errorBodyList.get(0).get("code"));
            assertTrue(errorBodyList.get(0).get("authorization") instanceof String);
        }
    }

    @Test
    @DisplayName("402 error - Refused/Declined payments -- payment declined")
    public void declinedPaymentException()  {
        try {
            Map<String,String> localMap = new HashMap<>();
            localMap.put("card_name", "Business Card");
            CreatePaymentInstrumentRequest createPaymentInstrumentRequest =  CreatePaymentInstrumentRequest.builder()
                    .name("Amy White")
                    .expirationYear(2029l)
                    .tags(localMap)
                    .number("4111111111111111")
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
            String paymentInstrumentId = response.getId();
            CreateAuthorizationRequest createAuthorizationRequest = CreateAuthorizationRequest.builder()
                    .source(paymentInstrumentId)
                    .merchant("MUeDVrf2ahuKc9Eg5TeZugvs")
                    .currency(Currency.USD)
                    .amount(123L)
                    .build();
            Authorization authorization = finixClient.Authorizations.create(createAuthorizationRequest);
            String authorizationId = authorization.getId();
            UpdateAuthorizationRequest updateAuthorizationRequest = UpdateAuthorizationRequest.builder()
                    .captureAmount(102L)
                    .build();
            AuthorizationCaptured updatedAuthorization = finixClient.Authorizations.update(authorizationId, updateAuthorizationRequest);
        } catch (ApiException e) {
            assertEquals(402, e.getCode());
            ArrayList<HashMap<String, String>> errorBodyList = e.getBody();
            assertTrue(errorBodyList.size() >= 0);
            assertEquals("PAYMENT_DECLINED", errorBodyList.get(0).get("code"));
            assertTrue(errorBodyList.get(0).get("transfer") instanceof String);
        }
    }

    @Test
    @DisplayName("422 error - Refused/Declined payments -- invalid field")
    public void invalidFieldException()  {
        try {
            CreateTransferRequest createTransferRequest =  CreateTransferRequest.builder()
                    .source("PIe2YvpcjvoVJ6PzoRPBK137")
                    .build();
            Transfer transfer = finixClient.Transfers.create(createTransferRequest);
            } catch (ApiException e) {
            assertEquals(422, e.getCode());
            ArrayList<HashMap<String, String>> errorBodyList = e.getBody();
            assertTrue(errorBodyList.size() >= 0);
            assertEquals("INVALID_FIELD", errorBodyList.get(0).get("code"));
        }
    }
}
