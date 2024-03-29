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
 * Configure the details of how a &#x60;Processor&#x60; handles transactions.
 */
@ApiModel(description = "Configure the details of how a `Processor` handles transactions.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateProcessorRequestConfig {
  public static final String SERIALIZED_NAME_CAN_DEBIT_BANK_ACCOUNT = "canDebitBankAccount";
  @SerializedName(SERIALIZED_NAME_CAN_DEBIT_BANK_ACCOUNT)
  private Boolean canDebitBankAccount;

  public CreateProcessorRequestConfig() { 
  }

  public CreateProcessorRequestConfig canDebitBankAccount(Boolean canDebitBankAccount) {
    
    this.canDebitBankAccount = canDebitBankAccount;
    return this;
  }

   /**
   * Details if a &#x60;Processor&#x60; can debit bank accounts.
   * @return canDebitBankAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if a `Processor` can debit bank accounts.")

  public Boolean getCanDebitBankAccount() {
    return canDebitBankAccount;
  }


  public void setCanDebitBankAccount(Boolean canDebitBankAccount) {
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
    CreateProcessorRequestConfig createProcessorRequestConfig = (CreateProcessorRequestConfig) o;
    return Objects.equals(this.canDebitBankAccount, createProcessorRequestConfig.canDebitBankAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canDebitBankAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProcessorRequestConfig {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to CreateProcessorRequestConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateProcessorRequestConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateProcessorRequestConfig is not found in the empty JSON string", CreateProcessorRequestConfig.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateProcessorRequestConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateProcessorRequestConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateProcessorRequestConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateProcessorRequestConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateProcessorRequestConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateProcessorRequestConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateProcessorRequestConfig>() {
           @Override
           public void write(JsonWriter out, CreateProcessorRequestConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateProcessorRequestConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateProcessorRequestConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateProcessorRequestConfig
  * @throws IOException if the JSON string is invalid with respect to CreateProcessorRequestConfig
  */
  public static CreateProcessorRequestConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateProcessorRequestConfig.class);
  }

 /**
  * Convert an instance of CreateProcessorRequestConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

