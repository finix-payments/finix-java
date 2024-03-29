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

import model.BalanceTransfer;
import model.BalanceTransferList;
import model.CreateBalanceTransferRequest;
import model.Error401Unauthorized;
import model.Error403ForbiddenList;
import model.Error404NotFoundList;
import model.Error406NotAcceptable;
import model.ErrorGeneric;

import model.ListBalanceTransfersQueryParams;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class BalanceTransfersApi {
    private FinixClient localVarFinixClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BalanceTransfersApi() {
        this(Configuration.getDefaultFinixClient());
    }

    public BalanceTransfersApi(FinixClient finixClient) {
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
    * Build call for createBalanceTransfer
        * @param createBalanceTransferRequest  (optional)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 201 </td><td> Single balance_transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call createBalanceTransferCall(CreateBalanceTransferRequest createBalanceTransferRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createBalanceTransferRequest;

    // create path and map variables
        String localVarPath = "/balance_transfers";

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
    private okhttp3.Call createBalanceTransferValidateBeforeCall(CreateBalanceTransferRequest createBalanceTransferRequest, final ApiCallback _callback) throws ApiException {
    

        okhttp3.Call localVarCall = createBalanceTransferCall(createBalanceTransferRequest, _callback);
        return localVarCall;

    }

            /**
            * Create a Balance Transfer
            * Create a &#x60;balance_transfer&#x60;.
                * @param createBalanceTransferRequest  (optional)
                * @return BalanceTransfer
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 201 </td><td> Single balance_transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public BalanceTransfer create(CreateBalanceTransferRequest createBalanceTransferRequest) throws ApiException {
        ApiResponse<BalanceTransfer> localVarResp = createBalanceTransferWithHttpInfo(createBalanceTransferRequest);
        return localVarResp.getData();
    }


    /**
        * Create a Balance Transfer
        * Create a &#x60;balance_transfer&#x60;.
            * @param createBalanceTransferRequest  (optional)
        * @return ApiResponse&lt;BalanceTransfer&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single balance_transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<BalanceTransfer> createBalanceTransferWithHttpInfo(CreateBalanceTransferRequest createBalanceTransferRequest) throws ApiException {
        okhttp3.Call localVarCall = createBalanceTransferValidateBeforeCall(createBalanceTransferRequest, null);
        Type localVarReturnType = new TypeToken<BalanceTransfer>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Create a Balance Transfer (asynchronously)
        * Create a &#x60;balance_transfer&#x60;.
            * @param createBalanceTransferRequest  (optional)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single balance_transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call createBalanceTransferAsync(CreateBalanceTransferRequest createBalanceTransferRequest, final ApiCallback<BalanceTransfer> _callback) throws ApiException {

        okhttp3.Call localVarCall = createBalanceTransferValidateBeforeCall(createBalanceTransferRequest, _callback);
        Type localVarReturnType = new TypeToken<BalanceTransfer>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Build call for getBalanceTransfers
        * @param balanceTransfersId ID of the &#x60;balance_transfer&#x60; resource. (required)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single balance_transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call getBalanceTransfersCall(String balanceTransfersId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/balance_transfers/{balance_transfers_id}"
            .replaceAll("\\{" + "balance_transfers_id" + "\\}", localVarFinixClient.escapeString(balanceTransfersId.toString()));

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
    private okhttp3.Call getBalanceTransfersValidateBeforeCall(String balanceTransfersId, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'balanceTransfersId' is set
        if (balanceTransfersId == null) {
            throw new ApiException("Missing the required parameter 'balanceTransfersId' when calling getBalanceTransfers(Async)");
        }
    

        okhttp3.Call localVarCall = getBalanceTransfersCall(balanceTransfersId, _callback);
        return localVarCall;

    }

            /**
            * Fetch a Balance Transfer
            * Retrieve the details of a &#x60;balance_transfer&#x60;.
                * @param balanceTransfersId ID of the &#x60;balance_transfer&#x60; resource. (required)
                * @return BalanceTransfer
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single balance_transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public BalanceTransfer get(String balanceTransfersId) throws ApiException {
        ApiResponse<BalanceTransfer> localVarResp = getBalanceTransfersWithHttpInfo(balanceTransfersId);
        return localVarResp.getData();
    }


    /**
        * Fetch a Balance Transfer
        * Retrieve the details of a &#x60;balance_transfer&#x60;.
            * @param balanceTransfersId ID of the &#x60;balance_transfer&#x60; resource. (required)
        * @return ApiResponse&lt;BalanceTransfer&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single balance_transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<BalanceTransfer> getBalanceTransfersWithHttpInfo(String balanceTransfersId) throws ApiException {
        okhttp3.Call localVarCall = getBalanceTransfersValidateBeforeCall(balanceTransfersId, null);
        Type localVarReturnType = new TypeToken<BalanceTransfer>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Fetch a Balance Transfer (asynchronously)
        * Retrieve the details of a &#x60;balance_transfer&#x60;.
            * @param balanceTransfersId ID of the &#x60;balance_transfer&#x60; resource. (required)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single balance_transfer object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call getBalanceTransfersAsync(String balanceTransfersId, final ApiCallback<BalanceTransfer> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBalanceTransfersValidateBeforeCall(balanceTransfersId, _callback);
        Type localVarReturnType = new TypeToken<BalanceTransfer>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    private okhttp3.Call listBalanceTransfersCall(Long limit, Long offset, Long pageNumber, Long pageSize, String createdAtGte, String createdAtLte, String updatedAtGte, String updatedAtLte, String idempotencyId, Long amount, String description, String destination, String externalReferenceId, String referenceId, String source, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/balance_transfers";

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

        if (pageNumber != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("pageNumber", pageNumber));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("pageSize", pageSize));
        }

        if (createdAtGte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("created_at.gte", createdAtGte));
        }

        if (createdAtLte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("created_at.lte", createdAtLte));
        }

        if (updatedAtGte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("updated_at.gte", updatedAtGte));
        }

        if (updatedAtLte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("updated_at.lte", updatedAtLte));
        }

        if (idempotencyId != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("idempotency_id", idempotencyId));
        }

        if (amount != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("amount", amount));
        }

        if (description != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("description", description));
        }

        if (destination != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("destination", destination));
        }

        if (externalReferenceId != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("external_reference_id", externalReferenceId));
        }

        if (referenceId != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("reference_id", referenceId));
        }

        if (source != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("source", source));
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
    private okhttp3.Call listBalanceTransfersValidateBeforeCall(Long limit, Long offset, Long pageNumber, Long pageSize, String createdAtGte, String createdAtLte, String updatedAtGte, String updatedAtLte, String idempotencyId, Long amount, String description, String destination, String externalReferenceId, String referenceId, String source, final ApiCallback _callback) throws ApiException {
    

        okhttp3.Call localVarCall = listBalanceTransfersCall(limit, offset, pageNumber, pageSize, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, idempotencyId, amount, description, destination, externalReferenceId, referenceId, source, _callback);
        return localVarCall;

    }


    private ApiResponse<BalanceTransferList> listBalanceTransfersWithHttpInfo(Long limit, Long offset, Long pageNumber, Long pageSize, String createdAtGte, String createdAtLte, String updatedAtGte, String updatedAtLte, String idempotencyId, Long amount, String description, String destination, String externalReferenceId, String referenceId, String source) throws ApiException {
        okhttp3.Call localVarCall = listBalanceTransfersValidateBeforeCall(limit, offset, pageNumber, pageSize, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, idempotencyId, amount, description, destination, externalReferenceId, referenceId, source, null);
        Type localVarReturnType = new TypeToken<BalanceTransferList>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listBalanceTransfersAsync(Long limit, Long offset, Long pageNumber, Long pageSize, String createdAtGte, String createdAtLte, String updatedAtGte, String updatedAtLte, String idempotencyId, Long amount, String description, String destination, String externalReferenceId, String referenceId, String source, final ApiCallback<BalanceTransferList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listBalanceTransfersValidateBeforeCall(limit, offset, pageNumber, pageSize, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, idempotencyId, amount, description, destination, externalReferenceId, referenceId, source, _callback);
        Type localVarReturnType = new TypeToken<BalanceTransferList>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistBalanceTransfersRequest {
        private Long limit;
        private Long offset;
        private Long pageNumber;
        private Long pageSize;
        private String createdAtGte;
        private String createdAtLte;
        private String updatedAtGte;
        private String updatedAtLte;
        private String idempotencyId;
        private Long amount;
        private String description;
        private String destination;
        private String externalReferenceId;
        private String referenceId;
        private String source;

        private APIlistBalanceTransfersRequest() {
        }

        /**
        * Set limit
        * @param limit The numbers of items to return. (optional)
        * @return APIlistBalanceTransfersRequest
        */
        public APIlistBalanceTransfersRequest limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
        * Set offset
        * @param offset The number of items to skip before starting to collect the result set. (optional)
        * @return APIlistBalanceTransfersRequest
        */
        public APIlistBalanceTransfersRequest offset(Long offset) {
            this.offset = offset;
            return this;
        }

        /**
        * Set pageNumber
        * @param pageNumber The page number to list. (optional)
        * @return APIlistBalanceTransfersRequest
        */
        public APIlistBalanceTransfersRequest pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
        * Set pageSize
        * @param pageSize The size of the page. (optional)
        * @return APIlistBalanceTransfersRequest
        */
        public APIlistBalanceTransfersRequest pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
        * Set createdAtGte
        * @param createdAtGte Filter where &#x60;created_at&#x60; is after the given date. (optional)
        * @return APIlistBalanceTransfersRequest
        */
        public APIlistBalanceTransfersRequest createdAtGte(String createdAtGte) {
            this.createdAtGte = createdAtGte;
            return this;
        }

        /**
        * Set createdAtLte
        * @param createdAtLte Filter where &#x60;created_at&#x60; is before the given date. (optional)
        * @return APIlistBalanceTransfersRequest
        */
        public APIlistBalanceTransfersRequest createdAtLte(String createdAtLte) {
            this.createdAtLte = createdAtLte;
            return this;
        }

        /**
        * Set updatedAtGte
        * @param updatedAtGte Filter where &#x60;updated_at&#x60; is after the given date. (optional)
        * @return APIlistBalanceTransfersRequest
        */
        public APIlistBalanceTransfersRequest updatedAtGte(String updatedAtGte) {
            this.updatedAtGte = updatedAtGte;
            return this;
        }

        /**
        * Set updatedAtLte
        * @param updatedAtLte Filter where &#x60;updated_at&#x60; is before the given date. (optional)
        * @return APIlistBalanceTransfersRequest
        */
        public APIlistBalanceTransfersRequest updatedAtLte(String updatedAtLte) {
            this.updatedAtLte = updatedAtLte;
            return this;
        }

        /**
        * Set idempotencyId
        * @param idempotencyId Filter by &#x60;idempotency_id&#x60;. (optional)
        * @return APIlistBalanceTransfersRequest
        */
        public APIlistBalanceTransfersRequest idempotencyId(String idempotencyId) {
            this.idempotencyId = idempotencyId;
            return this;
        }

        /**
        * Set amount
        * @param amount Filter by an amount equal to the given value. (optional)
        * @return APIlistBalanceTransfersRequest
        */
        public APIlistBalanceTransfersRequest amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
        * Set description
        * @param description Filter by the &#x60;Description&#x60; value . (optional)
        * @return APIlistBalanceTransfersRequest
        */
        public APIlistBalanceTransfersRequest description(String description) {
            this.description = description;
            return this;
        }

        /**
        * Set destination
        * @param destination Filter by the &#x60;Payment Instrument&#x60; saved in &#x60;Destination&#x60;. (optional)
        * @return APIlistBalanceTransfersRequest
        */
        public APIlistBalanceTransfersRequest destination(String destination) {
            this.destination = destination;
            return this;
        }

        /**
        * Set externalReferenceId
        * @param externalReferenceId Filter by the value saved in &#x60;external_reference_id&#x60;. (optional)
        * @return APIlistBalanceTransfersRequest
        */
        public APIlistBalanceTransfersRequest externalReferenceId(String externalReferenceId) {
            this.externalReferenceId = externalReferenceId;
            return this;
        }

        /**
        * Set referenceId
        * @param referenceId Filter by the value saved in &#x60;reference_id&#x60;. (optional)
        * @return APIlistBalanceTransfersRequest
        */
        public APIlistBalanceTransfersRequest referenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }

        /**
        * Set source
        * @param source Filter by the &#x60;Payment Instrument&#x60; saved in &#x60;source&#x60;. (optional)
        * @return APIlistBalanceTransfersRequest
        */
        public APIlistBalanceTransfersRequest source(String source) {
            this.source = source;
            return this;
        }

        /**
        * Build call for listBalanceTransfers
        * @param _callback ApiCallback API callback
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of balance_transfer objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listBalanceTransfersCall(limit, offset, pageNumber, pageSize, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, idempotencyId, amount, description, destination, externalReferenceId, referenceId, source, _callback);
        }

        /**
        * Execute listBalanceTransfers request
            * @return BalanceTransferList
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of balance_transfer objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public BalanceTransferList execute() throws ApiException {
            ApiResponse<BalanceTransferList> localVarResp = listBalanceTransfersWithHttpInfo(limit, offset, pageNumber, pageSize, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, idempotencyId, amount, description, destination, externalReferenceId, referenceId, source);
            return localVarResp.getData();
        }

        /**
        * Execute listBalanceTransfers request with HTTP info returned
        * @return ApiResponse&lt;BalanceTransferList&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of balance_transfer objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public ApiResponse<BalanceTransferList> executeWithHttpInfo() throws ApiException {
            return listBalanceTransfersWithHttpInfo(limit, offset, pageNumber, pageSize, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, idempotencyId, amount, description, destination, externalReferenceId, referenceId, source);
        }

        /**
        * Execute listBalanceTransfers request (asynchronously)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of balance_transfer objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call executeAsync(final ApiCallback<BalanceTransferList> _callback) throws ApiException {
            return listBalanceTransfersAsync(limit, offset, pageNumber, pageSize, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, idempotencyId, amount, description, destination, externalReferenceId, referenceId, source, _callback);
        }
    }

    /**
    * List Balance Transfers
    * Retrieve a list of &#x60;balance_transfers&#x60;.
    * @return APIlistBalanceTransfersRequest
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> List of balance_transfer objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public FinixList list( ListBalanceTransfersQueryParams listBalanceTransfersQueryParams)
        throws ApiException{

        APIlistBalanceTransfersRequest request = new APIlistBalanceTransfersRequest();
        request.limit(listBalanceTransfersQueryParams.getLimit());
        request.offset(listBalanceTransfersQueryParams.getOffset());
        request.pageNumber(listBalanceTransfersQueryParams.getPageNumber());
        request.pageSize(listBalanceTransfersQueryParams.getPageSize());
        request.createdAtGte(listBalanceTransfersQueryParams.getCreatedAtGte());
        request.createdAtLte(listBalanceTransfersQueryParams.getCreatedAtLte());
        request.updatedAtGte(listBalanceTransfersQueryParams.getUpdatedAtGte());
        request.updatedAtLte(listBalanceTransfersQueryParams.getUpdatedAtLte());
        request.idempotencyId(listBalanceTransfersQueryParams.getIdempotencyId());
        request.amount(listBalanceTransfersQueryParams.getAmount());
        request.description(listBalanceTransfersQueryParams.getDescription());
        request.destination(listBalanceTransfersQueryParams.getDestination());
        request.externalReferenceId(listBalanceTransfersQueryParams.getExternalReferenceId());
        request.referenceId(listBalanceTransfersQueryParams.getReferenceId());
        request.source(listBalanceTransfersQueryParams.getSource());
        BalanceTransferList response = request.execute();
        Boolean hasNextCursor = (response.getPage().getClass().getName() == "model.PageCursor");
        ListBalanceTransfersQueryParams queryParams = (ListBalanceTransfersQueryParams) getQueryParam(response.getPage(),
            listBalanceTransfersQueryParams,
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
