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
@DisplayName("When Running MobileTokenizationTest")
public class CardPresentIntegrationTest {
    private FinixClient finixClient;
    private TestInfo testInfo;
    private TestReporter testReporter;
    private String deviceId;
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
        finixClient= new FinixClient("USjHFGYvecE4LBitYG8KDE2g","b698f403-d9b7-4157-82d8-162cea8c8cc3", Environment.SANDBOX);
        assertEquals(true , finixClient!=null);
    }
    @Test
    @BeforeEach
    @DisplayName("Card Present Integration - Step 2: Create Device")
    void createDeviceTest() throws ApiException {
        String merchantId= "MUu56ZGx3Xb6U9gAqKfgNisd";
        CreateDevice createDevice = CreateDevice.builder()
                .name("Finix  triPOS #1")
                .model(CreateDevice.ModelEnum.MX915)
                .description("Mike Jones")
                ._configuration(ConfigurationDetails.builder()
                        .allowDebit(true)
                        .promptSignature("NEVER")
                        .bypassDeviceOnCapture(true)
                        .build())
                .build();
        Device response = finixClient.Devices.create(merchantId, createDevice);
        deviceId= response.getId();
        assertEquals(merchantId,response.getMerchant(),()->" Should return " + merchantId + " but returns " + response.getMerchant());
    }
    @Test
    @DisplayName("Card Present Integration - Step 3: Activate Device")
    void activateDeviceTest() throws ApiException{
        String deviceId="DVf2H8sh4LZZC52GTUrwCPPf";
        Object updateDevice = "{\"activation_code\": \"C887298\", action : ACTIVATE }";
        Device device = finixClient.Devices.update(deviceId,updateDevice);
    }
    @Test
    @DisplayName("Card Present Integration - Step 4: Authorization with EMV card")
    void createAuthorizationEMVCardTest() throws ApiException {
        Map<String, String> localMap = new HashMap<>();
        localMap.put("order_number", "chris123transfer");
        System.out.println(deviceId);
        CreateAuthorizationRequest createAuthorizationRequest = CreateAuthorizationRequest.builder()
                .device("DVf2H8sh4LZZC52GTUrwCPPf")
                //.device(deviceId)
                .tags(localMap)
                .currency(Currency.USD)
                .amount(150l)
                .operationKey(OperationKey.CARD_PRESENT_AUTHORIZATION)
                .build();
        Authorization response = finixClient.Authorizations.create(createAuthorizationRequest);
    }
    @Test
    @DisplayName("Card Present Integration - Step 5: Capture Authorization")
    void captureAuthorizationTest() throws ApiException {
        String authorizationId ="AUuCfRve8QG6G1wnPCReiLma";
        UpdateAuthorizationRequest updateAuthorizationRequest= UpdateAuthorizationRequest.builder()
                .captureAmount(150l)
                .build();
        Authorization response = finixClient.Authorizations.update(authorizationId,updateAuthorizationRequest);
    }

}
