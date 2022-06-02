

# IdentityEntityForm


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  [optional] |
|**amexMid** | **String** |  |  [optional] |
|**annualCardVolume** | **Long** |  |  [optional] |
|**businessAddress** | [**IdentityEntityFormBusinessAddress**](IdentityEntityFormBusinessAddress.md) |  |  [optional] |
|**businessName** | **String** |  |  [optional] |
|**businessPhone** | **String** |  |  [optional] |
|**businessTaxId** | **String** |  |  [optional] |
|**businessType** | [**BusinessTypeEnum**](#BusinessTypeEnum) |  |  [optional] |
|**defaultStatementDescriptor** | **String** |  |  [optional] |
|**discoverMid** | **String** |  |  [optional] |
|**dob** | [**IdentityEntityFormDob**](IdentityEntityFormDob.md) |  |  [optional] |
|**doingBusinessAs** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**hasAcceptedCreditCardsPreviously** | **Boolean** |  |  [optional] |
|**incorporationDate** | [**IdentityEntityFormDob**](IdentityEntityFormDob.md) |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**maxTransactionAmount** | **Long** |  |  [optional] |
|**mcc** | **String** |  |  [optional] |
|**ownershipType** | [**OwnershipTypeEnum**](#OwnershipTypeEnum) |  |  [optional] |
|**personalAddress** | [**Address**](Address.md) |  |  [optional] |
|**phone** | **String** |  |  [optional] |
|**principalPercentageOwnership** | **Integer** |  |  [optional] |
|**shortBusinessName** | **String** |  |  [optional] |
|**taxAuthority** | **String** |  |  [optional] |
|**taxId** | **String** |  |  [optional] |
|**url** | **String** |  |  [optional] |



## Enum: BusinessTypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL_SOLE_PROPRIETORSHIP | &quot;INDIVIDUAL_SOLE_PROPRIETORSHIP&quot; |
| CORPORATION | &quot;CORPORATION&quot; |
| LIMITED_LIABILITY_COMPANY | &quot;LIMITED_LIABILITY_COMPANY&quot; |
| PARTNERSHIP | &quot;PARTNERSHIP&quot; |
| LIMITED_PARTNERSHIP | &quot;LIMITED_PARTNERSHIP&quot; |
| GENERAL_PARTNERSHIP | &quot;GENERAL_PARTNERSHIP&quot; |
| ASSOCIATION_ESTATE_TRUST | &quot;ASSOCIATION_ESTATE_TRUST&quot; |
| TAX_EXEMPT_ORGANIZATION | &quot;TAX_EXEMPT_ORGANIZATION&quot; |
| INTERNATIONAL_ORGANIZATION | &quot;INTERNATIONAL_ORGANIZATION&quot; |
| GOVERNMENT_AGENCY | &quot;GOVERNMENT_AGENCY&quot; |
| JOINT_VENTURE | &quot;JOINT_VENTURE&quot; |



## Enum: OwnershipTypeEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;PRIVATE&quot; |
| PUBLIC | &quot;PUBLIC&quot; |



