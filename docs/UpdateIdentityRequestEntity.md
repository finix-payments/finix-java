

# UpdateIdentityRequestEntity

Underwriting data that's required to verify the identity of the merchant.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastName** | **String** | The legal last name of the merchant&#39;s control owner (max 20 characters). |  |
|**maxTransactionAmount** | **BigDecimal** | The maximum amount (in cents) that can be charged for a single transaction (max 12 characters). |  [optional] |
|**hasAcceptedCreditCardsPreviously** | **Boolean** | Defaults to **false** if not passed. |  [optional] |
|**defaultStatementDescriptor** | **String** | The description of the merchant that appears on the buyer&#39;s bank or card statement. |  [optional] |
|**personalAddress** | [**CreateIdentityRequestEntityPersonalAddress**](CreateIdentityRequestEntityPersonalAddress.md) |  |  [optional] |
|**incorporationDate** | [**CreateIdentityRequestEntityIncorporationDate**](CreateIdentityRequestEntityIncorporationDate.md) |  |  [optional] |
|**businessAddress** | [**UpdateIdentityRequestEntityBusinessAddress**](UpdateIdentityRequestEntityBusinessAddress.md) |  |  [optional] |
|**ownershipType** | **String** | Values can be either: &lt;ul&gt;&lt;li&gt;&lt;strong&gt;PUBLIC&lt;/strong&gt; to indicate a publicly-traded company. &lt;li&gt;&lt;strong&gt;PRIVATE&lt;/strong&gt; for privately-held businesses. |  [optional] |
|**firstName** | **String** | The legal first name of the merchant&#39;s control owner (max 20 characters). |  |
|**title** | **String** | The corporate title of the control owner (e.g. Chief Executive Officer, CFO, etc. Max 60 characters). |  [optional] |
|**businessTaxId** | **String** | Details if the &#x60;business_tax_id&#x60; was provided. |  [optional] |
|**doingBusinessAs** | **String** | Alternate names of the business. If there are no other names, pass the same value used for &#x60;business_name&#x60; (max 60 characters). |  [optional] |
|**principalPercentageOwnership** | **BigDecimal** | Percentage of the company owned by the principal control owner (min 0; max 100). |  [optional] |
|**email** | **String** | The email address of the principal control owner where they can be reached (max 100 characters). |  |
|**mcc** | **String** | The Merchant Category Code ([MCC](http://www.dm.usda.gov/procurement/card/card_x/mcc.pdf)) that this merchant will be classified under. |  [optional] |
|**phone** | **String** | The principal control owner&#39;s phone number (max 10 characters). |  |
|**businessName** | **String** | Abbreviated names of the business. If there are no abbreviated name, leave this field blank. |  [optional] |
|**taxId** | **String** | Details if the &#x60;tax_id&#x60; was provided. |  [optional] |
|**businessType** | **String** | Pass one of the following values:&lt;ul&gt;&lt;li&gt;&lt;strong&gt;INDIVIDUAL\\_SOLE\\_PROPRIETORSHIP&lt;li&gt;CORPORATION&lt;li&gt;LIMITED\\_LIABILITY\\_COMPANY&lt;li&gt;PARTNERSHIP&lt;li&gt;ASSOCIATION\\_ESTATE\\_TRUST&lt;li&gt;TAX\\_EXEMPT\\_ORGANIZATION&lt;li&gt;INTERNATIONAL\\_ORGANIZATION&lt;li&gt;GOVERNMENT\\_AGENCY&lt;/strong&gt; |  [optional] |
|**businessPhone** | **String** | Customer service phone number where the merchant can be reached (max 10 characters). |  [optional] |
|**dob** | [**UpdateIdentityRequestEntityDob**](UpdateIdentityRequestEntityDob.md) |  |  [optional] |
|**url** | **String** | The URL of the merchant&#39;s public website. |  [optional] |
|**annualCardVolume** | **BigDecimal** | The annual credit card sales (in cents) expected to be processed by this merchant (max 19 characters). |  [optional] |



