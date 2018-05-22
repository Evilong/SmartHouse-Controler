/*
 * Smart House
 * The API for the Smart House IOT project for embedded systems course
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package pt.up.fc.dcc.embeddedsystems.smarthousecontroller.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * Light
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-22T13:13:59.440Z")
public class Light {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("turnon")
  private Boolean turnon = null;

  public Light id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Light description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Light turnon(Boolean turnon) {
    this.turnon = turnon;
    return this;
  }

   /**
   * Get turnon
   * @return turnon
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isTurnon() {
    return turnon;
  }

  public void setTurnon(Boolean turnon) {
    this.turnon = turnon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Light light = (Light) o;
    return Objects.equals(this.id, light.id) &&
        Objects.equals(this.description, light.description) &&
        Objects.equals(this.turnon, light.turnon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, turnon);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Light {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    turnon: ").append(toIndentedString(turnon)).append("\n");
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

