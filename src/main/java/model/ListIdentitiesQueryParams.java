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
 * ListIdentitiesQueryParams
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListIdentitiesQueryParams {
  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private String sort;

  public static final String SERIALIZED_NAME_AFTER_CURSOR = "after_cursor";
  @SerializedName(SERIALIZED_NAME_AFTER_CURSOR)
  private String afterCursor;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Long limit;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT_GTE = "created_at.gte";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_GTE)
  private String createdAtGte;

  public static final String SERIALIZED_NAME_CREATED_AT_LTE = "created_at.lte";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_LTE)
  private String createdAtLte;

  public static final String SERIALIZED_NAME_DEFAULT_STATEMENT_DESCRIPTOR = "default_statement_descriptor";
  @SerializedName(SERIALIZED_NAME_DEFAULT_STATEMENT_DESCRIPTOR)
  private String defaultStatementDescriptor;

  public static final String SERIALIZED_NAME_BUSINESS_NAME = "business_name";
  @SerializedName(SERIALIZED_NAME_BUSINESS_NAME)
  private String businessName;

  public static final String SERIALIZED_NAME_BUSINESS_TYPE = "business_type";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TYPE)
  private String businessType;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_BEFORE_CURSOR = "before_cursor";
  @SerializedName(SERIALIZED_NAME_BEFORE_CURSOR)
  private String beforeCursor;

  public ListIdentitiesQueryParams() { 
  }

  public ListIdentitiesQueryParams sort(String sort) {
    
    this.sort = sort;
    return this;
  }

   /**
   * Specify key to be used for sorting the collection.
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify key to be used for sorting the collection.")

  public String getSort() {
    return sort;
  }


  public void setSort(String sort) {
    this.sort = sort;
  }


  public ListIdentitiesQueryParams afterCursor(String afterCursor) {
    
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


  public ListIdentitiesQueryParams limit(Long limit) {
    
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


  public ListIdentitiesQueryParams id(String id) {
    
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


  public ListIdentitiesQueryParams createdAtGte(String createdAtGte) {
    
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


  public ListIdentitiesQueryParams createdAtLte(String createdAtLte) {
    
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


  public ListIdentitiesQueryParams defaultStatementDescriptor(String defaultStatementDescriptor) {
    
    this.defaultStatementDescriptor = defaultStatementDescriptor;
    return this;
  }

   /**
   * Filter by the &#x60;default_statement_descriptor&#x60;.
   * @return defaultStatementDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the `default_statement_descriptor`.")

  public String getDefaultStatementDescriptor() {
    return defaultStatementDescriptor;
  }


  public void setDefaultStatementDescriptor(String defaultStatementDescriptor) {
    this.defaultStatementDescriptor = defaultStatementDescriptor;
  }


  public ListIdentitiesQueryParams businessName(String businessName) {
    
    this.businessName = businessName;
    return this;
  }

   /**
   * Filter by the full business name. Partial business names are not supported.
   * @return businessName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the full business name. Partial business names are not supported.")

  public String getBusinessName() {
    return businessName;
  }


  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public ListIdentitiesQueryParams businessType(String businessType) {
    
    this.businessType = businessType;
    return this;
  }

   /**
   * Filter by the business type. Partial business types are not supported.
   * @return businessType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the business type. Partial business types are not supported.")

  public String getBusinessType() {
    return businessType;
  }


  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }


  public ListIdentitiesQueryParams email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Filter by the email address or email domain. Partial emails are not supported.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the email address or email domain. Partial emails are not supported.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public ListIdentitiesQueryParams firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Filter by the first name of the person associated to the &#x60;Identity&#x60;.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the first name of the person associated to the `Identity`.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public ListIdentitiesQueryParams lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Filter by the last name of the person associated to the &#x60;Identity&#x60;.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the last name of the person associated to the `Identity`.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public ListIdentitiesQueryParams title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Filter by the title if available.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the title if available.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ListIdentitiesQueryParams beforeCursor(String beforeCursor) {
    
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
    ListIdentitiesQueryParams listIdentitiesQueryParams = (ListIdentitiesQueryParams) o;
    return Objects.equals(this.sort, listIdentitiesQueryParams.sort) &&
        Objects.equals(this.afterCursor, listIdentitiesQueryParams.afterCursor) &&
        Objects.equals(this.limit, listIdentitiesQueryParams.limit) &&
        Objects.equals(this.id, listIdentitiesQueryParams.id) &&
        Objects.equals(this.createdAtGte, listIdentitiesQueryParams.createdAtGte) &&
        Objects.equals(this.createdAtLte, listIdentitiesQueryParams.createdAtLte) &&
        Objects.equals(this.defaultStatementDescriptor, listIdentitiesQueryParams.defaultStatementDescriptor) &&
        Objects.equals(this.businessName, listIdentitiesQueryParams.businessName) &&
        Objects.equals(this.businessType, listIdentitiesQueryParams.businessType) &&
        Objects.equals(this.email, listIdentitiesQueryParams.email) &&
        Objects.equals(this.firstName, listIdentitiesQueryParams.firstName) &&
        Objects.equals(this.lastName, listIdentitiesQueryParams.lastName) &&
        Objects.equals(this.title, listIdentitiesQueryParams.title) &&
        Objects.equals(this.beforeCursor, listIdentitiesQueryParams.beforeCursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sort, afterCursor, limit, id, createdAtGte, createdAtLte, defaultStatementDescriptor, businessName, businessType, email, firstName, lastName, title, beforeCursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListIdentitiesQueryParams {\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    afterCursor: ").append(toIndentedString(afterCursor)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
    sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
    sb.append("    defaultStatementDescriptor: ").append(toIndentedString(defaultStatementDescriptor)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("sort");
    openapiFields.add("after_cursor");
    openapiFields.add("limit");
    openapiFields.add("id");
    openapiFields.add("created_at.gte");
    openapiFields.add("created_at.lte");
    openapiFields.add("default_statement_descriptor");
    openapiFields.add("business_name");
    openapiFields.add("business_type");
    openapiFields.add("email");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("title");
    openapiFields.add("before_cursor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListIdentitiesQueryParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListIdentitiesQueryParams.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListIdentitiesQueryParams is not found in the empty JSON string", ListIdentitiesQueryParams.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListIdentitiesQueryParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListIdentitiesQueryParams` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonNull()  && !jsonObj.get("sort").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort").toString()));
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
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()  && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
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
      if (jsonObj.get("default_statement_descriptor") != null && !jsonObj.get("default_statement_descriptor").isJsonNull()  && !jsonObj.get("default_statement_descriptor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_statement_descriptor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_statement_descriptor").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("business_name") != null && !jsonObj.get("business_name").isJsonNull()  && !jsonObj.get("business_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("business_type") != null && !jsonObj.get("business_type").isJsonNull()  && !jsonObj.get("business_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_type").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()  && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()  && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()  && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()  && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
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
       if (!ListIdentitiesQueryParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListIdentitiesQueryParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListIdentitiesQueryParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListIdentitiesQueryParams.class));

       return (TypeAdapter<T>) new TypeAdapter<ListIdentitiesQueryParams>() {
           @Override
           public void write(JsonWriter out, ListIdentitiesQueryParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListIdentitiesQueryParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListIdentitiesQueryParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListIdentitiesQueryParams
  * @throws IOException if the JSON string is invalid with respect to ListIdentitiesQueryParams
  */
  public static ListIdentitiesQueryParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListIdentitiesQueryParams.class);
  }

 /**
  * Convert an instance of ListIdentitiesQueryParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

