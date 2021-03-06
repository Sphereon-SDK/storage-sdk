/* 
 * Storage
 *
 * Sphereon Storage APIs provide an abstraction layer for storage of containers (folders) and objects (files), using a filesystem backend or AWS-s3, Azure blobstorage or Google cloud storage backend.
 *
 * OpenAPI spec version: 0.8
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Model;
using Sphereon.SDK.Storage.Client;
using System.Reflection;

namespace Sphereon.SDK.Storage.Test
{
    /// <summary>
    ///  Class for testing StreamResponse
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class StreamResponseTests
    {
        // TODO uncomment below to declare an instance variable for StreamResponse
        //private StreamResponse instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of StreamResponse
            //instance = new StreamResponse();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of StreamResponse
        /// </summary>
        [Test]
        public void StreamResponseInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" StreamResponse
            //Assert.IsInstanceOfType<StreamResponse> (instance, "variable 'instance' is a StreamResponse");
        }

        /// <summary>
        /// Test the property 'StreamLocation'
        /// </summary>
        [Test]
        public void StreamLocationTest()
        {
            // TODO unit test for the property 'StreamLocation'
        }
        /// <summary>
        /// Test the property 'ContentLength'
        /// </summary>
        [Test]
        public void ContentLengthTest()
        {
            // TODO unit test for the property 'ContentLength'
        }
        /// <summary>
        /// Test the property 'State'
        /// </summary>
        [Test]
        public void StateTest()
        {
            // TODO unit test for the property 'State'
        }
        /// <summary>
        /// Test the property 'ContentType'
        /// </summary>
        [Test]
        public void ContentTypeTest()
        {
            // TODO unit test for the property 'ContentType'
        }

    }

}
