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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.CreateOnboardingFormRequestMerchantProcessorsInner;
import model.OnboardingFormOnboardingData;
import model.OnboardingFormOnboardingLink;

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
 * OnboardingForm
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OnboardingForm {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ONBOARDING_DATA = "onboarding_data";
  @SerializedName(SERIALIZED_NAME_ONBOARDING_DATA)
  private OnboardingFormOnboardingData onboardingData;

  public static final String SERIALIZED_NAME_MERCHANT_PROCESSORS = "merchant_processors";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PROCESSORS)
  private List<CreateOnboardingFormRequestMerchantProcessorsInner> merchantProcessors = null;

  public static final String SERIALIZED_NAME_ONBOARDING_LINK = "onboarding_link";
  @SerializedName(SERIALIZED_NAME_ONBOARDING_LINK)
  private OnboardingFormOnboardingLink onboardingLink;

  /**
   * Status of the &#x60;onboarding_from&#x60;.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    IN_PROGRESS("IN_PROGRESS"),
    
    COMPLETED("COMPLETED"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    StatusEnum(String value) {
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

    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        StatusEnum unknownDefault = StatusEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public OnboardingForm() { 
  }

  public OnboardingForm id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the &#x60;onboarding_form&#x60; resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the `onboarding_form` resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public OnboardingForm onboardingData(OnboardingFormOnboardingData onboardingData) {
    
    this.onboardingData = onboardingData;
    return this;
  }

   /**
   * Get onboardingData
   * @return onboardingData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OnboardingFormOnboardingData getOnboardingData() {
    return onboardingData;
  }


  public void setOnboardingData(OnboardingFormOnboardingData onboardingData) {
    this.onboardingData = onboardingData;
  }


  public OnboardingForm merchantProcessors(List<CreateOnboardingFormRequestMerchantProcessorsInner> merchantProcessors) {
    
    this.merchantProcessors = merchantProcessors;
    return this;
  }

  public OnboardingForm addMerchantProcessorsItem(CreateOnboardingFormRequestMerchantProcessorsInner merchantProcessorsItem) {
    if (this.merchantProcessors == null) {
      this.merchantProcessors = new ArrayList<>();
    }
    this.merchantProcessors.add(merchantProcessorsItem);
    return this;
  }

   /**
   * An array of objects with the processors and gateways users will be onboarded to.
   * @return merchantProcessors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of objects with the processors and gateways users will be onboarded to.")

  public List<CreateOnboardingFormRequestMerchantProcessorsInner> getMerchantProcessors() {
    return merchantProcessors;
  }


  public void setMerchantProcessors(List<CreateOnboardingFormRequestMerchantProcessorsInner> merchantProcessors) {
    this.merchantProcessors = merchantProcessors;
  }


  public OnboardingForm onboardingLink(OnboardingFormOnboardingLink onboardingLink) {
    
    this.onboardingLink = onboardingLink;
    return this;
  }

   /**
   * Get onboardingLink
   * @return onboardingLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OnboardingFormOnboardingLink getOnboardingLink() {
    return onboardingLink;
  }


  public void setOnboardingLink(OnboardingFormOnboardingLink onboardingLink) {
    this.onboardingLink = onboardingLink;
  }


  public OnboardingForm status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the &#x60;onboarding_from&#x60;.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of the `onboarding_from`.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public OnboardingForm createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when the object was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of when the object was created.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public OnboardingForm updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp of when the object was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of when the object was last updated.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public OnboardingForm tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public OnboardingForm putTagsItem(String key, String tagsItem) {
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
    OnboardingForm onboardingForm = (OnboardingForm) o;
    return Objects.equals(this.id, onboardingForm.id) &&
        Objects.equals(this.onboardingData, onboardingForm.onboardingData) &&
        Objects.equals(this.merchantProcessors, onboardingForm.merchantProcessors) &&
        Objects.equals(this.onboardingLink, onboardingForm.onboardingLink) &&
        Objects.equals(this.status, onboardingForm.status) &&
        Objects.equals(this.createdAt, onboardingForm.createdAt) &&
        Objects.equals(this.updatedAt, onboardingForm.updatedAt) &&
        Objects.equals(this.tags, onboardingForm.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, onboardingData, merchantProcessors, onboardingLink, status, createdAt, updatedAt, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnboardingForm {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    onboardingData: ").append(toIndentedString(onboardingData)).append("\n");
    sb.append("    merchantProcessors: ").append(toIndentedString(merchantProcessors)).append("\n");
    sb.append("    onboardingLink: ").append(toIndentedString(onboardingLink)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("onboarding_data");
    openapiFields.add("merchant_processors");
    openapiFields.add("onboarding_link");
    openapiFields.add("status");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OnboardingForm
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OnboardingForm.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnboardingForm is not found in the empty JSON string", OnboardingForm.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OnboardingForm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OnboardingForm` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()  && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `onboarding_data`
     // if (jsonObj.getAsJsonObject("onboarding_data") != null) {
       //OnboardingFormOnboardingData.validateJsonObject(jsonObj.getAsJsonObject("onboarding_data"));
     // }

      JsonArray jsonArraymerchantProcessors = jsonObj.getAsJsonArray("merchant_processors");
      if (jsonArraymerchantProcessors != null) {
        // ensure the json data is an array
        if (!jsonObj.get("merchant_processors").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `merchant_processors` to be an array in the JSON string but got `%s`", jsonObj.get("merchant_processors").toString()));
        }

        // validate the optional field `merchant_processors` (array)
        for (int i = 0; i < jsonArraymerchantProcessors.size(); i++) {
          CreateOnboardingFormRequestMerchantProcessorsInner.validateJsonObject(jsonArraymerchantProcessors.get(i).getAsJsonObject());
        }
          ;
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `onboarding_link`
     // if (jsonObj.getAsJsonObject("onboarding_link") != null) {
       //OnboardingFormOnboardingLink.validateJsonObject(jsonObj.getAsJsonObject("onboarding_link"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()  && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnboardingForm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnboardingForm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnboardingForm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnboardingForm.class));

       return (TypeAdapter<T>) new TypeAdapter<OnboardingForm>() {
           @Override
           public void write(JsonWriter out, OnboardingForm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OnboardingForm read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OnboardingForm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OnboardingForm
  * @throws IOException if the JSON string is invalid with respect to OnboardingForm
  */
  public static OnboardingForm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnboardingForm.class);
  }

 /**
  * Convert an instance of OnboardingForm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

