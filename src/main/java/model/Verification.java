/*
 * Finix API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2018-01-01
 * Contact: support@finixpayments.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
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
import java.util.ArrayList;
import java.util.List;
import model.DisputeEvidenceLinks;
import model.VerificationPage;
import model.VerificationVerificationsInner;

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
 * Verification
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-15T16:04:59.372163-05:00[America/Chicago]")
public class Verification {
  public static final String SERIALIZED_NAME_VERIFICATIONS = "verifications";
  @SerializedName(SERIALIZED_NAME_VERIFICATIONS)
  private List<VerificationVerificationsInner> verifications = null;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private DisputeEvidenceLinks links;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private VerificationPage page;

  public Verification() { 
  }

  public Verification verifications(List<VerificationVerificationsInner> verifications) {
    
    this.verifications = verifications;
    return this;
  }

  public Verification addVerificationsItem(VerificationVerificationsInner verificationsItem) {
    if (this.verifications == null) {
      this.verifications = new ArrayList<>();
    }
    this.verifications.add(verificationsItem);
    return this;
  }

   /**
   * &#x60;Verification&#x60; resource.
   * @return verifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`Verification` resource.")

  public List<VerificationVerificationsInner> getVerifications() {
    return verifications;
  }


  public void setVerifications(List<VerificationVerificationsInner> verifications) {
    this.verifications = verifications;
  }


  public Verification links(DisputeEvidenceLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DisputeEvidenceLinks getLinks() {
    return links;
  }


  public void setLinks(DisputeEvidenceLinks links) {
    this.links = links;
  }


  public Verification page(VerificationPage page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VerificationPage getPage() {
    return page;
  }


  public void setPage(VerificationPage page) {
    this.page = page;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Verification verification = (Verification) o;
    return Objects.equals(this.verifications, verification.verifications) &&
        Objects.equals(this.links, verification.links) &&
        Objects.equals(this.page, verification.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verifications, links, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Verification {\n");
    sb.append("    verifications: ").append(toIndentedString(verifications)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
    openapiFields.add("verifications");
    openapiFields.add("_links");
    openapiFields.add("page");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Verification
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Verification.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Verification is not found in the empty JSON string", Verification.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Verification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Verification` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArrayverifications = jsonObj.getAsJsonArray("verifications");
      if (jsonArrayverifications != null) {
        // ensure the json data is an array
        if (!jsonObj.get("verifications").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `verifications` to be an array in the JSON string but got `%s`", jsonObj.get("verifications").toString()));
        }

        // validate the optional field `verifications` (array)
        for (int i = 0; i < jsonArrayverifications.size(); i++) {
          VerificationVerificationsInner.validateJsonObject(jsonArrayverifications.get(i).getAsJsonObject());
        }
          ;
      }
      // validate the optional field `_links`
     // if (jsonObj.getAsJsonObject("_links") != null) {
       //DisputeEvidenceLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
     // }
      // validate the optional field `page`
     // if (jsonObj.getAsJsonObject("page") != null) {
       //VerificationPage.validateJsonObject(jsonObj.getAsJsonObject("page"));
     // }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Verification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Verification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Verification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Verification.class));

       return (TypeAdapter<T>) new TypeAdapter<Verification>() {
           @Override
           public void write(JsonWriter out, Verification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Verification read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Verification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Verification
  * @throws IOException if the JSON string is invalid with respect to Verification
  */
  public static Verification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Verification.class);
  }

 /**
  * Convert an instance of Verification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

