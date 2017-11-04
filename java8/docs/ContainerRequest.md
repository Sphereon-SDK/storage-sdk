
# ContainerRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creationMode** | [**CreationModeEnum**](#CreationModeEnum) | The way a container is creation. If the container should be new, is allowed already exist or use an existing remote container. |  [optional]
**name** | **String** |  |  [optional]
**backendId** | **String** | The backend in which the container will be stored or is stored. |  [optional]


<a name="CreationModeEnum"></a>
## Enum: CreationModeEnum
Name | Value
---- | -----
NEW_ONLY | &quot;NEW_ONLY&quot;
REQUIRE_EXISTING | &quot;REQUIRE_EXISTING&quot;
ALLOW_EXISTING | &quot;ALLOW_EXISTING&quot;



