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
import model.IdentityEntityForm;
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
 * CreateApplicationRequest
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateApplicationRequest {
  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private IdentityEntityForm entity;

  public static final String SERIALIZED_NAME_MAX_TRANSACTION_AMOUNT = "max_transaction_amount";
  @SerializedName(SERIALIZED_NAME_MAX_TRANSACTION_AMOUNT)
  private Long maxTransactionAmount;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public CreateApplicationRequest() { 
  }

  public CreateApplicationRequest entity(IdentityEntityForm entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityEntityForm getEntity() {
    return entity;
  }


  public void setEntity(IdentityEntityForm entity) {
    this.entity = entity;
  }


  public CreateApplicationRequest maxTransactionAmount(Long maxTransactionAmount) {
    
    this.maxTransactionAmount = maxTransactionAmount;
    return this;
  }

   /**
   * Maximum amount that can be processed for a single transaction in cents (max 12 characters).
   * @return maxTransactionAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum amount that can be processed for a single transaction in cents (max 12 characters).")

  public Long getMaxTransactionAmount() {
    return maxTransactionAmount;
  }


  public void setMaxTransactionAmount(Long maxTransactionAmount) {
    this.maxTransactionAmount = maxTransactionAmount;
  }


  public CreateApplicationRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Merchant&#39;s full legal business name (If **INDIVIDUAL_SOLE_PROPRIETORSHIP**, enter first name, Full legal last name and middle initial; max 120 characters).
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant's full legal business name (If **INDIVIDUAL_SOLE_PROPRIETORSHIP**, enter first name, Full legal last name and middle initial; max 120 characters).")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateApplicationRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateApplicationRequest putTagsItem(String key, String tagsItem) {
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


  public CreateApplicationRequest user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * ID of the &#x60;User&#x60; resource.
   * @return user
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USxxxxxxxxxxxxxxxxxx", required = true, value = "ID of the `User` resource.")

  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateApplicationRequest createApplicationRequest = (CreateApplicationRequest) o;
    return Objects.equals(this.entity, createApplicationRequest.entity) &&
        Objects.equals(this.maxTransactionAmount, createApplicationRequest.maxTransactionAmount) &&
        Objects.equals(this.name, createApplicationRequest.name) &&
        Objects.equals(this.tags, createApplicationRequest.tags) &&
        Objects.equals(this.user, createApplicationRequest.user);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, maxTransactionAmount, name, tags, user);
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
    sb.append("class CreateApplicationRequest {\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    maxTransactionAmount: ").append(toIndentedString(maxTransactionAmount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("entity");
    openapiFields.add("max_transaction_amount");
    openapiFields.add("name");
    openapiFields.add("tags");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("user");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateApplicationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateApplicationRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateApplicationRequest is not found in the empty JSON string", CreateApplicationRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateApplicationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateApplicationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */

      /**
      * EDITED
      * Commented to ByPass required properties/fields are present in the JSON string
      */

      // check to make sure all required properties/fields are present in the JSON string
      /*for (String requiredField : CreateApplicationRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }*/
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `entity`
     // if (jsonObj.getAsJsonObject("entity") != null) {
       //IdentityEntityForm.validateJsonObject(jsonObj.getAsJsonObject("entity"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()  && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()  && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateApplicationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateApplicationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateApplicationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateApplicationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateApplicationRequest>() {
           @Override
           public void write(JsonWriter out, CreateApplicationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateApplicationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateApplicationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateApplicationRequest
  * @throws IOException if the JSON string is invalid with respect to CreateApplicationRequest
  */
  public static CreateApplicationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateApplicationRequest.class);
  }

 /**
  * Convert an instance of CreateApplicationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

