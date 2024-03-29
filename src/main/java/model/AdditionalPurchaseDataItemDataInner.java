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
 * AdditionalPurchaseDataItemDataInner
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdditionalPurchaseDataItemDataInner {
  public static final String SERIALIZED_NAME_AMOUNT_EXCLUDING_SALES_TAX = "amount_excluding_sales_tax";
  @SerializedName(SERIALIZED_NAME_AMOUNT_EXCLUDING_SALES_TAX)
  private Long amountExcludingSalesTax;

  public static final String SERIALIZED_NAME_AMOUNT_INCLUDING_SALES_TAX = "amount_including_sales_tax";
  @SerializedName(SERIALIZED_NAME_AMOUNT_INCLUDING_SALES_TAX)
  private Long amountIncludingSalesTax;

  public static final String SERIALIZED_NAME_COMMODITY_CODE = "commodity_code";
  @SerializedName(SERIALIZED_NAME_COMMODITY_CODE)
  private String commodityCode;

  public static final String SERIALIZED_NAME_COST_PER_UNIT = "cost_per_unit";
  @SerializedName(SERIALIZED_NAME_COST_PER_UNIT)
  private Long costPerUnit;

  public static final String SERIALIZED_NAME_ITEM_DESCRIPTION = "item_description";
  @SerializedName(SERIALIZED_NAME_ITEM_DESCRIPTION)
  private String itemDescription;

  public static final String SERIALIZED_NAME_ITEM_DISCOUNT_AMOUNT = "item_discount_amount";
  @SerializedName(SERIALIZED_NAME_ITEM_DISCOUNT_AMOUNT)
  private Long itemDiscountAmount;

  public static final String SERIALIZED_NAME_MERCHANT_PRODUCT_CODE = "merchant_product_code";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PRODUCT_CODE)
  private String merchantProductCode;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Long quantity;

  public static final String SERIALIZED_NAME_UNIT_OF_MEASURE = "unit_of_measure";
  @SerializedName(SERIALIZED_NAME_UNIT_OF_MEASURE)
  private String unitOfMeasure;

  public AdditionalPurchaseDataItemDataInner() { 
  }

  public AdditionalPurchaseDataItemDataInner amountExcludingSalesTax(Long amountExcludingSalesTax) {
    
    this.amountExcludingSalesTax = amountExcludingSalesTax;
    return this;
  }

   /**
   * Total cost in cents of the line item excluding tax.
   * @return amountExcludingSalesTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total cost in cents of the line item excluding tax.")

  public Long getAmountExcludingSalesTax() {
    return amountExcludingSalesTax;
  }


  public void setAmountExcludingSalesTax(Long amountExcludingSalesTax) {
    this.amountExcludingSalesTax = amountExcludingSalesTax;
  }


  public AdditionalPurchaseDataItemDataInner amountIncludingSalesTax(Long amountIncludingSalesTax) {
    
    this.amountIncludingSalesTax = amountIncludingSalesTax;
    return this;
  }

   /**
   * Total cost in cents of the line item including tax.
   * @return amountIncludingSalesTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total cost in cents of the line item including tax.")

  public Long getAmountIncludingSalesTax() {
    return amountIncludingSalesTax;
  }


  public void setAmountIncludingSalesTax(Long amountIncludingSalesTax) {
    this.amountIncludingSalesTax = amountIncludingSalesTax;
  }


  public AdditionalPurchaseDataItemDataInner commodityCode(String commodityCode) {
    
    this.commodityCode = commodityCode;
    return this;
  }

   /**
   * A commodity code is a numeric code representing a particular product or service as defined by the National Institute of Governmental Purchasing. The code can be 3, 5, 7, or 11 digits in length. The longer the code the more granular the description of the product/service. (max 12 characters).
   * @return commodityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A commodity code is a numeric code representing a particular product or service as defined by the National Institute of Governmental Purchasing. The code can be 3, 5, 7, or 11 digits in length. The longer the code the more granular the description of the product/service. (max 12 characters).")

  public String getCommodityCode() {
    return commodityCode;
  }


  public void setCommodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
  }


  public AdditionalPurchaseDataItemDataInner costPerUnit(Long costPerUnit) {
    
    this.costPerUnit = costPerUnit;
    return this;
  }

   /**
   * The price in cents of one unit of the item purchased
   * @return costPerUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The price in cents of one unit of the item purchased")

  public Long getCostPerUnit() {
    return costPerUnit;
  }


  public void setCostPerUnit(Long costPerUnit) {
    this.costPerUnit = costPerUnit;
  }


  public AdditionalPurchaseDataItemDataInner itemDescription(String itemDescription) {
    
    this.itemDescription = itemDescription;
    return this;
  }

   /**
   * Required when &#x60;item_data&#x60; is supplied (max 25 characters)
   * @return itemDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required when `item_data` is supplied (max 25 characters)")

  public String getItemDescription() {
    return itemDescription;
  }


  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }


  public AdditionalPurchaseDataItemDataInner itemDiscountAmount(Long itemDiscountAmount) {
    
    this.itemDiscountAmount = itemDiscountAmount;
    return this;
  }

   /**
   * Item discount amount in cents 
   * @return itemDiscountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Item discount amount in cents ")

  public Long getItemDiscountAmount() {
    return itemDiscountAmount;
  }


  public void setItemDiscountAmount(Long itemDiscountAmount) {
    this.itemDiscountAmount = itemDiscountAmount;
  }


  public AdditionalPurchaseDataItemDataInner merchantProductCode(String merchantProductCode) {
    
    this.merchantProductCode = merchantProductCode;
    return this;
  }

   /**
   * Merchant defined product code (max 12 characters).
   * @return merchantProductCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant defined product code (max 12 characters).")

  public String getMerchantProductCode() {
    return merchantProductCode;
  }


  public void setMerchantProductCode(String merchantProductCode) {
    this.merchantProductCode = merchantProductCode;
  }


  public AdditionalPurchaseDataItemDataInner quantity(Long quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of items purchased. Must be greater than 0.
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of items purchased. Must be greater than 0.")

  public Long getQuantity() {
    return quantity;
  }


  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }


  public AdditionalPurchaseDataItemDataInner unitOfMeasure(String unitOfMeasure) {
    
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

   /**
   * The unit of measure of the purchased item (max 3 characters).
   * @return unitOfMeasure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unit of measure of the purchased item (max 3 characters).")

  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }


  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalPurchaseDataItemDataInner additionalPurchaseDataItemDataInner = (AdditionalPurchaseDataItemDataInner) o;
    return Objects.equals(this.amountExcludingSalesTax, additionalPurchaseDataItemDataInner.amountExcludingSalesTax) &&
        Objects.equals(this.amountIncludingSalesTax, additionalPurchaseDataItemDataInner.amountIncludingSalesTax) &&
        Objects.equals(this.commodityCode, additionalPurchaseDataItemDataInner.commodityCode) &&
        Objects.equals(this.costPerUnit, additionalPurchaseDataItemDataInner.costPerUnit) &&
        Objects.equals(this.itemDescription, additionalPurchaseDataItemDataInner.itemDescription) &&
        Objects.equals(this.itemDiscountAmount, additionalPurchaseDataItemDataInner.itemDiscountAmount) &&
        Objects.equals(this.merchantProductCode, additionalPurchaseDataItemDataInner.merchantProductCode) &&
        Objects.equals(this.quantity, additionalPurchaseDataItemDataInner.quantity) &&
        Objects.equals(this.unitOfMeasure, additionalPurchaseDataItemDataInner.unitOfMeasure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountExcludingSalesTax, amountIncludingSalesTax, commodityCode, costPerUnit, itemDescription, itemDiscountAmount, merchantProductCode, quantity, unitOfMeasure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalPurchaseDataItemDataInner {\n");
    sb.append("    amountExcludingSalesTax: ").append(toIndentedString(amountExcludingSalesTax)).append("\n");
    sb.append("    amountIncludingSalesTax: ").append(toIndentedString(amountIncludingSalesTax)).append("\n");
    sb.append("    commodityCode: ").append(toIndentedString(commodityCode)).append("\n");
    sb.append("    costPerUnit: ").append(toIndentedString(costPerUnit)).append("\n");
    sb.append("    itemDescription: ").append(toIndentedString(itemDescription)).append("\n");
    sb.append("    itemDiscountAmount: ").append(toIndentedString(itemDiscountAmount)).append("\n");
    sb.append("    merchantProductCode: ").append(toIndentedString(merchantProductCode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
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
    openapiFields.add("amount_excluding_sales_tax");
    openapiFields.add("amount_including_sales_tax");
    openapiFields.add("commodity_code");
    openapiFields.add("cost_per_unit");
    openapiFields.add("item_description");
    openapiFields.add("item_discount_amount");
    openapiFields.add("merchant_product_code");
    openapiFields.add("quantity");
    openapiFields.add("unit_of_measure");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdditionalPurchaseDataItemDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdditionalPurchaseDataItemDataInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdditionalPurchaseDataItemDataInner is not found in the empty JSON string", AdditionalPurchaseDataItemDataInner.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdditionalPurchaseDataItemDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdditionalPurchaseDataItemDataInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("commodity_code") != null && !jsonObj.get("commodity_code").isJsonNull()  && !jsonObj.get("commodity_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commodity_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commodity_code").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("item_description") != null && !jsonObj.get("item_description").isJsonNull()  && !jsonObj.get("item_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_description").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("merchant_product_code") != null && !jsonObj.get("merchant_product_code").isJsonNull()  && !jsonObj.get("merchant_product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_product_code").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("unit_of_measure") != null && !jsonObj.get("unit_of_measure").isJsonNull()  && !jsonObj.get("unit_of_measure").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit_of_measure` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit_of_measure").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdditionalPurchaseDataItemDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdditionalPurchaseDataItemDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdditionalPurchaseDataItemDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdditionalPurchaseDataItemDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdditionalPurchaseDataItemDataInner>() {
           @Override
           public void write(JsonWriter out, AdditionalPurchaseDataItemDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdditionalPurchaseDataItemDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdditionalPurchaseDataItemDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdditionalPurchaseDataItemDataInner
  * @throws IOException if the JSON string is invalid with respect to AdditionalPurchaseDataItemDataInner
  */
  public static AdditionalPurchaseDataItemDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdditionalPurchaseDataItemDataInner.class);
  }

 /**
  * Convert an instance of AdditionalPurchaseDataItemDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

