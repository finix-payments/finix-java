

# InstrumentUpdate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**createdAt** | **OffsetDateTime** | Timestamp of when the object was created |  |
|**updatedAt** | **OffsetDateTime** | Timestamp of when the object was last updated |  |
|**application** | **String** | The ID of the resource. |  |
|**merchant** | **String** | The ID of the resource. |  |
|**messages** | **List&lt;String&gt;** |  |  |
|**paymentInstrument** | **String** | The ID of the resource. |  |
|**state** | [**StateEnum**](#StateEnum) |  |  |
|**traceId** | **String** |  |  |
|**links** | [**PaymentInstrumentUpdatesListEmbeddedLinks**](PaymentInstrumentUpdatesListEmbeddedLinks.md) |  |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| FAILED | &quot;FAILED&quot; |
| SUCCEEDED | &quot;SUCCEEDED&quot; |



