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
@DisplayName("PullFromCardTest")
public class SubscriptionBillingTest {
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
        // @Order(1)
    void contextLoads() {
        finixClient= new FinixClient("UStxEci4vXxGDWLQhNvao7YY","25038781-2369-4113-8187-34780e91052e", Environment.SANDBOX);
        assertEquals(true , finixClient!=null);
    }

    @Test
    @DisplayName("Subscription Billing - Step 1: Create a Subscription Schedule")
    void createSubscriptionScheduleTest() throws ApiException {
        CreateSubscriptionScheduleRequest createSubscriptionScheduleRequest = CreateSubscriptionScheduleRequest.builder()
                .lineItemType(CreateSubscriptionScheduleRequest.LineItemTypeEnum.FEE)
                .nickname("Fixed_Time_Subscription_Schedule")
                .fixedTimeIntervalOffset(CreateSubscriptionScheduleRequestFixedTimeIntervalOffset.builder()
                        .intervalCount(4l)
                        .hourlyInterval(24l)
                        .build())
                .subscriptionType(CreateSubscriptionScheduleRequest.SubscriptionTypeEnum.FIXED_TIME_INTERVAL)
                .build();
        SubscriptionSchedule response = finixClient.SubscriptionSchedules.create(createSubscriptionScheduleRequest);
   }
    @Test
    @DisplayName("Subscription Billing - Step 2: Create a Subscription Amount")
    void createSubscriptionAmountTest() throws ApiException {
        String subscriptionId="SUBSCHEDULE_uxsUJrgbQZEXsWm9toq6gZ";
        Map<String,String> tags= new HashMap<>();
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
    }
    @Test
    @DisplayName("Subscription Billing - Step 3: Create a Subscription Enrollment and Enroll the Merchant")
    void createSubscriptionEnrollmentTest() throws ApiException {
        String subscriptionEnrollmentId="SUBSCHEDULE_uxsUJrgbQZEXsWm9toq6gZ";
        Map<String,String> tags= new HashMap<>();
        tags.put("enrollment_info", "Security Fee Enrollment");
        CreateSubscriptionEnrollmentRequest createSubscriptionEnrollmentRequest = CreateSubscriptionEnrollmentRequest.builder()
                .merchant("MUucec6fHeaWo3VHYoSkUySM")
                .startedAt("2022-11-11T16:50:59.891Z")
                .nickname("Security Fee")
                .tags(tags)
                .build();
        SubscriptionEnrollment response = finixClient.SubscriptionEnrollments.create(subscriptionEnrollmentId,createSubscriptionEnrollmentRequest);
   }
}
