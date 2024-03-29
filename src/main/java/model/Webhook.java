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
import model.ProcessorLinks;
import model.WebhookAuthentication;

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
 * Webhook
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Webhook {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private String application;

  public static final String SERIALIZED_NAME_AUTHENTICATION = "authentication";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION)
  private WebhookAuthentication authentication;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private ProcessorLinks links;

  public Webhook() { 
  }

  public Webhook id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the &#x60;Webhook&#x60; resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WHxxxxxxxxxxxxxxxxxx", value = "The ID of the `Webhook` resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Webhook createdAt(OffsetDateTime createdAt) {
    
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


  public Webhook updatedAt(OffsetDateTime updatedAt) {
    
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


  public Webhook application(String application) {
    
    this.application = application;
    return this;
  }

   /**
   * The ID of the &#x60;Application&#x60; resource the &#x60;Webhook&#x60; was created under.
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the `Application` resource the `Webhook` was created under.")

  public String getApplication() {
    return application;
  }


  public void setApplication(String application) {
    this.application = application;
  }


  public Webhook authentication(WebhookAuthentication authentication) {
    
    this.authentication = authentication;
    return this;
  }

   /**
   * Get authentication
   * @return authentication
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebhookAuthentication getAuthentication() {
    return authentication;
  }


  public void setAuthentication(WebhookAuthentication authentication) {
    this.authentication = authentication;
  }


  public Webhook enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Details if the &#x60;Webhook&#x60; is enabled:&lt;ul&gt;&lt;li&gt;&lt;strong&gt;true&lt;/strong&gt;: Events are being sent to the &#x60;url&#x60;.&lt;li&gt;&lt;strong&gt;false&lt;/strong&gt;: Events are not being sent.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if the `Webhook` is enabled:<ul><li><strong>true</strong>: Events are being sent to the `url`.<li><strong>false</strong>: Events are not being sent.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public Webhook url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The HTTP or HTTPS URL where callbacks (i.e. events) will be sent via POST request (max 120 characters).
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The HTTP or HTTPS URL where callbacks (i.e. events) will be sent via POST request (max 120 characters).")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public Webhook links(ProcessorLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProcessorLinks getLinks() {
    return links;
  }


  public void setLinks(ProcessorLinks links) {
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
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.id, webhook.id) &&
        Objects.equals(this.createdAt, webhook.createdAt) &&
        Objects.equals(this.updatedAt, webhook.updatedAt) &&
        Objects.equals(this.application, webhook.application) &&
        Objects.equals(this.authentication, webhook.authentication) &&
        Objects.equals(this.enabled, webhook.enabled) &&
        Objects.equals(this.url, webhook.url) &&
        Objects.equals(this.links, webhook.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, application, authentication, enabled, url, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("application");
    openapiFields.add("authentication");
    openapiFields.add("enabled");
    openapiFields.add("url");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Webhook
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Webhook.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Webhook is not found in the empty JSON string", Webhook.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Webhook.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Webhook` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("application") != null && !jsonObj.get("application").isJsonNull()  && !jsonObj.get("application").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `authentication`
     // if (jsonObj.getAsJsonObject("authentication") != null) {
       //WebhookAuthentication.validateJsonObject(jsonObj.getAsJsonObject("authentication"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()  && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `_links`
     // if (jsonObj.getAsJsonObject("_links") != null) {
       //ProcessorLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Webhook.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Webhook' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Webhook> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Webhook.class));

       return (TypeAdapter<T>) new TypeAdapter<Webhook>() {
           @Override
           public void write(JsonWriter out, Webhook value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Webhook read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Webhook given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Webhook
  * @throws IOException if the JSON string is invalid with respect to Webhook
  */
  public static Webhook fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Webhook.class);
  }

 /**
  * Convert an instance of Webhook to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

