package payloads;

import invoker.ApiException;
import invoker.Environment;
import invoker.FinixClient;
import model.*;
import org.junit.jupiter.api.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.MethodName.class)
@DisplayName("UploadingFilesToFinixTest")
public class UploadingFilesToFinixTest {
    private TestInfo testInfo;
    private TestReporter testReporter;
    private FinixClient finixClient;
    private String localFileId;
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
        finixClient= new FinixClient("USsRhsHYZGBPnQw8CByJyEQW","8a14c2f9-d94b-4c72-8f5c-a62908e5b30e", Environment.SANDBOX);
        assertEquals(true , finixClient!=null);
    }
    @Test
    @BeforeEach
    @DisplayName("Uploading Files to Finix - How to Upload a file to Finix - Finix's API")
    void uploadFileToFinixTest() throws ApiException {
        Map<String,String> tags = new HashMap<>();
        tags.put("key_1", "value_1");
        CreateFileRequest createFileRequest = CreateFileRequest.builder()
                .displayName("My Drivers License")
                .linkedTo("MU2n7BSovtwYsWYZF6rBnnzk")
                .type(CreateFileRequest.TypeEnum.DRIVERS_LICENSE_FRONT)
                .tags(tags)
                .build();
        ModelFile response = finixClient.Files.create(createFileRequest);
        localFileId = response.getId();
        System.out.println(response);
    }
    @Test
    @DisplayName("Uploading Files to Finix - Upload Directly to Finix")
    void uploadDirectlyFinixTest() throws ApiException {
        String fileId = localFileId;//"FILE_bJecqoRPasStEPVpvKHtgA";
        UploadFileRequest uploadFileRequest = UploadFileRequest.builder()
                ._file(new File("finix_file.png"))
                .build();
        ModelFile response = finixClient.Files.uploadFile(fileId,uploadFileRequest);
    }

    @Test
    @DisplayName("Uploading Files to Finix - Create an External Link")
    void createExternalLinkTest() throws ApiException {
        String fileId= localFileId;
        CreateExternalLinkRequest createExternalLinkRequest = CreateExternalLinkRequest.builder()
                .type(CreateExternalLinkRequest.TypeEnum.UPLOAD)
                .duration(15l)
                .build();
        ExternalLink response = finixClient.Files.createExternalLink(fileId,createExternalLinkRequest);
        System.out.println(response);
    }

}
