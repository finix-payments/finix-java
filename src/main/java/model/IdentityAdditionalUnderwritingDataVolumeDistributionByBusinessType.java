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
 * Merchant&#39;s distribution of credit card volume by business type. Sum of &#x60;volume_distribution_by_business_type&#x60; must be 100.
 */
@ApiModel(description = "Merchant's distribution of credit card volume by business type. Sum of `volume_distribution_by_business_type` must be 100.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType {
  public static final String SERIALIZED_NAME_BUSINESS_TO_BUSINESS_VOLUME_PERCENTAGE = "business_to_business_volume_percentage";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TO_BUSINESS_VOLUME_PERCENTAGE)
  private Long businessToBusinessVolumePercentage;

  public static final String SERIALIZED_NAME_BUSINESS_TO_CONSUMER_VOLUME_PERCENTAGE = "business_to_consumer_volume_percentage";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TO_CONSUMER_VOLUME_PERCENTAGE)
  private Long businessToConsumerVolumePercentage;

  public static final String SERIALIZED_NAME_CONSUMER_TO_CONSUMER_VOLUME_PERCENTAGE = "consumer_to_consumer_volume_percentage";
  @SerializedName(SERIALIZED_NAME_CONSUMER_TO_CONSUMER_VOLUME_PERCENTAGE)
  private Long consumerToConsumerVolumePercentage;

  public static final String SERIALIZED_NAME_OTHER_VOLUME_PERCENTAGE = "other_volume_percentage";
  @SerializedName(SERIALIZED_NAME_OTHER_VOLUME_PERCENTAGE)
  private Long otherVolumePercentage;

  public static final String SERIALIZED_NAME_PERSON_TO_PERSON_VOLUME_PERCENTAGE = "person_to_person_volume_percentage";
  @SerializedName(SERIALIZED_NAME_PERSON_TO_PERSON_VOLUME_PERCENTAGE)
  private Long personToPersonVolumePercentage;

  public IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType() { 
  }

  public IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType businessToBusinessVolumePercentage(Long businessToBusinessVolumePercentage) {
    
    this.businessToBusinessVolumePercentage = businessToBusinessVolumePercentage;
    return this;
  }

   /**
   * The percentage of the merchant&#39;s volume that&#39;s business to business (between 0 and 100).
   * @return businessToBusinessVolumePercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The percentage of the merchant's volume that's business to business (between 0 and 100).")

  public Long getBusinessToBusinessVolumePercentage() {
    return businessToBusinessVolumePercentage;
  }


  public void setBusinessToBusinessVolumePercentage(Long businessToBusinessVolumePercentage) {
    this.businessToBusinessVolumePercentage = businessToBusinessVolumePercentage;
  }


  public IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType businessToConsumerVolumePercentage(Long businessToConsumerVolumePercentage) {
    
    this.businessToConsumerVolumePercentage = businessToConsumerVolumePercentage;
    return this;
  }

   /**
   * The percentage of the merchant&#39;s volume that&#39;s business to consumer (between 0 and 100).
   * @return businessToConsumerVolumePercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The percentage of the merchant's volume that's business to consumer (between 0 and 100).")

  public Long getBusinessToConsumerVolumePercentage() {
    return businessToConsumerVolumePercentage;
  }


  public void setBusinessToConsumerVolumePercentage(Long businessToConsumerVolumePercentage) {
    this.businessToConsumerVolumePercentage = businessToConsumerVolumePercentage;
  }


  public IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType consumerToConsumerVolumePercentage(Long consumerToConsumerVolumePercentage) {
    
    this.consumerToConsumerVolumePercentage = consumerToConsumerVolumePercentage;
    return this;
  }

   /**
   * Merchant&#39;s percentage of volume that is consumer to consumer (between 0 and 100).
   * @return consumerToConsumerVolumePercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant's percentage of volume that is consumer to consumer (between 0 and 100).")

  public Long getConsumerToConsumerVolumePercentage() {
    return consumerToConsumerVolumePercentage;
  }


  public void setConsumerToConsumerVolumePercentage(Long consumerToConsumerVolumePercentage) {
    this.consumerToConsumerVolumePercentage = consumerToConsumerVolumePercentage;
  }


  public IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType otherVolumePercentage(Long otherVolumePercentage) {
    
    this.otherVolumePercentage = otherVolumePercentage;
    return this;
  }

   /**
   * The percentage of the merchant&#39;s volume that isn&#39;t represented by the previous fields (between 0 and 100).
   * @return otherVolumePercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The percentage of the merchant's volume that isn't represented by the previous fields (between 0 and 100).")

  public Long getOtherVolumePercentage() {
    return otherVolumePercentage;
  }


  public void setOtherVolumePercentage(Long otherVolumePercentage) {
    this.otherVolumePercentage = otherVolumePercentage;
  }


  public IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType personToPersonVolumePercentage(Long personToPersonVolumePercentage) {
    
    this.personToPersonVolumePercentage = personToPersonVolumePercentage;
    return this;
  }

   /**
   * The percentage the merchant&#39;s volume that&#39;s person to person (between 0 and 100).
   * @return personToPersonVolumePercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The percentage the merchant's volume that's person to person (between 0 and 100).")

  public Long getPersonToPersonVolumePercentage() {
    return personToPersonVolumePercentage;
  }


  public void setPersonToPersonVolumePercentage(Long personToPersonVolumePercentage) {
    this.personToPersonVolumePercentage = personToPersonVolumePercentage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType identityAdditionalUnderwritingDataVolumeDistributionByBusinessType = (IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType) o;
    return Objects.equals(this.businessToBusinessVolumePercentage, identityAdditionalUnderwritingDataVolumeDistributionByBusinessType.businessToBusinessVolumePercentage) &&
        Objects.equals(this.businessToConsumerVolumePercentage, identityAdditionalUnderwritingDataVolumeDistributionByBusinessType.businessToConsumerVolumePercentage) &&
        Objects.equals(this.consumerToConsumerVolumePercentage, identityAdditionalUnderwritingDataVolumeDistributionByBusinessType.consumerToConsumerVolumePercentage) &&
        Objects.equals(this.otherVolumePercentage, identityAdditionalUnderwritingDataVolumeDistributionByBusinessType.otherVolumePercentage) &&
        Objects.equals(this.personToPersonVolumePercentage, identityAdditionalUnderwritingDataVolumeDistributionByBusinessType.personToPersonVolumePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessToBusinessVolumePercentage, businessToConsumerVolumePercentage, consumerToConsumerVolumePercentage, otherVolumePercentage, personToPersonVolumePercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType {\n");
    sb.append("    businessToBusinessVolumePercentage: ").append(toIndentedString(businessToBusinessVolumePercentage)).append("\n");
    sb.append("    businessToConsumerVolumePercentage: ").append(toIndentedString(businessToConsumerVolumePercentage)).append("\n");
    sb.append("    consumerToConsumerVolumePercentage: ").append(toIndentedString(consumerToConsumerVolumePercentage)).append("\n");
    sb.append("    otherVolumePercentage: ").append(toIndentedString(otherVolumePercentage)).append("\n");
    sb.append("    personToPersonVolumePercentage: ").append(toIndentedString(personToPersonVolumePercentage)).append("\n");
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
    openapiFields.add("business_to_business_volume_percentage");
    openapiFields.add("business_to_consumer_volume_percentage");
    openapiFields.add("consumer_to_consumer_volume_percentage");
    openapiFields.add("other_volume_percentage");
    openapiFields.add("person_to_person_volume_percentage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType is not found in the empty JSON string", IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType.class));

       return (TypeAdapter<T>) new TypeAdapter<IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType>() {
           @Override
           public void write(JsonWriter out, IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType
  * @throws IOException if the JSON string is invalid with respect to IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType
  */
  public static IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType.class);
  }

 /**
  * Convert an instance of IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

