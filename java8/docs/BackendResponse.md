
# BackendResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**parentId** | **String** | The backend that is used for when properties are not set. This allows credentials to be set at one backend and used by multiple backends. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
REQUEST | &quot;REQUEST&quot;
CREATED | &quot;CREATED&quot;
UPDATED | &quot;UPDATED&quot;
DELETED | &quot;DELETED&quot;



