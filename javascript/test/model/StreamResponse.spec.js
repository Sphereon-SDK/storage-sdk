/**
 * Storage
 * Sphereon Storage APIs provide an abstraction layer for storage of containers (folders) and objects (files), using a filesystem backend or AWS-s3, Azure blobstorage or Google cloud storage backend.
 *
 * OpenAPI spec version: 0.8
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.2.3
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.Storage);
  }
}(this, function(expect, Storage) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new Storage.StreamResponse();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('StreamResponse', function() {
    it('should create an instance of StreamResponse', function() {
      // uncomment below and update the code to test StreamResponse
      //var instane = new Storage.StreamResponse();
      //expect(instance).to.be.a(Storage.StreamResponse);
    });

    it('should have the property streamLocation (base name: "streamLocation")', function() {
      // uncomment below and update the code to test the property streamLocation
      //var instane = new Storage.StreamResponse();
      //expect(instance).to.be();
    });

    it('should have the property contentLength (base name: "contentLength")', function() {
      // uncomment below and update the code to test the property contentLength
      //var instane = new Storage.StreamResponse();
      //expect(instance).to.be();
    });

    it('should have the property state (base name: "state")', function() {
      // uncomment below and update the code to test the property state
      //var instane = new Storage.StreamResponse();
      //expect(instance).to.be();
    });

    it('should have the property contentType (base name: "contentType")', function() {
      // uncomment below and update the code to test the property contentType
      //var instane = new Storage.StreamResponse();
      //expect(instance).to.be();
    });

  });

}));
