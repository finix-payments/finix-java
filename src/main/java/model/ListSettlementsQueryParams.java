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
 * ListSettlementsQueryParams
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListSettlementsQueryParams {
  public static final String SERIALIZED_NAME_CREATED_AT_GTE = "created_at.gte";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_GTE)
  private String createdAtGte;

  public static final String SERIALIZED_NAME_CREATED_AT_LTE = "created_at.lte";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_LTE)
  private String createdAtLte;

  public static final String SERIALIZED_NAME_UPDATED_AT_GTE = "updated_at.gte";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT_GTE)
  private String updatedAtGte;

  public static final String SERIALIZED_NAME_UPDATED_AT_LTE = "updated_at.lte";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT_LTE)
  private String updatedAtLte;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Long limit;

  public static final String SERIALIZED_NAME_AFTER_CURSOR = "after_cursor";
  @SerializedName(SERIALIZED_NAME_AFTER_CURSOR)
  private String afterCursor;

  public static final String SERIALIZED_NAME_BEFORE_CURSOR = "before_cursor";
  @SerializedName(SERIALIZED_NAME_BEFORE_CURSOR)
  private String beforeCursor;

  public ListSettlementsQueryParams() { 
  }

  public ListSettlementsQueryParams createdAtGte(String createdAtGte) {
    
    this.createdAtGte = createdAtGte;
    return this;
  }

   /**
   * Filter where &#x60;created_at&#x60; is after the given date.
   * @return createdAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter where `created_at` is after the given date.")

  public String getCreatedAtGte() {
    return createdAtGte;
  }


  public void setCreatedAtGte(String createdAtGte) {
    this.createdAtGte = createdAtGte;
  }


  public ListSettlementsQueryParams createdAtLte(String createdAtLte) {
    
    this.createdAtLte = createdAtLte;
    return this;
  }

   /**
   * Filter where &#x60;created_at&#x60; is before the given date.
   * @return createdAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter where `created_at` is before the given date.")

  public String getCreatedAtLte() {
    return createdAtLte;
  }


  public void setCreatedAtLte(String createdAtLte) {
    this.createdAtLte = createdAtLte;
  }


  public ListSettlementsQueryParams updatedAtGte(String updatedAtGte) {
    
    this.updatedAtGte = updatedAtGte;
    return this;
  }

   /**
   * Filter where &#x60;updated_at&#x60; is after the given date.
   * @return updatedAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter where `updated_at` is after the given date.")

  public String getUpdatedAtGte() {
    return updatedAtGte;
  }


  public void setUpdatedAtGte(String updatedAtGte) {
    this.updatedAtGte = updatedAtGte;
  }


  public ListSettlementsQueryParams updatedAtLte(String updatedAtLte) {
    
    this.updatedAtLte = updatedAtLte;
    return this;
  }

   /**
   * Filter where &#x60;updated_at&#x60; is before the given date.
   * @return updatedAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter where `updated_at` is before the given date.")

  public String getUpdatedAtLte() {
    return updatedAtLte;
  }


  public void setUpdatedAtLte(String updatedAtLte) {
    this.updatedAtLte = updatedAtLte;
  }


  public ListSettlementsQueryParams id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Filter by &#x60;id&#x60;.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by `id`.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ListSettlementsQueryParams limit(Long limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The numbers of items to return.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The numbers of items to return.")

  public Long getLimit() {
    return limit;
  }


  public void setLimit(Long limit) {
    this.limit = limit;
  }


  public ListSettlementsQueryParams afterCursor(String afterCursor) {
    
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


  public ListSettlementsQueryParams beforeCursor(String beforeCursor) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSettlementsQueryParams listSettlementsQueryParams = (ListSettlementsQueryParams) o;
    return Objects.equals(this.createdAtGte, listSettlementsQueryParams.createdAtGte) &&
        Objects.equals(this.createdAtLte, listSettlementsQueryParams.createdAtLte) &&
        Objects.equals(this.updatedAtGte, listSettlementsQueryParams.updatedAtGte) &&
        Objects.equals(this.updatedAtLte, listSettlementsQueryParams.updatedAtLte) &&
        Objects.equals(this.id, listSettlementsQueryParams.id) &&
        Objects.equals(this.limit, listSettlementsQueryParams.limit) &&
        Objects.equals(this.afterCursor, listSettlementsQueryParams.afterCursor) &&
        Objects.equals(this.beforeCursor, listSettlementsQueryParams.beforeCursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, id, limit, afterCursor, beforeCursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSettlementsQueryParams {\n");
    sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
    sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
    sb.append("    updatedAtGte: ").append(toIndentedString(updatedAtGte)).append("\n");
    sb.append("    updatedAtLte: ").append(toIndentedString(updatedAtLte)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    afterCursor: ").append(toIndentedString(afterCursor)).append("\n");
    sb.append("    beforeCursor: ").append(toIndentedString(beforeCursor)).append("\n");
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
    openapiFields.add("created_at.gte");
    openapiFields.add("created_at.lte");
    openapiFields.add("updated_at.gte");
    openapiFields.add("updated_at.lte");
    openapiFields.add("id");
    openapiFields.add("limit");
    openapiFields.add("after_cursor");
    openapiFields.add("before_cursor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListSettlementsQueryParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListSettlementsQueryParams.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListSettlementsQueryParams is not found in the empty JSON string", ListSettlementsQueryParams.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListSettlementsQueryParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListSettlementsQueryParams` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("created_at.gte") != null && !jsonObj.get("created_at.gte").isJsonNull()  && !jsonObj.get("created_at.gte").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at.gte` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at.gte").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("created_at.lte") != null && !jsonObj.get("created_at.lte").isJsonNull()  && !jsonObj.get("created_at.lte").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at.lte` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at.lte").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("updated_at.gte") != null && !jsonObj.get("updated_at.gte").isJsonNull()  && !jsonObj.get("updated_at.gte").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at.gte` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at.gte").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("updated_at.lte") != null && !jsonObj.get("updated_at.lte").isJsonNull()  && !jsonObj.get("updated_at.lte").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at.lte` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at.lte").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()  && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
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
       if (!ListSettlementsQueryParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListSettlementsQueryParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListSettlementsQueryParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListSettlementsQueryParams.class));

       return (TypeAdapter<T>) new TypeAdapter<ListSettlementsQueryParams>() {
           @Override
           public void write(JsonWriter out, ListSettlementsQueryParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListSettlementsQueryParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListSettlementsQueryParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListSettlementsQueryParams
  * @throws IOException if the JSON string is invalid with respect to ListSettlementsQueryParams
  */
  public static ListSettlementsQueryParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListSettlementsQueryParams.class);
  }

 /**
  * Convert an instance of ListSettlementsQueryParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

