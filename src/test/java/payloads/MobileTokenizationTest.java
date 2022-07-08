package payloads;

import invoker.ApiException;
import invoker.Environment;
import invoker.FinixClient;
import model.CreateMerchantUnderwritingRequest;
import model.Merchant;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.MethodName.class)
@DisplayName("When Running MobileTokenizationTest")
public class MobileTokenizationTest {
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
        finixClient= new FinixClient("USjHFGYvecE4LBitYG8KDE2g","b698f403-d9b7-4157-82d8-162cea8c8cc3", Environment.SANDBOX);
        assertEquals(true , finixClient!=null);

    }

    @Test
    public void createCardPresentIntegrationTest() throws ApiException {
        String identityId="IDsbTBawhnLBAVeinRb84vFR";
        CreateMerchantUnderwritingRequest createMerchantUnderwritingRequest = CreateMerchantUnderwritingRequest.builder()
                .processor("VANTIV_V1")
                .gateway(CreateMerchantUnderwritingRequest.GatewayEnum.CLOUD_V1)
                .build();
        Merchant response= finixClient.Merchants.create(identityId, createMerchantUnderwritingRequest);
        System.out.println(response.toJson());
    }

}
