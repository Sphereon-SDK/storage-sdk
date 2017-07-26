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
    /// ContainerRequest
    /// </summary>
    [DataContract]
    public partial class ContainerRequest :  IEquatable<ContainerRequest>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ContainerRequest" /> class.
        /// </summary>
        /// <param name="Name">Name.</param>
        /// <param name="BackendId">The backend in which the container will be stored or is stored..</param>
        public ContainerRequest(string Name = null, string BackendId = null)
        {
            this.Name = Name;
            this.BackendId = BackendId;
        }
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }
        /// <summary>
        /// The backend in which the container will be stored or is stored.
        /// </summary>
        /// <value>The backend in which the container will be stored or is stored.</value>
        [DataMember(Name="backendId", EmitDefaultValue=false)]
        public string BackendId { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ContainerRequest {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  BackendId: ").Append(BackendId).Append("\n");
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
            return this.Equals(obj as ContainerRequest);
        }

        /// <summary>
        /// Returns true if ContainerRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of ContainerRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ContainerRequest other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Name == other.Name ||
                    this.Name != null &&
                    this.Name.Equals(other.Name)
                ) && 
                (
                    this.BackendId == other.BackendId ||
                    this.BackendId != null &&
                    this.BackendId.Equals(other.BackendId)
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
                if (this.Name != null)
                    hash = hash * 59 + this.Name.GetHashCode();
                if (this.BackendId != null)
                    hash = hash * 59 + this.BackendId.GetHashCode();
                return hash;
            }
        }
    }

}
