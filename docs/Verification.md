

# Verification


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** | Key value pair for annotating custom meta data (e.g. order numbers). |  [optional] |
|**id** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp of when the object was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp of when the object was last updated |  [optional] |
|**application** | **String** | The ID of the resource. |  [optional] |
|**identity** | **String** | The ID of the identity. |  [optional] |
|**merchant** | **String** |  |  [optional] |
|**messages** | **List&lt;String&gt;** |  |  [optional] |
|**paymentInstrument** | **String** |  |  [optional] |
|**processor** | **String** |  |  [optional] |
|**raw** | **Object** | Raw response from the processor |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**traceId** | **String** |  |  [optional] |
|**links** | [**VerificationLinks**](VerificationLinks.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| SUCCEEDED | &quot;SUCCEEDED&quot; |
| FAILED | &quot;FAILED&quot; |



