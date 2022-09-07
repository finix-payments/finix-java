/*
 * Finix API
 */


package api;

import invoker.ApiException;
import invoker.Environment;
import invoker.FinixClient;
import model.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * API tests for DevicesApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running DevicesApiTest")
public class DevicesApiTest {
    private FinixClient finixClient;
    private TestInfo testInfo;
    private TestReporter testReporter;
    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter){
        this.testInfo =testInfo;
        this.testReporter =testReporter;
        testReporter.publishEntry("Running "+testInfo.getDisplayName()+ " with tag " + testInfo.getTags());
    }
    /**
     * Create a Context Loads
     */
    @Test
    @BeforeAll
    @DisplayName("Finix Client")
    void contextLoads() {
        finixClient= new FinixClient("USjHFGYvecE4LBitYG8KDE2g","b698f403-d9b7-4157-82d8-162cea8c8cc3", Environment.SANDBOX);
        assertEquals(true , finixClient!=null);
    }
    /**
     * Create a Device
     *
     * Create a &#x60;Device&#x60; under a &#x60;Merchant&#x60;.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Create a Device")
    public void createMerchantDeviceTest() throws ApiException {
        String merchantId = "MUu56ZGx3Xb6U9gAqKfgNisd";
        CreateDevice createDevice = CreateDevice.builder()
                .name("Finix  triPOS #1")
                .model(CreateDevice.ModelEnum.MX915)
                .description("Mike Jones")
                ._configuration(ConfigurationDetails.builder()
                        .allowDebit(true)
                        .promptSignature("NEVER")
                        .bypassDeviceOnCapture(true)
                        .build())
                .build();
        Device response = finixClient.Devices.create(merchantId, createDevice);
        assertEquals("MUu56ZGx3Xb6U9gAqKfgNisd",response.getMerchant(),()->"Should return " + "MUu56ZGx3Xb6U9gAqKfgNisd" + " but returns " + response.getMerchant());
        assertEquals(createDevice.getName(), response.getName());
        assertEquals("MX915", response.getModel());
    }

    /**
     * Get Device
     *
     * Retrieve the details of an existing &#x60;Device&#x60;.  To check the connectivity of the device, include &#x60;?include_connection\\&#x3D;true \\&#x60; at the end of the request endpoint.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName(" Get Device")
    public void getDeviceTest() throws ApiException {
        String deviceId = "DVf2H8sh4LZZC52GTUrwCPPf";
        GetDeviceQueryParams getDeviceQueryParams = new GetDeviceQueryParams();
        Device response = finixClient.Devices.get(deviceId, getDeviceQueryParams);
        assertEquals("MUu56ZGx3Xb6U9gAqKfgNisd",response.getMerchant(),()->"Should return " + "MUu56ZGx3Xb6U9gAqKfgNisd" + " but returns " + response.getMerchant());
        // assertEquals(true, response.getConfigurationDetails().getAllowDebit());
    }

}
