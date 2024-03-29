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
import model.Merchant;

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
 * List of &#x60;Merchant&#x60; objects.
 */
@ApiModel(description = "List of `Merchant` objects.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantsListEmbedded {
  public static final String SERIALIZED_NAME_MERCHANTS = "merchants";
  @SerializedName(SERIALIZED_NAME_MERCHANTS)
  private Set<Merchant> merchants = null;

  public MerchantsListEmbedded() { 
  }

  public MerchantsListEmbedded merchants(Set<Merchant> merchants) {
    
    this.merchants = merchants;
    return this;
  }

  public MerchantsListEmbedded addMerchantsItem(Merchant merchantsItem) {
    if (this.merchants == null) {
      this.merchants = new LinkedHashSet<>();
    }
    this.merchants.add(merchantsItem);
    return this;
  }

   /**
   * &#x60;Merchant&#x60; objects.
   * @return merchants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`Merchant` objects.")

  public Set<Merchant> getMerchants() {
    return merchants;
  }


  public void setMerchants(Set<Merchant> merchants) {
    this.merchants = merchants;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantsListEmbedded merchantsListEmbedded = (MerchantsListEmbedded) o;
    return Objects.equals(this.merchants, merchantsListEmbedded.merchants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantsListEmbedded {\n");
    sb.append("    merchants: ").append(toIndentedString(merchants)).append("\n");
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
    openapiFields.add("merchants");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantsListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MerchantsListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantsListEmbedded is not found in the empty JSON string", MerchantsListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MerchantsListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MerchantsListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArraymerchants = jsonObj.getAsJsonArray("merchants");
      if (jsonArraymerchants != null) {
        // ensure the json data is an array
        if (!jsonObj.get("merchants").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `merchants` to be an array in the JSON string but got `%s`", jsonObj.get("merchants").toString()));
        }

        // validate the optional field `merchants` (array)
        for (int i = 0; i < jsonArraymerchants.size(); i++) {
          Merchant.validateJsonObject(jsonArraymerchants.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantsListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantsListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantsListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantsListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantsListEmbedded>() {
           @Override
           public void write(JsonWriter out, MerchantsListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MerchantsListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MerchantsListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantsListEmbedded
  * @throws IOException if the JSON string is invalid with respect to MerchantsListEmbedded
  */
  public static MerchantsListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantsListEmbedded.class);
  }

 /**
  * Convert an instance of MerchantsListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

