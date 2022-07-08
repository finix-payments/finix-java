package payloads;

import invoker.ApiException;
import invoker.Environment;
import invoker.FinixClient;
import model.CreateInstrumentUpdateRequest;
import model.DownloadInstrumentUpdateQueryParams;
import model.InstrumentUpdate;
import org.junit.jupiter.api.*;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Account Updater - Create an Account Updater Batch")
public class AccountUpdaterTest {
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
    @DisplayName("Account Updater - Create an Account Updater Batch")
    public void createInstrumentUpdateTest() throws ApiException {
       File file = new File("finix_file.png");
        InstrumentUpdate instrumentupdate = finixClient.InstrumentUpdates.create(CreateInstrumentUpdateRequest.builder()
                ._file(file)
                .request("{\"merchant\":\"MUucec6fHeaWo3VHYoSkUySM\"}")
                .build());
       // , "idempotency_id":"123xyz"
        assertEquals("MUucec6fHeaWo3VHYoSkUySM",instrumentupdate.getMerchant(),()->" Should return " + "MUucec6fHeaWo3VHYoSkUySM" + " but returns " + instrumentupdate.getMerchant());
    }

    @Test
    @DisplayName("Account Updater - Fetch an Account Updater Batch")
    void fetchAccountUpdaterBatchTest() throws ApiException {
        String instrumentUpdatesId="IUd2Wzs6jxPJjteva3n19Amu";
        DownloadInstrumentUpdateQueryParams downloadInstrumentUpdateQueryParams = DownloadInstrumentUpdateQueryParams.builder()
                .build();
        File response = finixClient.InstrumentUpdates.download(instrumentUpdatesId,downloadInstrumentUpdateQueryParams);
        System.out.println(response);
    }

}
