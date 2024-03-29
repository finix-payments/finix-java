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
import java.util.ArrayList;
import java.util.List;
import model.AdditionalPurchaseDataItemDataInner;
import model.AdditionalPurchaseDataOrderDate;

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
 * Additional information about the purchase. Used for Level 2 and Level 3 Processing.
 */
@ApiModel(description = "Additional information about the purchase. Used for Level 2 and Level 3 Processing.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdditionalPurchaseData {
  public static final String SERIALIZED_NAME_CUSTOMER_REFERENCE_NUMBER = "customer_reference_number";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_REFERENCE_NUMBER)
  private String customerReferenceNumber;

  public static final String SERIALIZED_NAME_CUSTOMS_DUTY_AMOUNT = "customs_duty_amount";
  @SerializedName(SERIALIZED_NAME_CUSTOMS_DUTY_AMOUNT)
  private Long customsDutyAmount;

  public static final String SERIALIZED_NAME_DESTINATION_COUNTRY_CODE = "destination_country_code";
  @SerializedName(SERIALIZED_NAME_DESTINATION_COUNTRY_CODE)
  private String destinationCountryCode;

  public static final String SERIALIZED_NAME_DESTINATION_POSTAL_CODE = "destination_postal_code";
  @SerializedName(SERIALIZED_NAME_DESTINATION_POSTAL_CODE)
  private String destinationPostalCode;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private Long discountAmount;

  public static final String SERIALIZED_NAME_INVOICE_REFERENCE_NUMBER = "invoice_reference_number";
  @SerializedName(SERIALIZED_NAME_INVOICE_REFERENCE_NUMBER)
  private String invoiceReferenceNumber;

  public static final String SERIALIZED_NAME_ITEM_DATA = "item_data";
  @SerializedName(SERIALIZED_NAME_ITEM_DATA)
  private List<AdditionalPurchaseDataItemDataInner> itemData = null;

  public static final String SERIALIZED_NAME_ORDER_DATE = "order_date";
  @SerializedName(SERIALIZED_NAME_ORDER_DATE)
  private AdditionalPurchaseDataOrderDate orderDate;

  public static final String SERIALIZED_NAME_SALES_TAX = "sales_tax";
  @SerializedName(SERIALIZED_NAME_SALES_TAX)
  private Long salesTax;

  public static final String SERIALIZED_NAME_SHIP_FROM_POSTAL_CODE = "ship_from_postal_code";
  @SerializedName(SERIALIZED_NAME_SHIP_FROM_POSTAL_CODE)
  private String shipFromPostalCode;

  public static final String SERIALIZED_NAME_SHIPPING_AMOUNT = "shipping_amount";
  @SerializedName(SERIALIZED_NAME_SHIPPING_AMOUNT)
  private Long shippingAmount;

  public static final String SERIALIZED_NAME_TAX_EXEMPT = "tax_exempt";
  @SerializedName(SERIALIZED_NAME_TAX_EXEMPT)
  private Boolean taxExempt;

  public AdditionalPurchaseData() { 
  }

  public AdditionalPurchaseData customerReferenceNumber(String customerReferenceNumber) {
    
    this.customerReferenceNumber = customerReferenceNumber;
    return this;
  }

   /**
   * The customer reference for the purchase (max 17 characters).
   * @return customerReferenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The customer reference for the purchase (max 17 characters).")

  public String getCustomerReferenceNumber() {
    return customerReferenceNumber;
  }


  public void setCustomerReferenceNumber(String customerReferenceNumber) {
    this.customerReferenceNumber = customerReferenceNumber;
  }


  public AdditionalPurchaseData customsDutyAmount(Long customsDutyAmount) {
    
    this.customsDutyAmount = customsDutyAmount;
    return this;
  }

   /**
   * The duty in cents on the total purchase amount for the order
   * @return customsDutyAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The duty in cents on the total purchase amount for the order")

  public Long getCustomsDutyAmount() {
    return customsDutyAmount;
  }


  public void setCustomsDutyAmount(Long customsDutyAmount) {
    this.customsDutyAmount = customsDutyAmount;
  }


  public AdditionalPurchaseData destinationCountryCode(String destinationCountryCode) {
    
    this.destinationCountryCode = destinationCountryCode;
    return this;
  }

   /**
   * The ISO country code of the order destination.
   * @return destinationCountryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO country code of the order destination.")

  public String getDestinationCountryCode() {
    return destinationCountryCode;
  }


  public void setDestinationCountryCode(String destinationCountryCode) {
    this.destinationCountryCode = destinationCountryCode;
  }


  public AdditionalPurchaseData destinationPostalCode(String destinationPostalCode) {
    
    this.destinationPostalCode = destinationPostalCode;
    return this;
  }

   /**
   * The postal code of the order destination (10 characters)
   * @return destinationPostalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postal code of the order destination (10 characters)")

  public String getDestinationPostalCode() {
    return destinationPostalCode;
  }


  public void setDestinationPostalCode(String destinationPostalCode) {
    this.destinationPostalCode = destinationPostalCode;
  }


  public AdditionalPurchaseData discountAmount(Long discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * The amount in cents of the discount for the order.
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount in cents of the discount for the order.")

  public Long getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(Long discountAmount) {
    this.discountAmount = discountAmount;
  }


  public AdditionalPurchaseData invoiceReferenceNumber(String invoiceReferenceNumber) {
    
    this.invoiceReferenceNumber = invoiceReferenceNumber;
    return this;
  }

   /**
   * The order&#39;s invoice number (max 15 characters)
   * @return invoiceReferenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The order's invoice number (max 15 characters)")

  public String getInvoiceReferenceNumber() {
    return invoiceReferenceNumber;
  }


  public void setInvoiceReferenceNumber(String invoiceReferenceNumber) {
    this.invoiceReferenceNumber = invoiceReferenceNumber;
  }


  public AdditionalPurchaseData itemData(List<AdditionalPurchaseDataItemDataInner> itemData) {
    
    this.itemData = itemData;
    return this;
  }

  public AdditionalPurchaseData addItemDataItem(AdditionalPurchaseDataItemDataInner itemDataItem) {
    if (this.itemData == null) {
      this.itemData = new ArrayList<>();
    }
    this.itemData.add(itemDataItem);
    return this;
  }

   /**
   * Additional information about the transaction. Used for Level 2 and Level 3 Processing.
   * @return itemData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional information about the transaction. Used for Level 2 and Level 3 Processing.")

  public List<AdditionalPurchaseDataItemDataInner> getItemData() {
    return itemData;
  }


  public void setItemData(List<AdditionalPurchaseDataItemDataInner> itemData) {
    this.itemData = itemData;
  }


  public AdditionalPurchaseData orderDate(AdditionalPurchaseDataOrderDate orderDate) {
    
    this.orderDate = orderDate;
    return this;
  }

   /**
   * Get orderDate
   * @return orderDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdditionalPurchaseDataOrderDate getOrderDate() {
    return orderDate;
  }


  public void setOrderDate(AdditionalPurchaseDataOrderDate orderDate) {
    this.orderDate = orderDate;
  }


  public AdditionalPurchaseData salesTax(Long salesTax) {
    
    this.salesTax = salesTax;
    return this;
  }

   /**
   * Total aggregate tax amount in cents for the entire purchase. Field is automatically calculated if you pass in the itemized tax amounts.   For non-taxable transactions either set &#x60;sales_tax&#x60; to 0 or omit from payload and also set &#x60;tax_exempt&#x60; to **True**.
   * @return salesTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total aggregate tax amount in cents for the entire purchase. Field is automatically calculated if you pass in the itemized tax amounts.   For non-taxable transactions either set `sales_tax` to 0 or omit from payload and also set `tax_exempt` to **True**.")

  public Long getSalesTax() {
    return salesTax;
  }


  public void setSalesTax(Long salesTax) {
    this.salesTax = salesTax;
  }


  public AdditionalPurchaseData shipFromPostalCode(String shipFromPostalCode) {
    
    this.shipFromPostalCode = shipFromPostalCode;
    return this;
  }

   /**
   * The postal code from where order is shipped (10 characters)
   * @return shipFromPostalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postal code from where order is shipped (10 characters)")

  public String getShipFromPostalCode() {
    return shipFromPostalCode;
  }


  public void setShipFromPostalCode(String shipFromPostalCode) {
    this.shipFromPostalCode = shipFromPostalCode;
  }


  public AdditionalPurchaseData shippingAmount(Long shippingAmount) {
    
    this.shippingAmount = shippingAmount;
    return this;
  }

   /**
   * The shipping cost in cents for the order. 
   * @return shippingAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The shipping cost in cents for the order. ")

  public Long getShippingAmount() {
    return shippingAmount;
  }


  public void setShippingAmount(Long shippingAmount) {
    this.shippingAmount = shippingAmount;
  }


  public AdditionalPurchaseData taxExempt(Boolean taxExempt) {
    
    this.taxExempt = taxExempt;
    return this;
  }

   /**
   * For tax exempt purchases set to True.
   * @return taxExempt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For tax exempt purchases set to True.")

  public Boolean getTaxExempt() {
    return taxExempt;
  }


  public void setTaxExempt(Boolean taxExempt) {
    this.taxExempt = taxExempt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalPurchaseData additionalPurchaseData = (AdditionalPurchaseData) o;
    return Objects.equals(this.customerReferenceNumber, additionalPurchaseData.customerReferenceNumber) &&
        Objects.equals(this.customsDutyAmount, additionalPurchaseData.customsDutyAmount) &&
        Objects.equals(this.destinationCountryCode, additionalPurchaseData.destinationCountryCode) &&
        Objects.equals(this.destinationPostalCode, additionalPurchaseData.destinationPostalCode) &&
        Objects.equals(this.discountAmount, additionalPurchaseData.discountAmount) &&
        Objects.equals(this.invoiceReferenceNumber, additionalPurchaseData.invoiceReferenceNumber) &&
        Objects.equals(this.itemData, additionalPurchaseData.itemData) &&
        Objects.equals(this.orderDate, additionalPurchaseData.orderDate) &&
        Objects.equals(this.salesTax, additionalPurchaseData.salesTax) &&
        Objects.equals(this.shipFromPostalCode, additionalPurchaseData.shipFromPostalCode) &&
        Objects.equals(this.shippingAmount, additionalPurchaseData.shippingAmount) &&
        Objects.equals(this.taxExempt, additionalPurchaseData.taxExempt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReferenceNumber, customsDutyAmount, destinationCountryCode, destinationPostalCode, discountAmount, invoiceReferenceNumber, itemData, orderDate, salesTax, shipFromPostalCode, shippingAmount, taxExempt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalPurchaseData {\n");
    sb.append("    customerReferenceNumber: ").append(toIndentedString(customerReferenceNumber)).append("\n");
    sb.append("    customsDutyAmount: ").append(toIndentedString(customsDutyAmount)).append("\n");
    sb.append("    destinationCountryCode: ").append(toIndentedString(destinationCountryCode)).append("\n");
    sb.append("    destinationPostalCode: ").append(toIndentedString(destinationPostalCode)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    invoiceReferenceNumber: ").append(toIndentedString(invoiceReferenceNumber)).append("\n");
    sb.append("    itemData: ").append(toIndentedString(itemData)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    salesTax: ").append(toIndentedString(salesTax)).append("\n");
    sb.append("    shipFromPostalCode: ").append(toIndentedString(shipFromPostalCode)).append("\n");
    sb.append("    shippingAmount: ").append(toIndentedString(shippingAmount)).append("\n");
    sb.append("    taxExempt: ").append(toIndentedString(taxExempt)).append("\n");
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
    openapiFields.add("customer_reference_number");
    openapiFields.add("customs_duty_amount");
    openapiFields.add("destination_country_code");
    openapiFields.add("destination_postal_code");
    openapiFields.add("discount_amount");
    openapiFields.add("invoice_reference_number");
    openapiFields.add("item_data");
    openapiFields.add("order_date");
    openapiFields.add("sales_tax");
    openapiFields.add("ship_from_postal_code");
    openapiFields.add("shipping_amount");
    openapiFields.add("tax_exempt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdditionalPurchaseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdditionalPurchaseData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdditionalPurchaseData is not found in the empty JSON string", AdditionalPurchaseData.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdditionalPurchaseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdditionalPurchaseData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("customer_reference_number") != null && !jsonObj.get("customer_reference_number").isJsonNull()  && !jsonObj.get("customer_reference_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_reference_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_reference_number").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("destination_country_code") != null && !jsonObj.get("destination_country_code").isJsonNull()  && !jsonObj.get("destination_country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destination_country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destination_country_code").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("destination_postal_code") != null && !jsonObj.get("destination_postal_code").isJsonNull()  && !jsonObj.get("destination_postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destination_postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destination_postal_code").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("invoice_reference_number") != null && !jsonObj.get("invoice_reference_number").isJsonNull()  && !jsonObj.get("invoice_reference_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_reference_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_reference_number").toString()));
      }
      JsonArray jsonArrayitemData = jsonObj.getAsJsonArray("item_data");
      if (jsonArrayitemData != null) {
        // ensure the json data is an array
        if (!jsonObj.get("item_data").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `item_data` to be an array in the JSON string but got `%s`", jsonObj.get("item_data").toString()));
        }

        // validate the optional field `item_data` (array)
        for (int i = 0; i < jsonArrayitemData.size(); i++) {
          AdditionalPurchaseDataItemDataInner.validateJsonObject(jsonArrayitemData.get(i).getAsJsonObject());
        }
          ;
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `order_date`
     // if (jsonObj.getAsJsonObject("order_date") != null) {
       //AdditionalPurchaseDataOrderDate.validateJsonObject(jsonObj.getAsJsonObject("order_date"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("ship_from_postal_code") != null && !jsonObj.get("ship_from_postal_code").isJsonNull()  && !jsonObj.get("ship_from_postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ship_from_postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ship_from_postal_code").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdditionalPurchaseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdditionalPurchaseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdditionalPurchaseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdditionalPurchaseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AdditionalPurchaseData>() {
           @Override
           public void write(JsonWriter out, AdditionalPurchaseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdditionalPurchaseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdditionalPurchaseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdditionalPurchaseData
  * @throws IOException if the JSON string is invalid with respect to AdditionalPurchaseData
  */
  public static AdditionalPurchaseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdditionalPurchaseData.class);
  }

 /**
  * Convert an instance of AdditionalPurchaseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

