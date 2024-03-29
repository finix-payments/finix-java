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
 * CreateOnboardingFormRequestMerchantProcessorsInner
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateOnboardingFormRequestMerchantProcessorsInner {
  public static final String SERIALIZED_NAME_PROCESSOR = "processor";
  @SerializedName(SERIALIZED_NAME_PROCESSOR)
  private String processor;

  public CreateOnboardingFormRequestMerchantProcessorsInner() { 
  }

  public CreateOnboardingFormRequestMerchantProcessorsInner processor(String processor) {
    
    this.processor = processor;
    return this;
  }

   /**
   * The name of the processor you plan to onboard users to.
   * @return processor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the processor you plan to onboard users to.")

  public String getProcessor() {
    return processor;
  }


  public void setProcessor(String processor) {
    this.processor = processor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOnboardingFormRequestMerchantProcessorsInner createOnboardingFormRequestMerchantProcessorsInner = (CreateOnboardingFormRequestMerchantProcessorsInner) o;
    return Objects.equals(this.processor, createOnboardingFormRequestMerchantProcessorsInner.processor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOnboardingFormRequestMerchantProcessorsInner {\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
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
    openapiFields.add("processor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateOnboardingFormRequestMerchantProcessorsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateOnboardingFormRequestMerchantProcessorsInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateOnboardingFormRequestMerchantProcessorsInner is not found in the empty JSON string", CreateOnboardingFormRequestMerchantProcessorsInner.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateOnboardingFormRequestMerchantProcessorsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateOnboardingFormRequestMerchantProcessorsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("processor") != null && !jsonObj.get("processor").isJsonNull()  && !jsonObj.get("processor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processor").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateOnboardingFormRequestMerchantProcessorsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateOnboardingFormRequestMerchantProcessorsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateOnboardingFormRequestMerchantProcessorsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateOnboardingFormRequestMerchantProcessorsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateOnboardingFormRequestMerchantProcessorsInner>() {
           @Override
           public void write(JsonWriter out, CreateOnboardingFormRequestMerchantProcessorsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateOnboardingFormRequestMerchantProcessorsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateOnboardingFormRequestMerchantProcessorsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateOnboardingFormRequestMerchantProcessorsInner
  * @throws IOException if the JSON string is invalid with respect to CreateOnboardingFormRequestMerchantProcessorsInner
  */
  public static CreateOnboardingFormRequestMerchantProcessorsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateOnboardingFormRequestMerchantProcessorsInner.class);
  }

 /**
  * Convert an instance of CreateOnboardingFormRequestMerchantProcessorsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

