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
import model.CreateSubscriptionAmountRequest;
import model.SubscriptionAmount;
import model.SubscriptionAmountList;
import model.UpdateSubscriptionAmountRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscriptionAmountsApi
 */
@Disabled
public class SubscriptionAmountsApiTest {

    private final SubscriptionAmountsApi api = new SubscriptionAmountsApi();

    /**
     * Create a Subscription Amount
     *
     * Create a &#x60;subscription_amount&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSubscriptionAmountsTest() throws ApiException {
        String subscriptionScheduleId = null;
        CreateSubscriptionAmountRequest createSubscriptionAmountRequest = null;
        SubscriptionAmount response = api.lcreate(subscriptionScheduleId, createSubscriptionAmountRequest);
        // TODO: test validations
    }

    /**
     * Get a Subscription Amount
     *
     * Retrieve the details of a &#x60;subscription_amount&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSubscriptionSubscriptionAmountsIdTest() throws ApiException {
        String subscriptionAmountId = null;
        SubscriptionAmount response = api.get(subscriptionAmountId);
        // TODO: test validations
    }

    /**
     * List Subscription Amounts
     *
     * Retrive a list of subscription amounts.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSubscriptionSubscriptionSchedulesIdSubscriptionAmountsTest() throws ApiException {
        String subscriptionScheduleId = null;
        SubscriptionAmountList response = api.listBySubscriptionSchedule(subscriptionScheduleId);
        // TODO: test validations
    }

    /**
     * Update a Subscription Amount
     *
     * Update the details of a &#x60;subscription_amount&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putSubscriptionSubscriptionAmountsIdTest() throws ApiException {
        String subscriptionAmountId = null;
        UpdateSubscriptionAmountRequest updateSubscriptionAmountRequest = null;
        SubscriptionAmount response = api.update(subscriptionAmountId, updateSubscriptionAmountRequest);
        // TODO: test validations
    }

}