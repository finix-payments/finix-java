

# ReviewQueueItemsListEmbeddedReviewQueueItems


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** | Key value pair for annotating custom meta data (e.g. order numbers). |  |
|**id** | **String** | The ID of the resource. |  |
|**createdAt** | **OffsetDateTime** | Timestamp of when the object was created |  |
|**updatedAt** | **OffsetDateTime** | Timestamp of when the object was last updated |  |
|**application** | **String** | The ID of the resource. |  |
|**completedAt** | **OffsetDateTime** |  |  [optional] |
|**entityId** | **String** | The ID of the resource. |  |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) |  |  |
|**outcome** | [**OutcomeEnum**](#OutcomeEnum) |  |  |
|**processorType** | [**ProcessorTypeEnum**](#ProcessorTypeEnum) |  |  [optional] |
|**reviewType** | [**ReviewTypeEnum**](#ReviewTypeEnum) |  |  |
|**reviewedBy** | **String** |  |  [optional] |
|**links** | [**ReviewQueueItemLinks**](ReviewQueueItemLinks.md) |  |  |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| IDENTITY | &quot;IDENTITY&quot; |
| MERCHANT | &quot;MERCHANT&quot; |
| SETTLEMENT | &quot;SETTLEMENT&quot; |
| SETTLEMENT_V2 | &quot;SETTLEMENT_V2&quot; |



## Enum: OutcomeEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| REJECTED | &quot;REJECTED&quot; |
| ACCEPTED | &quot;ACCEPTED&quot; |



## Enum: ProcessorTypeEnum

| Name | Value |
|---- | -----|
| AFFIPAY_V1 | &quot;AFFIPAY_V1&quot; |
| CHECKOUT_V1 | &quot;CHECKOUT_V1&quot; |
| DUMMY_V1 | &quot;DUMMY_V1&quot; |
| ELAVON_V1 | &quot;ELAVON_V1&quot; |
| EXPRESS_V1 | &quot;EXPRESS_V1&quot; |
| FINIX_VISA_SANDBOX_V1 | &quot;FINIX_VISA_SANDBOX_V1&quot; |
| LITLE_V1 | &quot;LITLE_V1&quot; |
| MASTERCARD_V1 | &quot;MASTERCARD_V1&quot; |
| MICROBILT_V1 | &quot;MICROBILT_V1&quot; |
| MYTHICAL_V1 | &quot;MYTHICAL_V1&quot; |
| NMI_V1 | &quot;NMI_V1&quot; |
| SKRILL_V1 | &quot;SKRILL_V1&quot; |
| STRIPE_V1 | &quot;STRIPE_V1&quot; |
| TRIPOS_CLOUD_V1 | &quot;TRIPOS_CLOUD_V1&quot; |
| TRIPOS_MOBILE_V1 | &quot;TRIPOS_MOBILE_V1&quot; |
| TRULIOO_V1 | &quot;TRULIOO_V1&quot; |
| VANTIV_V1 | &quot;VANTIV_V1&quot; |
| VISA_V1 | &quot;VISA_V1&quot; |



## Enum: ReviewTypeEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| VERIFIED | &quot;VERIFIED&quot; |
| TRANSFER_LIMIT_EXCEEDED | &quot;TRANSFER_LIMIT_EXCEEDED&quot; |



