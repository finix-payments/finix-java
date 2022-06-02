

# CreateTransferRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** | Key value pair for annotating custom meta data (e.g. order numbers). |  [optional] |
|**adjustmentRequest** | **Boolean** |  |  [optional] |
|**amount** | **Long** |  |  [optional] |
|**configOverride** | **Map&lt;String, String&gt;** |  |  [optional] |
|**currency** | **Currency** |  |  [optional] |
|**destination** | **String** |  |  [optional] |
|**device** | **String** |  |  [optional] |
|**deviceConfiguration** | [**DeviceConfigurationForm**](DeviceConfigurationForm.md) |  |  [optional] |
|**fee** | **Long** |  |  [optional] |
|**gateway** | [**GatewayEnum**](#GatewayEnum) |  |  [optional] |
|**idempotencyId** | **String** |  |  [optional] |
|**inputMethod** | [**InputMethodEnum**](#InputMethodEnum) |  |  [optional] |
|**merchant** | **String** |  |  [optional] |
|**merchantIdentity** | **String** |  |  [optional] |
|**operationKey** | [**OperationKeyEnum**](#OperationKeyEnum) |  |  [optional] |
|**paymentInstrument** | [**CardPresentInstrumentForm**](CardPresentInstrumentForm.md) |  |  [optional] |
|**processor** | **String** |  |  [optional] |
|**source** | **String** |  |  [optional] |
|**statementDescriptor** | **String** |  |  [optional] |



## Enum: GatewayEnum

| Name | Value |
|---- | -----|
| CLOUD_V1 | &quot;TRIPOS_CLOUD_V1&quot; |
| MOBILE_V1 | &quot;TRIPOS_MOBILE_V1&quot; |



## Enum: InputMethodEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;UNKNOWN&quot; |
| SWIPED | &quot;SWIPED&quot; |
| MANUAL_KEY_ENTRY | &quot;MANUAL_KEY_ENTRY&quot; |
| CONTACTLESS_MSD | &quot;CONTACTLESS_MSD&quot; |
| CONTACTLESS_EMV | &quot;CONTACTLESS_EMV&quot; |
| SWIPED_FALLBACK | &quot;SWIPED_FALLBACK&quot; |
| KEYED_FALLBACK | &quot;KEYED_FALLBACK&quot; |
| CONTACTLESS | &quot;CONTACTLESS&quot; |
| DIGITAL_WALLET | &quot;DIGITAL_WALLET&quot; |
| CHIP_ENTRY | &quot;CHIP_ENTRY&quot; |



## Enum: OperationKeyEnum

| Name | Value |
|---- | -----|
| PUSH_TO_CARD | &quot;PUSH_TO_CARD&quot; |
| PULL_FROM_CARD | &quot;PULL_FROM_CARD&quot; |
| CARD_PRESENT_DEBIT | &quot;CARD_PRESENT_DEBIT&quot; |
| CARD_PRESENT_UNREFERENCED_REFUND | &quot;CARD_PRESENT_UNREFERENCED_REFUND&quot; |
| SALE | &quot;SALE&quot; |
| UNREFERENCED_REFUND | &quot;UNREFERENCED_REFUND&quot; |
| MERCHANT_CREDIT_ADJUSTMENT | &quot;MERCHANT_CREDIT_ADJUSTMENT&quot; |
| MERCHANT_DEBIT_ADJUSTMENT | &quot;MERCHANT_DEBIT_ADJUSTMENT&quot; |



