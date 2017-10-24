/* 
 * Storage
 *
 * Sphereon Storage APIs provide an abstraction layer for storage of containers (folders) and objects (files), using a filesystem backend or AWS-s3, Azure blobstorage or Google cloud storage backend.
 *
 * OpenAPI spec version: 0.7
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

namespace Sphereon.SDK.Storage.Model
{
    /// <summary>
    /// RequestCredentials
    /// </summary>
    [DataContract]
    public partial class RequestCredentials :  IEquatable<RequestCredentials>
    {
        /// <summary>
        /// The credentials class type to be used.
        /// </summary>
        /// <value>The credentials class type to be used.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CredentialTypeEnum
        {
            
            /// <summary>
            /// Enum NoCredentials for "com.sphereon.libs.storage.client.api.model.credentials.NoCredentials"
            /// </summary>
            [EnumMember(Value = "com.sphereon.libs.storage.client.api.model.credentials.NoCredentials")]
            NoCredentials,
            
            /// <summary>
            /// Enum OAuthCredentials for "com.sphereon.libs.storage.client.api.model.credentials.OAuthCredentials"
            /// </summary>
            [EnumMember(Value = "com.sphereon.libs.storage.client.api.model.credentials.OAuthCredentials")]
            OAuthCredentials,
            
            /// <summary>
            /// Enum OAuth2Credentials for "com.sphereon.libs.storage.client.api.model.credentials.OAuth2Credentials"
            /// </summary>
            [EnumMember(Value = "com.sphereon.libs.storage.client.api.model.credentials.OAuth2Credentials")]
            OAuth2Credentials,
            
            /// <summary>
            /// Enum UsernamePasswordCredentials for "com.sphereon.libs.storage.client.api.model.credentials.UsernamePasswordCredentials"
            /// </summary>
            [EnumMember(Value = "com.sphereon.libs.storage.client.api.model.credentials.UsernamePasswordCredentials")]
            UsernamePasswordCredentials,
            
            /// <summary>
            /// Enum ClaimParameters for "com.sphereon.libs.storage.client.api.model.credentials.ClaimParameters"
            /// </summary>
            [EnumMember(Value = "com.sphereon.libs.storage.client.api.model.credentials.ClaimParameters")]
            ClaimParameters
        }

        /// <summary>
        /// The credentials class type to be used.
        /// </summary>
        /// <value>The credentials class type to be used.</value>
        [DataMember(Name="credentialType", EmitDefaultValue=false)]
        public CredentialTypeEnum? CredentialType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RequestCredentials" /> class.
        /// </summary>
        /// <param name="CredentialType">The credentials class type to be used..</param>
        /// <param name="Oauth2Credentials">The oauth2Credentials for this backend..</param>
        /// <param name="OauthCredentials">The usernamePasswordCredentials for this backend..</param>
        /// <param name="UsernamePasswordCredentials">The usernamePasswordCredentials for this backend..</param>
        public RequestCredentials(CredentialTypeEnum? CredentialType = null, OAuth2Credentials Oauth2Credentials = null, OAuthCredentials OauthCredentials = null, UsernamePasswordCredentials UsernamePasswordCredentials = null)
        {
            this.CredentialType = CredentialType;
            this.Oauth2Credentials = Oauth2Credentials;
            this.OauthCredentials = OauthCredentials;
            this.UsernamePasswordCredentials = UsernamePasswordCredentials;
        }
        
        /// <summary>
        /// The oauth2Credentials for this backend.
        /// </summary>
        /// <value>The oauth2Credentials for this backend.</value>
        [DataMember(Name="oauth2Credentials", EmitDefaultValue=false)]
        public OAuth2Credentials Oauth2Credentials { get; set; }
        /// <summary>
        /// The usernamePasswordCredentials for this backend.
        /// </summary>
        /// <value>The usernamePasswordCredentials for this backend.</value>
        [DataMember(Name="oauthCredentials", EmitDefaultValue=false)]
        public OAuthCredentials OauthCredentials { get; set; }
        /// <summary>
        /// The usernamePasswordCredentials for this backend.
        /// </summary>
        /// <value>The usernamePasswordCredentials for this backend.</value>
        [DataMember(Name="usernamePasswordCredentials", EmitDefaultValue=false)]
        public UsernamePasswordCredentials UsernamePasswordCredentials { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RequestCredentials {\n");
            sb.Append("  CredentialType: ").Append(CredentialType).Append("\n");
            sb.Append("  Oauth2Credentials: ").Append(Oauth2Credentials).Append("\n");
            sb.Append("  OauthCredentials: ").Append(OauthCredentials).Append("\n");
            sb.Append("  UsernamePasswordCredentials: ").Append(UsernamePasswordCredentials).Append("\n");
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
            return this.Equals(obj as RequestCredentials);
        }

        /// <summary>
        /// Returns true if RequestCredentials instances are equal
        /// </summary>
        /// <param name="other">Instance of RequestCredentials to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RequestCredentials other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.CredentialType == other.CredentialType ||
                    this.CredentialType != null &&
                    this.CredentialType.Equals(other.CredentialType)
                ) && 
                (
                    this.Oauth2Credentials == other.Oauth2Credentials ||
                    this.Oauth2Credentials != null &&
                    this.Oauth2Credentials.Equals(other.Oauth2Credentials)
                ) && 
                (
                    this.OauthCredentials == other.OauthCredentials ||
                    this.OauthCredentials != null &&
                    this.OauthCredentials.Equals(other.OauthCredentials)
                ) && 
                (
                    this.UsernamePasswordCredentials == other.UsernamePasswordCredentials ||
                    this.UsernamePasswordCredentials != null &&
                    this.UsernamePasswordCredentials.Equals(other.UsernamePasswordCredentials)
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
                if (this.CredentialType != null)
                    hash = hash * 59 + this.CredentialType.GetHashCode();
                if (this.Oauth2Credentials != null)
                    hash = hash * 59 + this.Oauth2Credentials.GetHashCode();
                if (this.OauthCredentials != null)
                    hash = hash * 59 + this.OauthCredentials.GetHashCode();
                if (this.UsernamePasswordCredentials != null)
                    hash = hash * 59 + this.UsernamePasswordCredentials.GetHashCode();
                return hash;
            }
        }
    }

}
