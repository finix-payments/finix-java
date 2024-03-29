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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.ApplicationLinks;
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
public class Application {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CARD_CVV_REQUIRED = "card_cvv_required";
  @SerializedName(SERIALIZED_NAME_CARD_CVV_REQUIRED)
  private Boolean cardCvvRequired;

  public static final String SERIALIZED_NAME_CARD_EXPIRATION_DATE_REQUIRED = "card_expiration_date_required";
  @SerializedName(SERIALIZED_NAME_CARD_EXPIRATION_DATE_REQUIRED)
  private Boolean cardExpirationDateRequired;

  public static final String SERIALIZED_NAME_CREATING_TRANSFER_FROM_REPORT_ENABLED = "creating_transfer_from_report_enabled";
  @SerializedName(SERIALIZED_NAME_CREATING_TRANSFER_FROM_REPORT_ENABLED)
  private Boolean creatingTransferFromReportEnabled;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  /**
   * Details when the &#x60;fees&#x60; of &#x60;Authroizations&#x60; submitted under the &#x60;Application&#x60; will be ready to settle.
   */
  @JsonAdapter(FeeReadyToSettleUponEnum.Adapter.class)
  public enum FeeReadyToSettleUponEnum {
    RECONCILIATION("RECONCILIATION"),
    
    SUCCESSFUL_CAPTURE("SUCCESSFUL_CAPTURE"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    FeeReadyToSettleUponEnum(String value) {
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

    public static FeeReadyToSettleUponEnum fromValue(String value) {
        for (FeeReadyToSettleUponEnum b : FeeReadyToSettleUponEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        if (value.equals(null) && value.length() == 0) {
            return null;
        }
        FeeReadyToSettleUponEnum unknownDefault = FeeReadyToSettleUponEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<FeeReadyToSettleUponEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeeReadyToSettleUponEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeeReadyToSettleUponEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FeeReadyToSettleUponEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FEE_READY_TO_SETTLE_UPON = "fee_ready_to_settle_upon";
  @SerializedName(SERIALIZED_NAME_FEE_READY_TO_SETTLE_UPON)
  private FeeReadyToSettleUponEnum feeReadyToSettleUpon;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_PROCESSING_ENABLED = "processing_enabled";
  @SerializedName(SERIALIZED_NAME_PROCESSING_ENABLED)
  private Boolean processingEnabled;

  /**
   * Details when &#x60;Authroizations&#x60; submitted under the &#x60;Application&#x60; will be ready to settle.
   */
  @JsonAdapter(ReadyToSettleUponEnum.Adapter.class)
  public enum ReadyToSettleUponEnum {
    RECONCILIATION("RECONCILIATION"),
    
    SUCCESSFUL_CAPTURE("SUCCESSFUL_CAPTURE"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    ReadyToSettleUponEnum(String value) {
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

    public static ReadyToSettleUponEnum fromValue(String value) {
        for (ReadyToSettleUponEnum b : ReadyToSettleUponEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        if (value.equals(null) && value.length() == 0) {
            return null;
        }
        ReadyToSettleUponEnum unknownDefault = ReadyToSettleUponEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<ReadyToSettleUponEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReadyToSettleUponEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReadyToSettleUponEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReadyToSettleUponEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_READY_TO_SETTLE_UPON = "ready_to_settle_upon";
  @SerializedName(SERIALIZED_NAME_READY_TO_SETTLE_UPON)
  private ReadyToSettleUponEnum readyToSettleUpon;

  public static final String SERIALIZED_NAME_SETTLEMENT_ENABLED = "settlement_enabled";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_ENABLED)
  private Boolean settlementEnabled;

  /**
   * Gets or Sets settlementFundingIdentifier
   */
  @JsonAdapter(SettlementFundingIdentifierEnum.Adapter.class)
  public enum SettlementFundingIdentifierEnum {
    UNSET("UNSET"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    SettlementFundingIdentifierEnum(String value) {
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

    public static SettlementFundingIdentifierEnum fromValue(String value) {
        for (SettlementFundingIdentifierEnum b : SettlementFundingIdentifierEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        if (value.equals(null) && value.length() == 0) {
            return null;
        }
        SettlementFundingIdentifierEnum unknownDefault = SettlementFundingIdentifierEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<SettlementFundingIdentifierEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SettlementFundingIdentifierEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SettlementFundingIdentifierEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SettlementFundingIdentifierEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SETTLEMENT_FUNDING_IDENTIFIER = "settlement_funding_identifier";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_FUNDING_IDENTIFIER)
  private SettlementFundingIdentifierEnum settlementFundingIdentifier;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private ApplicationLinks links;

  public Application() { 
  }

  public Application id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the &#x60;Application&#x60; resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "APxxxxxxxxxxxxxxxxxx", value = "ID of the `Application` resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Application createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Point in time when this object was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Point in time when this object was created.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Application updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Point in time when this object was most recently updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Point in time when this object was most recently updated.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Application cardCvvRequired(Boolean cardCvvRequired) {
    
    this.cardCvvRequired = cardCvvRequired;
    return this;
  }

   /**
   * Details if the &#x60;Application&#x60; requires CVV code.
   * @return cardCvvRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if the `Application` requires CVV code.")

  public Boolean getCardCvvRequired() {
    return cardCvvRequired;
  }


  public void setCardCvvRequired(Boolean cardCvvRequired) {
    this.cardCvvRequired = cardCvvRequired;
  }


  public Application cardExpirationDateRequired(Boolean cardExpirationDateRequired) {
    
    this.cardExpirationDateRequired = cardExpirationDateRequired;
    return this;
  }

   /**
   * Details if the &#x60;Application&#x60; requires the card&#39;s expiration date.
   * @return cardExpirationDateRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if the `Application` requires the card's expiration date.")

  public Boolean getCardExpirationDateRequired() {
    return cardExpirationDateRequired;
  }


  public void setCardExpirationDateRequired(Boolean cardExpirationDateRequired) {
    this.cardExpirationDateRequired = cardExpirationDateRequired;
  }


  public Application creatingTransferFromReportEnabled(Boolean creatingTransferFromReportEnabled) {
    
    this.creatingTransferFromReportEnabled = creatingTransferFromReportEnabled;
    return this;
  }

   /**
   * Details if the &#x60;Application&#x60; is automatically set to create &#x60;Transfers&#x60; once settlement reports get generated.
   * @return creatingTransferFromReportEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if the `Application` is automatically set to create `Transfers` once settlement reports get generated.")

  public Boolean getCreatingTransferFromReportEnabled() {
    return creatingTransferFromReportEnabled;
  }


  public void setCreatingTransferFromReportEnabled(Boolean creatingTransferFromReportEnabled) {
    this.creatingTransferFromReportEnabled = creatingTransferFromReportEnabled;
  }


  public Application enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Details if the &#x60;Application&#x60; is enabled and active. Set to **false** to disable the &#x60;Application&#x60;.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if the `Application` is enabled and active. Set to **false** to disable the `Application`.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public Application feeReadyToSettleUpon(FeeReadyToSettleUponEnum feeReadyToSettleUpon) {
    
    this.feeReadyToSettleUpon = feeReadyToSettleUpon;
    return this;
  }

   /**
   * Details when the &#x60;fees&#x60; of &#x60;Authroizations&#x60; submitted under the &#x60;Application&#x60; will be ready to settle.
   * @return feeReadyToSettleUpon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details when the `fees` of `Authroizations` submitted under the `Application` will be ready to settle.")

  public FeeReadyToSettleUponEnum getFeeReadyToSettleUpon() {
    return feeReadyToSettleUpon;
  }


  public void setFeeReadyToSettleUpon(FeeReadyToSettleUponEnum feeReadyToSettleUpon) {
    this.feeReadyToSettleUpon = feeReadyToSettleUpon;
  }


  public Application name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the &#x60;Application&#x60;.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the `Application`.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Application owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * ID of the &#x60;Identity&#x60; resource that created the &#x60;Application&#x60;.
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IDxxxxxxxxxxxxxxxxxx", value = "ID of the `Identity` resource that created the `Application`.")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public Application processingEnabled(Boolean processingEnabled) {
    
    this.processingEnabled = processingEnabled;
    return this;
  }

   /**
   * Details if transaction processing is enabled for the &#x60;Application&#x60;. 
   * @return processingEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if transaction processing is enabled for the `Application`. ")

  public Boolean getProcessingEnabled() {
    return processingEnabled;
  }


  public void setProcessingEnabled(Boolean processingEnabled) {
    this.processingEnabled = processingEnabled;
  }


  public Application readyToSettleUpon(ReadyToSettleUponEnum readyToSettleUpon) {
    
    this.readyToSettleUpon = readyToSettleUpon;
    return this;
  }

   /**
   * Details when &#x60;Authroizations&#x60; submitted under the &#x60;Application&#x60; will be ready to settle.
   * @return readyToSettleUpon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details when `Authroizations` submitted under the `Application` will be ready to settle.")

  public ReadyToSettleUponEnum getReadyToSettleUpon() {
    return readyToSettleUpon;
  }


  public void setReadyToSettleUpon(ReadyToSettleUponEnum readyToSettleUpon) {
    this.readyToSettleUpon = readyToSettleUpon;
  }


  public Application settlementEnabled(Boolean settlementEnabled) {
    
    this.settlementEnabled = settlementEnabled;
    return this;
  }

   /**
   * Details if settlement processing is enabled for the &#x60;Application&#x60;. 
   * @return settlementEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if settlement processing is enabled for the `Application`. ")

  public Boolean getSettlementEnabled() {
    return settlementEnabled;
  }


  public void setSettlementEnabled(Boolean settlementEnabled) {
    this.settlementEnabled = settlementEnabled;
  }


  public Application settlementFundingIdentifier(SettlementFundingIdentifierEnum settlementFundingIdentifier) {
    
    this.settlementFundingIdentifier = settlementFundingIdentifier;
    return this;
  }

   /**
   * Get settlementFundingIdentifier
   * @return settlementFundingIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SettlementFundingIdentifierEnum getSettlementFundingIdentifier() {
    return settlementFundingIdentifier;
  }


  public void setSettlementFundingIdentifier(SettlementFundingIdentifierEnum settlementFundingIdentifier) {
    this.settlementFundingIdentifier = settlementFundingIdentifier;
  }


  public Application tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Application putTagsItem(String key, String tagsItem) {
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


  public Application links(ApplicationLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinks getLinks() {
    return links;
  }


  public void setLinks(ApplicationLinks links) {
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
    Application application = (Application) o;
    return Objects.equals(this.id, application.id) &&
        Objects.equals(this.createdAt, application.createdAt) &&
        Objects.equals(this.updatedAt, application.updatedAt) &&
        Objects.equals(this.cardCvvRequired, application.cardCvvRequired) &&
        Objects.equals(this.cardExpirationDateRequired, application.cardExpirationDateRequired) &&
        Objects.equals(this.creatingTransferFromReportEnabled, application.creatingTransferFromReportEnabled) &&
        Objects.equals(this.enabled, application.enabled) &&
        Objects.equals(this.feeReadyToSettleUpon, application.feeReadyToSettleUpon) &&
        Objects.equals(this.name, application.name) &&
        Objects.equals(this.owner, application.owner) &&
        Objects.equals(this.processingEnabled, application.processingEnabled) &&
        Objects.equals(this.readyToSettleUpon, application.readyToSettleUpon) &&
        Objects.equals(this.settlementEnabled, application.settlementEnabled) &&
        Objects.equals(this.settlementFundingIdentifier, application.settlementFundingIdentifier) &&
        Objects.equals(this.tags, application.tags) &&
        Objects.equals(this.links, application.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, cardCvvRequired, cardExpirationDateRequired, creatingTransferFromReportEnabled, enabled, feeReadyToSettleUpon, name, owner, processingEnabled, readyToSettleUpon, settlementEnabled, settlementFundingIdentifier, tags, links);
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
    sb.append("class Application {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    cardCvvRequired: ").append(toIndentedString(cardCvvRequired)).append("\n");
    sb.append("    cardExpirationDateRequired: ").append(toIndentedString(cardExpirationDateRequired)).append("\n");
    sb.append("    creatingTransferFromReportEnabled: ").append(toIndentedString(creatingTransferFromReportEnabled)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    feeReadyToSettleUpon: ").append(toIndentedString(feeReadyToSettleUpon)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    processingEnabled: ").append(toIndentedString(processingEnabled)).append("\n");
    sb.append("    readyToSettleUpon: ").append(toIndentedString(readyToSettleUpon)).append("\n");
    sb.append("    settlementEnabled: ").append(toIndentedString(settlementEnabled)).append("\n");
    sb.append("    settlementFundingIdentifier: ").append(toIndentedString(settlementFundingIdentifier)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("card_cvv_required");
    openapiFields.add("card_expiration_date_required");
    openapiFields.add("creating_transfer_from_report_enabled");
    openapiFields.add("enabled");
    openapiFields.add("fee_ready_to_settle_upon");
    openapiFields.add("name");
    openapiFields.add("owner");
    openapiFields.add("processing_enabled");
    openapiFields.add("ready_to_settle_upon");
    openapiFields.add("settlement_enabled");
    openapiFields.add("settlement_funding_identifier");
    openapiFields.add("tags");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Application
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Application.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Application is not found in the empty JSON string", Application.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Application.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Application` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("fee_ready_to_settle_upon") != null && !jsonObj.get("fee_ready_to_settle_upon").isJsonNull()  && !jsonObj.get("fee_ready_to_settle_upon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee_ready_to_settle_upon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee_ready_to_settle_upon").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()  && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()  && !jsonObj.get("owner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("ready_to_settle_upon") != null && !jsonObj.get("ready_to_settle_upon").isJsonNull()  && !jsonObj.get("ready_to_settle_upon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ready_to_settle_upon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ready_to_settle_upon").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("settlement_funding_identifier") != null && !jsonObj.get("settlement_funding_identifier").isJsonNull()  && !jsonObj.get("settlement_funding_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_funding_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_funding_identifier").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `_links`
     // if (jsonObj.getAsJsonObject("_links") != null) {
       //ApplicationLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Application.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Application' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Application> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Application.class));

       return (TypeAdapter<T>) new TypeAdapter<Application>() {
           @Override
           public void write(JsonWriter out, Application value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Application read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Application given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Application
  * @throws IOException if the JSON string is invalid with respect to Application
  */
  public static Application fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Application.class);
  }

 /**
  * Convert an instance of Application to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

