

# CreateMerchantUnderwritingRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Object** | Key value pair for annotating custom meta data (e.g. order numbers). |  [optional] |
|**gateway** | [**GatewayEnum**](#GatewayEnum) | Name of the gateway that process the &#x60;Merchant&#x60;&#39;s transaction. |  [optional] |
|**processor** | **String** | Name of acquiring processor that settles the &#x60;Merchant&#x60;&#39;s transactions. |  [optional] |
|**processorSpecificParameters** | **Object** | Additional information required by the processor being used. |  [optional] |



## Enum: GatewayEnum

| Name | Value |
|---- | -----|
| CLOUD_V1 | &quot;TRIPOS_CLOUD_V1&quot; |
| MOBILE_V1 | &quot;TRIPOS_MOBILE_V1&quot; |



