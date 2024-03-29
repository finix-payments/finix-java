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

import model.AdjustmentTransfersList;
import model.CreateDisputeEvidenceRequest;
import model.Dispute;
import model.DisputeEvidence;
import model.DisputeEvidenceList;
import model.DisputesList;
import model.Error401Unauthorized;
import model.Error403ForbiddenList;
import model.Error404NotFoundList;
import model.Error406NotAcceptable;

import model.ListDisputeEvidenceQueryParams;
import model.ListDisputesQueryParams;
import model.ListDisputesAdjustmentsQueryParams;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DisputesApi {
    private FinixClient localVarFinixClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DisputesApi() {
        this(Configuration.getDefaultFinixClient());
    }

    public DisputesApi(FinixClient finixClient) {
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
    * Build call for createDisputeEvidence
        * @param disputeId ID of &#x60;Dispute&#x60; to mange evidence for. (required)
        * @param createDisputeEvidenceRequest  (optional)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 201 </td><td> Single Evidence object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call createDisputeEvidenceCall(String disputeId, CreateDisputeEvidenceRequest createDisputeEvidenceRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createDisputeEvidenceRequest;

    // create path and map variables
        String localVarPath = "/disputes/{dispute_id}/evidence"
            .replaceAll("\\{" + "dispute_id" + "\\}", localVarFinixClient.escapeString(disputeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarFormParams.put("file", createDisputeEvidenceRequest.getFile());
        final String[] localVarAccepts = {
            "application/hal+json"
        };

        final String localVarAccept = localVarFinixClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private okhttp3.Call createDisputeEvidenceValidateBeforeCall(String disputeId, CreateDisputeEvidenceRequest createDisputeEvidenceRequest, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'disputeId' is set
        if (disputeId == null) {
            throw new ApiException("Missing the required parameter 'disputeId' when calling createDisputeEvidence(Async)");
        }
    

        okhttp3.Call localVarCall = createDisputeEvidenceCall(disputeId, createDisputeEvidenceRequest, _callback);
        return localVarCall;

    }

            /**
            * Upload Dispute Evidence
            * Upload dispute evidence for a &#x60;Dispute&#x60;.  - You can upload up to 8 files; the total size of the uploaded files combined cannot exceed 10 MB. - The allowed file formats include JPG, PNG, PDF, or TIFF. - Individual PNG and JPEG files can&#39;t exceed 50 KB; PDF and TIFF files can&#39;t exceed 1 MB.
                * @param disputeId ID of &#x60;Dispute&#x60; to mange evidence for. (required)
                * @param createDisputeEvidenceRequest  (optional)
                * @return DisputeEvidence
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 201 </td><td> Single Evidence object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public DisputeEvidence createDisputeEvidence(String disputeId, CreateDisputeEvidenceRequest createDisputeEvidenceRequest) throws ApiException {
        ApiResponse<DisputeEvidence> localVarResp = createDisputeEvidenceWithHttpInfo(disputeId, createDisputeEvidenceRequest);
        return localVarResp.getData();
    }


    /**
        * Upload Dispute Evidence
        * Upload dispute evidence for a &#x60;Dispute&#x60;.  - You can upload up to 8 files; the total size of the uploaded files combined cannot exceed 10 MB. - The allowed file formats include JPG, PNG, PDF, or TIFF. - Individual PNG and JPEG files can&#39;t exceed 50 KB; PDF and TIFF files can&#39;t exceed 1 MB.
            * @param disputeId ID of &#x60;Dispute&#x60; to mange evidence for. (required)
            * @param createDisputeEvidenceRequest  (optional)
        * @return ApiResponse&lt;DisputeEvidence&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single Evidence object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<DisputeEvidence> createDisputeEvidenceWithHttpInfo(String disputeId, CreateDisputeEvidenceRequest createDisputeEvidenceRequest) throws ApiException {
        okhttp3.Call localVarCall = createDisputeEvidenceValidateBeforeCall(disputeId, createDisputeEvidenceRequest, null);
        Type localVarReturnType = new TypeToken<DisputeEvidence>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Upload Dispute Evidence (asynchronously)
        * Upload dispute evidence for a &#x60;Dispute&#x60;.  - You can upload up to 8 files; the total size of the uploaded files combined cannot exceed 10 MB. - The allowed file formats include JPG, PNG, PDF, or TIFF. - Individual PNG and JPEG files can&#39;t exceed 50 KB; PDF and TIFF files can&#39;t exceed 1 MB.
            * @param disputeId ID of &#x60;Dispute&#x60; to mange evidence for. (required)
            * @param createDisputeEvidenceRequest  (optional)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 201 </td><td> Single Evidence object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call createDisputeEvidenceAsync(String disputeId, CreateDisputeEvidenceRequest createDisputeEvidenceRequest, final ApiCallback<DisputeEvidence> _callback) throws ApiException {

        okhttp3.Call localVarCall = createDisputeEvidenceValidateBeforeCall(disputeId, createDisputeEvidenceRequest, _callback);
        Type localVarReturnType = new TypeToken<DisputeEvidence>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Build call for getDispute
        * @param disputeId ID of &#x60;Dispute&#x60; to fetch. (required)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single Dispute object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call getDisputeCall(String disputeId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/disputes/{dispute_id}"
            .replaceAll("\\{" + "dispute_id" + "\\}", localVarFinixClient.escapeString(disputeId.toString()));

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
    private okhttp3.Call getDisputeValidateBeforeCall(String disputeId, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'disputeId' is set
        if (disputeId == null) {
            throw new ApiException("Missing the required parameter 'disputeId' when calling getDispute(Async)");
        }
    

        okhttp3.Call localVarCall = getDisputeCall(disputeId, _callback);
        return localVarCall;

    }

            /**
            * Fetch a Dispute
            * Retrieve the details of a previously created &#x60;Dispute&#x60;.
                * @param disputeId ID of &#x60;Dispute&#x60; to fetch. (required)
                * @return Dispute
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single Dispute object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public Dispute get(String disputeId) throws ApiException {
        ApiResponse<Dispute> localVarResp = getDisputeWithHttpInfo(disputeId);
        return localVarResp.getData();
    }


    /**
        * Fetch a Dispute
        * Retrieve the details of a previously created &#x60;Dispute&#x60;.
            * @param disputeId ID of &#x60;Dispute&#x60; to fetch. (required)
        * @return ApiResponse&lt;Dispute&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Dispute object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<Dispute> getDisputeWithHttpInfo(String disputeId) throws ApiException {
        okhttp3.Call localVarCall = getDisputeValidateBeforeCall(disputeId, null);
        Type localVarReturnType = new TypeToken<Dispute>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Fetch a Dispute (asynchronously)
        * Retrieve the details of a previously created &#x60;Dispute&#x60;.
            * @param disputeId ID of &#x60;Dispute&#x60; to fetch. (required)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Dispute object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call getDisputeAsync(String disputeId, final ApiCallback<Dispute> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDisputeValidateBeforeCall(disputeId, _callback);
        Type localVarReturnType = new TypeToken<Dispute>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Build call for getDisputeEvidence
        * @param disputeId ID of &#x60;Dispute&#x60; to fetch evidence for. (required)
        * @param evidenceId ID of &#x60;evidence&#x60; to fetch. (required)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single Evidence object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call getDisputeEvidenceCall(String disputeId, String evidenceId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/disputes/{dispute_id}/evidence/{evidence_id}"
            .replaceAll("\\{" + "dispute_id" + "\\}", localVarFinixClient.escapeString(disputeId.toString()))
            .replaceAll("\\{" + "evidence_id" + "\\}", localVarFinixClient.escapeString(evidenceId.toString()));

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
    private okhttp3.Call getDisputeEvidenceValidateBeforeCall(String disputeId, String evidenceId, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'disputeId' is set
        if (disputeId == null) {
            throw new ApiException("Missing the required parameter 'disputeId' when calling getDisputeEvidence(Async)");
        }
    
            // verify the required parameter 'evidenceId' is set
        if (evidenceId == null) {
            throw new ApiException("Missing the required parameter 'evidenceId' when calling getDisputeEvidence(Async)");
        }
    

        okhttp3.Call localVarCall = getDisputeEvidenceCall(disputeId, evidenceId, _callback);
        return localVarCall;

    }

            /**
            * Fetch Dispute Evidence
            * Fetch evidence uploaded for a &#x60;Dispute&#x60;.   If you don&#39;t have the Finix Dashboard available, you can fetch the evidence to review the &#x60;status&#x60; of the upload to confirm the evidence got sent to the processor.
                * @param disputeId ID of &#x60;Dispute&#x60; to fetch evidence for. (required)
                * @param evidenceId ID of &#x60;evidence&#x60; to fetch. (required)
                * @return DisputeEvidence
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single Evidence object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public DisputeEvidence getDisputeEvidence(String disputeId, String evidenceId) throws ApiException {
        ApiResponse<DisputeEvidence> localVarResp = getDisputeEvidenceWithHttpInfo(disputeId, evidenceId);
        return localVarResp.getData();
    }


    /**
        * Fetch Dispute Evidence
        * Fetch evidence uploaded for a &#x60;Dispute&#x60;.   If you don&#39;t have the Finix Dashboard available, you can fetch the evidence to review the &#x60;status&#x60; of the upload to confirm the evidence got sent to the processor.
            * @param disputeId ID of &#x60;Dispute&#x60; to fetch evidence for. (required)
            * @param evidenceId ID of &#x60;evidence&#x60; to fetch. (required)
        * @return ApiResponse&lt;DisputeEvidence&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Evidence object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<DisputeEvidence> getDisputeEvidenceWithHttpInfo(String disputeId, String evidenceId) throws ApiException {
        okhttp3.Call localVarCall = getDisputeEvidenceValidateBeforeCall(disputeId, evidenceId, null);
        Type localVarReturnType = new TypeToken<DisputeEvidence>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Fetch Dispute Evidence (asynchronously)
        * Fetch evidence uploaded for a &#x60;Dispute&#x60;.   If you don&#39;t have the Finix Dashboard available, you can fetch the evidence to review the &#x60;status&#x60; of the upload to confirm the evidence got sent to the processor.
            * @param disputeId ID of &#x60;Dispute&#x60; to fetch evidence for. (required)
            * @param evidenceId ID of &#x60;evidence&#x60; to fetch. (required)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single Evidence object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call getDisputeEvidenceAsync(String disputeId, String evidenceId, final ApiCallback<DisputeEvidence> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDisputeEvidenceValidateBeforeCall(disputeId, evidenceId, _callback);
        Type localVarReturnType = new TypeToken<DisputeEvidence>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    private okhttp3.Call listDisputeEvidenceCall(String disputeId, Long limit, String afterCursor, String beforeCursor, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/disputes/{dispute_id}/evidence"
            .replaceAll("\\{" + "dispute_id" + "\\}", localVarFinixClient.escapeString(disputeId.toString()));

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
    private okhttp3.Call listDisputeEvidenceValidateBeforeCall(String disputeId, Long limit, String afterCursor, String beforeCursor, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'disputeId' is set
        if (disputeId == null) {
            throw new ApiException("Missing the required parameter 'disputeId' when calling listDisputeEvidence(Async)");
        }
    

        okhttp3.Call localVarCall = listDisputeEvidenceCall(disputeId, limit, afterCursor, beforeCursor, _callback);
        return localVarCall;

    }


    private ApiResponse<DisputeEvidenceList> listDisputeEvidenceWithHttpInfo(String disputeId, Long limit, String afterCursor, String beforeCursor) throws ApiException {
        okhttp3.Call localVarCall = listDisputeEvidenceValidateBeforeCall(disputeId, limit, afterCursor, beforeCursor, null);
        Type localVarReturnType = new TypeToken<DisputeEvidenceList>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listDisputeEvidenceAsync(String disputeId, Long limit, String afterCursor, String beforeCursor, final ApiCallback<DisputeEvidenceList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listDisputeEvidenceValidateBeforeCall(disputeId, limit, afterCursor, beforeCursor, _callback);
        Type localVarReturnType = new TypeToken<DisputeEvidenceList>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistDisputeEvidenceRequest {
        private final String disputeId;
        private Long limit;
        private String afterCursor;
        private String beforeCursor;

        private APIlistDisputeEvidenceRequest(String disputeId) {
            this.disputeId = disputeId;
        }

        /**
        * Set limit
        * @param limit The numbers of items to return. (optional)
        * @return APIlistDisputeEvidenceRequest
        */
        public APIlistDisputeEvidenceRequest limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
        * Set afterCursor
        * @param afterCursor Return every resource created after the cursor value. (optional)
        * @return APIlistDisputeEvidenceRequest
        */
        public APIlistDisputeEvidenceRequest afterCursor(String afterCursor) {
            this.afterCursor = afterCursor;
            return this;
        }

        /**
        * Set beforeCursor
        * @param beforeCursor Return every resource created before the cursor value. (optional)
        * @return APIlistDisputeEvidenceRequest
        */
        public APIlistDisputeEvidenceRequest beforeCursor(String beforeCursor) {
            this.beforeCursor = beforeCursor;
            return this;
        }

        /**
        * Build call for listDisputeEvidence
        * @param _callback ApiCallback API callback
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Evidence objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listDisputeEvidenceCall(disputeId, limit, afterCursor, beforeCursor, _callback);
        }

        /**
        * Execute listDisputeEvidence request
            * @return DisputeEvidenceList
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Evidence objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public DisputeEvidenceList execute() throws ApiException {
            ApiResponse<DisputeEvidenceList> localVarResp = listDisputeEvidenceWithHttpInfo(disputeId, limit, afterCursor, beforeCursor);
            return localVarResp.getData();
        }

        /**
        * Execute listDisputeEvidence request with HTTP info returned
        * @return ApiResponse&lt;DisputeEvidenceList&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Evidence objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public ApiResponse<DisputeEvidenceList> executeWithHttpInfo() throws ApiException {
            return listDisputeEvidenceWithHttpInfo(disputeId, limit, afterCursor, beforeCursor);
        }

        /**
        * Execute listDisputeEvidence request (asynchronously)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Evidence objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call executeAsync(final ApiCallback<DisputeEvidenceList> _callback) throws ApiException {
            return listDisputeEvidenceAsync(disputeId, limit, afterCursor, beforeCursor, _callback);
        }
    }

    /**
    * List Dispute Evidence
    * Retrieve a list of dispute evidence for a &#x60;Dispute&#x60;.
        * @param disputeId ID of &#x60;Dispute&#x60; to mange evidence for. (required)
    * @return APIlistDisputeEvidenceRequest
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> List of Evidence objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public FinixList listDisputeEvidenceByDisputeId(String disputeId,  ListDisputeEvidenceQueryParams listDisputeEvidenceQueryParams)
        throws ApiException{

        APIlistDisputeEvidenceRequest request = new APIlistDisputeEvidenceRequest(disputeId);
        request.limit(listDisputeEvidenceQueryParams.getLimit());
        request.afterCursor(listDisputeEvidenceQueryParams.getAfterCursor());
        request.beforeCursor(listDisputeEvidenceQueryParams.getBeforeCursor());
        DisputeEvidenceList response = request.execute();
        Boolean hasNextCursor = (response.getPage().getClass().getName() == "model.PageCursor");
        ListDisputeEvidenceQueryParams queryParams = (ListDisputeEvidenceQueryParams) getQueryParam(response.getPage(),
            listDisputeEvidenceQueryParams,
            hasNextCursor);
        Boolean reachedEnd = reachedEnd(response.getPage(), hasNextCursor);
        NextFetchFunction nextFetch = (a) -> {
            queryParams.setLimit(a);
            if (reachedEnd) {
            throw new ArrayIndexOutOfBoundsException();
            }
            return this.listDisputeEvidenceByDisputeId(disputeId,  queryParams);
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
    private okhttp3.Call listDisputesCall(String sort, Long offset, Long limit, String createdAtGte, String createdAtLte, String updatedAtGte, String updatedAtLte, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/disputes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (sort != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("sort", sort));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("offset", offset));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("limit", limit));
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
    private okhttp3.Call listDisputesValidateBeforeCall(String sort, Long offset, Long limit, String createdAtGte, String createdAtLte, String updatedAtGte, String updatedAtLte, final ApiCallback _callback) throws ApiException {
    

        okhttp3.Call localVarCall = listDisputesCall(sort, offset, limit, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, _callback);
        return localVarCall;

    }


    private ApiResponse<DisputesList> listDisputesWithHttpInfo(String sort, Long offset, Long limit, String createdAtGte, String createdAtLte, String updatedAtGte, String updatedAtLte) throws ApiException {
        okhttp3.Call localVarCall = listDisputesValidateBeforeCall(sort, offset, limit, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, null);
        Type localVarReturnType = new TypeToken<DisputesList>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listDisputesAsync(String sort, Long offset, Long limit, String createdAtGte, String createdAtLte, String updatedAtGte, String updatedAtLte, final ApiCallback<DisputesList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listDisputesValidateBeforeCall(sort, offset, limit, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, _callback);
        Type localVarReturnType = new TypeToken<DisputesList>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistDisputesRequest {
        private String sort;
        private Long offset;
        private Long limit;
        private String createdAtGte;
        private String createdAtLte;
        private String updatedAtGte;
        private String updatedAtLte;

        private APIlistDisputesRequest() {
        }

        /**
        * Set sort
        * @param sort Specify key to be used for sorting the collection. (optional)
        * @return APIlistDisputesRequest
        */
        public APIlistDisputesRequest sort(String sort) {
            this.sort = sort;
            return this;
        }

        /**
        * Set offset
        * @param offset The number of items to skip before starting to collect the result set. (optional)
        * @return APIlistDisputesRequest
        */
        public APIlistDisputesRequest offset(Long offset) {
            this.offset = offset;
            return this;
        }

        /**
        * Set limit
        * @param limit The numbers of items to return. (optional)
        * @return APIlistDisputesRequest
        */
        public APIlistDisputesRequest limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
        * Set createdAtGte
        * @param createdAtGte Filter where &#x60;created_at&#x60; is after the given date. (optional)
        * @return APIlistDisputesRequest
        */
        public APIlistDisputesRequest createdAtGte(String createdAtGte) {
            this.createdAtGte = createdAtGte;
            return this;
        }

        /**
        * Set createdAtLte
        * @param createdAtLte Filter where &#x60;created_at&#x60; is before the given date. (optional)
        * @return APIlistDisputesRequest
        */
        public APIlistDisputesRequest createdAtLte(String createdAtLte) {
            this.createdAtLte = createdAtLte;
            return this;
        }

        /**
        * Set updatedAtGte
        * @param updatedAtGte Filter where &#x60;updated_at&#x60; is after the given date. (optional)
        * @return APIlistDisputesRequest
        */
        public APIlistDisputesRequest updatedAtGte(String updatedAtGte) {
            this.updatedAtGte = updatedAtGte;
            return this;
        }

        /**
        * Set updatedAtLte
        * @param updatedAtLte Filter where &#x60;updated_at&#x60; is before the given date. (optional)
        * @return APIlistDisputesRequest
        */
        public APIlistDisputesRequest updatedAtLte(String updatedAtLte) {
            this.updatedAtLte = updatedAtLte;
            return this;
        }

        /**
        * Build call for listDisputes
        * @param _callback ApiCallback API callback
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Disputes </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listDisputesCall(sort, offset, limit, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, _callback);
        }

        /**
        * Execute listDisputes request
            * @return DisputesList
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Disputes </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public DisputesList execute() throws ApiException {
            ApiResponse<DisputesList> localVarResp = listDisputesWithHttpInfo(sort, offset, limit, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte);
            return localVarResp.getData();
        }

        /**
        * Execute listDisputes request with HTTP info returned
        * @return ApiResponse&lt;DisputesList&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Disputes </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public ApiResponse<DisputesList> executeWithHttpInfo() throws ApiException {
            return listDisputesWithHttpInfo(sort, offset, limit, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte);
        }

        /**
        * Execute listDisputes request (asynchronously)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of Disputes </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call executeAsync(final ApiCallback<DisputesList> _callback) throws ApiException {
            return listDisputesAsync(sort, offset, limit, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, _callback);
        }
    }

    /**
    * List Disputes
    * Retrieve a list of &#x60;Disputes&#x60;.
    * @return APIlistDisputesRequest
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> List of Disputes </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public FinixList list( ListDisputesQueryParams listDisputesQueryParams)
        throws ApiException{

        APIlistDisputesRequest request = new APIlistDisputesRequest();
        request.sort(listDisputesQueryParams.getSort());
        request.offset(listDisputesQueryParams.getOffset());
        request.limit(listDisputesQueryParams.getLimit());
        request.createdAtGte(listDisputesQueryParams.getCreatedAtGte());
        request.createdAtLte(listDisputesQueryParams.getCreatedAtLte());
        request.updatedAtGte(listDisputesQueryParams.getUpdatedAtGte());
        request.updatedAtLte(listDisputesQueryParams.getUpdatedAtLte());
        DisputesList response = request.execute();
        Boolean hasNextCursor = (response.getPage().getClass().getName() == "model.PageCursor");
        ListDisputesQueryParams queryParams = (ListDisputesQueryParams) getQueryParam(response.getPage(),
            listDisputesQueryParams,
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
    private okhttp3.Call listDisputesAdjustmentsCall(String disputeId, Long limit, String afterCursor, String beforeCursor, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/disputes/{dispute_id}/adjustment_transfers"
            .replaceAll("\\{" + "dispute_id" + "\\}", localVarFinixClient.escapeString(disputeId.toString()));

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
    private okhttp3.Call listDisputesAdjustmentsValidateBeforeCall(String disputeId, Long limit, String afterCursor, String beforeCursor, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'disputeId' is set
        if (disputeId == null) {
            throw new ApiException("Missing the required parameter 'disputeId' when calling listDisputesAdjustments(Async)");
        }
    

        okhttp3.Call localVarCall = listDisputesAdjustmentsCall(disputeId, limit, afterCursor, beforeCursor, _callback);
        return localVarCall;

    }


    private ApiResponse<AdjustmentTransfersList> listDisputesAdjustmentsWithHttpInfo(String disputeId, Long limit, String afterCursor, String beforeCursor) throws ApiException {
        okhttp3.Call localVarCall = listDisputesAdjustmentsValidateBeforeCall(disputeId, limit, afterCursor, beforeCursor, null);
        Type localVarReturnType = new TypeToken<AdjustmentTransfersList>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listDisputesAdjustmentsAsync(String disputeId, Long limit, String afterCursor, String beforeCursor, final ApiCallback<AdjustmentTransfersList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listDisputesAdjustmentsValidateBeforeCall(disputeId, limit, afterCursor, beforeCursor, _callback);
        Type localVarReturnType = new TypeToken<AdjustmentTransfersList>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistDisputesAdjustmentsRequest {
        private final String disputeId;
        private Long limit;
        private String afterCursor;
        private String beforeCursor;

        private APIlistDisputesAdjustmentsRequest(String disputeId) {
            this.disputeId = disputeId;
        }

        /**
        * Set limit
        * @param limit The numbers of items to return. (optional)
        * @return APIlistDisputesAdjustmentsRequest
        */
        public APIlistDisputesAdjustmentsRequest limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
        * Set afterCursor
        * @param afterCursor Return every resource created after the cursor value. (optional)
        * @return APIlistDisputesAdjustmentsRequest
        */
        public APIlistDisputesAdjustmentsRequest afterCursor(String afterCursor) {
            this.afterCursor = afterCursor;
            return this;
        }

        /**
        * Set beforeCursor
        * @param beforeCursor Return every resource created before the cursor value. (optional)
        * @return APIlistDisputesAdjustmentsRequest
        */
        public APIlistDisputesAdjustmentsRequest beforeCursor(String beforeCursor) {
            this.beforeCursor = beforeCursor;
            return this;
        }

        /**
        * Build call for listDisputesAdjustments
        * @param _callback ApiCallback API callback
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of adjustment_transfer objects </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listDisputesAdjustmentsCall(disputeId, limit, afterCursor, beforeCursor, _callback);
        }

        /**
        * Execute listDisputesAdjustments request
            * @return AdjustmentTransfersList
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of adjustment_transfer objects </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public AdjustmentTransfersList execute() throws ApiException {
            ApiResponse<AdjustmentTransfersList> localVarResp = listDisputesAdjustmentsWithHttpInfo(disputeId, limit, afterCursor, beforeCursor);
            return localVarResp.getData();
        }

        /**
        * Execute listDisputesAdjustments request with HTTP info returned
        * @return ApiResponse&lt;AdjustmentTransfersList&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of adjustment_transfer objects </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public ApiResponse<AdjustmentTransfersList> executeWithHttpInfo() throws ApiException {
            return listDisputesAdjustmentsWithHttpInfo(disputeId, limit, afterCursor, beforeCursor);
        }

        /**
        * Execute listDisputesAdjustments request (asynchronously)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of adjustment_transfer objects </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call executeAsync(final ApiCallback<AdjustmentTransfersList> _callback) throws ApiException {
            return listDisputesAdjustmentsAsync(disputeId, limit, afterCursor, beforeCursor, _callback);
        }
    }

    /**
    * Fetch Dispute Adjustment Transfers
    * List the adjustment &#x60;Transfers&#x60; for a &#x60;Dispute&#x60;. Depending on the stage of the &#x60;Dispute&#x60;, different adjustment &#x60;Transfer&#x60; subtypes can be applied.  There are four available subtypes for adjustment &#x60;Transfers&#x60; in &#x60;Disputes&#x60;: &lt;ul&gt;&lt;li&gt;&lt;strong&gt;PLATFORM\\_CREDIT&lt;/strong&gt;&lt;li&gt;&lt;strong&gt;MERCHANT\\_DEBIT&lt;/strong&gt;&lt;li&gt;&lt;strong&gt;MERCHANT\\_CREDIT&lt;/strong&gt;&lt;li&gt;&lt;strong&gt;PLATFORM\\_DEBIT&lt;/strong&gt;&lt;/ul&gt;
        * @param disputeId ID of the &#x60;Dispute&#x60; resource. (required)
    * @return APIlistDisputesAdjustmentsRequest
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> List of adjustment_transfer objects </td><td>  -  </td></tr>
                <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public FinixList listDisputesAdjustments(String disputeId,  ListDisputesAdjustmentsQueryParams listDisputesAdjustmentsQueryParams)
        throws ApiException{

        APIlistDisputesAdjustmentsRequest request = new APIlistDisputesAdjustmentsRequest(disputeId);
        request.limit(listDisputesAdjustmentsQueryParams.getLimit());
        request.afterCursor(listDisputesAdjustmentsQueryParams.getAfterCursor());
        request.beforeCursor(listDisputesAdjustmentsQueryParams.getBeforeCursor());
        AdjustmentTransfersList response = request.execute();
        Boolean hasNextCursor = (response.getPage().getClass().getName() == "model.PageCursor");
        ListDisputesAdjustmentsQueryParams queryParams = (ListDisputesAdjustmentsQueryParams) getQueryParam(response.getPage(),
            listDisputesAdjustmentsQueryParams,
            hasNextCursor);
        Boolean reachedEnd = reachedEnd(response.getPage(), hasNextCursor);
        NextFetchFunction nextFetch = (a) -> {
            queryParams.setLimit(a);
            if (reachedEnd) {
            throw new ArrayIndexOutOfBoundsException();
            }
            return this.listDisputesAdjustments(disputeId,  queryParams);
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
