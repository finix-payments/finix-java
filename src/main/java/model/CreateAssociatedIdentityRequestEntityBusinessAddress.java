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
 * The primary address for the legal entity.
 */
@ApiModel(description = "The primary address for the legal entity.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateAssociatedIdentityRequestEntityBusinessAddress {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_LINE2 = "line2";
  @SerializedName(SERIALIZED_NAME_LINE2)
  private String line2;

  public static final String SERIALIZED_NAME_LINE1 = "line1";
  @SerializedName(SERIALIZED_NAME_LINE1)
  private String line1;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public CreateAssociatedIdentityRequestEntityBusinessAddress() { 
  }

  public CreateAssociatedIdentityRequestEntityBusinessAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City (max 20 characters).
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "City (max 20 characters).")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public CreateAssociatedIdentityRequestEntityBusinessAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public CreateAssociatedIdentityRequestEntityBusinessAddress region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * 2-letter state code.
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "2-letter state code.")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public CreateAssociatedIdentityRequestEntityBusinessAddress line2(String line2) {
    
    this.line2 = line2;
    return this;
  }

   /**
   * Second line of the address (max 35 characters).
   * @return line2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Second line of the address (max 35 characters).")

  public String getLine2() {
    return line2;
  }


  public void setLine2(String line2) {
    this.line2 = line2;
  }


  public CreateAssociatedIdentityRequestEntityBusinessAddress line1(String line1) {
    
    this.line1 = line1;
    return this;
  }

   /**
   * First line of the address (max 35 characters).
   * @return line1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "First line of the address (max 35 characters).")

  public String getLine1() {
    return line1;
  }


  public void setLine1(String line1) {
    this.line1 = line1;
  }


  public CreateAssociatedIdentityRequestEntityBusinessAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Zip or Postal code (max 7 characters).
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Zip or Postal code (max 7 characters).")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAssociatedIdentityRequestEntityBusinessAddress createAssociatedIdentityRequestEntityBusinessAddress = (CreateAssociatedIdentityRequestEntityBusinessAddress) o;
    return Objects.equals(this.city, createAssociatedIdentityRequestEntityBusinessAddress.city) &&
        Objects.equals(this.country, createAssociatedIdentityRequestEntityBusinessAddress.country) &&
        Objects.equals(this.region, createAssociatedIdentityRequestEntityBusinessAddress.region) &&
        Objects.equals(this.line2, createAssociatedIdentityRequestEntityBusinessAddress.line2) &&
        Objects.equals(this.line1, createAssociatedIdentityRequestEntityBusinessAddress.line1) &&
        Objects.equals(this.postalCode, createAssociatedIdentityRequestEntityBusinessAddress.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, region, line2, line1, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssociatedIdentityRequestEntityBusinessAddress {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("region");
    openapiFields.add("line2");
    openapiFields.add("line1");
    openapiFields.add("postal_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateAssociatedIdentityRequestEntityBusinessAddress
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateAssociatedIdentityRequestEntityBusinessAddress.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAssociatedIdentityRequestEntityBusinessAddress is not found in the empty JSON string", CreateAssociatedIdentityRequestEntityBusinessAddress.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateAssociatedIdentityRequestEntityBusinessAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateAssociatedIdentityRequestEntityBusinessAddress` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()  && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()  && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()  && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("line2") != null && !jsonObj.get("line2").isJsonNull()  && !jsonObj.get("line2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line2").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("line1") != null && !jsonObj.get("line1").isJsonNull()  && !jsonObj.get("line1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line1").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("postal_code") != null && !jsonObj.get("postal_code").isJsonNull()  && !jsonObj.get("postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postal_code").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAssociatedIdentityRequestEntityBusinessAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAssociatedIdentityRequestEntityBusinessAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAssociatedIdentityRequestEntityBusinessAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAssociatedIdentityRequestEntityBusinessAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAssociatedIdentityRequestEntityBusinessAddress>() {
           @Override
           public void write(JsonWriter out, CreateAssociatedIdentityRequestEntityBusinessAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAssociatedIdentityRequestEntityBusinessAddress read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateAssociatedIdentityRequestEntityBusinessAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateAssociatedIdentityRequestEntityBusinessAddress
  * @throws IOException if the JSON string is invalid with respect to CreateAssociatedIdentityRequestEntityBusinessAddress
  */
  public static CreateAssociatedIdentityRequestEntityBusinessAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAssociatedIdentityRequestEntityBusinessAddress.class);
  }

 /**
  * Convert an instance of CreateAssociatedIdentityRequestEntityBusinessAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

