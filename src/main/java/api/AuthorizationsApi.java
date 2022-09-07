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

import model.Authorization;
import model.AuthorizationCaptured;
import model.AuthorizationsList;
import model.CreateAuthorizationRequest;
import model.Error401Unauthorized;
import model.Error403ForbiddenList;
import model.Error404NotFoundList;
import model.Error406NotAcceptable;
import model.Error422InvalidFieldList;
import model.ErrorGeneric;
import model.UpdateAuthorizationRequest;

import model.ListAuthorizationsQueryParams;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AuthorizationsApi {
    private FinixClient localVarFinixClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuthorizationsApi() {
        this(Configuration.getDefaultFinixClient());
    }

    public AuthorizationsApi(FinixClient finixClient) {
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
    * Build call for captureAuthorization
        * @param authorizationId ID of &#x60;Authorization&#x60; to fetch. (required)
        * @param updateAuthorizationRequest  (optional)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single captured Authorization object </td><td>  -  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call captureAuthorizationCall(String authorizationId, UpdateAuthorizationRequest updateAuthorizationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateAuthorizationRequest;

    // create path and map variables
        String localVarPath = "/authorizations/{authorization_id}"
            .replaceAll("\\{" + "authorization_id" + "\\}", localVarFinixClient.escapeString(authorizationId.toString()));

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
    private okhttp3.Call captureAuthorizationValidateBeforeCall(String authorizationId, UpdateAuthorizationRequest updateAuthorizationRequest, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'authorizationId' is set
        if (authorizationId == null) {
            throw new ApiException("Missing the required parameter 'authorizationId' when calling captureAuthorization(Async)");
        }
    

        okhttp3.Call localVarCall = captureAuthorizationCall(authorizationId, updateAuthorizationRequest, _callback);
        return localVarCall;

    }

            /**
            * Capture an Authorization
            * If successfully captured, the &#x60;transfer&#x60; field of the &#x60;Authorization&#x60; will contain the ID of the &#x60;Transfer&#x60; resource that&#39;ll move funds.   By default, &#x60;Transfers&#x60; are in a **PENDING** state. The **PENDING** state means the request to capture funds hasn&#39;t been submitted yet. Capture requests get submitted via a batch request.   Once the &#x60;Authorization&#x60; is updated with a &#x60;capture_amount&#x60; (i.e. *Captured*), the state of the &#x60;Transfer&#x60; will update to **SUCCEEDED**.  &gt; Voided &#x60;Authorizations&#x60; can&#39;t be captured.
                * @param authorizationId ID of &#x60;Authorization&#x60; to fetch. (required)
                * @param updateAuthorizationRequest  (optional)
                * @return AuthorizationCaptured
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single captured Authorization object </td><td>  -  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public AuthorizationCaptured update(String authorizationId, UpdateAuthorizationRequest updateAuthorizationRequest) throws ApiException {
        ApiResponse<AuthorizationCaptured> localVarResp = captureAuthorizationWithHttpInfo(authorizationId, updateAuthorizationRequest);
        return localVarResp.getData();
    }


    /**
        * Capture an Authorization
        * If successfully captured, the &#x60;transfer&#x60; field of the &#x60;Authorization&#x60; will contain the ID of the &#x60;Transfer&#x60; resource that&#39;ll move funds.   By default, &#x60;Transfers&#x60; are in a **PENDING** state. The **PENDING** state means the request to capture funds hasn&#39;t been submitted yet. Capture requests get submitted via a batch request.   Once the &#x60;Authorization&#x60; is updated with a &#x60;capture_amount&#x60; (i.e. *Captured*), the state of the &#x60;Transfer&#x60; will update to **SUCCEEDED**.  &gt; Voided &#x60;Authorizations&#x60; can&#39;t be captured.
            * @param authorizationId ID of &#x60;Authorization&#x60; to fetch. (required)
            * @param updateAuthorizationRequest  (optional)
        * @return ApiResponse&lt;AuthorizationCaptured&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single captured Authorization object </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<AuthorizationCaptured> captureAuthorizationWithHttpInfo(String authorizationId, UpdateAuthorizationRequest updateAuthorizationRequest) throws ApiException {
        okhttp3.Call localVarCall = captureAuthorizationValidateBeforeCall(authorizationId, updateAuthorizationRequest, null);
        Type localVarReturnType = new TypeToken<AuthorizationCaptured>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Capture an Authorization (asynchronously)
        * If successfully captured, the &#x60;transfer&#x60; field of the &#x60;Authorization&#x60; will contain the ID of the &#x60;Transfer&#x60; resource that&#39;ll move funds.   By default, &#x60;Transfers&#x60; are in a **PENDING** state. The **PENDING** state means the request to capture funds hasn&#39;t been submitted yet. Capture requests get submitted via a batch request.   Once the &#x60;Authorization&#x60; is updated with a &#x60;capture_amount&#x60; (i.e. *Captured*), the state of the &#x60;Transfer&#x60; will update to **SUCCEEDED**.  &gt; Voided &#x60;Authorizations&#x60; can&#39;t be captured.
            * @param authorizationId ID of &#x60;Authorization&#x60; to fetch. (required)
            * @param updateAuthorizationRequest  (optional)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single captured Authorization object </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call captureAuthorizationAsync(String authorizationId, UpdateAuthorizationRequest updateAuthorizationRequest, final ApiCallback<AuthorizationCaptured> _callback) throws ApiException {

        okhttp3.Call localVarCall = captureAuthorizationValidateBeforeCall(authorizationId, updateAuthorizationRequest, _callback);
        Type localVarReturnType = new TypeToken<AuthorizationCaptured>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Build call for createAuthorization
        * @param createAuthorizationRequest  (optional)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 201 </td><td> Single Authorization object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 402 </td><td> Payment Required </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call createAuthorizationCall(CreateAuthorizationRequest createAuthorizationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createAuthorizationRequest;

    // create path and map variables
        String localVarPath = "/authorizations";

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
    private okhttp3.Call createAuthorizationValidateBeforeCall(CreateAuthorizationRequest createAuthorizationRequest, final ApiCallback _callback) throws ApiException {
    

        okhttp3.Call localVarCall = createAuthorizationCall(createAuthorizationRequest, _callback);
        return localVarCall;

    }

            /**
            * Create an Authorization
            * Create an &#x60;Authorization&#x60; to process a transaction.  &#x60;Authorizations&#x60; can have six possible &#x60;states&#x60;, two of which are expected:  - **SUCCEEDED**  - **FAILED**  If the &#x60;Authorization&#x60; has **SUCCEEDED** , it must be captured before &#x60;expires_at&#x60; passes or the funds will be released. If the &#x60;transfer&#x60; field of an &#x60;Authorization&#x60; is **null**, it hasn&#39;t been captured yet.  Learn how to prevent duplicate authorizations by passing an [Idempotency ID](#section/Idempotency-Requests) in the payload. - &#x60;Authorizations&#x60; on debit cards place a hold on funds in the cardholder&#39;s bank account and can lead to lower than expected balances or issues with insufficient funds.
                * @param createAuthorizationRequest  (optional)
                * @return Authorization
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 201 </td><td> Single Authorization object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 402 </td><td> Payment Required </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public Authorization create(CreateAuthorizationRequest createAuthorizationRequest) throws ApiException {
        ApiResponse<Authorization> localVarResp = createAuthorizationWithHttpInfo(createAuthorizationRequest);
        return localVarResp.getData();
    }


    /**
        * Create an Authorization
        * Create an &#x60;Authorization&#x60; to process a transaction.  &#x60;Authorizations&#x60; can have six possible &#x60;states&#x60;, two of which are expected:  - **SUCCEEDED**  - **FAILED**  If the &#x60;Authorization&#x60; has **SUCCEEDED** , it must be captured before &#x60;expires_at&#x60; passes or the funds will be released. If the &#x60;transfer&#x60; field of an &#x60;Authorization&#x60; is **null**, it hasn&#39;t been captured yet.  Learn how to prevent duplicate authorizations by passing an [Idempotency ID](#section/Idempotency-Requests) in the payload. - &#x60;Authorizations&#x60; on debit cards place a hold on funds in the cardholder&#39;s bank account and can lead to lower than expected balances or issues with insufficient funds.
            * @param createAuthorizationRequest  (optional)
        * @return ApiResponse&lt;Authorization&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single Authorization object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 402 </td><td> Payment Required </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<Authorization> createAuthorizationWithHttpInfo(CreateAuthorizationRequest createAuthorizationRequest) throws ApiException {
        okhttp3.Call localVarCall = createAuthorizationValidateBeforeCall(createAuthorizationRequest, null);
        Type localVarReturnType = new TypeToken<Authorization>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Create an Authorization (asynchronously)
        * Create an &#x60;Authorization&#x60; to process a transaction.  &#x60;Authorizations&#x60; can have six possible &#x60;states&#x60;, two of which are expected:  - **SUCCEEDED**  - **FAILED**  If the &#x60;Authorization&#x60; has **SUCCEEDED** , it must be captured before &#x60;expires_at&#x60; passes or the funds will be released. If the &#x60;transfer&#x60; field of an &#x60;Authorization&#x60; is **null**, it hasn&#39;t been captured yet.  Learn how to prevent duplicate authorizations by passing an [Idempotency ID](#section/Idempotency-Requests) in the payload. - &#x60;Authorizations&#x60; on debit cards place a hold on funds in the cardholder&#39;s bank account and can lead to lower than expected balances or issues with insufficient funds.
            * @param createAuthorizationRequest  (optional)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single Authorization object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 402 </td><td> Payment Required </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call createAuthorizationAsync(CreateAuthorizationRequest createAuthorizationRequest, final ApiCallback<Authorization> _callback) throws ApiException {

        okhttp3.Call localVarCall = createAuthorizationValidateBeforeCall(createAuthorizationRequest, _callback);
        Type localVarReturnType = new TypeToken<Authorization>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Build call for getAuthorization
        * @param authorizationId ID of &#x60;Authorization&#x60; to fetch. (required)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single Authorization object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call getAuthorizationCall(String authorizationId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/authorizations/{authorization_id}"
            .replaceAll("\\{" + "authorization_id" + "\\}", localVarFinixClient.escapeString(authorizationId.toString()));

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
    private okhttp3.Call getAuthorizationValidateBeforeCall(String authorizationId, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'authorizationId' is set
        if (authorizationId == null) {
            throw new ApiException("Missing the required parameter 'authorizationId' when calling getAuthorization(Async)");
        }
    

        okhttp3.Call localVarCall = getAuthorizationCall(authorizationId, _callback);
        return localVarCall;

    }

            /**
            * Fetch an Authorization
            * Retrieve the details of a previously created &#x60;Authorization&#x60;.
                * @param authorizationId ID of &#x60;Authorization&#x60; to fetch. (required)
                * @return Authorization
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single Authorization object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public Authorization get(String authorizationId) throws ApiException {
        ApiResponse<Authorization> localVarResp = getAuthorizationWithHttpInfo(authorizationId);
        return localVarResp.getData();
    }


    /**
        * Fetch an Authorization
        * Retrieve the details of a previously created &#x60;Authorization&#x60;.
            * @param authorizationId ID of &#x60;Authorization&#x60; to fetch. (required)
        * @return ApiResponse&lt;Authorization&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Authorization object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<Authorization> getAuthorizationWithHttpInfo(String authorizationId) throws ApiException {
        okhttp3.Call localVarCall = getAuthorizationValidateBeforeCall(authorizationId, null);
        Type localVarReturnType = new TypeToken<Authorization>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Fetch an Authorization (asynchronously)
        * Retrieve the details of a previously created &#x60;Authorization&#x60;.
            * @param authorizationId ID of &#x60;Authorization&#x60; to fetch. (required)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Authorization object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call getAuthorizationAsync(String authorizationId, final ApiCallback<Authorization> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAuthorizationValidateBeforeCall(authorizationId, _callback);
        Type localVarReturnType = new TypeToken<Authorization>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    private okhttp3.Call listAuthorizationsCall(Long amount, Long amountGt, Long amountGte, Long amountLt, Long amountLte, String beforeCursor, String createdAtGte, String createdAtLte, String idempotencyId, Long limit, String sort, String state, String updatedAtGte, String updatedAtLte, String traceId, String isVoid, String instrumentBin, String instrumentAccountLast4, String instrumentBrandType, String merchantIdentityId, String merchantIdentityName, String instrumentName, String instrumentType, String merchantId, String merchantMid, String instrumentCardLast4, String merchantProcessorId, String type, String afterCursor, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/authorizations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (amount != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("amount", amount));
        }

        if (amountGt != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("amount.gt", amountGt));
        }

        if (amountGte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("amount.gte", amountGte));
        }

        if (amountLt != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("amount.lt", amountLt));
        }

        if (amountLte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("amount.lte", amountLte));
        }

        if (beforeCursor != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("before_cursor", beforeCursor));
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

        if (limit != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("limit", limit));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("sort", sort));
        }

        if (state != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("state", state));
        }

        if (updatedAtGte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("updated_at.gte", updatedAtGte));
        }

        if (updatedAtLte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("updated_at.lte", updatedAtLte));
        }

        if (traceId != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("trace_id", traceId));
        }

        if (isVoid != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("is_void", isVoid));
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

        if (afterCursor != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("after_cursor", afterCursor));
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
    private okhttp3.Call listAuthorizationsValidateBeforeCall(Long amount, Long amountGt, Long amountGte, Long amountLt, Long amountLte, String beforeCursor, String createdAtGte, String createdAtLte, String idempotencyId, Long limit, String sort, String state, String updatedAtGte, String updatedAtLte, String traceId, String isVoid, String instrumentBin, String instrumentAccountLast4, String instrumentBrandType, String merchantIdentityId, String merchantIdentityName, String instrumentName, String instrumentType, String merchantId, String merchantMid, String instrumentCardLast4, String merchantProcessorId, String type, String afterCursor, final ApiCallback _callback) throws ApiException {
    

        okhttp3.Call localVarCall = listAuthorizationsCall(amount, amountGt, amountGte, amountLt, amountLte, beforeCursor, createdAtGte, createdAtLte, idempotencyId, limit, sort, state, updatedAtGte, updatedAtLte, traceId, isVoid, instrumentBin, instrumentAccountLast4, instrumentBrandType, merchantIdentityId, merchantIdentityName, instrumentName, instrumentType, merchantId, merchantMid, instrumentCardLast4, merchantProcessorId, type, afterCursor, _callback);
        return localVarCall;

    }


    private ApiResponse<AuthorizationsList> listAuthorizationsWithHttpInfo(Long amount, Long amountGt, Long amountGte, Long amountLt, Long amountLte, String beforeCursor, String createdAtGte, String createdAtLte, String idempotencyId, Long limit, String sort, String state, String updatedAtGte, String updatedAtLte, String traceId, String isVoid, String instrumentBin, String instrumentAccountLast4, String instrumentBrandType, String merchantIdentityId, String merchantIdentityName, String instrumentName, String instrumentType, String merchantId, String merchantMid, String instrumentCardLast4, String merchantProcessorId, String type, String afterCursor) throws ApiException {
        okhttp3.Call localVarCall = listAuthorizationsValidateBeforeCall(amount, amountGt, amountGte, amountLt, amountLte, beforeCursor, createdAtGte, createdAtLte, idempotencyId, limit, sort, state, updatedAtGte, updatedAtLte, traceId, isVoid, instrumentBin, instrumentAccountLast4, instrumentBrandType, merchantIdentityId, merchantIdentityName, instrumentName, instrumentType, merchantId, merchantMid, instrumentCardLast4, merchantProcessorId, type, afterCursor, null);
        Type localVarReturnType = new TypeToken<AuthorizationsList>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAuthorizationsAsync(Long amount, Long amountGt, Long amountGte, Long amountLt, Long amountLte, String beforeCursor, String createdAtGte, String createdAtLte, String idempotencyId, Long limit, String sort, String state, String updatedAtGte, String updatedAtLte, String traceId, String isVoid, String instrumentBin, String instrumentAccountLast4, String instrumentBrandType, String merchantIdentityId, String merchantIdentityName, String instrumentName, String instrumentType, String merchantId, String merchantMid, String instrumentCardLast4, String merchantProcessorId, String type, String afterCursor, final ApiCallback<AuthorizationsList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAuthorizationsValidateBeforeCall(amount, amountGt, amountGte, amountLt, amountLte, beforeCursor, createdAtGte, createdAtLte, idempotencyId, limit, sort, state, updatedAtGte, updatedAtLte, traceId, isVoid, instrumentBin, instrumentAccountLast4, instrumentBrandType, merchantIdentityId, merchantIdentityName, instrumentName, instrumentType, merchantId, merchantMid, instrumentCardLast4, merchantProcessorId, type, afterCursor, _callback);
        Type localVarReturnType = new TypeToken<AuthorizationsList>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistAuthorizationsRequest {
        private Long amount;
        private Long amountGt;
        private Long amountGte;
        private Long amountLt;
        private Long amountLte;
        private String beforeCursor;
        private String createdAtGte;
        private String createdAtLte;
        private String idempotencyId;
        private Long limit;
        private String sort;
        private String state;
        private String updatedAtGte;
        private String updatedAtLte;
        private String traceId;
        private String isVoid;
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
        private String afterCursor;

        private APIlistAuthorizationsRequest() {
        }

        /**
        * Set amount
        * @param amount Filter by an amount equal to the given value. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
        * Set amountGt
        * @param amountGt Filter by an amount greater than. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest amountGt(Long amountGt) {
            this.amountGt = amountGt;
            return this;
        }

        /**
        * Set amountGte
        * @param amountGte Filter by an amount greater than or equal. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest amountGte(Long amountGte) {
            this.amountGte = amountGte;
            return this;
        }

        /**
        * Set amountLt
        * @param amountLt Filter by an amount less than. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest amountLt(Long amountLt) {
            this.amountLt = amountLt;
            return this;
        }

        /**
        * Set amountLte
        * @param amountLte Filter by an amount less than or equal. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest amountLte(Long amountLte) {
            this.amountLte = amountLte;
            return this;
        }

        /**
        * Set beforeCursor
        * @param beforeCursor Return every resource created before the cursor value. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest beforeCursor(String beforeCursor) {
            this.beforeCursor = beforeCursor;
            return this;
        }

        /**
        * Set createdAtGte
        * @param createdAtGte Filter where &#x60;created_at&#x60; is after the given date. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest createdAtGte(String createdAtGte) {
            this.createdAtGte = createdAtGte;
            return this;
        }

        /**
        * Set createdAtLte
        * @param createdAtLte Filter where &#x60;created_at&#x60; is before the given date. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest createdAtLte(String createdAtLte) {
            this.createdAtLte = createdAtLte;
            return this;
        }

        /**
        * Set idempotencyId
        * @param idempotencyId Filter by &#x60;idempotency_id&#x60;. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest idempotencyId(String idempotencyId) {
            this.idempotencyId = idempotencyId;
            return this;
        }

        /**
        * Set limit
        * @param limit The numbers of items to return. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
        * Set sort
        * @param sort Specify key to be used for sorting the collection. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest sort(String sort) {
            this.sort = sort;
            return this;
        }

        /**
        * Set state
        * @param state Filter by Transaction state. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest state(String state) {
            this.state = state;
            return this;
        }

        /**
        * Set updatedAtGte
        * @param updatedAtGte Filter where &#x60;updated_at&#x60; is after the given date. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest updatedAtGte(String updatedAtGte) {
            this.updatedAtGte = updatedAtGte;
            return this;
        }

        /**
        * Set updatedAtLte
        * @param updatedAtLte Filter where &#x60;updated_at&#x60; is before the given date. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest updatedAtLte(String updatedAtLte) {
            this.updatedAtLte = updatedAtLte;
            return this;
        }

        /**
        * Set traceId
        * @param traceId Filter by &#x60;trace_id&#x60;. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        /**
        * Set isVoid
        * @param isVoid Filter by &#x60;idempotency_id&#x60;. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest isVoid(String isVoid) {
            this.isVoid = isVoid;
            return this;
        }

        /**
        * Set instrumentBin
        * @param instrumentBin Filter by Bank Identification Number (BIN). The BIN is the first 6 digits of the masked number. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest instrumentBin(String instrumentBin) {
            this.instrumentBin = instrumentBin;
            return this;
        }

        /**
        * Set instrumentAccountLast4
        * @param instrumentAccountLast4 Filter Transactions by the last 4 digits of the bank account. The bank account last 4 are the last 4 digits of the masked number instrument_account_last4&#x3D;9444 BIN. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest instrumentAccountLast4(String instrumentAccountLast4) {
            this.instrumentAccountLast4 = instrumentAccountLast4;
            return this;
        }

        /**
        * Set instrumentBrandType
        * @param instrumentBrandType Filter by card brand. Available card brand types can be found in the drop-down. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest instrumentBrandType(String instrumentBrandType) {
            this.instrumentBrandType = instrumentBrandType;
            return this;
        }

        /**
        * Set merchantIdentityId
        * @param merchantIdentityId Filter by &#x60;Identity&#x60; ID. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest merchantIdentityId(String merchantIdentityId) {
            this.merchantIdentityId = merchantIdentityId;
            return this;
        }

        /**
        * Set merchantIdentityName
        * @param merchantIdentityName Filter Transactions by &#x60;Identity&#x60; name. The name is not case-sensitive. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest merchantIdentityName(String merchantIdentityName) {
            this.merchantIdentityName = merchantIdentityName;
            return this;
        }

        /**
        * Set instrumentName
        * @param instrumentName Filter Transactions by &#x60;Payment Instrument&#x60; name. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest instrumentName(String instrumentName) {
            this.instrumentName = instrumentName;
            return this;
        }

        /**
        * Set instrumentType
        * @param instrumentType Filter Transactions by &#x60;Payment Instrument&#x60; type. Available instrument types include: Bank Account or Payment Card. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest instrumentType(String instrumentType) {
            this.instrumentType = instrumentType;
            return this;
        }

        /**
        * Set merchantId
        * @param merchantId Filter by &#x60;Merchant&#x60; ID. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest merchantId(String merchantId) {
            this.merchantId = merchantId;
            return this;
        }

        /**
        * Set merchantMid
        * @param merchantMid Filter by Merchant Identification Number (MID). (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest merchantMid(String merchantMid) {
            this.merchantMid = merchantMid;
            return this;
        }

        /**
        * Set instrumentCardLast4
        * @param instrumentCardLast4 Filter by the payment card last 4 digits. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest instrumentCardLast4(String instrumentCardLast4) {
            this.instrumentCardLast4 = instrumentCardLast4;
            return this;
        }

        /**
        * Set merchantProcessorId
        * @param merchantProcessorId Filter by &#x60;Processor&#x60; ID. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest merchantProcessorId(String merchantProcessorId) {
            this.merchantProcessorId = merchantProcessorId;
            return this;
        }

        /**
        * Set type
        * @param type Type of the &#x60;Authorization&#x60;. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest type(String type) {
            this.type = type;
            return this;
        }

        /**
        * Set afterCursor
        * @param afterCursor Return every resource created after the cursor value. (optional)
        * @return APIlistAuthorizationsRequest
        */
        public APIlistAuthorizationsRequest afterCursor(String afterCursor) {
            this.afterCursor = afterCursor;
            return this;
        }

        /**
        * Build call for listAuthorizations
        * @param _callback ApiCallback API callback
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Authorization objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listAuthorizationsCall(amount, amountGt, amountGte, amountLt, amountLte, beforeCursor, createdAtGte, createdAtLte, idempotencyId, limit, sort, state, updatedAtGte, updatedAtLte, traceId, isVoid, instrumentBin, instrumentAccountLast4, instrumentBrandType, merchantIdentityId, merchantIdentityName, instrumentName, instrumentType, merchantId, merchantMid, instrumentCardLast4, merchantProcessorId, type, afterCursor, _callback);
        }

        /**
        * Execute listAuthorizations request
            * @return AuthorizationsList
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Authorization objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public AuthorizationsList execute() throws ApiException {
            ApiResponse<AuthorizationsList> localVarResp = listAuthorizationsWithHttpInfo(amount, amountGt, amountGte, amountLt, amountLte, beforeCursor, createdAtGte, createdAtLte, idempotencyId, limit, sort, state, updatedAtGte, updatedAtLte, traceId, isVoid, instrumentBin, instrumentAccountLast4, instrumentBrandType, merchantIdentityId, merchantIdentityName, instrumentName, instrumentType, merchantId, merchantMid, instrumentCardLast4, merchantProcessorId, type, afterCursor);
            return localVarResp.getData();
        }

        /**
        * Execute listAuthorizations request with HTTP info returned
        * @return ApiResponse&lt;AuthorizationsList&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Authorization objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public ApiResponse<AuthorizationsList> executeWithHttpInfo() throws ApiException {
            return listAuthorizationsWithHttpInfo(amount, amountGt, amountGte, amountLt, amountLte, beforeCursor, createdAtGte, createdAtLte, idempotencyId, limit, sort, state, updatedAtGte, updatedAtLte, traceId, isVoid, instrumentBin, instrumentAccountLast4, instrumentBrandType, merchantIdentityId, merchantIdentityName, instrumentName, instrumentType, merchantId, merchantMid, instrumentCardLast4, merchantProcessorId, type, afterCursor);
        }

        /**
        * Execute listAuthorizations request (asynchronously)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Authorization objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call executeAsync(final ApiCallback<AuthorizationsList> _callback) throws ApiException {
            return listAuthorizationsAsync(amount, amountGt, amountGte, amountLt, amountLte, beforeCursor, createdAtGte, createdAtLte, idempotencyId, limit, sort, state, updatedAtGte, updatedAtLte, traceId, isVoid, instrumentBin, instrumentAccountLast4, instrumentBrandType, merchantIdentityId, merchantIdentityName, instrumentName, instrumentType, merchantId, merchantMid, instrumentCardLast4, merchantProcessorId, type, afterCursor, _callback);
        }
    }

    /**
    * List Authorizations
    * Retrieve a list of &#x60;Authorizations&#x60;. 
    * @return APIlistAuthorizationsRequest
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> List of Authorization objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public FinixList list( ListAuthorizationsQueryParams listAuthorizationsQueryParams)
        throws ApiException{

        APIlistAuthorizationsRequest request = new APIlistAuthorizationsRequest();
        request.amount(listAuthorizationsQueryParams.getAmount());
        request.amountGt(listAuthorizationsQueryParams.getAmountGt());
        request.amountGte(listAuthorizationsQueryParams.getAmountGte());
        request.amountLt(listAuthorizationsQueryParams.getAmountLt());
        request.amountLte(listAuthorizationsQueryParams.getAmountLte());
        request.beforeCursor(listAuthorizationsQueryParams.getBeforeCursor());
        request.createdAtGte(listAuthorizationsQueryParams.getCreatedAtGte());
        request.createdAtLte(listAuthorizationsQueryParams.getCreatedAtLte());
        request.idempotencyId(listAuthorizationsQueryParams.getIdempotencyId());
        request.limit(listAuthorizationsQueryParams.getLimit());
        request.sort(listAuthorizationsQueryParams.getSort());
        request.state(listAuthorizationsQueryParams.getState());
        request.updatedAtGte(listAuthorizationsQueryParams.getUpdatedAtGte());
        request.updatedAtLte(listAuthorizationsQueryParams.getUpdatedAtLte());
        request.traceId(listAuthorizationsQueryParams.getTraceId());
        request.isVoid(listAuthorizationsQueryParams.getIsVoid());
        request.instrumentBin(listAuthorizationsQueryParams.getInstrumentBin());
        request.instrumentAccountLast4(listAuthorizationsQueryParams.getInstrumentAccountLast4());
        request.instrumentBrandType(listAuthorizationsQueryParams.getInstrumentBrandType());
        request.merchantIdentityId(listAuthorizationsQueryParams.getMerchantIdentityId());
        request.merchantIdentityName(listAuthorizationsQueryParams.getMerchantIdentityName());
        request.instrumentName(listAuthorizationsQueryParams.getInstrumentName());
        request.instrumentType(listAuthorizationsQueryParams.getInstrumentType());
        request.merchantId(listAuthorizationsQueryParams.getMerchantId());
        request.merchantMid(listAuthorizationsQueryParams.getMerchantMid());
        request.instrumentCardLast4(listAuthorizationsQueryParams.getInstrumentCardLast4());
        request.merchantProcessorId(listAuthorizationsQueryParams.getMerchantProcessorId());
        request.type(listAuthorizationsQueryParams.getType());
        request.afterCursor(listAuthorizationsQueryParams.getAfterCursor());
        AuthorizationsList response = request.execute();
        Boolean hasNextCursor = (response.getPage().getClass().getName() == "model.PageCursor");
        ListAuthorizationsQueryParams queryParams = (ListAuthorizationsQueryParams) getQueryParam(response.getPage(),
            listAuthorizationsQueryParams,
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
