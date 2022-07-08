package payloads;

import invoker.ApiException;
import invoker.Environment;
import invoker.FinixClient;
import model.CreatePaymentInstrumentRequest;
import model.PaymentInstrument;
import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.MethodName.class)
@DisplayName("When Running GettingStartedTest")
public class TokenizationWithHostedFieldsTest {
    private FinixClient finixClient;
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
    @Order(1)
    @DisplayName("Getting Started - Step 5: Tokenize a Card")
    public void createTokenizeCardTest() throws ApiException {
       Map<String,String> localMap = new HashMap<>();
        localMap.put("card_name", "Business Card");
        CreatePaymentInstrumentRequest createPaymentInstrumentRequest =  CreatePaymentInstrumentRequest.builder()
                .token("TKiMxe323RE5Dq3wLVtG8kSW")
                .type(CreatePaymentInstrumentRequest.TypeEnum.TOKEN)
                .identity("IDpYDM7J9n57q849o9E9yNrG")
                .build();
       PaymentInstrument response = finixClient.PaymentInstruments.create(createPaymentInstrumentRequest);
        //assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());


    }

}
