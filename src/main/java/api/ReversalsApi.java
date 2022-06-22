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
import model.TransferReversalsList;

//import model.ListApplicationReversalsQueryParams;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ReversalsApi {
private FinixClient localVarFinixClient;
private int localHostIndex;
private String localCustomBaseUrl;

public ReversalsApi() {
this(Configuration.getDefaultFinixClient());
}

public ReversalsApi(FinixClient finixClient) {
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

    private okhttp3.Call listApplicationReversalsCall(String applicationId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/applications/{application_id}/reversals"
            .replaceAll("\\{" + "application_id" + "\\}", localVarFinixClient.escapeString(applicationId.toString()));

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

        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return localVarFinixClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
        }

        @SuppressWarnings("rawtypes")
        private okhttp3.Call listApplicationReversalsValidateBeforeCall(String applicationId, final ApiCallback _callback) throws ApiException {
        
                // verify the required parameter 'applicationId' is set
                if (applicationId == null) {
                throw new ApiException("Missing the required parameter 'applicationId' when calling listApplicationReversals(Async)");
                }
        

            okhttp3.Call localVarCall = listApplicationReversalsCall(applicationId, _callback);
            return localVarCall;

        }


    private ApiResponse<TransferReversalsList> listApplicationReversalsWithHttpInfo(String applicationId) throws ApiException {
        okhttp3.Call localVarCall = listApplicationReversalsValidateBeforeCall(applicationId, null);
                Type localVarReturnType = new TypeToken<TransferReversalsList>(){}.getType();
                return localVarFinixClient.execute(localVarCall, localVarReturnType);
        }

    private okhttp3.Call listApplicationReversalsAsync(String applicationId, final ApiCallback<TransferReversalsList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listApplicationReversalsValidateBeforeCall(applicationId, _callback);
    Type localVarReturnType = new TypeToken<TransferReversalsList>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
        }

        public class APIlistApplicationReversalsRequest {
            private final String applicationId;

        private APIlistApplicationReversalsRequest(String applicationId) {
            this.applicationId = applicationId;
        }

        /**
        * Build call for listApplicationReversals
        * @param _callback ApiCallback API callback
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of reversals </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
        return listApplicationReversalsCall(applicationId, _callback);
        }

        /**
        * Execute listApplicationReversals request
            * @return TransferReversalsList
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of reversals </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public TransferReversalsList execute() throws ApiException {
    ApiResponse<TransferReversalsList> localVarResp = listApplicationReversalsWithHttpInfo(applicationId);
            return localVarResp.getData();
        }

        /**
        * Execute listApplicationReversals request with HTTP info returned
        * @return ApiResponse&lt;TransferReversalsList&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of reversals </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public ApiResponse<TransferReversalsList> executeWithHttpInfo() throws ApiException {
        return listApplicationReversalsWithHttpInfo(applicationId);
        }

        /**
        * Execute listApplicationReversals request (asynchronously)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of reversals </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call executeAsync(final ApiCallback<TransferReversalsList> _callback) throws ApiException {
        return listApplicationReversalsAsync(applicationId, _callback);
        }
        }

        /**
        * List Application Reversals
        * Return a collection of reversals, if there are no reversals, an empty collection will be returned. 
            * @param applicationId ID of application to use (required)
        * @return APIlistApplicationReversalsRequest
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of reversals </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
   /* public TransferReversalsList listByApplicationId(String applicationId,  ListApplicationReversalsQueryParams listApplicationReversalsQueryParams) throws ApiException {

        APIlistApplicationReversalsRequest request = new APIlistApplicationReversalsRequest(applicationId);
        return request.execute();

    }*/
    }
