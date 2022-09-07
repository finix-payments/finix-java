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
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Object detailing any [Buyer Charges](/guides/payments/buyer-charges) that got included in the &#x60;Authorization&#x60;.
 */
@ApiModel(description = "Object detailing any [Buyer Charges](/guides/payments/buyer-charges) that got included in the `Authorization`.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdditionalBuyerCharges {
  public static final String SERIALIZED_NAME_CONVENIENCE_AMOUNT = "convenience_amount";
  @SerializedName(SERIALIZED_NAME_CONVENIENCE_AMOUNT)
  private BigDecimal convenienceAmount;

  public static final String SERIALIZED_NAME_RENT_SURCHARGE_AMOUNT = "rent_surcharge_amount";
  @SerializedName(SERIALIZED_NAME_RENT_SURCHARGE_AMOUNT)
  private BigDecimal rentSurchargeAmount;

  public AdditionalBuyerCharges() { 
  }

  public AdditionalBuyerCharges convenienceAmount(BigDecimal convenienceAmount) {
    
    this.convenienceAmount = convenienceAmount;
    return this;
  }

   /**
   * Include the convenience fee the merchant is charging the buyer for the transaction when creating a &#x60;Transfer&#x60; or an &#x60;Authorization&#x60;.
   * @return convenienceAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include the convenience fee the merchant is charging the buyer for the transaction when creating a `Transfer` or an `Authorization`.")

  public BigDecimal getConvenienceAmount() {
    return convenienceAmount;
  }


  public void setConvenienceAmount(BigDecimal convenienceAmount) {
    this.convenienceAmount = convenienceAmount;
  }


  public AdditionalBuyerCharges rentSurchargeAmount(BigDecimal rentSurchargeAmount) {
    
    this.rentSurchargeAmount = rentSurchargeAmount;
    return this;
  }

   /**
   * Include the rent surcharge the merchant is charging the buyer for the transaction when creating a &#x60;Transfer&#x60; or an &#x60;Authorization&#x60;.
   * @return rentSurchargeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include the rent surcharge the merchant is charging the buyer for the transaction when creating a `Transfer` or an `Authorization`.")

  public BigDecimal getRentSurchargeAmount() {
    return rentSurchargeAmount;
  }


  public void setRentSurchargeAmount(BigDecimal rentSurchargeAmount) {
    this.rentSurchargeAmount = rentSurchargeAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalBuyerCharges additionalBuyerCharges = (AdditionalBuyerCharges) o;
    return Objects.equals(this.convenienceAmount, additionalBuyerCharges.convenienceAmount) &&
        Objects.equals(this.rentSurchargeAmount, additionalBuyerCharges.rentSurchargeAmount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(convenienceAmount, rentSurchargeAmount);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalBuyerCharges {\n");
    sb.append("    convenienceAmount: ").append(toIndentedString(convenienceAmount)).append("\n");
    sb.append("    rentSurchargeAmount: ").append(toIndentedString(rentSurchargeAmount)).append("\n");
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
    openapiFields.add("convenience_amount");
    openapiFields.add("rent_surcharge_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdditionalBuyerCharges
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdditionalBuyerCharges.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdditionalBuyerCharges is not found in the empty JSON string", AdditionalBuyerCharges.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdditionalBuyerCharges.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdditionalBuyerCharges` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdditionalBuyerCharges.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdditionalBuyerCharges' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdditionalBuyerCharges> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdditionalBuyerCharges.class));

       return (TypeAdapter<T>) new TypeAdapter<AdditionalBuyerCharges>() {
           @Override
           public void write(JsonWriter out, AdditionalBuyerCharges value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdditionalBuyerCharges read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdditionalBuyerCharges given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdditionalBuyerCharges
  * @throws IOException if the JSON string is invalid with respect to AdditionalBuyerCharges
  */
  public static AdditionalBuyerCharges fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdditionalBuyerCharges.class);
  }

 /**
  * Convert an instance of AdditionalBuyerCharges to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

