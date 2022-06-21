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
import model.Error401Unauthorized;
import model.Error403ForbiddenList;
import model.Error404NotFoundList;
import model.Error406NotAcceptable;
import model.ErrorGeneric;
import model.Verification;
import model.VerificationForm;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentInstrumentsP2CApi
 */
@Disabled
public class PaymentInstrumentsP2CApiTest {

    private final PaymentInstrumentsP2CApi api = new PaymentInstrumentsP2CApi();

    /**
     * Verify a Payment Instrument
     *
     * Verify a &#x60;Payment Instrument&#x60; to determine if it&#39;s elligable for Push To Card transactions.   &gt; Only verify &#x60;Payment Instruments&#x60; for [Push To Card](/guides/push-to-card) customers.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    public void createPaymentInstrumentVerificationTest() throws ApiException {
        String paymentInstrumentId = null;
        VerificationForm verificationForm = null;

        Verification response = api.createPaymentInstrumentVerification(paymentInstrumentId, verificationForm);
        // TODO: test validations
    }

}
