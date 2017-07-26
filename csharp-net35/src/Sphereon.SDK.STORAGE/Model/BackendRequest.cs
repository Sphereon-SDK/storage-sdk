/* 
 * Storage
 *
 * Sphereon Storage APIs provide an abstraction layer for storage of containers (folders) and objects (files), using a filesystem backend or AWS-s3, Azure blobstorage or Google cloud storage backend.
 *
 * OpenAPI spec version: 0.6.0
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Sphereon.SDK.STORAGE.Model
{
    /// <summary>
    /// BackendRequest
    /// </summary>
    [DataContract]
    public partial class BackendRequest :  IEquatable<BackendRequest>
    {
        /// <summary>
        /// The provider of the credentials
        /// </summary>
        /// <value>The provider of the credentials</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum AuthenticationProviderEnum
        {
            
            /// <summary>
            /// Enum APISUPPLIER for "API_SUPPLIER"
            /// </summary>
            [EnumMember(Value = "API_SUPPLIER")]
            APISUPPLIER,
            
            /// <summary>
            /// Enum ENDUSER for "END_USER"
            /// </summary>
            [EnumMember(Value = "END_USER")]
            ENDUSER
        }

        /// <summary>
        /// The type of backend that is created. This field allows users to create a local backend or with supported 3rd parties.
        /// </summary>
        /// <value>The type of backend that is created. This field allows users to create a local backend or with supported 3rd parties.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum BackendTypeEnum
        {
            
            /// <summary>
            /// Enum FILESYSTEM for "FILESYSTEM"
            /// </summary>
            [EnumMember(Value = "FILESYSTEM")]
            FILESYSTEM,
            
            /// <summary>
            /// Enum AMAZONS3 for "AMAZON_S3"
            /// </summary>
            [EnumMember(Value = "AMAZON_S3")]
            AMAZONS3,
            
            /// <summary>
            /// Enum MSAZUREBLOBSTORAGE for "MS_AZURE_BLOB_STORAGE"
            /// </summary>
            [EnumMember(Value = "MS_AZURE_BLOB_STORAGE")]
            MSAZUREBLOBSTORAGE,
            
            /// <summary>
            /// Enum GOOGLECLOUDSTORAGE for "GOOGLE_CLOUD_STORAGE"
            /// </summary>
            [EnumMember(Value = "GOOGLE_CLOUD_STORAGE")]
            GOOGLECLOUDSTORAGE
        }

        /// <summary>
        /// The provider of the credentials
        /// </summary>
        /// <value>The provider of the credentials</value>
        [DataMember(Name="authenticationProvider", EmitDefaultValue=false)]
        public AuthenticationProviderEnum? AuthenticationProvider { get; set; }
        /// <summary>
        /// The type of backend that is created. This field allows users to create a local backend or with supported 3rd parties.
        /// </summary>
        /// <value>The type of backend that is created. This field allows users to create a local backend or with supported 3rd parties.</value>
        [DataMember(Name="backendType", EmitDefaultValue=false)]
        public BackendTypeEnum? BackendType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="BackendRequest" /> class.
        /// </summary>
        /// <param name="AuthenticationProvider">The provider of the credentials.</param>
        /// <param name="BackendType">The type of backend that is created. This field allows users to create a local backend or with supported 3rd parties..</param>
        /// <param name="BackendSecret">The API secret for 3rd party backends..</param>
        /// <param name="Name">Name.</param>
        /// <param name="Description">Description.</param>
        /// <param name="BackendKey">The API key for 3rd party backends..</param>
        /// <param name="ParentId">The backend that is used for when properties are not set. This allows credentials to be set at one backend and used by multiple backends..</param>
        public BackendRequest(AuthenticationProviderEnum? AuthenticationProvider = null, BackendTypeEnum? BackendType = null, string BackendSecret = null, string Name = null, string Description = null, string BackendKey = null, string ParentId = null)
        {
            this.AuthenticationProvider = AuthenticationProvider;
            this.BackendType = BackendType;
            this.BackendSecret = BackendSecret;
            this.Name = Name;
            this.Description = Description;
            this.BackendKey = BackendKey;
            this.ParentId = ParentId;
        }
        
        /// <summary>
        /// The API secret for 3rd party backends.
        /// </summary>
        /// <value>The API secret for 3rd party backends.</value>
        [DataMember(Name="backendSecret", EmitDefaultValue=false)]
        public string BackendSecret { get; set; }
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }
        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }
        /// <summary>
        /// The API key for 3rd party backends.
        /// </summary>
        /// <value>The API key for 3rd party backends.</value>
        [DataMember(Name="backendKey", EmitDefaultValue=false)]
        public string BackendKey { get; set; }
        /// <summary>
        /// The backend that is used for when properties are not set. This allows credentials to be set at one backend and used by multiple backends.
        /// </summary>
        /// <value>The backend that is used for when properties are not set. This allows credentials to be set at one backend and used by multiple backends.</value>
        [DataMember(Name="parentId", EmitDefaultValue=false)]
        public string ParentId { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BackendRequest {\n");
            sb.Append("  AuthenticationProvider: ").Append(AuthenticationProvider).Append("\n");
            sb.Append("  BackendType: ").Append(BackendType).Append("\n");
            sb.Append("  BackendSecret: ").Append(BackendSecret).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  BackendKey: ").Append(BackendKey).Append("\n");
            sb.Append("  ParentId: ").Append(ParentId).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as BackendRequest);
        }

        /// <summary>
        /// Returns true if BackendRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of BackendRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BackendRequest other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.AuthenticationProvider == other.AuthenticationProvider ||
                    this.AuthenticationProvider != null &&
                    this.AuthenticationProvider.Equals(other.AuthenticationProvider)
                ) && 
                (
                    this.BackendType == other.BackendType ||
                    this.BackendType != null &&
                    this.BackendType.Equals(other.BackendType)
                ) && 
                (
                    this.BackendSecret == other.BackendSecret ||
                    this.BackendSecret != null &&
                    this.BackendSecret.Equals(other.BackendSecret)
                ) && 
                (
                    this.Name == other.Name ||
                    this.Name != null &&
                    this.Name.Equals(other.Name)
                ) && 
                (
                    this.Description == other.Description ||
                    this.Description != null &&
                    this.Description.Equals(other.Description)
                ) && 
                (
                    this.BackendKey == other.BackendKey ||
                    this.BackendKey != null &&
                    this.BackendKey.Equals(other.BackendKey)
                ) && 
                (
                    this.ParentId == other.ParentId ||
                    this.ParentId != null &&
                    this.ParentId.Equals(other.ParentId)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.AuthenticationProvider != null)
                    hash = hash * 59 + this.AuthenticationProvider.GetHashCode();
                if (this.BackendType != null)
                    hash = hash * 59 + this.BackendType.GetHashCode();
                if (this.BackendSecret != null)
                    hash = hash * 59 + this.BackendSecret.GetHashCode();
                if (this.Name != null)
                    hash = hash * 59 + this.Name.GetHashCode();
                if (this.Description != null)
                    hash = hash * 59 + this.Description.GetHashCode();
                if (this.BackendKey != null)
                    hash = hash * 59 + this.BackendKey.GetHashCode();
                if (this.ParentId != null)
                    hash = hash * 59 + this.ParentId.GetHashCode();
                return hash;
            }
        }
    }

}