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
    ///  Class for testing ContainerResponse
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class ContainerResponseTests
    {
        // TODO uncomment below to declare an instance variable for ContainerResponse
        //private ContainerResponse instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of ContainerResponse
            //instance = new ContainerResponse();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of ContainerResponse
        /// </summary>
        [Test]
        public void ContainerResponseInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" ContainerResponse
            //Assert.IsInstanceOfType<ContainerResponse> (instance, "variable 'instance' is a ContainerResponse");
        }

        /// <summary>
        /// Test the property 'Container'
        /// </summary>
        [Test]
        public void ContainerTest()
        {
            // TODO unit test for the property 'Container'
        }
        /// <summary>
        /// Test the property 'State'
        /// </summary>
        [Test]
        public void StateTest()
        {
            // TODO unit test for the property 'State'
        }

    }

}
