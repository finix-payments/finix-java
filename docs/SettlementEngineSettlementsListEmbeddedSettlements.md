

# SettlementEngineSettlementsListEmbeddedSettlements


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** | Key value pair for annotating custom meta data (e.g. order numbers). |  |
|**id** | **String** | The ID of the resource. |  |
|**createdAt** | **OffsetDateTime** | Timestamp of when the object was created |  |
|**updatedAt** | **OffsetDateTime** | Timestamp of when the object was last updated |  |
|**adjustmentCreditAmount** | **BigDecimal** |  |  |
|**adjustmentCreditCount** | **BigDecimal** |  |  |
|**adjustmentDebitAmount** | **BigDecimal** |  |  |
|**adjustmentDebitCount** | **BigDecimal** |  |  |
|**application** | **String** | The ID of the resource. |  |
|**autoCloseTime** | **OffsetDateTime** |  |  |
|**currency** | **Currency** |  |  [optional] |
|**disputeCreditAmount** | **BigDecimal** |  |  |
|**disputeCreditCount** | **BigDecimal** |  |  |
|**disputeDebitAmount** | **BigDecimal** |  |  |
|**disputeDebitCount** | **BigDecimal** |  |  |
|**exception** | **Boolean** |  |  |
|**feeCount** | **BigDecimal** |  |  |
|**identity** | **String** | The ID of the resource. |  [optional] |
|**merchant** | **String** | The ID of the resource. |  |
|**payoutPlan** | **String** |  |  |
|**processorType** | **String** |  |  |
|**reverseAmount** | **BigDecimal** |  |  |
|**reverseCount** | **BigDecimal** |  |  |
|**scheduleType** | [**ScheduleTypeEnum**](#ScheduleTypeEnum) |  |  |
|**settlementGroup** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**totalAmount** | **BigDecimal** |  |  |
|**totalFeeAmount** | **BigDecimal** |  |  |
|**transferCreditAmount** | **BigDecimal** |  |  |
|**transferCreditCount** | **BigDecimal** |  |  |
|**transferDebitAmount** | **BigDecimal** |  |  |
|**transferDebitCount** | **BigDecimal** |  |  |
|**windowEnd** | **OffsetDateTime** |  |  |
|**windowStart** | **OffsetDateTime** |  |  |
|**links** | [**SettlementEngineSettlementLinks**](SettlementEngineSettlementLinks.md) |  |  |



## Enum: ScheduleTypeEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;DAILY&quot; |
| MONTHLY | &quot;MONTHLY&quot; |
| CONTINUOUS | &quot;CONTINUOUS&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;APPROVED&quot; |
| AWAITING_APPROVAL | &quot;AWAITING_APPROVAL&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| PENDING | &quot;PENDING&quot; |
| STAGED | &quot;STAGED&quot; |



