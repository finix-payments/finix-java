

# SubscriptionSchedule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the Subscription Schedule |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp of when the object was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp of when the object was last updated |  [optional] |
|**createdBy** | **String** | User ID who created the schedule. |  [optional] |
|**fixedTimeIntervalOffset** | [**CreateSubscriptionScheduleRequestFixedTimeIntervalOffset**](CreateSubscriptionScheduleRequestFixedTimeIntervalOffset.md) |  |  [optional] |
|**lineItemType** | [**LineItemTypeEnum**](#LineItemTypeEnum) | Subscription Schedule type. For subscriptions, the type is FEE |  [optional] |
|**nickname** | **String** | Human readable name. |  [optional] |
|**periodOffset** | [**CreateSubscriptionScheduleRequestPeriodOffset**](CreateSubscriptionScheduleRequestPeriodOffset.md) |  |  [optional] |
|**subscriptionType** | [**SubscriptionTypeEnum**](#SubscriptionTypeEnum) | Subscription schedule type. |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | Key value pair for annotating custom meta data (e.g. order numbers). |  [optional] |
|**links** | [**SubscriptionScheduleLinks**](SubscriptionScheduleLinks.md) |  |  [optional] |



## Enum: LineItemTypeEnum

| Name | Value |
|---- | -----|
| FEE | &quot;FEE&quot; |



## Enum: SubscriptionTypeEnum

| Name | Value |
|---- | -----|
| PERIODIC_MONTHLY | &quot;PERIODIC_MONTHLY&quot; |
| PERIODIC_YEARLY | &quot;PERIODIC_YEARLY&quot; |
| FIXED_TIME_INTERVAL | &quot;FIXED_TIME_INTERVAL&quot; |



