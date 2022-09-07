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
 * API tests for OnboardingFormsApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running IdentitiesApi")
public class OnboardingFormsApiTest {
    private FinixClient finixClient;
    private String formId;
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
     * Create an Onboarding Form
     *
     * Create an onboarding_form with the name of the processor you plan to onboard users to and the links they get redirected to when completing or moving away from the Finix Onboarding Form.  &gt; Use your **ROLE_PARTNER** credentials to create an &#x60;onboarding_form&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     *
     *
     */
    @Test
    public void createOnboardingFormTest() throws ApiException {
        ArrayList<CreateOnboardingFormRequestMerchantProcessorsInner> processorList = new ArrayList<CreateOnboardingFormRequestMerchantProcessorsInner>();
        processorList.add(CreateOnboardingFormRequestMerchantProcessorsInner.builder().processor("LITLE_V1").build());
        CreateOnboardingFormRequest createOnboardingFormRequest = CreateOnboardingFormRequest.builder()
            .onboardingData(CreateOnboardingFormRequestOnboardingData.builder().maxTransactionAmount(100000L).build())
            .merchantProcessors(processorList)
            .onboardingLinkDetails(CreateOnboardingFormRequestOnboardingLinkDetails
                .builder()
                .returnUrl("https://www.finix.com/docs")
                .expiredSessionUrl("https://www.finix.com/")
                .termsOfServiceUrl("https://www.finix.com/terms-and-policies")
                .feeDetailsUrl("https://www.finix.com/docs")
                .expirationInMinutes("30").build())
            .build();

        OnboardingForm response = finixClient.OnboardingForms.create(createOnboardingFormRequest);
        formId = response.getId();
        assertEquals(response.getOnboardingData().getMaxTransactionAmount(), createOnboardingFormRequest.getOnboardingData().getMaxTransactionAmount());
        assertEquals(response.getMerchantProcessors().get(0).getProcessor(), createOnboardingFormRequest.getMerchantProcessors().get(0).getProcessor());
    }

    /**
     * Create an Onboarding Form Link
     *
     * You can use the &#x60;onboarding_forms&#x60; API to create a link that can return users to where they left off completing their Finix Onboarding Form.
     *
     * @throws ApiException if the Api call fails
     *
     *
     */
    @Test
    public void createOnboardingFormLinkTest() throws ApiException {
        String onboardingFormId = formId;
        CreateOnboardingFormLinkRequest createOnboardingFormLinkRequest = CreateOnboardingFormLinkRequest.builder()
        .termsOfServiceUrl("https://www.finix.com/terms-and-policies")
        .returnUrl("https://www.finix.com/docs")
        .feeDetailsUrl("https://www.finix.com/docs")
        .expiredSessionUrl("https://www.finix.com/")
        .expirationInMinutes(30L)
        .build();

        OnboardingFormLink response = finixClient.OnboardingForms.createLink(onboardingFormId, createOnboardingFormLinkRequest);
        assertTrue(response.getLinkUrl().contains(onboardingFormId));
    }

    /**
     * Get an Onboarding Form 
     *
     * You can use the &#x60;onboarding_forms&#x60; API to create a link that can return users to where they left off completing their Finix Onboarding Form.
     *
     * @throws ApiException if the Api call fails
     *
     *
     */
    @Test
    public void getOnboardingFormTest() throws ApiException {
        String onboardingFormId = formId;

        OnboardingForm response = finixClient.OnboardingForms.get(onboardingFormId);
        assertEquals(response.getOnboardingData().getMaxTransactionAmount(), 100000);
        assertEquals(response.getMerchantProcessors().get(0).getProcessor(),"LITLE_V1");
       }
    

}
