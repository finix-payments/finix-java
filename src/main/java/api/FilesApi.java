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

import model.CreateExternalLinkRequest;
import model.CreateFileRequest;
import model.Error401Unauthorized;
import model.Error403ForbiddenList;
import model.Error404NotFoundList;
import model.Error406NotAcceptable;
import model.ExternalLink;
import model.ExternalLinksList;
import java.io.File;
import model.FilesList;
import model.ModelFile;
import model.UploadFileRequest;

import model.ListExternalLinksQueryParams;
import model.ListFilesQueryParams;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class FilesApi {
    private FinixClient localVarFinixClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FilesApi() {
        this(Configuration.getDefaultFinixClient());
    }

    public FilesApi(FinixClient finixClient) {
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
    * Build call for createExternalLink
        * @param fileId Your &#x60;File&#x60; ID. (required)
        * @param createExternalLinkRequest  (optional)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single external_link object </td><td>  -  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call createExternalLinkCall(String fileId, CreateExternalLinkRequest createExternalLinkRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createExternalLinkRequest;

    // create path and map variables
        String localVarPath = "/files/{file_id}/external_links"
            .replaceAll("\\{" + "file_id" + "\\}", localVarFinixClient.escapeString(fileId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.api+json"
        };

        final String localVarAccept = localVarFinixClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.api+json"
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
    private okhttp3.Call createExternalLinkValidateBeforeCall(String fileId, CreateExternalLinkRequest createExternalLinkRequest, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling createExternalLink(Async)");
        }
    

        okhttp3.Call localVarCall = createExternalLinkCall(fileId, createExternalLinkRequest, _callback);
        return localVarCall;

    }

            /**
            * Create an External Link
            * Create an &#x60;external_link&#x60; resource to share with users so they can upload files directly from their browser. For more info, see [Uploading files to Finix](/docs/guides/onboarding/uploading-files-to-finix/).   Once created, you can request the user to upload a file to the &#x60;external_link&#x60; resource: [Upload files to External Link](#operation/uploadExternalLink)
                * @param fileId Your &#x60;File&#x60; ID. (required)
                * @param createExternalLinkRequest  (optional)
                * @return ExternalLink
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single external_link object </td><td>  -  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public ExternalLink createExternalLink(String fileId, CreateExternalLinkRequest createExternalLinkRequest) throws ApiException {
        ApiResponse<ExternalLink> localVarResp = createExternalLinkWithHttpInfo(fileId, createExternalLinkRequest);
        return localVarResp.getData();
    }


    /**
        * Create an External Link
        * Create an &#x60;external_link&#x60; resource to share with users so they can upload files directly from their browser. For more info, see [Uploading files to Finix](/docs/guides/onboarding/uploading-files-to-finix/).   Once created, you can request the user to upload a file to the &#x60;external_link&#x60; resource: [Upload files to External Link](#operation/uploadExternalLink)
            * @param fileId Your &#x60;File&#x60; ID. (required)
            * @param createExternalLinkRequest  (optional)
        * @return ApiResponse&lt;ExternalLink&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single external_link object </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<ExternalLink> createExternalLinkWithHttpInfo(String fileId, CreateExternalLinkRequest createExternalLinkRequest) throws ApiException {
        okhttp3.Call localVarCall = createExternalLinkValidateBeforeCall(fileId, createExternalLinkRequest, null);
        Type localVarReturnType = new TypeToken<ExternalLink>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Create an External Link (asynchronously)
        * Create an &#x60;external_link&#x60; resource to share with users so they can upload files directly from their browser. For more info, see [Uploading files to Finix](/docs/guides/onboarding/uploading-files-to-finix/).   Once created, you can request the user to upload a file to the &#x60;external_link&#x60; resource: [Upload files to External Link](#operation/uploadExternalLink)
            * @param fileId Your &#x60;File&#x60; ID. (required)
            * @param createExternalLinkRequest  (optional)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single external_link object </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call createExternalLinkAsync(String fileId, CreateExternalLinkRequest createExternalLinkRequest, final ApiCallback<ExternalLink> _callback) throws ApiException {

        okhttp3.Call localVarCall = createExternalLinkValidateBeforeCall(fileId, createExternalLinkRequest, _callback);
        Type localVarReturnType = new TypeToken<ExternalLink>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Build call for createFiles
        * @param createFileRequest  (optional)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single File object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call createFilesCall(CreateFileRequest createFileRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createFileRequest;

    // create path and map variables
        String localVarPath = "/files";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.api+json"
        };

        final String localVarAccept = localVarFinixClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.api+json"
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
    private okhttp3.Call createFilesValidateBeforeCall(CreateFileRequest createFileRequest, final ApiCallback _callback) throws ApiException {
    

        okhttp3.Call localVarCall = createFilesCall(createFileRequest, _callback);
        return localVarCall;

    }

            /**
            * Create a File
            * Before uploading a file, you need to create a &#x60;File&#x60; resource.   Once created, you can [upload](/#operation/uploadFile) your file to the new &#x60;File&#x60; resource.
                * @param createFileRequest  (optional)
                * @return ModelFile
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single File object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public ModelFile create(CreateFileRequest createFileRequest) throws ApiException {
        ApiResponse<ModelFile> localVarResp = createFilesWithHttpInfo(createFileRequest);
        return localVarResp.getData();
    }


    /**
        * Create a File
        * Before uploading a file, you need to create a &#x60;File&#x60; resource.   Once created, you can [upload](/#operation/uploadFile) your file to the new &#x60;File&#x60; resource.
            * @param createFileRequest  (optional)
        * @return ApiResponse&lt;ModelFile&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single File object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<ModelFile> createFilesWithHttpInfo(CreateFileRequest createFileRequest) throws ApiException {
        okhttp3.Call localVarCall = createFilesValidateBeforeCall(createFileRequest, null);
        Type localVarReturnType = new TypeToken<ModelFile>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Create a File (asynchronously)
        * Before uploading a file, you need to create a &#x60;File&#x60; resource.   Once created, you can [upload](/#operation/uploadFile) your file to the new &#x60;File&#x60; resource.
            * @param createFileRequest  (optional)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single File object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call createFilesAsync(CreateFileRequest createFileRequest, final ApiCallback<ModelFile> _callback) throws ApiException {

        okhttp3.Call localVarCall = createFilesValidateBeforeCall(createFileRequest, _callback);
        Type localVarReturnType = new TypeToken<ModelFile>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Build call for downloadFile
        * @param fileId The ID of the &#x60;File&#x60; that was created to upload the file. (required)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call downloadFileCall(String fileId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/files/{file_id}/download"
            .replaceAll("\\{" + "file_id" + "\\}", localVarFinixClient.escapeString(fileId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
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
    private okhttp3.Call downloadFileValidateBeforeCall(String fileId, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling downloadFile(Async)");
        }
    

        okhttp3.Call localVarCall = downloadFileCall(fileId, _callback);
        return localVarCall;

    }

            /**
            * Download a file
            * Download a file that was uploaded to a &#x60;File&#x60; resource. For more info, see [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix).
                * @param fileId The ID of the &#x60;File&#x60; that was created to upload the file. (required)
                * @return File
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public File download(String fileId) throws ApiException {
        ApiResponse<File> localVarResp = downloadFileWithHttpInfo(fileId);
        return localVarResp.getData();
    }


    /**
        * Download a file
        * Download a file that was uploaded to a &#x60;File&#x60; resource. For more info, see [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix).
            * @param fileId The ID of the &#x60;File&#x60; that was created to upload the file. (required)
        * @return ApiResponse&lt;File&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<File> downloadFileWithHttpInfo(String fileId) throws ApiException {
        okhttp3.Call localVarCall = downloadFileValidateBeforeCall(fileId, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Download a file (asynchronously)
        * Download a file that was uploaded to a &#x60;File&#x60; resource. For more info, see [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix).
            * @param fileId The ID of the &#x60;File&#x60; that was created to upload the file. (required)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call downloadFileAsync(String fileId, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = downloadFileValidateBeforeCall(fileId, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Build call for getExternalLink
        * @param fileId The ID of the &#x60;File&#x60; that has the links you want to retrieve. (required)
        * @param externalLinkId The ID of the &#x60;external_link&#x60; that you want to retireve. (required)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single external_link object </td><td>  -  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call getExternalLinkCall(String fileId, String externalLinkId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/files/{file_id}/external_links/{external_link_id}"
            .replaceAll("\\{" + "file_id" + "\\}", localVarFinixClient.escapeString(fileId.toString()))
            .replaceAll("\\{" + "external_link_id" + "\\}", localVarFinixClient.escapeString(externalLinkId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.api+json"
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
    private okhttp3.Call getExternalLinkValidateBeforeCall(String fileId, String externalLinkId, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling getExternalLink(Async)");
        }
    
            // verify the required parameter 'externalLinkId' is set
        if (externalLinkId == null) {
            throw new ApiException("Missing the required parameter 'externalLinkId' when calling getExternalLink(Async)");
        }
    

        okhttp3.Call localVarCall = getExternalLinkCall(fileId, externalLinkId, _callback);
        return localVarCall;

    }

            /**
            * Fetch an External LInk
            * Fetch a previously created &#x60;external_link&#x60; resource. For more info see [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix/#create-an-external-link).
                * @param fileId The ID of the &#x60;File&#x60; that has the links you want to retrieve. (required)
                * @param externalLinkId The ID of the &#x60;external_link&#x60; that you want to retireve. (required)
                * @return ExternalLink
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single external_link object </td><td>  -  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public ExternalLink getExternalLink(String fileId, String externalLinkId) throws ApiException {
        ApiResponse<ExternalLink> localVarResp = getExternalLinkWithHttpInfo(fileId, externalLinkId);
        return localVarResp.getData();
    }


    /**
        * Fetch an External LInk
        * Fetch a previously created &#x60;external_link&#x60; resource. For more info see [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix/#create-an-external-link).
            * @param fileId The ID of the &#x60;File&#x60; that has the links you want to retrieve. (required)
            * @param externalLinkId The ID of the &#x60;external_link&#x60; that you want to retireve. (required)
        * @return ApiResponse&lt;ExternalLink&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single external_link object </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<ExternalLink> getExternalLinkWithHttpInfo(String fileId, String externalLinkId) throws ApiException {
        okhttp3.Call localVarCall = getExternalLinkValidateBeforeCall(fileId, externalLinkId, null);
        Type localVarReturnType = new TypeToken<ExternalLink>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Fetch an External LInk (asynchronously)
        * Fetch a previously created &#x60;external_link&#x60; resource. For more info see [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix/#create-an-external-link).
            * @param fileId The ID of the &#x60;File&#x60; that has the links you want to retrieve. (required)
            * @param externalLinkId The ID of the &#x60;external_link&#x60; that you want to retireve. (required)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single external_link object </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call getExternalLinkAsync(String fileId, String externalLinkId, final ApiCallback<ExternalLink> _callback) throws ApiException {

        okhttp3.Call localVarCall = getExternalLinkValidateBeforeCall(fileId, externalLinkId, _callback);
        Type localVarReturnType = new TypeToken<ExternalLink>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Build call for getFile
        * @param fileId Your &#x60;File&#x60; ID. (required)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single File object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call getFileCall(String fileId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/files/{file_id}"
            .replaceAll("\\{" + "file_id" + "\\}", localVarFinixClient.escapeString(fileId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.api+json"
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
    private okhttp3.Call getFileValidateBeforeCall(String fileId, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling getFile(Async)");
        }
    

        okhttp3.Call localVarCall = getFileCall(fileId, _callback);
        return localVarCall;

    }

            /**
            * Fetch a File
            * Retrieve the details of a &#x60;File&#x60; resource. For more info see [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix/#create-an-external-link).
                * @param fileId Your &#x60;File&#x60; ID. (required)
                * @return ModelFile
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single File object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public ModelFile get(String fileId) throws ApiException {
        ApiResponse<ModelFile> localVarResp = getFileWithHttpInfo(fileId);
        return localVarResp.getData();
    }


    /**
        * Fetch a File
        * Retrieve the details of a &#x60;File&#x60; resource. For more info see [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix/#create-an-external-link).
            * @param fileId Your &#x60;File&#x60; ID. (required)
        * @return ApiResponse&lt;ModelFile&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single File object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<ModelFile> getFileWithHttpInfo(String fileId) throws ApiException {
        okhttp3.Call localVarCall = getFileValidateBeforeCall(fileId, null);
        Type localVarReturnType = new TypeToken<ModelFile>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Fetch a File (asynchronously)
        * Retrieve the details of a &#x60;File&#x60; resource. For more info see [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix/#create-an-external-link).
            * @param fileId Your &#x60;File&#x60; ID. (required)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single File object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call getFileAsync(String fileId, final ApiCallback<ModelFile> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFileValidateBeforeCall(fileId, _callback);
        Type localVarReturnType = new TypeToken<ModelFile>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    private okhttp3.Call listExternalLinksCall(String fileId, String sort, String afterCursor, Long limit, String id, String createdAtGte, String createdAtLte, String updatedAtGte, String updatedAtLte, String beforeCursor, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/files/{file_id}/external_links"
            .replaceAll("\\{" + "file_id" + "\\}", localVarFinixClient.escapeString(fileId.toString()));

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

        if (updatedAtGte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("updated_at.gte", updatedAtGte));
        }

        if (updatedAtLte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("updated_at.lte", updatedAtLte));
        }

        if (beforeCursor != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("before_cursor", beforeCursor));
        }

        final String[] localVarAccepts = {
            "application/vnd.api+json"
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
    private okhttp3.Call listExternalLinksValidateBeforeCall(String fileId, String sort, String afterCursor, Long limit, String id, String createdAtGte, String createdAtLte, String updatedAtGte, String updatedAtLte, String beforeCursor, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling listExternalLinks(Async)");
        }
    

        okhttp3.Call localVarCall = listExternalLinksCall(fileId, sort, afterCursor, limit, id, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, beforeCursor, _callback);
        return localVarCall;

    }


    private ApiResponse<ExternalLinksList> listExternalLinksWithHttpInfo(String fileId, String sort, String afterCursor, Long limit, String id, String createdAtGte, String createdAtLte, String updatedAtGte, String updatedAtLte, String beforeCursor) throws ApiException {
        okhttp3.Call localVarCall = listExternalLinksValidateBeforeCall(fileId, sort, afterCursor, limit, id, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, beforeCursor, null);
        Type localVarReturnType = new TypeToken<ExternalLinksList>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listExternalLinksAsync(String fileId, String sort, String afterCursor, Long limit, String id, String createdAtGte, String createdAtLte, String updatedAtGte, String updatedAtLte, String beforeCursor, final ApiCallback<ExternalLinksList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listExternalLinksValidateBeforeCall(fileId, sort, afterCursor, limit, id, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, beforeCursor, _callback);
        Type localVarReturnType = new TypeToken<ExternalLinksList>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistExternalLinksRequest {
        private final String fileId;
        private String sort;
        private String afterCursor;
        private Long limit;
        private String id;
        private String createdAtGte;
        private String createdAtLte;
        private String updatedAtGte;
        private String updatedAtLte;
        private String beforeCursor;

        private APIlistExternalLinksRequest(String fileId) {
            this.fileId = fileId;
        }

        /**
        * Set sort
        * @param sort Specify key to be used for sorting the collection. (optional)
        * @return APIlistExternalLinksRequest
        */
        public APIlistExternalLinksRequest sort(String sort) {
            this.sort = sort;
            return this;
        }

        /**
        * Set afterCursor
        * @param afterCursor Return every resource created after the cursor value. (optional)
        * @return APIlistExternalLinksRequest
        */
        public APIlistExternalLinksRequest afterCursor(String afterCursor) {
            this.afterCursor = afterCursor;
            return this;
        }

        /**
        * Set limit
        * @param limit The numbers of items to return. (optional)
        * @return APIlistExternalLinksRequest
        */
        public APIlistExternalLinksRequest limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
        * Set id
        * @param id Filter by &#x60;id&#x60;. (optional)
        * @return APIlistExternalLinksRequest
        */
        public APIlistExternalLinksRequest id(String id) {
            this.id = id;
            return this;
        }

        /**
        * Set createdAtGte
        * @param createdAtGte Filter where &#x60;created_at&#x60; is after the given date. (optional)
        * @return APIlistExternalLinksRequest
        */
        public APIlistExternalLinksRequest createdAtGte(String createdAtGte) {
            this.createdAtGte = createdAtGte;
            return this;
        }

        /**
        * Set createdAtLte
        * @param createdAtLte Filter where &#x60;created_at&#x60; is before the given date. (optional)
        * @return APIlistExternalLinksRequest
        */
        public APIlistExternalLinksRequest createdAtLte(String createdAtLte) {
            this.createdAtLte = createdAtLte;
            return this;
        }

        /**
        * Set updatedAtGte
        * @param updatedAtGte Filter where &#x60;updated_at&#x60; is after the given date. (optional)
        * @return APIlistExternalLinksRequest
        */
        public APIlistExternalLinksRequest updatedAtGte(String updatedAtGte) {
            this.updatedAtGte = updatedAtGte;
            return this;
        }

        /**
        * Set updatedAtLte
        * @param updatedAtLte Filter where &#x60;updated_at&#x60; is before the given date. (optional)
        * @return APIlistExternalLinksRequest
        */
        public APIlistExternalLinksRequest updatedAtLte(String updatedAtLte) {
            this.updatedAtLte = updatedAtLte;
            return this;
        }

        /**
        * Set beforeCursor
        * @param beforeCursor Return every resource created before the cursor value. (optional)
        * @return APIlistExternalLinksRequest
        */
        public APIlistExternalLinksRequest beforeCursor(String beforeCursor) {
            this.beforeCursor = beforeCursor;
            return this;
        }

        /**
        * Build call for listExternalLinks
        * @param _callback ApiCallback API callback
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of external_link objects </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
            </table>
        */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listExternalLinksCall(fileId, sort, afterCursor, limit, id, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, beforeCursor, _callback);
        }

        /**
        * Execute listExternalLinks request
            * @return ExternalLinksList
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of external_link objects </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
            </table>
        */
        public ExternalLinksList execute() throws ApiException {
            ApiResponse<ExternalLinksList> localVarResp = listExternalLinksWithHttpInfo(fileId, sort, afterCursor, limit, id, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, beforeCursor);
            return localVarResp.getData();
        }

        /**
        * Execute listExternalLinks request with HTTP info returned
        * @return ApiResponse&lt;ExternalLinksList&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of external_link objects </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
            </table>
        */
        public ApiResponse<ExternalLinksList> executeWithHttpInfo() throws ApiException {
            return listExternalLinksWithHttpInfo(fileId, sort, afterCursor, limit, id, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, beforeCursor);
        }

        /**
        * Execute listExternalLinks request (asynchronously)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of external_link objects </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
            </table>
        */
        public okhttp3.Call executeAsync(final ApiCallback<ExternalLinksList> _callback) throws ApiException {
            return listExternalLinksAsync(fileId, sort, afterCursor, limit, id, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, beforeCursor, _callback);
        }
    }

    /**
    * List All External Links
    * List the previously created &#x60;external_links&#x60; for a &#x60;File&#x60;. For more info, see [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix/#create-an-external-link).
        * @param fileId Your &#x60;File&#x60; ID. (required)
    * @return APIlistExternalLinksRequest
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> List of external_link objects </td><td>  -  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        </table>
    */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public FinixList listExternalLinks(String fileId,  ListExternalLinksQueryParams listExternalLinksQueryParams)
        throws ApiException{

        APIlistExternalLinksRequest request = new APIlistExternalLinksRequest(fileId);
        request.sort(listExternalLinksQueryParams.getSort());
        request.afterCursor(listExternalLinksQueryParams.getAfterCursor());
        request.limit(listExternalLinksQueryParams.getLimit());
        request.id(listExternalLinksQueryParams.getId());
        request.createdAtGte(listExternalLinksQueryParams.getCreatedAtGte());
        request.createdAtLte(listExternalLinksQueryParams.getCreatedAtLte());
        request.updatedAtGte(listExternalLinksQueryParams.getUpdatedAtGte());
        request.updatedAtLte(listExternalLinksQueryParams.getUpdatedAtLte());
        request.beforeCursor(listExternalLinksQueryParams.getBeforeCursor());
        ExternalLinksList response = request.execute();
        Boolean hasNextCursor = (response.getPage().getClass().getName() == "model.PageCursor");
        ListExternalLinksQueryParams queryParams = (ListExternalLinksQueryParams) getQueryParam(response.getPage(),
            listExternalLinksQueryParams,
            hasNextCursor);
        Boolean reachedEnd = reachedEnd(response.getPage(), hasNextCursor);
        NextFetchFunction nextFetch = (a) -> {
            queryParams.setLimit(a);
            if (reachedEnd) {
            throw new ArrayIndexOutOfBoundsException();
            }
            return this.listExternalLinks(fileId,  queryParams);
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
    private okhttp3.Call listFilesCall(String sort, String afterCursor, Long limit, String id, String createdAtGte, String createdAtLte, String updatedAtGte, String updatedAtLte, String beforeCursor, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/files";

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

        if (updatedAtGte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("updated_at.gte", updatedAtGte));
        }

        if (updatedAtLte != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("updated_at.lte", updatedAtLte));
        }

        if (beforeCursor != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("before_cursor", beforeCursor));
        }

        final String[] localVarAccepts = {
            "application/vnd.api+json"
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
    private okhttp3.Call listFilesValidateBeforeCall(String sort, String afterCursor, Long limit, String id, String createdAtGte, String createdAtLte, String updatedAtGte, String updatedAtLte, String beforeCursor, final ApiCallback _callback) throws ApiException {
    

        okhttp3.Call localVarCall = listFilesCall(sort, afterCursor, limit, id, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, beforeCursor, _callback);
        return localVarCall;

    }


    private ApiResponse<FilesList> listFilesWithHttpInfo(String sort, String afterCursor, Long limit, String id, String createdAtGte, String createdAtLte, String updatedAtGte, String updatedAtLte, String beforeCursor) throws ApiException {
        okhttp3.Call localVarCall = listFilesValidateBeforeCall(sort, afterCursor, limit, id, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, beforeCursor, null);
        Type localVarReturnType = new TypeToken<FilesList>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listFilesAsync(String sort, String afterCursor, Long limit, String id, String createdAtGte, String createdAtLte, String updatedAtGte, String updatedAtLte, String beforeCursor, final ApiCallback<FilesList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listFilesValidateBeforeCall(sort, afterCursor, limit, id, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, beforeCursor, _callback);
        Type localVarReturnType = new TypeToken<FilesList>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistFilesRequest {
        private String sort;
        private String afterCursor;
        private Long limit;
        private String id;
        private String createdAtGte;
        private String createdAtLte;
        private String updatedAtGte;
        private String updatedAtLte;
        private String beforeCursor;

        private APIlistFilesRequest() {
        }

        /**
        * Set sort
        * @param sort Specify key to be used for sorting the collection. (optional)
        * @return APIlistFilesRequest
        */
        public APIlistFilesRequest sort(String sort) {
            this.sort = sort;
            return this;
        }

        /**
        * Set afterCursor
        * @param afterCursor Return every resource created after the cursor value. (optional)
        * @return APIlistFilesRequest
        */
        public APIlistFilesRequest afterCursor(String afterCursor) {
            this.afterCursor = afterCursor;
            return this;
        }

        /**
        * Set limit
        * @param limit The numbers of items to return. (optional)
        * @return APIlistFilesRequest
        */
        public APIlistFilesRequest limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
        * Set id
        * @param id Filter by &#x60;id&#x60;. (optional)
        * @return APIlistFilesRequest
        */
        public APIlistFilesRequest id(String id) {
            this.id = id;
            return this;
        }

        /**
        * Set createdAtGte
        * @param createdAtGte Filter where &#x60;created_at&#x60; is after the given date. (optional)
        * @return APIlistFilesRequest
        */
        public APIlistFilesRequest createdAtGte(String createdAtGte) {
            this.createdAtGte = createdAtGte;
            return this;
        }

        /**
        * Set createdAtLte
        * @param createdAtLte Filter where &#x60;created_at&#x60; is before the given date. (optional)
        * @return APIlistFilesRequest
        */
        public APIlistFilesRequest createdAtLte(String createdAtLte) {
            this.createdAtLte = createdAtLte;
            return this;
        }

        /**
        * Set updatedAtGte
        * @param updatedAtGte Filter where &#x60;updated_at&#x60; is after the given date. (optional)
        * @return APIlistFilesRequest
        */
        public APIlistFilesRequest updatedAtGte(String updatedAtGte) {
            this.updatedAtGte = updatedAtGte;
            return this;
        }

        /**
        * Set updatedAtLte
        * @param updatedAtLte Filter where &#x60;updated_at&#x60; is before the given date. (optional)
        * @return APIlistFilesRequest
        */
        public APIlistFilesRequest updatedAtLte(String updatedAtLte) {
            this.updatedAtLte = updatedAtLte;
            return this;
        }

        /**
        * Set beforeCursor
        * @param beforeCursor Return every resource created before the cursor value. (optional)
        * @return APIlistFilesRequest
        */
        public APIlistFilesRequest beforeCursor(String beforeCursor) {
            this.beforeCursor = beforeCursor;
            return this;
        }

        /**
        * Build call for listFiles
        * @param _callback ApiCallback API callback
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of File objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listFilesCall(sort, afterCursor, limit, id, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, beforeCursor, _callback);
        }

        /**
        * Execute listFiles request
            * @return FilesList
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of File objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public FilesList execute() throws ApiException {
            ApiResponse<FilesList> localVarResp = listFilesWithHttpInfo(sort, afterCursor, limit, id, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, beforeCursor);
            return localVarResp.getData();
        }

        /**
        * Execute listFiles request with HTTP info returned
        * @return ApiResponse&lt;FilesList&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of File objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public ApiResponse<FilesList> executeWithHttpInfo() throws ApiException {
            return listFilesWithHttpInfo(sort, afterCursor, limit, id, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, beforeCursor);
        }

        /**
        * Execute listFiles request (asynchronously)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> List of File objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call executeAsync(final ApiCallback<FilesList> _callback) throws ApiException {
            return listFilesAsync(sort, afterCursor, limit, id, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, beforeCursor, _callback);
        }
    }

    /**
    * List All Files
    * List all the &#x60;File&#x60; resources you&#39;ve created. For more info, see [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix/#step-1-create-a-file).
    * @return APIlistFilesRequest
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> List of File objects </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public FinixList list( ListFilesQueryParams listFilesQueryParams)
        throws ApiException{

        APIlistFilesRequest request = new APIlistFilesRequest();
        request.sort(listFilesQueryParams.getSort());
        request.afterCursor(listFilesQueryParams.getAfterCursor());
        request.limit(listFilesQueryParams.getLimit());
        request.id(listFilesQueryParams.getId());
        request.createdAtGte(listFilesQueryParams.getCreatedAtGte());
        request.createdAtLte(listFilesQueryParams.getCreatedAtLte());
        request.updatedAtGte(listFilesQueryParams.getUpdatedAtGte());
        request.updatedAtLte(listFilesQueryParams.getUpdatedAtLte());
        request.beforeCursor(listFilesQueryParams.getBeforeCursor());
        FilesList response = request.execute();
        Boolean hasNextCursor = (response.getPage().getClass().getName() == "model.PageCursor");
        ListFilesQueryParams queryParams = (ListFilesQueryParams) getQueryParam(response.getPage(),
            listFilesQueryParams,
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
    * Build call for uploadFile
        * @param fileId The ID of the &#x60;File&#x60; that was created to upload the file. (required)
        * @param uploadFileRequest  (optional)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single File object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call uploadFileCall(String fileId, UploadFileRequest uploadFileRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = uploadFileRequest;

    // create path and map variables
        String localVarPath = "/files/{file_id}/upload"
            .replaceAll("\\{" + "file_id" + "\\}", localVarFinixClient.escapeString(fileId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarFormParams.put("file", uploadFileRequest.getFile());
        final String[] localVarAccepts = {
            "application/vnd.api+json"
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
    private okhttp3.Call uploadFileValidateBeforeCall(String fileId, UploadFileRequest uploadFileRequest, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling uploadFile(Async)");
        }
    

        okhttp3.Call localVarCall = uploadFileCall(fileId, uploadFileRequest, _callback);
        return localVarCall;

    }

            /**
            * Upload files Directly
            * Upload files directly with a &#x60;multipart/form-data&#x60; request. For more info see, [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix/#step-2-upload-the-file).
                * @param fileId The ID of the &#x60;File&#x60; that was created to upload the file. (required)
                * @param uploadFileRequest  (optional)
                * @return ModelFile
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single File object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public ModelFile upload(String fileId, UploadFileRequest uploadFileRequest) throws ApiException {
        ApiResponse<ModelFile> localVarResp = uploadFileWithHttpInfo(fileId, uploadFileRequest);
        return localVarResp.getData();
    }


    /**
        * Upload files Directly
        * Upload files directly with a &#x60;multipart/form-data&#x60; request. For more info see, [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix/#step-2-upload-the-file).
            * @param fileId The ID of the &#x60;File&#x60; that was created to upload the file. (required)
            * @param uploadFileRequest  (optional)
        * @return ApiResponse&lt;ModelFile&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single File object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<ModelFile> uploadFileWithHttpInfo(String fileId, UploadFileRequest uploadFileRequest) throws ApiException {
        okhttp3.Call localVarCall = uploadFileValidateBeforeCall(fileId, uploadFileRequest, null);
        Type localVarReturnType = new TypeToken<ModelFile>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Upload files Directly (asynchronously)
        * Upload files directly with a &#x60;multipart/form-data&#x60; request. For more info see, [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix/#step-2-upload-the-file).
            * @param fileId The ID of the &#x60;File&#x60; that was created to upload the file. (required)
            * @param uploadFileRequest  (optional)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single File object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call uploadFileAsync(String fileId, UploadFileRequest uploadFileRequest, final ApiCallback<ModelFile> _callback) throws ApiException {

        okhttp3.Call localVarCall = uploadFileValidateBeforeCall(fileId, uploadFileRequest, _callback);
        Type localVarReturnType = new TypeToken<ModelFile>(){}.getType();
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
