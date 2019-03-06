# BackendApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/bucket-storage/0.8*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBackend**](BackendApi.md#createBackend) | **POST** /backends | Create a new backend
[**deleteBackend**](BackendApi.md#deleteBackend) | **DELETE** /backends/{backendId} | Delete a backend
[**getBackend**](BackendApi.md#getBackend) | **GET** /backends/{backendId} | Get backend
[**updateBackend**](BackendApi.md#updateBackend) | **PUT** /backends/{backendId} | Update backend


<a name="createBackend"></a>
# **createBackend**
> BackendResponse createBackend(backendRequest)

Create a new backend

Create a new backend

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.BackendApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

BackendApi apiInstance = new BackendApi();
BackendRequest backendRequest = new BackendRequest(); // BackendRequest | backendRequest
try {
    BackendResponse result = apiInstance.createBackend(backendRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BackendApi#createBackend");
    e.printStackTrace();
}
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

<a name="deleteBackend"></a>
# **deleteBackend**
> BackendResponse deleteBackend(backendId)

Delete a backend

Delete an existing backend. Please note that you can delete a backend both by it&#39;s ID, which is globally unique among tenants and applications, as well as by name, which is unique within an application of a tenant

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.BackendApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

BackendApi apiInstance = new BackendApi();
String backendId = "backendId_example"; // String | backendId
try {
    BackendResponse result = apiInstance.deleteBackend(backendId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BackendApi#deleteBackend");
    e.printStackTrace();
}
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

<a name="getBackend"></a>
# **getBackend**
> BackendResponse getBackend(backendId)

Get backend

Get an existing backend. Please note that you can retrieve a backend both by it&#39;s ID, which is globally unique among tenants and applications, as well as by name, which is unique within an application of a tenant

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.BackendApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

BackendApi apiInstance = new BackendApi();
String backendId = "backendId_example"; // String | backendId
try {
    BackendResponse result = apiInstance.getBackend(backendId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BackendApi#getBackend");
    e.printStackTrace();
}
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

<a name="updateBackend"></a>
# **updateBackend**
> BackendResponse updateBackend(backendId, backendRequest)

Update backend

Update backend with new information

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.BackendApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

BackendApi apiInstance = new BackendApi();
String backendId = "backendId_example"; // String | backendId
BackendRequest backendRequest = new BackendRequest(); // BackendRequest | backendRequest
try {
    BackendResponse result = apiInstance.updateBackend(backendId, backendRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BackendApi#updateBackend");
    e.printStackTrace();
}
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

