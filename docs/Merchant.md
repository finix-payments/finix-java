

# Merchant


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** | Key value pair for annotating custom meta data (e.g. order numbers). |  [optional] |
|**id** | **String** | The ID of the resource. |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp of when the object was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp of when the object was last updated |  [optional] |
|**application** | **String** | ID of the &#x60;Application&#x60; the &#x60;Merchant&#x60; was created under. |  [optional] |
|**cardCvvRequired** | **Boolean** | Set to **true** to require the card&#39;s CVV code. |  [optional] |
|**cardExpirationDateRequired** | **Boolean** | Set to **true** to require the card&#39;s expiration date. |  [optional] |
|**creatingTransferFromReportEnabled** | **Boolean** | Set to **true** to automatically create &#x60;Transfers&#x60; once settlement reports get generated. |  [optional] |
|**grossSettlementEnabled** | **Boolean** | Set to **true** to enable gross settelments. |  [optional] |
|**identity** | **String** | The ID of the resource. |  [optional] |
|**mcc** | **String** | The Merchant Category Code ([MCC](http://www.dm.usda.gov/procurement/card/card\\_x/mcc.pdf)) that this merchant will be classified under. |  [optional] |
|**merchantName** | **String** | The legal name saved in the &#x60;Merchant&#x60; resource. |  [optional] |
|**merchantProfile** | **String** | Details if a merchant&#39;s info was submitted to third-party processors for provisioning. |  [optional] |
|**mid** | **String** | MID of the &#x60;Merchant&#x60;. |  [optional] |
|**onboardingState** | [**OnboardingStateEnum**](#OnboardingStateEnum) | Details the state of the &#x60;Merchant&#x60;&#39;s onboarding. |  [optional] |
|**processingEnabled** | **Boolean** | Details if transaction processing is enabled for the &#x60;Merchant&#x60;. |  [optional] |
|**processor** | **String** | Name of the transaction processor. |  [optional] |
|**processorDetails** | **Map&lt;String, Object&gt;** | Additional details specific to the &#x60;Processor&#x60;.  |  [optional] |
|**settlementEnabled** | **Boolean** | Details if settlement processing is enabled for the &#x60;Merchant&#x60;. |  [optional] |
|**verification** | **String** |  |  [optional] |
|**links** | [**MerchantLinks**](MerchantLinks.md) |  |  [optional] |



## Enum: OnboardingStateEnum

| Name | Value |
|---- | -----|
| PROVISIONING | &quot;PROVISIONING&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |



