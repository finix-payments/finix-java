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


import model.CreateSubscriptionScheduleRequest;
import model.SubscriptionSchedule;
import model.SubscriptionSchedulesList;
import model.UpdateSubscriptionScheduleRequest;

import java.lang.reflect.Type;
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;
import javax.ws.rs.core.GenericType;

    public class SubscriptionSchedulesApi {
    private FinixClient localVarFinixClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SubscriptionSchedulesApi() {
    this(Configuration.getDefaultFinixClient());
    }

    public SubscriptionSchedulesApi(FinixClient finixClient) {
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
        * Build call for getSubscriptionSubscriptionSchedules
        * @param _callback Callback for upload/download progress
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
            </table>
        */
        public okhttp3.Call getSubscriptionSubscriptionSchedulesCall(final ApiCallback _callback) throws ApiException {
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
            String localVarPath = "/subscription/subscription_schedules";

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
            private okhttp3.Call getSubscriptionSubscriptionSchedulesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
            

                okhttp3.Call localVarCall = getSubscriptionSubscriptionSchedulesCall(_callback);
                return localVarCall;

            }

                /**
                * List Subscription Schedules
                * Retrieve a list of subscription schedules.
                    * @return SubscriptionSchedulesList
                * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                    * @http.response.details
                    <table summary="Response Details" border="1">
                        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                    </table>
                */
                    public SubscriptionSchedulesList list() throws ApiException {
                ApiResponse<SubscriptionSchedulesList> localVarResp = getSubscriptionSubscriptionSchedulesWithHttpInfo();
                        return localVarResp.getData();
                    }

        /**
            * List Subscription Schedules
            * Retrieve a list of subscription schedules.
            * @return ApiResponse&lt;SubscriptionSchedulesList&gt;
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                </table>
            */
            public ApiResponse<SubscriptionSchedulesList> getSubscriptionSubscriptionSchedulesWithHttpInfo() throws ApiException {
            okhttp3.Call localVarCall = getSubscriptionSubscriptionSchedulesValidateBeforeCall(null);
                    Type localVarReturnType = new TypeToken<SubscriptionSchedulesList>(){}.getType();
                    return localVarFinixClient.execute(localVarCall, localVarReturnType);
            }

        /**
            * List Subscription Schedules (asynchronously)
            * Retrieve a list of subscription schedules.
            * @param _callback The callback to be executed when the API call finishes
            * @return The request call
            * @throws ApiException If fail to process the API call, e.g. serializing the request body object
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                </table>
            */
            public okhttp3.Call getSubscriptionSubscriptionSchedulesAsync(final ApiCallback<SubscriptionSchedulesList> _callback) throws ApiException {

            okhttp3.Call localVarCall = getSubscriptionSubscriptionSchedulesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<SubscriptionSchedulesList>(){}.getType();
            localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
            }
        /**
        * Build call for getSubscriptionSubscriptionSchedulesId
            * @param subscriptionScheduleId The ID of the subscription schedule (required)
        * @param _callback Callback for upload/download progress
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
            </table>
        */
        public okhttp3.Call getSubscriptionSubscriptionSchedulesIdCall(String subscriptionScheduleId, final ApiCallback _callback) throws ApiException {
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
            String localVarPath = "/subscription/subscription_schedules/{subscription_schedule_id}"
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
            private okhttp3.Call getSubscriptionSubscriptionSchedulesIdValidateBeforeCall(String subscriptionScheduleId, final ApiCallback _callback) throws ApiException {
            
                    // verify the required parameter 'subscriptionScheduleId' is set
                    if (subscriptionScheduleId == null) {
                    throw new ApiException("Missing the required parameter 'subscriptionScheduleId' when calling getSubscriptionSubscriptionSchedulesId(Async)");
                    }
            

                okhttp3.Call localVarCall = getSubscriptionSubscriptionSchedulesIdCall(subscriptionScheduleId, _callback);
                return localVarCall;

            }

                /**
                * Get a Subscription Schedule
                * Retrieve the details of a &#x60;subscription_schedule&#x60;
                    * @param subscriptionScheduleId The ID of the subscription schedule (required)
                    * @return SubscriptionSchedule
                * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                    * @http.response.details
                    <table summary="Response Details" border="1">
                        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                    </table>
                */
                    public SubscriptionSchedule get(String subscriptionScheduleId) throws ApiException {
                ApiResponse<SubscriptionSchedule> localVarResp = getSubscriptionSubscriptionSchedulesIdWithHttpInfo(subscriptionScheduleId);
                        return localVarResp.getData();
                    }

        /**
            * Get a Subscription Schedule
            * Retrieve the details of a &#x60;subscription_schedule&#x60;
                * @param subscriptionScheduleId The ID of the subscription schedule (required)
            * @return ApiResponse&lt;SubscriptionSchedule&gt;
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                </table>
            */
            public ApiResponse<SubscriptionSchedule> getSubscriptionSubscriptionSchedulesIdWithHttpInfo(String subscriptionScheduleId) throws ApiException {
            okhttp3.Call localVarCall = getSubscriptionSubscriptionSchedulesIdValidateBeforeCall(subscriptionScheduleId, null);
                    Type localVarReturnType = new TypeToken<SubscriptionSchedule>(){}.getType();
                    return localVarFinixClient.execute(localVarCall, localVarReturnType);
            }

        /**
            * Get a Subscription Schedule (asynchronously)
            * Retrieve the details of a &#x60;subscription_schedule&#x60;
                * @param subscriptionScheduleId The ID of the subscription schedule (required)
            * @param _callback The callback to be executed when the API call finishes
            * @return The request call
            * @throws ApiException If fail to process the API call, e.g. serializing the request body object
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                </table>
            */
            public okhttp3.Call getSubscriptionSubscriptionSchedulesIdAsync(String subscriptionScheduleId, final ApiCallback<SubscriptionSchedule> _callback) throws ApiException {

            okhttp3.Call localVarCall = getSubscriptionSubscriptionSchedulesIdValidateBeforeCall(subscriptionScheduleId, _callback);
        Type localVarReturnType = new TypeToken<SubscriptionSchedule>(){}.getType();
            localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
            }
        /**
        * Build call for postSubscriptionSubscriptionSchedules
            * @param createSubscriptionScheduleRequest  (optional)
        * @param _callback Callback for upload/download progress
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
            </table>
        */
        public okhttp3.Call postSubscriptionSubscriptionSchedulesCall(CreateSubscriptionScheduleRequest createSubscriptionScheduleRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createSubscriptionScheduleRequest;

        // create path and map variables
            String localVarPath = "/subscription/subscription_schedules";

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
            private okhttp3.Call postSubscriptionSubscriptionSchedulesValidateBeforeCall(CreateSubscriptionScheduleRequest createSubscriptionScheduleRequest, final ApiCallback _callback) throws ApiException {
            

                okhttp3.Call localVarCall = postSubscriptionSubscriptionSchedulesCall(createSubscriptionScheduleRequest, _callback);
                return localVarCall;

            }

                /**
                * Create a Subscription Schedule
                * Create a &#x60;subscription_schedule&#x60;.
                    * @param createSubscriptionScheduleRequest  (optional)
                    * @return SubscriptionSchedule
                * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                    * @http.response.details
                    <table summary="Response Details" border="1">
                        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                    </table>
                */
                    public SubscriptionSchedule create(CreateSubscriptionScheduleRequest createSubscriptionScheduleRequest) throws ApiException {
                ApiResponse<SubscriptionSchedule> localVarResp = postSubscriptionSubscriptionSchedulesWithHttpInfo(createSubscriptionScheduleRequest);
                        return localVarResp.getData();
                    }

        /**
            * Create a Subscription Schedule
            * Create a &#x60;subscription_schedule&#x60;.
                * @param createSubscriptionScheduleRequest  (optional)
            * @return ApiResponse&lt;SubscriptionSchedule&gt;
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                </table>
            */
            public ApiResponse<SubscriptionSchedule> postSubscriptionSubscriptionSchedulesWithHttpInfo(CreateSubscriptionScheduleRequest createSubscriptionScheduleRequest) throws ApiException {
            okhttp3.Call localVarCall = postSubscriptionSubscriptionSchedulesValidateBeforeCall(createSubscriptionScheduleRequest, null);
                    Type localVarReturnType = new TypeToken<SubscriptionSchedule>(){}.getType();
                    return localVarFinixClient.execute(localVarCall, localVarReturnType);
            }

        /**
            * Create a Subscription Schedule (asynchronously)
            * Create a &#x60;subscription_schedule&#x60;.
                * @param createSubscriptionScheduleRequest  (optional)
            * @param _callback The callback to be executed when the API call finishes
            * @return The request call
            * @throws ApiException If fail to process the API call, e.g. serializing the request body object
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                </table>
            */
            public okhttp3.Call postSubscriptionSubscriptionSchedulesAsync(CreateSubscriptionScheduleRequest createSubscriptionScheduleRequest, final ApiCallback<SubscriptionSchedule> _callback) throws ApiException {

            okhttp3.Call localVarCall = postSubscriptionSubscriptionSchedulesValidateBeforeCall(createSubscriptionScheduleRequest, _callback);
        Type localVarReturnType = new TypeToken<SubscriptionSchedule>(){}.getType();
            localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
            }
        /**
        * Build call for putSubscriptionSubscriptionSchedulesId
            * @param subscriptionScheduleId The ID of the subscription schedule (required)
            * @param updateSubscriptionScheduleRequest  (optional)
        * @param _callback Callback for upload/download progress
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
            </table>
        */
        public okhttp3.Call putSubscriptionSubscriptionSchedulesIdCall(String subscriptionScheduleId, UpdateSubscriptionScheduleRequest updateSubscriptionScheduleRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateSubscriptionScheduleRequest;

        // create path and map variables
            String localVarPath = "/subscription/subscription_schedules/{subscription_schedule_id}"
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
            return localVarFinixClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
            }

            @SuppressWarnings("rawtypes")
            private okhttp3.Call putSubscriptionSubscriptionSchedulesIdValidateBeforeCall(String subscriptionScheduleId, UpdateSubscriptionScheduleRequest updateSubscriptionScheduleRequest, final ApiCallback _callback) throws ApiException {
            
                    // verify the required parameter 'subscriptionScheduleId' is set
                    if (subscriptionScheduleId == null) {
                    throw new ApiException("Missing the required parameter 'subscriptionScheduleId' when calling putSubscriptionSubscriptionSchedulesId(Async)");
                    }
            

                okhttp3.Call localVarCall = putSubscriptionSubscriptionSchedulesIdCall(subscriptionScheduleId, updateSubscriptionScheduleRequest, _callback);
                return localVarCall;

            }

                /**
                * Update a Subscription Schedule
                * Update the details of a &#x60;subscription_schedule&#x60;.
                    * @param subscriptionScheduleId The ID of the subscription schedule (required)
                    * @param updateSubscriptionScheduleRequest  (optional)
                    * @return SubscriptionSchedule
                * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                    * @http.response.details
                    <table summary="Response Details" border="1">
                        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                    </table>
                */
                    public SubscriptionSchedule update(String subscriptionScheduleId, UpdateSubscriptionScheduleRequest updateSubscriptionScheduleRequest) throws ApiException {
                ApiResponse<SubscriptionSchedule> localVarResp = putSubscriptionSubscriptionSchedulesIdWithHttpInfo(subscriptionScheduleId, updateSubscriptionScheduleRequest);
                        return localVarResp.getData();
                    }

        /**
            * Update a Subscription Schedule
            * Update the details of a &#x60;subscription_schedule&#x60;.
                * @param subscriptionScheduleId The ID of the subscription schedule (required)
                * @param updateSubscriptionScheduleRequest  (optional)
            * @return ApiResponse&lt;SubscriptionSchedule&gt;
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                </table>
            */
            public ApiResponse<SubscriptionSchedule> putSubscriptionSubscriptionSchedulesIdWithHttpInfo(String subscriptionScheduleId, UpdateSubscriptionScheduleRequest updateSubscriptionScheduleRequest) throws ApiException {
            okhttp3.Call localVarCall = putSubscriptionSubscriptionSchedulesIdValidateBeforeCall(subscriptionScheduleId, updateSubscriptionScheduleRequest, null);
                    Type localVarReturnType = new TypeToken<SubscriptionSchedule>(){}.getType();
                    return localVarFinixClient.execute(localVarCall, localVarReturnType);
            }

        /**
            * Update a Subscription Schedule (asynchronously)
            * Update the details of a &#x60;subscription_schedule&#x60;.
                * @param subscriptionScheduleId The ID of the subscription schedule (required)
                * @param updateSubscriptionScheduleRequest  (optional)
            * @param _callback The callback to be executed when the API call finishes
            * @return The request call
            * @throws ApiException If fail to process the API call, e.g. serializing the request body object
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                </table>
            */
            public okhttp3.Call putSubscriptionSubscriptionSchedulesIdAsync(String subscriptionScheduleId, UpdateSubscriptionScheduleRequest updateSubscriptionScheduleRequest, final ApiCallback<SubscriptionSchedule> _callback) throws ApiException {

            okhttp3.Call localVarCall = putSubscriptionSubscriptionSchedulesIdValidateBeforeCall(subscriptionScheduleId, updateSubscriptionScheduleRequest, _callback);
        Type localVarReturnType = new TypeToken<SubscriptionSchedule>(){}.getType();
            localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
            return localVarCall;
            }
        }
