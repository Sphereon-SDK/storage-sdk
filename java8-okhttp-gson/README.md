# storage-sdk-java8-okhttp-gson

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.sphereon.sdk</groupId>
    <artifactId>storage-sdk-java8-okhttp-gson</artifactId>
    <version>0.8.9</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sphereon.sdk:storage-sdk-java8-okhttp-gson:0.8.9"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/storage-sdk-java8-okhttp-gson-0.8.9.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.sphereon.sdk.storage.handler.*;
import com.sphereon.sdk.storage.handler.auth.*;
import com.sphereon.sdk.storage.model.*;
import com.sphereon.sdk.storage.api.StorageApi;

import java.io.File;
import java.util.*;

public class StorageApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: oauth2schema
        OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
        oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

        StorageApi apiInstance = new StorageApi();
        BackendRequest backendRequest = new BackendRequest(); // BackendRequest | backendRequest
        try {
            BackendResponse result = apiInstance.createBackend(backendRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#createBackend");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://gw.api.cloud.sphereon.com/bucket-storage/0.8*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*StorageApi* | [**createBackend**](docs/StorageApi.md#createBackend) | **POST** /backends | Create a new backend
*StorageApi* | [**createContainer**](docs/StorageApi.md#createContainer) | **POST** /containers | Create a new container
*StorageApi* | [**createStreamUsingPath**](docs/StorageApi.md#createStreamUsingPath) | **POST** /streams/path/{containerId}/{path} | Create a new stream within a container
*StorageApi* | [**deleteBackend**](docs/StorageApi.md#deleteBackend) | **DELETE** /backends/{backendId} | Delete a backend
*StorageApi* | [**deleteContainer**](docs/StorageApi.md#deleteContainer) | **DELETE** /containers/{containerId} | Delete an existing container
*StorageApi* | [**deleteStreamUsingLocation**](docs/StorageApi.md#deleteStreamUsingLocation) | **DELETE** /streams/location | Delete an existing stream from a container by stream location.
*StorageApi* | [**deleteStreamUsingPath**](docs/StorageApi.md#deleteStreamUsingPath) | **DELETE** /streams/path/{containerId}/{path} | Delete an existing stream from a container.
*StorageApi* | [**getBackendInfo**](docs/StorageApi.md#getBackendInfo) | **GET** /backends/{backendId} | Get backend information
*StorageApi* | [**getContainer**](docs/StorageApi.md#getContainer) | **GET** /containers/{containerId} | Get container information
*StorageApi* | [**getStreamUsingLocation**](docs/StorageApi.md#getStreamUsingLocation) | **POST** /streams/location | Get an existing stream from a container by stream location
*StorageApi* | [**getStreamUsingPath**](docs/StorageApi.md#getStreamUsingPath) | **GET** /streams/path/{containerId}/{path} | Get an stream from a container
*StorageApi* | [**listInfoUsingLocation**](docs/StorageApi.md#listInfoUsingLocation) | **POST** /info/location | List streams in path by stream location
*StorageApi* | [**listInfoUsingPath**](docs/StorageApi.md#listInfoUsingPath) | **GET** /info/path/{containerId}/{path} | List streams in path
*StorageApi* | [**listInfoUsingRoot**](docs/StorageApi.md#listInfoUsingRoot) | **GET** /info/path/{containerId}/ | List streams in root
*StorageApi* | [**updateBackend**](docs/StorageApi.md#updateBackend) | **PUT** /backends/{backendId} | Update a backend
*StorageApi* | [**updateContainer**](docs/StorageApi.md#updateContainer) | **PUT** /containers/{containerId} | Update a container
*StorageApi* | [**updateStreamUsingPath**](docs/StorageApi.md#updateStreamUsingPath) | **PUT** /streams/path/{containerId}/{path} | Update stream within a container


## Documentation for Models

 - [Backend](docs/Backend.md)
 - [BackendLocation](docs/BackendLocation.md)
 - [BackendRequest](docs/BackendRequest.md)
 - [BackendResponse](docs/BackendResponse.md)
 - [Container](docs/Container.md)
 - [ContainerRequest](docs/ContainerRequest.md)
 - [ContainerResponse](docs/ContainerResponse.md)
 - [Credentials](docs/Credentials.md)
 - [CredentialsRequest](docs/CredentialsRequest.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [InfoResponse](docs/InfoResponse.md)
 - [OAuth2Credentials](docs/OAuth2Credentials.md)
 - [OAuthCredentials](docs/OAuthCredentials.md)
 - [StreamInfo](docs/StreamInfo.md)
 - [StreamLocation](docs/StreamLocation.md)
 - [StreamResponse](docs/StreamResponse.md)
 - [UsernamePasswordCredentials](docs/UsernamePasswordCredentials.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2schema

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: 
  - global: accessEverything


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

dev@sphereon.com

