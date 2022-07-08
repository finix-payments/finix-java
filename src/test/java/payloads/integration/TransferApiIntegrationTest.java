package payloads.integration;

import api.TransfersApi;
import invoker.ApiException;
import invoker.Environment;
import invoker.FinixClient;
import model.Transfer;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@RunWith(MockitoJUnitRunner.class)
public class TransferApiIntegrationTest {
    FinixClient finixClient;
   // @Before
     void setUp(){
       // Transfer transfer= new Transfer();
        finixClient= new FinixClient("USsRhsHYZGBPnQw8CByJyEQW","8a14c2f9-d94b-4c72-8f5c-a62908e5b30e", Environment.SANDBOX);
        TransfersApi transfer = mock(TransfersApi.class);
        assertEquals(true , finixClient!=null);

    }
   // @Test
     void testTransaction() throws ApiException {
        finixClient= new FinixClient("USsRhsHYZGBPnQw8CByJyEQW","8a14c2f9-d94b-4c72-8f5c-a62908e5b30e", Environment.SANDBOX);

        Transfer transfer = Transfer.builder().build();
        Transfer response =finixClient.Transfers.get("TRvtThmhZtk56z6dtCt8hUDR");
        when(response).thenReturn(transfer);
    }
}
