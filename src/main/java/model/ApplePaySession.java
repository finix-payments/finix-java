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
import java.time.OffsetDateTime;
import model.DisputeEvidenceLinks;

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
 * ApplePaySession
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApplePaySession {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_SESSION_DETAILS = "session_details";
  @SerializedName(SERIALIZED_NAME_SESSION_DETAILS)
  private String sessionDetails;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private DisputeEvidenceLinks links;

  public ApplePaySession() { 
  }

  public ApplePaySession id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the &#x60;apple_pay_session&#x60; resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the `apple_pay_session` resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ApplePaySession createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when the object was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of when the object was created.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ApplePaySession updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp of when the object was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of when the object was last updated.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ApplePaySession sessionDetails(String sessionDetails) {
    
    this.sessionDetails = sessionDetails;
    return this;
  }

   /**
   * Details about the &#x60;apple_pay_session&#x60; that was created.
   * @return sessionDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details about the `apple_pay_session` that was created.")

  public String getSessionDetails() {
    return sessionDetails;
  }


  public void setSessionDetails(String sessionDetails) {
    this.sessionDetails = sessionDetails;
  }


  public ApplePaySession links(DisputeEvidenceLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DisputeEvidenceLinks getLinks() {
    return links;
  }


  public void setLinks(DisputeEvidenceLinks links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplePaySession applePaySession = (ApplePaySession) o;
    return Objects.equals(this.id, applePaySession.id) &&
        Objects.equals(this.createdAt, applePaySession.createdAt) &&
        Objects.equals(this.updatedAt, applePaySession.updatedAt) &&
        Objects.equals(this.sessionDetails, applePaySession.sessionDetails) &&
        Objects.equals(this.links, applePaySession.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, sessionDetails, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplePaySession {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    sessionDetails: ").append(toIndentedString(sessionDetails)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("session_details");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplePaySession
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ApplePaySession.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplePaySession is not found in the empty JSON string", ApplePaySession.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplePaySession.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplePaySession` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
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
      if (jsonObj.get("session_details") != null && !jsonObj.get("session_details").isJsonNull()  && !jsonObj.get("session_details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `session_details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("session_details").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `_links`
     // if (jsonObj.getAsJsonObject("_links") != null) {
       //DisputeEvidenceLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplePaySession.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplePaySession' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplePaySession> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplePaySession.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplePaySession>() {
           @Override
           public void write(JsonWriter out, ApplePaySession value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplePaySession read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplePaySession given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplePaySession
  * @throws IOException if the JSON string is invalid with respect to ApplePaySession
  */
  public static ApplePaySession fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplePaySession.class);
  }

 /**
  * Convert an instance of ApplePaySession to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

