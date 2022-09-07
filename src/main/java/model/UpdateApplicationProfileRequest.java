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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * UpdateApplicationProfileRequest
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateApplicationProfileRequest {
  public static final String SERIALIZED_NAME_FEE_PROFILE = "fee_profile";
  @SerializedName(SERIALIZED_NAME_FEE_PROFILE)
  private String feeProfile;

  public static final String SERIALIZED_NAME_RISK_PROFILE = "risk_profile";
  @SerializedName(SERIALIZED_NAME_RISK_PROFILE)
  private String riskProfile;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public UpdateApplicationProfileRequest() { 
  }

  public UpdateApplicationProfileRequest feeProfile(String feeProfile) {
    
    this.feeProfile = feeProfile;
    return this;
  }

   /**
   * The ID of the resource.
   * @return feeProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getFeeProfile() {
    return feeProfile;
  }


  public void setFeeProfile(String feeProfile) {
    this.feeProfile = feeProfile;
  }


  public UpdateApplicationProfileRequest riskProfile(String riskProfile) {
    
    this.riskProfile = riskProfile;
    return this;
  }

   /**
   * The ID of the resource.
   * @return riskProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getRiskProfile() {
    return riskProfile;
  }


  public void setRiskProfile(String riskProfile) {
    this.riskProfile = riskProfile;
  }


  public UpdateApplicationProfileRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public UpdateApplicationProfileRequest putTagsItem(String key, String tagsItem) {
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
    UpdateApplicationProfileRequest updateApplicationProfileRequest = (UpdateApplicationProfileRequest) o;
    return Objects.equals(this.feeProfile, updateApplicationProfileRequest.feeProfile) &&
        Objects.equals(this.riskProfile, updateApplicationProfileRequest.riskProfile) &&
        Objects.equals(this.tags, updateApplicationProfileRequest.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeProfile, riskProfile, tags);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateApplicationProfileRequest {\n");
    sb.append("    feeProfile: ").append(toIndentedString(feeProfile)).append("\n");
    sb.append("    riskProfile: ").append(toIndentedString(riskProfile)).append("\n");
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
    openapiFields.add("fee_profile");
    openapiFields.add("risk_profile");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateApplicationProfileRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateApplicationProfileRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateApplicationProfileRequest is not found in the empty JSON string", UpdateApplicationProfileRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateApplicationProfileRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateApplicationProfileRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("fee_profile") != null && !jsonObj.get("fee_profile").isJsonNull()  && !jsonObj.get("fee_profile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee_profile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee_profile").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("risk_profile") != null && !jsonObj.get("risk_profile").isJsonNull()  && !jsonObj.get("risk_profile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `risk_profile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("risk_profile").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateApplicationProfileRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateApplicationProfileRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateApplicationProfileRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateApplicationProfileRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateApplicationProfileRequest>() {
           @Override
           public void write(JsonWriter out, UpdateApplicationProfileRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateApplicationProfileRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateApplicationProfileRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateApplicationProfileRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateApplicationProfileRequest
  */
  public static UpdateApplicationProfileRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateApplicationProfileRequest.class);
  }

 /**
  * Convert an instance of UpdateApplicationProfileRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

