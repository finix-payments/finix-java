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
import model.Fee;

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
 * List of &#x60;fee&#x60; objects.
 */
@ApiModel(description = "List of `fee` objects.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeesListEmbedded {
  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private Set<Fee> fees = null;

  public FeesListEmbedded() { 
  }

  public FeesListEmbedded fees(Set<Fee> fees) {
    
    this.fees = fees;
    return this;
  }

  public FeesListEmbedded addFeesItem(Fee feesItem) {
    if (this.fees == null) {
      this.fees = new LinkedHashSet<>();
    }
    this.fees.add(feesItem);
    return this;
  }

   /**
   * &#x60;fee&#x60; objects.
   * @return fees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`fee` objects.")

  public Set<Fee> getFees() {
    return fees;
  }


  public void setFees(Set<Fee> fees) {
    this.fees = fees;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeesListEmbedded feesListEmbedded = (FeesListEmbedded) o;
    return Objects.equals(this.fees, feesListEmbedded.fees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeesListEmbedded {\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
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
    openapiFields.add("fees");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FeesListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FeesListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeesListEmbedded is not found in the empty JSON string", FeesListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FeesListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FeesListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArrayfees = jsonObj.getAsJsonArray("fees");
      if (jsonArrayfees != null) {
        // ensure the json data is an array
        if (!jsonObj.get("fees").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `fees` to be an array in the JSON string but got `%s`", jsonObj.get("fees").toString()));
        }

        // validate the optional field `fees` (array)
        for (int i = 0; i < jsonArrayfees.size(); i++) {
          Fee.validateJsonObject(jsonArrayfees.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeesListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeesListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeesListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeesListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<FeesListEmbedded>() {
           @Override
           public void write(JsonWriter out, FeesListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FeesListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FeesListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FeesListEmbedded
  * @throws IOException if the JSON string is invalid with respect to FeesListEmbedded
  */
  public static FeesListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeesListEmbedded.class);
  }

 /**
  * Convert an instance of FeesListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

