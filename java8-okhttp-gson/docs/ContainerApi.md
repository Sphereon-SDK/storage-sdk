# ContainerApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/bucket-storage/0.8*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createContainer**](ContainerApi.md#createContainer) | **POST** /containers | Create container
[**deleteContainer**](ContainerApi.md#deleteContainer) | **DELETE** /containers/{containerId} | Delete container
[**getContainer**](ContainerApi.md#getContainer) | **GET** /containers/{containerId} | Get container
[**updateContainer**](ContainerApi.md#updateContainer) | **PUT** /containers/{containerId} | Update container


<a name="createContainer"></a>
# **createContainer**
> ContainerResponse createContainer(containerRequest)

Create container

Create a new container

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.ContainerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ContainerApi apiInstance = new ContainerApi();
ContainerRequest containerRequest = new ContainerRequest(); // ContainerRequest | containerRequest
try {
    ContainerResponse result = apiInstance.createContainer(containerRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContainerApi#createContainer");
    e.printStackTrace();
}
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

<a name="deleteContainer"></a>
# **deleteContainer**
> ContainerResponse deleteContainer(containerId, delete)

Delete container

Delete a container Please note that you can delete a container both by it&#39;s ID, which is globally unique among tenants and applications, as well as by name, which is unique within an application of a tenant

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.ContainerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ContainerApi apiInstance = new ContainerApi();
String containerId = "containerId_example"; // String | containerId
String delete = "delete_example"; // String | delete
try {
    ContainerResponse result = apiInstance.deleteContainer(containerId, delete);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContainerApi#deleteContainer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **delete** | **String**| delete | [optional] [enum: RECURSIVE, EMPTY_ONLY]

### Return type

[**ContainerResponse**](ContainerResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getContainer"></a>
# **getContainer**
> ContainerResponse getContainer(containerId)

Get container

Get an existing container. Please note that you can retrieve a container both by it&#39;s ID, which is globally unique among tenants and applications, as well as by name, which is unique within an application of a tenant

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.ContainerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ContainerApi apiInstance = new ContainerApi();
String containerId = "containerId_example"; // String | containerId
try {
    ContainerResponse result = apiInstance.getContainer(containerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContainerApi#getContainer");
    e.printStackTrace();
}
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

<a name="updateContainer"></a>
# **updateContainer**
> ContainerResponse updateContainer(containerId, containerRequest)

Update container

Update container with new information

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.ContainerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ContainerApi apiInstance = new ContainerApi();
String containerId = "containerId_example"; // String | containerId
ContainerRequest containerRequest = new ContainerRequest(); // ContainerRequest | containerRequest
try {
    ContainerResponse result = apiInstance.updateContainer(containerId, containerRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContainerApi#updateContainer");
    e.printStackTrace();
}
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

