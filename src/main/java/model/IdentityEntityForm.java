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
import model.Address;
import model.IdentityEntityFormBusinessAddress;
import model.IdentityEntityFormDob;
import model.IdentityEntityFormIncorporationDate;
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
 * Information needed to verify the identity of the entity.
 */
@ApiModel(description = "Information needed to verify the identity of the entity.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IdentityEntityForm {
  public static final String SERIALIZED_NAME_AMEX_MID = "amex_mid";
  @SerializedName(SERIALIZED_NAME_AMEX_MID)
  private String amexMid;

  public static final String SERIALIZED_NAME_ANNUAL_CARD_VOLUME = "annual_card_volume";
  @SerializedName(SERIALIZED_NAME_ANNUAL_CARD_VOLUME)
  private Long annualCardVolume;

  public static final String SERIALIZED_NAME_BUSINESS_ADDRESS = "business_address";
  @SerializedName(SERIALIZED_NAME_BUSINESS_ADDRESS)
  private IdentityEntityFormBusinessAddress businessAddress;

  public static final String SERIALIZED_NAME_BUSINESS_NAME = "business_name";
  @SerializedName(SERIALIZED_NAME_BUSINESS_NAME)
  private String businessName;

  public static final String SERIALIZED_NAME_BUSINESS_PHONE = "business_phone";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PHONE)
  private String businessPhone;

  public static final String SERIALIZED_NAME_BUSINESS_TAX_ID = "business_tax_id";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TAX_ID)
  private String businessTaxId;

  /**
   * Include the value that applies the best.
   */
  @JsonAdapter(BusinessTypeEnum.Adapter.class)
  public enum BusinessTypeEnum {
    INDIVIDUAL_SOLE_PROPRIETORSHIP("INDIVIDUAL_SOLE_PROPRIETORSHIP"),
    
    CORPORATION("CORPORATION"),
    
    LIMITED_LIABILITY_COMPANY("LIMITED_LIABILITY_COMPANY"),
    
    PARTNERSHIP("PARTNERSHIP"),
    
    LIMITED_PARTNERSHIP("LIMITED_PARTNERSHIP"),
    
    GENERAL_PARTNERSHIP("GENERAL_PARTNERSHIP"),
    
    ASSOCIATION_ESTATE_TRUST("ASSOCIATION_ESTATE_TRUST"),
    
    TAX_EXEMPT_ORGANIZATION("TAX_EXEMPT_ORGANIZATION"),
    
    INTERNATIONAL_ORGANIZATION("INTERNATIONAL_ORGANIZATION"),
    
    GOVERNMENT_AGENCY("GOVERNMENT_AGENCY"),
    
    JOINT_VENTURE("JOINT_VENTURE"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    BusinessTypeEnum(String value) {
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

    public static BusinessTypeEnum fromValue(String value) {
        for (BusinessTypeEnum b : BusinessTypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        if (value.equals(null) && value.length() == 0) {
            return null;
        }
        BusinessTypeEnum unknownDefault = BusinessTypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<BusinessTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BusinessTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BusinessTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BusinessTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BUSINESS_TYPE = "business_type";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TYPE)
  private BusinessTypeEnum businessType;

  public static final String SERIALIZED_NAME_DEFAULT_STATEMENT_DESCRIPTOR = "default_statement_descriptor";
  @SerializedName(SERIALIZED_NAME_DEFAULT_STATEMENT_DESCRIPTOR)
  private String defaultStatementDescriptor;

  public static final String SERIALIZED_NAME_DISCOVER_MID = "discover_mid";
  @SerializedName(SERIALIZED_NAME_DISCOVER_MID)
  private String discoverMid;

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private IdentityEntityFormDob dob;

  public static final String SERIALIZED_NAME_DOING_BUSINESS_AS = "doing_business_as";
  @SerializedName(SERIALIZED_NAME_DOING_BUSINESS_AS)
  private String doingBusinessAs;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_HAS_ACCEPTED_CREDIT_CARDS_PREVIOUSLY = "has_accepted_credit_cards_previously";
  @SerializedName(SERIALIZED_NAME_HAS_ACCEPTED_CREDIT_CARDS_PREVIOUSLY)
  private Boolean hasAcceptedCreditCardsPreviously;

  public static final String SERIALIZED_NAME_INCORPORATION_DATE = "incorporation_date";
  @SerializedName(SERIALIZED_NAME_INCORPORATION_DATE)
  private IdentityEntityFormIncorporationDate incorporationDate;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_MAX_TRANSACTION_AMOUNT = "max_transaction_amount";
  @SerializedName(SERIALIZED_NAME_MAX_TRANSACTION_AMOUNT)
  private Long maxTransactionAmount;

  public static final String SERIALIZED_NAME_MCC = "mcc";
  @SerializedName(SERIALIZED_NAME_MCC)
  private String mcc;

  /**
   * Values can be either: &lt;ul&gt;&lt;li&gt;&lt;strong&gt;PUBLIC&lt;/strong&gt; to indicate a publicly-traded company.&lt;li&gt;&lt;strong&gt;PRIVATE&lt;/strong&gt; for privately-held businesses.
   */
  @JsonAdapter(OwnershipTypeEnum.Adapter.class)
  public enum OwnershipTypeEnum {
    PRIVATE("PRIVATE"),
    
    PUBLIC("PUBLIC"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    OwnershipTypeEnum(String value) {
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

    public static OwnershipTypeEnum fromValue(String value) {
        for (OwnershipTypeEnum b : OwnershipTypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        OwnershipTypeEnum unknownDefault = OwnershipTypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<OwnershipTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OwnershipTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OwnershipTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OwnershipTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OWNERSHIP_TYPE = "ownership_type";
  @SerializedName(SERIALIZED_NAME_OWNERSHIP_TYPE)
  private OwnershipTypeEnum ownershipType;

  public static final String SERIALIZED_NAME_PERSONAL_ADDRESS = "personal_address";
  @SerializedName(SERIALIZED_NAME_PERSONAL_ADDRESS)
  private Address personalAddress;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_PRINCIPAL_PERCENTAGE_OWNERSHIP = "principal_percentage_ownership";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_PERCENTAGE_OWNERSHIP)
  private Long principalPercentageOwnership;

  public static final String SERIALIZED_NAME_SHORT_BUSINESS_NAME = "short_business_name";
  @SerializedName(SERIALIZED_NAME_SHORT_BUSINESS_NAME)
  private String shortBusinessName;

  public static final String SERIALIZED_NAME_TAX_AUTHORITY = "tax_authority";
  @SerializedName(SERIALIZED_NAME_TAX_AUTHORITY)
  private String taxAuthority;

  public static final String SERIALIZED_NAME_TAX_ID = "tax_id";
  @SerializedName(SERIALIZED_NAME_TAX_ID)
  private String taxId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public IdentityEntityForm() { 
  }

  public IdentityEntityForm amexMid(String amexMid) {
    
    this.amexMid = amexMid;
    return this;
  }

   /**
   * Assigned amex_Mid value. If included must be 10 or 11 digits.
   * @return amexMid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Assigned amex_Mid value. If included must be 10 or 11 digits.")

  public String getAmexMid() {
    return amexMid;
  }


  public void setAmexMid(String amexMid) {
    this.amexMid = amexMid;
  }


  public IdentityEntityForm annualCardVolume(Long annualCardVolume) {
    
    this.annualCardVolume = annualCardVolume;
    return this;
  }

   /**
   * Approximate annual credit card sales expected to be processed in cents by this merchant (max 19 characters).
   * @return annualCardVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Approximate annual credit card sales expected to be processed in cents by this merchant (max 19 characters).")

  public Long getAnnualCardVolume() {
    return annualCardVolume;
  }


  public void setAnnualCardVolume(Long annualCardVolume) {
    this.annualCardVolume = annualCardVolume;
  }


  public IdentityEntityForm businessAddress(IdentityEntityFormBusinessAddress businessAddress) {
    
    this.businessAddress = businessAddress;
    return this;
  }

   /**
   * Get businessAddress
   * @return businessAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public IdentityEntityFormBusinessAddress getBusinessAddress() {
    return businessAddress;
  }


  public void setBusinessAddress(IdentityEntityFormBusinessAddress businessAddress) {
    this.businessAddress = businessAddress;
  }


  public IdentityEntityForm businessName(String businessName) {
    
    this.businessName = businessName;
    return this;
  }

   /**
   * Merchant&#39;s full legal business name (If **INDIVIDUAL\\_SOLE\\_PROPRIETORSHIP**, input first name, Full legal last name and middle initial; max 120 characters)
   * @return businessName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Merchant's full legal business name (If **INDIVIDUAL\\_SOLE\\_PROPRIETORSHIP**, input first name, Full legal last name and middle initial; max 120 characters)")

  public String getBusinessName() {
    return businessName;
  }


  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public IdentityEntityForm businessPhone(String businessPhone) {
    
    this.businessPhone = businessPhone;
    return this;
  }

   /**
   * Customer service phone number where the merchant can be reached (max 10 characters).
   * @return businessPhone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Customer service phone number where the merchant can be reached (max 10 characters).")

  public String getBusinessPhone() {
    return businessPhone;
  }


  public void setBusinessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
  }


  public IdentityEntityForm businessTaxId(String businessTaxId) {
    
    this.businessTaxId = businessTaxId;
    return this;
  }

   /**
   * Nine digit Tax Identification Number (TIN), Employer Identification Number (EIN). If the &#x60;business_type&#x60; is **INDIVIDUAL\\_SOLE\\_PROPRIETORSHIP** and they do not have an EIN, use the sole proprietor&#39;s Social Security Number (SSN).
   * @return businessTaxId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Nine digit Tax Identification Number (TIN), Employer Identification Number (EIN). If the `business_type` is **INDIVIDUAL\\_SOLE\\_PROPRIETORSHIP** and they do not have an EIN, use the sole proprietor's Social Security Number (SSN).")

  public String getBusinessTaxId() {
    return businessTaxId;
  }


  public void setBusinessTaxId(String businessTaxId) {
    this.businessTaxId = businessTaxId;
  }


  public IdentityEntityForm businessType(BusinessTypeEnum businessType) {
    
    this.businessType = businessType;
    return this;
  }

   /**
   * Include the value that applies the best.
   * @return businessType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Include the value that applies the best.")

  public BusinessTypeEnum getBusinessType() {
    return businessType;
  }


  public void setBusinessType(BusinessTypeEnum businessType) {
    this.businessType = businessType;
  }


  public IdentityEntityForm defaultStatementDescriptor(String defaultStatementDescriptor) {
    
    this.defaultStatementDescriptor = defaultStatementDescriptor;
    return this;
  }

   /**
   * Billing description displayed on the buyer&#39;s bank or card statement (Length must be between 1 and 20 characters).
   * @return defaultStatementDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Billing description displayed on the buyer's bank or card statement (Length must be between 1 and 20 characters).")

  public String getDefaultStatementDescriptor() {
    return defaultStatementDescriptor;
  }


  public void setDefaultStatementDescriptor(String defaultStatementDescriptor) {
    this.defaultStatementDescriptor = defaultStatementDescriptor;
  }


  public IdentityEntityForm discoverMid(String discoverMid) {
    
    this.discoverMid = discoverMid;
    return this;
  }

   /**
   * Assigned Discover Mid value.
   * @return discoverMid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Assigned Discover Mid value.")

  public String getDiscoverMid() {
    return discoverMid;
  }


  public void setDiscoverMid(String discoverMid) {
    this.discoverMid = discoverMid;
  }


  public IdentityEntityForm dob(IdentityEntityFormDob dob) {
    
    this.dob = dob;
    return this;
  }

   /**
   * Get dob
   * @return dob
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public IdentityEntityFormDob getDob() {
    return dob;
  }


  public void setDob(IdentityEntityFormDob dob) {
    this.dob = dob;
  }


  public IdentityEntityForm doingBusinessAs(String doingBusinessAs) {
    
    this.doingBusinessAs = doingBusinessAs;
    return this;
  }

   /**
   * Alternate name of the business. If no other name is used use the same value used in &#x60;business_name&#x60; (max 60 characters).
   * @return doingBusinessAs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Alternate name of the business. If no other name is used use the same value used in `business_name` (max 60 characters).")

  public String getDoingBusinessAs() {
    return doingBusinessAs;
  }


  public void setDoingBusinessAs(String doingBusinessAs) {
    this.doingBusinessAs = doingBusinessAs;
  }


  public IdentityEntityForm email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Control person&#39;s email address where they can be reached (max 100 characters).
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Control person's email address where they can be reached (max 100 characters).")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public IdentityEntityForm firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Full legal first name of the merchant&#39;s principal representative (max 20 characters).
   * @return firstName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Full legal first name of the merchant's principal representative (max 20 characters).")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public IdentityEntityForm hasAcceptedCreditCardsPreviously(Boolean hasAcceptedCreditCardsPreviously) {
    
    this.hasAcceptedCreditCardsPreviously = hasAcceptedCreditCardsPreviously;
    return this;
  }

   /**
   * Defaults to **false** if not passed.
   * @return hasAcceptedCreditCardsPreviously
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defaults to **false** if not passed.")

  public Boolean getHasAcceptedCreditCardsPreviously() {
    return hasAcceptedCreditCardsPreviously;
  }


  public void setHasAcceptedCreditCardsPreviously(Boolean hasAcceptedCreditCardsPreviously) {
    this.hasAcceptedCreditCardsPreviously = hasAcceptedCreditCardsPreviously;
  }


  public IdentityEntityForm incorporationDate(IdentityEntityFormIncorporationDate incorporationDate) {
    
    this.incorporationDate = incorporationDate;
    return this;
  }

   /**
   * Get incorporationDate
   * @return incorporationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityEntityFormIncorporationDate getIncorporationDate() {
    return incorporationDate;
  }


  public void setIncorporationDate(IdentityEntityFormIncorporationDate incorporationDate) {
    this.incorporationDate = incorporationDate;
  }


  public IdentityEntityForm lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Full legal last name of the merchant&#39;s principal representative (max 20 characters).
   * @return lastName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Full legal last name of the merchant's principal representative (max 20 characters).")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public IdentityEntityForm maxTransactionAmount(Long maxTransactionAmount) {
    
    this.maxTransactionAmount = maxTransactionAmount;
    return this;
  }

   /**
   * Maximum amount that can be transacted for a single transaction in cents (max 12 characters).
   * @return maxTransactionAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum amount that can be transacted for a single transaction in cents (max 12 characters).")

  public Long getMaxTransactionAmount() {
    return maxTransactionAmount;
  }


  public void setMaxTransactionAmount(Long maxTransactionAmount) {
    this.maxTransactionAmount = maxTransactionAmount;
  }


  public IdentityEntityForm mcc(String mcc) {
    
    this.mcc = mcc;
    return this;
  }

   /**
   * The Merchant Category Code ([MCC](http://www.dm.usda.gov/procurement/card/card_x/mcc.pdf)) the merchant is classified under.
   * @return mcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Merchant Category Code ([MCC](http://www.dm.usda.gov/procurement/card/card_x/mcc.pdf)) the merchant is classified under.")

  public String getMcc() {
    return mcc;
  }


  public void setMcc(String mcc) {
    this.mcc = mcc;
  }


  public IdentityEntityForm ownershipType(OwnershipTypeEnum ownershipType) {
    
    this.ownershipType = ownershipType;
    return this;
  }

   /**
   * Values can be either: &lt;ul&gt;&lt;li&gt;&lt;strong&gt;PUBLIC&lt;/strong&gt; to indicate a publicly-traded company.&lt;li&gt;&lt;strong&gt;PRIVATE&lt;/strong&gt; for privately-held businesses.
   * @return ownershipType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Values can be either: <ul><li><strong>PUBLIC</strong> to indicate a publicly-traded company.<li><strong>PRIVATE</strong> for privately-held businesses.")

  public OwnershipTypeEnum getOwnershipType() {
    return ownershipType;
  }


  public void setOwnershipType(OwnershipTypeEnum ownershipType) {
    this.ownershipType = ownershipType;
  }


  public IdentityEntityForm personalAddress(Address personalAddress) {
    
    this.personalAddress = personalAddress;
    return this;
  }

   /**
   * Get personalAddress
   * @return personalAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Address getPersonalAddress() {
    return personalAddress;
  }


  public void setPersonalAddress(Address personalAddress) {
    this.personalAddress = personalAddress;
  }


  public IdentityEntityForm phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Principal&#39;s phone number (max 10 characters).
   * @return phone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Principal's phone number (max 10 characters).")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public IdentityEntityForm principalPercentageOwnership(Long principalPercentageOwnership) {
    
    this.principalPercentageOwnership = principalPercentageOwnership;
    return this;
  }

   /**
   * Percentage of company owned by the principal (min 0; max 100).
   * minimum: 0
   * maximum: 100
   * @return principalPercentageOwnership
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage of company owned by the principal (min 0; max 100).")

  public Long getPrincipalPercentageOwnership() {
    return principalPercentageOwnership;
  }


  public void setPrincipalPercentageOwnership(Long principalPercentageOwnership) {
    this.principalPercentageOwnership = principalPercentageOwnership;
  }


  public IdentityEntityForm shortBusinessName(String shortBusinessName) {
    
    this.shortBusinessName = shortBusinessName;
    return this;
  }

   /**
   * The short version of the business name. (Defaults to **null**).
   * @return shortBusinessName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The short version of the business name. (Defaults to **null**).")

  public String getShortBusinessName() {
    return shortBusinessName;
  }


  public void setShortBusinessName(String shortBusinessName) {
    this.shortBusinessName = shortBusinessName;
  }


  public IdentityEntityForm taxAuthority(String taxAuthority) {
    
    this.taxAuthority = taxAuthority;
    return this;
  }

   /**
   * Used and required when onboarding a &#x60;Merchant&#x60; with a &#x60;MCC&#x60; of **9311**. The  &#x60;tax_authority&#x60; is the tax gathering entity (e.g San Francisco Water Authority).
   * @return taxAuthority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used and required when onboarding a `Merchant` with a `MCC` of **9311**. The  `tax_authority` is the tax gathering entity (e.g San Francisco Water Authority).")

  public String getTaxAuthority() {
    return taxAuthority;
  }


  public void setTaxAuthority(String taxAuthority) {
    this.taxAuthority = taxAuthority;
  }


  public IdentityEntityForm taxId(String taxId) {
    
    this.taxId = taxId;
    return this;
  }

   /**
   * Used to verify &#x60;tax_id&#x60; was provided.
   * @return taxId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Used to verify `tax_id` was provided.")

  public String getTaxId() {
    return taxId;
  }


  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  public IdentityEntityForm title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Control person&#39;s corporate title or role (i.e. Chief Executive Officer, CFO, etc.; max 60 characters).
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Control person's corporate title or role (i.e. Chief Executive Officer, CFO, etc.; max 60 characters).")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public IdentityEntityForm url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Merchant&#39;s publicly available website (max 100 characters).
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant's publicly available website (max 100 characters).")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityEntityForm identityEntityForm = (IdentityEntityForm) o;
    return Objects.equals(this.amexMid, identityEntityForm.amexMid) &&
        Objects.equals(this.annualCardVolume, identityEntityForm.annualCardVolume) &&
        Objects.equals(this.businessAddress, identityEntityForm.businessAddress) &&
        Objects.equals(this.businessName, identityEntityForm.businessName) &&
        Objects.equals(this.businessPhone, identityEntityForm.businessPhone) &&
        Objects.equals(this.businessTaxId, identityEntityForm.businessTaxId) &&
        Objects.equals(this.businessType, identityEntityForm.businessType) &&
        Objects.equals(this.defaultStatementDescriptor, identityEntityForm.defaultStatementDescriptor) &&
        Objects.equals(this.discoverMid, identityEntityForm.discoverMid) &&
        Objects.equals(this.dob, identityEntityForm.dob) &&
        Objects.equals(this.doingBusinessAs, identityEntityForm.doingBusinessAs) &&
        Objects.equals(this.email, identityEntityForm.email) &&
        Objects.equals(this.firstName, identityEntityForm.firstName) &&
        Objects.equals(this.hasAcceptedCreditCardsPreviously, identityEntityForm.hasAcceptedCreditCardsPreviously) &&
        Objects.equals(this.incorporationDate, identityEntityForm.incorporationDate) &&
        Objects.equals(this.lastName, identityEntityForm.lastName) &&
        Objects.equals(this.maxTransactionAmount, identityEntityForm.maxTransactionAmount) &&
        Objects.equals(this.mcc, identityEntityForm.mcc) &&
        Objects.equals(this.ownershipType, identityEntityForm.ownershipType) &&
        Objects.equals(this.personalAddress, identityEntityForm.personalAddress) &&
        Objects.equals(this.phone, identityEntityForm.phone) &&
        Objects.equals(this.principalPercentageOwnership, identityEntityForm.principalPercentageOwnership) &&
        Objects.equals(this.shortBusinessName, identityEntityForm.shortBusinessName) &&
        Objects.equals(this.taxAuthority, identityEntityForm.taxAuthority) &&
        Objects.equals(this.taxId, identityEntityForm.taxId) &&
        Objects.equals(this.title, identityEntityForm.title) &&
        Objects.equals(this.url, identityEntityForm.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amexMid, annualCardVolume, businessAddress, businessName, businessPhone, businessTaxId, businessType, defaultStatementDescriptor, discoverMid, dob, doingBusinessAs, email, firstName, hasAcceptedCreditCardsPreviously, incorporationDate, lastName, maxTransactionAmount, mcc, ownershipType, personalAddress, phone, principalPercentageOwnership, shortBusinessName, taxAuthority, taxId, title, url);
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
    sb.append("class IdentityEntityForm {\n");
    sb.append("    amexMid: ").append(toIndentedString(amexMid)).append("\n");
    sb.append("    annualCardVolume: ").append(toIndentedString(annualCardVolume)).append("\n");
    sb.append("    businessAddress: ").append(toIndentedString(businessAddress)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessPhone: ").append(toIndentedString(businessPhone)).append("\n");
    sb.append("    businessTaxId: ").append(toIndentedString(businessTaxId)).append("\n");
    sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
    sb.append("    defaultStatementDescriptor: ").append(toIndentedString(defaultStatementDescriptor)).append("\n");
    sb.append("    discoverMid: ").append(toIndentedString(discoverMid)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    doingBusinessAs: ").append(toIndentedString(doingBusinessAs)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    hasAcceptedCreditCardsPreviously: ").append(toIndentedString(hasAcceptedCreditCardsPreviously)).append("\n");
    sb.append("    incorporationDate: ").append(toIndentedString(incorporationDate)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    maxTransactionAmount: ").append(toIndentedString(maxTransactionAmount)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    ownershipType: ").append(toIndentedString(ownershipType)).append("\n");
    sb.append("    personalAddress: ").append(toIndentedString(personalAddress)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    principalPercentageOwnership: ").append(toIndentedString(principalPercentageOwnership)).append("\n");
    sb.append("    shortBusinessName: ").append(toIndentedString(shortBusinessName)).append("\n");
    sb.append("    taxAuthority: ").append(toIndentedString(taxAuthority)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("amex_mid");
    openapiFields.add("annual_card_volume");
    openapiFields.add("business_address");
    openapiFields.add("business_name");
    openapiFields.add("business_phone");
    openapiFields.add("business_tax_id");
    openapiFields.add("business_type");
    openapiFields.add("default_statement_descriptor");
    openapiFields.add("discover_mid");
    openapiFields.add("dob");
    openapiFields.add("doing_business_as");
    openapiFields.add("email");
    openapiFields.add("first_name");
    openapiFields.add("has_accepted_credit_cards_previously");
    openapiFields.add("incorporation_date");
    openapiFields.add("last_name");
    openapiFields.add("max_transaction_amount");
    openapiFields.add("mcc");
    openapiFields.add("ownership_type");
    openapiFields.add("personal_address");
    openapiFields.add("phone");
    openapiFields.add("principal_percentage_ownership");
    openapiFields.add("short_business_name");
    openapiFields.add("tax_authority");
    openapiFields.add("tax_id");
    openapiFields.add("title");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("business_address");
    openapiRequiredFields.add("business_name");
    openapiRequiredFields.add("business_phone");
    openapiRequiredFields.add("business_tax_id");
    openapiRequiredFields.add("business_type");
    openapiRequiredFields.add("dob");
    openapiRequiredFields.add("doing_business_as");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("first_name");
    openapiRequiredFields.add("last_name");
    openapiRequiredFields.add("personal_address");
    openapiRequiredFields.add("phone");
    openapiRequiredFields.add("tax_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IdentityEntityForm
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IdentityEntityForm.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdentityEntityForm is not found in the empty JSON string", IdentityEntityForm.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IdentityEntityForm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IdentityEntityForm` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */

      /**
      * EDITED
      * Commented to ByPass required properties/fields are present in the JSON string
      */

      // check to make sure all required properties/fields are present in the JSON string
      /*for (String requiredField : IdentityEntityForm.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }*/
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("amex_mid") != null && !jsonObj.get("amex_mid").isJsonNull()  && !jsonObj.get("amex_mid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amex_mid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amex_mid").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `business_address`
     // if (jsonObj.getAsJsonObject("business_address") != null) {
       //IdentityEntityFormBusinessAddress.validateJsonObject(jsonObj.getAsJsonObject("business_address"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("business_name") != null && !jsonObj.get("business_name").isJsonNull()  && !jsonObj.get("business_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("business_phone") != null && !jsonObj.get("business_phone").isJsonNull()  && !jsonObj.get("business_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_phone").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("business_tax_id") != null && !jsonObj.get("business_tax_id").isJsonNull()  && !jsonObj.get("business_tax_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_tax_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_tax_id").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("business_type") != null && !jsonObj.get("business_type").isJsonNull()  && !jsonObj.get("business_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_type").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("default_statement_descriptor") != null && !jsonObj.get("default_statement_descriptor").isJsonNull()  && !jsonObj.get("default_statement_descriptor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_statement_descriptor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_statement_descriptor").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("discover_mid") != null && !jsonObj.get("discover_mid").isJsonNull()  && !jsonObj.get("discover_mid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discover_mid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discover_mid").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `dob`
     // if (jsonObj.getAsJsonObject("dob") != null) {
       //IdentityEntityFormDob.validateJsonObject(jsonObj.getAsJsonObject("dob"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("doing_business_as") != null && !jsonObj.get("doing_business_as").isJsonNull()  && !jsonObj.get("doing_business_as").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `doing_business_as` to be a primitive type in the JSON string but got `%s`", jsonObj.get("doing_business_as").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()  && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()  && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `incorporation_date`
     // if (jsonObj.getAsJsonObject("incorporation_date") != null) {
       //IdentityEntityFormIncorporationDate.validateJsonObject(jsonObj.getAsJsonObject("incorporation_date"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()  && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("mcc") != null && !jsonObj.get("mcc").isJsonNull()  && !jsonObj.get("mcc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mcc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mcc").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("ownership_type") != null && !jsonObj.get("ownership_type").isJsonNull()  && !jsonObj.get("ownership_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownership_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownership_type").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `personal_address`
     // if (jsonObj.getAsJsonObject("personal_address") != null) {
       //Address.validateJsonObject(jsonObj.getAsJsonObject("personal_address"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()  && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("short_business_name") != null && !jsonObj.get("short_business_name").isJsonNull()  && !jsonObj.get("short_business_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `short_business_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("short_business_name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("tax_authority") != null && !jsonObj.get("tax_authority").isJsonNull()  && !jsonObj.get("tax_authority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_authority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_authority").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("tax_id") != null && !jsonObj.get("tax_id").isJsonNull()  && !jsonObj.get("tax_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_id").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()  && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()  && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdentityEntityForm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdentityEntityForm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdentityEntityForm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdentityEntityForm.class));

       return (TypeAdapter<T>) new TypeAdapter<IdentityEntityForm>() {
           @Override
           public void write(JsonWriter out, IdentityEntityForm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IdentityEntityForm read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IdentityEntityForm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IdentityEntityForm
  * @throws IOException if the JSON string is invalid with respect to IdentityEntityForm
  */
  public static IdentityEntityForm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdentityEntityForm.class);
  }

 /**
  * Convert an instance of IdentityEntityForm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

