package api;

import invoker.Environment;
import invoker.FinixClient;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.MethodName.class)
@DisplayName("SubscriptionSchedulesApiTest")
public class SubscriptionSchedulesApiTest {
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
        finixClient= new FinixClient("USte61SqeNkAZnpfavK3fQNG","bd98703c-d72c-458e-8873-4295f5bac713", Environment.SANDBOX);
        assertEquals(true , finixClient!=null);
    }


}
