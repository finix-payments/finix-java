

# CreateIdentityRequestAdditionalUnderwritingData

Additional underwriting data that's required to verify the identity of the merchant.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantAgreementAccepted** | **Boolean** | Sets whether this merchant has accepted the terms and conditions of the merchant agreement. |  [optional] |
|**merchantAgreementIpAddress** | **String** | IP address of the merchant when this merchant accepted the merchant agreement (e.g., 42.1.1.113). |  [optional] |
|**volumeDistributionByBusinessType** | [**CreateIdentityRequestAdditionalUnderwritingDataVolumeDistributionByBusinessType**](CreateIdentityRequestAdditionalUnderwritingDataVolumeDistributionByBusinessType.md) |  |  [optional] |
|**averageAchTransferAmount** | **BigDecimal** | The approximate average ACH sale amount (in cents) for this merchant. |  [optional] |
|**annualAchVolume** | **BigDecimal** | The approximate annual ACH sales expected to be processed (in cents) by this merchant (max 10 characters). |  [optional] |
|**creditCheckUserAgent** | **String** | The details of the browser that was used when this merchant consented to a credit check (e.g., Mozilla 5.0 (Macintosh; Intel Mac OS X 10 _14_6)). |  [optional] |
|**refundPolicy** | **String** | Set one of the following values: &lt;ul&gt;&lt;li&gt;**NO_REFUNDS**&lt;li&gt;**MERCHANDISE_EXCHANGE_ONLY**&lt;li&gt;**30_DAYS** |  [optional] |
|**creditCheckTimestamp** | **String** | A timestamp of when this merchant consented to a credit check (e.g., 2021-04-28T16:42:55Z). |  [optional] |
|**creditCheckAllowed** | **Boolean** | Sets if this merchant has consented and accepted to a credit check. |  [optional] |
|**merchantAgreementTimestamp** | **String** | Timestamp of when the merchant accepted Finix&#39;s Terms of Service (e.g., 2021-04-28T16:42:55Z). |  [optional] |
|**businessDescription** | **String** | Description of this merchant&#39;s business (max 200 characters). |  [optional] |
|**averageCardTransferAmount** | **BigDecimal** | The average credit card sale amount (in cents) for this merchant. |  [optional] |
|**creditCheckIpAddress** | **String** | The IP address of the merchant when they consented to a credit check (e.g., 42.1.1.113 ). |  [optional] |
|**merchantAgreementUserAgent** | **String** | The details of the browser that was used when this merchant accepted Finix&#39;s Terms of Service (e.g., Mozilla 5.0 (Macintosh; Intel Mac OS X 10 _14_6)). |  [optional] |
|**cardVolumeDistribution** | [**CreateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution**](CreateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution.md) |  |  [optional] |



