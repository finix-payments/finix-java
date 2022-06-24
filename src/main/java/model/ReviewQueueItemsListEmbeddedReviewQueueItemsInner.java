/*
 * Finix API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2022-02-01
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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.ReviewQueueItemsListEmbeddedReviewQueueItemsInnerLinks;
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
 * ReviewQueueItemsListEmbeddedReviewQueueItemsInner
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-23T17:56:51.765155-07:00[America/Los_Angeles]")
public class ReviewQueueItemsListEmbeddedReviewQueueItemsInner {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private String application;

  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  private OffsetDateTime completedAt;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  /**
   * Gets or Sets entityType
   */
  @JsonAdapter(EntityTypeEnum.Adapter.class)
  public enum EntityTypeEnum {
    IDENTITY("IDENTITY"),
    
    MERCHANT("MERCHANT"),
    
    SETTLEMENT("SETTLEMENT"),
    
    SETTLEMENT_V2("SETTLEMENT_V2");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EntityTypeEnum fromValue(String value) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EntityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntityTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EntityTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entity_type";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private EntityTypeEnum entityType;

  /**
   * Gets or Sets outcome
   */
  @JsonAdapter(OutcomeEnum.Adapter.class)
  public enum OutcomeEnum {
    PENDING("PENDING"),
    
    REJECTED("REJECTED"),
    
    ACCEPTED("ACCEPTED");

    private String value;

    OutcomeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OutcomeEnum fromValue(String value) {
      for (OutcomeEnum b : OutcomeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OutcomeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OutcomeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OutcomeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OutcomeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OUTCOME = "outcome";
  @SerializedName(SERIALIZED_NAME_OUTCOME)
  private OutcomeEnum outcome;

  /**
   * Gets or Sets processorType
   */
  @JsonAdapter(ProcessorTypeEnum.Adapter.class)
  public enum ProcessorTypeEnum {
    AFFIPAY_V1("AFFIPAY_V1"),
    
    CHECKOUT_V1("CHECKOUT_V1"),
    
    DUMMY_V1("DUMMY_V1"),
    
    ELAVON_V1("ELAVON_V1"),
    
    EXPRESS_V1("EXPRESS_V1"),
    
    FINIX_VISA_SANDBOX_V1("FINIX_VISA_SANDBOX_V1"),
    
    LITLE_V1("LITLE_V1"),
    
    MASTERCARD_V1("MASTERCARD_V1"),
    
    MICROBILT_V1("MICROBILT_V1"),
    
    MYTHICAL_V1("MYTHICAL_V1"),
    
    NMI_V1("NMI_V1"),
    
    SKRILL_V1("SKRILL_V1"),
    
    STRIPE_V1("STRIPE_V1"),
    
    TRIPOS_CLOUD_V1("TRIPOS_CLOUD_V1"),
    
    TRIPOS_MOBILE_V1("TRIPOS_MOBILE_V1"),
    
    TRULIOO_V1("TRULIOO_V1"),
    
    VANTIV_V1("VANTIV_V1"),
    
    VISA_V1("VISA_V1");

    private String value;

    ProcessorTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProcessorTypeEnum fromValue(String value) {
      for (ProcessorTypeEnum b : ProcessorTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProcessorTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProcessorTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProcessorTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProcessorTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROCESSOR_TYPE = "processor_type";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_TYPE)
  private ProcessorTypeEnum processorType;

  /**
   * Gets or Sets reviewType
   */
  @JsonAdapter(ReviewTypeEnum.Adapter.class)
  public enum ReviewTypeEnum {
    CREATED("CREATED"),
    
    COMPLETED("COMPLETED"),
    
    FAILED("FAILED"),
    
    VERIFIED("VERIFIED"),
    
    TRANSFER_LIMIT_EXCEEDED("TRANSFER_LIMIT_EXCEEDED");

    private String value;

    ReviewTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReviewTypeEnum fromValue(String value) {
      for (ReviewTypeEnum b : ReviewTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReviewTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReviewTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReviewTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReviewTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REVIEW_TYPE = "review_type";
  @SerializedName(SERIALIZED_NAME_REVIEW_TYPE)
  private ReviewTypeEnum reviewType;

  public static final String SERIALIZED_NAME_REVIEWED_BY = "reviewed_by";
  @SerializedName(SERIALIZED_NAME_REVIEWED_BY)
  private String reviewedBy;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private ReviewQueueItemsListEmbeddedReviewQueueItemsInnerLinks links;

  public ReviewQueueItemsListEmbeddedReviewQueueItemsInner() { 
  }

  public ReviewQueueItemsListEmbeddedReviewQueueItemsInner tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ReviewQueueItemsListEmbeddedReviewQueueItemsInner putTagsItem(String key, String tagsItem) {
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


  public ReviewQueueItemsListEmbeddedReviewQueueItemsInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ReviewQueueItemsListEmbeddedReviewQueueItemsInner createdAt(OffsetDateTime createdAt) {
    
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


  public ReviewQueueItemsListEmbeddedReviewQueueItemsInner updatedAt(OffsetDateTime updatedAt) {
    
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


  public ReviewQueueItemsListEmbeddedReviewQueueItemsInner application(String application) {
    
    this.application = application;
    return this;
  }

   /**
   * The ID of the resource.
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getApplication() {
    return application;
  }


  public void setApplication(String application) {
    this.application = application;
  }


  public ReviewQueueItemsListEmbeddedReviewQueueItemsInner completedAt(OffsetDateTime completedAt) {
    
    this.completedAt = completedAt;
    return this;
  }

   /**
   * Get completedAt
   * @return completedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }


  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }


  public ReviewQueueItemsListEmbeddedReviewQueueItemsInner entityId(String entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * The ID of the resource.
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getEntityId() {
    return entityId;
  }


  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public ReviewQueueItemsListEmbeddedReviewQueueItemsInner entityType(EntityTypeEnum entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityTypeEnum getEntityType() {
    return entityType;
  }


  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }


  public ReviewQueueItemsListEmbeddedReviewQueueItemsInner outcome(OutcomeEnum outcome) {
    
    this.outcome = outcome;
    return this;
  }

   /**
   * Get outcome
   * @return outcome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OutcomeEnum getOutcome() {
    return outcome;
  }


  public void setOutcome(OutcomeEnum outcome) {
    this.outcome = outcome;
  }


  public ReviewQueueItemsListEmbeddedReviewQueueItemsInner processorType(ProcessorTypeEnum processorType) {
    
    this.processorType = processorType;
    return this;
  }

   /**
   * Get processorType
   * @return processorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProcessorTypeEnum getProcessorType() {
    return processorType;
  }


  public void setProcessorType(ProcessorTypeEnum processorType) {
    this.processorType = processorType;
  }


  public ReviewQueueItemsListEmbeddedReviewQueueItemsInner reviewType(ReviewTypeEnum reviewType) {
    
    this.reviewType = reviewType;
    return this;
  }

   /**
   * Get reviewType
   * @return reviewType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReviewTypeEnum getReviewType() {
    return reviewType;
  }


  public void setReviewType(ReviewTypeEnum reviewType) {
    this.reviewType = reviewType;
  }


  public ReviewQueueItemsListEmbeddedReviewQueueItemsInner reviewedBy(String reviewedBy) {
    
    this.reviewedBy = reviewedBy;
    return this;
  }

   /**
   * Get reviewedBy
   * @return reviewedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReviewedBy() {
    return reviewedBy;
  }


  public void setReviewedBy(String reviewedBy) {
    this.reviewedBy = reviewedBy;
  }


  public ReviewQueueItemsListEmbeddedReviewQueueItemsInner links(ReviewQueueItemsListEmbeddedReviewQueueItemsInnerLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReviewQueueItemsListEmbeddedReviewQueueItemsInnerLinks getLinks() {
    return links;
  }


  public void setLinks(ReviewQueueItemsListEmbeddedReviewQueueItemsInnerLinks links) {
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
    ReviewQueueItemsListEmbeddedReviewQueueItemsInner reviewQueueItemsListEmbeddedReviewQueueItemsInner = (ReviewQueueItemsListEmbeddedReviewQueueItemsInner) o;
    return Objects.equals(this.tags, reviewQueueItemsListEmbeddedReviewQueueItemsInner.tags) &&
        Objects.equals(this.id, reviewQueueItemsListEmbeddedReviewQueueItemsInner.id) &&
        Objects.equals(this.createdAt, reviewQueueItemsListEmbeddedReviewQueueItemsInner.createdAt) &&
        Objects.equals(this.updatedAt, reviewQueueItemsListEmbeddedReviewQueueItemsInner.updatedAt) &&
        Objects.equals(this.application, reviewQueueItemsListEmbeddedReviewQueueItemsInner.application) &&
        Objects.equals(this.completedAt, reviewQueueItemsListEmbeddedReviewQueueItemsInner.completedAt) &&
        Objects.equals(this.entityId, reviewQueueItemsListEmbeddedReviewQueueItemsInner.entityId) &&
        Objects.equals(this.entityType, reviewQueueItemsListEmbeddedReviewQueueItemsInner.entityType) &&
        Objects.equals(this.outcome, reviewQueueItemsListEmbeddedReviewQueueItemsInner.outcome) &&
        Objects.equals(this.processorType, reviewQueueItemsListEmbeddedReviewQueueItemsInner.processorType) &&
        Objects.equals(this.reviewType, reviewQueueItemsListEmbeddedReviewQueueItemsInner.reviewType) &&
        Objects.equals(this.reviewedBy, reviewQueueItemsListEmbeddedReviewQueueItemsInner.reviewedBy) &&
        Objects.equals(this.links, reviewQueueItemsListEmbeddedReviewQueueItemsInner.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, id, createdAt, updatedAt, application, completedAt, entityId, entityType, outcome, processorType, reviewType, reviewedBy, links);
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
    sb.append("class ReviewQueueItemsListEmbeddedReviewQueueItemsInner {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    processorType: ").append(toIndentedString(processorType)).append("\n");
    sb.append("    reviewType: ").append(toIndentedString(reviewType)).append("\n");
    sb.append("    reviewedBy: ").append(toIndentedString(reviewedBy)).append("\n");
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
    openapiFields.add("tags");
    openapiFields.add("id");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("application");
    openapiFields.add("completed_at");
    openapiFields.add("entity_id");
    openapiFields.add("entity_type");
    openapiFields.add("outcome");
    openapiFields.add("processor_type");
    openapiFields.add("review_type");
    openapiFields.add("reviewed_by");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReviewQueueItemsListEmbeddedReviewQueueItemsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ReviewQueueItemsListEmbeddedReviewQueueItemsInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReviewQueueItemsListEmbeddedReviewQueueItemsInner is not found in the empty JSON string", ReviewQueueItemsListEmbeddedReviewQueueItemsInner.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReviewQueueItemsListEmbeddedReviewQueueItemsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReviewQueueItemsListEmbeddedReviewQueueItemsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("application") != null && !jsonObj.get("application").isJsonNull()  && !jsonObj.get("application").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("entity_id") != null && !jsonObj.get("entity_id").isJsonNull()  && !jsonObj.get("entity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_id").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("entity_type") != null && !jsonObj.get("entity_type").isJsonNull()  && !jsonObj.get("entity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_type").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("outcome") != null && !jsonObj.get("outcome").isJsonNull()  && !jsonObj.get("outcome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outcome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outcome").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("processor_type") != null && !jsonObj.get("processor_type").isJsonNull()  && !jsonObj.get("processor_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processor_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processor_type").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("review_type") != null && !jsonObj.get("review_type").isJsonNull()  && !jsonObj.get("review_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `review_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("review_type").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("reviewed_by") != null && !jsonObj.get("reviewed_by").isJsonNull()  && !jsonObj.get("reviewed_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reviewed_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reviewed_by").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `_links`
     // if (jsonObj.getAsJsonObject("_links") != null) {
       //ReviewQueueItemsListEmbeddedReviewQueueItemsInnerLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReviewQueueItemsListEmbeddedReviewQueueItemsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReviewQueueItemsListEmbeddedReviewQueueItemsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReviewQueueItemsListEmbeddedReviewQueueItemsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReviewQueueItemsListEmbeddedReviewQueueItemsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReviewQueueItemsListEmbeddedReviewQueueItemsInner>() {
           @Override
           public void write(JsonWriter out, ReviewQueueItemsListEmbeddedReviewQueueItemsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReviewQueueItemsListEmbeddedReviewQueueItemsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReviewQueueItemsListEmbeddedReviewQueueItemsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReviewQueueItemsListEmbeddedReviewQueueItemsInner
  * @throws IOException if the JSON string is invalid with respect to ReviewQueueItemsListEmbeddedReviewQueueItemsInner
  */
  public static ReviewQueueItemsListEmbeddedReviewQueueItemsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReviewQueueItemsListEmbeddedReviewQueueItemsInner.class);
  }

 /**
  * Convert an instance of ReviewQueueItemsListEmbeddedReviewQueueItemsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

