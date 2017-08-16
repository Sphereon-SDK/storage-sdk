/*
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


package com.sphereon.sdk.storage.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BackendResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-16T15:34:02.364+02:00")
public class BackendResponse {
  /**
   * The type of backend that is created. This field allows users to create a local backend or with supported 3rd parties.
   */
  public enum BackendTypeEnum {
    SHARED_STORAGE("SHARED_STORAGE"),
    
    AMAZON_S3("AMAZON_S3"),
    
    MS_AZURE_BLOB_STORAGE("MS_AZURE_BLOB_STORAGE"),
    
    GOOGLE_CLOUD_STORAGE("GOOGLE_CLOUD_STORAGE");

    private String value;

    BackendTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BackendTypeEnum fromValue(String text) {
      for (BackendTypeEnum b : BackendTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("backendType")
  private BackendTypeEnum backendType = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("id")
  private String id = null;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    REQUEST("REQUEST"),
    
    CREATED("CREATED"),
    
    UPDATED("UPDATED"),
    
    DELETED("DELETED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("parentId")
  private String parentId = null;

   /**
   * The type of backend that is created. This field allows users to create a local backend or with supported 3rd parties.
   * @return backendType
  **/
  @ApiModelProperty(example = "null", value = "The type of backend that is created. This field allows users to create a local backend or with supported 3rd parties.")
  public BackendTypeEnum getBackendType() {
    return backendType;
  }

  public BackendResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BackendResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BackendResponse state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public BackendResponse parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * The backend that is used for when properties are not set. This allows credentials to be set at one backend and used by multiple backends.
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "The backend that is used for when properties are not set. This allows credentials to be set at one backend and used by multiple backends.")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackendResponse backendResponse = (BackendResponse) o;
    return Objects.equals(this.backendType, backendResponse.backendType) &&
        Objects.equals(this.name, backendResponse.name) &&
        Objects.equals(this.id, backendResponse.id) &&
        Objects.equals(this.state, backendResponse.state) &&
        Objects.equals(this.parentId, backendResponse.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backendType, name, id, state, parentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackendResponse {\n");
    
    sb.append("    backendType: ").append(toIndentedString(backendType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

