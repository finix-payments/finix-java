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

import model.CreateWebhookRequest;
import model.Error401Unauthorized;
import model.Error403ForbiddenList;
import model.Error404NotFoundList;
import model.Error406NotAcceptable;
import model.Error422InvalidFieldList;
import model.ErrorGeneric;
import model.UpdateWebhookRequest;
import model.Webhook;
import model.WebhooksList;

import model.ListWebhooksQueryParams;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class WebhooksApi {
    private FinixClient localVarFinixClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WebhooksApi() {
        this(Configuration.getDefaultFinixClient());
    }

    public WebhooksApi(FinixClient finixClient) {
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
    * Build call for createWebhook
        * @param createWebhookRequest  (optional)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 201 </td><td> Single Webhook object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call createWebhookCall(CreateWebhookRequest createWebhookRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createWebhookRequest;

    // create path and map variables
        String localVarPath = "/webhooks";

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
    private okhttp3.Call createWebhookValidateBeforeCall(CreateWebhookRequest createWebhookRequest, final ApiCallback _callback) throws ApiException {
    

        okhttp3.Call localVarCall = createWebhookCall(createWebhookRequest, _callback);
        return localVarCall;

    }

            /**
            * Create a Webhook
            * Create a &#x60;Webhook&#x60; to specify an endpoint where Finix can send events.
                * @param createWebhookRequest  (optional)
                * @return Webhook
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 201 </td><td> Single Webhook object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public Webhook create(CreateWebhookRequest createWebhookRequest) throws ApiException {
        ApiResponse<Webhook> localVarResp = createWebhookWithHttpInfo(createWebhookRequest);
        return localVarResp.getData();
    }


    /**
        * Create a Webhook
        * Create a &#x60;Webhook&#x60; to specify an endpoint where Finix can send events.
            * @param createWebhookRequest  (optional)
        * @return ApiResponse&lt;Webhook&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single Webhook object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<Webhook> createWebhookWithHttpInfo(CreateWebhookRequest createWebhookRequest) throws ApiException {
        okhttp3.Call localVarCall = createWebhookValidateBeforeCall(createWebhookRequest, null);
        Type localVarReturnType = new TypeToken<Webhook>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Create a Webhook (asynchronously)
        * Create a &#x60;Webhook&#x60; to specify an endpoint where Finix can send events.
            * @param createWebhookRequest  (optional)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single Webhook object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call createWebhookAsync(CreateWebhookRequest createWebhookRequest, final ApiCallback<Webhook> _callback) throws ApiException {

        okhttp3.Call localVarCall = createWebhookValidateBeforeCall(createWebhookRequest, _callback);
        Type localVarReturnType = new TypeToken<Webhook>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Build call for getWebhook
        * @param webhookId ID of &#x60;Webhook&#x60; object. (required)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single Webhook object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call getWebhookCall(String webhookId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/webhooks/{webhook_id}"
            .replaceAll("\\{" + "webhook_id" + "\\}", localVarFinixClient.escapeString(webhookId.toString()));

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
    private okhttp3.Call getWebhookValidateBeforeCall(String webhookId, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new ApiException("Missing the required parameter 'webhookId' when calling getWebhook(Async)");
        }
    

        okhttp3.Call localVarCall = getWebhookCall(webhookId, _callback);
        return localVarCall;

    }

            /**
            * Fetch a Webhook
            * Retrieve the details of a &#x60;Webhook&#x60;.
                * @param webhookId ID of &#x60;Webhook&#x60; object. (required)
                * @return Webhook
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single Webhook object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public Webhook get(String webhookId) throws ApiException {
        ApiResponse<Webhook> localVarResp = getWebhookWithHttpInfo(webhookId);
        return localVarResp.getData();
    }


    /**
        * Fetch a Webhook
        * Retrieve the details of a &#x60;Webhook&#x60;.
            * @param webhookId ID of &#x60;Webhook&#x60; object. (required)
        * @return ApiResponse&lt;Webhook&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Webhook object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<Webhook> getWebhookWithHttpInfo(String webhookId) throws ApiException {
        okhttp3.Call localVarCall = getWebhookValidateBeforeCall(webhookId, null);
        Type localVarReturnType = new TypeToken<Webhook>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Fetch a Webhook (asynchronously)
        * Retrieve the details of a &#x60;Webhook&#x60;.
            * @param webhookId ID of &#x60;Webhook&#x60; object. (required)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Webhook object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call getWebhookAsync(String webhookId, final ApiCallback<Webhook> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWebhookValidateBeforeCall(webhookId, _callback);
        Type localVarReturnType = new TypeToken<Webhook>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    private okhttp3.Call listWebhooksCall(Long limit, String afterCursor, String beforeCursor, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/webhooks";

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
    private okhttp3.Call listWebhooksValidateBeforeCall(Long limit, String afterCursor, String beforeCursor, final ApiCallback _callback) throws ApiException {
    

        okhttp3.Call localVarCall = listWebhooksCall(limit, afterCursor, beforeCursor, _callback);
        return localVarCall;

    }


    private ApiResponse<WebhooksList> listWebhooksWithHttpInfo(Long limit, String afterCursor, String beforeCursor) throws ApiException {
        okhttp3.Call localVarCall = listWebhooksValidateBeforeCall(limit, afterCursor, beforeCursor, null);
        Type localVarReturnType = new TypeToken<WebhooksList>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listWebhooksAsync(Long limit, String afterCursor, String beforeCursor, final ApiCallback<WebhooksList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listWebhooksValidateBeforeCall(limit, afterCursor, beforeCursor, _callback);
        Type localVarReturnType = new TypeToken<WebhooksList>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistWebhooksRequest {
        private Long limit;
        private String afterCursor;
        private String beforeCursor;

        private APIlistWebhooksRequest() {
        }

        /**
        * Set limit
        * @param limit The numbers of items to return. (optional)
        * @return APIlistWebhooksRequest
        */
        public APIlistWebhooksRequest limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
        * Set afterCursor
        * @param afterCursor Return every resource created after the cursor value. (optional)
        * @return APIlistWebhooksRequest
        */
        public APIlistWebhooksRequest afterCursor(String afterCursor) {
            this.afterCursor = afterCursor;
            return this;
        }

        /**
        * Set beforeCursor
        * @param beforeCursor Return every resource created before the cursor value. (optional)
        * @return APIlistWebhooksRequest
        */
        public APIlistWebhooksRequest beforeCursor(String beforeCursor) {
            this.beforeCursor = beforeCursor;
            return this;
        }

        /**
        * Build call for listWebhooks
        * @param _callback ApiCallback API callback
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Webhook objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listWebhooksCall(limit, afterCursor, beforeCursor, _callback);
        }

        /**
        * Execute listWebhooks request
            * @return WebhooksList
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Webhook objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public WebhooksList execute() throws ApiException {
            ApiResponse<WebhooksList> localVarResp = listWebhooksWithHttpInfo(limit, afterCursor, beforeCursor);
            return localVarResp.getData();
        }

        /**
        * Execute listWebhooks request with HTTP info returned
        * @return ApiResponse&lt;WebhooksList&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Webhook objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public ApiResponse<WebhooksList> executeWithHttpInfo() throws ApiException {
            return listWebhooksWithHttpInfo(limit, afterCursor, beforeCursor);
        }

        /**
        * Execute listWebhooks request (asynchronously)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Webhook objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call executeAsync(final ApiCallback<WebhooksList> _callback) throws ApiException {
            return listWebhooksAsync(limit, afterCursor, beforeCursor, _callback);
        }
    }

    /**
    * List Webhooks
    * Retrieve a list of &#x60;Webhooks&#x60;.
    * @return APIlistWebhooksRequest
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> List of Webhook objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public FinixList list( ListWebhooksQueryParams listWebhooksQueryParams)
        throws ApiException{

        APIlistWebhooksRequest request = new APIlistWebhooksRequest();
        request.limit(listWebhooksQueryParams.getLimit());
        request.afterCursor(listWebhooksQueryParams.getAfterCursor());
        request.beforeCursor(listWebhooksQueryParams.getBeforeCursor());
        WebhooksList response = request.execute();
        Boolean hasNextCursor = (response.getPage().getClass().getName() == "model.PageCursor");
        ListWebhooksQueryParams queryParams = (ListWebhooksQueryParams) getQueryParam(response.getPage(),
            listWebhooksQueryParams,
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
    * Build call for updateWebhook
        * @param webhookId ID of &#x60;Webhook&#x60; object. (required)
        * @param updateWebhookRequest  (optional)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single Webhook object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call updateWebhookCall(String webhookId, UpdateWebhookRequest updateWebhookRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateWebhookRequest;

    // create path and map variables
        String localVarPath = "/webhooks/{webhook_id}"
            .replaceAll("\\{" + "webhook_id" + "\\}", localVarFinixClient.escapeString(webhookId.toString()));

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
    private okhttp3.Call updateWebhookValidateBeforeCall(String webhookId, UpdateWebhookRequest updateWebhookRequest, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new ApiException("Missing the required parameter 'webhookId' when calling updateWebhook(Async)");
        }
    

        okhttp3.Call localVarCall = updateWebhookCall(webhookId, updateWebhookRequest, _callback);
        return localVarCall;

    }

            /**
            * Update a Webhook
            * Update an existing &#x60;Webhook&#x60;.
                * @param webhookId ID of &#x60;Webhook&#x60; object. (required)
                * @param updateWebhookRequest  (optional)
                * @return Webhook
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single Webhook object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public Webhook update(String webhookId, UpdateWebhookRequest updateWebhookRequest) throws ApiException {
        ApiResponse<Webhook> localVarResp = updateWebhookWithHttpInfo(webhookId, updateWebhookRequest);
        return localVarResp.getData();
    }


    /**
        * Update a Webhook
        * Update an existing &#x60;Webhook&#x60;.
            * @param webhookId ID of &#x60;Webhook&#x60; object. (required)
            * @param updateWebhookRequest  (optional)
        * @return ApiResponse&lt;Webhook&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Webhook object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<Webhook> updateWebhookWithHttpInfo(String webhookId, UpdateWebhookRequest updateWebhookRequest) throws ApiException {
        okhttp3.Call localVarCall = updateWebhookValidateBeforeCall(webhookId, updateWebhookRequest, null);
        Type localVarReturnType = new TypeToken<Webhook>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Update a Webhook (asynchronously)
        * Update an existing &#x60;Webhook&#x60;.
            * @param webhookId ID of &#x60;Webhook&#x60; object. (required)
            * @param updateWebhookRequest  (optional)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Webhook object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call updateWebhookAsync(String webhookId, UpdateWebhookRequest updateWebhookRequest, final ApiCallback<Webhook> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateWebhookValidateBeforeCall(webhookId, updateWebhookRequest, _callback);
        Type localVarReturnType = new TypeToken<Webhook>(){}.getType();
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
