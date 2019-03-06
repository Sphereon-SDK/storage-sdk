
# ContainerRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propagationType** | [**PropagationTypeEnum**](#PropagationTypeEnum) | The way a container is creation. If propagation is no a new container will be created in the backend; If propagation is require a existing container is used from the backend. If propagation is allowed the a new container is created if the container does not exists. |  [optional]
**name** | **String** |  |  [optional]
**backendId** | **String** | The backend in which the container will be stored or is stored. |  [optional]
**description** | **String** |  |  [optional]


<a name="PropagationTypeEnum"></a>
## Enum: PropagationTypeEnum
Name | Value
---- | -----
NO | &quot;NO&quot;
REQUIRE | &quot;REQUIRE&quot;
ALLOW | &quot;ALLOW&quot;



