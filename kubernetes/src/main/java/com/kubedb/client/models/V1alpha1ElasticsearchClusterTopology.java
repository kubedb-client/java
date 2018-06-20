/*
 * KubeDB
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * Contact: hello@appscode.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kubedb.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kubedb.client.models.V1alpha1ElasticsearchNode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha1ElasticsearchClusterTopology
 */

public class V1alpha1ElasticsearchClusterTopology {
  @SerializedName("client")
  private V1alpha1ElasticsearchNode client = null;

  @SerializedName("data")
  private V1alpha1ElasticsearchNode data = null;

  @SerializedName("master")
  private V1alpha1ElasticsearchNode master = null;

  public V1alpha1ElasticsearchClusterTopology client(V1alpha1ElasticsearchNode client) {
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @ApiModelProperty(required = true, value = "")
  public V1alpha1ElasticsearchNode getClient() {
    return client;
  }

  public void setClient(V1alpha1ElasticsearchNode client) {
    this.client = client;
  }

  public V1alpha1ElasticsearchClusterTopology data(V1alpha1ElasticsearchNode data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  public V1alpha1ElasticsearchNode getData() {
    return data;
  }

  public void setData(V1alpha1ElasticsearchNode data) {
    this.data = data;
  }

  public V1alpha1ElasticsearchClusterTopology master(V1alpha1ElasticsearchNode master) {
    this.master = master;
    return this;
  }

   /**
   * Get master
   * @return master
  **/
  @ApiModelProperty(required = true, value = "")
  public V1alpha1ElasticsearchNode getMaster() {
    return master;
  }

  public void setMaster(V1alpha1ElasticsearchNode master) {
    this.master = master;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ElasticsearchClusterTopology v1alpha1ElasticsearchClusterTopology = (V1alpha1ElasticsearchClusterTopology) o;
    return Objects.equals(this.client, v1alpha1ElasticsearchClusterTopology.client) &&
        Objects.equals(this.data, v1alpha1ElasticsearchClusterTopology.data) &&
        Objects.equals(this.master, v1alpha1ElasticsearchClusterTopology.master);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, data, master);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ElasticsearchClusterTopology {\n");
    
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    master: ").append(toIndentedString(master)).append("\n");
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
