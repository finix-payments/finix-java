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

import model.CreateInstrumentUpdateRequest;
import model.Error401Unauthorized;
import model.Error403ForbiddenList;
import model.Error404NotFoundList;
import model.Error406NotAcceptable;
import model.ErrorGeneric;
import java.io.File;
import model.InstrumentUpdate;

import model.DownloadInstrumentUpdateQueryParams;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class InstrumentUpdatesApi {
    private FinixClient localVarFinixClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public InstrumentUpdatesApi() {
        this(Configuration.getDefaultFinixClient());
    }

    public InstrumentUpdatesApi(FinixClient finixClient) {
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
    * Build call for createPaymentInstrumentUpdate
        * @param createInstrumentUpdateRequest  (optional)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single instrument_update object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call createPaymentInstrumentUpdateCall(CreateInstrumentUpdateRequest createInstrumentUpdateRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createInstrumentUpdateRequest;

    // create path and map variables
        String localVarPath = "/instrument_updates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarFormParams.put("file", createInstrumentUpdateRequest.getFile());
        localVarFormParams.put("request", createInstrumentUpdateRequest.getRequest());
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
    private okhttp3.Call createPaymentInstrumentUpdateValidateBeforeCall(CreateInstrumentUpdateRequest createInstrumentUpdateRequest, final ApiCallback _callback) throws ApiException {
    

        okhttp3.Call localVarCall = createPaymentInstrumentUpdateCall(createInstrumentUpdateRequest, _callback);
        return localVarCall;

    }

            /**
            * Create Instrument Updates
            * To update the card details of your customers, create an &#x60;instrument_updates&#x60; resource. Include the &#x60;Payment Instrument&#x60; IDs you want to update in a CSV.
                * @param createInstrumentUpdateRequest  (optional)
                * @return InstrumentUpdate
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single instrument_update object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public InstrumentUpdate create(CreateInstrumentUpdateRequest createInstrumentUpdateRequest) throws ApiException {
        ApiResponse<InstrumentUpdate> localVarResp = createPaymentInstrumentUpdateWithHttpInfo(createInstrumentUpdateRequest);
        return localVarResp.getData();
    }


    /**
        * Create Instrument Updates
        * To update the card details of your customers, create an &#x60;instrument_updates&#x60; resource. Include the &#x60;Payment Instrument&#x60; IDs you want to update in a CSV.
            * @param createInstrumentUpdateRequest  (optional)
        * @return ApiResponse&lt;InstrumentUpdate&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single instrument_update object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<InstrumentUpdate> createPaymentInstrumentUpdateWithHttpInfo(CreateInstrumentUpdateRequest createInstrumentUpdateRequest) throws ApiException {
        okhttp3.Call localVarCall = createPaymentInstrumentUpdateValidateBeforeCall(createInstrumentUpdateRequest, null);
        Type localVarReturnType = new TypeToken<InstrumentUpdate>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Create Instrument Updates (asynchronously)
        * To update the card details of your customers, create an &#x60;instrument_updates&#x60; resource. Include the &#x60;Payment Instrument&#x60; IDs you want to update in a CSV.
            * @param createInstrumentUpdateRequest  (optional)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single instrument_update object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 400 </td><td> Error </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call createPaymentInstrumentUpdateAsync(CreateInstrumentUpdateRequest createInstrumentUpdateRequest, final ApiCallback<InstrumentUpdate> _callback) throws ApiException {

        okhttp3.Call localVarCall = createPaymentInstrumentUpdateValidateBeforeCall(createInstrumentUpdateRequest, _callback);
        Type localVarReturnType = new TypeToken<InstrumentUpdate>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    private okhttp3.Call downloadInstrumentUpdateCall(String instrumentUpdatesId, String format, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/instrument_updates/{instrument_updates_id}/download"
            .replaceAll("\\{" + "instrument_updates_id" + "\\}", localVarFinixClient.escapeString(instrumentUpdatesId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (format != null) {
            localVarQueryParams.addAll(localVarFinixClient.parameterToPair("format", format));
        }

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

        localVarHeaderParams.put("Finix-Version", "2022-02-01");
        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return localVarFinixClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

        @SuppressWarnings("rawtypes")
    private okhttp3.Call downloadInstrumentUpdateValidateBeforeCall(String instrumentUpdatesId, String format, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'instrumentUpdatesId' is set
        if (instrumentUpdatesId == null) {
            throw new ApiException("Missing the required parameter 'instrumentUpdatesId' when calling downloadInstrumentUpdate(Async)");
        }
    

        okhttp3.Call localVarCall = downloadInstrumentUpdateCall(instrumentUpdatesId, format, _callback);
        return localVarCall;

    }


    private ApiResponse<File> downloadInstrumentUpdateWithHttpInfo(String instrumentUpdatesId, String format) throws ApiException {
        okhttp3.Call localVarCall = downloadInstrumentUpdateValidateBeforeCall(instrumentUpdatesId, format, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call downloadInstrumentUpdateAsync(String instrumentUpdatesId, String format, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = downloadInstrumentUpdateValidateBeforeCall(instrumentUpdatesId, format, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdownloadInstrumentUpdateRequest {
        private final String instrumentUpdatesId;
        private String format;

        private APIdownloadInstrumentUpdateRequest(String instrumentUpdatesId) {
            this.instrumentUpdatesId = instrumentUpdatesId;
        }

        /**
        * Set format
        * @param format Specify the format you&#39;d like to download the response in (JSON is the only other format available for download). (optional)
        * @return APIdownloadInstrumentUpdateRequest
        */
        public APIdownloadInstrumentUpdateRequest format(String format) {
            this.format = format;
            return this;
        }

        /**
        * Build call for downloadInstrumentUpdate
        * @param _callback ApiCallback API callback
        * @return Call to execute
        * @throws ApiException If fail to serialize the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> The updated &#x60;Payment Instruments&#x60; will be returned in the following comma seperated format:  payment\\_instrument\\_original, | payment\\_instrument_new, |result --------------------------- | ---------------------- | ----- PIlkNdfZibF8a7Prd2teGB1 | PI3aQGaCM5nDMjqyTXcbUJzR| CARD\\_EXPIRATION_UPDATED PIJPXW0HZ9lpO1nb6sog5DiX  | PIdBHpy7BBSxd2z81VdKpVbT | CARD\\_NOT\\_FOUND PI0ovZAS9yfEtgDrZnMaiLvi   | PIhXS0jXNTmklyVk91EsohuZ | CONTACT\\_CARDHOLDER PInOrrKY3G1U33hGYTQJ8cIY |  | CLOSED\\_ACCOUNT PIlkAOt5kTVhuuxxbmOi9qn |  | INVALID\\_CARD PIiRLbbG4i5daypWNzIrq2xD   |  | NO\\_CHANGE\\_FOUND PIy5llZGt6VxlDqbcTgATqeH     |    | UNKNOWN </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return downloadInstrumentUpdateCall(instrumentUpdatesId, format, _callback);
        }

        /**
        * Execute downloadInstrumentUpdate request
            * @return File
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> The updated &#x60;Payment Instruments&#x60; will be returned in the following comma seperated format:  payment\\_instrument\\_original, | payment\\_instrument_new, |result --------------------------- | ---------------------- | ----- PIlkNdfZibF8a7Prd2teGB1 | PI3aQGaCM5nDMjqyTXcbUJzR| CARD\\_EXPIRATION_UPDATED PIJPXW0HZ9lpO1nb6sog5DiX  | PIdBHpy7BBSxd2z81VdKpVbT | CARD\\_NOT\\_FOUND PI0ovZAS9yfEtgDrZnMaiLvi   | PIhXS0jXNTmklyVk91EsohuZ | CONTACT\\_CARDHOLDER PInOrrKY3G1U33hGYTQJ8cIY |  | CLOSED\\_ACCOUNT PIlkAOt5kTVhuuxxbmOi9qn |  | INVALID\\_CARD PIiRLbbG4i5daypWNzIrq2xD   |  | NO\\_CHANGE\\_FOUND PIy5llZGt6VxlDqbcTgATqeH     |    | UNKNOWN </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public File execute() throws ApiException {
            ApiResponse<File> localVarResp = downloadInstrumentUpdateWithHttpInfo(instrumentUpdatesId, format);
            return localVarResp.getData();
        }

        /**
        * Execute downloadInstrumentUpdate request with HTTP info returned
        * @return ApiResponse&lt;File&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> The updated &#x60;Payment Instruments&#x60; will be returned in the following comma seperated format:  payment\\_instrument\\_original, | payment\\_instrument_new, |result --------------------------- | ---------------------- | ----- PIlkNdfZibF8a7Prd2teGB1 | PI3aQGaCM5nDMjqyTXcbUJzR| CARD\\_EXPIRATION_UPDATED PIJPXW0HZ9lpO1nb6sog5DiX  | PIdBHpy7BBSxd2z81VdKpVbT | CARD\\_NOT\\_FOUND PI0ovZAS9yfEtgDrZnMaiLvi   | PIhXS0jXNTmklyVk91EsohuZ | CONTACT\\_CARDHOLDER PInOrrKY3G1U33hGYTQJ8cIY |  | CLOSED\\_ACCOUNT PIlkAOt5kTVhuuxxbmOi9qn |  | INVALID\\_CARD PIiRLbbG4i5daypWNzIrq2xD   |  | NO\\_CHANGE\\_FOUND PIy5llZGt6VxlDqbcTgATqeH     |    | UNKNOWN </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public ApiResponse<File> executeWithHttpInfo() throws ApiException {
            return downloadInstrumentUpdateWithHttpInfo(instrumentUpdatesId, format);
        }

        /**
        * Execute downloadInstrumentUpdate request (asynchronously)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> The updated &#x60;Payment Instruments&#x60; will be returned in the following comma seperated format:  payment\\_instrument\\_original, | payment\\_instrument_new, |result --------------------------- | ---------------------- | ----- PIlkNdfZibF8a7Prd2teGB1 | PI3aQGaCM5nDMjqyTXcbUJzR| CARD\\_EXPIRATION_UPDATED PIJPXW0HZ9lpO1nb6sog5DiX  | PIdBHpy7BBSxd2z81VdKpVbT | CARD\\_NOT\\_FOUND PI0ovZAS9yfEtgDrZnMaiLvi   | PIhXS0jXNTmklyVk91EsohuZ | CONTACT\\_CARDHOLDER PInOrrKY3G1U33hGYTQJ8cIY |  | CLOSED\\_ACCOUNT PIlkAOt5kTVhuuxxbmOi9qn |  | INVALID\\_CARD PIiRLbbG4i5daypWNzIrq2xD   |  | NO\\_CHANGE\\_FOUND PIy5llZGt6VxlDqbcTgATqeH     |    | UNKNOWN </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
        public okhttp3.Call executeAsync(final ApiCallback<File> _callback) throws ApiException {
            return downloadInstrumentUpdateAsync(instrumentUpdatesId, format, _callback);
        }
    }

        /**
        * Download Instrument Updates
        * Fetch a previously created &#x60;instrument_updates&#x60; resource as a CSV.   To fetch the &#x60;instrument_updates&#x60; resource in JSON, add &#x60;?format&#x3D;json&#x60; to the request endpoint.
            * @param instrumentUpdatesId The ID of the &#x60;instrument_updates&#x60; resource. This ID was returned when initially creating the &#x60;instrument_updates&#x60; object. (required)
        * @return APIdownloadInstrumentUpdateRequest
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> The updated &#x60;Payment Instruments&#x60; will be returned in the following comma seperated format:  payment\\_instrument\\_original, | payment\\_instrument_new, |result --------------------------- | ---------------------- | ----- PIlkNdfZibF8a7Prd2teGB1 | PI3aQGaCM5nDMjqyTXcbUJzR| CARD\\_EXPIRATION_UPDATED PIJPXW0HZ9lpO1nb6sog5DiX  | PIdBHpy7BBSxd2z81VdKpVbT | CARD\\_NOT\\_FOUND PI0ovZAS9yfEtgDrZnMaiLvi   | PIhXS0jXNTmklyVk91EsohuZ | CONTACT\\_CARDHOLDER PInOrrKY3G1U33hGYTQJ8cIY |  | CLOSED\\_ACCOUNT PIlkAOt5kTVhuuxxbmOi9qn |  | INVALID\\_CARD PIiRLbbG4i5daypWNzIrq2xD   |  | NO\\_CHANGE\\_FOUND PIy5llZGt6VxlDqbcTgATqeH     |    | UNKNOWN </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public File download(String instrumentUpdatesId,  DownloadInstrumentUpdateQueryParams downloadInstrumentUpdateQueryParams) throws ApiException {

        APIdownloadInstrumentUpdateRequest request = new APIdownloadInstrumentUpdateRequest(instrumentUpdatesId);
        request.format(downloadInstrumentUpdateQueryParams.getFormat());
        return request.execute();
    }
    /**
    * Build call for getInstrumentUpdate
        * @param instrumentUpdatesId The ID of the &#x60;instrument_update&#x60;. (required)
    * @param _callback Callback for upload/download progress
    * @return Call to execute
    * @throws ApiException If fail to serialize the request body object
        * @http.response.details
        <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                <tr><td> 200 </td><td> Single instrument_update object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call getInstrumentUpdateCall(String instrumentUpdatesId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/instrument_updates/{instrument_updates_id}"
            .replaceAll("\\{" + "instrument_updates_id" + "\\}", localVarFinixClient.escapeString(instrumentUpdatesId.toString()));

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
    private okhttp3.Call getInstrumentUpdateValidateBeforeCall(String instrumentUpdatesId, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'instrumentUpdatesId' is set
        if (instrumentUpdatesId == null) {
            throw new ApiException("Missing the required parameter 'instrumentUpdatesId' when calling getInstrumentUpdate(Async)");
        }
    

        okhttp3.Call localVarCall = getInstrumentUpdateCall(instrumentUpdatesId, _callback);
        return localVarCall;

    }

            /**
            * Fetch an Instrument Update
            * Fetch a specific &#x60;instrument_update&#x60; from an &#x60;instrument_updates&#x60; resource. For more information, see the guide on using our [Account Updater](/guides/payments/account-updater).
                * @param instrumentUpdatesId The ID of the &#x60;instrument_update&#x60;. (required)
                * @return InstrumentUpdate
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Single instrument_update object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public InstrumentUpdate get(String instrumentUpdatesId) throws ApiException {
        ApiResponse<InstrumentUpdate> localVarResp = getInstrumentUpdateWithHttpInfo(instrumentUpdatesId);
        return localVarResp.getData();
    }


    /**
        * Fetch an Instrument Update
        * Fetch a specific &#x60;instrument_update&#x60; from an &#x60;instrument_updates&#x60; resource. For more information, see the guide on using our [Account Updater](/guides/payments/account-updater).
            * @param instrumentUpdatesId The ID of the &#x60;instrument_update&#x60;. (required)
        * @return ApiResponse&lt;InstrumentUpdate&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single instrument_update object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<InstrumentUpdate> getInstrumentUpdateWithHttpInfo(String instrumentUpdatesId) throws ApiException {
        okhttp3.Call localVarCall = getInstrumentUpdateValidateBeforeCall(instrumentUpdatesId, null);
        Type localVarReturnType = new TypeToken<InstrumentUpdate>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Fetch an Instrument Update (asynchronously)
        * Fetch a specific &#x60;instrument_update&#x60; from an &#x60;instrument_updates&#x60; resource. For more information, see the guide on using our [Account Updater](/guides/payments/account-updater).
            * @param instrumentUpdatesId The ID of the &#x60;instrument_update&#x60;. (required)
        * @param _callback The callback to be executed when the API call finishes
        * @return The request call
        * @throws ApiException If fail to process the API call, e.g. serializing the request body object
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Single instrument_update object </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call getInstrumentUpdateAsync(String instrumentUpdatesId, final ApiCallback<InstrumentUpdate> _callback) throws ApiException {

        okhttp3.Call localVarCall = getInstrumentUpdateValidateBeforeCall(instrumentUpdatesId, _callback);
        Type localVarReturnType = new TypeToken<InstrumentUpdate>(){}.getType();
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
