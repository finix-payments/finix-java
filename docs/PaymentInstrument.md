

# PaymentInstrument


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** | Key value pair for annotating custom meta data (e.g. order numbers). |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**id** | **String** | The ID of the resource. |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp of when the object was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp of when the object was last updated |  [optional] |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) |  |  [optional] |
|**application** | **String** | The ID of the resource. |  [optional] |
|**bankCode** | **String** |  |  [optional] |
|**country** | **Country** |  |  [optional] |
|**currency** | **Currency** |  |  [optional] |
|**fingerprint** | **String** |  |  [optional] |
|**identity** | **String** | The ID of the resource. |  [optional] |
|**instrumentType** | [**InstrumentTypeEnum**](#InstrumentTypeEnum) |  |  [optional] |
|**maskedAccountNumber** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**payloadType** | [**PayloadTypeEnum**](#PayloadTypeEnum) |  |  [optional] |
|**links** | [**PaymentInstrumentLinks**](PaymentInstrumentLinks.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BANK_ACCOUNT | &quot;BANK_ACCOUNT&quot; |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| CHECKING | &quot;CHECKING&quot; |
| SAVINGS | &quot;SAVINGS&quot; |
| CORPORATE | &quot;CORPORATE&quot; |
| CORP_SAVINGS | &quot;CORP_SAVINGS&quot; |



## Enum: InstrumentTypeEnum

| Name | Value |
|---- | -----|
| BANK_ACCOUNT | &quot;BANK_ACCOUNT&quot; |



## Enum: PayloadTypeEnum

| Name | Value |
|---- | -----|
| SOURCE | &quot;SOURCE&quot; |
| DESTINATION | &quot;DESTINATION&quot; |



