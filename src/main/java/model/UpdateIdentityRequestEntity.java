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
import model.UpdateIdentityRequestEntityPersonalAddress;

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
 * Identifying information about the buyer.
 */
@ApiModel(description = "Identifying information about the buyer.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateIdentityRequestEntity {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_PERSONAL_ADDRESS = "personal_address";
  @SerializedName(SERIALIZED_NAME_PERSONAL_ADDRESS)
  private UpdateIdentityRequestEntityPersonalAddress personalAddress;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public UpdateIdentityRequestEntity() { 
  }

  public UpdateIdentityRequestEntity email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email address of the buyer (max 100 characters).
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address of the buyer (max 100 characters).")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UpdateIdentityRequestEntity firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The legal first name of the buyer (max 20 characters).
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The legal first name of the buyer (max 20 characters).")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public UpdateIdentityRequestEntity lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The legal last name of the buyer (max 20 characters).
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The legal last name of the buyer (max 20 characters).")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public UpdateIdentityRequestEntity personalAddress(UpdateIdentityRequestEntityPersonalAddress personalAddress) {
    
    this.personalAddress = personalAddress;
    return this;
  }

   /**
   * Get personalAddress
   * @return personalAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UpdateIdentityRequestEntityPersonalAddress getPersonalAddress() {
    return personalAddress;
  }


  public void setPersonalAddress(UpdateIdentityRequestEntityPersonalAddress personalAddress) {
    this.personalAddress = personalAddress;
  }


  public UpdateIdentityRequestEntity phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Phone number where the buyer can be reached.
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone number where the buyer can be reached.")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateIdentityRequestEntity updateIdentityRequestEntity = (UpdateIdentityRequestEntity) o;
    return Objects.equals(this.email, updateIdentityRequestEntity.email) &&
        Objects.equals(this.firstName, updateIdentityRequestEntity.firstName) &&
        Objects.equals(this.lastName, updateIdentityRequestEntity.lastName) &&
        Objects.equals(this.personalAddress, updateIdentityRequestEntity.personalAddress) &&
        Objects.equals(this.phone, updateIdentityRequestEntity.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, lastName, personalAddress, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateIdentityRequestEntity {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    personalAddress: ").append(toIndentedString(personalAddress)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("personal_address");
    openapiFields.add("phone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateIdentityRequestEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateIdentityRequestEntity.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateIdentityRequestEntity is not found in the empty JSON string", UpdateIdentityRequestEntity.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateIdentityRequestEntity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateIdentityRequestEntity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
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
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `personal_address`
     // if (jsonObj.getAsJsonObject("personal_address") != null) {
       //UpdateIdentityRequestEntityPersonalAddress.validateJsonObject(jsonObj.getAsJsonObject("personal_address"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()  && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateIdentityRequestEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateIdentityRequestEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateIdentityRequestEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateIdentityRequestEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateIdentityRequestEntity>() {
           @Override
           public void write(JsonWriter out, UpdateIdentityRequestEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateIdentityRequestEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateIdentityRequestEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateIdentityRequestEntity
  * @throws IOException if the JSON string is invalid with respect to UpdateIdentityRequestEntity
  */
  public static UpdateIdentityRequestEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateIdentityRequestEntity.class);
  }

 /**
  * Convert an instance of UpdateIdentityRequestEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

