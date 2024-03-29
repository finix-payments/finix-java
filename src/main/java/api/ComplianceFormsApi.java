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

import model.ComplianceForm;
import model.Error401Unauthorized;
import model.Error403ForbiddenList;
import model.Error404NotFoundList;
import model.Error406NotAcceptable;
import model.Error422InvalidFieldList;
import model.UpdateComplianceFormRequest;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ComplianceFormsApi {
    private FinixClient localVarFinixClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ComplianceFormsApi() {
        this(Configuration.getDefaultFinixClient());
    }

    public ComplianceFormsApi(FinixClient finixClient) {
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
    * Build call for getComplianceForms
        * @param complianceFormsId ID of the &#x60;compliance_form&#x60;. (required)
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
    public okhttp3.Call getComplianceFormsCall(String complianceFormsId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/compliance_forms/{compliance_forms_id}"
            .replaceAll("\\{" + "compliance_forms_id" + "\\}", localVarFinixClient.escapeString(complianceFormsId.toString()));

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

        localVarHeaderParams.put("Finix-Version", "2022-02-01");
        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return localVarFinixClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

        @SuppressWarnings("rawtypes")
    private okhttp3.Call getComplianceFormsValidateBeforeCall(String complianceFormsId, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'complianceFormsId' is set
        if (complianceFormsId == null) {
            throw new ApiException("Missing the required parameter 'complianceFormsId' when calling getComplianceForms(Async)");
        }
    

        okhttp3.Call localVarCall = getComplianceFormsCall(complianceFormsId, _callback);
        return localVarCall;

    }

            /**
            * View Compliance Forms
            * A webhook notifies you when Finix creates a &#x60;compliance_form&#x60;.  Use the ID in the webhook to fetch the &#x60;compliance_form&#x60; resource from the &#x60;/compliance_forms/:COMPLIANCE_FORM_ID:&#x60; endpoint.
                * @param complianceFormsId ID of the &#x60;compliance_form&#x60;. (required)
                * @return ComplianceForm
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


    public ComplianceForm list(String complianceFormsId) throws ApiException {
        ApiResponse<ComplianceForm> localVarResp = getComplianceFormsWithHttpInfo(complianceFormsId);
        return localVarResp.getData();
    }


    /**
        * View Compliance Forms
        * A webhook notifies you when Finix creates a &#x60;compliance_form&#x60;.  Use the ID in the webhook to fetch the &#x60;compliance_form&#x60; resource from the &#x60;/compliance_forms/:COMPLIANCE_FORM_ID:&#x60; endpoint.
            * @param complianceFormsId ID of the &#x60;compliance_form&#x60;. (required)
        * @return ApiResponse&lt;ComplianceForm&gt;
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
    public ApiResponse<ComplianceForm> getComplianceFormsWithHttpInfo(String complianceFormsId) throws ApiException {
        okhttp3.Call localVarCall = getComplianceFormsValidateBeforeCall(complianceFormsId, null);
        Type localVarReturnType = new TypeToken<ComplianceForm>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * View Compliance Forms (asynchronously)
        * A webhook notifies you when Finix creates a &#x60;compliance_form&#x60;.  Use the ID in the webhook to fetch the &#x60;compliance_form&#x60; resource from the &#x60;/compliance_forms/:COMPLIANCE_FORM_ID:&#x60; endpoint.
            * @param complianceFormsId ID of the &#x60;compliance_form&#x60;. (required)
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
    public okhttp3.Call getComplianceFormsAsync(String complianceFormsId, final ApiCallback<ComplianceForm> _callback) throws ApiException {

        okhttp3.Call localVarCall = getComplianceFormsValidateBeforeCall(complianceFormsId, _callback);
        Type localVarReturnType = new TypeToken<ComplianceForm>(){}.getType();
        localVarFinixClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Build call for updateComplianceForms
        * @param complianceFormsId ID of the &#x60;compliance_form&#x60;. (required)
        * @param updateComplianceFormRequest  (optional)
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
                <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
        </table>
    */
    public okhttp3.Call updateComplianceFormsCall(String complianceFormsId, UpdateComplianceFormRequest updateComplianceFormRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateComplianceFormRequest;

    // create path and map variables
        String localVarPath = "/compliance_forms/{compliance_forms_id}"
            .replaceAll("\\{" + "compliance_forms_id" + "\\}", localVarFinixClient.escapeString(complianceFormsId.toString()));

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

        localVarHeaderParams.put("Finix-Version", "2022-02-01");
        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return localVarFinixClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

        @SuppressWarnings("rawtypes")
    private okhttp3.Call updateComplianceFormsValidateBeforeCall(String complianceFormsId, UpdateComplianceFormRequest updateComplianceFormRequest, final ApiCallback _callback) throws ApiException {
    
            // verify the required parameter 'complianceFormsId' is set
        if (complianceFormsId == null) {
            throw new ApiException("Missing the required parameter 'complianceFormsId' when calling updateComplianceForms(Async)");
        }
    

        okhttp3.Call localVarCall = updateComplianceFormsCall(complianceFormsId, updateComplianceFormRequest, _callback);
        return localVarCall;

    }

            /**
            * Complete Compliance Forms
            * As part of onboarding your users, you&#39;ll need to build a UI experience that allows users to complete the PCI &#x60;compliance_form&#x60; and download the form as a PDF if requested.  To complete PCI compliance forms:  1. Get the &#x60;compliance_form&#x60; generated for the merchant using the &#x60;ID&#x60; from the webhook and present the form to your users when requested. 2. Show your users the [required text](/guides/security-and-compliance/pci-dss-compliance/managing-pci-compliance/#obtaining-compliance-consent) to obtain consent. 3. Submit a PUT API request with the necessary [attestation](/guides/security-and-compliance/pci-dss-compliance/managing-pci-compliance/#completing-the-questionnaire) information.  For more information, see [Managing Compliance Forms](/guides/security-and-compliance/pci-dss-compliance/managing-pci-compliance/#completing-compliance-forms).
                * @param complianceFormsId ID of the &#x60;compliance_form&#x60;. (required)
                * @param updateComplianceFormRequest  (optional)
                * @return ComplianceForm
            * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
                * @http.response.details
                <table summary="Response Details" border="1">
                    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                        <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                        <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                </table>
            */


    public ComplianceForm update(String complianceFormsId, UpdateComplianceFormRequest updateComplianceFormRequest) throws ApiException {
        ApiResponse<ComplianceForm> localVarResp = updateComplianceFormsWithHttpInfo(complianceFormsId, updateComplianceFormRequest);
        return localVarResp.getData();
    }


    /**
        * Complete Compliance Forms
        * As part of onboarding your users, you&#39;ll need to build a UI experience that allows users to complete the PCI &#x60;compliance_form&#x60; and download the form as a PDF if requested.  To complete PCI compliance forms:  1. Get the &#x60;compliance_form&#x60; generated for the merchant using the &#x60;ID&#x60; from the webhook and present the form to your users when requested. 2. Show your users the [required text](/guides/security-and-compliance/pci-dss-compliance/managing-pci-compliance/#obtaining-compliance-consent) to obtain consent. 3. Submit a PUT API request with the necessary [attestation](/guides/security-and-compliance/pci-dss-compliance/managing-pci-compliance/#completing-the-questionnaire) information.  For more information, see [Managing Compliance Forms](/guides/security-and-compliance/pci-dss-compliance/managing-pci-compliance/#completing-compliance-forms).
            * @param complianceFormsId ID of the &#x60;compliance_form&#x60;. (required)
            * @param updateComplianceFormRequest  (optional)
        * @return ApiResponse&lt;ComplianceForm&gt;
        * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
            * @http.response.details
            <table summary="Response Details" border="1">
                <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
                    <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
                    <tr><td> 401 </td><td> Authentication information is missing or invalid </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 403 </td><td> Forbidden </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 404 </td><td> Object does not exist </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 406 </td><td> Not Acceptable </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
                    <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public ApiResponse<ComplianceForm> updateComplianceFormsWithHttpInfo(String complianceFormsId, UpdateComplianceFormRequest updateComplianceFormRequest) throws ApiException {
        okhttp3.Call localVarCall = updateComplianceFormsValidateBeforeCall(complianceFormsId, updateComplianceFormRequest, null);
        Type localVarReturnType = new TypeToken<ComplianceForm>(){}.getType();
        return localVarFinixClient.execute(localVarCall, localVarReturnType);
    }

    /**
        * Complete Compliance Forms (asynchronously)
        * As part of onboarding your users, you&#39;ll need to build a UI experience that allows users to complete the PCI &#x60;compliance_form&#x60; and download the form as a PDF if requested.  To complete PCI compliance forms:  1. Get the &#x60;compliance_form&#x60; generated for the merchant using the &#x60;ID&#x60; from the webhook and present the form to your users when requested. 2. Show your users the [required text](/guides/security-and-compliance/pci-dss-compliance/managing-pci-compliance/#obtaining-compliance-consent) to obtain consent. 3. Submit a PUT API request with the necessary [attestation](/guides/security-and-compliance/pci-dss-compliance/managing-pci-compliance/#completing-the-questionnaire) information.  For more information, see [Managing Compliance Forms](/guides/security-and-compliance/pci-dss-compliance/managing-pci-compliance/#completing-compliance-forms).
            * @param complianceFormsId ID of the &#x60;compliance_form&#x60;. (required)
            * @param updateComplianceFormRequest  (optional)
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
                    <tr><td> 422 </td><td> Invalid field </td><td>  * finix-apiuser-role -  <br>  * date -  <br>  * x-request-id -  <br>  </td></tr>
            </table>
        */
    public okhttp3.Call updateComplianceFormsAsync(String complianceFormsId, UpdateComplianceFormRequest updateComplianceFormRequest, final ApiCallback<ComplianceForm> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateComplianceFormsValidateBeforeCall(complianceFormsId, updateComplianceFormRequest, _callback);
        Type localVarReturnType = new TypeToken<ComplianceForm>(){}.getType();
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
