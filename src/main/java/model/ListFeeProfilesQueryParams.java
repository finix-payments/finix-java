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
 * ListFeeProfilesQueryParams
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-21T11:54:05.123637-05:00[America/Chicago]")
public class ListFeeProfilesQueryParams {
  public static final String SERIALIZED_NAME_AFTER_CURSOR = "after_cursor";
  @SerializedName(SERIALIZED_NAME_AFTER_CURSOR)
  private String afterCursor;

  public static final String SERIALIZED_NAME_BEFORE_CURSOR = "before_cursor";
  @SerializedName(SERIALIZED_NAME_BEFORE_CURSOR)
  private String beforeCursor;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Long limit;

  public ListFeeProfilesQueryParams() { 
  }

  public ListFeeProfilesQueryParams afterCursor(String afterCursor) {
    
    this.afterCursor = afterCursor;
    return this;
  }

   /**
   * Return every resource created after the cursor value.
   * @return afterCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Return every resource created after the cursor value.")

  public String getAfterCursor() {
    return afterCursor;
  }


  public void setAfterCursor(String afterCursor) {
    this.afterCursor = afterCursor;
  }


  public ListFeeProfilesQueryParams beforeCursor(String beforeCursor) {
    
    this.beforeCursor = beforeCursor;
    return this;
  }

   /**
   * Return every resource created before the cursor value.
   * @return beforeCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Return every resource created before the cursor value.")

  public String getBeforeCursor() {
    return beforeCursor;
  }


  public void setBeforeCursor(String beforeCursor) {
    this.beforeCursor = beforeCursor;
  }


  public ListFeeProfilesQueryParams limit(Long limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The numbers of items to return
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The numbers of items to return")

  public Long getLimit() {
    return limit;
  }


  public void setLimit(Long limit) {
    this.limit = limit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListFeeProfilesQueryParams listFeeProfilesQueryParams = (ListFeeProfilesQueryParams) o;
    return Objects.equals(this.afterCursor, listFeeProfilesQueryParams.afterCursor) &&
        Objects.equals(this.beforeCursor, listFeeProfilesQueryParams.beforeCursor) &&
        Objects.equals(this.limit, listFeeProfilesQueryParams.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afterCursor, beforeCursor, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFeeProfilesQueryParams {\n");
    sb.append("    afterCursor: ").append(toIndentedString(afterCursor)).append("\n");
    sb.append("    beforeCursor: ").append(toIndentedString(beforeCursor)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
    openapiFields.add("after_cursor");
    openapiFields.add("before_cursor");
    openapiFields.add("limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListFeeProfilesQueryParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListFeeProfilesQueryParams.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListFeeProfilesQueryParams is not found in the empty JSON string", ListFeeProfilesQueryParams.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListFeeProfilesQueryParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListFeeProfilesQueryParams` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("after_cursor") != null && !jsonObj.get("after_cursor").isJsonNull()  && !jsonObj.get("after_cursor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `after_cursor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("after_cursor").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("before_cursor") != null && !jsonObj.get("before_cursor").isJsonNull()  && !jsonObj.get("before_cursor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `before_cursor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("before_cursor").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListFeeProfilesQueryParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListFeeProfilesQueryParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListFeeProfilesQueryParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListFeeProfilesQueryParams.class));

       return (TypeAdapter<T>) new TypeAdapter<ListFeeProfilesQueryParams>() {
           @Override
           public void write(JsonWriter out, ListFeeProfilesQueryParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListFeeProfilesQueryParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListFeeProfilesQueryParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListFeeProfilesQueryParams
  * @throws IOException if the JSON string is invalid with respect to ListFeeProfilesQueryParams
  */
  public static ListFeeProfilesQueryParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListFeeProfilesQueryParams.class);
  }

 /**
  * Convert an instance of ListFeeProfilesQueryParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

