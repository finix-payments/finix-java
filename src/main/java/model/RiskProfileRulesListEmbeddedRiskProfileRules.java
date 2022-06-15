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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.RiskProfileRulesListEmbeddedLinks;
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
 * RiskProfileRulesListEmbeddedRiskProfileRules
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-14T15:32:10.087418-05:00[America/Chicago]")
public class RiskProfileRulesListEmbeddedRiskProfileRules {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entity_type";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private String entityType;

  public static final String SERIALIZED_NAME_RATIO = "ratio";
  @SerializedName(SERIALIZED_NAME_RATIO)
  private Integer ratio;

  public static final String SERIALIZED_NAME_RISK_PROFILE = "risk_profile";
  @SerializedName(SERIALIZED_NAME_RISK_PROFILE)
  private String riskProfile;

  public static final String SERIALIZED_NAME_TRAILING = "trailing";
  @SerializedName(SERIALIZED_NAME_TRAILING)
  private Integer trailing;

  public static final String SERIALIZED_NAME_TRAILING_UNIT = "trailing_unit";
  @SerializedName(SERIALIZED_NAME_TRAILING_UNIT)
  private String trailingUnit;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private RiskProfileRulesListEmbeddedLinks links;

  public RiskProfileRulesListEmbeddedRiskProfileRules() { 
  }

  public RiskProfileRulesListEmbeddedRiskProfileRules tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public RiskProfileRulesListEmbeddedRiskProfileRules putTagsItem(String key, String tagsItem) {
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


  public RiskProfileRulesListEmbeddedRiskProfileRules type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public RiskProfileRulesListEmbeddedRiskProfileRules id(String id) {
    
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


  public RiskProfileRulesListEmbeddedRiskProfileRules createdAt(OffsetDateTime createdAt) {
    
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


  public RiskProfileRulesListEmbeddedRiskProfileRules updatedAt(OffsetDateTime updatedAt) {
    
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


  public RiskProfileRulesListEmbeddedRiskProfileRules action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public RiskProfileRulesListEmbeddedRiskProfileRules amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public RiskProfileRulesListEmbeddedRiskProfileRules count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public RiskProfileRulesListEmbeddedRiskProfileRules enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public RiskProfileRulesListEmbeddedRiskProfileRules entityType(String entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEntityType() {
    return entityType;
  }


  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public RiskProfileRulesListEmbeddedRiskProfileRules ratio(Integer ratio) {
    
    this.ratio = ratio;
    return this;
  }

   /**
   * Get ratio
   * @return ratio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRatio() {
    return ratio;
  }


  public void setRatio(Integer ratio) {
    this.ratio = ratio;
  }


  public RiskProfileRulesListEmbeddedRiskProfileRules riskProfile(String riskProfile) {
    
    this.riskProfile = riskProfile;
    return this;
  }

   /**
   * The ID of the resource.
   * @return riskProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getRiskProfile() {
    return riskProfile;
  }


  public void setRiskProfile(String riskProfile) {
    this.riskProfile = riskProfile;
  }


  public RiskProfileRulesListEmbeddedRiskProfileRules trailing(Integer trailing) {
    
    this.trailing = trailing;
    return this;
  }

   /**
   * Get trailing
   * @return trailing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTrailing() {
    return trailing;
  }


  public void setTrailing(Integer trailing) {
    this.trailing = trailing;
  }


  public RiskProfileRulesListEmbeddedRiskProfileRules trailingUnit(String trailingUnit) {
    
    this.trailingUnit = trailingUnit;
    return this;
  }

   /**
   * Get trailingUnit
   * @return trailingUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTrailingUnit() {
    return trailingUnit;
  }


  public void setTrailingUnit(String trailingUnit) {
    this.trailingUnit = trailingUnit;
  }


  public RiskProfileRulesListEmbeddedRiskProfileRules links(RiskProfileRulesListEmbeddedLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RiskProfileRulesListEmbeddedLinks getLinks() {
    return links;
  }


  public void setLinks(RiskProfileRulesListEmbeddedLinks links) {
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
    RiskProfileRulesListEmbeddedRiskProfileRules riskProfileRulesListEmbeddedRiskProfileRules = (RiskProfileRulesListEmbeddedRiskProfileRules) o;
    return Objects.equals(this.tags, riskProfileRulesListEmbeddedRiskProfileRules.tags) &&
        Objects.equals(this.type, riskProfileRulesListEmbeddedRiskProfileRules.type) &&
        Objects.equals(this.id, riskProfileRulesListEmbeddedRiskProfileRules.id) &&
        Objects.equals(this.createdAt, riskProfileRulesListEmbeddedRiskProfileRules.createdAt) &&
        Objects.equals(this.updatedAt, riskProfileRulesListEmbeddedRiskProfileRules.updatedAt) &&
        Objects.equals(this.action, riskProfileRulesListEmbeddedRiskProfileRules.action) &&
        Objects.equals(this.amount, riskProfileRulesListEmbeddedRiskProfileRules.amount) &&
        Objects.equals(this.count, riskProfileRulesListEmbeddedRiskProfileRules.count) &&
        Objects.equals(this.enabled, riskProfileRulesListEmbeddedRiskProfileRules.enabled) &&
        Objects.equals(this.entityType, riskProfileRulesListEmbeddedRiskProfileRules.entityType) &&
        Objects.equals(this.ratio, riskProfileRulesListEmbeddedRiskProfileRules.ratio) &&
        Objects.equals(this.riskProfile, riskProfileRulesListEmbeddedRiskProfileRules.riskProfile) &&
        Objects.equals(this.trailing, riskProfileRulesListEmbeddedRiskProfileRules.trailing) &&
        Objects.equals(this.trailingUnit, riskProfileRulesListEmbeddedRiskProfileRules.trailingUnit) &&
        Objects.equals(this.links, riskProfileRulesListEmbeddedRiskProfileRules.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, type, id, createdAt, updatedAt, action, amount, count, enabled, entityType, ratio, riskProfile, trailing, trailingUnit, links);
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
    sb.append("class RiskProfileRulesListEmbeddedRiskProfileRules {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    riskProfile: ").append(toIndentedString(riskProfile)).append("\n");
    sb.append("    trailing: ").append(toIndentedString(trailing)).append("\n");
    sb.append("    trailingUnit: ").append(toIndentedString(trailingUnit)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("id");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("action");
    openapiFields.add("amount");
    openapiFields.add("count");
    openapiFields.add("enabled");
    openapiFields.add("entity_type");
    openapiFields.add("ratio");
    openapiFields.add("risk_profile");
    openapiFields.add("trailing");
    openapiFields.add("trailing_unit");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RiskProfileRulesListEmbeddedRiskProfileRules
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RiskProfileRulesListEmbeddedRiskProfileRules.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RiskProfileRulesListEmbeddedRiskProfileRules is not found in the empty JSON string", RiskProfileRulesListEmbeddedRiskProfileRules.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RiskProfileRulesListEmbeddedRiskProfileRules.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RiskProfileRulesListEmbeddedRiskProfileRules` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()  && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()  && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()  && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if (jsonObj.get("entity_type") != null && !jsonObj.get("entity_type").isJsonNull()  && !jsonObj.get("entity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_type").toString()));
      }
      if (jsonObj.get("risk_profile") != null && !jsonObj.get("risk_profile").isJsonNull()  && !jsonObj.get("risk_profile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `risk_profile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("risk_profile").toString()));
      }
      if (jsonObj.get("trailing_unit") != null && !jsonObj.get("trailing_unit").isJsonNull()  && !jsonObj.get("trailing_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trailing_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trailing_unit").toString()));
      }
      // validate the optional field `_links`
     // if (jsonObj.getAsJsonObject("_links") != null) {
       //RiskProfileRulesListEmbeddedLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
     // }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RiskProfileRulesListEmbeddedRiskProfileRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RiskProfileRulesListEmbeddedRiskProfileRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RiskProfileRulesListEmbeddedRiskProfileRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RiskProfileRulesListEmbeddedRiskProfileRules.class));

       return (TypeAdapter<T>) new TypeAdapter<RiskProfileRulesListEmbeddedRiskProfileRules>() {
           @Override
           public void write(JsonWriter out, RiskProfileRulesListEmbeddedRiskProfileRules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RiskProfileRulesListEmbeddedRiskProfileRules read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RiskProfileRulesListEmbeddedRiskProfileRules given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RiskProfileRulesListEmbeddedRiskProfileRules
  * @throws IOException if the JSON string is invalid with respect to RiskProfileRulesListEmbeddedRiskProfileRules
  */
  public static RiskProfileRulesListEmbeddedRiskProfileRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RiskProfileRulesListEmbeddedRiskProfileRules.class);
  }

 /**
  * Convert an instance of RiskProfileRulesListEmbeddedRiskProfileRules to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

