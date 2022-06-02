

# PaymentInstrumentToken


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Object** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**id** | **String** | The ID of the resource. |  |
|**createdAt** | **OffsetDateTime** | Timestamp of when the object was created |  |
|**updatedAt** | **OffsetDateTime** | Timestamp of when the object was last updated |  |
|**application** | **String** | The ID of the resource. |  |
|**currency** | **Currency** |  |  |
|**fingerprint** | **String** |  |  |
|**identity** | **String** | The ID of the resource. |  |
|**instrumentType** | [**InstrumentTypeEnum**](#InstrumentTypeEnum) |  |  [optional] |
|**payloadType** | [**PayloadTypeEnum**](#PayloadTypeEnum) |  |  [optional] |
|**links** | [**PaymentInstrumentTokenLinks**](PaymentInstrumentTokenLinks.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TOKEN | &quot;TOKEN&quot; |



## Enum: InstrumentTypeEnum

| Name | Value |
|---- | -----|
| TOKEN | &quot;TOKEN&quot; |



## Enum: PayloadTypeEnum

| Name | Value |
|---- | -----|
| SOURCE | &quot;SOURCE&quot; |
| DESTINATION | &quot;DESTINATION&quot; |



