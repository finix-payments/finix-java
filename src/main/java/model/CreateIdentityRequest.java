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
import model.CreateIdentityRequestAdditionalUnderwritingData;
import model.CreateIdentityRequestEntity;
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
 * 
 */
@ApiModel(description = "")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateIdentityRequest {
  public static final String SERIALIZED_NAME_ADDITIONAL_UNDERWRITING_DATA = "additional_underwriting_data";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_UNDERWRITING_DATA)
  private CreateIdentityRequestAdditionalUnderwritingData additionalUnderwritingData;

  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private CreateIdentityRequestEntity entity;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public CreateIdentityRequest() { 
  }

  public CreateIdentityRequest additionalUnderwritingData(CreateIdentityRequestAdditionalUnderwritingData additionalUnderwritingData) {
    
    this.additionalUnderwritingData = additionalUnderwritingData;
    return this;
  }

   /**
   * Get additionalUnderwritingData
   * @return additionalUnderwritingData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateIdentityRequestAdditionalUnderwritingData getAdditionalUnderwritingData() {
    return additionalUnderwritingData;
  }


  public void setAdditionalUnderwritingData(CreateIdentityRequestAdditionalUnderwritingData additionalUnderwritingData) {
    this.additionalUnderwritingData = additionalUnderwritingData;
  }


  public CreateIdentityRequest entity(CreateIdentityRequestEntity entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateIdentityRequestEntity getEntity() {
    return entity;
  }


  public void setEntity(CreateIdentityRequestEntity entity) {
    this.entity = entity;
  }


  public CreateIdentityRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateIdentityRequest putTagsItem(String key, String tagsItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateIdentityRequest createIdentityRequest = (CreateIdentityRequest) o;
    return Objects.equals(this.additionalUnderwritingData, createIdentityRequest.additionalUnderwritingData) &&
        Objects.equals(this.entity, createIdentityRequest.entity) &&
        Objects.equals(this.tags, createIdentityRequest.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalUnderwritingData, entity, tags);
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
    sb.append("class CreateIdentityRequest {\n");
    sb.append("    additionalUnderwritingData: ").append(toIndentedString(additionalUnderwritingData)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("additional_underwriting_data");
    openapiFields.add("entity");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateIdentityRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateIdentityRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateIdentityRequest is not found in the empty JSON string", CreateIdentityRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateIdentityRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateIdentityRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `additional_underwriting_data`
     // if (jsonObj.getAsJsonObject("additional_underwriting_data") != null) {
       //CreateIdentityRequestAdditionalUnderwritingData.validateJsonObject(jsonObj.getAsJsonObject("additional_underwriting_data"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `entity`
     // if (jsonObj.getAsJsonObject("entity") != null) {
       //CreateIdentityRequestEntity.validateJsonObject(jsonObj.getAsJsonObject("entity"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateIdentityRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateIdentityRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateIdentityRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateIdentityRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateIdentityRequest>() {
           @Override
           public void write(JsonWriter out, CreateIdentityRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateIdentityRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateIdentityRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateIdentityRequest
  * @throws IOException if the JSON string is invalid with respect to CreateIdentityRequest
  */
  public static CreateIdentityRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateIdentityRequest.class);
  }

 /**
  * Convert an instance of CreateIdentityRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

