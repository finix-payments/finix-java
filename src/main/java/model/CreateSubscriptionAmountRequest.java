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
import model.CreateSubscriptionAmountRequestFeeAmountData;

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
 * 
 */
@ApiModel(description = "")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateSubscriptionAmountRequest {
  public static final String SERIALIZED_NAME_AMOUNT_TYPE = "amount_type";
  @SerializedName(SERIALIZED_NAME_AMOUNT_TYPE)
  private String amountType;

  public static final String SERIALIZED_NAME_FEE_AMOUNT_DATA = "fee_amount_data";
  @SerializedName(SERIALIZED_NAME_FEE_AMOUNT_DATA)
  private CreateSubscriptionAmountRequestFeeAmountData feeAmountData;

  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public CreateSubscriptionAmountRequest() { 
  }

  public CreateSubscriptionAmountRequest amountType(String amountType) {
    
    this.amountType = amountType;
    return this;
  }

   /**
   * &#x60;Subscription Amount&#x60; type. For subscriptions, the type is **FEE**.
   * @return amountType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "`Subscription Amount` type. For subscriptions, the type is **FEE**.")

  public String getAmountType() {
    return amountType;
  }


  public void setAmountType(String amountType) {
    this.amountType = amountType;
  }


  public CreateSubscriptionAmountRequest feeAmountData(CreateSubscriptionAmountRequestFeeAmountData feeAmountData) {
    
    this.feeAmountData = feeAmountData;
    return this;
  }

   /**
   * Get feeAmountData
   * @return feeAmountData
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CreateSubscriptionAmountRequestFeeAmountData getFeeAmountData() {
    return feeAmountData;
  }


  public void setFeeAmountData(CreateSubscriptionAmountRequestFeeAmountData feeAmountData) {
    this.feeAmountData = feeAmountData;
  }


  public CreateSubscriptionAmountRequest nickname(String nickname) {
    
    this.nickname = nickname;
    return this;
  }

   /**
   * Human readable name.
   * @return nickname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "super important thing", value = "Human readable name.")

  public String getNickname() {
    return nickname;
  }


  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public CreateSubscriptionAmountRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateSubscriptionAmountRequest putTagsItem(String key, String tagsItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSubscriptionAmountRequest createSubscriptionAmountRequest = (CreateSubscriptionAmountRequest) o;
    return Objects.equals(this.amountType, createSubscriptionAmountRequest.amountType) &&
        Objects.equals(this.feeAmountData, createSubscriptionAmountRequest.feeAmountData) &&
        Objects.equals(this.nickname, createSubscriptionAmountRequest.nickname) &&
        Objects.equals(this.tags, createSubscriptionAmountRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountType, feeAmountData, nickname, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubscriptionAmountRequest {\n");
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    feeAmountData: ").append(toIndentedString(feeAmountData)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("amount_type");
    openapiFields.add("fee_amount_data");
    openapiFields.add("nickname");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount_type");
    openapiRequiredFields.add("fee_amount_data");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateSubscriptionAmountRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateSubscriptionAmountRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSubscriptionAmountRequest is not found in the empty JSON string", CreateSubscriptionAmountRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateSubscriptionAmountRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateSubscriptionAmountRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */

      /**
      * EDITED
      * Commented to ByPass required properties/fields are present in the JSON string
      */

      // check to make sure all required properties/fields are present in the JSON string
      /*for (String requiredField : CreateSubscriptionAmountRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }*/
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("amount_type") != null && !jsonObj.get("amount_type").isJsonNull()  && !jsonObj.get("amount_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount_type").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `fee_amount_data`
     // if (jsonObj.getAsJsonObject("fee_amount_data") != null) {
       //CreateSubscriptionAmountRequestFeeAmountData.validateJsonObject(jsonObj.getAsJsonObject("fee_amount_data"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("nickname") != null && !jsonObj.get("nickname").isJsonNull()  && !jsonObj.get("nickname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nickname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nickname").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSubscriptionAmountRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSubscriptionAmountRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSubscriptionAmountRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptionAmountRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSubscriptionAmountRequest>() {
           @Override
           public void write(JsonWriter out, CreateSubscriptionAmountRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSubscriptionAmountRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSubscriptionAmountRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSubscriptionAmountRequest
  * @throws IOException if the JSON string is invalid with respect to CreateSubscriptionAmountRequest
  */
  public static CreateSubscriptionAmountRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSubscriptionAmountRequest.class);
  }

 /**
  * Convert an instance of CreateSubscriptionAmountRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

