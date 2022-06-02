

# CreateFeeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** | Key value pair for annotating custom meta data (e.g. order numbers). |  |
|**amount** | **BigDecimal** |  |  |
|**currency** | **Currency** |  |  |
|**displayName** | **String** |  |  |
|**feeSubtype** | [**FeeSubtypeEnum**](#FeeSubtypeEnum) |  |  |
|**feeType** | **FeeType** |  |  |
|**linkedId** | **String** | ID of the linked resource |  |
|**linkedType** | [**LinkedTypeEnum**](#LinkedTypeEnum) |  |  |
|**merchant** | **String** | The ID of the resource. |  |



## Enum: FeeSubtypeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;CUSTOM&quot; |



## Enum: LinkedTypeEnum

| Name | Value |
|---- | -----|
| APPLICATION | &quot;APPLICATION&quot; |
| PLATFORM | &quot;PLATFORM&quot; |
| SUBSCRIPTION | &quot;SUBSCRIPTION&quot; |
| TRANSFER | &quot;TRANSFER&quot; |



