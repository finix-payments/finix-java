package api;/*
package api;

import invoker.ApiException;
import invoker.Environment;
import invoker.FinixClient;
import model.TransfersList;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running FinixListTest")
public class FinixListTest {
    public FinixClient finixClient;
            //=new FinixClient("USsRhsHYZGBPnQw8CByJyEQW", "8a14c2f9-d94b-4c72-8f5c-a62908e5b30e", Environment.SANDBOX);

    @Test
    @BeforeAll
    @DisplayName("Finix Client")
    void contextLoads() {
         finixClient = new FinixClient("USsRhsHYZGBPnQw8CByJyEQW", "8a14c2f9-d94b-4c72-8f5c-a62908e5b30e", Environment.SANDBOX);
        assertEquals(true , finixClient!=null);

    }

    @Test
    void getListTest() throws ApiException {
        TransfersList transfersList = (TransfersList) finixClient.finixList.list();
        System.out.println(transfersList.toJson());
    }

    @Test
    void getNextListTest() throws ApiException {
        TransfersList transfersList = finixClient.finixList.listNext();
        System.out.println(transfersList.toJson());
    }
    @Test
    void getNextCountListTest() throws ApiException {
        TransfersList transfersList = finixClient.finixList.listNext(30);
        System.out.println(transfersList.toJson());
    }
}
*/
