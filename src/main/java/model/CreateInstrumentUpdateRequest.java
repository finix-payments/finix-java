/*
 * Finix API
 */


package model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import invoker.JSON;

/**
 * CreateInstrumentUpdateRequest
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateInstrumentUpdateRequest {
  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private File _file;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private String request;

  public CreateInstrumentUpdateRequest() { 
  }

  public CreateInstrumentUpdateRequest _file(File _file) {
    
    this._file = _file;
    return this;
  }

   /**
   * The binary contents of the file.
   * @return _file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The binary contents of the file.")

  public File getFile() {
    return _file;
  }


  public void setFile(File _file) {
    this._file = _file;
  }


  public CreateInstrumentUpdateRequest request(String request) {
    
    this.request = request;
    return this;
  }

   /**
   * A JSON string of your request. The JSON object needs to contain the following two fields: - &#x60;merchant&#x60;: ID of the &#x60;Merchant&#x60; object that you want to associate with the Account Updater batch for your own accounting purposes. You can only associate one &#x60;Merchant&#x60; to each. - &#x60;idemopotency_id&#x60;: A randomly generated value that will be associated with this &#x60;instrument_update&#x60; resource.
   * @return request
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"merchant\":\"MUucec6fHeaWo3VHYoSkUySM\",  \"idempotency_id\":\"123xyz\" }", value = "A JSON string of your request. The JSON object needs to contain the following two fields: - `merchant`: ID of the `Merchant` object that you want to associate with the Account Updater batch for your own accounting purposes. You can only associate one `Merchant` to each. - `idemopotency_id`: A randomly generated value that will be associated with this `instrument_update` resource.")

  public String getRequest() {
    return request;
  }


  public void setRequest(String request) {
    this.request = request;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstrumentUpdateRequest createInstrumentUpdateRequest = (CreateInstrumentUpdateRequest) o;
    return Objects.equals(this._file, createInstrumentUpdateRequest._file) &&
        Objects.equals(this.request, createInstrumentUpdateRequest.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_file, request);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstrumentUpdateRequest {\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("file");
    openapiFields.add("request");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateInstrumentUpdateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateInstrumentUpdateRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateInstrumentUpdateRequest is not found in the empty JSON string", CreateInstrumentUpdateRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateInstrumentUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateInstrumentUpdateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("request") != null && !jsonObj.get("request").isJsonNull()  && !jsonObj.get("request").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateInstrumentUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateInstrumentUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateInstrumentUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateInstrumentUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateInstrumentUpdateRequest>() {
           @Override
           public void write(JsonWriter out, CreateInstrumentUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateInstrumentUpdateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateInstrumentUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateInstrumentUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to CreateInstrumentUpdateRequest
  */
  public static CreateInstrumentUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateInstrumentUpdateRequest.class);
  }

 /**
  * Convert an instance of CreateInstrumentUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

