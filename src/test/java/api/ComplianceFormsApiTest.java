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
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * API tests for ComplianceFormsApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running IdentitiesApi")
public class ComplianceFormsApiTest {

    private FinixClient finixClient;
    private TestInfo testInfo;
    private TestReporter testReporter;
    private String complianceFormsId = "cf_fEojUGLjwUiqNTBp68JWq8";
    
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
        finixClient= new FinixClient("USj46WbwgnjapmdYFnEDP3Ec","b9b4042c-9621-438d-a84b-8557d4bda84d", Environment.SANDBOX);
        assertEquals(true , finixClient!=null);
    }

    /**
     * View Compliance Forms
     *
     * A webhook notifies you when Finix creates a &#x60;compliance_form&#x60;.  Use the ID in the webhook to fetch the &#x60;compliance_form&#x60; resource from the &#x60;/compliance_forms/:COMPLIANCE_FORM_ID:&#x60; endpoint.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    public void getComplianceFormsTest() throws ApiException {
        ComplianceForm response = finixClient.ComplianceForms.list(complianceFormsId);
        assertEquals(response.getLinkedTo(), "MUfnskvHiiDgP7x3TVL2LkG3");
        assertEquals(response.getLinkedType(), "MERCHANT");
        assertEquals(response.getType(), ComplianceForm.TypeEnum.PCI_SAQ_A);
        assertEquals(response.getPciSaqA().getIsAccepted(), false);
        assertEquals(response.getComplianceFormTemplate(), "cft_wua8ua1yLAcHRK9mx2mF9K");
        assertEquals(response.getFiles().getUnsignedFile(), "FILE_fFGMCY4sxGYTqpjnXh54kC");
    }

    /**
     * Complete Compliance Forms
     *
     * As part of onboarding your users, you&#39;ll need to build a UI experience that allows users to complete the PCI &#x60;compliance_form&#x60; and download the form as a PDF if requested.  To complete PCI compliance forms:  1. Get the &#x60;compliance_form&#x60; generated for the merchant using the &#x60;ID&#x60; from the webhook and present the form to your users when requested. 2. Show your users the [required text](/guides/security-and-compliance/pci-dss-compliance/managing-pci-compliance/#obtaining-compliance-consent) to obtain consent. 3. Submit a PUT API request with the necessary [attestation](/guides/security-and-compliance/pci-dss-compliance/managing-pci-compliance/#completing-the-questionnaire) information.  For more information, see [Managing Compliance Forms](/guides/security-and-compliance/pci-dss-compliance/managing-pci-compliance/#completing-compliance-forms).
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    public void updateComplianceFormsTest() throws ApiException {
        String complianceFormsId2 = "cf_pzJCPAqrt9Z5653V3iXRDv";
        FinixClient client= new FinixClient("US8MrUh4Eb1L9Kn6rgSKdem4","94879501-e840-4263-ae01-b65e10084893", Environment.SANDBOX);
        UpdateComplianceFormRequest request = UpdateComplianceFormRequest.builder()
            .pciSaqA(UpdateComplianceFormRequestPciSaqA.builder()
            .name("test_java")
            .signedAt("2022-03-18T16:42:55Z")
            .userAgent("Mozilla 5.0(Macintosh; IntelMac OS X 10 _14_6)")
            .ipAddress("42.1.1.113")
            .title("CEO")
            .build())
            .build();
        ComplianceForm response = client.ComplianceForms.update(complianceFormsId2, request);
        assertEquals(response.getPciSaqA().getName(), request.getPciSaqA().getName());
        assertEquals(response.getPciSaqA().getIpAddress(), request.getPciSaqA().getIpAddress());
        assertEquals(response.getPciSaqA().getTitle(), request.getPciSaqA().getTitle());
        assertEquals(response.getPciSaqA().getUserAgent(), request.getPciSaqA().getUserAgent());
        assertEquals(response.getPciSaqA().getSignedAt(), request.getPciSaqA().getSignedAt());

    }

}
