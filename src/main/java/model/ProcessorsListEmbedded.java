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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import model.Processor;

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
 * List of &#x60;Processors&#x60; objects.
 */
@ApiModel(description = "List of `Processors` objects.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProcessorsListEmbedded {
  public static final String SERIALIZED_NAME_PROCESSORS = "processors";
  @SerializedName(SERIALIZED_NAME_PROCESSORS)
  private Set<Processor> processors = null;

  public ProcessorsListEmbedded() { 
  }

  public ProcessorsListEmbedded processors(Set<Processor> processors) {
    
    this.processors = processors;
    return this;
  }

  public ProcessorsListEmbedded addProcessorsItem(Processor processorsItem) {
    if (this.processors == null) {
      this.processors = new LinkedHashSet<>();
    }
    this.processors.add(processorsItem);
    return this;
  }

   /**
   * &#x60;Processors&#x60; objects.
   * @return processors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`Processors` objects.")

  public Set<Processor> getProcessors() {
    return processors;
  }


  public void setProcessors(Set<Processor> processors) {
    this.processors = processors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorsListEmbedded processorsListEmbedded = (ProcessorsListEmbedded) o;
    return Objects.equals(this.processors, processorsListEmbedded.processors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorsListEmbedded {\n");
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
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
    openapiFields.add("processors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProcessorsListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProcessorsListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProcessorsListEmbedded is not found in the empty JSON string", ProcessorsListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProcessorsListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProcessorsListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArrayprocessors = jsonObj.getAsJsonArray("processors");
      if (jsonArrayprocessors != null) {
        // ensure the json data is an array
        if (!jsonObj.get("processors").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `processors` to be an array in the JSON string but got `%s`", jsonObj.get("processors").toString()));
        }

        // validate the optional field `processors` (array)
        for (int i = 0; i < jsonArrayprocessors.size(); i++) {
          Processor.validateJsonObject(jsonArrayprocessors.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProcessorsListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProcessorsListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProcessorsListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProcessorsListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<ProcessorsListEmbedded>() {
           @Override
           public void write(JsonWriter out, ProcessorsListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProcessorsListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProcessorsListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProcessorsListEmbedded
  * @throws IOException if the JSON string is invalid with respect to ProcessorsListEmbedded
  */
  public static ProcessorsListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProcessorsListEmbedded.class);
  }

 /**
  * Convert an instance of ProcessorsListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

