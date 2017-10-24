/**
 * Storage
 * Sphereon Storage APIs provide an abstraction layer for storage of containers (folders) and objects (files), using a filesystem backend or AWS-s3, Azure blobstorage or Google cloud storage backend.
 *
 * OpenAPI spec version: 0.7
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.sphereon.sdk.storage.api;

import com.sphereon.sdk.storage.handler.ApiException;
import com.sphereon.sdk.storage.model.BackendRequest;
import com.sphereon.sdk.storage.model.BackendResponse;
import com.sphereon.sdk.storage.model.ErrorResponse;
import com.sphereon.sdk.storage.model.ContainerResponse;
import com.sphereon.sdk.storage.model.ContainerRequest;
import com.sphereon.sdk.storage.model.ObjectResponse;
import java.io.File;
import com.sphereon.sdk.storage.model.ObjectInfoResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StorageApi
 */
public class StorageApiTest {

    private final StorageApi api = new StorageApi();

    
    /**
     * Create a new backend
     *
     * Create a new backend
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBackendTest() throws ApiException {
        BackendRequest backendRequest = null;
        // BackendResponse response = api.createBackend(backendRequest);

        // TODO: test validations
    }
    
    /**
     * Create a new container
     *
     * Create a new container
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createContainerTest() throws ApiException {
        ContainerRequest containerRequest = null;
        // ContainerResponse response = api.createContainer(containerRequest);

        // TODO: test validations
    }
    
    /**
     * Create a new object within a container
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createObjectTest() throws ApiException {
        String containerId = null;
        String objectPath = null;
        File stream = null;
        String overwriteMode = null;
        // ObjectResponse response = api.createObject(containerId, objectPath, stream, overwriteMode);

        // TODO: test validations
    }
    
    /**
     * Create a new object within a container
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createObjectInFolderTest() throws ApiException {
        String containerId = null;
        File stream = null;
        String overwriteMode = null;
        // ObjectResponse response = api.createObjectInFolder(containerId, stream, overwriteMode);

        // TODO: test validations
    }
    
    /**
     * Create a new object within a container
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createObjectInFolder1Test() throws ApiException {
        String containerId = null;
        File stream = null;
        String overwriteMode = null;
        // ObjectResponse response = api.createObjectInFolder1(containerId, stream, overwriteMode);

        // TODO: test validations
    }
    
    /**
     * Delete a backend
     *
     * Delete a backend
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBackendTest() throws ApiException {
        String backendId = null;
        // BackendResponse response = api.deleteBackend(backendId);

        // TODO: test validations
    }
    
    /**
     * Delete an existing container
     *
     * Delete an existing container including the stored objects if indicated.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteContainerTest() throws ApiException {
        String containerId = null;
        String delete = null;
        // ContainerResponse response = api.deleteContainer(containerId, delete);

        // TODO: test validations
    }
    
    /**
     * Delete an existing object from a container.
     *
     * Delete an existing object from a container. There is no request nor response body for a delete request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteObjectTest() throws ApiException {
        String containerId = null;
        String objectPath = null;
        // api.deleteObject(containerId, objectPath);

        // TODO: test validations
    }
    
    /**
     * Get backend information
     *
     * Get information on a backend
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBackendInfoTest() throws ApiException {
        String backendId = null;
        // BackendResponse response = api.getBackendInfo(backendId);

        // TODO: test validations
    }
    
    /**
     * Get container information
     *
     * Get information on a container
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContainerInfoTest() throws ApiException {
        String containerId = null;
        // ContainerResponse response = api.getContainerInfo(containerId);

        // TODO: test validations
    }
    
    /**
     * Get an existing object from a container
     *
     * Get an existing object from a container
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getObjectTest() throws ApiException {
        String containerId = null;
        String objectPath = null;
        // byte[] response = api.getObject(containerId, objectPath);

        // TODO: test validations
    }
    
    /**
     * List containers
     *
     * List containers for the given backend name or id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listContainersTest() throws ApiException {
        String backendId = null;
        // List<ContainerResponse> response = api.listContainers(backendId);

        // TODO: test validations
    }
    
    /**
     * List objects in path
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listObjectsTest() throws ApiException {
        String containerId = null;
        String objectPath = null;
        // List<ObjectInfoResponse> response = api.listObjects(containerId, objectPath);

        // TODO: test validations
    }
    
    /**
     * List objects in path
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listObjectsInFolderTest() throws ApiException {
        String containerId = null;
        // List<ObjectInfoResponse> response = api.listObjectsInFolder(containerId);

        // TODO: test validations
    }
    
    /**
     * List objects in path
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listObjectsInFolder1Test() throws ApiException {
        String containerId = null;
        // List<ObjectInfoResponse> response = api.listObjectsInFolder1(containerId);

        // TODO: test validations
    }
    
    /**
     * List objects in path
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listObjectsInFolder2Test() throws ApiException {
        String containerId = null;
        // List<ObjectInfoResponse> response = api.listObjectsInFolder2(containerId);

        // TODO: test validations
    }
    
    /**
     * Update a backend
     *
     * Update a backend
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBackendTest() throws ApiException {
        String backendId = null;
        BackendRequest backendRequest = null;
        // BackendResponse response = api.updateBackend(backendId, backendRequest);

        // TODO: test validations
    }
    
    /**
     * Update a container
     *
     * Update an existing container with new container settings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateContainerTest() throws ApiException {
        String containerId = null;
        ContainerRequest containerRequest = null;
        // ContainerResponse response = api.updateContainer(containerId, containerRequest);

        // TODO: test validations
    }
    
}