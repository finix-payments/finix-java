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
import model.Error401Unauthorized;
import model.Error403ForbiddenList;
import model.Error404NotFoundList;
import model.Error406NotAcceptable;
import model.Error422InvalidFieldList;
import model.ErrorGeneric;
import model.Verification;
import model.VerificationForm;
import model.VerificationsList;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VerificationsApi
 */
@Disabled
public class VerificationsApiTest {

    private final VerificationsApi api = new VerificationsApi();

    /**
     * Perform a Verification
     *
     * Create a &#x60;verification&#x60; to perform verification for a provided identity or payment instrument.  Verifications can also be created directly on the resources you want to verify: - &#x60;POST /merchants/{id}/verifications&#x60; - &#x60;POST /payment_instruments/{id}/verifications&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createVerificationTest() throws ApiException {
        VerificationForm verificationForm = null;
        Verification response = api.create(verificationForm);
        // TODO: test validations
    }

    /**
     * Get a Verification
     *
     * Retrieve the details of a verification.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVerificationTest() throws ApiException {
        String verificationId = null;
        Verification response = api.get(verificationId);
        // TODO: test validations
    }

    /**
     * List Identity Verifications
     *
     * All verifications of this identity
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listIdentityVerificationsTest() throws ApiException {
        String identityId = null;
        Integer limit = null;
        Long offset = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        VerificationsList response = api.listByIdentityId(identityId, limit, offset, pageNumber, pageSize);
        // TODO: test validations
    }

    /**
     * List Merchant Verifications
     *
     * Get list of all the verifications in the merchant object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMerchantVerificationsTest() throws ApiException {
        String merchantId = null;
        Integer limit = null;
        Long offset = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        VerificationsList response = api.listByMerchantId(merchantId, limit, offset, pageNumber, pageSize);
        // TODO: test validations
    }

    /**
     * List Payment Instrument Verifications
     *
     * Get list of all the transfers in the payment instrument object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPaymentInstrumentVerificationsTest() throws ApiException {
        String paymentInstrumentId = null;
        Integer limit = null;
        Long offset = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        VerificationsList response = api.listByPaymentInstrumentId(paymentInstrumentId, limit, offset, pageNumber, pageSize);
        // TODO: test validations
    }

    /**
     * List Verifications
     *
     * Retrieve a list of verifications
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listVerificationsTest() throws ApiException {
        String id = null;
        VerificationsList response = api.list(id);
        // TODO: test validations
    }

    /**
     * Update a Verification
     *
     * Update an existing verification.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putVerificationTest() throws ApiException {
        String verificationId = null;
        VerificationForm verificationForm = null;
        Verification response = api.update(verificationId, verificationForm);
        // TODO: test validations
    }

}
