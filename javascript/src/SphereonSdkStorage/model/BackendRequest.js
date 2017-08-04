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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['SphereonSdkStorage/ApiClient', 'SphereonSdkStorage/model/RequestCredentials'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./RequestCredentials'));
  } else {
    // Browser globals (root is window)
    if (!root.Storage) {
      root.Storage = {};
    }
    root.Storage.BackendRequest = factory(root.Storage.ApiClient, root.Storage.RequestCredentials);
  }
}(this, function(ApiClient, RequestCredentials) {
  'use strict';




  /**
   * The BackendRequest model module.
   * @module SphereonSdkStorage/model/BackendRequest
   * @version 0.7
   */

  /**
   * Constructs a new <code>BackendRequest</code>.
   * @alias module:SphereonSdkStorage/model/BackendRequest
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>BackendRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:SphereonSdkStorage/model/BackendRequest} obj Optional instance to populate.
   * @return {module:SphereonSdkStorage/model/BackendRequest} The populated <code>BackendRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('backendType')) {
        obj['backendType'] = ApiClient.convertToType(data['backendType'], 'String');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('parentId')) {
        obj['parentId'] = ApiClient.convertToType(data['parentId'], 'String');
      }
      if (data.hasOwnProperty('requestCredentials')) {
        obj['requestCredentials'] = RequestCredentials.constructFromObject(data['requestCredentials']);
      }
    }
    return obj;
  }

  /**
   * The type of backend that is created. This field allows users to create a local backend or with supported 3rd parties.
   * @member {module:SphereonSdkStorage/model/BackendRequest.BackendTypeEnum} backendType
   */
  exports.prototype['backendType'] = undefined;
  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {String} description
   */
  exports.prototype['description'] = undefined;
  /**
   * The backend that is used for when properties are not set. This allows usernamePasswordCredentials to be set at one backend and used by multiple backends.
   * @member {String} parentId
   */
  exports.prototype['parentId'] = undefined;
  /**
   * The credentials details
   * @member {module:SphereonSdkStorage/model/RequestCredentials} requestCredentials
   */
  exports.prototype['requestCredentials'] = undefined;


  /**
   * Allowed values for the <code>backendType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.BackendTypeEnum = {
    /**
     * value: "FILESYSTEM"
     * @const
     */
    "FILESYSTEM": "FILESYSTEM",
    /**
     * value: "AMAZON_S3"
     * @const
     */
    "AMAZON_S3": "AMAZON_S3",
    /**
     * value: "MS_AZURE_BLOB_STORAGE"
     * @const
     */
    "MS_AZURE_BLOB_STORAGE": "MS_AZURE_BLOB_STORAGE",
    /**
     * value: "GOOGLE_CLOUD_STORAGE"
     * @const
     */
    "GOOGLE_CLOUD_STORAGE": "GOOGLE_CLOUD_STORAGE"  };


  return exports;
}));


