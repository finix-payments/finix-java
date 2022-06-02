

# ProcessorOneOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp of when the object was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp of when the object was last updated |  [optional] |
|**application** | **String** | The ID of the resource. |  [optional] |
|**applicationConfig** | [**ProcessorOneOfApplicationConfig**](ProcessorOneOfApplicationConfig.md) |  |  [optional] |
|**config** | **Object** |  |  [optional] |
|**defaultMerchantProfile** | **String** | The ID of the resource. |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**processor** | [**ProcessorEnum**](#ProcessorEnum) |  |  [optional] |
|**systemConfig** | [**ProcessorOneOfSystemConfig**](ProcessorOneOfSystemConfig.md) |  |  [optional] |
|**links** | [**ProcessorOneOfLinks**](ProcessorOneOfLinks.md) |  |  [optional] |



## Enum: ProcessorEnum

| Name | Value |
|---- | -----|
| VISA_V1 | &quot;VISA_V1&quot; |



