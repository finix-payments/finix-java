/*
 * Finix API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2018-01-01
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
import model.AdjustmentTransfersList;
import model.CreateDisputeEvidenceRequest;
import model.Dispute;
import model.DisputeEvidence;
import model.DisputeEvidenceList;
import model.DisputesList;
import model.Error401Unauthorized;
import model.Error403ForbiddenList;
import model.Error404NotFoundList;
import model.Error406NotAcceptable;
import org.junit.jupiter.api.*;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * API tests for DisputesApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running DevicesApiTest")
//@Disabled
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
    void contextLoads() {
        finixClient= new FinixClient("USsRhsHYZGBPnQw8CByJyEQW","8a14c2f9-d94b-4c72-8f5c-a62908e5b30e", Environment.SANDBOX);
        assertEquals(true , finixClient!=null);
    }
    /**
     * Create Dispute Evidence
     *
     * Upload dispute evidence for a &#x60;Dispute&#x60;.  There are four available values that indicate the state of the evidence upload:  * **PENDING**: The evidence file has not yet been submitted to the &#x60;Processor&#x60;. No user action is required. * **SUCCEEDED**: The evidence file has been successfully sent to the &#x60;Processor&#x60;. No further user action is required. * **CANCELED**: The evidence file upload was not completed due to user action. * **FAILED**: An issue occurred. User action is required. Any of the following issues could have occurred:     * There was an error in the system and the user should retry uploading their evidence file.     * There is an issue with the file and the user should retry uploading a different file.     * There is an issue and the user should contact Support. 
     *
     * @throws ApiException if the Api call fails
     */
  //  @Test
    public void createDisputeEvidenceTest() throws ApiException {
        String disputeId = "DIs7yQRkHDdMYhurzYz72SFk";
        //String _file = "/Users/default-admin/Desktop/Finix-Logo.jpg";
        CreateDisputeEvidenceRequest createDisputeEvidenceRequest = new CreateDisputeEvidenceRequest( new File("/Users/default-admin/Desktop/Finix-Logo.jpg"));
        DisputeEvidence response = finixClient.Disputes.createDisputeEvidence(disputeId, createDisputeEvidenceRequest);
        // TODO: test validations
    }

    /**
     * Get Dispute
     *
     * Retrieve the details of a previously created &#x60;Dispute&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @DisplayName("Get Dispute")
    public void getDisputeTest() throws ApiException {
        String disputeId = "DIs7yQRkHDdMYhurzYz72SFk";
        Dispute response = finixClient.Disputes.get(disputeId);
        assertEquals("DIs7yQRkHDdMYhurzYz72SFk",response.getId(),()->" Should return " + "DIs7yQRkHDdMYhurzYz72SFk" + " but returns " + response.getId());

    }

    /**
     * Fetch Dispute Evidence
     *
     * Retrieve the details of a &#x60;Dispute&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @DisplayName("Fetch Dispute Evidence")
    public void getDisputeEvidenceTest() throws ApiException {
        String disputeId = "DIs7yQRkHDdMYhurzYz72SFk";
        String evidenceId = "DFnA9eVoYxRnxxLKzgcGGxYL";
        DisputeEvidence response = finixClient.Disputes.getDisputeEvidence(disputeId, evidenceId);
        assertEquals("DFnA9eVoYxRnxxLKzgcGGxYL",response.getId(),()->" Should return " + "DFnA9eVoYxRnxxLKzgcGGxYL" + " but returns " + response.getId());

    }

    /**
     * Fetch Dispute Adjustment Transfers
     *
     * List the adjustment &#x60;Transfers&#x60; for a &#x60;Dispute&#x60;. Depending on the stage of the &#x60;Dispute&#x60;, different adjustment &#x60;Transfer&#x60; subtypes can be applied.  There are four available subtypes for adjustment &#x60;Transfers&#x60; in &#x60;Disputes&#x60;: &lt;ul&gt;&lt;li&gt;&lt;strong&gt;PLATFORM\\_CREDIT&lt;/strong&gt;&lt;li&gt;&lt;strong&gt;MERCHANT\\_DEBIT&lt;/strong&gt;&lt;li&gt;&lt;strong&gt;MERCHANT\\_CREDIT&lt;/strong&gt;&lt;li&gt;&lt;strong&gt;PLATFORM\\_DEBIT&lt;/strong&gt;&lt;/ul&gt;
     *
     * @throws ApiException if the Api call fails
     */
   // @Test
    public void getDisputesAdjustmentsTest() throws ApiException {
        String disputeId = "DIs7yQRkHDdMYhurzYz72SFk";
        AdjustmentTransfersList response = finixClient.Disputes.getDisputesAdjustments(disputeId);
        // TODO: test validations
    }

    /**
     * List Application Disputes
     *
     * Return a collection of disputes, if there are no disputes, an empty collection will be returned. 
     *
     * @throws ApiException if the Api call fails
     */
    //@Test
    public void listApplicationDisputesTest() throws ApiException {
        String applicationId = null;
        DisputesList response = finixClient.Disputes.listApplicationDisputes(applicationId);
        // TODO: test validations
    }

    /**
     * List Dispute Evidence
     *
     * Retrieve a list of dispute evidence for a &#x60;Dispute&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @DisplayName("List Dispute Evidence")
    public void listDisputeEvidenceTest() throws ApiException {
        String disputeId = "DIs7yQRkHDdMYhurzYz72SFk";
        DisputeEvidenceList response = finixClient.Disputes.listDisputeEvidenceByDeviceId(disputeId);
        assertEquals(20,response.getPage().getLimit().intValue(),()->" Should return " + "20" + " but returns " + response.getPage().getLimit().intValue());

    }

    /**
     * List Disputes
     *
     * Retrieve a list of &#x60;Disputes&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @DisplayName("List Disputes")
    public void listDisputesTest() throws ApiException {
        String sort = null;
        Integer offset = null;
        Integer limit = null;
        String id = "DIs7yQRkHDdMYhurzYz72SFk";
        String createdAtGte = null;
        String createdAtLte = null;
        String updatedAtGte = null;
        String updatedAtLte = null;
        DisputesList response = finixClient.Disputes.list(sort, offset, limit, id, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte);
        assertEquals(20,response.getPage().getLimit().intValue(),()->" Should return " + "20" + " but returns " + response.getPage().getLimit().intValue());
    }

    /**
     * List Identity Disputes
     *
     * All disputes associated to this identity
     *
     * @throws ApiException if the Api call fails
     */
   // @Test
    public void listIdentityDisputesTest() throws ApiException {
        String identityId = null;
        Integer limit = null;
        Long offset = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        DisputesList response = finixClient.Disputes.listByIdentityId(identityId, limit, offset, pageNumber, pageSize);
        // TODO: test validations
    }

    /**
     * List Tranfer Disputes
     *
     * Get list of all the disputes in the transfers object
     *
     * @throws ApiException if the Api call fails
     */
    //@Test
    public void listTransferDisputesTest() throws ApiException {
        String transferId = null;
        Integer limit = null;
        Long offset = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        DisputesList response = finixClient.Disputes.listByTransferId(transferId, limit, offset, pageNumber, pageSize);
        // TODO: test validations
    }

}
