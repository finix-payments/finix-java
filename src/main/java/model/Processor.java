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
import model.ProcessorApplicationConfig;
import model.ProcessorLinks;
import model.ProcessorSystemConfig;
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
 * 
 */
@ApiModel(description = "")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Processor {
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

  public static final String SERIALIZED_NAME_APPLICATION_CONFIG = "application_config";
  @SerializedName(SERIALIZED_NAME_APPLICATION_CONFIG)
  private ProcessorApplicationConfig applicationConfig;

  public static final String SERIALIZED_NAME_DEFAULT_MERCHANT_PROFILE = "default_merchant_profile";
  @SerializedName(SERIALIZED_NAME_DEFAULT_MERCHANT_PROFILE)
  private String defaultMerchantProfile;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_PROCESSOR = "processor";
  @SerializedName(SERIALIZED_NAME_PROCESSOR)
  private String processor;

  public static final String SERIALIZED_NAME_SYSTEM_CONFIG = "system_config";
  @SerializedName(SERIALIZED_NAME_SYSTEM_CONFIG)
  private ProcessorSystemConfig systemConfig;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private ProcessorLinks links;

  public Processor() { 
  }

  public Processor id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the &#x60;Processor&#x60; resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PRxxxxxxxxxxxxxxxxxx", value = "ID of the `Processor` resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Processor createdAt(OffsetDateTime createdAt) {
    
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


  public Processor updatedAt(OffsetDateTime updatedAt) {
    
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


  public Processor application(String application) {
    
    this.application = application;
    return this;
  }

   /**
   * The ID of the &#x60;Application&#x60; resource.
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the `Application` resource.")

  public String getApplication() {
    return application;
  }


  public void setApplication(String application) {
    this.application = application;
  }


  public Processor applicationConfig(ProcessorApplicationConfig applicationConfig) {
    
    this.applicationConfig = applicationConfig;
    return this;
  }

   /**
   * Get applicationConfig
   * @return applicationConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProcessorApplicationConfig getApplicationConfig() {
    return applicationConfig;
  }


  public void setApplicationConfig(ProcessorApplicationConfig applicationConfig) {
    this.applicationConfig = applicationConfig;
  }


  public Processor defaultMerchantProfile(String defaultMerchantProfile) {
    
    this.defaultMerchantProfile = defaultMerchantProfile;
    return this;
  }

   /**
   * The ID of the resource.
   * @return defaultMerchantProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getDefaultMerchantProfile() {
    return defaultMerchantProfile;
  }


  public void setDefaultMerchantProfile(String defaultMerchantProfile) {
    this.defaultMerchantProfile = defaultMerchantProfile;
  }


  public Processor enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Details if the &#x60;Processor&#x60; resource is enabled. Set to **false** to disable the &#x60;Processor&#x60;.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if the `Processor` resource is enabled. Set to **false** to disable the `Processor`.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public Processor processor(String processor) {
    
    this.processor = processor;
    return this;
  }

   /**
   * The name of the processor.
   * @return processor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the processor.")

  public String getProcessor() {
    return processor;
  }


  public void setProcessor(String processor) {
    this.processor = processor;
  }


  public Processor systemConfig(ProcessorSystemConfig systemConfig) {
    
    this.systemConfig = systemConfig;
    return this;
  }

   /**
   * Get systemConfig
   * @return systemConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProcessorSystemConfig getSystemConfig() {
    return systemConfig;
  }


  public void setSystemConfig(ProcessorSystemConfig systemConfig) {
    this.systemConfig = systemConfig;
  }


  public Processor links(ProcessorLinks links) {
    
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
    Processor processor = (Processor) o;
    return Objects.equals(this.id, processor.id) &&
        Objects.equals(this.createdAt, processor.createdAt) &&
        Objects.equals(this.updatedAt, processor.updatedAt) &&
        Objects.equals(this.application, processor.application) &&
        Objects.equals(this.applicationConfig, processor.applicationConfig) &&
        Objects.equals(this.defaultMerchantProfile, processor.defaultMerchantProfile) &&
        Objects.equals(this.enabled, processor.enabled) &&
        Objects.equals(this.processor, processor.processor) &&
        Objects.equals(this.systemConfig, processor.systemConfig) &&
        Objects.equals(this.links, processor.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, application, applicationConfig, defaultMerchantProfile, enabled, processor, systemConfig, links);
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
    sb.append("class Processor {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    applicationConfig: ").append(toIndentedString(applicationConfig)).append("\n");
    sb.append("    defaultMerchantProfile: ").append(toIndentedString(defaultMerchantProfile)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    systemConfig: ").append(toIndentedString(systemConfig)).append("\n");
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
    openapiFields.add("application_config");
    openapiFields.add("default_merchant_profile");
    openapiFields.add("enabled");
    openapiFields.add("processor");
    openapiFields.add("system_config");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Processor
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Processor.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Processor is not found in the empty JSON string", Processor.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Processor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Processor` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      // validate the optional field `application_config`
     // if (jsonObj.getAsJsonObject("application_config") != null) {
       //ProcessorApplicationConfig.validateJsonObject(jsonObj.getAsJsonObject("application_config"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("default_merchant_profile") != null && !jsonObj.get("default_merchant_profile").isJsonNull()  && !jsonObj.get("default_merchant_profile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_merchant_profile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_merchant_profile").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("processor") != null && !jsonObj.get("processor").isJsonNull()  && !jsonObj.get("processor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processor").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `system_config`
     // if (jsonObj.getAsJsonObject("system_config") != null) {
       //ProcessorSystemConfig.validateJsonObject(jsonObj.getAsJsonObject("system_config"));
     // }

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
       if (!Processor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Processor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Processor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Processor.class));

       return (TypeAdapter<T>) new TypeAdapter<Processor>() {
           @Override
           public void write(JsonWriter out, Processor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Processor read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Processor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Processor
  * @throws IOException if the JSON string is invalid with respect to Processor
  */
  public static Processor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Processor.class);
  }

 /**
  * Convert an instance of Processor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

