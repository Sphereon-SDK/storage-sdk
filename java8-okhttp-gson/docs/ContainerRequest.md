
# ContainerRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propagationType** | [**PropagationTypeEnum**](#PropagationTypeEnum) | The way a container is creation. If the container should be new, is allowed already exist or use an existing remote container. |  [optional]
**name** | **String** |  |  [optional]
**backendId** | **String** | The backend in which the container will be stored or is stored. |  [optional]


<a name="PropagationTypeEnum"></a>
## Enum: PropagationTypeEnum
Name | Value
---- | -----
NO | &quot;NO&quot;
REQUIRE | &quot;REQUIRE&quot;
ALLOW | &quot;ALLOW&quot;



