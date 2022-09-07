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
 * Configure how the &#x60;Processor&#x60; handles &#x60;Payment Instruments&#x60;.
 */
@ApiModel(description = "Configure how the `Processor` handles `Payment Instruments`.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProcessorSystemConfigConfig {
  public static final String SERIALIZED_NAME_CAN_DEBIT_BANK_ACCOUNT = "canDebitBankAccount";
  @SerializedName(SERIALIZED_NAME_CAN_DEBIT_BANK_ACCOUNT)
  private Map<String, Object> canDebitBankAccount = null;

  public ProcessorSystemConfigConfig() { 
  }

  public ProcessorSystemConfigConfig canDebitBankAccount(Map<String, Object> canDebitBankAccount) {
    
    this.canDebitBankAccount = canDebitBankAccount;
    return this;
  }

  public ProcessorSystemConfigConfig putCanDebitBankAccountItem(String key, Object canDebitBankAccountItem) {
    if (this.canDebitBankAccount == null) {
      this.canDebitBankAccount = new HashMap<>();
    }
    this.canDebitBankAccount.put(key, canDebitBankAccountItem);
    return this;
  }

   /**
   * Set to true to allow the &#x60;Processor&#x60; to debit &#x60;Payment instrument with type **BANK_ACCOUNT** (i.e. eCheck).
   * @return canDebitBankAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to true to allow the `Processor` to debit `Payment instrument with type **BANK_ACCOUNT** (i.e. eCheck).")

  public Map<String, Object> getCanDebitBankAccount() {
    return canDebitBankAccount;
  }


  public void setCanDebitBankAccount(Map<String, Object> canDebitBankAccount) {
    this.canDebitBankAccount = canDebitBankAccount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorSystemConfigConfig processorSystemConfigConfig = (ProcessorSystemConfigConfig) o;
    return Objects.equals(this.canDebitBankAccount, processorSystemConfigConfig.canDebitBankAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canDebitBankAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorSystemConfigConfig {\n");
    sb.append("    canDebitBankAccount: ").append(toIndentedString(canDebitBankAccount)).append("\n");
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
    openapiFields.add("canDebitBankAccount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProcessorSystemConfigConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProcessorSystemConfigConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProcessorSystemConfigConfig is not found in the empty JSON string", ProcessorSystemConfigConfig.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProcessorSystemConfigConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProcessorSystemConfigConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProcessorSystemConfigConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProcessorSystemConfigConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProcessorSystemConfigConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProcessorSystemConfigConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ProcessorSystemConfigConfig>() {
           @Override
           public void write(JsonWriter out, ProcessorSystemConfigConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProcessorSystemConfigConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProcessorSystemConfigConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProcessorSystemConfigConfig
  * @throws IOException if the JSON string is invalid with respect to ProcessorSystemConfigConfig
  */
  public static ProcessorSystemConfigConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProcessorSystemConfigConfig.class);
  }

 /**
  * Convert an instance of ProcessorSystemConfigConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

