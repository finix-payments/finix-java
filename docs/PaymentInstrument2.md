

# PaymentInstrument2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** | Key value pair for annotating custom meta data (e.g. order numbers). |  [optional] |
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
| VIRTUAL | &quot;VIRTUAL&quot; |
| SWIPED_PAYMENT_CARD | &quot;SWIPED_PAYMENT_CARD&quot; |
| PAYMENT_CARD_PRESENT | &quot;PAYMENT_CARD_PRESENT&quot; |
| VANTIV_OMNI_TOKEN | &quot;VANTIV_OMNI_TOKEN&quot; |



## Enum: InstrumentTypeEnum

| Name | Value |
|---- | -----|
| VIRTUAL | &quot;VIRTUAL&quot; |
| SWIPED_PAYMENT_CARD | &quot;SWIPED_PAYMENT_CARD&quot; |
| PAYMENT_CARD_PRESENT | &quot;PAYMENT_CARD_PRESENT&quot; |
| VANTIV_OMNI_TOKEN | &quot;VANTIV_OMNI_TOKEN&quot; |



## Enum: PayloadTypeEnum

| Name | Value |
|---- | -----|
| SOURCE | &quot;SOURCE&quot; |
| DESTINATION | &quot;DESTINATION&quot; |



