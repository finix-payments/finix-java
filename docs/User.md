

# User


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** | Key value pair for annotating custom meta data (e.g. order numbers). |  [optional] |
|**id** | **String** | The ID of the resource. |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp of when the object was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp of when the object was last updated |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**identity** | **String** |  |  [optional] |
|**password** | **String** |  |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) |  |  [optional] |
|**links** | [**UserLinks**](UserLinks.md) |  |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;ROLE_ADMIN&quot; |
| PLATFORM | &quot;ROLE_PLATFORM&quot; |
| PARTNER | &quot;ROLE_PARTNER&quot; |
| MERCHANT | &quot;ROLE_MERCHANT&quot; |



