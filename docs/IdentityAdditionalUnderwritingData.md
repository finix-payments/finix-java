

# IdentityAdditionalUnderwritingData

Additional underwriting data that's required to verify the identity of the merchant.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**annualAchVolume** | **BigDecimal** | The approximate annual ACH sales expected to be processed (in cents) by this merchant (max 10 characters). |  [optional] |
|**averageAchTransferAmount** | **BigDecimal** | The approximate average ACH sale amount (in cents) for this merchant. |  [optional] |
|**averageCardTransferAmount** | **BigDecimal** | The average credit card sale amount (in cents) for this merchant. |  [optional] |
|**businessDescription** | **String** | Description of this merchant&#39;s business (max 200 characters). |  [optional] |
|**cardVolumeDistribution** | [**IdentityAdditionalUnderwritingDataCardVolumeDistribution**](IdentityAdditionalUnderwritingDataCardVolumeDistribution.md) |  |  [optional] |
|**creditCheckAllowed** | **Boolean** | Sets if this merchant has consented and accepted to a credit check. |  [optional] |
|**creditCheckIpAddress** | **String** | The IP address of the merchant when they consented to a credit check (e.g., 42.1.1.113 ). |  [optional] |
|**creditCheckTimestamp** | **String** | A timestamp of when this merchant consented to a credit check (e.g., 2021-04-28T16:42:55Z). |  [optional] |
|**creditCheckUserAgent** | **String** | The details of the browser that was used when this merchant consented to a credit check (e.g., Mozilla 5.0 (Macintosh; Intel Mac OS X 10 _14_6)). |  [optional] |
|**merchantAgreementAccepted** | **Boolean** | Sets whether this merchant has accepted the terms and conditions of the merchant agreement. |  [optional] |
|**merchantAgreementIpAddress** | **String** | IP address of the merchant when this merchant accepted the merchant agreement (e.g., 42.1.1.113). |  [optional] |
|**merchantAgreementTimestamp** | **String** | Timestamp of when the merchant accepted Finix&#39;s Terms of Service (e.g., 2021-04-28T16:42:55Z). |  [optional] |
|**merchantAgreementUserAgent** | **String** | The details of the browser that was used when this merchant accepted Finix&#39;s Terms of Service (e.g., Mozilla 5.0 (Macintosh; Intel Mac OS X 10 _14_6)). |  [optional] |
|**refundPolicy** | **String** | Set one of the following values:&lt;ul&gt;&lt;li&gt; &lt;strong&gt;NO_REFUNDS&lt;/strong&gt;&lt;li&gt;&lt;strong&gt;MERCHANDISE_EXCHANGE_ONLY&lt;/strong&gt; &lt;li&gt;&lt;strong&gt;WITHIN_30_DAYS&lt;/strong&gt;&lt;li&gt;&lt;strong&gt;OTHER&lt;/strong&gt;&lt;/ul&gt; |  [optional] |
|**volumeDistributionByBusinessType** | [**IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType**](IdentityAdditionalUnderwritingDataVolumeDistributionByBusinessType.md) |  |  [optional] |



