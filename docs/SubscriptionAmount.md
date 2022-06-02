

# SubscriptionAmount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the Subscription Amount |  |
|**createdAt** | **OffsetDateTime** | Timestamp of when the object was created |  |
|**updatedAt** | **OffsetDateTime** | Timestamp of when the object was last updated |  |
|**amountType** | [**AmountTypeEnum**](#AmountTypeEnum) | Subscription Amount type. The only type supported as of now is FEE |  |
|**createdBy** | **String** | User ID |  |
|**feeAmountData** | [**SubscriptionAmountFeeAmountData**](SubscriptionAmountFeeAmountData.md) |  |  |
|**nickname** | **String** | Human readable name. |  |
|**subscriptionSchedule** | **String** | ID of the Subscription Schedule  |  |
|**tags** | **Map&lt;String, String&gt;** | Key value pair for annotating custom meta data (e.g. order numbers). |  [optional] |
|**links** | [**SubscriptionAmountLinks**](SubscriptionAmountLinks.md) |  |  [optional] |



## Enum: AmountTypeEnum

| Name | Value |
|---- | -----|
| FEE | &quot;FEE&quot; |



