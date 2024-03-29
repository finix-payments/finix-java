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
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.AdditionalPurchaseData;

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
 * UpdateAuthorizationRequest
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateAuthorizationRequest {
  public static final String SERIALIZED_NAME_ADDITIONAL_PURCHASE_DATA = "additional_purchase_data";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_PURCHASE_DATA)
  private AdditionalPurchaseData additionalPurchaseData;

  public static final String SERIALIZED_NAME_CAPTURE_AMOUNT = "capture_amount";
  @SerializedName(SERIALIZED_NAME_CAPTURE_AMOUNT)
  private Long captureAmount;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private Long fee;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_VOID_ME = "void_me";
  @SerializedName(SERIALIZED_NAME_VOID_ME)
  private Boolean voidMe;

  public UpdateAuthorizationRequest() { 
  }

  public UpdateAuthorizationRequest additionalPurchaseData(AdditionalPurchaseData additionalPurchaseData) {
    
    this.additionalPurchaseData = additionalPurchaseData;
    return this;
  }

   /**
   * Get additionalPurchaseData
   * @return additionalPurchaseData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdditionalPurchaseData getAdditionalPurchaseData() {
    return additionalPurchaseData;
  }


  public void setAdditionalPurchaseData(AdditionalPurchaseData additionalPurchaseData) {
    this.additionalPurchaseData = additionalPurchaseData;
  }


  public UpdateAuthorizationRequest captureAmount(Long captureAmount) {
    
    this.captureAmount = captureAmount;
    return this;
  }

   /**
   * The amount of the  &#x60;Authorization&#x60;  you would like to capture in cents. Must be less than or equal to the &#x60;amount&#x60; of the &#x60;Authorization&#x60;.
   * @return captureAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of the  `Authorization`  you would like to capture in cents. Must be less than or equal to the `amount` of the `Authorization`.")

  public Long getCaptureAmount() {
    return captureAmount;
  }


  public void setCaptureAmount(Long captureAmount) {
    this.captureAmount = captureAmount;
  }


  public UpdateAuthorizationRequest fee(Long fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * The amount of the &#x60;Authorization&#x60; you&#39;d like to collect as your fee in cents. Defaults to zero (must be less than or equal to the &#x60;amount&#x60;).
   * @return fee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of the `Authorization` you'd like to collect as your fee in cents. Defaults to zero (must be less than or equal to the `amount`).")

  public Long getFee() {
    return fee;
  }


  public void setFee(Long fee) {
    this.fee = fee;
  }


  public UpdateAuthorizationRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public UpdateAuthorizationRequest putTagsItem(String key, String tagsItem) {
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


  public UpdateAuthorizationRequest voidMe(Boolean voidMe) {
    
    this.voidMe = voidMe;
    return this;
  }

   /**
   * Set to **True** to void the &#x60;Authorization&#x60;.
   * @return voidMe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to **True** to void the `Authorization`.")

  public Boolean getVoidMe() {
    return voidMe;
  }


  public void setVoidMe(Boolean voidMe) {
    this.voidMe = voidMe;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAuthorizationRequest updateAuthorizationRequest = (UpdateAuthorizationRequest) o;
    return Objects.equals(this.additionalPurchaseData, updateAuthorizationRequest.additionalPurchaseData) &&
        Objects.equals(this.captureAmount, updateAuthorizationRequest.captureAmount) &&
        Objects.equals(this.fee, updateAuthorizationRequest.fee) &&
        Objects.equals(this.tags, updateAuthorizationRequest.tags) &&
        Objects.equals(this.voidMe, updateAuthorizationRequest.voidMe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalPurchaseData, captureAmount, fee, tags, voidMe);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAuthorizationRequest {\n");
    sb.append("    additionalPurchaseData: ").append(toIndentedString(additionalPurchaseData)).append("\n");
    sb.append("    captureAmount: ").append(toIndentedString(captureAmount)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    voidMe: ").append(toIndentedString(voidMe)).append("\n");
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
    openapiFields.add("additional_purchase_data");
    openapiFields.add("capture_amount");
    openapiFields.add("fee");
    openapiFields.add("tags");
    openapiFields.add("void_me");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateAuthorizationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateAuthorizationRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateAuthorizationRequest is not found in the empty JSON string", UpdateAuthorizationRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateAuthorizationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateAuthorizationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `additional_purchase_data`
     // if (jsonObj.getAsJsonObject("additional_purchase_data") != null) {
       //AdditionalPurchaseData.validateJsonObject(jsonObj.getAsJsonObject("additional_purchase_data"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateAuthorizationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateAuthorizationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateAuthorizationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateAuthorizationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateAuthorizationRequest>() {
           @Override
           public void write(JsonWriter out, UpdateAuthorizationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateAuthorizationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateAuthorizationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateAuthorizationRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateAuthorizationRequest
  */
  public static UpdateAuthorizationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateAuthorizationRequest.class);
  }

 /**
  * Convert an instance of UpdateAuthorizationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

