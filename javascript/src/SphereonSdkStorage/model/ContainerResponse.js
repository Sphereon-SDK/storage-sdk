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
    define(['SphereonSdkStorage/ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.Storage) {
      root.Storage = {};
    }
    root.Storage.ContainerResponse = factory(root.Storage.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The ContainerResponse model module.
   * @module SphereonSdkStorage/model/ContainerResponse
   * @version 0.7
   */

  /**
   * Constructs a new <code>ContainerResponse</code>.
   * @alias module:SphereonSdkStorage/model/ContainerResponse
   * @class
   */
  var exports = function() {
    var _this = this;





  };

  /**
   * Constructs a <code>ContainerResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:SphereonSdkStorage/model/ContainerResponse} obj Optional instance to populate.
   * @return {module:SphereonSdkStorage/model/ContainerResponse} The populated <code>ContainerResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('backendId')) {
        obj['backendId'] = ApiClient.convertToType(data['backendId'], 'String');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('state')) {
        obj['state'] = ApiClient.convertToType(data['state'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * The backend in which the container will be stored or is stored.
   * @member {String} backendId
   */
  exports.prototype['backendId'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {module:SphereonSdkStorage/model/ContainerResponse.StateEnum} state
   */
  exports.prototype['state'] = undefined;


  /**
   * Allowed values for the <code>state</code> property.
   * @enum {String}
   * @readonly
   */
  exports.StateEnum = {
    /**
     * value: "REQUEST"
     * @const
     */
    "REQUEST": "REQUEST",
    /**
     * value: "CREATED"
     * @const
     */
    "CREATED": "CREATED",
    /**
     * value: "UPDATED"
     * @const
     */
    "UPDATED": "UPDATED",
    /**
     * value: "DELETED"
     * @const
     */
    "DELETED": "DELETED"  };


  return exports;
}));


