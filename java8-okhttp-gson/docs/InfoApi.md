# InfoApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/bucket-storage/0.8*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listInfoUsingLocation**](InfoApi.md#listInfoUsingLocation) | **POST** /info/location | List streams from location
[**listInfoUsingPath**](InfoApi.md#listInfoUsingPath) | **GET** /info/path/{containerId}/{path} | List streams in path
[**listInfoUsingRootPath**](InfoApi.md#listInfoUsingRootPath) | **GET** /info/path/{containerId}/ | List streams in root path


<a name="listInfoUsingLocation"></a>
# **listInfoUsingLocation**
> InfoResponse listInfoUsingLocation(streamLocation)

List streams from location

Returns Stream(s) information from the given Stream Location. When the path points to a file and if the file exists, a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.InfoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

InfoApi apiInstance = new InfoApi();
StreamLocation streamLocation = new StreamLocation(); // StreamLocation | streamLocation
try {
    InfoResponse result = apiInstance.listInfoUsingLocation(streamLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfoApi#listInfoUsingLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamLocation** | [**StreamLocation**](StreamLocation.md)| streamLocation |

### Return type

[**InfoResponse**](InfoResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json

<a name="listInfoUsingPath"></a>
# **listInfoUsingPath**
> InfoResponse listInfoUsingPath(containerId, path)

List streams in path

Returns Stream(s) information on the given path. When the path points to a file and if the file exists, a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.InfoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

InfoApi apiInstance = new InfoApi();
String containerId = "containerId_example"; // String | containerId
String path = "path_example"; // String | path
try {
    InfoResponse result = apiInstance.listInfoUsingPath(containerId, path);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfoApi#listInfoUsingPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **path** | **String**| path |

### Return type

[**InfoResponse**](InfoResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listInfoUsingRootPath"></a>
# **listInfoUsingRootPath**
> InfoResponse listInfoUsingRootPath(containerId)

List streams in root path

Returns Stream(s) information from the root. When the path points to a file and if the file exists, a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.InfoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

InfoApi apiInstance = new InfoApi();
String containerId = "containerId_example"; // String | containerId
try {
    InfoResponse result = apiInstance.listInfoUsingRootPath(containerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfoApi#listInfoUsingRootPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |

### Return type

[**InfoResponse**](InfoResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

