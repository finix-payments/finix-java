

# CardPresentInstrumentForm


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**availableAccountType** | [**AvailableAccountTypeEnum**](#AvailableAccountTypeEnum) |  |  [optional] |
|**emvData** | **String** |  |  [optional] |
|**emvDataKeySerialNumber** | **String** |  |  [optional] |
|**encryptedEmvData** | **String** |  |  [optional] |
|**encryptedEmvFormat** | **Integer** |  |  [optional] |
|**expirationMonth** | **Integer** |  |  [optional] |
|**expirationYear** | **Integer** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**name** | [**Name**](Name.md) |  |  [optional] |
|**number** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BANK_ACCOUNT | &quot;BANK_ACCOUNT&quot; |
| VIRTUAL | &quot;VIRTUAL&quot; |
| TOKEN | &quot;TOKEN&quot; |
| SWIPED_PAYMENT_CARD | &quot;SWIPED_PAYMENT_CARD&quot; |
| PAYMENT_CARD_PRESENT | &quot;PAYMENT_CARD_PRESENT&quot; |
| PAYMENT_CARD | &quot;PAYMENT_CARD&quot; |
| VANTIV_OMNI_TOKEN | &quot;VANTIV_OMNI_TOKEN&quot; |



## Enum: AvailableAccountTypeEnum

| Name | Value |
|---- | -----|
| BALANCE | &quot;BALANCE&quot; |
| LEDGERED | &quot;LEDGERED&quot; |



