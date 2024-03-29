/*
 * Finix API
 */


package api;

import invoker.ApiException;
import invoker.Environment;
import invoker.FinixClient;
import model.*;

import java.io.File;

import org.junit.jupiter.api.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static model.CreateFileRequest.TypeEnum.DRIVERS_LICENSE_FRONT;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * API tests for FilesApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When Running FilesApiTest")
public class FilesApiTest {
    private FinixClient finixClient;
    private String localFileId;
    private String localExternalLinkId;
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
        finixClient= new FinixClient("USsRhsHYZGBPnQw8CByJyEQW","8a14c2f9-d94b-4c72-8f5c-a62908e5b30e", Environment.SANDBOX);
        assertEquals(true , finixClient!=null);
    }
    /**
     * Create an External Link
     *
     * Create an &#x60;external_link&#x60; resource to share with users so they can upload files directly from their browser. For more info, see [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix/#create-an-external-link).  Once created, you can upload the user&#39;s file to the &#x60;external_link&#x60; resource: [Upload files to External Link](#operation/uploadExternalLink)
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Create an External Link")
    @AfterAll
    public void createExternalLinkTest() throws ApiException {
        String fileId = localFileId;
        CreateExternalLinkRequest createExternalLinkRequest = CreateExternalLinkRequest.builder()
                .type(CreateExternalLinkRequest.TypeEnum.UPLOAD)
                .duration(15l)
                .build();
        ExternalLink response = finixClient.Files.createExternalLink(fileId, createExternalLinkRequest);
        localExternalLinkId = response.getId();
        assertEquals("USsRhsHYZGBPnQw8CByJyEQW",response.getUserId(),()->" Should return " + "USsRhsHYZGBPnQw8CByJyEQW" + " but returns " + response.getUserId());
        assertEquals("UPLOAD", response.getType());
    }

    /**
     * Create a File
     *
     * Before uploading a file, you need to create a &#x60;File&#x60; resource.   Once created, you can [upload](#operations/uploadFile) your file to the new &#x60;File&#x60; resource.
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Create a File")
    @BeforeAll
    public void createFilesTest() throws ApiException {
        Map<String,String> localMap = new HashMap<>();
        localMap.put("key_1", "value_1");
        CreateFileRequest createFileRequest = CreateFileRequest.builder()
                .displayName("My Drivers License")
                .linkedTo("MU2n7BSovtwYsWYZF6rBnnzk")
                .type(DRIVERS_LICENSE_FRONT)
                .tags(localMap)
                .build();
        ModelFile response = finixClient.Files.create(createFileRequest);
        localFileId=response.getId();
        assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplicationId(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplicationId());
        assertEquals(createFileRequest.getLinkedTo(), response.getLinkedTo());
        assertEquals(createFileRequest.getType().toString(), response.getType());
    }

    /**
     * Download a file
     *
     * Download a file uploaded to a &#x60;File&#x60; resource. For more info, see [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix).
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Download a file")
    public void downloadFileTest() throws ApiException {
        String fileId = "FILE_bJecqoRPasStEPVpvKHtgA";
        File response = finixClient.Files.download(fileId);
        assertTrue(response.getName().contains("my_drivers_license"));
    }

    /**
     * Fetch an External LInk
     *
     * Fetch a previously created &#x60;external_link&#x60; resource. For more info see [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix/#create-an-external-link).
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Fetch an External LInk")
    public void getExternalLinkTest() throws ApiException {
        String fileId = localFileId;
        String externalLinkId = localExternalLinkId;
        ExternalLink response = finixClient.Files.getExternalLink(fileId, externalLinkId);
        assertEquals("USsRhsHYZGBPnQw8CByJyEQW",response.getUserId(),()->" Should return " + "USsRhsHYZGBPnQw8CByJyEQW" + " but returns " + response.getUserId());
        assertEquals(fileId, response.getFileId());
    }

    /**
     * Fetch a File
     *
     * Retrieve the details of a &#x60;File&#x60; resource. For more info see [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix/#create-an-external-link).
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Fetch a File")
    public void getFileTest() throws ApiException {
        String fileId = "FILE_bJecqoRPasStEPVpvKHtgA";
        ModelFile response = finixClient.Files.get(fileId);
        assertEquals("FILE_bJecqoRPasStEPVpvKHtgA",response.getId(),()->" Should return " + "FILE_bJecqoRPasStEPVpvKHtgA" + " but returns " + response.getId());
    }

    /**
     * List All External Links
     *
     * List the previously &#x60;external_links&#x60; for a &#x60;File&#x60;. For more info, see [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix/#create-an-external-link).
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("List All External Links")
    public void listExternalLinksTest() throws ApiException{
        String fileId = localFileId;
        String sort = null;
        String afterCursor = null;
        Long limit = null;
        String id = null;
        String createdAtGte = null;
        String createdAtLte = null;
        String updatedAtGte = null;
        String updatedAtLte = null;
        String beforeCursor = null;

        FinixList<ExternalLink> externalLinksList = finixClient.Files.listExternalLinks(fileId, ListExternalLinksQueryParams.builder()
                .sort(sort)
                .afterCursor(afterCursor)
                .limit(limit)
                .id(id)
                .createdAtGte(createdAtGte)
                .createdAtLte(createdAtLte)
                .updatedAtGte(updatedAtGte)
                .updatedAtLte(updatedAtLte)
                .beforeCursor(beforeCursor)
                .build());

        assertTrue(externalLinksList.size() >= 0);
        if (externalLinksList.size() == 0){
            assertEquals(false, externalLinksList.getHasMore());
        }
        if (externalLinksList.getHasMore() == true) {
            FinixList<ExternalLink> nextList = externalLinksList.listNext(1);
            assertTrue(nextList != null);
            assertEquals(1, nextList.size());
        }
    }

    /**
     * List All Files
     *
     * List all the &#x60;File&#x60; resources you&#39;ve created. For more info, see [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix/#step-1-create-a-file).
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("List All Files")
    public void listFilesTest() throws ApiException{
        String sort = null;
        String afterCursor = null;
        Long limit = null;
        String id = null;
        String createdAtGte = null;
        String createdAtLte = null;
        String updatedAtGte = null;
        String updatedAtLte = null;
        String beforeCursor = null;

        FinixList<File> fileList = finixClient.Files.list(ListFilesQueryParams.builder()
                .sort(sort)
                .afterCursor(afterCursor)
                .limit(limit)
                .id(id)
                .createdAtGte(createdAtGte)
                .createdAtLte(createdAtLte)
                .updatedAtGte(updatedAtGte)
                .updatedAtLte(updatedAtLte)
                .beforeCursor(beforeCursor)
                .build());
        assertTrue(fileList.size() >= 0);
        if (fileList.size() == 0){
            assertEquals(false, fileList.getHasMore());
        }
        if (fileList.getHasMore() == true) {
            FinixList<File> nextList = fileList.listNext(1);
            assertTrue(nextList != null);
            assertEquals(1, nextList.size());
        }
    }

    /**
     * Upload files Directly
     *
     * Upload files directly with a &#x60;multipart/form-data&#x60; request. For more info see, [Uploading files to Finix](/guides/onboarding/uploading-files-to-finix/#step-2-upload-the-file).
     *
     * @throws ApiException if the Api call fails
     *
     **
     * EDITED
     * Test Function Name Generations from OPENAPI Spec with x-java-method-name
     *
     */
    @Test
    @DisplayName("Upload files Directly")
    public void uploadFileTest() throws ApiException, IOException {
        String fileId = localFileId;
        File file = new File("finix_file.png");
        UploadFileRequest uploadFileRequest = UploadFileRequest.builder()
                ._file(file)
                .build();
        ModelFile response = finixClient.Files.upload(fileId, uploadFileRequest);
        assertEquals("APgPDQrLD52TYvqazjHJJchM",response.getApplicationId(),()->" Should return " + "APgPDQrLD52TYvqazjHJJchM" + " but returns " + response.getApplicationId());
    }

}
