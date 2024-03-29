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
import model.PaymentInstrument;

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
 * List of &#x60;Payment Instrument&#x60; objects.
 */
@ApiModel(description = "List of `Payment Instrument` objects.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentInstrumentsListEmbedded {
  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENTS = "payment_instruments";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENTS)
  private Set<PaymentInstrument> paymentInstruments = null;

  public PaymentInstrumentsListEmbedded() { 
  }

  public PaymentInstrumentsListEmbedded paymentInstruments(Set<PaymentInstrument> paymentInstruments) {
    
    this.paymentInstruments = paymentInstruments;
    return this;
  }

  public PaymentInstrumentsListEmbedded addPaymentInstrumentsItem(PaymentInstrument paymentInstrumentsItem) {
    if (this.paymentInstruments == null) {
      this.paymentInstruments = new LinkedHashSet<>();
    }
    this.paymentInstruments.add(paymentInstrumentsItem);
    return this;
  }

   /**
   * &#x60;Payment Instrument&#x60; objects.
   * @return paymentInstruments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`Payment Instrument` objects.")

  public Set<PaymentInstrument> getPaymentInstruments() {
    return paymentInstruments;
  }


  public void setPaymentInstruments(Set<PaymentInstrument> paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrumentsListEmbedded paymentInstrumentsListEmbedded = (PaymentInstrumentsListEmbedded) o;
    return Objects.equals(this.paymentInstruments, paymentInstrumentsListEmbedded.paymentInstruments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInstruments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrumentsListEmbedded {\n");
    sb.append("    paymentInstruments: ").append(toIndentedString(paymentInstruments)).append("\n");
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
    openapiFields.add("payment_instruments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentInstrumentsListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentInstrumentsListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentInstrumentsListEmbedded is not found in the empty JSON string", PaymentInstrumentsListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentInstrumentsListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentInstrumentsListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArraypaymentInstruments = jsonObj.getAsJsonArray("payment_instruments");
      if (jsonArraypaymentInstruments != null) {
        // ensure the json data is an array
        if (!jsonObj.get("payment_instruments").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `payment_instruments` to be an array in the JSON string but got `%s`", jsonObj.get("payment_instruments").toString()));
        }

        // validate the optional field `payment_instruments` (array)
        for (int i = 0; i < jsonArraypaymentInstruments.size(); i++) {
          PaymentInstrument.validateJsonObject(jsonArraypaymentInstruments.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentInstrumentsListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentInstrumentsListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentInstrumentsListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentInstrumentsListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentInstrumentsListEmbedded>() {
           @Override
           public void write(JsonWriter out, PaymentInstrumentsListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentInstrumentsListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentInstrumentsListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentInstrumentsListEmbedded
  * @throws IOException if the JSON string is invalid with respect to PaymentInstrumentsListEmbedded
  */
  public static PaymentInstrumentsListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentInstrumentsListEmbedded.class);
  }

 /**
  * Convert an instance of PaymentInstrumentsListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

