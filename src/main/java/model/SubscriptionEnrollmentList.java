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
import model.DisputeEvidenceLinks;
import model.SubscriptionEnrollmentListEmbedded;
import model.UsersListPage;

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
 * SubscriptionEnrollmentList
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscriptionEnrollmentList {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private UsersListPage page;

  public static final String SERIALIZED_NAME_EMBEDDED = "_embedded";
  @SerializedName(SERIALIZED_NAME_EMBEDDED)
  private SubscriptionEnrollmentListEmbedded embedded;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private DisputeEvidenceLinks links;

  public SubscriptionEnrollmentList() { 
  }

  public SubscriptionEnrollmentList page(UsersListPage page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UsersListPage getPage() {
    return page;
  }


  public void setPage(UsersListPage page) {
    this.page = page;
  }


  public SubscriptionEnrollmentList embedded(SubscriptionEnrollmentListEmbedded embedded) {
    
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubscriptionEnrollmentListEmbedded getEmbedded() {
    return embedded;
  }


  public void setEmbedded(SubscriptionEnrollmentListEmbedded embedded) {
    this.embedded = embedded;
  }


  public SubscriptionEnrollmentList links(DisputeEvidenceLinks links) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionEnrollmentList subscriptionEnrollmentList = (SubscriptionEnrollmentList) o;
    return Objects.equals(this.page, subscriptionEnrollmentList.page) &&
        Objects.equals(this.embedded, subscriptionEnrollmentList.embedded) &&
        Objects.equals(this.links, subscriptionEnrollmentList.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, embedded, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionEnrollmentList {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("page");
    openapiFields.add("_embedded");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubscriptionEnrollmentList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubscriptionEnrollmentList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionEnrollmentList is not found in the empty JSON string", SubscriptionEnrollmentList.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubscriptionEnrollmentList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubscriptionEnrollmentList` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `page`
     // if (jsonObj.getAsJsonObject("page") != null) {
       //UsersListPage.validateJsonObject(jsonObj.getAsJsonObject("page"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `_embedded`
     // if (jsonObj.getAsJsonObject("_embedded") != null) {
       //SubscriptionEnrollmentListEmbedded.validateJsonObject(jsonObj.getAsJsonObject("_embedded"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `_links`
     // if (jsonObj.getAsJsonObject("_links") != null) {
       //DisputeEvidenceLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionEnrollmentList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionEnrollmentList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionEnrollmentList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionEnrollmentList.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionEnrollmentList>() {
           @Override
           public void write(JsonWriter out, SubscriptionEnrollmentList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionEnrollmentList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionEnrollmentList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionEnrollmentList
  * @throws IOException if the JSON string is invalid with respect to SubscriptionEnrollmentList
  */
  public static SubscriptionEnrollmentList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionEnrollmentList.class);
  }

 /**
  * Convert an instance of SubscriptionEnrollmentList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

