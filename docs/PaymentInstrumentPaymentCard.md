

# PaymentInstrumentPaymentCard


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** | Key value pair for annotating custom meta data (e.g. order numbers). |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**id** | **String** | The ID of the resource. |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp of when the object was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp of when the object was last updated |  [optional] |
|**address** | [**Address**](Address.md) |  |  [optional] |
|**addressVerification** | [**AddressVerificationEnum**](#AddressVerificationEnum) |  |  [optional] |
|**application** | **String** | The ID of the resource. |  [optional] |
|**bin** | **String** |  |  [optional] |
|**brand** | [**BrandEnum**](#BrandEnum) |  |  [optional] |
|**cardName** | **String** |  |  [optional] |
|**cardType** | [**CardTypeEnum**](#CardTypeEnum) |  |  [optional] |
|**currency** | **Currency** |  |  [optional] |
|**expirationMonth** | **Integer** |  |  [optional] |
|**expirationYear** | **Integer** |  |  [optional] |
|**fastFundsIndicator** | **String** |  |  [optional] |
|**fingerprint** | **String** |  |  [optional] |
|**identity** | **String** | The ID of the resource. |  [optional] |
|**instrumentType** | [**InstrumentTypeEnum**](#InstrumentTypeEnum) |  |  [optional] |
|**lastFour** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**onlineGambingBlockIndicator** | **String** |  |  [optional] |
|**payloadType** | [**PayloadTypeEnum**](#PayloadTypeEnum) |  |  [optional] |
|**pushFundsBlockIndicator** | **String** |  |  [optional] |
|**securityCodeVerification** | [**SecurityCodeVerificationEnum**](#SecurityCodeVerificationEnum) |  |  [optional] |
|**links** | [**PaymentInstrumentPaymentCardLinks**](PaymentInstrumentPaymentCardLinks.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PAYMENT_CARD | &quot;PAYMENT_CARD&quot; |



## Enum: AddressVerificationEnum

| Name | Value |
|---- | -----|
| POSTAL_CODE_AND_STREET_MATCH | &quot;POSTAL_CODE_AND_STREET_MATCH&quot; |
| STREET_MATCH | &quot;STREET_MATCH&quot; |
| POSTAL_CODE_MATCH | &quot;POSTAL_CODE_MATCH&quot; |
| NO_ADDRESS | &quot;NO_ADDRESS&quot; |
| NO_MATCH | &quot;NO_MATCH&quot; |
| NOT_SUPPORTED | &quot;NOT_SUPPORTED&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



## Enum: BrandEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;UNKNOWN&quot; |
| DINERS_CLUB_INTERNATIONAL | &quot;DINERS_CLUB_INTERNATIONAL&quot; |
| DANKORT | &quot;DANKORT&quot; |
| MIR | &quot;MIR&quot; |
| TROY | &quot;TROY&quot; |
| UATP | &quot;UATP&quot; |
| CHINA_T_UNION | &quot;CHINA_T_UNION&quot; |
| CHINA_UNION_PAY | &quot;CHINA_UNION_PAY&quot; |
| AMERICAN_EXPRESS | &quot;AMERICAN_EXPRESS&quot; |
| VERVE | &quot;VERVE&quot; |
| RUPAY | &quot;RUPAY&quot; |
| DISCOVER | &quot;DISCOVER&quot; |
| JCB | &quot;JCB&quot; |
| MASTERCARD | &quot;MASTERCARD&quot; |
| INTERPAYMENT | &quot;INTERPAYMENT&quot; |
| INSTAPAYMENT | &quot;INSTAPAYMENT&quot; |
| MAESTRO | &quot;MAESTRO&quot; |
| VISA | &quot;VISA&quot; |
| LANKAPAY | &quot;LANKAPAY&quot; |
| DINERS_CLUB | &quot;DINERS_CLUB&quot; |



## Enum: CardTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;UNKNOWN&quot; |
| PREPAID | &quot;PREPAID&quot; |
| CREDIT | &quot;CREDIT&quot; |
| DEBIT | &quot;DEBIT&quot; |
| FSA | &quot;FSA&quot; |



## Enum: InstrumentTypeEnum

| Name | Value |
|---- | -----|
| PAYMENT_CARD | &quot;PAYMENT_CARD&quot; |



## Enum: PayloadTypeEnum

| Name | Value |
|---- | -----|
| SOURCE | &quot;SOURCE&quot; |
| DESTINATION | &quot;DESTINATION&quot; |



## Enum: SecurityCodeVerificationEnum

| Name | Value |
|---- | -----|
| MATCHED | &quot;MATCHED&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |
| UNMATCHED | &quot;UNMATCHED&quot; |



