package payloads;

import invoker.ApiException;
import invoker.Environment;
import invoker.FinixClient;
import model.CreateTransferRequest;
import model.Currency;
import model.Transfer;
import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("CardVerificationChecksTest")
public class CardVerificationChecksTest {
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

    @Test
    @DisplayName("Fraud Detection - Step 4: Send Session ID in Payment - 4a. Create a Sale with Fraud Detection")
    void createSaleWithFraudDetection4aTest() throws ApiException {
        Map<String, String> localMap = new HashMap<>();
        localMap.put("test", "sale");
        CreateTransferRequest createTransferRequest = CreateTransferRequest.builder()
                .merchant("MUeDVrf2ahuKc9Eg5TeZugvs")
                .currency(Currency.USD)
                .amount(100l)
                .source("PIe2YvpcjvoVJ6PzoRPBK137")
                .tags(localMap)
                .fraudSessionId("adasdaxafckasd")
                .build();
        Transfer response = finixClient.Transfers.create(createTransferRequest);
        assertEquals("APgPDQrLD52TYvqazjHJJchM", response.getApplication(), ()-> " Should return " +"APgPDQrLD52TYvqazjHJJchM " +"but returns" + response.getApplication());
    }

    @Test
    @DisplayName("Fraud Detection - Step 4: Send Session ID in Payment - 4b. Create an Authorization with Fraud Detection")
    void createSaleWithFraudDetection4bTest() throws ApiException {
        Map<String, String> localMap = new HashMap<>();
        localMap.put("test", "sale");
        CreateTransferRequest createTransferRequest = CreateTransferRequest.builder()
                .merchant("MUeDVrf2ahuKc9Eg5TeZugvs")
                .currency(Currency.USD)
                .amount(100l)
                .source("PIe2YvpcjvoVJ6PzoRPBK137")
                .tags(localMap)
                .fraudSessionId("adasdaxafckasd")
                .build();
        Transfer response = finixClient.Transfers.create(createTransferRequest);
        assertEquals("APgPDQrLD52TYvqazjHJJchM", response.getApplication(), ()-> " Should return " +"APgPDQrLD52TYvqazjHJJchM " +"but returns" + response.getApplication());
    }

}
