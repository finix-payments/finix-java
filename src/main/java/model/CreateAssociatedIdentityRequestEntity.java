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
import model.CreateAssociatedIdentityRequestEntityBusinessAddress;
import model.CreateAssociatedIdentityRequestEntityDob;
import model.CreateAssociatedIdentityRequestEntityIncorporationDate;
import model.CreateAssociatedIdentityRequestEntityPersonalAddress;
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
 * Underwriting data that&#39;s required to verify the &#x60;Identity&#x60;.
 */
@ApiModel(description = "Underwriting data that's required to verify the `Identity`.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateAssociatedIdentityRequestEntity {
  public static final String SERIALIZED_NAME_ANNUAL_CARD_VOLUME = "annual_card_volume";
  @SerializedName(SERIALIZED_NAME_ANNUAL_CARD_VOLUME)
  private Long annualCardVolume;

  public static final String SERIALIZED_NAME_BUSINESS_ADDRESS = "business_address";
  @SerializedName(SERIALIZED_NAME_BUSINESS_ADDRESS)
  private CreateAssociatedIdentityRequestEntityBusinessAddress businessAddress;

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
   * Include the value that best applies to the merchant.
   */
  @JsonAdapter(BusinessTypeEnum.Adapter.class)
  public enum BusinessTypeEnum {
    INDIVIDUAL_SOLE_PROPRIETORSHIP("INDIVIDUAL_SOLE_PROPRIETORSHIP"),
    
    CORPORATION("CORPORATION"),
    
    LIMITED_LIABILITY_COMPANY("LIMITED_LIABILITY_COMPANY"),
    
    PARTNERSHIP("PARTNERSHIP"),
    
    ASSOCIATION_ESTATE_TRUST("ASSOCIATION_ESTATE_TRUST"),
    
    TAX_EXEMPT_ORGANIZATION("TAX_EXEMPT_ORGANIZATION"),
    
    INTERNATIONAL_ORGANIZATION("INTERNATIONAL_ORGANIZATION"),
    
    GOVERNMENT_AGENCY("GOVERNMENT_AGENCY"),
    
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

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private CreateAssociatedIdentityRequestEntityDob dob;

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
  private CreateAssociatedIdentityRequestEntityIncorporationDate incorporationDate;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_MAX_TRANSACTION_AMOUNT = "max_transaction_amount";
  @SerializedName(SERIALIZED_NAME_MAX_TRANSACTION_AMOUNT)
  private Long maxTransactionAmount;

  public static final String SERIALIZED_NAME_MCC = "mcc";
  @SerializedName(SERIALIZED_NAME_MCC)
  private String mcc;

  public static final String SERIALIZED_NAME_OWNERSHIP_TYPE = "ownership_type";
  @SerializedName(SERIALIZED_NAME_OWNERSHIP_TYPE)
  private String ownershipType;

  public static final String SERIALIZED_NAME_PERSONAL_ADDRESS = "personal_address";
  @SerializedName(SERIALIZED_NAME_PERSONAL_ADDRESS)
  private CreateAssociatedIdentityRequestEntityPersonalAddress personalAddress;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_PRINCIPAL_PERCENTAGE_OWNERSHIP = "principal_percentage_ownership";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_PERCENTAGE_OWNERSHIP)
  private Long principalPercentageOwnership;

  public static final String SERIALIZED_NAME_TAX_ID = "tax_id";
  @SerializedName(SERIALIZED_NAME_TAX_ID)
  private String taxId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public CreateAssociatedIdentityRequestEntity() { 
  }

  public CreateAssociatedIdentityRequestEntity annualCardVolume(Long annualCardVolume) {
    
    this.annualCardVolume = annualCardVolume;
    return this;
  }

   /**
   * The annual credit card sales (in cents) expected to be processed (max 19 characters).
   * @return annualCardVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The annual credit card sales (in cents) expected to be processed (max 19 characters).")

  public Long getAnnualCardVolume() {
    return annualCardVolume;
  }


  public void setAnnualCardVolume(Long annualCardVolume) {
    this.annualCardVolume = annualCardVolume;
  }


  public CreateAssociatedIdentityRequestEntity businessAddress(CreateAssociatedIdentityRequestEntityBusinessAddress businessAddress) {
    
    this.businessAddress = businessAddress;
    return this;
  }

   /**
   * Get businessAddress
   * @return businessAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateAssociatedIdentityRequestEntityBusinessAddress getBusinessAddress() {
    return businessAddress;
  }


  public void setBusinessAddress(CreateAssociatedIdentityRequestEntityBusinessAddress businessAddress) {
    this.businessAddress = businessAddress;
  }


  public CreateAssociatedIdentityRequestEntity businessName(String businessName) {
    
    this.businessName = businessName;
    return this;
  }

   /**
   * Abbreviated names of the business. If there are no abbreviated name, leave this field blank.
   * @return businessName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Abbreviated names of the business. If there are no abbreviated name, leave this field blank.")

  public String getBusinessName() {
    return businessName;
  }


  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public CreateAssociatedIdentityRequestEntity businessPhone(String businessPhone) {
    
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


  public CreateAssociatedIdentityRequestEntity businessTaxId(String businessTaxId) {
    
    this.businessTaxId = businessTaxId;
    return this;
  }

   /**
   * Details if the &#x60;business_tax_id&#x60; was provided.
   * @return businessTaxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if the `business_tax_id` was provided.")

  public String getBusinessTaxId() {
    return businessTaxId;
  }


  public void setBusinessTaxId(String businessTaxId) {
    this.businessTaxId = businessTaxId;
  }


  public CreateAssociatedIdentityRequestEntity businessType(BusinessTypeEnum businessType) {
    
    this.businessType = businessType;
    return this;
  }

   /**
   * Include the value that best applies to the merchant.
   * @return businessType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include the value that best applies to the merchant.")

  public BusinessTypeEnum getBusinessType() {
    return businessType;
  }


  public void setBusinessType(BusinessTypeEnum businessType) {
    this.businessType = businessType;
  }


  public CreateAssociatedIdentityRequestEntity defaultStatementDescriptor(String defaultStatementDescriptor) {
    
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


  public CreateAssociatedIdentityRequestEntity dob(CreateAssociatedIdentityRequestEntityDob dob) {
    
    this.dob = dob;
    return this;
  }

   /**
   * Get dob
   * @return dob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateAssociatedIdentityRequestEntityDob getDob() {
    return dob;
  }


  public void setDob(CreateAssociatedIdentityRequestEntityDob dob) {
    this.dob = dob;
  }


  public CreateAssociatedIdentityRequestEntity doingBusinessAs(String doingBusinessAs) {
    
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


  public CreateAssociatedIdentityRequestEntity email(String email) {
    
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


  public CreateAssociatedIdentityRequestEntity firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The legal first name of the control owner (max 20 characters).
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The legal first name of the control owner (max 20 characters).")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public CreateAssociatedIdentityRequestEntity hasAcceptedCreditCardsPreviously(Boolean hasAcceptedCreditCardsPreviously) {
    
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


  public CreateAssociatedIdentityRequestEntity incorporationDate(CreateAssociatedIdentityRequestEntityIncorporationDate incorporationDate) {
    
    this.incorporationDate = incorporationDate;
    return this;
  }

   /**
   * Get incorporationDate
   * @return incorporationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateAssociatedIdentityRequestEntityIncorporationDate getIncorporationDate() {
    return incorporationDate;
  }


  public void setIncorporationDate(CreateAssociatedIdentityRequestEntityIncorporationDate incorporationDate) {
    this.incorporationDate = incorporationDate;
  }


  public CreateAssociatedIdentityRequestEntity lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The &#x60;Identity&#x60; owner&#39;s legal last name.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `Identity` owner's legal last name.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public CreateAssociatedIdentityRequestEntity maxTransactionAmount(Long maxTransactionAmount) {
    
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


  public CreateAssociatedIdentityRequestEntity mcc(String mcc) {
    
    this.mcc = mcc;
    return this;
  }

   /**
   * The Merchant Category Code ([MCC](http://www.dm.usda.gov/procurement/card/card_x/mcc.pdf)) that this merchant will be classified under.
   * @return mcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Merchant Category Code ([MCC](http://www.dm.usda.gov/procurement/card/card_x/mcc.pdf)) that this merchant will be classified under.")

  public String getMcc() {
    return mcc;
  }


  public void setMcc(String mcc) {
    this.mcc = mcc;
  }


  public CreateAssociatedIdentityRequestEntity ownershipType(String ownershipType) {
    
    this.ownershipType = ownershipType;
    return this;
  }

   /**
   * Values can be either: &lt;ul&gt;&lt;li&gt;&lt;strong&gt;PUBLIC&lt;/strong&gt; to indicate a publicly-traded company. &lt;li&gt;&lt;strong&gt;PRIVATE&lt;/strong&gt; for privately-held businesses.
   * @return ownershipType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Values can be either: <ul><li><strong>PUBLIC</strong> to indicate a publicly-traded company. <li><strong>PRIVATE</strong> for privately-held businesses.")

  public String getOwnershipType() {
    return ownershipType;
  }


  public void setOwnershipType(String ownershipType) {
    this.ownershipType = ownershipType;
  }


  public CreateAssociatedIdentityRequestEntity personalAddress(CreateAssociatedIdentityRequestEntityPersonalAddress personalAddress) {
    
    this.personalAddress = personalAddress;
    return this;
  }

   /**
   * Get personalAddress
   * @return personalAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateAssociatedIdentityRequestEntityPersonalAddress getPersonalAddress() {
    return personalAddress;
  }


  public void setPersonalAddress(CreateAssociatedIdentityRequestEntityPersonalAddress personalAddress) {
    this.personalAddress = personalAddress;
  }


  public CreateAssociatedIdentityRequestEntity phone(String phone) {
    
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


  public CreateAssociatedIdentityRequestEntity principalPercentageOwnership(Long principalPercentageOwnership) {
    
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


  public CreateAssociatedIdentityRequestEntity taxId(String taxId) {
    
    this.taxId = taxId;
    return this;
  }

   /**
   * Details if the &#x60;tax_id&#x60; was provided.
   * @return taxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if the `tax_id` was provided.")

  public String getTaxId() {
    return taxId;
  }


  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  public CreateAssociatedIdentityRequestEntity title(String title) {
    
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


  public CreateAssociatedIdentityRequestEntity url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL of the &#x60;Identity&#x60; owner&#39;s public website.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the `Identity` owner's public website.")

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
    CreateAssociatedIdentityRequestEntity createAssociatedIdentityRequestEntity = (CreateAssociatedIdentityRequestEntity) o;
    return Objects.equals(this.annualCardVolume, createAssociatedIdentityRequestEntity.annualCardVolume) &&
        Objects.equals(this.businessAddress, createAssociatedIdentityRequestEntity.businessAddress) &&
        Objects.equals(this.businessName, createAssociatedIdentityRequestEntity.businessName) &&
        Objects.equals(this.businessPhone, createAssociatedIdentityRequestEntity.businessPhone) &&
        Objects.equals(this.businessTaxId, createAssociatedIdentityRequestEntity.businessTaxId) &&
        Objects.equals(this.businessType, createAssociatedIdentityRequestEntity.businessType) &&
        Objects.equals(this.defaultStatementDescriptor, createAssociatedIdentityRequestEntity.defaultStatementDescriptor) &&
        Objects.equals(this.dob, createAssociatedIdentityRequestEntity.dob) &&
        Objects.equals(this.doingBusinessAs, createAssociatedIdentityRequestEntity.doingBusinessAs) &&
        Objects.equals(this.email, createAssociatedIdentityRequestEntity.email) &&
        Objects.equals(this.firstName, createAssociatedIdentityRequestEntity.firstName) &&
        Objects.equals(this.hasAcceptedCreditCardsPreviously, createAssociatedIdentityRequestEntity.hasAcceptedCreditCardsPreviously) &&
        Objects.equals(this.incorporationDate, createAssociatedIdentityRequestEntity.incorporationDate) &&
        Objects.equals(this.lastName, createAssociatedIdentityRequestEntity.lastName) &&
        Objects.equals(this.maxTransactionAmount, createAssociatedIdentityRequestEntity.maxTransactionAmount) &&
        Objects.equals(this.mcc, createAssociatedIdentityRequestEntity.mcc) &&
        Objects.equals(this.ownershipType, createAssociatedIdentityRequestEntity.ownershipType) &&
        Objects.equals(this.personalAddress, createAssociatedIdentityRequestEntity.personalAddress) &&
        Objects.equals(this.phone, createAssociatedIdentityRequestEntity.phone) &&
        Objects.equals(this.principalPercentageOwnership, createAssociatedIdentityRequestEntity.principalPercentageOwnership) &&
        Objects.equals(this.taxId, createAssociatedIdentityRequestEntity.taxId) &&
        Objects.equals(this.title, createAssociatedIdentityRequestEntity.title) &&
        Objects.equals(this.url, createAssociatedIdentityRequestEntity.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(annualCardVolume, businessAddress, businessName, businessPhone, businessTaxId, businessType, defaultStatementDescriptor, dob, doingBusinessAs, email, firstName, hasAcceptedCreditCardsPreviously, incorporationDate, lastName, maxTransactionAmount, mcc, ownershipType, personalAddress, phone, principalPercentageOwnership, taxId, title, url);
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
    sb.append("class CreateAssociatedIdentityRequestEntity {\n");
    sb.append("    annualCardVolume: ").append(toIndentedString(annualCardVolume)).append("\n");
    sb.append("    businessAddress: ").append(toIndentedString(businessAddress)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessPhone: ").append(toIndentedString(businessPhone)).append("\n");
    sb.append("    businessTaxId: ").append(toIndentedString(businessTaxId)).append("\n");
    sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
    sb.append("    defaultStatementDescriptor: ").append(toIndentedString(defaultStatementDescriptor)).append("\n");
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
    openapiFields.add("annual_card_volume");
    openapiFields.add("business_address");
    openapiFields.add("business_name");
    openapiFields.add("business_phone");
    openapiFields.add("business_tax_id");
    openapiFields.add("business_type");
    openapiFields.add("default_statement_descriptor");
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
    openapiFields.add("tax_id");
    openapiFields.add("title");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateAssociatedIdentityRequestEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateAssociatedIdentityRequestEntity.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAssociatedIdentityRequestEntity is not found in the empty JSON string", CreateAssociatedIdentityRequestEntity.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateAssociatedIdentityRequestEntity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateAssociatedIdentityRequestEntity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `business_address`
     // if (jsonObj.getAsJsonObject("business_address") != null) {
       //CreateAssociatedIdentityRequestEntityBusinessAddress.validateJsonObject(jsonObj.getAsJsonObject("business_address"));
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
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `dob`
     // if (jsonObj.getAsJsonObject("dob") != null) {
       //CreateAssociatedIdentityRequestEntityDob.validateJsonObject(jsonObj.getAsJsonObject("dob"));
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
       //CreateAssociatedIdentityRequestEntityIncorporationDate.validateJsonObject(jsonObj.getAsJsonObject("incorporation_date"));
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
       //CreateAssociatedIdentityRequestEntityPersonalAddress.validateJsonObject(jsonObj.getAsJsonObject("personal_address"));
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
       if (!CreateAssociatedIdentityRequestEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAssociatedIdentityRequestEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAssociatedIdentityRequestEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAssociatedIdentityRequestEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAssociatedIdentityRequestEntity>() {
           @Override
           public void write(JsonWriter out, CreateAssociatedIdentityRequestEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAssociatedIdentityRequestEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateAssociatedIdentityRequestEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateAssociatedIdentityRequestEntity
  * @throws IOException if the JSON string is invalid with respect to CreateAssociatedIdentityRequestEntity
  */
  public static CreateAssociatedIdentityRequestEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAssociatedIdentityRequestEntity.class);
  }

 /**
  * Convert an instance of CreateAssociatedIdentityRequestEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

