

# CreateAuthorizationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** | Key value pair for annotating custom meta data (e.g. order numbers). |  [optional] |
|**amount** | **BigDecimal** |  |  |
|**currency** | **Currency** |  |  |
|**idempotencyId** | **String** |  |  [optional] |
|**merchantIdentity** | **String** | The ID of the resource. |  |
|**processor** | [**ProcessorEnum**](#ProcessorEnum) |  |  [optional] |
|**source** | **String** | The ID of the resource. |  |



## Enum: ProcessorEnum

| Name | Value |
|---- | -----|
| AFFIPAY_V1 | &quot;AFFIPAY_V1&quot; |
| CHECKOUT_V1 | &quot;CHECKOUT_V1&quot; |
| DUMMY_V1 | &quot;DUMMY_V1&quot; |
| ELAVON_V1 | &quot;ELAVON_V1&quot; |
| EXPRESS_V1 | &quot;EXPRESS_V1&quot; |
| FINIX_VISA_SANDBOX_V1 | &quot;FINIX_VISA_SANDBOX_V1&quot; |
| LITLE_V1 | &quot;LITLE_V1&quot; |
| MASTERCARD_V1 | &quot;MASTERCARD_V1&quot; |
| MICROBILT_V1 | &quot;MICROBILT_V1&quot; |
| MYTHICAL_V1 | &quot;MYTHICAL_V1&quot; |
| NMI_V1 | &quot;NMI_V1&quot; |
| SKRILL_V1 | &quot;SKRILL_V1&quot; |
| STRIPE_V1 | &quot;STRIPE_V1&quot; |
| TRIPOS_CLOUD_V1 | &quot;TRIPOS_CLOUD_V1&quot; |
| TRIPOS_MOBILE_V1 | &quot;TRIPOS_MOBILE_V1&quot; |
| TRULIOO_V1 | &quot;TRULIOO_V1&quot; |
| VANTIV_V1 | &quot;VANTIV_V1&quot; |
| VISA_V1 | &quot;VISA_V1&quot; |



