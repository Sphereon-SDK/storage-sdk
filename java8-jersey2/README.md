# storage-sdk-java8-jersey2

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
    <artifactId>storage-sdk-java8-jersey2</artifactId>
    <version>0.7.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sphereon.sdk:storage-sdk-java8-jersey2:0.7.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/storage-sdk-java8-jersey2-0.7.0.jar
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

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*StorageApi* | [**createBackend**](docs/StorageApi.md#createBackend) | **POST** /bucket-storage/0.6.0/backends | Create a new backend
*StorageApi* | [**createContainer**](docs/StorageApi.md#createContainer) | **POST** /bucket-storage/0.6.0/containers | Create a new container
*StorageApi* | [**createObject**](docs/StorageApi.md#createObject) | **POST** /bucket-storage/0.6.0/containers/{containerId}/objects/{objectPath} | Create a new object within a container
*StorageApi* | [**deleteBackend**](docs/StorageApi.md#deleteBackend) | **DELETE** /bucket-storage/0.6.0/backends/{backendId} | Delete a backend
*StorageApi* | [**deleteContainer**](docs/StorageApi.md#deleteContainer) | **DELETE** /bucket-storage/0.6.0/containers/{containerId} | Delete an existing container
*StorageApi* | [**deleteObject**](docs/StorageApi.md#deleteObject) | **DELETE** /bucket-storage/0.6.0/containers/{containerId}/objects/{objectPath} | Delete an existing object from a container.
*StorageApi* | [**getContainerInfo**](docs/StorageApi.md#getContainerInfo) | **GET** /bucket-storage/0.6.0/containers/{containerId} | Get container information
*StorageApi* | [**getObject**](docs/StorageApi.md#getObject) | **GET** /bucket-storage/0.6.0/containers/{containerId}/objects/{objectPath} | Get an existing object from a container
*StorageApi* | [**updateBackend**](docs/StorageApi.md#updateBackend) | **POST** /bucket-storage/0.6.0/backends/{backendId} | Update a backend
*StorageApi* | [**updateContainer**](docs/StorageApi.md#updateContainer) | **POST** /bucket-storage/0.6.0/containers/{containerId} | Update a container


## Documentation for Models

 - [BackendRequest](docs/BackendRequest.md)
 - [BackendResponse](docs/BackendResponse.md)
 - [ContainerRequest](docs/ContainerRequest.md)
 - [ContainerResponse](docs/ContainerResponse.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2schema

- **Type**: OAuth
- **Flow**: application
- **Authorizatoin URL**: 
- **Scopes**: 
  - global: accessEverything


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

dev@sphereon.com

