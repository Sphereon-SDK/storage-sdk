package com.sphereon.sdk.storage.api;

import com.sphereon.sdk.storage.handler.ApiClient;
import com.sphereon.sdk.storage.model.BackendRequest;
import com.sphereon.sdk.storage.model.BackendResponse;
import com.sphereon.sdk.storage.model.ErrorResponse;
import com.sphereon.sdk.storage.model.ContainerResponse;
import com.sphereon.sdk.storage.model.ContainerRequest;
import java.io.File;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StorageApi
 */
public class StorageApiTest {

    private StorageApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StorageApi.class);
    }

    
    /**
     * Create a new backend
     *
     * Create a new backend
     */
    @Test
    public void createBackendTest() {
        BackendRequest backendRequest = null;
        // BackendResponse response = api.createBackend(backendRequest);

        // TODO: test validations
    }
    
    /**
     * Create a new container
     *
     * Create a new container
     */
    @Test
    public void createContainerTest() {
        ContainerRequest containerRequest = null;
        // ContainerResponse response = api.createContainer(containerRequest);

        // TODO: test validations
    }
    
    /**
     * Create a new object within a container
     *
     * Create a new object within a container. If the container did not exist yet, it will be created on the fly with a default policy, hence no 404 http status will be returned
     */
    @Test
    public void createObjectTest() {
        String containerId = null;
        String objectPath = null;
        File stream = null;
        // Void response = api.createObject(containerId, objectPath, stream);

        // TODO: test validations
    }
    
    /**
     * Delete a backend
     *
     * Delete a backend
     */
    @Test
    public void deleteBackendTest() {
        String backendId = null;
        // BackendResponse response = api.deleteBackend(backendId);

        // TODO: test validations
    }
    
    /**
     * Delete an existing container
     *
     * Delete an existing container including the stored objects if indicated.
     */
    @Test
    public void deleteContainerTest() {
        String containerId = null;
        String delete = null;
        // ContainerResponse response = api.deleteContainer(containerId, delete);

        // TODO: test validations
    }
    
    /**
     * Delete an existing object from a container.
     *
     * Delete an existing object from a container. There is no request nor response body for a delete request.
     */
    @Test
    public void deleteObjectTest() {
        String containerId = null;
        String objectPath = null;
        // Void response = api.deleteObject(containerId, objectPath);

        // TODO: test validations
    }
    
    /**
     * Get an existing object from a container
     *
     * Get an existing object from a container
     */
    @Test
    public void getObjectTest() {
        String containerId = null;
        String objectPath = null;
        // byte[] response = api.getObject(containerId, objectPath);

        // TODO: test validations
    }
    
    /**
     * Update a backend
     *
     * Update a backend
     */
    @Test
    public void updateBackendTest() {
        String backendId = null;
        BackendRequest backendRequest = null;
        // BackendResponse response = api.updateBackend(backendId, backendRequest);

        // TODO: test validations
    }
    
    /**
     * Update a container
     *
     * Update an existing container with new container settings
     */
    @Test
    public void updateContainerTest() {
        String containerId = null;
        ContainerRequest containerRequest = null;
        // ContainerResponse response = api.updateContainer(containerId, containerRequest);

        // TODO: test validations
    }
    
}
