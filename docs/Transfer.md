

# Transfer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** | Key value pair for annotating custom meta data (e.g. order numbers). |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**id** | **String** | The ID of the resource. |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp of when the object was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp of when the object was last updated |  [optional] |
|**amount** | **BigDecimal** |  |  [optional] |
|**application** | **String** | The ID of the resource. |  [optional] |
|**cardPresentDetails** | [**CardPresentDetails1**](CardPresentDetails1.md) |  |  [optional] |
|**currency** | **Currency** |  |  [optional] |
|**destination** | **String** | The ID of the destination. |  [optional] |
|**device** | **String** | The ID of the resource. |  [optional] |
|**fee** | **String** | The ID of the resource. |  [optional] |
|**feeType** | **FeeType** |  |  [optional] |
|**idempotencyId** | **String** | Id to [idempotently](#section/Idempotency-Requests) identifty the transfer. |  [optional] |
|**identity** | **String** | The ID of the identity. |  [optional] |
|**merchantIdentity** | **String** | The ID of the resource. |  [optional] |
|**messages** | **List&lt;String&gt;** |  |  [optional] |
|**raw** | **Object** | Raw response from the processor |  [optional] |
|**readyToSettleAt** | **OffsetDateTime** |  |  [optional] |
|**source** | **String** | The ID of the resource. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**statementDescriptor** | **String** |  |  [optional] |
|**subtype** | [**SubtypeEnum**](#SubtypeEnum) |  |  [optional] |
|**traceId** | **String** |  |  [optional] |
|**links** | [**TransferLinks**](TransferLinks.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DEBIT | &quot;DEBIT&quot; |
| CREDIT | &quot;CREDIT&quot; |
| REVERSAL | &quot;REVERSAL&quot; |
| FEE | &quot;FEE&quot; |
| ADJUSTMENT | &quot;ADJUSTMENT&quot; |
| DISPUTE | &quot;DISPUTE&quot; |
| RESERVE | &quot;RESERVE&quot; |
| SETTLEMENT | &quot;SETTLEMENT&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;CANCELED&quot; |
| PENDING | &quot;PENDING&quot; |
| FAILED | &quot;FAILED&quot; |
| SUCCEEDED | &quot;SUCCEEDED&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



## Enum: SubtypeEnum

| Name | Value |
|---- | -----|
| API | &quot;API&quot; |
| APPLICATION_FEE | &quot;APPLICATION_FEE&quot; |
| DISPUTE | &quot;DISPUTE&quot; |
| MERCHANT_CREDIT | &quot;MERCHANT_CREDIT&quot; |
| MERCHANT_CREDIT_ADJUSTMENT | &quot;MERCHANT_CREDIT_ADJUSTMENT&quot; |
| MERCHANT_DEBIT | &quot;MERCHANT_DEBIT&quot; |
| MERCHANT_DEBIT_ADJUSTMENT | &quot;MERCHANT_DEBIT_ADJUSTMENT&quot; |
| PLATFORM_CREDIT | &quot;PLATFORM_CREDIT&quot; |
| PLATFORM_CREDIT_ADJUSTMENT | &quot;PLATFORM_CREDIT_ADJUSTMENT&quot; |
| PLATFORM_DEBIT | &quot;PLATFORM_DEBIT&quot; |
| PLATFORM_DEBIT_ADJUSTMENT | &quot;PLATFORM_DEBIT_ADJUSTMENT&quot; |
| PLATFORM_FEE | &quot;PLATFORM_FEE&quot; |
| SETTLEMENT_MERCHANT | &quot;SETTLEMENT_MERCHANT&quot; |
| SETTLEMENT_NOOP | &quot;SETTLEMENT_NOOP&quot; |
| SETTLEMENT_PARTNER | &quot;SETTLEMENT_PARTNER&quot; |
| SETTLEMENT_PLATFORM | &quot;SETTLEMENT_PLATFORM&quot; |
| SPLIT_PAYOUT | &quot;SPLIT_PAYOUT&quot; |
| SPLIT_PAYOUT_ADJUSTMENT | &quot;SPLIT_PAYOUT_ADJUSTMENT&quot; |
| SYSTEM | &quot;SYSTEM&quot; |



