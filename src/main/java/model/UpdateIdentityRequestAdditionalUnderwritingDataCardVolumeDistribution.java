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
 * The distribution of the merchant&#39;s credit card volume The sum of &#x60;card_volume_distribution&#x60; must be 100.
 */
@ApiModel(description = "The distribution of the merchant's credit card volume The sum of `card_volume_distribution` must be 100.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution {
  public static final String SERIALIZED_NAME_CARD_PRESENT_PERCENTAGE = "card_present_percentage";
  @SerializedName(SERIALIZED_NAME_CARD_PRESENT_PERCENTAGE)
  private Long cardPresentPercentage;

  public static final String SERIALIZED_NAME_ECOMMERCE_PERCENTAGE = "ecommerce_percentage";
  @SerializedName(SERIALIZED_NAME_ECOMMERCE_PERCENTAGE)
  private Long ecommercePercentage;

  public static final String SERIALIZED_NAME_MAIL_ORDER_TELEPHONE_ORDER_PERCENTAGE = "mail_order_telephone_order_percentage";
  @SerializedName(SERIALIZED_NAME_MAIL_ORDER_TELEPHONE_ORDER_PERCENTAGE)
  private Long mailOrderTelephoneOrderPercentage;

  public UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution() { 
  }

  public UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution cardPresentPercentage(Long cardPresentPercentage) {
    
    this.cardPresentPercentage = cardPresentPercentage;
    return this;
  }

   /**
   * The percentage of the merchant&#39;s business that&#39;s card present (between 0 and 100).
   * @return cardPresentPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The percentage of the merchant's business that's card present (between 0 and 100).")

  public Long getCardPresentPercentage() {
    return cardPresentPercentage;
  }


  public void setCardPresentPercentage(Long cardPresentPercentage) {
    this.cardPresentPercentage = cardPresentPercentage;
  }


  public UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution ecommercePercentage(Long ecommercePercentage) {
    
    this.ecommercePercentage = ecommercePercentage;
    return this;
  }

   /**
   * The percentage of the merchant&#39;s business that&#39;s e-commerce (between 0 and 100).
   * @return ecommercePercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The percentage of the merchant's business that's e-commerce (between 0 and 100).")

  public Long getEcommercePercentage() {
    return ecommercePercentage;
  }


  public void setEcommercePercentage(Long ecommercePercentage) {
    this.ecommercePercentage = ecommercePercentage;
  }


  public UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution mailOrderTelephoneOrderPercentage(Long mailOrderTelephoneOrderPercentage) {
    
    this.mailOrderTelephoneOrderPercentage = mailOrderTelephoneOrderPercentage;
    return this;
  }

   /**
   * The percentage of the merchant&#39;s business that&#39;s mail or telephone order (between 0 and 100).
   * @return mailOrderTelephoneOrderPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The percentage of the merchant's business that's mail or telephone order (between 0 and 100).")

  public Long getMailOrderTelephoneOrderPercentage() {
    return mailOrderTelephoneOrderPercentage;
  }


  public void setMailOrderTelephoneOrderPercentage(Long mailOrderTelephoneOrderPercentage) {
    this.mailOrderTelephoneOrderPercentage = mailOrderTelephoneOrderPercentage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution updateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution = (UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution) o;
    return Objects.equals(this.cardPresentPercentage, updateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution.cardPresentPercentage) &&
        Objects.equals(this.ecommercePercentage, updateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution.ecommercePercentage) &&
        Objects.equals(this.mailOrderTelephoneOrderPercentage, updateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution.mailOrderTelephoneOrderPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardPresentPercentage, ecommercePercentage, mailOrderTelephoneOrderPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution {\n");
    sb.append("    cardPresentPercentage: ").append(toIndentedString(cardPresentPercentage)).append("\n");
    sb.append("    ecommercePercentage: ").append(toIndentedString(ecommercePercentage)).append("\n");
    sb.append("    mailOrderTelephoneOrderPercentage: ").append(toIndentedString(mailOrderTelephoneOrderPercentage)).append("\n");
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
    openapiFields.add("card_present_percentage");
    openapiFields.add("ecommerce_percentage");
    openapiFields.add("mail_order_telephone_order_percentage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution is not found in the empty JSON string", UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution>() {
           @Override
           public void write(JsonWriter out, UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution
  * @throws IOException if the JSON string is invalid with respect to UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution
  */
  public static UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution.class);
  }

 /**
  * Convert an instance of UpdateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

