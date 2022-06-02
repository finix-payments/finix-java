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


import model.CreateSubscriptionAmountRequest;
import model.SubscriptionAmount;
import model.SubscriptionAmountList;
import model.UpdateSubscriptionAmountRequest;

import java.lang.reflect.Type;
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;
import javax.ws.rs.core.GenericType;

    public class SubscriptionAmountsApi {
    private FinixClient localVarFinixClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SubscriptionAmountsApi() {
    this(Configuration.getDefaultFinixClient());
    }

    public SubscriptionAmountsApi(FinixClient finixClient) {
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
        * Build call for createSubscriptionAmounts
            * @param subscriptionScheduleId The IF (required)
            * @param createSubscriptionAmountRequest  (optional)
        * @param _callback Callback for upload/download progress
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
            </table>
        */
        public okhttp3.Call createSubscriptionAmountsCall(String subscriptionScheduleId, CreateSubscriptionAmountRequest createSubscriptionAmountRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createSubscriptionAmountRequest;

        // create path and map variables
            String localVarPath = "/subscription/subscription_schedules/{subscription_schedule_id}/subscription_amounts"
                .replaceAll("\\{" + "subscription_schedule_id" + "\\}", localVarFinixClient.escapeString(subscriptionScheduleId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

            final String[] localVarAccepts = {
        "application/json"
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
            private okhttp3.Call createSubscriptionAmountsValidateBeforeCall(String subscriptionScheduleId, CreateSubscriptionAmountRequest createSubscriptionAmountRequest, final ApiCallback _callback) throws ApiException {
            
                    // verify the required parameter 'subscriptionScheduleId' is set
                    if (subscriptionScheduleId == null) {
                    throw new ApiException("Missing the required parameter 'subscriptionScheduleId' when calling createSubscriptionAmounts(Async)");
                    }
            

                okhttp3.Call localVarCall = createSubscriptionAmountsCall(subscriptionScheduleId, createSubscriptionAmountRequest, _callback);
                return localVarCall;

            }

                /**
                * Create a Subscription Amount
                * Create a &#x60;subscription_amount&#x60;.
                    * @param subscriptionScheduleId The IF (required)
                    * @param createSubscriptionAmountRequest  (optional)
                    * @return SubscriptionAmount
                * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                    * @http.response.details
                    <table summary="Response Details" border="1">
                        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                    </table>
                */
                    public SubscriptionAmount lcreate(String subscriptionScheduleId, CreateSubscriptionAmountRequest createSubscriptionAmountRequest) throws ApiException {
                ApiResponse<SubscriptionAmount> localVarResp = createSubscriptionAmountsWithHttpInfo(subscriptionScheduleId, createSubscriptionAmountRequest);
                        return localVarResp.getData();
                    }

        /**
            * Create a Subscription Amount
            * Create a &#x60;subscription_amount&#x60;.
                * @param subscriptionScheduleId The IF (required)
                * @param createSubscriptionAmountRequest  (optional)
            * @return ApiResponse&lt;SubscriptionAmount&gt;
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                </table>
            */
            public ApiResponse<SubscriptionAmount> createSubscriptionAmountsWithHttpInfo(String subscriptionScheduleId, CreateSubscriptionAmountRequest createSubscriptionAmountRequest) throws ApiException {
            okhttp3.Call localVarCall = createSubscriptionAmountsValidateBeforeCall(subscriptionScheduleId, createSubscriptionAmountRequest, null);
                    Type localVarReturnType = new TypeToken<SubscriptionAmount>(){}.getType();
                    return localVarFinixClient.execute(localVarCall, localVarReturnType);
            }

        /**
            * Create a Subscription Amount (asynchronously)
            * Create a &#x60;subscription_amount&#x60;.
                * @param subscriptionScheduleId The IF (required)
                * @param createSubscriptionAmountRequest  (optional)
            * @param _callback The callback to be executed when the API call finishes
            * @return The request call
            * @throws ApiException If fail to process the API call, e.g. serializing the request body object
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                </table>
            */
            public okhttp3.Call createSubscriptionAmountsAsync(String subscriptionScheduleId, CreateSubscriptionAmountRequest createSubscriptionAmountRequest, final ApiCallback<SubscriptionAmount> _callback) throws ApiException {

            okhttp3.Call localVarCall = createSubscriptionAmountsValidateBeforeCall(subscriptionScheduleId, createSubscriptionAmountRequest, _callback);
        Type localVarReturnType = new TypeToken<SubscriptionAmount>(){}.getType();
            localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
            }
        /**
        * Build call for getSubscriptionSubscriptionAmountsId
            * @param subscriptionAmountId  (required)
        * @param _callback Callback for upload/download progress
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
            </table>
        */
        public okhttp3.Call getSubscriptionSubscriptionAmountsIdCall(String subscriptionAmountId, final ApiCallback _callback) throws ApiException {
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
            String localVarPath = "/subscription/subscription_amounts/{subscription_amount_id}"
                .replaceAll("\\{" + "subscription_amount_id" + "\\}", localVarFinixClient.escapeString(subscriptionAmountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

            final String[] localVarAccepts = {
        "application/json"
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

            String[] localVarAuthNames = new String[] { "BasicAuth" };
            return localVarFinixClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
            }

            @SuppressWarnings("rawtypes")
            private okhttp3.Call getSubscriptionSubscriptionAmountsIdValidateBeforeCall(String subscriptionAmountId, final ApiCallback _callback) throws ApiException {
            
                    // verify the required parameter 'subscriptionAmountId' is set
                    if (subscriptionAmountId == null) {
                    throw new ApiException("Missing the required parameter 'subscriptionAmountId' when calling getSubscriptionSubscriptionAmountsId(Async)");
                    }
            

                okhttp3.Call localVarCall = getSubscriptionSubscriptionAmountsIdCall(subscriptionAmountId, _callback);
                return localVarCall;

            }

                /**
                * Get a Subscription Amount
                * Retrieve the details of a &#x60;subscription_amount&#x60;.
                    * @param subscriptionAmountId  (required)
                    * @return SubscriptionAmount
                * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                    * @http.response.details
                    <table summary="Response Details" border="1">
                        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                    </table>
                */
                    public SubscriptionAmount get(String subscriptionAmountId) throws ApiException {
                ApiResponse<SubscriptionAmount> localVarResp = getSubscriptionSubscriptionAmountsIdWithHttpInfo(subscriptionAmountId);
                        return localVarResp.getData();
                    }

        /**
            * Get a Subscription Amount
            * Retrieve the details of a &#x60;subscription_amount&#x60;.
                * @param subscriptionAmountId  (required)
            * @return ApiResponse&lt;SubscriptionAmount&gt;
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                </table>
            */
            public ApiResponse<SubscriptionAmount> getSubscriptionSubscriptionAmountsIdWithHttpInfo(String subscriptionAmountId) throws ApiException {
            okhttp3.Call localVarCall = getSubscriptionSubscriptionAmountsIdValidateBeforeCall(subscriptionAmountId, null);
                    Type localVarReturnType = new TypeToken<SubscriptionAmount>(){}.getType();
                    return localVarFinixClient.execute(localVarCall, localVarReturnType);
            }

        /**
            * Get a Subscription Amount (asynchronously)
            * Retrieve the details of a &#x60;subscription_amount&#x60;.
                * @param subscriptionAmountId  (required)
            * @param _callback The callback to be executed when the API call finishes
            * @return The request call
            * @throws ApiException If fail to process the API call, e.g. serializing the request body object
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                </table>
            */
            public okhttp3.Call getSubscriptionSubscriptionAmountsIdAsync(String subscriptionAmountId, final ApiCallback<SubscriptionAmount> _callback) throws ApiException {

            okhttp3.Call localVarCall = getSubscriptionSubscriptionAmountsIdValidateBeforeCall(subscriptionAmountId, _callback);
        Type localVarReturnType = new TypeToken<SubscriptionAmount>(){}.getType();
            localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
            }
        /**
        * Build call for getSubscriptionSubscriptionSchedulesIdSubscriptionAmounts
            * @param subscriptionScheduleId The IF (required)
        * @param _callback Callback for upload/download progress
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
            </table>
        */
        public okhttp3.Call getSubscriptionSubscriptionSchedulesIdSubscriptionAmountsCall(String subscriptionScheduleId, final ApiCallback _callback) throws ApiException {
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
            String localVarPath = "/subscription/subscription_schedules/{subscription_schedule_id}/subscription_amounts"
                .replaceAll("\\{" + "subscription_schedule_id" + "\\}", localVarFinixClient.escapeString(subscriptionScheduleId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

            final String[] localVarAccepts = {
        "application/json"
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

            String[] localVarAuthNames = new String[] { "BasicAuth" };
            return localVarFinixClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
            }

            @SuppressWarnings("rawtypes")
            private okhttp3.Call getSubscriptionSubscriptionSchedulesIdSubscriptionAmountsValidateBeforeCall(String subscriptionScheduleId, final ApiCallback _callback) throws ApiException {
            
                    // verify the required parameter 'subscriptionScheduleId' is set
                    if (subscriptionScheduleId == null) {
                    throw new ApiException("Missing the required parameter 'subscriptionScheduleId' when calling getSubscriptionSubscriptionSchedulesIdSubscriptionAmounts(Async)");
                    }
            

                okhttp3.Call localVarCall = getSubscriptionSubscriptionSchedulesIdSubscriptionAmountsCall(subscriptionScheduleId, _callback);
                return localVarCall;

            }

                /**
                * List Subscription Amounts
                * Retrive a list of subscription amounts.
                    * @param subscriptionScheduleId The IF (required)
                    * @return SubscriptionAmountList
                * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                    * @http.response.details
                    <table summary="Response Details" border="1">
                        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                    </table>
                */
                    public SubscriptionAmountList listBySubscriptionSchedule(String subscriptionScheduleId) throws ApiException {
                ApiResponse<SubscriptionAmountList> localVarResp = getSubscriptionSubscriptionSchedulesIdSubscriptionAmountsWithHttpInfo(subscriptionScheduleId);
                        return localVarResp.getData();
                    }

        /**
            * List Subscription Amounts
            * Retrive a list of subscription amounts.
                * @param subscriptionScheduleId The IF (required)
            * @return ApiResponse&lt;SubscriptionAmountList&gt;
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                </table>
            */
            public ApiResponse<SubscriptionAmountList> getSubscriptionSubscriptionSchedulesIdSubscriptionAmountsWithHttpInfo(String subscriptionScheduleId) throws ApiException {
            okhttp3.Call localVarCall = getSubscriptionSubscriptionSchedulesIdSubscriptionAmountsValidateBeforeCall(subscriptionScheduleId, null);
                    Type localVarReturnType = new TypeToken<SubscriptionAmountList>(){}.getType();
                    return localVarFinixClient.execute(localVarCall, localVarReturnType);
            }

        /**
            * List Subscription Amounts (asynchronously)
            * Retrive a list of subscription amounts.
                * @param subscriptionScheduleId The IF (required)
            * @param _callback The callback to be executed when the API call finishes
            * @return The request call
            * @throws ApiException If fail to process the API call, e.g. serializing the request body object
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                </table>
            */
            public okhttp3.Call getSubscriptionSubscriptionSchedulesIdSubscriptionAmountsAsync(String subscriptionScheduleId, final ApiCallback<SubscriptionAmountList> _callback) throws ApiException {

            okhttp3.Call localVarCall = getSubscriptionSubscriptionSchedulesIdSubscriptionAmountsValidateBeforeCall(subscriptionScheduleId, _callback);
        Type localVarReturnType = new TypeToken<SubscriptionAmountList>(){}.getType();
            localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
            }
        /**
        * Build call for putSubscriptionSubscriptionAmountsId
            * @param subscriptionAmountId  (required)
            * @param updateSubscriptionAmountRequest  (optional)
        * @param _callback Callback for upload/download progress
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
            </table>
        */
        public okhttp3.Call putSubscriptionSubscriptionAmountsIdCall(String subscriptionAmountId, UpdateSubscriptionAmountRequest updateSubscriptionAmountRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateSubscriptionAmountRequest;

        // create path and map variables
            String localVarPath = "/subscription/subscription_amounts/{subscription_amount_id}"
                .replaceAll("\\{" + "subscription_amount_id" + "\\}", localVarFinixClient.escapeString(subscriptionAmountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

            final String[] localVarAccepts = {
        "application/json"
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
            return localVarFinixClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
            }

            @SuppressWarnings("rawtypes")
            private okhttp3.Call putSubscriptionSubscriptionAmountsIdValidateBeforeCall(String subscriptionAmountId, UpdateSubscriptionAmountRequest updateSubscriptionAmountRequest, final ApiCallback _callback) throws ApiException {
            
                    // verify the required parameter 'subscriptionAmountId' is set
                    if (subscriptionAmountId == null) {
                    throw new ApiException("Missing the required parameter 'subscriptionAmountId' when calling putSubscriptionSubscriptionAmountsId(Async)");
                    }
            

                okhttp3.Call localVarCall = putSubscriptionSubscriptionAmountsIdCall(subscriptionAmountId, updateSubscriptionAmountRequest, _callback);
                return localVarCall;

            }

                /**
                * Update a Subscription Amount
                * Update the details of a &#x60;subscription_amount&#x60;.
                    * @param subscriptionAmountId  (required)
                    * @param updateSubscriptionAmountRequest  (optional)
                    * @return SubscriptionAmount
                * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                    * @http.response.details
                    <table summary="Response Details" border="1">
                        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                    </table>
                */
                    public SubscriptionAmount update(String subscriptionAmountId, UpdateSubscriptionAmountRequest updateSubscriptionAmountRequest) throws ApiException {
                ApiResponse<SubscriptionAmount> localVarResp = putSubscriptionSubscriptionAmountsIdWithHttpInfo(subscriptionAmountId, updateSubscriptionAmountRequest);
                        return localVarResp.getData();
                    }

        /**
            * Update a Subscription Amount
            * Update the details of a &#x60;subscription_amount&#x60;.
                * @param subscriptionAmountId  (required)
                * @param updateSubscriptionAmountRequest  (optional)
            * @return ApiResponse&lt;SubscriptionAmount&gt;
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                </table>
            */
            public ApiResponse<SubscriptionAmount> putSubscriptionSubscriptionAmountsIdWithHttpInfo(String subscriptionAmountId, UpdateSubscriptionAmountRequest updateSubscriptionAmountRequest) throws ApiException {
            okhttp3.Call localVarCall = putSubscriptionSubscriptionAmountsIdValidateBeforeCall(subscriptionAmountId, updateSubscriptionAmountRequest, null);
                    Type localVarReturnType = new TypeToken<SubscriptionAmount>(){}.getType();
                    return localVarFinixClient.execute(localVarCall, localVarReturnType);
            }

        /**
            * Update a Subscription Amount (asynchronously)
            * Update the details of a &#x60;subscription_amount&#x60;.
                * @param subscriptionAmountId  (required)
                * @param updateSubscriptionAmountRequest  (optional)
            * @param _callback The callback to be executed when the API call finishes
            * @return The request call
            * @throws ApiException If fail to process the API call, e.g. serializing the request body object
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                </table>
            */
            public okhttp3.Call putSubscriptionSubscriptionAmountsIdAsync(String subscriptionAmountId, UpdateSubscriptionAmountRequest updateSubscriptionAmountRequest, final ApiCallback<SubscriptionAmount> _callback) throws ApiException {

            okhttp3.Call localVarCall = putSubscriptionSubscriptionAmountsIdValidateBeforeCall(subscriptionAmountId, updateSubscriptionAmountRequest, _callback);
        Type localVarReturnType = new TypeToken<SubscriptionAmount>(){}.getType();
            localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
            }
        }
