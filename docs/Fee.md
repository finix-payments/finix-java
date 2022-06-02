

# Fee

An out of flow fee that is added to a settlement

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** | Key value pair for annotating custom meta data (e.g. order numbers). |  [optional] |
|**id** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp of when the object was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp of when the object was last updated |  [optional] |
|**amount** | **Integer** |  |  [optional] |
|**currency** | **Currency** |  |  [optional] |
|**displayName** | **String** |  |  [optional] |
|**feeSubtype** | [**FeeSubtypeEnum**](#FeeSubtypeEnum) |  |  [optional] |
|**feeType** | [**FeeTypeEnum**](#FeeTypeEnum) |  |  [optional] |
|**linkedId** | **String** | ID of the linked resource |  [optional] |
|**linkedType** | [**LinkedTypeEnum**](#LinkedTypeEnum) |  |  [optional] |
|**merchant** | **String** |  |  [optional] |
|**links** | [**FeeLinks**](FeeLinks.md) |  |  [optional] |



## Enum: FeeSubtypeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;CUSTOM&quot; |
| APPLICATION_FEE | &quot;APPLICATION_FEE&quot; |
| PLATFORM_FEE | &quot;PLATFORM_FEE&quot; |



## Enum: FeeTypeEnum

| Name | Value |
|---- | -----|
| APPLICATION_FEE | &quot;APPLICATION_FEE&quot; |
| ACH_BASIS_POINTS | &quot;ACH_BASIS_POINTS&quot; |
| ACH_FIXED | &quot;ACH_FIXED&quot; |
| CARD_BASIS_POINTS | &quot;CARD_BASIS_POINTS&quot; |
| CARD_FIXED | &quot;CARD_FIXED&quot; |
| CARD_INTERCHANGE | &quot;CARD_INTERCHANGE&quot; |
| VISA_BASIS_POINTS | &quot;VISA_BASIS_POINTS&quot; |
| VISA_FIXED | &quot;VISA_FIXED&quot; |
| VISA_INTERCHANGE | &quot;VISA_INTERCHANGE&quot; |
| VISA_ASSESSMENT_BASIS_POINTS | &quot;VISA_ASSESSMENT_BASIS_POINTS&quot; |
| VISA_ACQUIRER_PROCESSING_FIXED | &quot;VISA_ACQUIRER_PROCESSING_FIXED&quot; |
| VISA_CREDIT_VOUCHER_FIXED | &quot;VISA_CREDIT_VOUCHER_FIXED&quot; |
| VISA_BASE_II_SYSTEM_FILE_TRANSMISSION_FIXED | &quot;VISA_BASE_II_SYSTEM_FILE_TRANSMISSION_FIXED&quot; |
| VISA_BASE_II_CREDIT_VOUCHER_FIXED | &quot;VISA_BASE_II_CREDIT_VOUCHER_FIXED&quot; |
| VISA_KILOBYTE_ACCESS_FIXED | &quot;VISA_KILOBYTE_ACCESS_FIXED&quot; |
| DISCOVER_BASIS_POINTS | &quot;DISCOVER_BASIS_POINTS&quot; |
| DISCOVER_FIXED | &quot;DISCOVER_FIXED&quot; |
| DISCOVER_INTERCHANGE | &quot;DISCOVER_INTERCHANGE&quot; |
| DISCOVER_ASSESSMENT_BASIS_POINTS | &quot;DISCOVER_ASSESSMENT_BASIS_POINTS&quot; |
| DISCOVER_DATA_USAGE_FIXED | &quot;DISCOVER_DATA_USAGE_FIXED&quot; |
| DISCOVER_NETWORK_AUTHORIZATION_FIXED | &quot;DISCOVER_NETWORK_AUTHORIZATION_FIXED&quot; |
| DINERS_CLUB_BASIS_POINTS | &quot;DINERS_CLUB_BASIS_POINTS&quot; |
| DINERS_CLUB_FIXED | &quot;DINERS_CLUB_FIXED&quot; |
| DINERS_CLUB_INTERCHANGE | &quot;DINERS_CLUB_INTERCHANGE&quot; |
| MASTERCARD_BASIS_POINTS | &quot;MASTERCARD_BASIS_POINTS&quot; |
| MASTERCARD_FIXED | &quot;MASTERCARD_FIXED&quot; |
| MASTERCARD_INTERCHANGE | &quot;MASTERCARD_INTERCHANGE&quot; |
| MASTERCARD_ASSESSMENT_UNDER_1K_BASIS_POINTS | &quot;MASTERCARD_ASSESSMENT_UNDER_1K_BASIS_POINTS&quot; |
| MASTERCARD_ASSESSMENT_OVER_1K_BASIS_POINTS | &quot;MASTERCARD_ASSESSMENT_OVER_1K_BASIS_POINTS&quot; |
| MASTERCARD_ACQUIRER_FEE_BASIS_POINTS | &quot;MASTERCARD_ACQUIRER_FEE_BASIS_POINTS&quot; |
| JCB_BASIS_POINTS | &quot;JCB_BASIS_POINTS&quot; |
| JCB_FIXED | &quot;JCB_FIXED&quot; |
| JCB_INTERCHANGE | &quot;JCB_INTERCHANGE&quot; |
| AMERICAN_EXPRESS_BASIS_POINTS | &quot;AMERICAN_EXPRESS_BASIS_POINTS&quot; |
| AMERICAN_EXPRESS_FIXED | &quot;AMERICAN_EXPRESS_FIXED&quot; |
| AMERICAN_EXPRESS_INTERCHANGE | &quot;AMERICAN_EXPRESS_INTERCHANGE&quot; |
| AMERICAN_EXPRESS_ASSESSMENT_BASIS_POINTS | &quot;AMERICAN_EXPRESS_ASSESSMENT_BASIS_POINTS&quot; |
| DISPUTE_INQUIRY_FIXED_FEE | &quot;DISPUTE_INQUIRY_FIXED_FEE&quot; |
| DISPUTE_FIXED_FEE | &quot;DISPUTE_FIXED_FEE&quot; |
| QUALIFIED_TIER_BASIS_POINTS_FEE | &quot;QUALIFIED_TIER_BASIS_POINTS_FEE&quot; |
| QUALIFIED_TIER_FIXED_FEE | &quot;QUALIFIED_TIER_FIXED_FEE&quot; |
| CUSTOM | &quot;CUSTOM&quot; |
| ACH_DEBIT_RETURN_FIXED_FEE | &quot;ACH_DEBIT_RETURN_FIXED_FEE&quot; |
| ACH_CREDIT_RETURN_FIXED_FEE | &quot;ACH_CREDIT_RETURN_FIXED_FEE&quot; |
| ANCILLARY_FIXED_FEE_PRIMARY | &quot;ANCILLARY_FIXED_FEE_PRIMARY&quot; |
| ANCILLARY_FIXED_FEE_SECONDARY | &quot;ANCILLARY_FIXED_FEE_SECONDARY&quot; |
| SETTLEMENT_V2_TRANSFER | &quot;SETTLEMENT_V2_TRANSFER&quot; |



## Enum: LinkedTypeEnum

| Name | Value |
|---- | -----|
| APPLICATION | &quot;APPLICATION&quot; |
| PLATFORM | &quot;PLATFORM&quot; |
| SUBSCRIPTION | &quot;SUBSCRIPTION&quot; |
| TRANSFER | &quot;TRANSFER&quot; |



