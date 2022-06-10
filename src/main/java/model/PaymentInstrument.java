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
import model.Address;
import model.Country;
import model.Currency;
import model.PaymentInstrumentBankAccount;
import model.PaymentInstrumentBankAccountLinks;
import model.PaymentInstrumentOther;
import model.PaymentInstrumentPaymentCard;
import model.PaymentInstrumentToken;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import invoker.JSON;

@lombok.Builder
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-09T19:07:27.149649-05:00[America/Chicago]")
public class PaymentInstrument extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(PaymentInstrument.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PaymentInstrument.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PaymentInstrument' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PaymentInstrumentBankAccount> adapterPaymentInstrumentBankAccount = gson.getDelegateAdapter(this, TypeToken.get(PaymentInstrumentBankAccount.class));
            final TypeAdapter<PaymentInstrumentOther> adapterPaymentInstrumentOther = gson.getDelegateAdapter(this, TypeToken.get(PaymentInstrumentOther.class));
            final TypeAdapter<PaymentInstrumentPaymentCard> adapterPaymentInstrumentPaymentCard = gson.getDelegateAdapter(this, TypeToken.get(PaymentInstrumentPaymentCard.class));
            final TypeAdapter<PaymentInstrumentToken> adapterPaymentInstrumentToken = gson.getDelegateAdapter(this, TypeToken.get(PaymentInstrumentToken.class));

            return (TypeAdapter<T>) new TypeAdapter<PaymentInstrument>() {
                @Override
                public void write(JsonWriter out, PaymentInstrument value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `PaymentInstrumentBankAccount`
                    if (value.getActualInstance() instanceof PaymentInstrumentBankAccount) {
                        JsonObject obj = adapterPaymentInstrumentBankAccount.toJsonTree((PaymentInstrumentBankAccount)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `PaymentInstrumentOther`
                    if (value.getActualInstance() instanceof PaymentInstrumentOther) {
                        JsonObject obj = adapterPaymentInstrumentOther.toJsonTree((PaymentInstrumentOther)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `PaymentInstrumentPaymentCard`
                    if (value.getActualInstance() instanceof PaymentInstrumentPaymentCard) {
                        JsonObject obj = adapterPaymentInstrumentPaymentCard.toJsonTree((PaymentInstrumentPaymentCard)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `PaymentInstrumentToken`
                    if (value.getActualInstance() instanceof PaymentInstrumentToken) {
                        JsonObject obj = adapterPaymentInstrumentToken.toJsonTree((PaymentInstrumentToken)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: PaymentInstrumentBankAccount, PaymentInstrumentOther, PaymentInstrumentPaymentCard, PaymentInstrumentToken");
                }

                @Override
                public PaymentInstrument read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize PaymentInstrumentBankAccount
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PaymentInstrumentBankAccount.validateJsonObject(jsonObject);
                        actualAdapter = adapterPaymentInstrumentBankAccount;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PaymentInstrumentBankAccount'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'PaymentInstrumentBankAccount'", e);
                    }

                    // deserialize PaymentInstrumentOther
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PaymentInstrumentOther.validateJsonObject(jsonObject);
                        actualAdapter = adapterPaymentInstrumentOther;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PaymentInstrumentOther'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'PaymentInstrumentOther'", e);
                    }

                    // deserialize PaymentInstrumentPaymentCard
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PaymentInstrumentPaymentCard.validateJsonObject(jsonObject);
                        actualAdapter = adapterPaymentInstrumentPaymentCard;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PaymentInstrumentPaymentCard'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'PaymentInstrumentPaymentCard'", e);
                    }

                    // deserialize PaymentInstrumentToken
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PaymentInstrumentToken.validateJsonObject(jsonObject);
                        actualAdapter = adapterPaymentInstrumentToken;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PaymentInstrumentToken'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'PaymentInstrumentToken'", e);
                    }

                    if (match == 1) {
                        PaymentInstrument ret = new PaymentInstrument();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for PaymentInstrument: %d classes match result, expected 1. JSON: %s", match, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public PaymentInstrument() {
        super("oneOf", Boolean.FALSE);
    }

    public PaymentInstrument(PaymentInstrumentBankAccount o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PaymentInstrument(PaymentInstrumentOther o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PaymentInstrument(PaymentInstrumentPaymentCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PaymentInstrument(PaymentInstrumentToken o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PaymentInstrumentBankAccount", new GenericType<PaymentInstrumentBankAccount>() {
        });
        schemas.put("PaymentInstrumentOther", new GenericType<PaymentInstrumentOther>() {
        });
        schemas.put("PaymentInstrumentPaymentCard", new GenericType<PaymentInstrumentPaymentCard>() {
        });
        schemas.put("PaymentInstrumentToken", new GenericType<PaymentInstrumentToken>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return PaymentInstrument.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * PaymentInstrumentBankAccount, PaymentInstrumentOther, PaymentInstrumentPaymentCard, PaymentInstrumentToken
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof PaymentInstrumentBankAccount) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PaymentInstrumentOther) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PaymentInstrumentPaymentCard) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PaymentInstrumentToken) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PaymentInstrumentBankAccount, PaymentInstrumentOther, PaymentInstrumentPaymentCard, PaymentInstrumentToken");
    }

    /**
     * Get the actual instance, which can be the following:
     * PaymentInstrumentBankAccount, PaymentInstrumentOther, PaymentInstrumentPaymentCard, PaymentInstrumentToken
     *
     * @return The actual instance (PaymentInstrumentBankAccount, PaymentInstrumentOther, PaymentInstrumentPaymentCard, PaymentInstrumentToken)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PaymentInstrumentBankAccount`. If the actual instance is not `PaymentInstrumentBankAccount`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentInstrumentBankAccount`
     * @throws ClassCastException if the instance is not `PaymentInstrumentBankAccount`
     */
    public PaymentInstrumentBankAccount getPaymentInstrumentBankAccount() throws ClassCastException {
        return (PaymentInstrumentBankAccount)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PaymentInstrumentOther`. If the actual instance is not `PaymentInstrumentOther`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentInstrumentOther`
     * @throws ClassCastException if the instance is not `PaymentInstrumentOther`
     */
    public PaymentInstrumentOther getPaymentInstrumentOther() throws ClassCastException {
        return (PaymentInstrumentOther)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PaymentInstrumentPaymentCard`. If the actual instance is not `PaymentInstrumentPaymentCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentInstrumentPaymentCard`
     * @throws ClassCastException if the instance is not `PaymentInstrumentPaymentCard`
     */
    public PaymentInstrumentPaymentCard getPaymentInstrumentPaymentCard() throws ClassCastException {
        return (PaymentInstrumentPaymentCard)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PaymentInstrumentToken`. If the actual instance is not `PaymentInstrumentToken`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentInstrumentToken`
     * @throws ClassCastException if the instance is not `PaymentInstrumentToken`
     */
    public PaymentInstrumentToken getPaymentInstrumentToken() throws ClassCastException {
        return (PaymentInstrumentToken)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentInstrument
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    // validate the json string with PaymentInstrumentBankAccount
    try {
      PaymentInstrumentBankAccount.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with PaymentInstrumentOther
    try {
      PaymentInstrumentOther.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with PaymentInstrumentPaymentCard
    try {
      PaymentInstrumentPaymentCard.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with PaymentInstrumentToken
    try {
      PaymentInstrumentToken.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for PaymentInstrument with oneOf schemas: PaymentInstrumentBankAccount, PaymentInstrumentOther, PaymentInstrumentPaymentCard, PaymentInstrumentToken. %d class(es) match the result, expected 1. JSON: %s", validCount, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of PaymentInstrument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentInstrument
  * @throws IOException if the JSON string is invalid with respect to PaymentInstrument
  */
  public static PaymentInstrument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentInstrument.class);
  }

 /**
  * Convert an instance of PaymentInstrument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

