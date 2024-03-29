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
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * API tests for DisputesApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running DevicesApiTest")
public class DisputesApiTest {
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
    }  /**
     * Create Dispute Evidence
     *
     * Upload dispute evidence for a &#x60;Dispute&#x60;.  There are four available values that indicate the state of the evidence upload:  * **PENDING**: The evidence file has not yet been submitted to the &#x60;Processor&#x60;. No user action is required. * **SUCCEEDED**: The evidence file has been successfully sent to the &#x60;Processor&#x60;. No further user action is required. * **CANCELED**: The evidence file upload was not completed due to user action. * **FAILED**: An issue occurred. User action is required. Any of the following issues could have occurred:     * There was an error in the system and the user should retry uploading their evidence file.     * There is an issue with the file and the user should retry uploading a different file.     * There is an issue and the user should contact Support. 
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Upload Dispute Evidence")
    public void createDisputeEvidenceTest() throws ApiException {
        String disputeId = "DIs7yQRkHDdMYhurzYz72SFk";
       CreateDisputeEvidenceRequest createDisputeEvidenceRequest = CreateDisputeEvidenceRequest.builder()
                ._file(new File("finix_file.png"))
                .build();
        DisputeEvidence response = finixClient.Disputes.createDisputeEvidence(disputeId, createDisputeEvidenceRequest);
        assertEquals("DIs7yQRkHDdMYhurzYz72SFk",response.getDispute(),()->" Should return " + "DIs7yQRkHDdMYhurzYz72SFk" + " but returns " + response.getDispute());
    }

    /**
     * Get Dispute
     *
     * Retrieve the details of a previously created &#x60;Dispute&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Fetch a Dispute")
    public void getDisputeTest() throws ApiException {
        String disputeId = "DIs7yQRkHDdMYhurzYz72SFk";
        Dispute response = finixClient.Disputes.get(disputeId);
        assertEquals("DIs7yQRkHDdMYhurzYz72SFk",response.getId(),()->" Should return " + "DIs7yQRkHDdMYhurzYz72SFk" + " but returns " + response.getId());
        assertEquals(888888L, response.getAmount());
    }

    /**
     * Fetch Dispute Evidence File
     *
     * Retrieve the details of a &#x60;Dispute&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Fetch Dispute Evidence File")
    public void getDisputeEvidenceTest() throws ApiException {
        String disputeId = "DIs7yQRkHDdMYhurzYz72SFk";
        String evidenceId = "DFnA9eVoYxRnxxLKzgcGGxYL";
        DisputeEvidence response = finixClient.Disputes.getDisputeEvidence(disputeId, evidenceId);
        assertEquals(evidenceId,response.getId(),()->" Should return " + "DFnA9eVoYxRnxxLKzgcGGxYL" + " but returns " + response.getId());
        assertEquals(disputeId, response.getDispute());
    }


    /**
     * List Dispute Evidence
     *
     * Retrieve a list of dispute evidence for a &#x60;Dispute&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("List Dispute Evidence")
    public void listDisputeEvidenceTest() throws ApiException{
        String disputeId = "DIs7yQRkHDdMYhurzYz72SFk";
        Long limit = 20L;
        FinixList<DisputeEvidence> disputeEvidencesList = finixClient.Disputes.listDisputeEvidenceByDisputeId(disputeId, ListDisputeEvidenceQueryParams.builder()
                .limit(limit)
                .build());
        assertTrue(disputeEvidencesList.size() >= 0);
        if (disputeEvidencesList.size() == 0){
            assertEquals(false, disputeEvidencesList.getHasMore());
        }
        if (disputeEvidencesList.getHasMore() == true){
            FinixList<DisputeEvidence> nextList = disputeEvidencesList.listNext(1);
            assertTrue( nextList != null);
            assertEquals(1, nextList.size());
        }
    }

    /**
     * List Disputes
     *
     * Retrieve a list of &#x60;Disputes&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("List All Disputes")
    public void listDisputesTest() throws ApiException{
        String sort = null;
        Long offset = null;
        Long limit = null;
        String createdAtGte = null;
        String createdAtLte = null;
        String updatedAtGte = null;
        String updatedAtLte = null;

        FinixList<Dispute> disputesList = finixClient.Disputes.list(ListDisputesQueryParams.builder()
                .sort(sort)
                .offset(offset)
                .limit(limit)
                .createdAtGte(createdAtGte)
                .createdAtLte(createdAtLte)
                .updatedAtGte(updatedAtGte)
                .updatedAtLte(updatedAtLte)
                .build());
        assertTrue(disputesList.size() >= 0);
        if (disputesList.size() == 0){
            assertEquals(false, disputesList.getHasMore());
        }
        if (disputesList.getHasMore() == true){
            FinixList<Dispute> nextList = disputesList.listNext(1);
            assertTrue( nextList != null);
            assertEquals(1, nextList.size());
        }
        }

    /**
     * Fetch Dispute Adjustment Transfers
     *
     * List the adjustment &#x60;Transfers&#x60; for a &#x60;Dispute&#x60;. Depending on the stage of the &#x60;Dispute&#x60;, different adjustment &#x60;Transfer&#x60; subtypes can be applied.  There are four available subtypes for adjustment &#x60;Transfers&#x60; in &#x60;Disputes&#x60;: &lt;ul&gt;&lt;li&gt;&lt;strong&gt;PLATFORM\\_CREDIT&lt;/strong&gt;&lt;li&gt;&lt;strong&gt;MERCHANT\\_DEBIT&lt;/strong&gt;&lt;li&gt;&lt;strong&gt;MERCHANT\\_CREDIT&lt;/strong&gt;&lt;li&gt;&lt;strong&gt;PLATFORM\\_DEBIT&lt;/strong&gt;&lt;/ul&gt;
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("List Dispute Adjustment Transfers")
    public void listDisputesAdjustmentsTest() throws ApiException{
        String disputeId = "DIs7yQRkHDdMYhurzYz72SFk";
        Long limit = null;
        String nextCursor = null;

        FinixList<Transfer> adjustmentDisputeList = finixClient.Disputes.listDisputesAdjustments(disputeId,ListDisputesAdjustmentsQueryParams.builder()
                .limit(limit)
                .afterCursor("TRsfZUjgXSCj7k2stZR7APEn")
                .build());
        assertTrue(adjustmentDisputeList.size() >= 0);
        if (adjustmentDisputeList.size() == 0){
            assertEquals(false, adjustmentDisputeList.getHasMore());
        }
        if (adjustmentDisputeList.getHasMore() == true){
            FinixList<Transfer> nextList = adjustmentDisputeList.listNext(1);
            assertTrue( nextList != null);
            assertEquals(1, nextList.size());
        }
   }
}
