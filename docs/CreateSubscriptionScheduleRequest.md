

# CreateSubscriptionScheduleRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lineItemType** | [**LineItemTypeEnum**](#LineItemTypeEnum) | Subscription Schedule type. For subscriptions, the type is FEE |  |
|**nickname** | **String** | Human readable name. |  |
|**fixedTimeIntervalOffset** | [**CreateSubscriptionScheduleRequestFixedTimeIntervalOffset**](CreateSubscriptionScheduleRequestFixedTimeIntervalOffset.md) |  |  [optional] |
|**periodOffset** | [**CreateSubscriptionScheduleRequestPeriodOffset**](CreateSubscriptionScheduleRequestPeriodOffset.md) |  |  [optional] |
|**subscriptionType** | [**SubscriptionTypeEnum**](#SubscriptionTypeEnum) | Specify the type of schedule: - **FIXED\\_TIME\\_INTERVAL**: Charges a Merchant on a fixed hourly interval. - **PERIODIC\\_MONTHLY**: Charges a Merchant once a month on a specific day. - **PERIODIC\\_YEARLY**: Charges a Merchant once a year on a specific day and month. |  |
|**tags** | **Map&lt;String, String&gt;** | Key value pair for annotating custom meta data (e.g. order numbers). |  [optional] |



## Enum: LineItemTypeEnum

| Name | Value |
|---- | -----|
| FEE | &quot;FEE&quot; |



## Enum: SubscriptionTypeEnum

| Name | Value |
|---- | -----|
| FIXED_TIME_INTERVAL | &quot;FIXED_TIME_INTERVAL&quot; |
| PERIODIC_MONTHLY | &quot;PERIODIC_MONTHLY&quot; |
| PERIODIC_YEARLY | &quot;PERIODIC_YEARLY&quot; |



