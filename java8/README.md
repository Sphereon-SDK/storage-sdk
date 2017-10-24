# storage-sdk-java8

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
    <artifactId>storage-sdk-java8</artifactId>
    <version>0.6.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sphereon.sdk:storage-sdk-java8:0.6.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/storage-sdk-java8-0.6.0-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.sphereon.sdk.storage.handler.*;
import com.sphereon.sdk.storage.handler.auth.*;
import com.sphereon.sdk.storage.handler.model.*;
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

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*StorageApi* | [**createBackend**](docs/StorageApi.md#createBackend) | **POST** /bucket-storage/0.7/backends | Create a new backend
*StorageApi* | [**createContainer**](docs/StorageApi.md#createContainer) | **POST** /bucket-storage/0.7/containers | Create a new container
*StorageApi* | [**createObject**](docs/StorageApi.md#createObject) | **POST** /bucket-storage/0.7/containers/{containerId}/objects/{objectPath} | Create a new object within a container
*StorageApi* | [**createObjectInFolder**](docs/StorageApi.md#createObjectInFolder) | **POST** /bucket-storage/0.7/containers/{containerId}/objects/** | Create a new object within a container
*StorageApi* | [**createObjectInFolder1**](docs/StorageApi.md#createObjectInFolder1) | **POST** /bucket-storage/0.7/containers/{containerId}/objects/{objectPath}/** | Create a new object within a container
*StorageApi* | [**deleteBackend**](docs/StorageApi.md#deleteBackend) | **DELETE** /bucket-storage/0.7/backends/{backendId} | Delete a backend
*StorageApi* | [**deleteContainer**](docs/StorageApi.md#deleteContainer) | **DELETE** /bucket-storage/0.7/containers/{containerId} | Delete an existing container
*StorageApi* | [**deleteObject**](docs/StorageApi.md#deleteObject) | **DELETE** /bucket-storage/0.7/containers/{containerId}/objects/{objectPath} | Delete an existing object from a container.
*StorageApi* | [**getBackendInfo**](docs/StorageApi.md#getBackendInfo) | **GET** /bucket-storage/0.7/backends/{backendId} | Get backend information
*StorageApi* | [**getContainerInfo**](docs/StorageApi.md#getContainerInfo) | **GET** /bucket-storage/0.7/containers/{containerId} | Get container information
*StorageApi* | [**getObject**](docs/StorageApi.md#getObject) | **GET** /bucket-storage/0.7/containers/{containerId}/objects/{objectPath} | Get an existing object from a container
*StorageApi* | [**listContainers**](docs/StorageApi.md#listContainers) | **GET** /bucket-storage/0.7/backends/{backendId}/containers | List containers
*StorageApi* | [**listObjects**](docs/StorageApi.md#listObjects) | **GET** /bucket-storage/0.7/containers/{containerId}/list/{objectPath} | List objects in path
*StorageApi* | [**listObjectsInFolder**](docs/StorageApi.md#listObjectsInFolder) | **GET** /bucket-storage/0.7/containers/{containerId}/list | List objects in path
*StorageApi* | [**listObjectsInFolder1**](docs/StorageApi.md#listObjectsInFolder1) | **GET** /bucket-storage/0.7/containers/{containerId}/list/** | List objects in path
*StorageApi* | [**listObjectsInFolder2**](docs/StorageApi.md#listObjectsInFolder2) | **GET** /bucket-storage/0.7/containers/{containerId}/list/{objectPath}/** | List objects in path
*StorageApi* | [**updateBackend**](docs/StorageApi.md#updateBackend) | **POST** /bucket-storage/0.7/backends/{backendId} | Update a backend
*StorageApi* | [**updateContainer**](docs/StorageApi.md#updateContainer) | **POST** /bucket-storage/0.7/containers/{containerId} | Update a container


## Documentation for Models

 - [BackendLocation](docs/BackendLocation.md)
 - [BackendRequest](docs/BackendRequest.md)
 - [BackendResponse](docs/BackendResponse.md)
 - [ContainerRequest](docs/ContainerRequest.md)
 - [ContainerResponse](docs/ContainerResponse.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [OAuth2Credentials](docs/OAuth2Credentials.md)
 - [OAuthCredentials](docs/OAuthCredentials.md)
 - [ObjectInfoResponse](docs/ObjectInfoResponse.md)
 - [ObjectResponse](docs/ObjectResponse.md)
 - [RequestCredentials](docs/RequestCredentials.md)
 - [StreamInfo](docs/StreamInfo.md)
 - [StreamLocation](docs/StreamLocation.md)
 - [UsernamePasswordCredentials](docs/UsernamePasswordCredentials.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2schema

- **Type**: OAuth
- **Flow**: application
- **Authorizatoin URL**: 
- **Scopes**: 
  - global: accessEverything


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

dev@sphereon.com

