/*
 * Finix API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2022-02-01
 * Contact: support@finixpayments.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package api;

import invoker.ApiException;
import model.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReviewQueueApi
 */
@Disabled
public class ReviewQueueApiTest {

    private final ReviewQueueApi api = new ReviewQueueApi();

    /**
     * Show Review Queue Item
     *
     * Get the review queue item object
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    public void getReviewQueueItemTest() throws ApiException {
        String reviewQueueItemId = null;

        ReviewQueueItem response = api.get(reviewQueueItemId);
        // TODO: test validations
    }

    /**
     * List Review Queue Items
     *
     * Get the review_queue object
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    public void listReviewQueueItemsTest() throws ApiException {
        String entityType = null;
        String id = null;
        String application = null;

        ReviewQueueItemsList response = api.list(ListReviewQueueItemsQueryParams.builder().build());
        // TODO: test validations
    }

    /**
     * Put Review Queue Item
     *
     * Update a review queue item
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    public void putReviewQueueItemTest() throws ApiException {
        String reviewQueueItemId = null;
        Object body = null;

        ReviewQueueItem response = api.update(reviewQueueItemId, body);
        // TODO: test validations
    }

}
