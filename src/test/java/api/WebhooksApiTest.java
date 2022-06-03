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
import model.CreateWebhookRequest;
import model.Error401Unauthorized;
import model.Error403ForbiddenList;
import model.Error404NotFoundList;
import model.Error406NotAcceptable;
import model.Error422InvalidFieldList;
import model.ErrorGeneric;
import model.Webhook;
import model.WebhooksList;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
@Disabled
public class WebhooksApiTest {

    private final WebhooksApi api = new WebhooksApi();

    /**
     * Create a Webhook
     *
     * Create a &#x60;Webhook&#x60; to specify an endpoint where Finix can send events.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createWebhookTest() throws ApiException {
        CreateWebhookRequest createWebhookRequest = null;
        Webhook response = api.create(createWebhookRequest);
        // TODO: test validations
    }

    /**
     * Get a Webhook
     *
     * Retrieve the details of a &#x60;Webhook&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWebhookTest() throws ApiException {
        String webhookId = null;
        Webhook response = api.get(webhookId);
        // TODO: test validations
    }

    /**
     * List Application Webhooks
     *
     * Return a collection of webhooks, if there are no webhooks, an empty collection will be returned. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listApplicationWebhooksTest() throws ApiException {
        String applicationId = null;
        WebhooksList response = api.listByApplicationId(applicationId);
        // TODO: test validations
    }

    /**
     * List Webhooks
     *
     * Retrieve a list of webhooks endpoints.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listWebhooksTest() throws ApiException {
        String id = null;
        WebhooksList response = api.list(id);
        // TODO: test validations
    }

    /**
     * Update a Webhook
     *
     * Update an existing webhook
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putWebhookTest() throws ApiException {
        String webhookId = null;
        CreateWebhookRequest createWebhookRequest = null;
        Webhook response = api.update(webhookId, createWebhookRequest);
        // TODO: test validations
    }

}