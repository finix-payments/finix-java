

# DisputeEvidence


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** | Key value pair for annotating custom meta data (e.g. order numbers). |  |
|**id** | **String** |  |  |
|**createdAt** | **OffsetDateTime** | Timestamp of when the object was created |  |
|**updatedAt** | **OffsetDateTime** | Timestamp of when the object was last updated |  |
|**dispute** | **String** | The ID of the resource. |  |
|**state** | [**StateEnum**](#StateEnum) | Result of the evidence uploaded. - PENDING: The evidence file has not yet been submitted to the Processor. No user action is required. - SUCCEEDED: The evidence file has been successfully sent to the Processor. No further user action is required. - CANCELED: The evidence file upload was not completed due to user action. - FAILED: An issue occurred. User action is required. Any of the following issues could have occurred:   - There was an error in the system and the user should retry uploading their evidence file.   - There is an issue with the file and the user should retry uploading a different file.   - There is an issue and the user should contact Support. |  [optional] |
|**links** | [**DisputeEvidenceLinks**](DisputeEvidenceLinks.md) |  |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| SUCCEEDED | &quot;SUCCEEDED&quot; |
| CANCELED | &quot;CANCELED&quot; |
| FAILED | &quot;FAILED&quot; |



