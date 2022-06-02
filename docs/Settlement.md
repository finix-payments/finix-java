

# Settlement


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
|**destination** | **String** |  |  [optional] |
|**fundsFlow** | **String** |  |  [optional] |
|**identity** | **String** | The ID of the resource. |  [optional] |
|**merchantId** | **String** | The ID of the resource. |  [optional] |
|**netAmount** | **BigDecimal** |  |  [optional] |
|**paymentType** | **String** |  |  [optional] |
|**processor** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**totalAmount** | **BigDecimal** |  |  [optional] |
|**totalFee** | **BigDecimal** |  |  [optional] |
|**totalFees** | **BigDecimal** |  |  [optional] |
|**links** | [**SettlementLinks**](SettlementLinks.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MERCHANT_REVENUE | &quot;MERCHANT_REVENUE&quot; |
| PLATFORM_FEE | &quot;PLATFORM_FEE&quot; |
| PARTNER_FEE | &quot;PARTNER_FEE&quot; |
| NOOP | &quot;NOOP&quot; |
| MERCHANT | &quot;MERCHANT&quot; |
| APPLICATION | &quot;APPLICATION&quot; |
| PLATFORM | &quot;PLATFORM&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;APPROVED&quot; |
| AWAITING_APPROVAL | &quot;AWAITING_APPROVAL&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| PENDING | &quot;PENDING&quot; |
| STAGED | &quot;STAGED&quot; |



