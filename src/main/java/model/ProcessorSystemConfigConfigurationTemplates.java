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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * ProcessorSystemConfigConfigurationTemplates
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-23T13:37:23.846763-07:00[America/Los_Angeles]")
public class ProcessorSystemConfigConfigurationTemplates {
  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private Map<String, Object> country = null;

  public ProcessorSystemConfigConfigurationTemplates() { 
  }

  public ProcessorSystemConfigConfigurationTemplates country(Map<String, Object> country) {
    
    this.country = country;
    return this;
  }

  public ProcessorSystemConfigConfigurationTemplates putCountryItem(String key, Object countryItem) {
    if (this.country == null) {
      this.country = new HashMap<>();
    }
    this.country.put(key, countryItem);
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getCountry() {
    return country;
  }


  public void setCountry(Map<String, Object> country) {
    this.country = country;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorSystemConfigConfigurationTemplates processorSystemConfigConfigurationTemplates = (ProcessorSystemConfigConfigurationTemplates) o;
    return Objects.equals(this.country, processorSystemConfigConfigurationTemplates.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorSystemConfigConfigurationTemplates {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
    openapiFields.add("country");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProcessorSystemConfigConfigurationTemplates
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProcessorSystemConfigConfigurationTemplates.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProcessorSystemConfigConfigurationTemplates is not found in the empty JSON string", ProcessorSystemConfigConfigurationTemplates.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProcessorSystemConfigConfigurationTemplates.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProcessorSystemConfigConfigurationTemplates` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProcessorSystemConfigConfigurationTemplates.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProcessorSystemConfigConfigurationTemplates' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProcessorSystemConfigConfigurationTemplates> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProcessorSystemConfigConfigurationTemplates.class));

       return (TypeAdapter<T>) new TypeAdapter<ProcessorSystemConfigConfigurationTemplates>() {
           @Override
           public void write(JsonWriter out, ProcessorSystemConfigConfigurationTemplates value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProcessorSystemConfigConfigurationTemplates read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProcessorSystemConfigConfigurationTemplates given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProcessorSystemConfigConfigurationTemplates
  * @throws IOException if the JSON string is invalid with respect to ProcessorSystemConfigConfigurationTemplates
  */
  public static ProcessorSystemConfigConfigurationTemplates fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProcessorSystemConfigConfigurationTemplates.class);
  }

 /**
  * Convert an instance of ProcessorSystemConfigConfigurationTemplates to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

