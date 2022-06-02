

# PaymentInstrument1


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Object** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**id** | **String** | The ID of the resource. |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp of when the object was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp of when the object was last updated |  [optional] |
|**application** | **String** | The ID of the resource. |  [optional] |
|**currency** | **Currency** |  |  [optional] |
|**fingerprint** | **String** |  |  [optional] |
|**identity** | **String** | The ID of the resource. |  [optional] |
|**instrumentType** | [**InstrumentTypeEnum**](#InstrumentTypeEnum) |  |  [optional] |
|**payloadType** | [**PayloadTypeEnum**](#PayloadTypeEnum) |  |  [optional] |
|**links** | [**PaymentInstrumentLinks**](PaymentInstrumentLinks.md) |  |  [optional] |



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



