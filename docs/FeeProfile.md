

# FeeProfile


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** | Key value pair for annotating custom meta data (e.g. order numbers). |  [optional] |
|**id** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp of when the object was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp of when the object was last updated |  [optional] |
|**achBasisPoints** | **BigDecimal** |  |  [optional] |
|**achCreditReturnFixedFee** | **BigDecimal** |  |  [optional] |
|**achDebitReturnFixedFee** | **BigDecimal** |  |  [optional] |
|**achFixedFee** | **BigDecimal** |  |  [optional] |
|**americanExpressAssessmentBasisPoints** | **BigDecimal** |  |  [optional] |
|**americanExpressBasisPoints** | **BigDecimal** |  |  [optional] |
|**americanExpressChargeInterchange** | **Boolean** |  |  [optional] |
|**americanExpressFixedFee** | **BigDecimal** |  |  [optional] |
|**ancillaryFixedFeePrimary** | **BigDecimal** |  |  [optional] |
|**ancillaryFixedFeeSecondary** | **BigDecimal** |  |  [optional] |
|**application** | **String** | The ID of the resource. |  [optional] |
|**basisPoints** | **BigDecimal** |  |  [optional] |
|**chargeInterchange** | **Boolean** |  |  [optional] |
|**dinersClubBasisPoints** | **BigDecimal** |  |  [optional] |
|**dinersClubChargeInterchange** | **Boolean** |  |  [optional] |
|**dinersClubFixedFee** | **BigDecimal** |  |  [optional] |
|**discoverAssessmentsBasisPoints** | **BigDecimal** |  |  [optional] |
|**discoverBasisPoints** | **BigDecimal** |  |  [optional] |
|**discoverChargeInterchange** | **Boolean** |  |  [optional] |
|**discoverDataUsageFixedFee** | **BigDecimal** |  |  [optional] |
|**discoverFixedFee** | **BigDecimal** |  |  [optional] |
|**discoverNetworkAuthorizationFixedFee** | **BigDecimal** |  |  [optional] |
|**disputeFixedFee** | **BigDecimal** |  |  [optional] |
|**disputeInquiryFixedFee** | **BigDecimal** |  |  [optional] |
|**fixedFee** | **BigDecimal** |  |  |
|**jcbBasisPoints** | **BigDecimal** |  |  [optional] |
|**jcbChargeInterchange** | **Boolean** |  |  [optional] |
|**jcbFixedFee** | **BigDecimal** |  |  [optional] |
|**mastercardAcquirerFeesBasisPoints** | **BigDecimal** |  |  [optional] |
|**mastercardAssessmentsOver1kBasisPoints** | **BigDecimal** |  |  [optional] |
|**mastercardAssessmentsUnder1kBasisPoints** | **BigDecimal** |  |  [optional] |
|**mastercardBasisPoints** | **BigDecimal** |  |  [optional] |
|**mastercardChargeInterchange** | **Boolean** |  |  [optional] |
|**mastercardFixedFee** | **BigDecimal** |  |  [optional] |
|**qualifiedTiers** | **Object** |  |  [optional] |
|**roundingMode** | [**RoundingModeEnum**](#RoundingModeEnum) |  |  [optional] |
|**visaAcquirerProcessingFixedFee** | **BigDecimal** |  |  [optional] |
|**visaAssessmentsBasisPoints** | **BigDecimal** |  |  [optional] |
|**visaBaseIICreditVoucherFixedFee** | **BigDecimal** |  |  [optional] |
|**visaBaseIISystemFileTransmissionFixedFee** | **BigDecimal** |  |  [optional] |
|**visaBasisPoints** | **BigDecimal** |  |  [optional] |
|**visaChargeInterchange** | **Boolean** |  |  [optional] |
|**visaCreditVoucherFixedFee** | **BigDecimal** |  |  [optional] |
|**visaFixedFee** | **BigDecimal** |  |  [optional] |
|**visaKilobyteAccessFixedFee** | **BigDecimal** |  |  [optional] |
|**links** | [**FeeProfileLinks**](FeeProfileLinks.md) |  |  [optional] |



## Enum: RoundingModeEnum

| Name | Value |
|---- | -----|
| TRANSACTION | &quot;TRANSACTION&quot; |
| AGGREGATE | &quot;AGGREGATE&quot; |



