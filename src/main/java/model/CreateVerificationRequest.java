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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * CreateVerificationRequest
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-05T17:36:16.020725-05:00[America/Chicago]")
public class CreateVerificationRequest {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_INSTRUMENT = "instrument";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT)
  private String instrument;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private String merchant;

  public static final String SERIALIZED_NAME_PROCESSOR = "processor";
  @SerializedName(SERIALIZED_NAME_PROCESSOR)
  private String processor;

  public CreateVerificationRequest() { 
  }

  public CreateVerificationRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateVerificationRequest putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Key value pair for annotating custom meta data (e.g. order numbers).
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Key value pair for annotating custom meta data (e.g. order numbers).")

  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  public CreateVerificationRequest identity(String identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * ID of the &#x60;Identity&#x60; resource associated with the &#x60;Merchant&#x60;.
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the `Identity` resource associated with the `Merchant`.")

  public String getIdentity() {
    return identity;
  }


  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public CreateVerificationRequest instrument(String instrument) {
    
    this.instrument = instrument;
    return this;
  }

   /**
   * The &#x60;Payment Instrument&#x60; that&#39;ll be used to settle the &#x60;Merchant&#39;s&#x60; funds.
   * @return instrument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `Payment Instrument` that'll be used to settle the `Merchant's` funds.")

  public String getInstrument() {
    return instrument;
  }


  public void setInstrument(String instrument) {
    this.instrument = instrument;
  }


  public CreateVerificationRequest merchant(String merchant) {
    
    this.merchant = merchant;
    return this;
  }

   /**
   * The ID of the &#x60;Merchant&#x60;.
   * @return merchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the `Merchant`.")

  public String getMerchant() {
    return merchant;
  }


  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }


  public CreateVerificationRequest processor(String processor) {
    
    this.processor = processor;
    return this;
  }

   /**
   * Name of the &#x60;Verification&#x60; processor.
   * @return processor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the `Verification` processor.")

  public String getProcessor() {
    return processor;
  }


  public void setProcessor(String processor) {
    this.processor = processor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVerificationRequest createVerificationRequest = (CreateVerificationRequest) o;
    return Objects.equals(this.tags, createVerificationRequest.tags) &&
        Objects.equals(this.identity, createVerificationRequest.identity) &&
        Objects.equals(this.instrument, createVerificationRequest.instrument) &&
        Objects.equals(this.merchant, createVerificationRequest.merchant) &&
        Objects.equals(this.processor, createVerificationRequest.processor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, identity, instrument, merchant, processor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVerificationRequest {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
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
    openapiFields.add("tags");
    openapiFields.add("identity");
    openapiFields.add("instrument");
    openapiFields.add("merchant");
    openapiFields.add("processor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateVerificationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateVerificationRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateVerificationRequest is not found in the empty JSON string", CreateVerificationRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateVerificationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateVerificationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("identity") != null && !jsonObj.get("identity").isJsonNull()  && !jsonObj.get("identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("instrument") != null && !jsonObj.get("instrument").isJsonNull()  && !jsonObj.get("instrument").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrument` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrument").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("merchant") != null && !jsonObj.get("merchant").isJsonNull()  && !jsonObj.get("merchant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("processor") != null && !jsonObj.get("processor").isJsonNull()  && !jsonObj.get("processor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processor").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateVerificationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateVerificationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateVerificationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateVerificationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateVerificationRequest>() {
           @Override
           public void write(JsonWriter out, CreateVerificationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateVerificationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateVerificationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateVerificationRequest
  * @throws IOException if the JSON string is invalid with respect to CreateVerificationRequest
  */
  public static CreateVerificationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateVerificationRequest.class);
  }

 /**
  * Convert an instance of CreateVerificationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

