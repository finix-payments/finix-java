

# ProcessorOneOfSystemConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**CLASS_KEY_IDENTIFIER** | [**CLASSKEYIDENTIFIEREnum**](#CLASSKEYIDENTIFIEREnum) |  |  [optional] |
|**acquirerCountryCode** | [**AcquirerCountryCodeEnum**](#AcquirerCountryCodeEnum) |  |  [optional] |
|**acquiringBin** | **String** |  |  [optional] |
|**allowCreditForPartner** | **Boolean** |  |  [optional] |
|**availableCountries** | **List&lt;Country&gt;** |  |  [optional] |
|**businessApplicationId** | **String** | The ID of the resource. |  [optional] |
|**configurationTemplates** | [**ProcessorOneOfSystemConfigConfigurationTemplates**](ProcessorOneOfSystemConfigConfigurationTemplates.md) |  |  [optional] |
|**defaultCurrencies** | **List&lt;Currency&gt;** |  |  [optional] |
|**disablePpgs** | **Boolean** |  |  [optional] |
|**feeProgramIndicator** | **String** |  |  [optional] |
|**gatewayProxyCertificate** | **String** |  |  [optional] |
|**gatewayProxyHost** | **String** |  |  [optional] |
|**gatewayProxyPassword** | **String** |  |  [optional] |
|**gatewayProxyPort** | **String** |  |  [optional] |
|**gatewayProxyUsername** | **String** |  |  [optional] |
|**keyStorePassword** | **String** |  |  [optional] |
|**keyStorePath** | **String** |  |  [optional] |
|**merchantPseudoAbaNumber** | **String** |  |  [optional] |
|**onlineCreditProcessing** | **Boolean** |  |  [optional] |
|**onlineDebitProcessing** | **Boolean** |  |  [optional] |
|**password** | **String** |  |  [optional] |
|**privateKeyPassword** | **String** |  |  [optional] |
|**processorSequenceLimit** | **Integer** |  |  [optional] |
|**pseudoBatchPush** | **Boolean** |  |  [optional] |
|**sourceOfFunds** | [**SourceOfFundsEnum**](#SourceOfFundsEnum) |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**visaAcceptanceCloudKeyStorePath** | **String** |  |  [optional] |
|**visaAcceptanceCloudPassword** | **String** |  |  [optional] |
|**visaAcceptanceCloudUrl** | **String** |  |  [optional] |
|**visaAcceptanceCloudUserId** | **String** |  |  [optional] |
|**visaUrl** | **String** |  |  [optional] |



## Enum: CLASSKEYIDENTIFIEREnum

| Name | Value |
|---- | -----|
| IO_FINIX_VISA_DIRECT_CLIENT_VISASYSTEMCONFIG | &quot;io.finix.visa.direct.client.VisaSystemConfig&quot; |



## Enum: AcquirerCountryCodeEnum

| Name | Value |
|---- | -----|
| _004 | &quot;004&quot; |
| _008 | &quot;008&quot; |
| _010 | &quot;010&quot; |
| _012 | &quot;012&quot; |
| _016 | &quot;016&quot; |
| _020 | &quot;020&quot; |
| _024 | &quot;024&quot; |
| _028 | &quot;028&quot; |
| _031 | &quot;031&quot; |
| _032 | &quot;032&quot; |
| _036 | &quot;036&quot; |
| _040 | &quot;040&quot; |
| _044 | &quot;044&quot; |
| _048 | &quot;048&quot; |
| _050 | &quot;050&quot; |
| _051 | &quot;051&quot; |
| _052 | &quot;052&quot; |
| _056 | &quot;056&quot; |
| _060 | &quot;060&quot; |
| _064 | &quot;064&quot; |
| _068 | &quot;068&quot; |
| _070 | &quot;070&quot; |
| _072 | &quot;072&quot; |
| _074 | &quot;074&quot; |
| _076 | &quot;076&quot; |
| _084 | &quot;084&quot; |
| _086 | &quot;086&quot; |
| _090 | &quot;090&quot; |
| _092 | &quot;092&quot; |
| _096 | &quot;096&quot; |
| _100 | &quot;100&quot; |
| _104 | &quot;104&quot; |
| _108 | &quot;108&quot; |
| _112 | &quot;112&quot; |
| _116 | &quot;116&quot; |
| _120 | &quot;120&quot; |
| _124 | &quot;124&quot; |
| _132 | &quot;132&quot; |
| _136 | &quot;136&quot; |
| _140 | &quot;140&quot; |
| _144 | &quot;144&quot; |
| _148 | &quot;148&quot; |
| _152 | &quot;152&quot; |
| _156 | &quot;156&quot; |
| _158 | &quot;158&quot; |
| _162 | &quot;162&quot; |
| _166 | &quot;166&quot; |
| _170 | &quot;170&quot; |
| _174 | &quot;174&quot; |
| _175 | &quot;175&quot; |
| _178 | &quot;178&quot; |
| _180 | &quot;180&quot; |
| _184 | &quot;184&quot; |
| _188 | &quot;188&quot; |
| _191 | &quot;191&quot; |
| _192 | &quot;192&quot; |
| _196 | &quot;196&quot; |
| _203 | &quot;203&quot; |
| _204 | &quot;204&quot; |
| _208 | &quot;208&quot; |
| _212 | &quot;212&quot; |
| _214 | &quot;214&quot; |
| _218 | &quot;218&quot; |
| _222 | &quot;222&quot; |
| _226 | &quot;226&quot; |
| _231 | &quot;231&quot; |
| _232 | &quot;232&quot; |
| _233 | &quot;233&quot; |
| _234 | &quot;234&quot; |
| _238 | &quot;238&quot; |
| _239 | &quot;239&quot; |
| _242 | &quot;242&quot; |
| _246 | &quot;246&quot; |
| _248 | &quot;248&quot; |
| _250 | &quot;250&quot; |
| _254 | &quot;254&quot; |
| _258 | &quot;258&quot; |
| _260 | &quot;260&quot; |
| _262 | &quot;262&quot; |
| _266 | &quot;266&quot; |
| _268 | &quot;268&quot; |
| _270 | &quot;270&quot; |
| _275 | &quot;275&quot; |
| _276 | &quot;276&quot; |
| _288 | &quot;288&quot; |
| _292 | &quot;292&quot; |
| _296 | &quot;296&quot; |
| _300 | &quot;300&quot; |
| _304 | &quot;304&quot; |
| _308 | &quot;308&quot; |
| _312 | &quot;312&quot; |
| _316 | &quot;316&quot; |
| _320 | &quot;320&quot; |
| _324 | &quot;324&quot; |
| _328 | &quot;328&quot; |
| _332 | &quot;332&quot; |
| _334 | &quot;334&quot; |
| _336 | &quot;336&quot; |
| _340 | &quot;340&quot; |
| _344 | &quot;344&quot; |
| _348 | &quot;348&quot; |
| _352 | &quot;352&quot; |
| _356 | &quot;356&quot; |
| _360 | &quot;360&quot; |
| _364 | &quot;364&quot; |
| _368 | &quot;368&quot; |
| _372 | &quot;372&quot; |
| _376 | &quot;376&quot; |
| _380 | &quot;380&quot; |
| _384 | &quot;384&quot; |
| _388 | &quot;388&quot; |
| _392 | &quot;392&quot; |
| _398 | &quot;398&quot; |
| _400 | &quot;400&quot; |
| _404 | &quot;404&quot; |
| _408 | &quot;408&quot; |
| _410 | &quot;410&quot; |
| _414 | &quot;414&quot; |
| _417 | &quot;417&quot; |
| _418 | &quot;418&quot; |
| _422 | &quot;422&quot; |
| _426 | &quot;426&quot; |
| _428 | &quot;428&quot; |
| _430 | &quot;430&quot; |
| _434 | &quot;434&quot; |
| _438 | &quot;438&quot; |
| _440 | &quot;440&quot; |
| _442 | &quot;442&quot; |
| _446 | &quot;446&quot; |
| _450 | &quot;450&quot; |
| _454 | &quot;454&quot; |
| _458 | &quot;458&quot; |
| _462 | &quot;462&quot; |
| _466 | &quot;466&quot; |
| _470 | &quot;470&quot; |
| _474 | &quot;474&quot; |
| _478 | &quot;478&quot; |
| _480 | &quot;480&quot; |
| _484 | &quot;484&quot; |
| _492 | &quot;492&quot; |
| _496 | &quot;496&quot; |
| _498 | &quot;498&quot; |
| _499 | &quot;499&quot; |
| _500 | &quot;500&quot; |
| _504 | &quot;504&quot; |
| _508 | &quot;508&quot; |
| _512 | &quot;512&quot; |
| _516 | &quot;516&quot; |
| _520 | &quot;520&quot; |
| _524 | &quot;524&quot; |
| _528 | &quot;528&quot; |
| _531 | &quot;531&quot; |
| _533 | &quot;533&quot; |
| _534 | &quot;534&quot; |
| _535 | &quot;535&quot; |
| _540 | &quot;540&quot; |
| _548 | &quot;548&quot; |
| _554 | &quot;554&quot; |
| _558 | &quot;558&quot; |
| _562 | &quot;562&quot; |
| _566 | &quot;566&quot; |
| _570 | &quot;570&quot; |
| _574 | &quot;574&quot; |
| _578 | &quot;578&quot; |
| _580 | &quot;580&quot; |
| _581 | &quot;581&quot; |
| _583 | &quot;583&quot; |
| _584 | &quot;584&quot; |
| _585 | &quot;585&quot; |
| _586 | &quot;586&quot; |
| _591 | &quot;591&quot; |
| _598 | &quot;598&quot; |
| _600 | &quot;600&quot; |
| _604 | &quot;604&quot; |
| _608 | &quot;608&quot; |
| _612 | &quot;612&quot; |
| _616 | &quot;616&quot; |
| _620 | &quot;620&quot; |
| _624 | &quot;624&quot; |
| _626 | &quot;626&quot; |
| _630 | &quot;630&quot; |
| _634 | &quot;634&quot; |
| _638 | &quot;638&quot; |
| _642 | &quot;642&quot; |
| _643 | &quot;643&quot; |
| _646 | &quot;646&quot; |
| _652 | &quot;652&quot; |
| _654 | &quot;654&quot; |
| _659 | &quot;659&quot; |
| _660 | &quot;660&quot; |
| _662 | &quot;662&quot; |
| _663 | &quot;663&quot; |
| _666 | &quot;666&quot; |
| _670 | &quot;670&quot; |
| _674 | &quot;674&quot; |
| _678 | &quot;678&quot; |
| _682 | &quot;682&quot; |
| _686 | &quot;686&quot; |
| _688 | &quot;688&quot; |
| _690 | &quot;690&quot; |
| _694 | &quot;694&quot; |
| _702 | &quot;702&quot; |
| _703 | &quot;703&quot; |
| _704 | &quot;704&quot; |
| _705 | &quot;705&quot; |
| _706 | &quot;706&quot; |
| _710 | &quot;710&quot; |
| _716 | &quot;716&quot; |
| _724 | &quot;724&quot; |
| _728 | &quot;728&quot; |
| _729 | &quot;729&quot; |
| _732 | &quot;732&quot; |
| _740 | &quot;740&quot; |
| _744 | &quot;744&quot; |
| _748 | &quot;748&quot; |
| _752 | &quot;752&quot; |
| _756 | &quot;756&quot; |
| _760 | &quot;760&quot; |
| _762 | &quot;762&quot; |
| _764 | &quot;764&quot; |
| _768 | &quot;768&quot; |
| _772 | &quot;772&quot; |
| _776 | &quot;776&quot; |
| _780 | &quot;780&quot; |
| _784 | &quot;784&quot; |
| _788 | &quot;788&quot; |
| _792 | &quot;792&quot; |
| _795 | &quot;795&quot; |
| _796 | &quot;796&quot; |
| _798 | &quot;798&quot; |
| _800 | &quot;800&quot; |
| _804 | &quot;804&quot; |
| _807 | &quot;807&quot; |
| _818 | &quot;818&quot; |
| _826 | &quot;826&quot; |
| _831 | &quot;831&quot; |
| _832 | &quot;832&quot; |
| _833 | &quot;833&quot; |
| _834 | &quot;834&quot; |
| _840 | &quot;840&quot; |
| _850 | &quot;850&quot; |
| _854 | &quot;854&quot; |
| _858 | &quot;858&quot; |
| _860 | &quot;860&quot; |
| _862 | &quot;862&quot; |
| _876 | &quot;876&quot; |
| _882 | &quot;882&quot; |
| _887 | &quot;887&quot; |
| _894 | &quot;894&quot; |



## Enum: SourceOfFundsEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| _05 | &quot;05&quot; |
| _06 | &quot;06&quot; |



