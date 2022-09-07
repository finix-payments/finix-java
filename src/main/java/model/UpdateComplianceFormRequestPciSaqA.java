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
 * Details used to fille out the PCI Self-Assessment Questionnaire.
 */
@ApiModel(description = "Details used to fille out the PCI Self-Assessment Questionnaire.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateComplianceFormRequestPciSaqA {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SIGNED_AT = "signed_at";
  @SerializedName(SERIALIZED_NAME_SIGNED_AT)
  private String signedAt;

  public static final String SERIALIZED_NAME_USER_AGENT = "user_agent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private String userAgent;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public UpdateComplianceFormRequestPciSaqA() { 
  }

  public UpdateComplianceFormRequestPciSaqA name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the person completing (aka attesting to) the &#x60;compliance_form&#x60;.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the person completing (aka attesting to) the `compliance_form`.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateComplianceFormRequestPciSaqA signedAt(String signedAt) {
    
    this.signedAt = signedAt;
    return this;
  }

   /**
   * Timestamp of the person attesting to this &#x60;compliance_form&#x60;.
   * @return signedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of the person attesting to this `compliance_form`.")

  public String getSignedAt() {
    return signedAt;
  }


  public void setSignedAt(String signedAt) {
    this.signedAt = signedAt;
  }


  public UpdateComplianceFormRequestPciSaqA userAgent(String userAgent) {
    
    this.userAgent = userAgent;
    return this;
  }

   /**
   * User agent of the person attesting to this &#x60;compliance_form&#x60;.
   * @return userAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User agent of the person attesting to this `compliance_form`.")

  public String getUserAgent() {
    return userAgent;
  }


  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  public UpdateComplianceFormRequestPciSaqA ipAddress(String ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address of the person attesting to this &#x60;compliance_form&#x60;.
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IP address of the person attesting to this `compliance_form`.")

  public String getIpAddress() {
    return ipAddress;
  }


  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public UpdateComplianceFormRequestPciSaqA title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title or role of the person completing (aka attesting to)                 the &#x60;compliance_form&#x60;.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title or role of the person completing (aka attesting to)                 the `compliance_form`.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateComplianceFormRequestPciSaqA updateComplianceFormRequestPciSaqA = (UpdateComplianceFormRequestPciSaqA) o;
    return Objects.equals(this.name, updateComplianceFormRequestPciSaqA.name) &&
        Objects.equals(this.signedAt, updateComplianceFormRequestPciSaqA.signedAt) &&
        Objects.equals(this.userAgent, updateComplianceFormRequestPciSaqA.userAgent) &&
        Objects.equals(this.ipAddress, updateComplianceFormRequestPciSaqA.ipAddress) &&
        Objects.equals(this.title, updateComplianceFormRequestPciSaqA.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, signedAt, userAgent, ipAddress, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateComplianceFormRequestPciSaqA {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    signedAt: ").append(toIndentedString(signedAt)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("signed_at");
    openapiFields.add("user_agent");
    openapiFields.add("ip_address");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateComplianceFormRequestPciSaqA
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateComplianceFormRequestPciSaqA.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateComplianceFormRequestPciSaqA is not found in the empty JSON string", UpdateComplianceFormRequestPciSaqA.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateComplianceFormRequestPciSaqA.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateComplianceFormRequestPciSaqA` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
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
      if (jsonObj.get("signed_at") != null && !jsonObj.get("signed_at").isJsonNull()  && !jsonObj.get("signed_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signed_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signed_at").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("user_agent") != null && !jsonObj.get("user_agent").isJsonNull()  && !jsonObj.get("user_agent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_agent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_agent").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("ip_address") != null && !jsonObj.get("ip_address").isJsonNull()  && !jsonObj.get("ip_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip_address").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()  && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateComplianceFormRequestPciSaqA.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateComplianceFormRequestPciSaqA' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateComplianceFormRequestPciSaqA> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateComplianceFormRequestPciSaqA.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateComplianceFormRequestPciSaqA>() {
           @Override
           public void write(JsonWriter out, UpdateComplianceFormRequestPciSaqA value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateComplianceFormRequestPciSaqA read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateComplianceFormRequestPciSaqA given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateComplianceFormRequestPciSaqA
  * @throws IOException if the JSON string is invalid with respect to UpdateComplianceFormRequestPciSaqA
  */
  public static UpdateComplianceFormRequestPciSaqA fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateComplianceFormRequestPciSaqA.class);
  }

 /**
  * Convert an instance of UpdateComplianceFormRequestPciSaqA to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

