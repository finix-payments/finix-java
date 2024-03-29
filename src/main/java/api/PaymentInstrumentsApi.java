/*
 * Finix API
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

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.stream.Collectors;
import java.util.*;
import model.*;

import model.ApplePaySession;
import model.ApplePaySessionRequest;
import model.CreatePaymentInstrumentRequest;
import model.Error401Unauthorized;
import model.Error403ForbiddenList;
import model.Error404NotFoundList;
import model.Error406NotAcceptable;
import model.Error422InvalidFieldList;
import model.ErrorGeneric;
import model.PaymentInstrument;
import model.PaymentInstrumentUpdatesList;
import model.PaymentInstrumentsList;
import model.UpdatePaymentInstrumentRequest;

import model.ListPaymentInstrumentUpdatesQueryParams;
import model.ListPaymentInstrumentsQueryParams;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PaymentInstrumentsApi {
    private FinixClient localVarFinixClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PaymentInstrumentsApi() {
        this(Configuration.getDefaultFinixClient());
    }

    public PaymentInstrumentsApi(FinixClient finixClient) {
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
    * Build call for createApplePaySession
        * @param applePaySessionRequest  (optional)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single apple_pay_session object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call createApplePaySessionCall(ApplePaySessionRequest applePaySessionRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = applePaySessionRequest;

    // create path and map variables
        String localVarPath = "/apple_pay_sessions";

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
            "application/hal+json"
        };
        final String localVarContentType = localVarFinixClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("Finix-Version", "2022-02-01");
        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return localVarFinixClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

        @SuppressWarnings("rawtypes")
    private okhttp3.Call createApplePaySessionValidateBeforeCall(ApplePaySessionRequest applePaySessionRequest, final ApiCallback _callback) throws ApiException {
    

        okhttp3.Call localVarCall = createApplePaySessionCall(applePaySessionRequest, _callback);
        return localVarCall;

    }

            /**
            * Create an Apple Pay Session
            * Create an &#x60;apple_pay_session&#x60; to process Apple Pay transactions on the web.  To create an Apple Pay Session, pass the unique &#x60;validation_url&#x60; (provided by Apple) while creating an &#x60;apple_pay_sessions&#x60; resource. Finix returns a &#x60;merchantSession&#x60; object that you can use to create a payment. For more information, see [Apple Pay](/docs/guides/payments/alternative-payment-methods/apple-pay/).
                * @param applePaySessionRequest  (optional)
                * @return ApplePaySession
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single apple_pay_session object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public ApplePaySession createApplePaySession(ApplePaySessionRequest applePaySessionRequest) throws ApiException {
        ApiResponse<ApplePaySession> localVarResp = createApplePaySessionWithHttpInfo(applePaySessionRequest);
        return localVarResp.getData();
    }


    /**
        * Create an Apple Pay Session
        * Create an &#x60;apple_pay_session&#x60; to process Apple Pay transactions on the web.  To create an Apple Pay Session, pass the unique &#x60;validation_url&#x60; (provided by Apple) while creating an &#x60;apple_pay_sessions&#x60; resource. Finix returns a &#x60;merchantSession&#x60; object that you can use to create a payment. For more information, see [Apple Pay](/docs/guides/payments/alternative-payment-methods/apple-pay/).
            * @param applePaySessionRequest  (optional)
        * @return ApiResponse&lt;ApplePaySession&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single apple_pay_session object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<ApplePaySession> createApplePaySessionWithHttpInfo(ApplePaySessionRequest applePaySessionRequest) throws ApiException {
        okhttp3.Call localVarCall = createApplePaySessionValidateBeforeCall(applePaySessionRequest, null);
        Type localVarReturnType = new TypeToken<ApplePaySession>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Create an Apple Pay Session (asynchronously)
        * Create an &#x60;apple_pay_session&#x60; to process Apple Pay transactions on the web.  To create an Apple Pay Session, pass the unique &#x60;validation_url&#x60; (provided by Apple) while creating an &#x60;apple_pay_sessions&#x60; resource. Finix returns a &#x60;merchantSession&#x60; object that you can use to create a payment. For more information, see [Apple Pay](/docs/guides/payments/alternative-payment-methods/apple-pay/).
            * @param applePaySessionRequest  (optional)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single apple_pay_session object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call createApplePaySessionAsync(ApplePaySessionRequest applePaySessionRequest, final ApiCallback<ApplePaySession> _callback) throws ApiException {

        okhttp3.Call localVarCall = createApplePaySessionValidateBeforeCall(applePaySessionRequest, _callback);
        Type localVarReturnType = new TypeToken<ApplePaySession>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Build call for createPaymentInstrument
        * @param createPaymentInstrumentRequest  (optional)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 201 </td><td> Single Payment Instrument object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call createPaymentInstrumentCall(CreatePaymentInstrumentRequest createPaymentInstrumentRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createPaymentInstrumentRequest;

    // create path and map variables
        String localVarPath = "/payment_instruments";

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
            "application/hal+json"
        };
        final String localVarContentType = localVarFinixClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("Finix-Version", "2022-02-01");
        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return localVarFinixClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

        @SuppressWarnings("rawtypes")
    private okhttp3.Call createPaymentInstrumentValidateBeforeCall(CreatePaymentInstrumentRequest createPaymentInstrumentRequest, final ApiCallback _callback) throws ApiException {
    

        okhttp3.Call localVarCall = createPaymentInstrumentCall(createPaymentInstrumentRequest, _callback);
        return localVarCall;

    }

            /**
            * Create a Payment Instrument
            * Create a &#x60;Payment Instrument&#x60; resource using a card or bank account.  To accept payment details, review our guide on how to [tokenize cards using hosted fields](/guides/payments/tokenization-with-hosted-fields).  - The creation of &#x60;Payment Instruments&#x60; directly via Finix&#39;s API should only be done for testing purposes. You must use the Hosted Tokenization fields or the javascript client to remain out of PCI scope.
                * @param createPaymentInstrumentRequest  (optional)
                * @return PaymentInstrument
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 201 </td><td> Single Payment Instrument object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public PaymentInstrument create(CreatePaymentInstrumentRequest createPaymentInstrumentRequest) throws ApiException {
        ApiResponse<PaymentInstrument> localVarResp = createPaymentInstrumentWithHttpInfo(createPaymentInstrumentRequest);
        return localVarResp.getData();
    }


    /**
        * Create a Payment Instrument
        * Create a &#x60;Payment Instrument&#x60; resource using a card or bank account.  To accept payment details, review our guide on how to [tokenize cards using hosted fields](/guides/payments/tokenization-with-hosted-fields).  - The creation of &#x60;Payment Instruments&#x60; directly via Finix&#39;s API should only be done for testing purposes. You must use the Hosted Tokenization fields or the javascript client to remain out of PCI scope.
            * @param createPaymentInstrumentRequest  (optional)
        * @return ApiResponse&lt;PaymentInstrument&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single Payment Instrument object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<PaymentInstrument> createPaymentInstrumentWithHttpInfo(CreatePaymentInstrumentRequest createPaymentInstrumentRequest) throws ApiException {
        okhttp3.Call localVarCall = createPaymentInstrumentValidateBeforeCall(createPaymentInstrumentRequest, null);
        Type localVarReturnType = new TypeToken<PaymentInstrument>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Create a Payment Instrument (asynchronously)
        * Create a &#x60;Payment Instrument&#x60; resource using a card or bank account.  To accept payment details, review our guide on how to [tokenize cards using hosted fields](/guides/payments/tokenization-with-hosted-fields).  - The creation of &#x60;Payment Instruments&#x60; directly via Finix&#39;s API should only be done for testing purposes. You must use the Hosted Tokenization fields or the javascript client to remain out of PCI scope.
            * @param createPaymentInstrumentRequest  (optional)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single Payment Instrument object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call createPaymentInstrumentAsync(CreatePaymentInstrumentRequest createPaymentInstrumentRequest, final ApiCallback<PaymentInstrument> _callback) throws ApiException {

        okhttp3.Call localVarCall = createPaymentInstrumentValidateBeforeCall(createPaymentInstrumentRequest, _callback);
        Type localVarReturnType = new TypeToken<PaymentInstrument>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Build call for getPaymentInstrument
        * @param paymentInstrumentId ID of object (required)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single Payment Instrument object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call getPaymentInstrumentCall(String paymentInstrumentId, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

    // create path and map variables
        String localVarPath = "/payment_instruments/{payment_instrument_id}"
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
            
        };
        final String localVarContentType = localVarFinixClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("Finix-Version", "2022-02-01");
        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return localVarFinixClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

        @SuppressWarnings("rawtypes")
    private okhttp3.Call getPaymentInstrumentValidateBeforeCall(String paymentInstrumentId, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'paymentInstrumentId' is set
        if (paymentInstrumentId == null) {
            throw new ApiException("Missing the required parameter 'paymentInstrumentId' when calling getPaymentInstrument(Async)");
        }
    

        okhttp3.Call localVarCall = getPaymentInstrumentCall(paymentInstrumentId, _callback);
        return localVarCall;

    }

            /**
            * Fetch a Payment Instrument
            * Retrieve the details of a &#x60;Payment Instrument&#x60;.
                * @param paymentInstrumentId ID of object (required)
                * @return PaymentInstrument
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single Payment Instrument object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public PaymentInstrument get(String paymentInstrumentId) throws ApiException {
        ApiResponse<PaymentInstrument> localVarResp = getPaymentInstrumentWithHttpInfo(paymentInstrumentId);
        return localVarResp.getData();
    }


    /**
        * Fetch a Payment Instrument
        * Retrieve the details of a &#x60;Payment Instrument&#x60;.
            * @param paymentInstrumentId ID of object (required)
        * @return ApiResponse&lt;PaymentInstrument&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Payment Instrument object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<PaymentInstrument> getPaymentInstrumentWithHttpInfo(String paymentInstrumentId) throws ApiException {
        okhttp3.Call localVarCall = getPaymentInstrumentValidateBeforeCall(paymentInstrumentId, null);
        Type localVarReturnType = new TypeToken<PaymentInstrument>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Fetch a Payment Instrument (asynchronously)
        * Retrieve the details of a &#x60;Payment Instrument&#x60;.
            * @param paymentInstrumentId ID of object (required)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Payment Instrument object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call getPaymentInstrumentAsync(String paymentInstrumentId, final ApiCallback<PaymentInstrument> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPaymentInstrumentValidateBeforeCall(paymentInstrumentId, _callback);
        Type localVarReturnType = new TypeToken<PaymentInstrument>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    private okhttp3.Call listPaymentInstrumentUpdatesCall(String paymentInstrumentId, Long limit, Long offset, Long pageSize, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

    // create path and map variables
        String localVarPath = "/payment_instruments/{payment_instrument_id}/updates"
            .replaceAll("\\{" + "payment_instrument_id" + "\\}", localVarFinixClient.escapeString(paymentInstrumentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("offset", offset));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("pageSize", pageSize));
        }

        final String[] localVarAccepts = {
            "application/hal+json"
        };

        final String localVarAccept = localVarFinixClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarFinixClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("Finix-Version", "2022-02-01");
        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return localVarFinixClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

        @SuppressWarnings("rawtypes")
    private okhttp3.Call listPaymentInstrumentUpdatesValidateBeforeCall(String paymentInstrumentId, Long limit, Long offset, Long pageSize, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'paymentInstrumentId' is set
        if (paymentInstrumentId == null) {
            throw new ApiException("Missing the required parameter 'paymentInstrumentId' when calling listPaymentInstrumentUpdates(Async)");
        }
    

        okhttp3.Call localVarCall = listPaymentInstrumentUpdatesCall(paymentInstrumentId, limit, offset, pageSize, _callback);
        return localVarCall;

    }


    private ApiResponse<PaymentInstrumentUpdatesList> listPaymentInstrumentUpdatesWithHttpInfo(String paymentInstrumentId, Long limit, Long offset, Long pageSize) throws ApiException {
        okhttp3.Call localVarCall = listPaymentInstrumentUpdatesValidateBeforeCall(paymentInstrumentId, limit, offset, pageSize, null);
        Type localVarReturnType = new TypeToken<PaymentInstrumentUpdatesList>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listPaymentInstrumentUpdatesAsync(String paymentInstrumentId, Long limit, Long offset, Long pageSize, final ApiCallback<PaymentInstrumentUpdatesList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listPaymentInstrumentUpdatesValidateBeforeCall(paymentInstrumentId, limit, offset, pageSize, _callback);
        Type localVarReturnType = new TypeToken<PaymentInstrumentUpdatesList>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistPaymentInstrumentUpdatesRequest {
        private final String paymentInstrumentId;
        private Long limit;
        private Long offset;
        private Long pageSize;

        private APIlistPaymentInstrumentUpdatesRequest(String paymentInstrumentId) {
            this.paymentInstrumentId = paymentInstrumentId;
        }

        /**
        * Set limit
        * @param limit The number of entries to return. (optional)
        * @return APIlistPaymentInstrumentUpdatesRequest
        */
        public APIlistPaymentInstrumentUpdatesRequest limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
        * Set offset
        * @param offset The number of items to skip before starting to collect the result set. (optional)
        * @return APIlistPaymentInstrumentUpdatesRequest
        */
        public APIlistPaymentInstrumentUpdatesRequest offset(Long offset) {
            this.offset = offset;
            return this;
        }

        /**
        * Set pageSize
        * @param pageSize The size of the page. (optional)
        * @return APIlistPaymentInstrumentUpdatesRequest
        */
        public APIlistPaymentInstrumentUpdatesRequest pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
        * Build call for listPaymentInstrumentUpdates
        * @param _callback ApiCallback API callback
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Update objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listPaymentInstrumentUpdatesCall(paymentInstrumentId, limit, offset, pageSize, _callback);
        }

        /**
        * Execute listPaymentInstrumentUpdates request
            * @return PaymentInstrumentUpdatesList
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Update objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public PaymentInstrumentUpdatesList execute() throws ApiException {
            ApiResponse<PaymentInstrumentUpdatesList> localVarResp = listPaymentInstrumentUpdatesWithHttpInfo(paymentInstrumentId, limit, offset, pageSize);
            return localVarResp.getData();
        }

        /**
        * Execute listPaymentInstrumentUpdates request with HTTP info returned
        * @return ApiResponse&lt;PaymentInstrumentUpdatesList&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Update objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public ApiResponse<PaymentInstrumentUpdatesList> executeWithHttpInfo() throws ApiException {
            return listPaymentInstrumentUpdatesWithHttpInfo(paymentInstrumentId, limit, offset, pageSize);
        }

        /**
        * Execute listPaymentInstrumentUpdates request (asynchronously)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Update objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call executeAsync(final ApiCallback<PaymentInstrumentUpdatesList> _callback) throws ApiException {
            return listPaymentInstrumentUpdatesAsync(paymentInstrumentId, limit, offset, pageSize, _callback);
        }
    }

    /**
    * List Payment Instrument Updates
    * List the updates on a &#x60;Payment Instrument&#x60;.  When using the [account updater](/guides/payments/account-updater), &#x60;Payment Instrument&#x60; details that are updated are represented by an &#x60;Update&#x60;.
        * @param paymentInstrumentId ID of &#x60;Payment Instrument&#x60; object. (required)
    * @return APIlistPaymentInstrumentUpdatesRequest
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> List of Update objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public FinixList listUpdatesByPaymentInstrumentId(String paymentInstrumentId,  ListPaymentInstrumentUpdatesQueryParams listPaymentInstrumentUpdatesQueryParams)
        throws ApiException{

        APIlistPaymentInstrumentUpdatesRequest request = new APIlistPaymentInstrumentUpdatesRequest(paymentInstrumentId);
        request.limit(listPaymentInstrumentUpdatesQueryParams.getLimit());
        request.offset(listPaymentInstrumentUpdatesQueryParams.getOffset());
        request.pageSize(listPaymentInstrumentUpdatesQueryParams.getPageSize());
        PaymentInstrumentUpdatesList response = request.execute();
        Boolean hasNextCursor = (response.getPage().getClass().getName() == "model.PageCursor");
        ListPaymentInstrumentUpdatesQueryParams queryParams = (ListPaymentInstrumentUpdatesQueryParams) getQueryParam(response.getPage(),
            listPaymentInstrumentUpdatesQueryParams,
            hasNextCursor);
        Boolean reachedEnd = reachedEnd(response.getPage(), hasNextCursor);
        NextFetchFunction nextFetch = (a) -> {
            queryParams.setLimit(a);
            if (reachedEnd) {
            throw new ArrayIndexOutOfBoundsException();
            }
            return this.listUpdatesByPaymentInstrumentId(paymentInstrumentId,  queryParams);
        };
        FinixList currList = new FinixList(nextFetch, !reachedEnd);
        if (response.getEmbedded() != null){
            String fieldName = getFieldName(response.getEmbedded());
            String fieldGet = "get" + fieldName;
            try{
                Method getList = response.getEmbedded().getClass().getMethod(fieldGet);
                Collection<Object> embeddedList = (Collection<Object>) getList.invoke(response.getEmbedded());

                if (embeddedList.size() < response.getPage().getLimit()){
                    currList = new FinixList<>(nextFetch, false);
                }
                for(Object item : embeddedList)
                {
                    currList.add(item);
                }
            } catch (Exception e){
                throw new ApiException(e.getMessage());
            }
        }
        currList.setPage(response.getPage());
        currList.setLinks(response.getLinks());
        return currList;
    }
    private okhttp3.Call listPaymentInstrumentsCall(String accountLast4, String accountRoutingNumber, String afterCursor, String application, String beforeCursor, String bin, String createdAtGte, String createdAtLte, String expirationMonth, String expirationYear, String lastFour, Long limit, String name, String ownerIdentityId, String type, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

    // create path and map variables
        String localVarPath = "/payment_instruments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accountLast4 != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("account_last4", accountLast4));
        }

        if (accountRoutingNumber != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("account_routing_number", accountRoutingNumber));
        }

        if (afterCursor != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("after_cursor", afterCursor));
        }

        if (application != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("application", application));
        }

        if (beforeCursor != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("before_cursor", beforeCursor));
        }

        if (bin != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("bin", bin));
        }

        if (createdAtGte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("created_at.gte", createdAtGte));
        }

        if (createdAtLte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("created_at.lte", createdAtLte));
        }

        if (expirationMonth != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("expiration_month", expirationMonth));
        }

        if (expirationYear != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("expiration_year", expirationYear));
        }

        if (lastFour != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("last_four", lastFour));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("limit", limit));
        }

        if (name != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("name", name));
        }

        if (ownerIdentityId != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("owner_identity_id", ownerIdentityId));
        }

        if (type != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("type", type));
        }

        final String[] localVarAccepts = {
            "application/hal+json"
        };

        final String localVarAccept = localVarFinixClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarFinixClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("Finix-Version", "2022-02-01");
        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return localVarFinixClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

        @SuppressWarnings("rawtypes")
    private okhttp3.Call listPaymentInstrumentsValidateBeforeCall(String accountLast4, String accountRoutingNumber, String afterCursor, String application, String beforeCursor, String bin, String createdAtGte, String createdAtLte, String expirationMonth, String expirationYear, String lastFour, Long limit, String name, String ownerIdentityId, String type, final ApiCallback _callback) throws ApiException {
    

        okhttp3.Call localVarCall = listPaymentInstrumentsCall(accountLast4, accountRoutingNumber, afterCursor, application, beforeCursor, bin, createdAtGte, createdAtLte, expirationMonth, expirationYear, lastFour, limit, name, ownerIdentityId, type, _callback);
        return localVarCall;

    }


    private ApiResponse<PaymentInstrumentsList> listPaymentInstrumentsWithHttpInfo(String accountLast4, String accountRoutingNumber, String afterCursor, String application, String beforeCursor, String bin, String createdAtGte, String createdAtLte, String expirationMonth, String expirationYear, String lastFour, Long limit, String name, String ownerIdentityId, String type) throws ApiException {
        okhttp3.Call localVarCall = listPaymentInstrumentsValidateBeforeCall(accountLast4, accountRoutingNumber, afterCursor, application, beforeCursor, bin, createdAtGte, createdAtLte, expirationMonth, expirationYear, lastFour, limit, name, ownerIdentityId, type, null);
        Type localVarReturnType = new TypeToken<PaymentInstrumentsList>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listPaymentInstrumentsAsync(String accountLast4, String accountRoutingNumber, String afterCursor, String application, String beforeCursor, String bin, String createdAtGte, String createdAtLte, String expirationMonth, String expirationYear, String lastFour, Long limit, String name, String ownerIdentityId, String type, final ApiCallback<PaymentInstrumentsList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listPaymentInstrumentsValidateBeforeCall(accountLast4, accountRoutingNumber, afterCursor, application, beforeCursor, bin, createdAtGte, createdAtLte, expirationMonth, expirationYear, lastFour, limit, name, ownerIdentityId, type, _callback);
        Type localVarReturnType = new TypeToken<PaymentInstrumentsList>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistPaymentInstrumentsRequest {
        private String accountLast4;
        private String accountRoutingNumber;
        private String afterCursor;
        private String application;
        private String beforeCursor;
        private String bin;
        private String createdAtGte;
        private String createdAtLte;
        private String expirationMonth;
        private String expirationYear;
        private String lastFour;
        private Long limit;
        private String name;
        private String ownerIdentityId;
        private String type;

        private APIlistPaymentInstrumentsRequest() {
        }

        /**
        * Set accountLast4
        * @param accountLast4 Filter by the last 4 digits of the account if available. (optional)
        * @return APIlistPaymentInstrumentsRequest
        */
        public APIlistPaymentInstrumentsRequest accountLast4(String accountLast4) {
            this.accountLast4 = accountLast4;
            return this;
        }

        /**
        * Set accountRoutingNumber
        * @param accountRoutingNumber Filter by the account routing number if available. (optional)
        * @return APIlistPaymentInstrumentsRequest
        */
        public APIlistPaymentInstrumentsRequest accountRoutingNumber(String accountRoutingNumber) {
            this.accountRoutingNumber = accountRoutingNumber;
            return this;
        }

        /**
        * Set afterCursor
        * @param afterCursor Return every resource created after the cursor value. (optional)
        * @return APIlistPaymentInstrumentsRequest
        */
        public APIlistPaymentInstrumentsRequest afterCursor(String afterCursor) {
            this.afterCursor = afterCursor;
            return this;
        }

        /**
        * Set application
        * @param application Filter by &#x60;Application&#x60; ID. (optional)
        * @return APIlistPaymentInstrumentsRequest
        */
        public APIlistPaymentInstrumentsRequest application(String application) {
            this.application = application;
            return this;
        }

        /**
        * Set beforeCursor
        * @param beforeCursor Return every resource created before the cursor value. (optional)
        * @return APIlistPaymentInstrumentsRequest
        */
        public APIlistPaymentInstrumentsRequest beforeCursor(String beforeCursor) {
            this.beforeCursor = beforeCursor;
            return this;
        }

        /**
        * Set bin
        * @param bin Filter by Bank Identification Number (BIN). The BIN is the first 6 digits of the masked number. (optional)
        * @return APIlistPaymentInstrumentsRequest
        */
        public APIlistPaymentInstrumentsRequest bin(String bin) {
            this.bin = bin;
            return this;
        }

        /**
        * Set createdAtGte
        * @param createdAtGte Filter where &#x60;created_at&#x60; is after the given date. (optional)
        * @return APIlistPaymentInstrumentsRequest
        */
        public APIlistPaymentInstrumentsRequest createdAtGte(String createdAtGte) {
            this.createdAtGte = createdAtGte;
            return this;
        }

        /**
        * Set createdAtLte
        * @param createdAtLte Filter where &#x60;created_at&#x60; is before the given date. (optional)
        * @return APIlistPaymentInstrumentsRequest
        */
        public APIlistPaymentInstrumentsRequest createdAtLte(String createdAtLte) {
            this.createdAtLte = createdAtLte;
            return this;
        }

        /**
        * Set expirationMonth
        * @param expirationMonth Filter by the expiration month associated with the &#x60;Payment Instrument&#x60; if applicable. This filter only applies to payment cards. (optional)
        * @return APIlistPaymentInstrumentsRequest
        */
        public APIlistPaymentInstrumentsRequest expirationMonth(String expirationMonth) {
            this.expirationMonth = expirationMonth;
            return this;
        }

        /**
        * Set expirationYear
        * @param expirationYear Filter by the 4 digit expiration year associated with the Payment Instrument if applicable. This filter only applies to payment cards. (optional)
        * @return APIlistPaymentInstrumentsRequest
        */
        public APIlistPaymentInstrumentsRequest expirationYear(String expirationYear) {
            this.expirationYear = expirationYear;
            return this;
        }

        /**
        * Set lastFour
        * @param lastFour Filter by the last 4 digits of the &#x60;Payment Instrument&#x60; card. This filter only applies to payment cards. (optional)
        * @return APIlistPaymentInstrumentsRequest
        */
        public APIlistPaymentInstrumentsRequest lastFour(String lastFour) {
            this.lastFour = lastFour;
            return this;
        }

        /**
        * Set limit
        * @param limit The numbers of items to return. (optional)
        * @return APIlistPaymentInstrumentsRequest
        */
        public APIlistPaymentInstrumentsRequest limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
        * Set name
        * @param name Filter by the name. (optional)
        * @return APIlistPaymentInstrumentsRequest
        */
        public APIlistPaymentInstrumentsRequest name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Set ownerIdentityId
        * @param ownerIdentityId Filter by the owner id of the associated &#x60;Identity&#x60;. (optional)
        * @return APIlistPaymentInstrumentsRequest
        */
        public APIlistPaymentInstrumentsRequest ownerIdentityId(String ownerIdentityId) {
            this.ownerIdentityId = ownerIdentityId;
            return this;
        }

        /**
        * Set type
        * @param type Filter by the &#x60;Payment Instrument&#x60; type. (optional)
        * @return APIlistPaymentInstrumentsRequest
        */
        public APIlistPaymentInstrumentsRequest type(String type) {
            this.type = type;
            return this;
        }

        /**
        * Build call for listPaymentInstruments
        * @param _callback ApiCallback API callback
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Payment Instrument objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listPaymentInstrumentsCall(accountLast4, accountRoutingNumber, afterCursor, application, beforeCursor, bin, createdAtGte, createdAtLte, expirationMonth, expirationYear, lastFour, limit, name, ownerIdentityId, type, _callback);
        }

        /**
        * Execute listPaymentInstruments request
            * @return PaymentInstrumentsList
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Payment Instrument objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public PaymentInstrumentsList execute() throws ApiException {
            ApiResponse<PaymentInstrumentsList> localVarResp = listPaymentInstrumentsWithHttpInfo(accountLast4, accountRoutingNumber, afterCursor, application, beforeCursor, bin, createdAtGte, createdAtLte, expirationMonth, expirationYear, lastFour, limit, name, ownerIdentityId, type);
            return localVarResp.getData();
        }

        /**
        * Execute listPaymentInstruments request with HTTP info returned
        * @return ApiResponse&lt;PaymentInstrumentsList&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Payment Instrument objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public ApiResponse<PaymentInstrumentsList> executeWithHttpInfo() throws ApiException {
            return listPaymentInstrumentsWithHttpInfo(accountLast4, accountRoutingNumber, afterCursor, application, beforeCursor, bin, createdAtGte, createdAtLte, expirationMonth, expirationYear, lastFour, limit, name, ownerIdentityId, type);
        }

        /**
        * Execute listPaymentInstruments request (asynchronously)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Payment Instrument objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call executeAsync(final ApiCallback<PaymentInstrumentsList> _callback) throws ApiException {
            return listPaymentInstrumentsAsync(accountLast4, accountRoutingNumber, afterCursor, application, beforeCursor, bin, createdAtGte, createdAtLte, expirationMonth, expirationYear, lastFour, limit, name, ownerIdentityId, type, _callback);
        }
    }

    /**
    * List Payment Instruments
    * Retrieve a list of &#x60;Payment Instruments&#x60;.
    * @return APIlistPaymentInstrumentsRequest
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> List of Payment Instrument objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public FinixList list( ListPaymentInstrumentsQueryParams listPaymentInstrumentsQueryParams)
        throws ApiException{

        APIlistPaymentInstrumentsRequest request = new APIlistPaymentInstrumentsRequest();
        request.accountLast4(listPaymentInstrumentsQueryParams.getAccountLast4());
        request.accountRoutingNumber(listPaymentInstrumentsQueryParams.getAccountRoutingNumber());
        request.afterCursor(listPaymentInstrumentsQueryParams.getAfterCursor());
        request.application(listPaymentInstrumentsQueryParams.getApplication());
        request.beforeCursor(listPaymentInstrumentsQueryParams.getBeforeCursor());
        request.bin(listPaymentInstrumentsQueryParams.getBin());
        request.createdAtGte(listPaymentInstrumentsQueryParams.getCreatedAtGte());
        request.createdAtLte(listPaymentInstrumentsQueryParams.getCreatedAtLte());
        request.expirationMonth(listPaymentInstrumentsQueryParams.getExpirationMonth());
        request.expirationYear(listPaymentInstrumentsQueryParams.getExpirationYear());
        request.lastFour(listPaymentInstrumentsQueryParams.getLastFour());
        request.limit(listPaymentInstrumentsQueryParams.getLimit());
        request.name(listPaymentInstrumentsQueryParams.getName());
        request.ownerIdentityId(listPaymentInstrumentsQueryParams.getOwnerIdentityId());
        request.type(listPaymentInstrumentsQueryParams.getType());
        PaymentInstrumentsList response = request.execute();
        Boolean hasNextCursor = (response.getPage().getClass().getName() == "model.PageCursor");
        ListPaymentInstrumentsQueryParams queryParams = (ListPaymentInstrumentsQueryParams) getQueryParam(response.getPage(),
            listPaymentInstrumentsQueryParams,
            hasNextCursor);
        Boolean reachedEnd = reachedEnd(response.getPage(), hasNextCursor);
        NextFetchFunction nextFetch = (a) -> {
            queryParams.setLimit(a);
            if (reachedEnd) {
            throw new ArrayIndexOutOfBoundsException();
            }
            return this.list( queryParams);
        };
        FinixList currList = new FinixList(nextFetch, !reachedEnd);
        if (response.getEmbedded() != null){
            String fieldName = getFieldName(response.getEmbedded());
            String fieldGet = "get" + fieldName;
            try{
                Method getList = response.getEmbedded().getClass().getMethod(fieldGet);
                Collection<Object> embeddedList = (Collection<Object>) getList.invoke(response.getEmbedded());

                if (embeddedList.size() < response.getPage().getLimit()){
                    currList = new FinixList<>(nextFetch, false);
                }
                for(Object item : embeddedList)
                {
                    currList.add(item);
                }
            } catch (Exception e){
                throw new ApiException(e.getMessage());
            }
        }
        currList.setPage(response.getPage());
        currList.setLinks(response.getLinks());
        return currList;
    }
    /**
    * Build call for updatePaymentInstrument
        * @param paymentInstrumentId ID of object (required)
        * @param updatePaymentInstrumentRequest  (optional)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single Payment Instrument object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call updatePaymentInstrumentCall(String paymentInstrumentId, UpdatePaymentInstrumentRequest updatePaymentInstrumentRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updatePaymentInstrumentRequest;

    // create path and map variables
        String localVarPath = "/payment_instruments/{payment_instrument_id}"
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
            "application/hal+json"
        };
        final String localVarContentType = localVarFinixClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("Finix-Version", "2022-02-01");
        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return localVarFinixClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

        @SuppressWarnings("rawtypes")
    private okhttp3.Call updatePaymentInstrumentValidateBeforeCall(String paymentInstrumentId, UpdatePaymentInstrumentRequest updatePaymentInstrumentRequest, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'paymentInstrumentId' is set
        if (paymentInstrumentId == null) {
            throw new ApiException("Missing the required parameter 'paymentInstrumentId' when calling updatePaymentInstrument(Async)");
        }
    

        okhttp3.Call localVarCall = updatePaymentInstrumentCall(paymentInstrumentId, updatePaymentInstrumentRequest, _callback);
        return localVarCall;

    }

            /**
            * Update a Payment Instrument
            * Update a &#x60;Payment Instrument&#x60;.
                * @param paymentInstrumentId ID of object (required)
                * @param updatePaymentInstrumentRequest  (optional)
                * @return PaymentInstrument
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single Payment Instrument object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public PaymentInstrument update(String paymentInstrumentId, UpdatePaymentInstrumentRequest updatePaymentInstrumentRequest) throws ApiException {
        ApiResponse<PaymentInstrument> localVarResp = updatePaymentInstrumentWithHttpInfo(paymentInstrumentId, updatePaymentInstrumentRequest);
        return localVarResp.getData();
    }


    /**
        * Update a Payment Instrument
        * Update a &#x60;Payment Instrument&#x60;.
            * @param paymentInstrumentId ID of object (required)
            * @param updatePaymentInstrumentRequest  (optional)
        * @return ApiResponse&lt;PaymentInstrument&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Payment Instrument object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<PaymentInstrument> updatePaymentInstrumentWithHttpInfo(String paymentInstrumentId, UpdatePaymentInstrumentRequest updatePaymentInstrumentRequest) throws ApiException {
        okhttp3.Call localVarCall = updatePaymentInstrumentValidateBeforeCall(paymentInstrumentId, updatePaymentInstrumentRequest, null);
        Type localVarReturnType = new TypeToken<PaymentInstrument>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Update a Payment Instrument (asynchronously)
        * Update a &#x60;Payment Instrument&#x60;.
            * @param paymentInstrumentId ID of object (required)
            * @param updatePaymentInstrumentRequest  (optional)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Payment Instrument object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call updatePaymentInstrumentAsync(String paymentInstrumentId, UpdatePaymentInstrumentRequest updatePaymentInstrumentRequest, final ApiCallback<PaymentInstrument> _callback) throws ApiException {

        okhttp3.Call localVarCall = updatePaymentInstrumentValidateBeforeCall(paymentInstrumentId, updatePaymentInstrumentRequest, _callback);
        Type localVarReturnType = new TypeToken<PaymentInstrument>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    private String getFieldName(Object response){
        Field[] methods = response.getClass().getFields();
        Field[] testMethods = response.getClass().getDeclaredFields();
        List<Field> a = Arrays.asList(methods);
        List<Field> b = Arrays.asList(testMethods);
        List<Field> diff = b.stream().filter(element -> !a.contains(element)).collect(Collectors.toList());
        String fieldName = diff.get(0).getName();
        return  fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }

    private Object getQueryParam(Object pageObject, Object queryParam, Boolean hasCursor) throws ApiException {
        try {
            if (hasCursor) {
                Method setCursor = queryParam.getClass().getMethod("setAfterCursor", String.class);
                Method getOffset = pageObject.getClass().getMethod("getNextCursor");
                String nextCursor = (String) getOffset.invoke(pageObject);
                setCursor.invoke(queryParam, nextCursor);
            } else {
                Method setOffset = queryParam.getClass().getMethod("setOffset", Long.class);
                Method getOffset = pageObject.getClass().getMethod("getOffset");
                Method getLimit = pageObject.getClass().getMethod("getLimit");
                Long limit = (Long) getLimit.invoke(pageObject);
                Long offset = (Long) getOffset.invoke(pageObject);
                setOffset.invoke(queryParam, offset + limit);
            }
        } catch (Exception e) {
            throw new ApiException(e.getMessage());
        }
        return queryParam;
    }

    private Boolean reachedEnd(Object pageObject, Boolean hasCursor) throws ApiException{
        int endOfList = 0;
        try {
            if (hasCursor){
                Method getOffset = pageObject.getClass().getMethod("getNextCursor");
                String nextCursor = (String) getOffset.invoke(pageObject);
                if (nextCursor == null){
                    endOfList += 1;
                }
            }
            else{
                Method getOffset = pageObject.getClass().getMethod("getOffset");
                Method getLimit = pageObject.getClass().getMethod("getLimit");
                Method getCount = pageObject.getClass().getMethod("getCount");
                Long offset = (Long) getOffset.invoke(pageObject);
                Long limit = (Long) getLimit.invoke(pageObject);
                Long count = (Long) getCount.invoke(pageObject);
                if (offset + limit > count){
                    endOfList += 1;
                }
            }
        } catch (Exception e) {
            throw new ApiException(e.getMessage());
        }
        if (endOfList == 1){ return true;}
        return false;
    }
}
