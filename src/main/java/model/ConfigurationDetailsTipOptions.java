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
 * ConfigurationDetailsTipOptions
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConfigurationDetailsTipOptions {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_OTHER_OPTIONS = "other_options";
  @SerializedName(SERIALIZED_NAME_OTHER_OPTIONS)
  private String otherOptions;

  public static final String SERIALIZED_NAME_TIP_SELECTIONS = "tip_selections";
  @SerializedName(SERIALIZED_NAME_TIP_SELECTIONS)
  private String tipSelections;

  public ConfigurationDetailsTipOptions() { 
  }

  public ConfigurationDetailsTipOptions type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ConfigurationDetailsTipOptions otherOptions(String otherOptions) {
    
    this.otherOptions = otherOptions;
    return this;
  }

   /**
   * Get otherOptions
   * @return otherOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOtherOptions() {
    return otherOptions;
  }


  public void setOtherOptions(String otherOptions) {
    this.otherOptions = otherOptions;
  }


  public ConfigurationDetailsTipOptions tipSelections(String tipSelections) {
    
    this.tipSelections = tipSelections;
    return this;
  }

   /**
   * Get tipSelections
   * @return tipSelections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTipSelections() {
    return tipSelections;
  }


  public void setTipSelections(String tipSelections) {
    this.tipSelections = tipSelections;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationDetailsTipOptions configurationDetailsTipOptions = (ConfigurationDetailsTipOptions) o;
    return Objects.equals(this.type, configurationDetailsTipOptions.type) &&
        Objects.equals(this.otherOptions, configurationDetailsTipOptions.otherOptions) &&
        Objects.equals(this.tipSelections, configurationDetailsTipOptions.tipSelections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, otherOptions, tipSelections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationDetailsTipOptions {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    otherOptions: ").append(toIndentedString(otherOptions)).append("\n");
    sb.append("    tipSelections: ").append(toIndentedString(tipSelections)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("other_options");
    openapiFields.add("tip_selections");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConfigurationDetailsTipOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConfigurationDetailsTipOptions.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigurationDetailsTipOptions is not found in the empty JSON string", ConfigurationDetailsTipOptions.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConfigurationDetailsTipOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigurationDetailsTipOptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()  && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("other_options") != null && !jsonObj.get("other_options").isJsonNull()  && !jsonObj.get("other_options").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_options` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_options").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("tip_selections") != null && !jsonObj.get("tip_selections").isJsonNull()  && !jsonObj.get("tip_selections").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tip_selections` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tip_selections").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigurationDetailsTipOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigurationDetailsTipOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigurationDetailsTipOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigurationDetailsTipOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigurationDetailsTipOptions>() {
           @Override
           public void write(JsonWriter out, ConfigurationDetailsTipOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigurationDetailsTipOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfigurationDetailsTipOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfigurationDetailsTipOptions
  * @throws IOException if the JSON string is invalid with respect to ConfigurationDetailsTipOptions
  */
  public static ConfigurationDetailsTipOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigurationDetailsTipOptions.class);
  }

 /**
  * Convert an instance of ConfigurationDetailsTipOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

