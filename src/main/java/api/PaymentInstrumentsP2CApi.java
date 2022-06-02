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

import invoker.ApiCallback;
import invoker.FinixClient;
import invoker.ApiException;
import invoker.ApiResponse;
import invoker.Configuration;
import invoker.Pair;
import invoker.ProgressRequestBody;
import invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import model.Error401Unauthorized;
import model.Error403ForbiddenList;
import model.Error404NotFoundList;
import model.Error406NotAcceptable;
import model.ErrorGeneric;
import model.Verification;
import model.VerificationForm;

import java.lang.reflect.Type;
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;
import javax.ws.rs.core.GenericType;

    public class PaymentInstrumentsP2CApi {
    private FinixClient localVarFinixClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PaymentInstrumentsP2CApi() {
    this(Configuration.getDefaultFinixClient());
    }

    public PaymentInstrumentsP2CApi(FinixClient finixClient) {
    this.localVarFinixClient = finixClient;
    }

    public FinixClient getFinixClient() {
    return localVarFinixClient;
    }

    public void setFinixClient(FinixClient finixClient) {
    this.localVarFinixClient = finixClient;
    }

    public int getHostIndex() {
    return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
    this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
    return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
    this.localCustomBaseUrl = customBaseUrl;
    }

        /**
        * Build call for createPaymentInstrumentVerification
            * @param paymentInstrumentId ID of object (required)
            * @param verificationForm form (optional)
        * @param _callback Callback for upload/download progress
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single processor object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call createPaymentInstrumentVerificationCall(String paymentInstrumentId, VerificationForm verificationForm, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
        basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
        basePath = localBasePaths[localHostIndex];
        } else {
        basePath = null;
        }

        Object localVarPostBody = verificationForm;

        // create path and map variables
            String localVarPath = "/payment_instruments/{payment_instrument_id}/verifications"
                .replaceAll("\\{" + "payment_instrument_id" + "\\}", localVarFinixClient.escapeString(paymentInstrumentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

            final String[] localVarAccepts = {
        "application/hal+json"
            };
            final String localVarAccept = localVarFinixClient.selectHeaderAccept(localVarAccepts);
            if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
            }

            final String[] localVarContentTypes = {
        "application/json"
            };
            final String localVarContentType = localVarFinixClient.selectHeaderContentType(localVarContentTypes);
            if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
            }

            String[] localVarAuthNames = new String[] { "BasicAuth" };
            return localVarFinixClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
            }

            @SuppressWarnings("rawtypes")
            private okhttp3.Call createPaymentInstrumentVerificationValidateBeforeCall(String paymentInstrumentId, VerificationForm verificationForm, final ApiCallback _callback) throws ApiException {
            
                    // verify the required parameter 'paymentInstrumentId' is set
                    if (paymentInstrumentId == null) {
                    throw new ApiException("Missing the required parameter 'paymentInstrumentId' when calling createPaymentInstrumentVerification(Async)");
                    }
            

                okhttp3.Call localVarCall = createPaymentInstrumentVerificationCall(paymentInstrumentId, verificationForm, _callback);
                return localVarCall;

            }

                /**
                * Verify a Payment Instrument
                * &gt; Only used for [Push To Card](/guides/push-to-card) customers.  Verify a payment instrument to determine if it is elligable for Push To Card. 
                    * @param paymentInstrumentId ID of object (required)
                    * @param verificationForm form (optional)
                    * @return Verification
                * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                    * @http.response.details
                    <table summary="Response Details" border="1">
                        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                            <tr><td> 201 </td><td> Single processor object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                            <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                            <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                            <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                            <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                            <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    </table>
                */
                    public Verification createPaymentInstrumentVerification(String paymentInstrumentId, VerificationForm verificationForm) throws ApiException {
                ApiResponse<Verification> localVarResp = createPaymentInstrumentVerificationWithHttpInfo(paymentInstrumentId, verificationForm);
                        return localVarResp.getData();
                    }

        /**
            * Verify a Payment Instrument
            * &gt; Only used for [Push To Card](/guides/push-to-card) customers.  Verify a payment instrument to determine if it is elligable for Push To Card. 
                * @param paymentInstrumentId ID of object (required)
                * @param verificationForm form (optional)
            * @return ApiResponse&lt;Verification&gt;
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 201 </td><td> Single processor object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */
            public ApiResponse<Verification> createPaymentInstrumentVerificationWithHttpInfo(String paymentInstrumentId, VerificationForm verificationForm) throws ApiException {
            okhttp3.Call localVarCall = createPaymentInstrumentVerificationValidateBeforeCall(paymentInstrumentId, verificationForm, null);
                    Type localVarReturnType = new TypeToken<Verification>(){}.getType();
                    return localVarFinixClient.execute(localVarCall, localVarReturnType);
            }

        /**
            * Verify a Payment Instrument (asynchronously)
            * &gt; Only used for [Push To Card](/guides/push-to-card) customers.  Verify a payment instrument to determine if it is elligable for Push To Card. 
                * @param paymentInstrumentId ID of object (required)
                * @param verificationForm form (optional)
            * @param _callback The callback to be executed when the API call finishes
            * @return The request call
            * @throws ApiException If fail to process the API call, e.g. serializing the request body object
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 201 </td><td> Single processor object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */
            public okhttp3.Call createPaymentInstrumentVerificationAsync(String paymentInstrumentId, VerificationForm verificationForm, final ApiCallback<Verification> _callback) throws ApiException {

            okhttp3.Call localVarCall = createPaymentInstrumentVerificationValidateBeforeCall(paymentInstrumentId, verificationForm, _callback);
        Type localVarReturnType = new TypeToken<Verification>(){}.getType();
            localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
            }
        }
