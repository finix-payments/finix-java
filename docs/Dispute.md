

# Dispute

A dispute for a charge

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** | Key value pair for annotating custom meta data (e.g. order numbers). |  [optional] |
|**id** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp of when the object was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp of when the object was last updated |  [optional] |
|**action** | **String** |  |  [optional] |
|**amount** | **Integer** | A monetary amount of the smallest unit available to the currency. |  [optional] |
|**application** | **String** | The ID of the resource. |  [optional] |
|**currency** | **Currency** |  |  [optional] |
|**disputeDetails** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**identity** | **String** | The ID of the resource. |  [optional] |
|**message** | **String** |  |  [optional] |
|**occurredAt** | **OffsetDateTime** | Point in time when dispute occurred. |  [optional] |
|**reason** | [**ReasonEnum**](#ReasonEnum) |  |  [optional] |
|**respondBy** | **OffsetDateTime** | Point in time when dispute has to be resolved. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**transfer** | **String** |  |  [optional] |
|**links** | [**DisputeLinks**](DisputeLinks.md) |  |  [optional] |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| CLERICAL | &quot;CLERICAL&quot; |
| FRAUD | &quot;FRAUD&quot; |
| INQUIRY | &quot;INQUIRY&quot; |
| QUALITY | &quot;QUALITY&quot; |
| TECHNICAL | &quot;TECHNICAL&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| INQUIRY | &quot;INQUIRY&quot; |
| PENDING | &quot;PENDING&quot; |
| WON | &quot;WON&quot; |
| LOST | &quot;LOST&quot; |
| ARBITRATION | &quot;ARBITRATION&quot; |



