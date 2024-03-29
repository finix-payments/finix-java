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

import model.CreateAssociatedIdentityRequest;
import model.CreateIdentityRequest;
import model.CreateVerificationRequest;
import model.Error401Unauthorized;
import model.Error403ForbiddenList;
import model.Error404NotFoundList;
import model.Error406NotAcceptable;
import model.ErrorGeneric;
import model.IdentitiesList;
import model.Identity;
import model.UpdateIdentityRequest;
import model.Verification;

import model.ListIdentitiesQueryParams;
import model.ListIdentityAssociatedIdentitiesQueryParams;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class IdentitiesApi {
    private FinixClient localVarFinixClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public IdentitiesApi() {
        this(Configuration.getDefaultFinixClient());
    }

    public IdentitiesApi(FinixClient finixClient) {
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
    * Build call for createAssociatedIdentity
        * @param identityId ID of &#x60;Identity&#x60; to associate object with. (required)
        * @param createAssociatedIdentityRequest  (optional)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 201 </td><td> Single Identity object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call createAssociatedIdentityCall(String identityId, CreateAssociatedIdentityRequest createAssociatedIdentityRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createAssociatedIdentityRequest;

    // create path and map variables
        String localVarPath = "/identities/{identity_id}/associated_identities"
            .replaceAll("\\{" + "identity_id" + "\\}", localVarFinixClient.escapeString(identityId.toString()));

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
    private okhttp3.Call createAssociatedIdentityValidateBeforeCall(String identityId, CreateAssociatedIdentityRequest createAssociatedIdentityRequest, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'identityId' is set
        if (identityId == null) {
            throw new ApiException("Missing the required parameter 'identityId' when calling createAssociatedIdentity(Async)");
        }
    

        okhttp3.Call localVarCall = createAssociatedIdentityCall(identityId, createAssociatedIdentityRequest, _callback);
        return localVarCall;

    }

            /**
            * Create an Associated Identity
            * Create an associated &#x60;Identity&#x60; for [every owner with 25% or more ownership](/guides/onboarding/#step-3-add-associated-identities) over the merchant.
                * @param identityId ID of &#x60;Identity&#x60; to associate object with. (required)
                * @param createAssociatedIdentityRequest  (optional)
                * @return Identity
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 201 </td><td> Single Identity object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public Identity createAssociatedIdentity(String identityId, CreateAssociatedIdentityRequest createAssociatedIdentityRequest) throws ApiException {
        ApiResponse<Identity> localVarResp = createAssociatedIdentityWithHttpInfo(identityId, createAssociatedIdentityRequest);
        return localVarResp.getData();
    }


    /**
        * Create an Associated Identity
        * Create an associated &#x60;Identity&#x60; for [every owner with 25% or more ownership](/guides/onboarding/#step-3-add-associated-identities) over the merchant.
            * @param identityId ID of &#x60;Identity&#x60; to associate object with. (required)
            * @param createAssociatedIdentityRequest  (optional)
        * @return ApiResponse&lt;Identity&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single Identity object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<Identity> createAssociatedIdentityWithHttpInfo(String identityId, CreateAssociatedIdentityRequest createAssociatedIdentityRequest) throws ApiException {
        okhttp3.Call localVarCall = createAssociatedIdentityValidateBeforeCall(identityId, createAssociatedIdentityRequest, null);
        Type localVarReturnType = new TypeToken<Identity>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Create an Associated Identity (asynchronously)
        * Create an associated &#x60;Identity&#x60; for [every owner with 25% or more ownership](/guides/onboarding/#step-3-add-associated-identities) over the merchant.
            * @param identityId ID of &#x60;Identity&#x60; to associate object with. (required)
            * @param createAssociatedIdentityRequest  (optional)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single Identity object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call createAssociatedIdentityAsync(String identityId, CreateAssociatedIdentityRequest createAssociatedIdentityRequest, final ApiCallback<Identity> _callback) throws ApiException {

        okhttp3.Call localVarCall = createAssociatedIdentityValidateBeforeCall(identityId, createAssociatedIdentityRequest, _callback);
        Type localVarReturnType = new TypeToken<Identity>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Build call for createIdentity
        * @param createIdentityRequest  (optional)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 201 </td><td> Single Identity object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call createIdentityCall(CreateIdentityRequest createIdentityRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createIdentityRequest;

    // create path and map variables
        String localVarPath = "/identities";

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
    private okhttp3.Call createIdentityValidateBeforeCall(CreateIdentityRequest createIdentityRequest, final ApiCallback _callback) throws ApiException {
    

        okhttp3.Call localVarCall = createIdentityCall(createIdentityRequest, _callback);
        return localVarCall;

    }

            /**
            * Create an Identity
            * Create an &#x60;Identity&#x60; for your merchant or buyer.  All fields for a buyer&#39;s &#x60;Identity&#x60; are optional.   Providing &#x60;business_type&#x60; indicates that the &#x60;Identity&#x60; is being created for a Merchant.  Creating &#x60;Identities&#x60; for merchants requires they provide [KYC details](/docs/guides/getting-started/). - When creating an &#x60;Identity&#x60; for a buyer , don&#39;t pass the &#x60;business_type&#x60; field. Including a value for &#x60;business_type&#x60; configures the created &#x60;Identity&#x60; to get processed as a merchant. - When creating an &#x60;Identity&#x60; for a buyer, all fields are optional . Related Guides: [Getting Started](/docs/guides/getting-started/), [Onboarding](/docs/guides/onboarding/)
                * @param createIdentityRequest  (optional)
                * @return Identity
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 201 </td><td> Single Identity object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public Identity create(CreateIdentityRequest createIdentityRequest) throws ApiException {
        ApiResponse<Identity> localVarResp = createIdentityWithHttpInfo(createIdentityRequest);
        return localVarResp.getData();
    }


    /**
        * Create an Identity
        * Create an &#x60;Identity&#x60; for your merchant or buyer.  All fields for a buyer&#39;s &#x60;Identity&#x60; are optional.   Providing &#x60;business_type&#x60; indicates that the &#x60;Identity&#x60; is being created for a Merchant.  Creating &#x60;Identities&#x60; for merchants requires they provide [KYC details](/docs/guides/getting-started/). - When creating an &#x60;Identity&#x60; for a buyer , don&#39;t pass the &#x60;business_type&#x60; field. Including a value for &#x60;business_type&#x60; configures the created &#x60;Identity&#x60; to get processed as a merchant. - When creating an &#x60;Identity&#x60; for a buyer, all fields are optional . Related Guides: [Getting Started](/docs/guides/getting-started/), [Onboarding](/docs/guides/onboarding/)
            * @param createIdentityRequest  (optional)
        * @return ApiResponse&lt;Identity&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single Identity object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<Identity> createIdentityWithHttpInfo(CreateIdentityRequest createIdentityRequest) throws ApiException {
        okhttp3.Call localVarCall = createIdentityValidateBeforeCall(createIdentityRequest, null);
        Type localVarReturnType = new TypeToken<Identity>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Create an Identity (asynchronously)
        * Create an &#x60;Identity&#x60; for your merchant or buyer.  All fields for a buyer&#39;s &#x60;Identity&#x60; are optional.   Providing &#x60;business_type&#x60; indicates that the &#x60;Identity&#x60; is being created for a Merchant.  Creating &#x60;Identities&#x60; for merchants requires they provide [KYC details](/docs/guides/getting-started/). - When creating an &#x60;Identity&#x60; for a buyer , don&#39;t pass the &#x60;business_type&#x60; field. Including a value for &#x60;business_type&#x60; configures the created &#x60;Identity&#x60; to get processed as a merchant. - When creating an &#x60;Identity&#x60; for a buyer, all fields are optional . Related Guides: [Getting Started](/docs/guides/getting-started/), [Onboarding](/docs/guides/onboarding/)
            * @param createIdentityRequest  (optional)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single Identity object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call createIdentityAsync(CreateIdentityRequest createIdentityRequest, final ApiCallback<Identity> _callback) throws ApiException {

        okhttp3.Call localVarCall = createIdentityValidateBeforeCall(createIdentityRequest, _callback);
        Type localVarReturnType = new TypeToken<Identity>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Build call for createIdentityVerification
        * @param identityId ID of &#x60;Identity&#x60; to verify. (required)
        * @param createVerificationRequest  (optional)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 201 </td><td> Single Verification object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call createIdentityVerificationCall(String identityId, CreateVerificationRequest createVerificationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createVerificationRequest;

    // create path and map variables
        String localVarPath = "/identities/{identity_id}/verifications"
            .replaceAll("\\{" + "identity_id" + "\\}", localVarFinixClient.escapeString(identityId.toString()));

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
    private okhttp3.Call createIdentityVerificationValidateBeforeCall(String identityId, CreateVerificationRequest createVerificationRequest, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'identityId' is set
        if (identityId == null) {
            throw new ApiException("Missing the required parameter 'identityId' when calling createIdentityVerification(Async)");
        }
    

        okhttp3.Call localVarCall = createIdentityVerificationCall(identityId, createVerificationRequest, _callback);
        return localVarCall;

    }

            /**
            * Verify an Identity
            * Verify an &#x60;Identity&#x60;.
                * @param identityId ID of &#x60;Identity&#x60; to verify. (required)
                * @param createVerificationRequest  (optional)
                * @return Verification
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 201 </td><td> Single Verification object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public Verification createIdentityVerification(String identityId, CreateVerificationRequest createVerificationRequest) throws ApiException {
        ApiResponse<Verification> localVarResp = createIdentityVerificationWithHttpInfo(identityId, createVerificationRequest);
        return localVarResp.getData();
    }


    /**
        * Verify an Identity
        * Verify an &#x60;Identity&#x60;.
            * @param identityId ID of &#x60;Identity&#x60; to verify. (required)
            * @param createVerificationRequest  (optional)
        * @return ApiResponse&lt;Verification&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single Verification object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<Verification> createIdentityVerificationWithHttpInfo(String identityId, CreateVerificationRequest createVerificationRequest) throws ApiException {
        okhttp3.Call localVarCall = createIdentityVerificationValidateBeforeCall(identityId, createVerificationRequest, null);
        Type localVarReturnType = new TypeToken<Verification>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Verify an Identity (asynchronously)
        * Verify an &#x60;Identity&#x60;.
            * @param identityId ID of &#x60;Identity&#x60; to verify. (required)
            * @param createVerificationRequest  (optional)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single Verification object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call createIdentityVerificationAsync(String identityId, CreateVerificationRequest createVerificationRequest, final ApiCallback<Verification> _callback) throws ApiException {

        okhttp3.Call localVarCall = createIdentityVerificationValidateBeforeCall(identityId, createVerificationRequest, _callback);
        Type localVarReturnType = new TypeToken<Verification>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Build call for getIdentity
        * @param identityId ID of the &#x60;Identity&#x60; to fetch. (required)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single Identity object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call getIdentityCall(String identityId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/identities/{identity_id}"
            .replaceAll("\\{" + "identity_id" + "\\}", localVarFinixClient.escapeString(identityId.toString()));

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
    private okhttp3.Call getIdentityValidateBeforeCall(String identityId, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'identityId' is set
        if (identityId == null) {
            throw new ApiException("Missing the required parameter 'identityId' when calling getIdentity(Async)");
        }
    

        okhttp3.Call localVarCall = getIdentityCall(identityId, _callback);
        return localVarCall;

    }

            /**
            * Fetch an Identity
            * Retrieve the details of a previously created &#x60;Identity&#x60;.
                * @param identityId ID of the &#x60;Identity&#x60; to fetch. (required)
                * @return Identity
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single Identity object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public Identity get(String identityId) throws ApiException {
        ApiResponse<Identity> localVarResp = getIdentityWithHttpInfo(identityId);
        return localVarResp.getData();
    }


    /**
        * Fetch an Identity
        * Retrieve the details of a previously created &#x60;Identity&#x60;.
            * @param identityId ID of the &#x60;Identity&#x60; to fetch. (required)
        * @return ApiResponse&lt;Identity&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Identity object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<Identity> getIdentityWithHttpInfo(String identityId) throws ApiException {
        okhttp3.Call localVarCall = getIdentityValidateBeforeCall(identityId, null);
        Type localVarReturnType = new TypeToken<Identity>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Fetch an Identity (asynchronously)
        * Retrieve the details of a previously created &#x60;Identity&#x60;.
            * @param identityId ID of the &#x60;Identity&#x60; to fetch. (required)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Identity object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call getIdentityAsync(String identityId, final ApiCallback<Identity> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIdentityValidateBeforeCall(identityId, _callback);
        Type localVarReturnType = new TypeToken<Identity>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    private okhttp3.Call listIdentitiesCall(String sort, String afterCursor, Long limit, String id, String createdAtGte, String createdAtLte, String defaultStatementDescriptor, String businessName, String businessType, String email, String firstName, String lastName, String title, String beforeCursor, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/identities";

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

        if (id != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("id", id));
        }

        if (createdAtGte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("created_at.gte", createdAtGte));
        }

        if (createdAtLte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("created_at.lte", createdAtLte));
        }

        if (defaultStatementDescriptor != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("default_statement_descriptor", defaultStatementDescriptor));
        }

        if (businessName != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("business_name", businessName));
        }

        if (businessType != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("business_type", businessType));
        }

        if (email != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("email", email));
        }

        if (firstName != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("first_name", firstName));
        }

        if (lastName != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("last_name", lastName));
        }

        if (title != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("title", title));
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
    private okhttp3.Call listIdentitiesValidateBeforeCall(String sort, String afterCursor, Long limit, String id, String createdAtGte, String createdAtLte, String defaultStatementDescriptor, String businessName, String businessType, String email, String firstName, String lastName, String title, String beforeCursor, final ApiCallback _callback) throws ApiException {
    

        okhttp3.Call localVarCall = listIdentitiesCall(sort, afterCursor, limit, id, createdAtGte, createdAtLte, defaultStatementDescriptor, businessName, businessType, email, firstName, lastName, title, beforeCursor, _callback);
        return localVarCall;

    }


    private ApiResponse<IdentitiesList> listIdentitiesWithHttpInfo(String sort, String afterCursor, Long limit, String id, String createdAtGte, String createdAtLte, String defaultStatementDescriptor, String businessName, String businessType, String email, String firstName, String lastName, String title, String beforeCursor) throws ApiException {
        okhttp3.Call localVarCall = listIdentitiesValidateBeforeCall(sort, afterCursor, limit, id, createdAtGte, createdAtLte, defaultStatementDescriptor, businessName, businessType, email, firstName, lastName, title, beforeCursor, null);
        Type localVarReturnType = new TypeToken<IdentitiesList>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listIdentitiesAsync(String sort, String afterCursor, Long limit, String id, String createdAtGte, String createdAtLte, String defaultStatementDescriptor, String businessName, String businessType, String email, String firstName, String lastName, String title, String beforeCursor, final ApiCallback<IdentitiesList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listIdentitiesValidateBeforeCall(sort, afterCursor, limit, id, createdAtGte, createdAtLte, defaultStatementDescriptor, businessName, businessType, email, firstName, lastName, title, beforeCursor, _callback);
        Type localVarReturnType = new TypeToken<IdentitiesList>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistIdentitiesRequest {
        private String sort;
        private String afterCursor;
        private Long limit;
        private String id;
        private String createdAtGte;
        private String createdAtLte;
        private String defaultStatementDescriptor;
        private String businessName;
        private String businessType;
        private String email;
        private String firstName;
        private String lastName;
        private String title;
        private String beforeCursor;

        private APIlistIdentitiesRequest() {
        }

        /**
        * Set sort
        * @param sort Specify key to be used for sorting the collection. (optional)
        * @return APIlistIdentitiesRequest
        */
        public APIlistIdentitiesRequest sort(String sort) {
            this.sort = sort;
            return this;
        }

        /**
        * Set afterCursor
        * @param afterCursor Return every resource created after the cursor value. (optional)
        * @return APIlistIdentitiesRequest
        */
        public APIlistIdentitiesRequest afterCursor(String afterCursor) {
            this.afterCursor = afterCursor;
            return this;
        }

        /**
        * Set limit
        * @param limit The numbers of items to return. (optional)
        * @return APIlistIdentitiesRequest
        */
        public APIlistIdentitiesRequest limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
        * Set id
        * @param id Filter by &#x60;id&#x60;. (optional)
        * @return APIlistIdentitiesRequest
        */
        public APIlistIdentitiesRequest id(String id) {
            this.id = id;
            return this;
        }

        /**
        * Set createdAtGte
        * @param createdAtGte Filter where &#x60;created_at&#x60; is after the given date. (optional)
        * @return APIlistIdentitiesRequest
        */
        public APIlistIdentitiesRequest createdAtGte(String createdAtGte) {
            this.createdAtGte = createdAtGte;
            return this;
        }

        /**
        * Set createdAtLte
        * @param createdAtLte Filter where &#x60;created_at&#x60; is before the given date. (optional)
        * @return APIlistIdentitiesRequest
        */
        public APIlistIdentitiesRequest createdAtLte(String createdAtLte) {
            this.createdAtLte = createdAtLte;
            return this;
        }

        /**
        * Set defaultStatementDescriptor
        * @param defaultStatementDescriptor Filter by the &#x60;default_statement_descriptor&#x60;. (optional)
        * @return APIlistIdentitiesRequest
        */
        public APIlistIdentitiesRequest defaultStatementDescriptor(String defaultStatementDescriptor) {
            this.defaultStatementDescriptor = defaultStatementDescriptor;
            return this;
        }

        /**
        * Set businessName
        * @param businessName Filter by the full business name. Partial business names are not supported. (optional)
        * @return APIlistIdentitiesRequest
        */
        public APIlistIdentitiesRequest businessName(String businessName) {
            this.businessName = businessName;
            return this;
        }

        /**
        * Set businessType
        * @param businessType Filter by the business type. Partial business types are not supported. (optional)
        * @return APIlistIdentitiesRequest
        */
        public APIlistIdentitiesRequest businessType(String businessType) {
            this.businessType = businessType;
            return this;
        }

        /**
        * Set email
        * @param email Filter by the email address or email domain. Partial emails are not supported. (optional)
        * @return APIlistIdentitiesRequest
        */
        public APIlistIdentitiesRequest email(String email) {
            this.email = email;
            return this;
        }

        /**
        * Set firstName
        * @param firstName Filter by the first name of the person associated to the &#x60;Identity&#x60;. (optional)
        * @return APIlistIdentitiesRequest
        */
        public APIlistIdentitiesRequest firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
        * Set lastName
        * @param lastName Filter by the last name of the person associated to the &#x60;Identity&#x60;. (optional)
        * @return APIlistIdentitiesRequest
        */
        public APIlistIdentitiesRequest lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
        * Set title
        * @param title Filter by the title if available. (optional)
        * @return APIlistIdentitiesRequest
        */
        public APIlistIdentitiesRequest title(String title) {
            this.title = title;
            return this;
        }

        /**
        * Set beforeCursor
        * @param beforeCursor Return every resource created before the cursor value. (optional)
        * @return APIlistIdentitiesRequest
        */
        public APIlistIdentitiesRequest beforeCursor(String beforeCursor) {
            this.beforeCursor = beforeCursor;
            return this;
        }

        /**
        * Build call for listIdentities
        * @param _callback ApiCallback API callback
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Identity objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listIdentitiesCall(sort, afterCursor, limit, id, createdAtGte, createdAtLte, defaultStatementDescriptor, businessName, businessType, email, firstName, lastName, title, beforeCursor, _callback);
        }

        /**
        * Execute listIdentities request
            * @return IdentitiesList
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Identity objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public IdentitiesList execute() throws ApiException {
            ApiResponse<IdentitiesList> localVarResp = listIdentitiesWithHttpInfo(sort, afterCursor, limit, id, createdAtGte, createdAtLte, defaultStatementDescriptor, businessName, businessType, email, firstName, lastName, title, beforeCursor);
            return localVarResp.getData();
        }

        /**
        * Execute listIdentities request with HTTP info returned
        * @return ApiResponse&lt;IdentitiesList&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Identity objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public ApiResponse<IdentitiesList> executeWithHttpInfo() throws ApiException {
            return listIdentitiesWithHttpInfo(sort, afterCursor, limit, id, createdAtGte, createdAtLte, defaultStatementDescriptor, businessName, businessType, email, firstName, lastName, title, beforeCursor);
        }

        /**
        * Execute listIdentities request (asynchronously)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Identity objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call executeAsync(final ApiCallback<IdentitiesList> _callback) throws ApiException {
            return listIdentitiesAsync(sort, afterCursor, limit, id, createdAtGte, createdAtLte, defaultStatementDescriptor, businessName, businessType, email, firstName, lastName, title, beforeCursor, _callback);
        }
    }

    /**
    * List Identities
    * Retrieves a list of &#x60;Identities&#x60;.
    * @return APIlistIdentitiesRequest
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> List of Identity objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public FinixList list( ListIdentitiesQueryParams listIdentitiesQueryParams)
        throws ApiException{

        APIlistIdentitiesRequest request = new APIlistIdentitiesRequest();
        request.sort(listIdentitiesQueryParams.getSort());
        request.afterCursor(listIdentitiesQueryParams.getAfterCursor());
        request.limit(listIdentitiesQueryParams.getLimit());
        request.id(listIdentitiesQueryParams.getId());
        request.createdAtGte(listIdentitiesQueryParams.getCreatedAtGte());
        request.createdAtLte(listIdentitiesQueryParams.getCreatedAtLte());
        request.defaultStatementDescriptor(listIdentitiesQueryParams.getDefaultStatementDescriptor());
        request.businessName(listIdentitiesQueryParams.getBusinessName());
        request.businessType(listIdentitiesQueryParams.getBusinessType());
        request.email(listIdentitiesQueryParams.getEmail());
        request.firstName(listIdentitiesQueryParams.getFirstName());
        request.lastName(listIdentitiesQueryParams.getLastName());
        request.title(listIdentitiesQueryParams.getTitle());
        request.beforeCursor(listIdentitiesQueryParams.getBeforeCursor());
        IdentitiesList response = request.execute();
        Boolean hasNextCursor = (response.getPage().getClass().getName() == "model.PageCursor");
        ListIdentitiesQueryParams queryParams = (ListIdentitiesQueryParams) getQueryParam(response.getPage(),
            listIdentitiesQueryParams,
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
    private okhttp3.Call listIdentityAssociatedIdentitiesCall(String identityId, Long limit, String afterCursor, String beforeCursor, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/identities/{identity_id}/associated_identities"
            .replaceAll("\\{" + "identity_id" + "\\}", localVarFinixClient.escapeString(identityId.toString()));

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
    private okhttp3.Call listIdentityAssociatedIdentitiesValidateBeforeCall(String identityId, Long limit, String afterCursor, String beforeCursor, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'identityId' is set
        if (identityId == null) {
            throw new ApiException("Missing the required parameter 'identityId' when calling listIdentityAssociatedIdentities(Async)");
        }
    

        okhttp3.Call localVarCall = listIdentityAssociatedIdentitiesCall(identityId, limit, afterCursor, beforeCursor, _callback);
        return localVarCall;

    }


    private ApiResponse<IdentitiesList> listIdentityAssociatedIdentitiesWithHttpInfo(String identityId, Long limit, String afterCursor, String beforeCursor) throws ApiException {
        okhttp3.Call localVarCall = listIdentityAssociatedIdentitiesValidateBeforeCall(identityId, limit, afterCursor, beforeCursor, null);
        Type localVarReturnType = new TypeToken<IdentitiesList>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listIdentityAssociatedIdentitiesAsync(String identityId, Long limit, String afterCursor, String beforeCursor, final ApiCallback<IdentitiesList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listIdentityAssociatedIdentitiesValidateBeforeCall(identityId, limit, afterCursor, beforeCursor, _callback);
        Type localVarReturnType = new TypeToken<IdentitiesList>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistIdentityAssociatedIdentitiesRequest {
        private final String identityId;
        private Long limit;
        private String afterCursor;
        private String beforeCursor;

        private APIlistIdentityAssociatedIdentitiesRequest(String identityId) {
            this.identityId = identityId;
        }

        /**
        * Set limit
        * @param limit The number of entries to return. (optional)
        * @return APIlistIdentityAssociatedIdentitiesRequest
        */
        public APIlistIdentityAssociatedIdentitiesRequest limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
        * Set afterCursor
        * @param afterCursor Return every resource created after the cursor value. (optional)
        * @return APIlistIdentityAssociatedIdentitiesRequest
        */
        public APIlistIdentityAssociatedIdentitiesRequest afterCursor(String afterCursor) {
            this.afterCursor = afterCursor;
            return this;
        }

        /**
        * Set beforeCursor
        * @param beforeCursor Return every resource created before the cursor value. (optional)
        * @return APIlistIdentityAssociatedIdentitiesRequest
        */
        public APIlistIdentityAssociatedIdentitiesRequest beforeCursor(String beforeCursor) {
            this.beforeCursor = beforeCursor;
            return this;
        }

        /**
        * Build call for listIdentityAssociatedIdentities
        * @param _callback ApiCallback API callback
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Identity objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listIdentityAssociatedIdentitiesCall(identityId, limit, afterCursor, beforeCursor, _callback);
        }

        /**
        * Execute listIdentityAssociatedIdentities request
            * @return IdentitiesList
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Identity objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public IdentitiesList execute() throws ApiException {
            ApiResponse<IdentitiesList> localVarResp = listIdentityAssociatedIdentitiesWithHttpInfo(identityId, limit, afterCursor, beforeCursor);
            return localVarResp.getData();
        }

        /**
        * Execute listIdentityAssociatedIdentities request with HTTP info returned
        * @return ApiResponse&lt;IdentitiesList&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Identity objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public ApiResponse<IdentitiesList> executeWithHttpInfo() throws ApiException {
            return listIdentityAssociatedIdentitiesWithHttpInfo(identityId, limit, afterCursor, beforeCursor);
        }

        /**
        * Execute listIdentityAssociatedIdentities request (asynchronously)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Identity objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call executeAsync(final ApiCallback<IdentitiesList> _callback) throws ApiException {
            return listIdentityAssociatedIdentitiesAsync(identityId, limit, afterCursor, beforeCursor, _callback);
        }
    }

    /**
    * List Associated Identities
    * Retrieve a list of &#x60;Associated Identities&#x60; for an &#x60;Identity&#x60;.
        * @param identityId ID of &#x60;Identity&#x60; to associate object with. (required)
    * @return APIlistIdentityAssociatedIdentitiesRequest
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> List of Identity objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public FinixList listAssociatedIdentities(String identityId,  ListIdentityAssociatedIdentitiesQueryParams listIdentityAssociatedIdentitiesQueryParams)
        throws ApiException{

        APIlistIdentityAssociatedIdentitiesRequest request = new APIlistIdentityAssociatedIdentitiesRequest(identityId);
        request.limit(listIdentityAssociatedIdentitiesQueryParams.getLimit());
        request.afterCursor(listIdentityAssociatedIdentitiesQueryParams.getAfterCursor());
        request.beforeCursor(listIdentityAssociatedIdentitiesQueryParams.getBeforeCursor());
        IdentitiesList response = request.execute();
        Boolean hasNextCursor = (response.getPage().getClass().getName() == "model.PageCursor");
        ListIdentityAssociatedIdentitiesQueryParams queryParams = (ListIdentityAssociatedIdentitiesQueryParams) getQueryParam(response.getPage(),
            listIdentityAssociatedIdentitiesQueryParams,
            hasNextCursor);
        Boolean reachedEnd = reachedEnd(response.getPage(), hasNextCursor);
        NextFetchFunction nextFetch = (a) -> {
            queryParams.setLimit(a);
            if (reachedEnd) {
            throw new ArrayIndexOutOfBoundsException();
            }
            return this.listAssociatedIdentities(identityId,  queryParams);
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
    * Build call for updateIdentity
        * @param identityId ID of the &#x60;Identity&#x60; to fetch. (required)
        * @param updateIdentityRequest  (optional)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single Identity object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call updateIdentityCall(String identityId, UpdateIdentityRequest updateIdentityRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateIdentityRequest;

    // create path and map variables
        String localVarPath = "/identities/{identity_id}"
            .replaceAll("\\{" + "identity_id" + "\\}", localVarFinixClient.escapeString(identityId.toString()));

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
    private okhttp3.Call updateIdentityValidateBeforeCall(String identityId, UpdateIdentityRequest updateIdentityRequest, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'identityId' is set
        if (identityId == null) {
            throw new ApiException("Missing the required parameter 'identityId' when calling updateIdentity(Async)");
        }
    

        okhttp3.Call localVarCall = updateIdentityCall(identityId, updateIdentityRequest, _callback);
        return localVarCall;

    }

            /**
            * Update an Identity
            * Update an existing &#x60;Identity&#x60;.  If you are updating the &#x60;Identity&#x60; of a &#x60;Merchant&#x60; that’s already been onboarded, you need to [verify the merchant again](#operation/createMerchantVerification).
                * @param identityId ID of the &#x60;Identity&#x60; to fetch. (required)
                * @param updateIdentityRequest  (optional)
                * @return Identity
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single Identity object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public Identity update(String identityId, UpdateIdentityRequest updateIdentityRequest) throws ApiException {
        ApiResponse<Identity> localVarResp = updateIdentityWithHttpInfo(identityId, updateIdentityRequest);
        return localVarResp.getData();
    }


    /**
        * Update an Identity
        * Update an existing &#x60;Identity&#x60;.  If you are updating the &#x60;Identity&#x60; of a &#x60;Merchant&#x60; that’s already been onboarded, you need to [verify the merchant again](#operation/createMerchantVerification).
            * @param identityId ID of the &#x60;Identity&#x60; to fetch. (required)
            * @param updateIdentityRequest  (optional)
        * @return ApiResponse&lt;Identity&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Identity object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<Identity> updateIdentityWithHttpInfo(String identityId, UpdateIdentityRequest updateIdentityRequest) throws ApiException {
        okhttp3.Call localVarCall = updateIdentityValidateBeforeCall(identityId, updateIdentityRequest, null);
        Type localVarReturnType = new TypeToken<Identity>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Update an Identity (asynchronously)
        * Update an existing &#x60;Identity&#x60;.  If you are updating the &#x60;Identity&#x60; of a &#x60;Merchant&#x60; that’s already been onboarded, you need to [verify the merchant again](#operation/createMerchantVerification).
            * @param identityId ID of the &#x60;Identity&#x60; to fetch. (required)
            * @param updateIdentityRequest  (optional)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Identity object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call updateIdentityAsync(String identityId, UpdateIdentityRequest updateIdentityRequest, final ApiCallback<Identity> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateIdentityValidateBeforeCall(identityId, updateIdentityRequest, _callback);
        Type localVarReturnType = new TypeToken<Identity>(){}.getType();
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
