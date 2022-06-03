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


package api;

import invoker.ApiException;
import model.CreateDevice;
import model.Device;
import model.Error401Unauthorized;
import model.Error403ForbiddenList;
import model.Error404NotFoundList;
import model.Error406NotAcceptable;
import model.ErrorGeneric;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevicesApi
 */
@Disabled
public class DevicesApiTest {

    private final DevicesApi api = new DevicesApi();

    /**
     * Create Device
     *
     * Create a device on merchant
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createMerchantDeviceTest() throws ApiException {
        String merchantId = null;
        CreateDevice createDevice = null;
        api.create(merchantId, createDevice);
        // TODO: test validations
    }

    /**
     * Get Device
     *
     * Get an existing device
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDeviceTest() throws ApiException {
        String deviceId = null;
        Device response = api.get(deviceId);
        // TODO: test validations
    }

    /**
     * Put Device
     *
     * Update a device in order to perform an action on it.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putDeviceTest() throws ApiException {
        String deviceId = null;
        Object body = null;
        Device response = api.update(deviceId, body);
        // TODO: test validations
    }

}