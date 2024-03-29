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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * CreateFileRequest
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateFileRequest {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_LINKED_TO = "linked_to";
  @SerializedName(SERIALIZED_NAME_LINKED_TO)
  private String linkedTo;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  /**
   * The type of document. | Available values include: &lt;br&gt;Identity Verification&lt;ul&gt;&lt;li&gt; **DRIVERS\\_LICENSE\\_FRONT**&lt;li&gt;**DRIVERS\\_LICENSE\\_BACK**&lt;li&gt;**IDENTIFICATION\\_CARD\\_FRONT**&lt;li&gt;**IDENTIFICATION\\_CARD\\_BACK**&lt;/ul&gt;Bank account validation&lt;ul&gt;&lt;li&gt;**BANK\\_STATEMENT**&lt;/ul&gt;Business Verification&lt;ul&gt;&lt;li&gt;**TAX\\_DOCUMENT**&lt;li&gt;**BUSINESS\\_REGISTRATION**&lt;li&gt;**BUSINESS\\_ADDRESS\\_VERIFICATION**&lt;/ul&gt;Additional&lt;ul&gt;&lt;li&gt;**OTHER**&lt;li&gt;**PCI\\_DOCUMENT**&lt;li&gt;**PASSPORT**&lt;ul&gt;
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DRIVERS_LICENSE_FRONT("DRIVERS_LICENSE_FRONT"),
    
    DRIVERS_LICENSE_BACK("DRIVERS_LICENSE_BACK"),
    
    IDENTIFICATION_CARD_FRONT("IDENTIFICATION_CARD_FRONT"),
    
    IDENTIFICATION_CARD_BACK("IDENTIFICATION_CARD_BACK"),
    
    BANK_STATEMENT("BANK_STATEMENT"),
    
    TAX_DOCUMENT("TAX_DOCUMENT"),
    
    BUSINESS_REGISTRATION("BUSINESS_REGISTRATION"),
    
    BUSINESS_ADDRESS_VERIFICATION("BUSINESS_ADDRESS_VERIFICATION"),
    
    OTHER("OTHER"),
    
    PCI_DOCUMENT("PCI_DOCUMENT"),
    
    PASSPORT("PASSPORT"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    /*
    * EDITED
    * Add ability get the raw underlying value of a enum the library is not aware about.
    */
    private String rawValue;

    public void setRawValue(String s){
    this.rawValue = s;
    }

    public String getRawValue() {
    return rawValue;
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        TypeEnum unknownDefault = TypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public CreateFileRequest() { 
  }

  public CreateFileRequest displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of the &#x60;File&#x60; you&#39;ll create.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the `File` you'll create.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public CreateFileRequest linkedTo(String linkedTo) {
    
    this.linkedTo = linkedTo;
    return this;
  }

   /**
   * The resource ID that you want linked to the &#x60;File&#x60; (e.g. Merchant ID).
   * @return linkedTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The resource ID that you want linked to the `File` (e.g. Merchant ID).")

  public String getLinkedTo() {
    return linkedTo;
  }


  public void setLinkedTo(String linkedTo) {
    this.linkedTo = linkedTo;
  }


  public CreateFileRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateFileRequest putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Key value pair for annotating custom meta data (e.g. order numbers).
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Key value pair for annotating custom meta data (e.g. order numbers).")

  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  public CreateFileRequest type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of document. | Available values include: &lt;br&gt;Identity Verification&lt;ul&gt;&lt;li&gt; **DRIVERS\\_LICENSE\\_FRONT**&lt;li&gt;**DRIVERS\\_LICENSE\\_BACK**&lt;li&gt;**IDENTIFICATION\\_CARD\\_FRONT**&lt;li&gt;**IDENTIFICATION\\_CARD\\_BACK**&lt;/ul&gt;Bank account validation&lt;ul&gt;&lt;li&gt;**BANK\\_STATEMENT**&lt;/ul&gt;Business Verification&lt;ul&gt;&lt;li&gt;**TAX\\_DOCUMENT**&lt;li&gt;**BUSINESS\\_REGISTRATION**&lt;li&gt;**BUSINESS\\_ADDRESS\\_VERIFICATION**&lt;/ul&gt;Additional&lt;ul&gt;&lt;li&gt;**OTHER**&lt;li&gt;**PCI\\_DOCUMENT**&lt;li&gt;**PASSPORT**&lt;ul&gt;
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of document. | Available values include: <br>Identity Verification<ul><li> **DRIVERS\\_LICENSE\\_FRONT**<li>**DRIVERS\\_LICENSE\\_BACK**<li>**IDENTIFICATION\\_CARD\\_FRONT**<li>**IDENTIFICATION\\_CARD\\_BACK**</ul>Bank account validation<ul><li>**BANK\\_STATEMENT**</ul>Business Verification<ul><li>**TAX\\_DOCUMENT**<li>**BUSINESS\\_REGISTRATION**<li>**BUSINESS\\_ADDRESS\\_VERIFICATION**</ul>Additional<ul><li>**OTHER**<li>**PCI\\_DOCUMENT**<li>**PASSPORT**<ul>")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFileRequest createFileRequest = (CreateFileRequest) o;
    return Objects.equals(this.displayName, createFileRequest.displayName) &&
        Objects.equals(this.linkedTo, createFileRequest.linkedTo) &&
        Objects.equals(this.tags, createFileRequest.tags) &&
        Objects.equals(this.type, createFileRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, linkedTo, tags, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFileRequest {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    linkedTo: ").append(toIndentedString(linkedTo)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("display_name");
    openapiFields.add("linked_to");
    openapiFields.add("tags");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateFileRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateFileRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateFileRequest is not found in the empty JSON string", CreateFileRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateFileRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateFileRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonNull()  && !jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("linked_to") != null && !jsonObj.get("linked_to").isJsonNull()  && !jsonObj.get("linked_to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linked_to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linked_to").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()  && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateFileRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateFileRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateFileRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateFileRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateFileRequest>() {
           @Override
           public void write(JsonWriter out, CreateFileRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateFileRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateFileRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateFileRequest
  * @throws IOException if the JSON string is invalid with respect to CreateFileRequest
  */
  public static CreateFileRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateFileRequest.class);
  }

 /**
  * Convert an instance of CreateFileRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

