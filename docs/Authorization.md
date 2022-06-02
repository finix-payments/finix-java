

# Authorization

A charge authorization

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** | Key value pair for annotating custom meta data (e.g. order numbers). |  [optional] |
|**id** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp of when the object was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp of when the object was last updated |  [optional] |
|**_3dsRedirectUrl** | **String** |  |  [optional] |
|**amount** | **BigDecimal** |  |  [optional] |
|**application** | **String** | The ID of the resource. |  [optional] |
|**captureAmount** | **Long** |  |  [optional] |
|**cardPresentDetails** | [**CardPresentDetails**](CardPresentDetails.md) |  |  [optional] |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) | ISO 4217 3 letter currency code |  [optional] |
|**device** | **String** |  |  [optional] |
|**expiresAt** | **OffsetDateTime** | Authorization expiration time. |  [optional] |
|**externalResponses** | [**List&lt;AuthorizationExternalResponses&gt;**](AuthorizationExternalResponses.md) |  |  [optional] |
|**idempotencyId** | **String** |  |  [optional] |
|**isVoid** | **Boolean** |  |  [optional] |
|**merchantIdentity** | **String** | The ID of the resource. |  [optional] |
|**messages** | **List&lt;String&gt;** |  |  [optional] |
|**raw** | **Object** | Raw response from the processor |  [optional] |
|**source** | **String** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**traceId** | **String** |  |  [optional] |
|**transfer** | **String** |  |  [optional] |
|**voidState** | **String** |  |  [optional] |
|**links** | [**AuthorizationLinks**](AuthorizationLinks.md) |  |  [optional] |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| AED | &quot;AED&quot; |
| AFN | &quot;AFN&quot; |
| ALL | &quot;ALL&quot; |
| AMD | &quot;AMD&quot; |
| ANG | &quot;ANG&quot; |
| AOA | &quot;AOA&quot; |
| ARS | &quot;ARS&quot; |
| AUD | &quot;AUD&quot; |
| AWG | &quot;AWG&quot; |
| AZN | &quot;AZN&quot; |
| BAM | &quot;BAM&quot; |
| BBD | &quot;BBD&quot; |
| BDT | &quot;BDT&quot; |
| BGN | &quot;BGN&quot; |
| BHD | &quot;BHD&quot; |
| BIF | &quot;BIF&quot; |
| BMD | &quot;BMD&quot; |
| BND | &quot;BND&quot; |
| BOB | &quot;BOB&quot; |
| BOV | &quot;BOV&quot; |
| BRL | &quot;BRL&quot; |
| BSD | &quot;BSD&quot; |
| BTN | &quot;BTN&quot; |
| BWP | &quot;BWP&quot; |
| BYR | &quot;BYR&quot; |
| BZD | &quot;BZD&quot; |
| CAD | &quot;CAD&quot; |
| CDF | &quot;CDF&quot; |
| CHE | &quot;CHE&quot; |
| CHF | &quot;CHF&quot; |
| CHW | &quot;CHW&quot; |
| CLF | &quot;CLF&quot; |
| CLP | &quot;CLP&quot; |
| CNY | &quot;CNY&quot; |
| COP | &quot;COP&quot; |
| COU | &quot;COU&quot; |
| CRC | &quot;CRC&quot; |
| CUC | &quot;CUC&quot; |
| CUP | &quot;CUP&quot; |
| CVE | &quot;CVE&quot; |
| CZK | &quot;CZK&quot; |
| DJF | &quot;DJF&quot; |
| DKK | &quot;DKK&quot; |
| DOP | &quot;DOP&quot; |
| DZD | &quot;DZD&quot; |
| EGP | &quot;EGP&quot; |
| ERN | &quot;ERN&quot; |
| ETB | &quot;ETB&quot; |
| EUR | &quot;EUR&quot; |
| FJD | &quot;FJD&quot; |
| FKP | &quot;FKP&quot; |
| GBP | &quot;GBP&quot; |
| GEL | &quot;GEL&quot; |
| GHS | &quot;GHS&quot; |
| GIP | &quot;GIP&quot; |
| GMD | &quot;GMD&quot; |
| GNF | &quot;GNF&quot; |
| GTQ | &quot;GTQ&quot; |
| GYD | &quot;GYD&quot; |
| HKD | &quot;HKD&quot; |
| HNL | &quot;HNL&quot; |
| HRK | &quot;HRK&quot; |
| HTG | &quot;HTG&quot; |
| HUF | &quot;HUF&quot; |
| IDR | &quot;IDR&quot; |
| ILS | &quot;ILS&quot; |
| INR | &quot;INR&quot; |
| IQD | &quot;IQD&quot; |
| IRR | &quot;IRR&quot; |
| ISK | &quot;ISK&quot; |
| JMD | &quot;JMD&quot; |
| JOD | &quot;JOD&quot; |
| JPY | &quot;JPY&quot; |
| KES | &quot;KES&quot; |
| KGS | &quot;KGS&quot; |
| KHR | &quot;KHR&quot; |
| KMF | &quot;KMF&quot; |
| KPW | &quot;KPW&quot; |
| KRW | &quot;KRW&quot; |
| KWD | &quot;KWD&quot; |
| KYD | &quot;KYD&quot; |
| KZT | &quot;KZT&quot; |
| LAK | &quot;LAK&quot; |
| LBP | &quot;LBP&quot; |
| LKR | &quot;LKR&quot; |
| LRD | &quot;LRD&quot; |
| LSL | &quot;LSL&quot; |
| LTL | &quot;LTL&quot; |
| LYD | &quot;LYD&quot; |
| MAD | &quot;MAD&quot; |
| MDL | &quot;MDL&quot; |
| MGA | &quot;MGA&quot; |
| MKD | &quot;MKD&quot; |
| MMK | &quot;MMK&quot; |
| MNT | &quot;MNT&quot; |
| MOP | &quot;MOP&quot; |
| MRO | &quot;MRO&quot; |
| MUR | &quot;MUR&quot; |
| MVR | &quot;MVR&quot; |
| MWK | &quot;MWK&quot; |
| MXN | &quot;MXN&quot; |
| MXV | &quot;MXV&quot; |
| MYR | &quot;MYR&quot; |
| MZN | &quot;MZN&quot; |
| NAD | &quot;NAD&quot; |
| NGN | &quot;NGN&quot; |
| NIO | &quot;NIO&quot; |
| NOK | &quot;NOK&quot; |
| NPR | &quot;NPR&quot; |
| NZD | &quot;NZD&quot; |
| OMR | &quot;OMR&quot; |
| PAB | &quot;PAB&quot; |
| PEN | &quot;PEN&quot; |
| PGK | &quot;PGK&quot; |
| PHP | &quot;PHP&quot; |
| PKR | &quot;PKR&quot; |
| PLN | &quot;PLN&quot; |
| PYG | &quot;PYG&quot; |
| QAR | &quot;QAR&quot; |
| RON | &quot;RON&quot; |
| RSD | &quot;RSD&quot; |
| RUB | &quot;RUB&quot; |
| RWF | &quot;RWF&quot; |
| SAR | &quot;SAR&quot; |
| SBD | &quot;SBD&quot; |
| SCR | &quot;SCR&quot; |
| SDG | &quot;SDG&quot; |
| SEK | &quot;SEK&quot; |
| SGD | &quot;SGD&quot; |
| SHP | &quot;SHP&quot; |
| SLL | &quot;SLL&quot; |
| SOS | &quot;SOS&quot; |
| SRD | &quot;SRD&quot; |
| SSP | &quot;SSP&quot; |
| STD | &quot;STD&quot; |
| SVC | &quot;SVC&quot; |
| SYP | &quot;SYP&quot; |
| SZL | &quot;SZL&quot; |
| THB | &quot;THB&quot; |
| TJS | &quot;TJS&quot; |
| TMT | &quot;TMT&quot; |
| TND | &quot;TND&quot; |
| TOP | &quot;TOP&quot; |
| TRY | &quot;TRY&quot; |
| TTD | &quot;TTD&quot; |
| TWD | &quot;TWD&quot; |
| TZS | &quot;TZS&quot; |
| UAH | &quot;UAH&quot; |
| UGX | &quot;UGX&quot; |
| USD | &quot;USD&quot; |
| USN | &quot;USN&quot; |
| UYI | &quot;UYI&quot; |
| UYU | &quot;UYU&quot; |
| UZS | &quot;UZS&quot; |
| VEF | &quot;VEF&quot; |
| VND | &quot;VND&quot; |
| VUV | &quot;VUV&quot; |
| WST | &quot;WST&quot; |
| XAF | &quot;XAF&quot; |
| XAG | &quot;XAG&quot; |
| XAU | &quot;XAU&quot; |
| XBA | &quot;XBA&quot; |
| XBB | &quot;XBB&quot; |
| XBC | &quot;XBC&quot; |
| XBD | &quot;XBD&quot; |
| XCD | &quot;XCD&quot; |
| XDR | &quot;XDR&quot; |
| XOF | &quot;XOF&quot; |
| XPD | &quot;XPD&quot; |
| XPF | &quot;XPF&quot; |
| XPT | &quot;XPT&quot; |
| XSU | &quot;XSU&quot; |
| XTS | &quot;XTS&quot; |
| XUA | &quot;XUA&quot; |
| XXX | &quot;XXX&quot; |
| YER | &quot;YER&quot; |
| ZAR | &quot;ZAR&quot; |
| ZMW | &quot;ZMW&quot; |
| ZWL | &quot;ZWL&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;CANCELED&quot; |
| PENDING | &quot;PENDING&quot; |
| FAILED | &quot;FAILED&quot; |
| SUCCEEDED | &quot;SUCCEEDED&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



