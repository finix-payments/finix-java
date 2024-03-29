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
 * ConfigurationDetailsCashbackOptionsManualEntry
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConfigurationDetailsCashbackOptionsManualEntry {
  public static final String SERIALIZED_NAME_AMOUNT_INCREMENT = "amount_increment";
  @SerializedName(SERIALIZED_NAME_AMOUNT_INCREMENT)
  private Long amountIncrement;

  public static final String SERIALIZED_NAME_MAXIMUM_AMOUNT = "maximum_amount";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_AMOUNT)
  private Long maximumAmount;

  public ConfigurationDetailsCashbackOptionsManualEntry() { 
  }

  public ConfigurationDetailsCashbackOptionsManualEntry amountIncrement(Long amountIncrement) {
    
    this.amountIncrement = amountIncrement;
    return this;
  }

   /**
   * Get amountIncrement
   * @return amountIncrement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAmountIncrement() {
    return amountIncrement;
  }


  public void setAmountIncrement(Long amountIncrement) {
    this.amountIncrement = amountIncrement;
  }


  public ConfigurationDetailsCashbackOptionsManualEntry maximumAmount(Long maximumAmount) {
    
    this.maximumAmount = maximumAmount;
    return this;
  }

   /**
   * Get maximumAmount
   * @return maximumAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMaximumAmount() {
    return maximumAmount;
  }


  public void setMaximumAmount(Long maximumAmount) {
    this.maximumAmount = maximumAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationDetailsCashbackOptionsManualEntry configurationDetailsCashbackOptionsManualEntry = (ConfigurationDetailsCashbackOptionsManualEntry) o;
    return Objects.equals(this.amountIncrement, configurationDetailsCashbackOptionsManualEntry.amountIncrement) &&
        Objects.equals(this.maximumAmount, configurationDetailsCashbackOptionsManualEntry.maximumAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountIncrement, maximumAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationDetailsCashbackOptionsManualEntry {\n");
    sb.append("    amountIncrement: ").append(toIndentedString(amountIncrement)).append("\n");
    sb.append("    maximumAmount: ").append(toIndentedString(maximumAmount)).append("\n");
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
    openapiFields.add("amount_increment");
    openapiFields.add("maximum_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConfigurationDetailsCashbackOptionsManualEntry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConfigurationDetailsCashbackOptionsManualEntry.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigurationDetailsCashbackOptionsManualEntry is not found in the empty JSON string", ConfigurationDetailsCashbackOptionsManualEntry.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConfigurationDetailsCashbackOptionsManualEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigurationDetailsCashbackOptionsManualEntry` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigurationDetailsCashbackOptionsManualEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigurationDetailsCashbackOptionsManualEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigurationDetailsCashbackOptionsManualEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigurationDetailsCashbackOptionsManualEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigurationDetailsCashbackOptionsManualEntry>() {
           @Override
           public void write(JsonWriter out, ConfigurationDetailsCashbackOptionsManualEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigurationDetailsCashbackOptionsManualEntry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfigurationDetailsCashbackOptionsManualEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfigurationDetailsCashbackOptionsManualEntry
  * @throws IOException if the JSON string is invalid with respect to ConfigurationDetailsCashbackOptionsManualEntry
  */
  public static ConfigurationDetailsCashbackOptionsManualEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigurationDetailsCashbackOptionsManualEntry.class);
  }

 /**
  * Convert an instance of ConfigurationDetailsCashbackOptionsManualEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

