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
import model.InstrumentUpdate;

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
 * List of &#x60;updates&#x60; for a &#x60;Payment Instrument&#x60;.
 */
@ApiModel(description = "List of `updates` for a `Payment Instrument`.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentInstrumentUpdatesListEmbedded {
  public static final String SERIALIZED_NAME_UPDATES = "updates";
  @SerializedName(SERIALIZED_NAME_UPDATES)
  private Set<InstrumentUpdate> updates = null;

  public PaymentInstrumentUpdatesListEmbedded() { 
  }

  public PaymentInstrumentUpdatesListEmbedded updates(Set<InstrumentUpdate> updates) {
    
    this.updates = updates;
    return this;
  }

  public PaymentInstrumentUpdatesListEmbedded addUpdatesItem(InstrumentUpdate updatesItem) {
    if (this.updates == null) {
      this.updates = new LinkedHashSet<>();
    }
    this.updates.add(updatesItem);
    return this;
  }

   /**
   * &#x60;Update&#x60; objects.
   * @return updates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`Update` objects.")

  public Set<InstrumentUpdate> getUpdates() {
    return updates;
  }


  public void setUpdates(Set<InstrumentUpdate> updates) {
    this.updates = updates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrumentUpdatesListEmbedded paymentInstrumentUpdatesListEmbedded = (PaymentInstrumentUpdatesListEmbedded) o;
    return Objects.equals(this.updates, paymentInstrumentUpdatesListEmbedded.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrumentUpdatesListEmbedded {\n");
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
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
    openapiFields.add("updates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentInstrumentUpdatesListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentInstrumentUpdatesListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentInstrumentUpdatesListEmbedded is not found in the empty JSON string", PaymentInstrumentUpdatesListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentInstrumentUpdatesListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentInstrumentUpdatesListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArrayupdates = jsonObj.getAsJsonArray("updates");
      if (jsonArrayupdates != null) {
        // ensure the json data is an array
        if (!jsonObj.get("updates").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `updates` to be an array in the JSON string but got `%s`", jsonObj.get("updates").toString()));
        }

        // validate the optional field `updates` (array)
        for (int i = 0; i < jsonArrayupdates.size(); i++) {
          InstrumentUpdate.validateJsonObject(jsonArrayupdates.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentInstrumentUpdatesListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentInstrumentUpdatesListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentInstrumentUpdatesListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentInstrumentUpdatesListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentInstrumentUpdatesListEmbedded>() {
           @Override
           public void write(JsonWriter out, PaymentInstrumentUpdatesListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentInstrumentUpdatesListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentInstrumentUpdatesListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentInstrumentUpdatesListEmbedded
  * @throws IOException if the JSON string is invalid with respect to PaymentInstrumentUpdatesListEmbedded
  */
  public static PaymentInstrumentUpdatesListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentInstrumentUpdatesListEmbedded.class);
  }

 /**
  * Convert an instance of PaymentInstrumentUpdatesListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

