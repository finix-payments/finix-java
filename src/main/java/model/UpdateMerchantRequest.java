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
 * UpdateMerchantRequest
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-22T18:15:18.047423-05:00[America/Chicago]")
public class UpdateMerchantRequest {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_LEVEL_TWO_LEVEL_THREE_DATA_ENABLED = "level_two_level_three_data_enabled";
  @SerializedName(SERIALIZED_NAME_LEVEL_TWO_LEVEL_THREE_DATA_ENABLED)
  private Boolean levelTwoLevelThreeDataEnabled;

  public UpdateMerchantRequest() { 
  }

  public UpdateMerchantRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public UpdateMerchantRequest putTagsItem(String key, String tagsItem) {
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


  public UpdateMerchantRequest levelTwoLevelThreeDataEnabled(Boolean levelTwoLevelThreeDataEnabled) {
    
    this.levelTwoLevelThreeDataEnabled = levelTwoLevelThreeDataEnabled;
    return this;
  }

   /**
   * Set to True to enable Merchant for Level 2 and Level 3 processing. Default value is false.
   * @return levelTwoLevelThreeDataEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to True to enable Merchant for Level 2 and Level 3 processing. Default value is false.")

  public Boolean getLevelTwoLevelThreeDataEnabled() {
    return levelTwoLevelThreeDataEnabled;
  }


  public void setLevelTwoLevelThreeDataEnabled(Boolean levelTwoLevelThreeDataEnabled) {
    this.levelTwoLevelThreeDataEnabled = levelTwoLevelThreeDataEnabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMerchantRequest updateMerchantRequest = (UpdateMerchantRequest) o;
    return Objects.equals(this.tags, updateMerchantRequest.tags) &&
        Objects.equals(this.levelTwoLevelThreeDataEnabled, updateMerchantRequest.levelTwoLevelThreeDataEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, levelTwoLevelThreeDataEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMerchantRequest {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    levelTwoLevelThreeDataEnabled: ").append(toIndentedString(levelTwoLevelThreeDataEnabled)).append("\n");
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
    openapiFields.add("level_two_level_three_data_enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateMerchantRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateMerchantRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateMerchantRequest is not found in the empty JSON string", UpdateMerchantRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateMerchantRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateMerchantRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateMerchantRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateMerchantRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateMerchantRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateMerchantRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateMerchantRequest>() {
           @Override
           public void write(JsonWriter out, UpdateMerchantRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateMerchantRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateMerchantRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateMerchantRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateMerchantRequest
  */
  public static UpdateMerchantRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateMerchantRequest.class);
  }

 /**
  * Convert an instance of UpdateMerchantRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

