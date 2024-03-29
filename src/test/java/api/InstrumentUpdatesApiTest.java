/*
 * Finix API
 */


package api;

import invoker.ApiException;
import invoker.Environment;
import invoker.FinixClient;
import model.*;
import org.junit.jupiter.api.*;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * API tests for InstrumentUpdatesApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class InstrumentUpdatesApiTest {
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
     * Download Instrument Updates
     *
     * Fetch a previously created &#x60;instrument_updates&#x60; resource as a CSV.   To fetch the &#x60;instrument_updates&#x60; resource in JSON, add &#x60;?format&#x3D;json&#x60; to the request endpoint.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Download Instrument Updates")
    public void downloadInstrumentUpdatesTest() throws ApiException {
        String format = null;
        String instrumentUpdateId = "IUp9oSWhWUF31DPrJ8CojQeQ";
        File response = finixClient.InstrumentUpdates.download(instrumentUpdateId, DownloadInstrumentUpdateQueryParams.builder().build());
        int size = response.getName().length();
        assertTrue(response.length()> 0,()->" Should return a file with content length more than 0 but returns " + response.length());
    }

    /**
     * Fetch an Instrument Update
     *
     * Fetch a specific &#x60;instrument_update&#x60; from an &#x60;instrument_updates&#x60; resource. For more information, see the guide on using our [Account Updater](/guides/payments/account-updater).
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Fetch an Instrument Update")
    public void getInstrumentUpdatesTest() throws ApiException {
        String instrumentUpdatesId = "IUp9oSWhWUF31DPrJ8CojQeQ";
        InstrumentUpdate update = finixClient.InstrumentUpdates.get(instrumentUpdatesId);
        assertEquals(instrumentUpdatesId, update.getId(), "Should return " + instrumentUpdatesId + " but returns " + update.getId());
    }

    /**
     * Create an instrument update
     */
    @Test
    @DisplayName("Create an instrument update")
    public void createInstrumentUpdateTest() throws ApiException {
        String instrumentUpdatesId = "IUp9oSWhWUF31DPrJ8CojQeQ";
        File file = new File("finix_file.png");
        InstrumentUpdate instrumentupdate = finixClient.InstrumentUpdates.create(CreateInstrumentUpdateRequest.builder()
                ._file(file)
                .request("{\"merchant\":\"MUucec6fHeaWo3VHYoSkUySM\"}")
                .build());
        assertEquals("MUucec6fHeaWo3VHYoSkUySM",instrumentupdate.getMerchant(),()->" Should return " + "MUucec6fHeaWo3VHYoSkUySM" + " but returns " + instrumentupdate.getMerchant());
    }
}