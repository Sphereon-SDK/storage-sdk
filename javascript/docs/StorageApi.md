# Storage.StorageApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBackend**](StorageApi.md#createBackend) | **POST** /bucket-storage/0.7/backends | Create a new backend
[**createContainer**](StorageApi.md#createContainer) | **POST** /bucket-storage/0.7/containers | Create a new container
[**createObject**](StorageApi.md#createObject) | **POST** /bucket-storage/0.7/containers/{containerId}/objects/{objectPath} | Create a new object within a container
[**deleteBackend**](StorageApi.md#deleteBackend) | **DELETE** /bucket-storage/0.7/backends/{backendId} | Delete a backend
[**deleteContainer**](StorageApi.md#deleteContainer) | **DELETE** /bucket-storage/0.7/containers/{containerId} | Delete an existing container
[**deleteObject**](StorageApi.md#deleteObject) | **DELETE** /bucket-storage/0.7/containers/{containerId}/objects/{objectPath} | Delete an existing object from a container.
[**getBackendInfo**](StorageApi.md#getBackendInfo) | **GET** /bucket-storage/0.7/backends/{backendId} | Get backend information
[**getContainerInfo**](StorageApi.md#getContainerInfo) | **GET** /bucket-storage/0.7/containers/{containerId} | Get container information
[**getObject**](StorageApi.md#getObject) | **GET** /bucket-storage/0.7/containers/{containerId}/objects/{objectPath} | Get an existing object from a container
[**listContainers**](StorageApi.md#listContainers) | **GET** /bucket-storage/0.7/backends/{backendId}/containers | List containers
[**updateBackend**](StorageApi.md#updateBackend) | **POST** /bucket-storage/0.7/backends/{backendId} | Update a backend
[**updateContainer**](StorageApi.md#updateContainer) | **POST** /bucket-storage/0.7/containers/{containerId} | Update a container


<a name="createBackend"></a>
# **createBackend**
> BackendResponse createBackend(backendRequest)

Create a new backend

Create a new backend

### Example
```javascript
var Storage = require('storage');
var defaultClient = Storage.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Storage.StorageApi();

var backendRequest = new Storage.BackendRequest(); // BackendRequest | backendRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createBackend(backendRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendRequest** | [**BackendRequest**](BackendRequest.md)| backendRequest | 

### Return type

[**BackendResponse**](BackendResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="createContainer"></a>
# **createContainer**
> ContainerResponse createContainer(containerRequest)

Create a new container

Create a new container

### Example
```javascript
var Storage = require('storage');
var defaultClient = Storage.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Storage.StorageApi();

var containerRequest = new Storage.ContainerRequest(); // ContainerRequest | containerRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createContainer(containerRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerRequest** | [**ContainerRequest**](ContainerRequest.md)| containerRequest | 

### Return type

[**ContainerResponse**](ContainerResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="createObject"></a>
# **createObject**
> createObject(containerId, objectPath, stream)

Create a new object within a container

Create a new object within a container. If the container did not exist yet, it will be created on the fly with a default policy, hence no 404 http status will be returned

### Example
```javascript
var Storage = require('storage');
var defaultClient = Storage.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Storage.StorageApi();

var containerId = "containerId_example"; // String | containerId

var objectPath = "objectPath_example"; // String | objectPath

var stream = "/path/to/file.txt"; // File | stream


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.createObject(containerId, objectPath, stream, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId | 
 **objectPath** | **String**| objectPath | 
 **stream** | **File**| stream | 

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: *_/_*

<a name="deleteBackend"></a>
# **deleteBackend**
> BackendResponse deleteBackend(backendId)

Delete a backend

Delete a backend

### Example
```javascript
var Storage = require('storage');
var defaultClient = Storage.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Storage.StorageApi();

var backendId = "backendId_example"; // String | backendId


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.deleteBackend(backendId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **String**| backendId | 

### Return type

[**BackendResponse**](BackendResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deleteContainer"></a>
# **deleteContainer**
> ContainerResponse deleteContainer(containerId, opts)

Delete an existing container

Delete an existing container including the stored objects if indicated.

### Example
```javascript
var Storage = require('storage');
var defaultClient = Storage.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Storage.StorageApi();

var containerId = "containerId_example"; // String | containerId

var opts = { 
  '_delete': "_delete_example" // String | delete
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.deleteContainer(containerId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId | 
 **_delete** | **String**| delete | [optional] 

### Return type

[**ContainerResponse**](ContainerResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deleteObject"></a>
# **deleteObject**
> deleteObject(containerId, objectPath)

Delete an existing object from a container.

Delete an existing object from a container. There is no request nor response body for a delete request.

### Example
```javascript
var Storage = require('storage');
var defaultClient = Storage.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Storage.StorageApi();

var containerId = "containerId_example"; // String | containerId

var objectPath = "objectPath_example"; // String | objectPath


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteObject(containerId, objectPath, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId | 
 **objectPath** | **String**| objectPath | 

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

<a name="getBackendInfo"></a>
# **getBackendInfo**
> ContainerResponse getBackendInfo(backendId)

Get backend information

Get information on a backend

### Example
```javascript
var Storage = require('storage');
var defaultClient = Storage.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Storage.StorageApi();

var backendId = "backendId_example"; // String | backendId


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBackendInfo(backendId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **String**| backendId | 

### Return type

[**ContainerResponse**](ContainerResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getContainerInfo"></a>
# **getContainerInfo**
> ContainerResponse getContainerInfo(containerId)

Get container information

Get information on a container

### Example
```javascript
var Storage = require('storage');
var defaultClient = Storage.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Storage.StorageApi();

var containerId = "containerId_example"; // String | containerId


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getContainerInfo(containerId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId | 

### Return type

[**ContainerResponse**](ContainerResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getObject"></a>
# **getObject**
> &#39;String&#39; getObject(containerId, objectPath)

Get an existing object from a container

Get an existing object from a container

### Example
```javascript
var Storage = require('storage');
var defaultClient = Storage.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Storage.StorageApi();

var containerId = "containerId_example"; // String | containerId

var objectPath = "objectPath_example"; // String | objectPath


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getObject(containerId, objectPath, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId | 
 **objectPath** | **String**| objectPath | 

### Return type

**&#39;String&#39;**

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream, application/json;charset=UTF-8

<a name="listContainers"></a>
# **listContainers**
> ContainerResponse listContainers(backendId)

List containers

List containers for the given backend name or id.

### Example
```javascript
var Storage = require('storage');
var defaultClient = Storage.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Storage.StorageApi();

var backendId = "backendId_example"; // String | backendId


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.listContainers(backendId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **String**| backendId | 

### Return type

[**ContainerResponse**](ContainerResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="updateBackend"></a>
# **updateBackend**
> BackendResponse updateBackend(backendId, backendRequest)

Update a backend

Update a backend

### Example
```javascript
var Storage = require('storage');
var defaultClient = Storage.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Storage.StorageApi();

var backendId = "backendId_example"; // String | backendId

var backendRequest = new Storage.BackendRequest(); // BackendRequest | backendRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateBackend(backendId, backendRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **String**| backendId | 
 **backendRequest** | [**BackendRequest**](BackendRequest.md)| backendRequest | 

### Return type

[**BackendResponse**](BackendResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="updateContainer"></a>
# **updateContainer**
> ContainerResponse updateContainer(containerId, containerRequest)

Update a container

Update an existing container with new container settings

### Example
```javascript
var Storage = require('storage');
var defaultClient = Storage.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Storage.StorageApi();

var containerId = "containerId_example"; // String | containerId

var containerRequest = new Storage.ContainerRequest(); // ContainerRequest | containerRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateContainer(containerId, containerRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId | 
 **containerRequest** | [**ContainerRequest**](ContainerRequest.md)| containerRequest | 

### Return type

[**ContainerResponse**](ContainerResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

