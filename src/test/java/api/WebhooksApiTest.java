/*
 * Finix API
 */


package api;

import invoker.ApiException;
import invoker.Environment;
import invoker.FinixClient;
import model.*;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * API tests for WebhooksApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running WebhooksApiTest")
public class WebhooksApiTest {
    private FinixClient finixClient;
    private String webhookId;
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

    /**
     * Create a Webhook
     *
     * Create a &#x60;Webhook&#x60; to specify an endpoint where Finix can send events.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Create a Webhook")
    @BeforeAll
    public void createWebhookTest() throws ApiException {
        CreateWebhookRequest createWebhookRequest = CreateWebhookRequest.builder()
                .url("https://example.com/")
                .build();
        Webhook response = finixClient.Webhooks.create(createWebhookRequest);
        webhookId = response.getId();
        assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
    }

    /**
     * Get a Webhook
     *
     * Retrieve the details of a &#x60;Webhook&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Get a Webhook")
    public void getWebhookTest() throws ApiException {
        String webhookId = "WHED2RM5dbNKcHYc3ALxhbW";
        Webhook response = finixClient.Webhooks.get(webhookId);
        assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
    }

    /**
     * List Webhooks
     *
     * Retrieve a list of &#x60;Webhook&#x60; endpoints.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("List Webhooks")
    public void listWebhooksTest() throws ApiException {
        Long limit = null;
        String afterCursor = null;
        String beforeCursor = null;

        FinixList<Webhook> webhooksList = finixClient.Webhooks.list(ListWebhooksQueryParams.builder()
                .limit(limit)
                .afterCursor(afterCursor)
                .beforeCursor(beforeCursor)
                .build());
        assertTrue(webhooksList.size() >= 0);
        if (webhooksList.size() == 0){
            assertEquals(false, webhooksList.getHasMore());
        }
        if (webhooksList.getHasMore() == true) {
            FinixList<Webhook> nextList = webhooksList.listNext(1);
            assertTrue(nextList != null);
            assertEquals(1, nextList.size());
        }
    }

    /**
     * Update a Webhook
     *
     * Update an existing &#x60;Webhook&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Update a Webhook")
    @AfterAll
    public void putWebhookTest() throws ApiException {
        UpdateWebhookRequest updateWebhookRequest = UpdateWebhookRequest.builder()
                .url("https://example.com/")
                .enabled(false)
                .build();
        Webhook response = finixClient.Webhooks.update(webhookId, updateWebhookRequest);
        assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplication(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplication());
    }
}
