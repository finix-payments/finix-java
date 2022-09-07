/*
 * Finix API
 */


package invoker;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.HashMap;


import javax.ws.rs.core.GenericType;

/**
 * <p>ApiException class.</p>
 */
@SuppressWarnings("serial")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiException extends Exception {
    private int code = 0;
    private Map<String, List<String>> responseHeaders = null;
    private String responseBody = null;
    private ArrayList<HashMap <String, String>>  body = null;
 
    /**
     * <p>Constructor for ApiException.</p>
     */
    public ApiException() {}

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param throwable a {@link java.lang.Throwable} object
     */
    public ApiException(Throwable throwable) {
        super(throwable);
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param message the error message
     */
    public ApiException(String message) {
        super(message);
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param message the error message
     * @param throwable a {@link java.lang.Throwable} object
     * @param code HTTP status code
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     * @param responseBody the response body
     */
    public ApiException(String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders, String responseBody) {
        super(message, throwable);
        this.code = code;
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
        setBody();
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param message the error message
     * @param code HTTP status code
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     * @param responseBody the response body
     */
    public ApiException(String message, int code, Map<String, List<String>> responseHeaders, String responseBody) {
        this(message, (Throwable) null, code, responseHeaders, responseBody);
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param message the error message
     * @param throwable a {@link java.lang.Throwable} object
     * @param code HTTP status code
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     */
    public ApiException(String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders) {
        this(message, throwable, code, responseHeaders, null);
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param code HTTP status code
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     * @param responseBody the response body
     */
    public ApiException(int code, Map<String, List<String>> responseHeaders, String responseBody) {
        this((String) null, (Throwable) null, code, responseHeaders, responseBody);
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param code HTTP status code
     * @param message a {@link java.lang.String} object
     */
    public ApiException(int code, String message) {
        super(message);
        this.code = code;
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param code HTTP status code
     * @param message the error message
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     * @param responseBody the response body
     */
    public ApiException(int code, String message, Map<String, List<String>> responseHeaders, String responseBody) {
        this(code, message);
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    /**
     * Get the HTTP status code.
     *
     * @return HTTP status code
     */
    public int getCode() {
        return code;
    }

    /**
     * Get the HTTP response headers.
     *
     * @return A map of list of string
     */
    public Map<String, List<String>> getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * Get the HTTP response body.
     *
     * @return Response body in the form of string
     */
    public String getResponseBody() {
        return responseBody;
    }

    /**
     * Get the exception message including HTTP response data.
     *
     * @return The exception message
     */
    public String getMessage() {
        return String.format("Message: %s%nHTTP response code: %s%nHTTP response body: %s%nHTTP response headers: %s",
                super.getMessage(), this.getCode(), this.getResponseBody(), this.getResponseHeaders().toString());
    }


    /**
    * Get an arraylist of the error body.
    *
    * @return an arraylist of error body in the form of hashmap
    */
    public ArrayList<HashMap<String, String>> getBody() {
        return body;
    }

    /**
    * Set the body field of ApiException class.
    *
    * @return void
    */
    private void setBody() {
        int startIndex = this.responseBody.indexOf("_embedded") + 13;
        ObjectMapper objectMapper = new ObjectMapper();
        if (startIndex != 12) {
            int endIndex = this.responseBody.lastIndexOf("}") - 1;
            String errorsRawString = this.responseBody.substring(startIndex, endIndex);
            Map<String, ArrayList<HashMap<String, String>>> responseMap;
            try {
                responseMap = objectMapper.readValue(errorsRawString, HashMap.class);
                if (responseMap.containsKey("errors")) {
                    this.body = responseMap.get("errors");
                }
            } catch(JsonProcessingException e) {
                this.body = new ArrayList<HashMap<String, String>>();
                HashMap<String, String> tempMap = new HashMap<>();
                if (this.responseBody.lastIndexOf("]") != -1) {
                    tempMap.put("body", this.responseBody.substring(this.responseBody.indexOf("errors"),
                        this.responseBody.lastIndexOf("]")));
                }
                else {
                    tempMap.put("body", this.responseBody.substring(this.responseBody.indexOf("errors"),
                    this.responseBody.lastIndexOf("}") - 1));
                }
                this.body.add(tempMap);
                return;
            }
        }
    }
}
