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
import model.Settlement;

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
 * List of &#x60;Settlement&#x60; objects.
 */
@ApiModel(description = "List of `Settlement` objects.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SettlementsListEmbedded {
  public static final String SERIALIZED_NAME_SETTLEMENTS = "settlements";
  @SerializedName(SERIALIZED_NAME_SETTLEMENTS)
  private Set<Settlement> settlements = null;

  public SettlementsListEmbedded() { 
  }

  public SettlementsListEmbedded settlements(Set<Settlement> settlements) {
    
    this.settlements = settlements;
    return this;
  }

  public SettlementsListEmbedded addSettlementsItem(Settlement settlementsItem) {
    if (this.settlements == null) {
      this.settlements = new LinkedHashSet<>();
    }
    this.settlements.add(settlementsItem);
    return this;
  }

   /**
   * &#x60;Settlements&#x60; resource.
   * @return settlements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`Settlements` resource.")

  public Set<Settlement> getSettlements() {
    return settlements;
  }


  public void setSettlements(Set<Settlement> settlements) {
    this.settlements = settlements;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementsListEmbedded settlementsListEmbedded = (SettlementsListEmbedded) o;
    return Objects.equals(this.settlements, settlementsListEmbedded.settlements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settlements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementsListEmbedded {\n");
    sb.append("    settlements: ").append(toIndentedString(settlements)).append("\n");
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
    openapiFields.add("settlements");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SettlementsListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SettlementsListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SettlementsListEmbedded is not found in the empty JSON string", SettlementsListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SettlementsListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SettlementsListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArraysettlements = jsonObj.getAsJsonArray("settlements");
      if (jsonArraysettlements != null) {
        // ensure the json data is an array
        if (!jsonObj.get("settlements").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `settlements` to be an array in the JSON string but got `%s`", jsonObj.get("settlements").toString()));
        }

        // validate the optional field `settlements` (array)
        for (int i = 0; i < jsonArraysettlements.size(); i++) {
          Settlement.validateJsonObject(jsonArraysettlements.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SettlementsListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SettlementsListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SettlementsListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SettlementsListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<SettlementsListEmbedded>() {
           @Override
           public void write(JsonWriter out, SettlementsListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SettlementsListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SettlementsListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SettlementsListEmbedded
  * @throws IOException if the JSON string is invalid with respect to SettlementsListEmbedded
  */
  public static SettlementsListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SettlementsListEmbedded.class);
  }

 /**
  * Convert an instance of SettlementsListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

