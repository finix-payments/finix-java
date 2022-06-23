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
 * InputDetails
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-23T13:37:23.846763-07:00[America/Los_Angeles]")
public class InputDetails {
  public static final String SERIALIZED_NAME_INPUT_TEXT = "input_text";
  @SerializedName(SERIALIZED_NAME_INPUT_TEXT)
  private String inputText;

  public static final String SERIALIZED_NAME_SELECTION = "selection";
  @SerializedName(SERIALIZED_NAME_SELECTION)
  private Long selection;

  public static final String SERIALIZED_NAME_SIGNATURE_DATA = "signature_data";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_DATA)
  private String signatureData;

  public InputDetails() { 
  }

  public InputDetails inputText(String inputText) {
    
    this.inputText = inputText;
    return this;
  }

   /**
   * Get inputText
   * @return inputText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInputText() {
    return inputText;
  }


  public void setInputText(String inputText) {
    this.inputText = inputText;
  }


  public InputDetails selection(Long selection) {
    
    this.selection = selection;
    return this;
  }

   /**
   * Get selection
   * @return selection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSelection() {
    return selection;
  }


  public void setSelection(Long selection) {
    this.selection = selection;
  }


  public InputDetails signatureData(String signatureData) {
    
    this.signatureData = signatureData;
    return this;
  }

   /**
   * Get signatureData
   * @return signatureData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSignatureData() {
    return signatureData;
  }


  public void setSignatureData(String signatureData) {
    this.signatureData = signatureData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputDetails inputDetails = (InputDetails) o;
    return Objects.equals(this.inputText, inputDetails.inputText) &&
        Objects.equals(this.selection, inputDetails.selection) &&
        Objects.equals(this.signatureData, inputDetails.signatureData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputText, selection, signatureData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputDetails {\n");
    sb.append("    inputText: ").append(toIndentedString(inputText)).append("\n");
    sb.append("    selection: ").append(toIndentedString(selection)).append("\n");
    sb.append("    signatureData: ").append(toIndentedString(signatureData)).append("\n");
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
    openapiFields.add("input_text");
    openapiFields.add("selection");
    openapiFields.add("signature_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InputDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InputDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InputDetails is not found in the empty JSON string", InputDetails.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InputDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InputDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("input_text") != null && !jsonObj.get("input_text").isJsonNull()  && !jsonObj.get("input_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `input_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("input_text").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("signature_data") != null && !jsonObj.get("signature_data").isJsonNull()  && !jsonObj.get("signature_data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature_data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature_data").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InputDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InputDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InputDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InputDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<InputDetails>() {
           @Override
           public void write(JsonWriter out, InputDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InputDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InputDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InputDetails
  * @throws IOException if the JSON string is invalid with respect to InputDetails
  */
  public static InputDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InputDetails.class);
  }

 /**
  * Convert an instance of InputDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

