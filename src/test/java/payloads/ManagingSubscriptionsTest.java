package payloads;

import invoker.ApiException;
import invoker.Environment;
import invoker.FinixClient;
import model.*;
import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.MethodName.class)
@DisplayName("ManagingSubscriptionsTest")
public class ManagingSubscriptionsTest {
    private TestInfo testInfo;
    private TestReporter testReporter;
    private FinixClient finixClient;
    private String localIdentityId;
    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter){
        this.testInfo =testInfo;
        this.testReporter =testReporter;
        testReporter.publishEntry("Running "+testInfo.getDisplayName()+ " with tag " + testInfo.getTags());
    }
    @Test
    @BeforeAll
    @DisplayName("Finix Client")
    void contextLoads() {
        finixClient= new FinixClient("UStxEci4vXxGDWLQhNvao7YY","25038781-2369-4113-8187-34780e91052e", Environment.SANDBOX);
        assertEquals(true , finixClient!=null);
    }
    @Test
    @DisplayName("Managing Subscriptions - Create Subscription Amount")
    void createSubscriptionAmountTest() throws ApiException {
        String subscriptionId="SUBSCHEDULE_uxsUJrgbQZEXsWm9toq6gZ";
        Map<String,String> tags=new HashMap<>();
        tags.put("order_number", "124");
        CreateSubscriptionAmountRequest createSubscriptionAmountRequest = CreateSubscriptionAmountRequest.builder()
                .amountType("FEE")
                .feeAmountData(CreateSubscriptionAmountRequestFeeAmountData.builder()
                        .currency(Currency.USD)
                        .amount(2500l)
                        .label("POS_INSTALLMENT_FEE")
                        .build())
                .nickname("POS_INSTALLMENT_FEE")
                .tags(tags)
                .build();
        SubscriptionAmount response = finixClient.SubscriptionAmounts.lcreate(subscriptionId,createSubscriptionAmountRequest);
        System.out.println(response.toString());
    }
    @Test
    @DisplayName("Managing Subscriptions - Update Subscription Amount")
    void updateSubscriptionAmountTest() throws ApiException {
        String subscriptionAmountId="SUBAMOUNT_uKg6g5SL5mbAUcbt7PkDDq";
        String subscriptionScheduleId="SUBSCHEDULE_uxsUJrgbQZEXsWm9toq6gZ";
        CreateSubscriptionAmountRequest createSubscriptionAmountRequest = CreateSubscriptionAmountRequest.builder()
                .amountType("FEE")
                .nickname("NEW_POS_INSTALLMENT_FEE")
                .build();
        SubscriptionAmount response = finixClient.SubscriptionAmounts.patchSubscriptionAmount(subscriptionAmountId,subscriptionScheduleId,createSubscriptionAmountRequest);
        System.out.println(response.toString());
    }
    @Test
    @DisplayName("Managing Subscriptions - Delete Subscription Amount")
    void deleteSubscriptionAmountTest() throws ApiException {
        String subscriptionAmountId="SUBAMOUNT_uKg6g5SL5mbAUcbt7PkDDq";
        String subscriptionScheduleId="SUBSCHEDULE_uxsUJrgbQZEXsWm9toq6gZ";
        finixClient.SubscriptionAmounts.deleteSubscriptionAmount(subscriptionAmountId,subscriptionScheduleId);
    }
    @Test
    @DisplayName("Managing Subscriptions - Delete Subscription Enrollment")
    void deleteSubscriptionEnrollmentTest() throws ApiException {
        String subscriptionEnrollmentId="SUBENROLLMENT_uPamF4YuEyzVTT42hwYgBV";
        finixClient.SubscriptionEnrollments.remove(subscriptionEnrollmentId);
    }
}
