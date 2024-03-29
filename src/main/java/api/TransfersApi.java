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

import model.CreateReversalRequest;
import model.CreateTransferRequest;
import model.Error401Unauthorized;
import model.Error402PaymentRequired;
import model.Error403ForbiddenList;
import model.Error404NotFoundList;
import model.Error406NotAcceptable;
import model.Error422InvalidFieldList;
import model.ErrorGeneric;
import model.Transfer;
import model.TransfersList;
import model.UpdateTransferRequest;

import model.ListTransferReversalsQueryParams;
import model.ListTransfersQueryParams;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TransfersApi {
    private FinixClient localVarFinixClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TransfersApi() {
        this(Configuration.getDefaultFinixClient());
    }

    public TransfersApi(FinixClient finixClient) {
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
    * Build call for createTransfer
        * @param createTransferRequest  (optional)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 201 </td><td> Single Transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 402 </td><td> 402 - Payment required </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call createTransferCall(CreateTransferRequest createTransferRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createTransferRequest;

    // create path and map variables
        String localVarPath = "/transfers";

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
    private okhttp3.Call createTransferValidateBeforeCall(CreateTransferRequest createTransferRequest, final ApiCallback _callback) throws ApiException {
    

        okhttp3.Call localVarCall = createTransferCall(createTransferRequest, _callback);
        return localVarCall;

    }

            /**
            * Create a Transfer
            * Create a &#x60;Transfer&#x60;.   &gt; By default, Finix implements a 3 (business) day delay when debiting bank accounts (i.e. eChecks).
                * @param createTransferRequest  (optional)
                * @return Transfer
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 201 </td><td> Single Transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 402 </td><td> 402 - Payment required </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public Transfer create(CreateTransferRequest createTransferRequest) throws ApiException {
        ApiResponse<Transfer> localVarResp = createTransferWithHttpInfo(createTransferRequest);
        return localVarResp.getData();
    }


    /**
        * Create a Transfer
        * Create a &#x60;Transfer&#x60;.   &gt; By default, Finix implements a 3 (business) day delay when debiting bank accounts (i.e. eChecks).
            * @param createTransferRequest  (optional)
        * @return ApiResponse&lt;Transfer&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single Transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 402 </td><td> 402 - Payment required </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<Transfer> createTransferWithHttpInfo(CreateTransferRequest createTransferRequest) throws ApiException {
        okhttp3.Call localVarCall = createTransferValidateBeforeCall(createTransferRequest, null);
        Type localVarReturnType = new TypeToken<Transfer>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Create a Transfer (asynchronously)
        * Create a &#x60;Transfer&#x60;.   &gt; By default, Finix implements a 3 (business) day delay when debiting bank accounts (i.e. eChecks).
            * @param createTransferRequest  (optional)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single Transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 402 </td><td> 402 - Payment required </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call createTransferAsync(CreateTransferRequest createTransferRequest, final ApiCallback<Transfer> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTransferValidateBeforeCall(createTransferRequest, _callback);
        Type localVarReturnType = new TypeToken<Transfer>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Build call for createTransferReversal
        * @param transferId ID of &#x60;Transfer&#x60; object. (required)
        * @param createReversalRequest  (optional)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 201 </td><td> Single Transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 422 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call createTransferReversalCall(String transferId, CreateReversalRequest createReversalRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createReversalRequest;

    // create path and map variables
        String localVarPath = "/transfers/{transfer_id}/reversals"
            .replaceAll("\\{" + "transfer_id" + "\\}", localVarFinixClient.escapeString(transferId.toString()));

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
    private okhttp3.Call createTransferReversalValidateBeforeCall(String transferId, CreateReversalRequest createReversalRequest, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'transferId' is set
        if (transferId == null) {
            throw new ApiException("Missing the required parameter 'transferId' when calling createTransferReversal(Async)");
        }
    

        okhttp3.Call localVarCall = createTransferReversalCall(transferId, createReversalRequest, _callback);
        return localVarCall;

    }

            /**
            * Refund or Reverse a Transfer
            * Reverse a transfer with a &#x60;type&#x60; of **DEBIT**. This reversal creates a new &#x60;Transfer&#x60; resource with a &#x60;type&#x60; of **REVERSAL**.   The refund can get delivered in most cases without the physical card. The card only needs to be swiped (to receive the refund) when:  - The payment type is **DEBIT**, and the transaction is no longer in the Settlement batch. - The payment type is **CREDIT**, and the transaction is no longer in the batch and is older than 45 days.
                * @param transferId ID of &#x60;Transfer&#x60; object. (required)
                * @param createReversalRequest  (optional)
                * @return Transfer
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 201 </td><td> Single Transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 422 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public Transfer createTransferReversal(String transferId, CreateReversalRequest createReversalRequest) throws ApiException {
        ApiResponse<Transfer> localVarResp = createTransferReversalWithHttpInfo(transferId, createReversalRequest);
        return localVarResp.getData();
    }


    /**
        * Refund or Reverse a Transfer
        * Reverse a transfer with a &#x60;type&#x60; of **DEBIT**. This reversal creates a new &#x60;Transfer&#x60; resource with a &#x60;type&#x60; of **REVERSAL**.   The refund can get delivered in most cases without the physical card. The card only needs to be swiped (to receive the refund) when:  - The payment type is **DEBIT**, and the transaction is no longer in the Settlement batch. - The payment type is **CREDIT**, and the transaction is no longer in the batch and is older than 45 days.
            * @param transferId ID of &#x60;Transfer&#x60; object. (required)
            * @param createReversalRequest  (optional)
        * @return ApiResponse&lt;Transfer&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single Transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 422 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<Transfer> createTransferReversalWithHttpInfo(String transferId, CreateReversalRequest createReversalRequest) throws ApiException {
        okhttp3.Call localVarCall = createTransferReversalValidateBeforeCall(transferId, createReversalRequest, null);
        Type localVarReturnType = new TypeToken<Transfer>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Refund or Reverse a Transfer (asynchronously)
        * Reverse a transfer with a &#x60;type&#x60; of **DEBIT**. This reversal creates a new &#x60;Transfer&#x60; resource with a &#x60;type&#x60; of **REVERSAL**.   The refund can get delivered in most cases without the physical card. The card only needs to be swiped (to receive the refund) when:  - The payment type is **DEBIT**, and the transaction is no longer in the Settlement batch. - The payment type is **CREDIT**, and the transaction is no longer in the batch and is older than 45 days.
            * @param transferId ID of &#x60;Transfer&#x60; object. (required)
            * @param createReversalRequest  (optional)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single Transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 422 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call createTransferReversalAsync(String transferId, CreateReversalRequest createReversalRequest, final ApiCallback<Transfer> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTransferReversalValidateBeforeCall(transferId, createReversalRequest, _callback);
        Type localVarReturnType = new TypeToken<Transfer>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Build call for getTransfer
        * @param transferId ID of &#x60;Transfer&#x60; resource. (required)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single Transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call getTransferCall(String transferId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/transfers/{transfer_id}"
            .replaceAll("\\{" + "transfer_id" + "\\}", localVarFinixClient.escapeString(transferId.toString()));

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
    private okhttp3.Call getTransferValidateBeforeCall(String transferId, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'transferId' is set
        if (transferId == null) {
            throw new ApiException("Missing the required parameter 'transferId' when calling getTransfer(Async)");
        }
    

        okhttp3.Call localVarCall = getTransferCall(transferId, _callback);
        return localVarCall;

    }

            /**
            * Fetch a Transfer
            * Retrieve a &#x60;Transfer&#x60;.
                * @param transferId ID of &#x60;Transfer&#x60; resource. (required)
                * @return Transfer
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single Transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public Transfer get(String transferId) throws ApiException {
        ApiResponse<Transfer> localVarResp = getTransferWithHttpInfo(transferId);
        return localVarResp.getData();
    }


    /**
        * Fetch a Transfer
        * Retrieve a &#x60;Transfer&#x60;.
            * @param transferId ID of &#x60;Transfer&#x60; resource. (required)
        * @return ApiResponse&lt;Transfer&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<Transfer> getTransferWithHttpInfo(String transferId) throws ApiException {
        okhttp3.Call localVarCall = getTransferValidateBeforeCall(transferId, null);
        Type localVarReturnType = new TypeToken<Transfer>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Fetch a Transfer (asynchronously)
        * Retrieve a &#x60;Transfer&#x60;.
            * @param transferId ID of &#x60;Transfer&#x60; resource. (required)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call getTransferAsync(String transferId, final ApiCallback<Transfer> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTransferValidateBeforeCall(transferId, _callback);
        Type localVarReturnType = new TypeToken<Transfer>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    private okhttp3.Call listTransferReversalsCall(String transferId, Long limit, String afterCursor, String beforeCursor, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/transfers/{transfer_id}/reversals"
            .replaceAll("\\{" + "transfer_id" + "\\}", localVarFinixClient.escapeString(transferId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("limit", limit));
        }

        if (afterCursor != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("after_cursor", afterCursor));
        }

        if (beforeCursor != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("before_cursor", beforeCursor));
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
    private okhttp3.Call listTransferReversalsValidateBeforeCall(String transferId, Long limit, String afterCursor, String beforeCursor, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'transferId' is set
        if (transferId == null) {
            throw new ApiException("Missing the required parameter 'transferId' when calling listTransferReversals(Async)");
        }
    

        okhttp3.Call localVarCall = listTransferReversalsCall(transferId, limit, afterCursor, beforeCursor, _callback);
        return localVarCall;

    }


    private ApiResponse<TransfersList> listTransferReversalsWithHttpInfo(String transferId, Long limit, String afterCursor, String beforeCursor) throws ApiException {
        okhttp3.Call localVarCall = listTransferReversalsValidateBeforeCall(transferId, limit, afterCursor, beforeCursor, null);
        Type localVarReturnType = new TypeToken<TransfersList>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listTransferReversalsAsync(String transferId, Long limit, String afterCursor, String beforeCursor, final ApiCallback<TransfersList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listTransferReversalsValidateBeforeCall(transferId, limit, afterCursor, beforeCursor, _callback);
        Type localVarReturnType = new TypeToken<TransfersList>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistTransferReversalsRequest {
        private final String transferId;
        private Long limit;
        private String afterCursor;
        private String beforeCursor;

        private APIlistTransferReversalsRequest(String transferId) {
            this.transferId = transferId;
        }

        /**
        * Set limit
        * @param limit The number of entries to return. (optional)
        * @return APIlistTransferReversalsRequest
        */
        public APIlistTransferReversalsRequest limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
        * Set afterCursor
        * @param afterCursor Return every resource created after the cursor value. (optional)
        * @return APIlistTransferReversalsRequest
        */
        public APIlistTransferReversalsRequest afterCursor(String afterCursor) {
            this.afterCursor = afterCursor;
            return this;
        }

        /**
        * Set beforeCursor
        * @param beforeCursor Return every resource created before the cursor value. (optional)
        * @return APIlistTransferReversalsRequest
        */
        public APIlistTransferReversalsRequest beforeCursor(String beforeCursor) {
            this.beforeCursor = beforeCursor;
            return this;
        }

        /**
        * Build call for listTransferReversals
        * @param _callback ApiCallback API callback
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Reversals </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listTransferReversalsCall(transferId, limit, afterCursor, beforeCursor, _callback);
        }

        /**
        * Execute listTransferReversals request
            * @return TransfersList
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Reversals </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public TransfersList execute() throws ApiException {
            ApiResponse<TransfersList> localVarResp = listTransferReversalsWithHttpInfo(transferId, limit, afterCursor, beforeCursor);
            return localVarResp.getData();
        }

        /**
        * Execute listTransferReversals request with HTTP info returned
        * @return ApiResponse&lt;TransfersList&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Reversals </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public ApiResponse<TransfersList> executeWithHttpInfo() throws ApiException {
            return listTransferReversalsWithHttpInfo(transferId, limit, afterCursor, beforeCursor);
        }

        /**
        * Execute listTransferReversals request (asynchronously)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Reversals </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call executeAsync(final ApiCallback<TransfersList> _callback) throws ApiException {
            return listTransferReversalsAsync(transferId, limit, afterCursor, beforeCursor, _callback);
        }
    }

    /**
    * List Reversals on a Transfer
    * Retrieve a list of reversals for a &#x60;Transfer&#x60;.
        * @param transferId ID of &#x60;Transfer&#x60; object. (required)
    * @return APIlistTransferReversalsRequest
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> List of Reversals </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public FinixList listTransfersReversals(String transferId,  ListTransferReversalsQueryParams listTransferReversalsQueryParams)
        throws ApiException{

        APIlistTransferReversalsRequest request = new APIlistTransferReversalsRequest(transferId);
        request.limit(listTransferReversalsQueryParams.getLimit());
        request.afterCursor(listTransferReversalsQueryParams.getAfterCursor());
        request.beforeCursor(listTransferReversalsQueryParams.getBeforeCursor());
        TransfersList response = request.execute();
        Boolean hasNextCursor = (response.getPage().getClass().getName() == "model.PageCursor");
        ListTransferReversalsQueryParams queryParams = (ListTransferReversalsQueryParams) getQueryParam(response.getPage(),
            listTransferReversalsQueryParams,
            hasNextCursor);
        Boolean reachedEnd = reachedEnd(response.getPage(), hasNextCursor);
        NextFetchFunction nextFetch = (a) -> {
            queryParams.setLimit(a);
            if (reachedEnd) {
            throw new ArrayIndexOutOfBoundsException();
            }
            return this.listTransfersReversals(transferId,  queryParams);
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
    private okhttp3.Call listTransfersCall(String sort, String afterCursor, Long limit, Long amount, Long amountGte, Long amountGt, Long amountLte, Long amountLt, String createdAtGte, String createdAtLte, String idempotencyId, String id, String state, String readyToSettleAtGte, String readyToSettleAtLte, Long statementDescriptor, String traceId, String updatedAtGte, String updatedAtLte, String instrumentBin, String instrumentAccountLast4, String instrumentBrandType, String merchantIdentityId, String merchantIdentityName, String instrumentName, String instrumentType, String merchantId, String merchantMid, String instrumentCardLast4, String merchantProcessorId, String type, String beforeCursor, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/transfers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (sort != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("sort", sort));
        }

        if (afterCursor != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("after_cursor", afterCursor));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("limit", limit));
        }

        if (amount != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("amount", amount));
        }

        if (amountGte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("amount.gte", amountGte));
        }

        if (amountGt != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("amount.gt", amountGt));
        }

        if (amountLte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("amount.lte", amountLte));
        }

        if (amountLt != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("amount.lt", amountLt));
        }

        if (createdAtGte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("created_at.gte", createdAtGte));
        }

        if (createdAtLte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("created_at.lte", createdAtLte));
        }

        if (idempotencyId != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("idempotency_id", idempotencyId));
        }

        if (id != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("id", id));
        }

        if (state != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("state", state));
        }

        if (readyToSettleAtGte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("ready_to_settle_at.gte", readyToSettleAtGte));
        }

        if (readyToSettleAtLte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("ready_to_settle_at.lte", readyToSettleAtLte));
        }

        if (statementDescriptor != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("statement_descriptor", statementDescriptor));
        }

        if (traceId != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("trace_id", traceId));
        }

        if (updatedAtGte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("updated_at.gte", updatedAtGte));
        }

        if (updatedAtLte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("updated_at.lte", updatedAtLte));
        }

        if (instrumentBin != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("instrument_bin", instrumentBin));
        }

        if (instrumentAccountLast4 != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("instrument_account_last4", instrumentAccountLast4));
        }

        if (instrumentBrandType != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("instrument_brand_type", instrumentBrandType));
        }

        if (merchantIdentityId != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("merchant_identity_id", merchantIdentityId));
        }

        if (merchantIdentityName != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("merchant_identity_name", merchantIdentityName));
        }

        if (instrumentName != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("instrument_name", instrumentName));
        }

        if (instrumentType != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("instrument_type", instrumentType));
        }

        if (merchantId != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("merchant_id", merchantId));
        }

        if (merchantMid != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("merchant_mid", merchantMid));
        }

        if (instrumentCardLast4 != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("instrument_card_last4", instrumentCardLast4));
        }

        if (merchantProcessorId != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("merchant_processor_id", merchantProcessorId));
        }

        if (type != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("type", type));
        }

        if (beforeCursor != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("before_cursor", beforeCursor));
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
    private okhttp3.Call listTransfersValidateBeforeCall(String sort, String afterCursor, Long limit, Long amount, Long amountGte, Long amountGt, Long amountLte, Long amountLt, String createdAtGte, String createdAtLte, String idempotencyId, String id, String state, String readyToSettleAtGte, String readyToSettleAtLte, Long statementDescriptor, String traceId, String updatedAtGte, String updatedAtLte, String instrumentBin, String instrumentAccountLast4, String instrumentBrandType, String merchantIdentityId, String merchantIdentityName, String instrumentName, String instrumentType, String merchantId, String merchantMid, String instrumentCardLast4, String merchantProcessorId, String type, String beforeCursor, final ApiCallback _callback) throws ApiException {
    

        okhttp3.Call localVarCall = listTransfersCall(sort, afterCursor, limit, amount, amountGte, amountGt, amountLte, amountLt, createdAtGte, createdAtLte, idempotencyId, id, state, readyToSettleAtGte, readyToSettleAtLte, statementDescriptor, traceId, updatedAtGte, updatedAtLte, instrumentBin, instrumentAccountLast4, instrumentBrandType, merchantIdentityId, merchantIdentityName, instrumentName, instrumentType, merchantId, merchantMid, instrumentCardLast4, merchantProcessorId, type, beforeCursor, _callback);
        return localVarCall;

    }


    private ApiResponse<TransfersList> listTransfersWithHttpInfo(String sort, String afterCursor, Long limit, Long amount, Long amountGte, Long amountGt, Long amountLte, Long amountLt, String createdAtGte, String createdAtLte, String idempotencyId, String id, String state, String readyToSettleAtGte, String readyToSettleAtLte, Long statementDescriptor, String traceId, String updatedAtGte, String updatedAtLte, String instrumentBin, String instrumentAccountLast4, String instrumentBrandType, String merchantIdentityId, String merchantIdentityName, String instrumentName, String instrumentType, String merchantId, String merchantMid, String instrumentCardLast4, String merchantProcessorId, String type, String beforeCursor) throws ApiException {
        okhttp3.Call localVarCall = listTransfersValidateBeforeCall(sort, afterCursor, limit, amount, amountGte, amountGt, amountLte, amountLt, createdAtGte, createdAtLte, idempotencyId, id, state, readyToSettleAtGte, readyToSettleAtLte, statementDescriptor, traceId, updatedAtGte, updatedAtLte, instrumentBin, instrumentAccountLast4, instrumentBrandType, merchantIdentityId, merchantIdentityName, instrumentName, instrumentType, merchantId, merchantMid, instrumentCardLast4, merchantProcessorId, type, beforeCursor, null);
        Type localVarReturnType = new TypeToken<TransfersList>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listTransfersAsync(String sort, String afterCursor, Long limit, Long amount, Long amountGte, Long amountGt, Long amountLte, Long amountLt, String createdAtGte, String createdAtLte, String idempotencyId, String id, String state, String readyToSettleAtGte, String readyToSettleAtLte, Long statementDescriptor, String traceId, String updatedAtGte, String updatedAtLte, String instrumentBin, String instrumentAccountLast4, String instrumentBrandType, String merchantIdentityId, String merchantIdentityName, String instrumentName, String instrumentType, String merchantId, String merchantMid, String instrumentCardLast4, String merchantProcessorId, String type, String beforeCursor, final ApiCallback<TransfersList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listTransfersValidateBeforeCall(sort, afterCursor, limit, amount, amountGte, amountGt, amountLte, amountLt, createdAtGte, createdAtLte, idempotencyId, id, state, readyToSettleAtGte, readyToSettleAtLte, statementDescriptor, traceId, updatedAtGte, updatedAtLte, instrumentBin, instrumentAccountLast4, instrumentBrandType, merchantIdentityId, merchantIdentityName, instrumentName, instrumentType, merchantId, merchantMid, instrumentCardLast4, merchantProcessorId, type, beforeCursor, _callback);
        Type localVarReturnType = new TypeToken<TransfersList>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistTransfersRequest {
        private String sort;
        private String afterCursor;
        private Long limit;
        private Long amount;
        private Long amountGte;
        private Long amountGt;
        private Long amountLte;
        private Long amountLt;
        private String createdAtGte;
        private String createdAtLte;
        private String idempotencyId;
        private String id;
        private String state;
        private String readyToSettleAtGte;
        private String readyToSettleAtLte;
        private Long statementDescriptor;
        private String traceId;
        private String updatedAtGte;
        private String updatedAtLte;
        private String instrumentBin;
        private String instrumentAccountLast4;
        private String instrumentBrandType;
        private String merchantIdentityId;
        private String merchantIdentityName;
        private String instrumentName;
        private String instrumentType;
        private String merchantId;
        private String merchantMid;
        private String instrumentCardLast4;
        private String merchantProcessorId;
        private String type;
        private String beforeCursor;

        private APIlistTransfersRequest() {
        }

        /**
        * Set sort
        * @param sort Specify key to be used for sorting the collection. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest sort(String sort) {
            this.sort = sort;
            return this;
        }

        /**
        * Set afterCursor
        * @param afterCursor Return every resource created after the cursor value. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest afterCursor(String afterCursor) {
            this.afterCursor = afterCursor;
            return this;
        }

        /**
        * Set limit
        * @param limit The numbers of items to return. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
        * Set amount
        * @param amount Filter by an amount equal to the given value. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
        * Set amountGte
        * @param amountGte Filter by an amount greater than or equal. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest amountGte(Long amountGte) {
            this.amountGte = amountGte;
            return this;
        }

        /**
        * Set amountGt
        * @param amountGt Filter by an amount greater than. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest amountGt(Long amountGt) {
            this.amountGt = amountGt;
            return this;
        }

        /**
        * Set amountLte
        * @param amountLte Filter by an amount less than or equal. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest amountLte(Long amountLte) {
            this.amountLte = amountLte;
            return this;
        }

        /**
        * Set amountLt
        * @param amountLt Filter by an amount less than. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest amountLt(Long amountLt) {
            this.amountLt = amountLt;
            return this;
        }

        /**
        * Set createdAtGte
        * @param createdAtGte Filter where &#x60;created_at&#x60; is after the given date. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest createdAtGte(String createdAtGte) {
            this.createdAtGte = createdAtGte;
            return this;
        }

        /**
        * Set createdAtLte
        * @param createdAtLte Filter where &#x60;created_at&#x60; is before the given date. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest createdAtLte(String createdAtLte) {
            this.createdAtLte = createdAtLte;
            return this;
        }

        /**
        * Set idempotencyId
        * @param idempotencyId Filter by &#x60;idempotency_id&#x60;. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest idempotencyId(String idempotencyId) {
            this.idempotencyId = idempotencyId;
            return this;
        }

        /**
        * Set id
        * @param id Filter by &#x60;id&#x60;. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest id(String id) {
            this.id = id;
            return this;
        }

        /**
        * Set state
        * @param state Filter by Transaction state. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest state(String state) {
            this.state = state;
            return this;
        }

        /**
        * Set readyToSettleAtGte
        * @param readyToSettleAtGte Filter by &#x60;ready_to_settle_at&#x60;. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest readyToSettleAtGte(String readyToSettleAtGte) {
            this.readyToSettleAtGte = readyToSettleAtGte;
            return this;
        }

        /**
        * Set readyToSettleAtLte
        * @param readyToSettleAtLte Filter by &#x60;ready_to_settle_at&#x60;. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest readyToSettleAtLte(String readyToSettleAtLte) {
            this.readyToSettleAtLte = readyToSettleAtLte;
            return this;
        }

        /**
        * Set statementDescriptor
        * @param statementDescriptor Filter by &#x60;statement_descriptor&#x60;. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest statementDescriptor(Long statementDescriptor) {
            this.statementDescriptor = statementDescriptor;
            return this;
        }

        /**
        * Set traceId
        * @param traceId Filter by &#x60;trace_id&#x60;. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        /**
        * Set updatedAtGte
        * @param updatedAtGte Filter where &#x60;updated_at&#x60; is after the given date. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest updatedAtGte(String updatedAtGte) {
            this.updatedAtGte = updatedAtGte;
            return this;
        }

        /**
        * Set updatedAtLte
        * @param updatedAtLte Filter where &#x60;updated_at&#x60; is before the given date. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest updatedAtLte(String updatedAtLte) {
            this.updatedAtLte = updatedAtLte;
            return this;
        }

        /**
        * Set instrumentBin
        * @param instrumentBin Filter by Bank Identification Number (BIN). The BIN is the first 6 digits of the masked number. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest instrumentBin(String instrumentBin) {
            this.instrumentBin = instrumentBin;
            return this;
        }

        /**
        * Set instrumentAccountLast4
        * @param instrumentAccountLast4 Filter Transactions by the last 4 digits of the bank account. The bank account last 4 are the last 4 digits of the masked number instrument_account_last4&#x3D;9444 BIN. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest instrumentAccountLast4(String instrumentAccountLast4) {
            this.instrumentAccountLast4 = instrumentAccountLast4;
            return this;
        }

        /**
        * Set instrumentBrandType
        * @param instrumentBrandType Filter by card brand. Available card brand types can be found in the drop-down. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest instrumentBrandType(String instrumentBrandType) {
            this.instrumentBrandType = instrumentBrandType;
            return this;
        }

        /**
        * Set merchantIdentityId
        * @param merchantIdentityId Filter by &#x60;Identity&#x60; ID. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest merchantIdentityId(String merchantIdentityId) {
            this.merchantIdentityId = merchantIdentityId;
            return this;
        }

        /**
        * Set merchantIdentityName
        * @param merchantIdentityName Filter Transactions by &#x60;Identity&#x60; name. The name is not case-sensitive. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest merchantIdentityName(String merchantIdentityName) {
            this.merchantIdentityName = merchantIdentityName;
            return this;
        }

        /**
        * Set instrumentName
        * @param instrumentName Filter Transactions by &#x60;Payment Instrument&#x60; name. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest instrumentName(String instrumentName) {
            this.instrumentName = instrumentName;
            return this;
        }

        /**
        * Set instrumentType
        * @param instrumentType Filter Transactions by &#x60;Payment Instrument&#x60; type. Available instrument types include: Bank Account or Payment Card (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest instrumentType(String instrumentType) {
            this.instrumentType = instrumentType;
            return this;
        }

        /**
        * Set merchantId
        * @param merchantId Filter by &#x60;Merchant&#x60; ID. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest merchantId(String merchantId) {
            this.merchantId = merchantId;
            return this;
        }

        /**
        * Set merchantMid
        * @param merchantMid Filter by Merchant Identification Number (MID). (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest merchantMid(String merchantMid) {
            this.merchantMid = merchantMid;
            return this;
        }

        /**
        * Set instrumentCardLast4
        * @param instrumentCardLast4 Filter by the payment card last 4 digits. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest instrumentCardLast4(String instrumentCardLast4) {
            this.instrumentCardLast4 = instrumentCardLast4;
            return this;
        }

        /**
        * Set merchantProcessorId
        * @param merchantProcessorId Filter by &#x60;Processor&#x60; ID. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest merchantProcessorId(String merchantProcessorId) {
            this.merchantProcessorId = merchantProcessorId;
            return this;
        }

        /**
        * Set type
        * @param type Filter by &#x60;Transfer&#x60; type. Available type filters include: All, Debits, Refunds, or Credits. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest type(String type) {
            this.type = type;
            return this;
        }

        /**
        * Set beforeCursor
        * @param beforeCursor Return every resource created before the cursor value. (optional)
        * @return APIlistTransfersRequest
        */
        public APIlistTransfersRequest beforeCursor(String beforeCursor) {
            this.beforeCursor = beforeCursor;
            return this;
        }

        /**
        * Build call for listTransfers
        * @param _callback ApiCallback API callback
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Transfer objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listTransfersCall(sort, afterCursor, limit, amount, amountGte, amountGt, amountLte, amountLt, createdAtGte, createdAtLte, idempotencyId, id, state, readyToSettleAtGte, readyToSettleAtLte, statementDescriptor, traceId, updatedAtGte, updatedAtLte, instrumentBin, instrumentAccountLast4, instrumentBrandType, merchantIdentityId, merchantIdentityName, instrumentName, instrumentType, merchantId, merchantMid, instrumentCardLast4, merchantProcessorId, type, beforeCursor, _callback);
        }

        /**
        * Execute listTransfers request
            * @return TransfersList
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Transfer objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public TransfersList execute() throws ApiException {
            ApiResponse<TransfersList> localVarResp = listTransfersWithHttpInfo(sort, afterCursor, limit, amount, amountGte, amountGt, amountLte, amountLt, createdAtGte, createdAtLte, idempotencyId, id, state, readyToSettleAtGte, readyToSettleAtLte, statementDescriptor, traceId, updatedAtGte, updatedAtLte, instrumentBin, instrumentAccountLast4, instrumentBrandType, merchantIdentityId, merchantIdentityName, instrumentName, instrumentType, merchantId, merchantMid, instrumentCardLast4, merchantProcessorId, type, beforeCursor);
            return localVarResp.getData();
        }

        /**
        * Execute listTransfers request with HTTP info returned
        * @return ApiResponse&lt;TransfersList&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Transfer objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public ApiResponse<TransfersList> executeWithHttpInfo() throws ApiException {
            return listTransfersWithHttpInfo(sort, afterCursor, limit, amount, amountGte, amountGt, amountLte, amountLt, createdAtGte, createdAtLte, idempotencyId, id, state, readyToSettleAtGte, readyToSettleAtLte, statementDescriptor, traceId, updatedAtGte, updatedAtLte, instrumentBin, instrumentAccountLast4, instrumentBrandType, merchantIdentityId, merchantIdentityName, instrumentName, instrumentType, merchantId, merchantMid, instrumentCardLast4, merchantProcessorId, type, beforeCursor);
        }

        /**
        * Execute listTransfers request (asynchronously)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Transfer objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call executeAsync(final ApiCallback<TransfersList> _callback) throws ApiException {
            return listTransfersAsync(sort, afterCursor, limit, amount, amountGte, amountGt, amountLte, amountLt, createdAtGte, createdAtLte, idempotencyId, id, state, readyToSettleAtGte, readyToSettleAtLte, statementDescriptor, traceId, updatedAtGte, updatedAtLte, instrumentBin, instrumentAccountLast4, instrumentBrandType, merchantIdentityId, merchantIdentityName, instrumentName, instrumentType, merchantId, merchantMid, instrumentCardLast4, merchantProcessorId, type, beforeCursor, _callback);
        }
    }

    /**
    * List Transfers
    * Retrieve a list of &#x60;Transfers&#x60;.
    * @return APIlistTransfersRequest
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> List of Transfer objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public FinixList list( ListTransfersQueryParams listTransfersQueryParams)
        throws ApiException{

        APIlistTransfersRequest request = new APIlistTransfersRequest();
        request.sort(listTransfersQueryParams.getSort());
        request.afterCursor(listTransfersQueryParams.getAfterCursor());
        request.limit(listTransfersQueryParams.getLimit());
        request.amount(listTransfersQueryParams.getAmount());
        request.amountGte(listTransfersQueryParams.getAmountGte());
        request.amountGt(listTransfersQueryParams.getAmountGt());
        request.amountLte(listTransfersQueryParams.getAmountLte());
        request.amountLt(listTransfersQueryParams.getAmountLt());
        request.createdAtGte(listTransfersQueryParams.getCreatedAtGte());
        request.createdAtLte(listTransfersQueryParams.getCreatedAtLte());
        request.idempotencyId(listTransfersQueryParams.getIdempotencyId());
        request.id(listTransfersQueryParams.getId());
        request.state(listTransfersQueryParams.getState());
        request.readyToSettleAtGte(listTransfersQueryParams.getReadyToSettleAtGte());
        request.readyToSettleAtLte(listTransfersQueryParams.getReadyToSettleAtLte());
        request.statementDescriptor(listTransfersQueryParams.getStatementDescriptor());
        request.traceId(listTransfersQueryParams.getTraceId());
        request.updatedAtGte(listTransfersQueryParams.getUpdatedAtGte());
        request.updatedAtLte(listTransfersQueryParams.getUpdatedAtLte());
        request.instrumentBin(listTransfersQueryParams.getInstrumentBin());
        request.instrumentAccountLast4(listTransfersQueryParams.getInstrumentAccountLast4());
        request.instrumentBrandType(listTransfersQueryParams.getInstrumentBrandType());
        request.merchantIdentityId(listTransfersQueryParams.getMerchantIdentityId());
        request.merchantIdentityName(listTransfersQueryParams.getMerchantIdentityName());
        request.instrumentName(listTransfersQueryParams.getInstrumentName());
        request.instrumentType(listTransfersQueryParams.getInstrumentType());
        request.merchantId(listTransfersQueryParams.getMerchantId());
        request.merchantMid(listTransfersQueryParams.getMerchantMid());
        request.instrumentCardLast4(listTransfersQueryParams.getInstrumentCardLast4());
        request.merchantProcessorId(listTransfersQueryParams.getMerchantProcessorId());
        request.type(listTransfersQueryParams.getType());
        request.beforeCursor(listTransfersQueryParams.getBeforeCursor());
        TransfersList response = request.execute();
        Boolean hasNextCursor = (response.getPage().getClass().getName() == "model.PageCursor");
        ListTransfersQueryParams queryParams = (ListTransfersQueryParams) getQueryParam(response.getPage(),
            listTransfersQueryParams,
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
    * Build call for updateTransfer
        * @param transferId ID of &#x60;Transfer&#x60; resource. (required)
        * @param updateTransferRequest  (optional)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single Transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call updateTransferCall(String transferId, UpdateTransferRequest updateTransferRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateTransferRequest;

    // create path and map variables
        String localVarPath = "/transfers/{transfer_id}"
            .replaceAll("\\{" + "transfer_id" + "\\}", localVarFinixClient.escapeString(transferId.toString()));

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
    private okhttp3.Call updateTransferValidateBeforeCall(String transferId, UpdateTransferRequest updateTransferRequest, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'transferId' is set
        if (transferId == null) {
            throw new ApiException("Missing the required parameter 'transferId' when calling updateTransfer(Async)");
        }
    

        okhttp3.Call localVarCall = updateTransferCall(transferId, updateTransferRequest, _callback);
        return localVarCall;

    }

            /**
            * Update a Transfer
            * Update a &#x60;Transfer&#x60;.
                * @param transferId ID of &#x60;Transfer&#x60; resource. (required)
                * @param updateTransferRequest  (optional)
                * @return Transfer
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single Transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public Transfer update(String transferId, UpdateTransferRequest updateTransferRequest) throws ApiException {
        ApiResponse<Transfer> localVarResp = updateTransferWithHttpInfo(transferId, updateTransferRequest);
        return localVarResp.getData();
    }


    /**
        * Update a Transfer
        * Update a &#x60;Transfer&#x60;.
            * @param transferId ID of &#x60;Transfer&#x60; resource. (required)
            * @param updateTransferRequest  (optional)
        * @return ApiResponse&lt;Transfer&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<Transfer> updateTransferWithHttpInfo(String transferId, UpdateTransferRequest updateTransferRequest) throws ApiException {
        okhttp3.Call localVarCall = updateTransferValidateBeforeCall(transferId, updateTransferRequest, null);
        Type localVarReturnType = new TypeToken<Transfer>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Update a Transfer (asynchronously)
        * Update a &#x60;Transfer&#x60;.
            * @param transferId ID of &#x60;Transfer&#x60; resource. (required)
            * @param updateTransferRequest  (optional)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call updateTransferAsync(String transferId, UpdateTransferRequest updateTransferRequest, final ApiCallback<Transfer> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateTransferValidateBeforeCall(transferId, updateTransferRequest, _callback);
        Type localVarReturnType = new TypeToken<Transfer>(){}.getType();
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
