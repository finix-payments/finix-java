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
import model.IdentityEntityBusinessAddress;
import model.IdentityEntityDob;
import model.IdentityEntityIncorporationDate;
import model.IdentityEntityPersonalAddress;
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
 * The underwriting details required to verify the &#x60;Identity&#x60;.
 */
@ApiModel(description = "The underwriting details required to verify the `Identity`.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IdentityEntity {
  public static final String SERIALIZED_NAME_ANNUAL_CARD_VOLUME = "annual_card_volume";
  @SerializedName(SERIALIZED_NAME_ANNUAL_CARD_VOLUME)
  private Long annualCardVolume;

  public static final String SERIALIZED_NAME_BUSINESS_ADDRESS = "business_address";
  @SerializedName(SERIALIZED_NAME_BUSINESS_ADDRESS)
  private IdentityEntityBusinessAddress businessAddress;

  public static final String SERIALIZED_NAME_BUSINESS_NAME = "business_name";
  @SerializedName(SERIALIZED_NAME_BUSINESS_NAME)
  private String businessName;

  public static final String SERIALIZED_NAME_BUSINESS_PHONE = "business_phone";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PHONE)
  private String businessPhone;

  public static final String SERIALIZED_NAME_BUSINESS_TAX_ID_PROVIDED = "business_tax_id_provided";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TAX_ID_PROVIDED)
  private Boolean businessTaxIdProvided;

  public static final String SERIALIZED_NAME_BUSINESS_TYPE = "business_type";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TYPE)
  private String businessType;

  public static final String SERIALIZED_NAME_DEFAULT_STATEMENT_DESCRIPTOR = "default_statement_descriptor";
  @SerializedName(SERIALIZED_NAME_DEFAULT_STATEMENT_DESCRIPTOR)
  private String defaultStatementDescriptor;

  public static final String SERIALIZED_NAME_DISCOVER_MID = "discover_mid";
  @SerializedName(SERIALIZED_NAME_DISCOVER_MID)
  private Long discoverMid;

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private IdentityEntityDob dob;

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
  private IdentityEntityIncorporationDate incorporationDate;

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
    PUBLIC("PUBLIC"),
    
    PRIVATE("PRIVATE"),
    
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

        if (value.equals(null) && value.length() == 0) {
            return null;
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
  private IdentityEntityPersonalAddress personalAddress;

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

  public static final String SERIALIZED_NAME_TAX_ID_PROVIDED = "tax_id_provided";
  @SerializedName(SERIALIZED_NAME_TAX_ID_PROVIDED)
  private Boolean taxIdProvided;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public IdentityEntity() { 
  }

  public IdentityEntity annualCardVolume(Long annualCardVolume) {
    
    this.annualCardVolume = annualCardVolume;
    return this;
  }

   /**
   * The annual credit card sales (in cents) expected to be processed by this merchant (max 19 characters).
   * @return annualCardVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The annual credit card sales (in cents) expected to be processed by this merchant (max 19 characters).")

  public Long getAnnualCardVolume() {
    return annualCardVolume;
  }


  public void setAnnualCardVolume(Long annualCardVolume) {
    this.annualCardVolume = annualCardVolume;
  }


  public IdentityEntity businessAddress(IdentityEntityBusinessAddress businessAddress) {
    
    this.businessAddress = businessAddress;
    return this;
  }

   /**
   * Get businessAddress
   * @return businessAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityEntityBusinessAddress getBusinessAddress() {
    return businessAddress;
  }


  public void setBusinessAddress(IdentityEntityBusinessAddress businessAddress) {
    this.businessAddress = businessAddress;
  }


  public IdentityEntity businessName(String businessName) {
    
    this.businessName = businessName;
    return this;
  }

   /**
   * The merchant&#39;s legal business name (max 120 characters).&lt;ul&gt;&lt;li&gt;If &lt;strong&gt;INDIVIDUAL_SOLE_PROPRIETORSHIP&lt;/strong&gt;, pass the owner&#39;s legal first name, last name and middle initial.
   * @return businessName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The merchant's legal business name (max 120 characters).<ul><li>If <strong>INDIVIDUAL_SOLE_PROPRIETORSHIP</strong>, pass the owner's legal first name, last name and middle initial.")

  public String getBusinessName() {
    return businessName;
  }


  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public IdentityEntity businessPhone(String businessPhone) {
    
    this.businessPhone = businessPhone;
    return this;
  }

   /**
   * Customer service phone number where the merchant can be reached (max 10 characters).
   * @return businessPhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Customer service phone number where the merchant can be reached (max 10 characters).")

  public String getBusinessPhone() {
    return businessPhone;
  }


  public void setBusinessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
  }


  public IdentityEntity businessTaxIdProvided(Boolean businessTaxIdProvided) {
    
    this.businessTaxIdProvided = businessTaxIdProvided;
    return this;
  }

   /**
   * Details if the &#x60;business_tax_id&#x60; was provided.
   * @return businessTaxIdProvided
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if the `business_tax_id` was provided.")

  public Boolean getBusinessTaxIdProvided() {
    return businessTaxIdProvided;
  }


  public void setBusinessTaxIdProvided(Boolean businessTaxIdProvided) {
    this.businessTaxIdProvided = businessTaxIdProvided;
  }


  public IdentityEntity businessType(String businessType) {
    
    this.businessType = businessType;
    return this;
  }

   /**
   * Include the value that best applies to the merchant.
   * @return businessType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include the value that best applies to the merchant.")

  public String getBusinessType() {
    return businessType;
  }


  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }


  public IdentityEntity defaultStatementDescriptor(String defaultStatementDescriptor) {
    
    this.defaultStatementDescriptor = defaultStatementDescriptor;
    return this;
  }

   /**
   * The description of the merchant that appears on the buyer&#39;s bank or card statement.
   * @return defaultStatementDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the merchant that appears on the buyer's bank or card statement.")

  public String getDefaultStatementDescriptor() {
    return defaultStatementDescriptor;
  }


  public void setDefaultStatementDescriptor(String defaultStatementDescriptor) {
    this.defaultStatementDescriptor = defaultStatementDescriptor;
  }


  public IdentityEntity discoverMid(Long discoverMid) {
    
    this.discoverMid = discoverMid;
    return this;
  }

   /**
   * Assigned discoverMid value.
   * @return discoverMid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Assigned discoverMid value.")

  public Long getDiscoverMid() {
    return discoverMid;
  }


  public void setDiscoverMid(Long discoverMid) {
    this.discoverMid = discoverMid;
  }


  public IdentityEntity dob(IdentityEntityDob dob) {
    
    this.dob = dob;
    return this;
  }

   /**
   * Get dob
   * @return dob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityEntityDob getDob() {
    return dob;
  }


  public void setDob(IdentityEntityDob dob) {
    this.dob = dob;
  }


  public IdentityEntity doingBusinessAs(String doingBusinessAs) {
    
    this.doingBusinessAs = doingBusinessAs;
    return this;
  }

   /**
   * Alternate names of the business. If there are no other names, pass the same value used for &#x60;business_name&#x60; (max 60 characters).
   * @return doingBusinessAs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Alternate names of the business. If there are no other names, pass the same value used for `business_name` (max 60 characters).")

  public String getDoingBusinessAs() {
    return doingBusinessAs;
  }


  public void setDoingBusinessAs(String doingBusinessAs) {
    this.doingBusinessAs = doingBusinessAs;
  }


  public IdentityEntity email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email address of the principal control owner where they can be reached (max 100 characters).
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address of the principal control owner where they can be reached (max 100 characters).")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public IdentityEntity firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The legal first name of the merchant&#39;s control owner (max 20 characters).
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The legal first name of the merchant's control owner (max 20 characters).")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public IdentityEntity hasAcceptedCreditCardsPreviously(Boolean hasAcceptedCreditCardsPreviously) {
    
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


  public IdentityEntity incorporationDate(IdentityEntityIncorporationDate incorporationDate) {
    
    this.incorporationDate = incorporationDate;
    return this;
  }

   /**
   * Get incorporationDate
   * @return incorporationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityEntityIncorporationDate getIncorporationDate() {
    return incorporationDate;
  }


  public void setIncorporationDate(IdentityEntityIncorporationDate incorporationDate) {
    this.incorporationDate = incorporationDate;
  }


  public IdentityEntity lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The legal last name of the merchant&#39;s control owner (max 20 characters).
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The legal last name of the merchant's control owner (max 20 characters).")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public IdentityEntity maxTransactionAmount(Long maxTransactionAmount) {
    
    this.maxTransactionAmount = maxTransactionAmount;
    return this;
  }

   /**
   * The maximum amount (in cents) that can be charged for a single transaction (max 12 characters).
   * @return maxTransactionAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum amount (in cents) that can be charged for a single transaction (max 12 characters).")

  public Long getMaxTransactionAmount() {
    return maxTransactionAmount;
  }


  public void setMaxTransactionAmount(Long maxTransactionAmount) {
    this.maxTransactionAmount = maxTransactionAmount;
  }


  public IdentityEntity mcc(String mcc) {
    
    this.mcc = mcc;
    return this;
  }

   /**
   * The Merchant Category Code ([MCC](http://www.dm.usda.gov/procurement/card/card\\_x/mcc.pdf)) that this merchant will be classified under.
   * @return mcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Merchant Category Code ([MCC](http://www.dm.usda.gov/procurement/card/card\\_x/mcc.pdf)) that this merchant will be classified under.")

  public String getMcc() {
    return mcc;
  }


  public void setMcc(String mcc) {
    this.mcc = mcc;
  }


  public IdentityEntity ownershipType(OwnershipTypeEnum ownershipType) {
    
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


  public IdentityEntity personalAddress(IdentityEntityPersonalAddress personalAddress) {
    
    this.personalAddress = personalAddress;
    return this;
  }

   /**
   * Get personalAddress
   * @return personalAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityEntityPersonalAddress getPersonalAddress() {
    return personalAddress;
  }


  public void setPersonalAddress(IdentityEntityPersonalAddress personalAddress) {
    this.personalAddress = personalAddress;
  }


  public IdentityEntity phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * The principal control owner&#39;s phone number (max 10 characters).
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The principal control owner's phone number (max 10 characters).")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public IdentityEntity principalPercentageOwnership(Long principalPercentageOwnership) {
    
    this.principalPercentageOwnership = principalPercentageOwnership;
    return this;
  }

   /**
   * Percentage of the company owned by the principal control owner (min 0; max 100).
   * @return principalPercentageOwnership
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage of the company owned by the principal control owner (min 0; max 100).")

  public Long getPrincipalPercentageOwnership() {
    return principalPercentageOwnership;
  }


  public void setPrincipalPercentageOwnership(Long principalPercentageOwnership) {
    this.principalPercentageOwnership = principalPercentageOwnership;
  }


  public IdentityEntity shortBusinessName(String shortBusinessName) {
    
    this.shortBusinessName = shortBusinessName;
    return this;
  }

   /**
   * Abbreviated names of the business. If there are no abbreviated name, leave this field blank.
   * @return shortBusinessName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Abbreviated names of the business. If there are no abbreviated name, leave this field blank.")

  public String getShortBusinessName() {
    return shortBusinessName;
  }


  public void setShortBusinessName(String shortBusinessName) {
    this.shortBusinessName = shortBusinessName;
  }


  public IdentityEntity taxAuthority(String taxAuthority) {
    
    this.taxAuthority = taxAuthority;
    return this;
  }

   /**
   * &lt;ul&gt;&lt;li&gt;Only required when onboarding a merchant with a &lt;tt&gt;MCC&lt;/tt&gt; of &lt;strong&gt;9311&lt;/strong&gt;.&lt;li&gt; The &lt;tt&gt;tax_authority&lt;/tt&gt; is the tax gathering entity (e.g San Francisco Water Authority).
   * @return taxAuthority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<ul><li>Only required when onboarding a merchant with a <tt>MCC</tt> of <strong>9311</strong>.<li> The <tt>tax_authority</tt> is the tax gathering entity (e.g San Francisco Water Authority).")

  public String getTaxAuthority() {
    return taxAuthority;
  }


  public void setTaxAuthority(String taxAuthority) {
    this.taxAuthority = taxAuthority;
  }


  public IdentityEntity taxIdProvided(Boolean taxIdProvided) {
    
    this.taxIdProvided = taxIdProvided;
    return this;
  }

   /**
   * Details if the &#x60;tax_id&#x60; was provided.
   * @return taxIdProvided
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if the `tax_id` was provided.")

  public Boolean getTaxIdProvided() {
    return taxIdProvided;
  }


  public void setTaxIdProvided(Boolean taxIdProvided) {
    this.taxIdProvided = taxIdProvided;
  }


  public IdentityEntity title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The corporate title of the control owner (e.g. Chief Executive Officer, CFO, etc. Max 60 characters).
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The corporate title of the control owner (e.g. Chief Executive Officer, CFO, etc. Max 60 characters).")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public IdentityEntity url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL of the merchant&#39;s public website.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the merchant's public website.")

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
    IdentityEntity identityEntity = (IdentityEntity) o;
    return Objects.equals(this.annualCardVolume, identityEntity.annualCardVolume) &&
        Objects.equals(this.businessAddress, identityEntity.businessAddress) &&
        Objects.equals(this.businessName, identityEntity.businessName) &&
        Objects.equals(this.businessPhone, identityEntity.businessPhone) &&
        Objects.equals(this.businessTaxIdProvided, identityEntity.businessTaxIdProvided) &&
        Objects.equals(this.businessType, identityEntity.businessType) &&
        Objects.equals(this.defaultStatementDescriptor, identityEntity.defaultStatementDescriptor) &&
        Objects.equals(this.discoverMid, identityEntity.discoverMid) &&
        Objects.equals(this.dob, identityEntity.dob) &&
        Objects.equals(this.doingBusinessAs, identityEntity.doingBusinessAs) &&
        Objects.equals(this.email, identityEntity.email) &&
        Objects.equals(this.firstName, identityEntity.firstName) &&
        Objects.equals(this.hasAcceptedCreditCardsPreviously, identityEntity.hasAcceptedCreditCardsPreviously) &&
        Objects.equals(this.incorporationDate, identityEntity.incorporationDate) &&
        Objects.equals(this.lastName, identityEntity.lastName) &&
        Objects.equals(this.maxTransactionAmount, identityEntity.maxTransactionAmount) &&
        Objects.equals(this.mcc, identityEntity.mcc) &&
        Objects.equals(this.ownershipType, identityEntity.ownershipType) &&
        Objects.equals(this.personalAddress, identityEntity.personalAddress) &&
        Objects.equals(this.phone, identityEntity.phone) &&
        Objects.equals(this.principalPercentageOwnership, identityEntity.principalPercentageOwnership) &&
        Objects.equals(this.shortBusinessName, identityEntity.shortBusinessName) &&
        Objects.equals(this.taxAuthority, identityEntity.taxAuthority) &&
        Objects.equals(this.taxIdProvided, identityEntity.taxIdProvided) &&
        Objects.equals(this.title, identityEntity.title) &&
        Objects.equals(this.url, identityEntity.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(annualCardVolume, businessAddress, businessName, businessPhone, businessTaxIdProvided, businessType, defaultStatementDescriptor, discoverMid, dob, doingBusinessAs, email, firstName, hasAcceptedCreditCardsPreviously, incorporationDate, lastName, maxTransactionAmount, mcc, ownershipType, personalAddress, phone, principalPercentageOwnership, shortBusinessName, taxAuthority, taxIdProvided, title, url);
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
    sb.append("class IdentityEntity {\n");
    sb.append("    annualCardVolume: ").append(toIndentedString(annualCardVolume)).append("\n");
    sb.append("    businessAddress: ").append(toIndentedString(businessAddress)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessPhone: ").append(toIndentedString(businessPhone)).append("\n");
    sb.append("    businessTaxIdProvided: ").append(toIndentedString(businessTaxIdProvided)).append("\n");
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
    sb.append("    taxIdProvided: ").append(toIndentedString(taxIdProvided)).append("\n");
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
    openapiFields.add("annual_card_volume");
    openapiFields.add("business_address");
    openapiFields.add("business_name");
    openapiFields.add("business_phone");
    openapiFields.add("business_tax_id_provided");
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
    openapiFields.add("tax_id_provided");
    openapiFields.add("title");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IdentityEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IdentityEntity.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdentityEntity is not found in the empty JSON string", IdentityEntity.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IdentityEntity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IdentityEntity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `business_address`
     // if (jsonObj.getAsJsonObject("business_address") != null) {
       //IdentityEntityBusinessAddress.validateJsonObject(jsonObj.getAsJsonObject("business_address"));
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
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `dob`
     // if (jsonObj.getAsJsonObject("dob") != null) {
       //IdentityEntityDob.validateJsonObject(jsonObj.getAsJsonObject("dob"));
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
       //IdentityEntityIncorporationDate.validateJsonObject(jsonObj.getAsJsonObject("incorporation_date"));
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
       //IdentityEntityPersonalAddress.validateJsonObject(jsonObj.getAsJsonObject("personal_address"));
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
       if (!IdentityEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdentityEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdentityEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdentityEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<IdentityEntity>() {
           @Override
           public void write(JsonWriter out, IdentityEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IdentityEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IdentityEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IdentityEntity
  * @throws IOException if the JSON string is invalid with respect to IdentityEntity
  */
  public static IdentityEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdentityEntity.class);
  }

 /**
  * Convert an instance of IdentityEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

