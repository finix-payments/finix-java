package payloads;

import invoker.ApiException;
import invoker.Environment;
import invoker.FinixClient;
import model.ApplePaySession;
import model.ApplePaySessionRequest;
import model.CreatePaymentInstrumentRequest;
import model.PaymentInstrument;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("ApplePayOnWebTest")
public class ApplePayOnWebTest {
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
        finixClient= new FinixClient("USwV2ayDfbTwjUmrftEBKhgk","9bf27419-0ef6-40f5-bce7-3b0eafb1ac88", Environment.SANDBOX);
        assertEquals(true , finixClient!=null);
    }

    @Test
    public void createApplePaySessionTest() throws ApiException {
        ApplePaySessionRequest applePaySessionRequest = ApplePaySessionRequest.builder()
                .displayName("Finix Test Merchant")
                .domain("www.finixtestmerchant.com")
                .merchantIdentity("IDmULj61C8ke6Y7qQiKENJ7")
                .validationUrl("https://apple-pay-gateway-cert.apple.com/paymentservices/paymentSession")
                .build();

        //FinixClient tempClient = new FinixClient("USsRhsHYZGBPnQw8CByJyEQW","8a14c2f9-d94b-4c72-8f5c-a62908e5b30e", Environment.SANDBOX);
        ApplePaySession response = finixClient.PaymentInstruments.createApplePaySession(applePaySessionRequest);
        assertTrue(response.getId() instanceof String, "Response should return id with type of String but returns " + response.getId().getClass());
    }

    @Test
    @DisplayName("Apple Pay on Web - Step 6: Create a Payment")
    void createApplePaymentTest() throws ApiException {
        FinixClient tempClient = new FinixClient("USsRhsHYZGBPnQw8CByJyEQW","8a14c2f9-d94b-4c72-8f5c-a62908e5b30e", Environment.SANDBOX);

        CreatePaymentInstrumentRequest createPaymentInstrumentRequest = CreatePaymentInstrumentRequest.builder()
                .identity("IDgWxBhfGYLLdkhxx2ddYf9K")
                .merchantIdentity("IDpYDM7J9n57q849o9E9yNrG")
                .name("John Smith")
                .thirdPartyToken("token")
                .type(CreatePaymentInstrumentRequest.TypeEnum.APPLE_PAY)
                .build();
        PaymentInstrument response = tempClient.PaymentInstruments.create(createPaymentInstrumentRequest);
        System.out.println(response.toJson());
    }
    @Test
    @DisplayName("Google Pay on Web - Step 9: Create a Payment")
    void createGooglePaymentTest() throws ApiException {
        FinixClient tempClient = new FinixClient("USsRhsHYZGBPnQw8CByJyEQW","8a14c2f9-d94b-4c72-8f5c-a62908e5b30e", Environment.SANDBOX);

        CreatePaymentInstrumentRequest createPaymentInstrumentRequest = CreatePaymentInstrumentRequest.builder()
                .identity("ID78Fh8mcnnzukVzbdoyex5y")
                .merchantIdentity("IDwhCCvPwCDEmiFd8Be7pDzN")
                .name("Finix Sandbox")
                .thirdPartyToken("{\"signature\":\"MEYCIQCYTkaEMgug7pcjzEEdbIn+R57kYO5yYc2KYj41AQQn9wIhAN1QvylvZ2XydVecfejwi2xYS9y3Y9y/MmDnRnUfNw5H\",\"intermediateSigningKey\":{\"signedKey\":\"{\\\"keyValue\\\":\\\"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE4xc3fjeM9SMTjd1TL2GQCPmgqPf2h42aM3akPh/mTUBqWEgOITruK10A02rQ+4YZOvLCpQKQZzLSAd09nctnuA\\\\u003d\\\\u003d\\\",\\\"keyExpiration\\\":\\\"1648843199734\\\"}\",\"signatures\":[\"MEQCICwCI4s5YCLu4qRCyXwSJ3qG8y3ocFtP1Mque4Uzysl8AiARoD/0qbj5W0Q2PWKpxkEnfcP+nU5kwYS8FyQ9boDTmQ\\u003d\\u003d\"]},\"protocolVersion\":\"ECv2\",\"signedMessage\":\"{\\\"encryptedMessage\\\":\\\"roD4ikTpZ7Srunq+0zUnp+eiXzcuZBfIFSuZAJu1PQLXcP0RvnGDiGKtoarNCHvn+cnXsHCzIBWXMZSJ9Aglqky9VfP5a+qsXQhf5m5AFUbT2xnihtKwageGQQK6HzyjHSXXSjvuCzeo75ToOgIUxLFASZyaZ89u3Jifqhhc2c4a0Mtlx564BxXiwcxDFdtNkOle7uAIsJzsryk7Rcwgr8ZMJJM//XpvaeE5wNmkVFHUtR2uTqPm0BvkoYkFHCTRo4NHXWpxeLjXWzKGk2ELyTK1diuCa6c9ig0jO3t8BIh1cR63UeP8Ar7u5fh8C9FPPAsgPbTGLfiaRe615e4SxASgcZ4/8uWo5mikEPFqA5s2K2mid9ncXoMNYaHUc3qzJAyxHVYSd5SRNZYXHMkEcWcjnpDx+ErYjR1sMo1LMYXfrfGyZz3M69bQLKPYFe7ChjvgFI9MnfcFTNB4HAdNKMhbZT0EKinfxxGWkT7LVbGnUuqPlHp4toCe4kpbx7fulwXTj3bAFvg/qvxxwGOS38iP0HR/f+4GF0xHspqYVbdWdIJ5iJUdpBG8Nu5P56h2GEDxXMkKSmh+qbvKWlYipNNGoeg8uHc\\\\u003d\\\",\\\"ephemeralPublicKey\\\":\\\"BMqIyb1IyXhuZ4YpWm1PiRr74i3tCwDfQqJ1P4OZ3zK4Rq16SuwgJ605fCEvlViwSQuo2Hpv+CcR+2D3+/YrLB8\\\\u003d\\\",\\\"tag\\\":\\\"5K4LlTucDK7jAThbIozYtyoxX95hRNd5cJJGfxWAxw8\\\\u003d\\\"}\"}")
                //.type(CreatePaymentInstrumentRequest.TypeEnum.GOOGLE_PAY)
                .build();
        PaymentInstrument response = tempClient.PaymentInstruments.create(createPaymentInstrumentRequest);
        System.out.println(response.toJson());

    }
    @Test
    @DisplayName("Google Pay on Android - Create a Payment")
    void createGooglePayOnAndroidTest() throws ApiException {
        FinixClient tempClient = new FinixClient("USsRhsHYZGBPnQw8CByJyEQW","8a14c2f9-d94b-4c72-8f5c-a62908e5b30e", Environment.SANDBOX);
        CreatePaymentInstrumentRequest createPaymentInstrumentRequest = CreatePaymentInstrumentRequest.builder()
                .identity("ID78Fh8mcnnzukVzbdoyex5y")
                .merchantIdentity("IDwhCCvPwCDEmiFd8Be7pDzN")
                .name("Finix Sandbox")
                .thirdPartyToken("{\"signature\":\"MEYCIQCYTkaEMgug7pcjzEEdbIn+R57kYO5yYc2KYj41AQQn9wIhAN1QvylvZ2XydVecfejwi2xYS9y3Y9y/MmDnRnUfNw5H\",\"intermediateSigningKey\":{\"signedKey\":\"{\\\"keyValue\\\":\\\"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE4xc3fjeM9SMTjd1TL2GQCPmgqPf2h42aM3akPh/mTUBqWEgOITruK10A02rQ+4YZOvLCpQKQZzLSAd09nctnuA\\\\u003d\\\\u003d\\\",\\\"keyExpiration\\\":\\\"1648843199734\\\"}\",\"signatures\":[\"MEQCICwCI4s5YCLu4qRCyXwSJ3qG8y3ocFtP1Mque4Uzysl8AiARoD/0qbj5W0Q2PWKpxkEnfcP+nU5kwYS8FyQ9boDTmQ\\u003d\\u003d\"]},\"protocolVersion\":\"ECv2\",\"signedMessage\":\"{\\\"encryptedMessage\\\":\\\"roD4ikTpZ7Srunq+0zUnp+eiXzcuZBfIFSuZAJu1PQLXcP0RvnGDiGKtoarNCHvn+cnXsHCzIBWXMZSJ9Aglqky9VfP5a+qsXQhf5m5AFUbT2xnihtKwageGQQK6HzyjHSXXSjvuCzeo75ToOgIUxLFASZyaZ89u3Jifqhhc2c4a0Mtlx564BxXiwcxDFdtNkOle7uAIsJzsryk7Rcwgr8ZMJJM//XpvaeE5wNmkVFHUtR2uTqPm0BvkoYkFHCTRo4NHXWpxeLjXWzKGk2ELyTK1diuCa6c9ig0jO3t8BIh1cR63UeP8Ar7u5fh8C9FPPAsgPbTGLfiaRe615e4SxASgcZ4/8uWo5mikEPFqA5s2K2mid9ncXoMNYaHUc3qzJAyxHVYSd5SRNZYXHMkEcWcjnpDx+ErYjR1sMo1LMYXfrfGyZz3M69bQLKPYFe7ChjvgFI9MnfcFTNB4HAdNKMhbZT0EKinfxxGWkT7LVbGnUuqPlHp4toCe4kpbx7fulwXTj3bAFvg/qvxxwGOS38iP0HR/f+4GF0xHspqYVbdWdIJ5iJUdpBG8Nu5P56h2GEDxXMkKSmh+qbvKWlYipNNGoeg8uHc\\\\u003d\\\",\\\"ephemeralPublicKey\\\":\\\"BMqIyb1IyXhuZ4YpWm1PiRr74i3tCwDfQqJ1P4OZ3zK4Rq16SuwgJ605fCEvlViwSQuo2Hpv+CcR+2D3+/YrLB8\\\\u003d\\\",\\\"tag\\\":\\\"5K4LlTucDK7jAThbIozYtyoxX95hRNd5cJJGfxWAxw8\\\\u003d\\\"}\"}")
                //.type(CreatePaymentInstrumentRequest.TypeEnum.)
                .build();
        PaymentInstrument response = tempClient.PaymentInstruments.create(createPaymentInstrumentRequest);
        System.out.println(response.toJson());
    }

}
