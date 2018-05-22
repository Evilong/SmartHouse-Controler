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

import java.math.BigDecimal;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * Setting
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-22T13:13:59.440Z")
public class Setting {
  @SerializedName("automatic")
  private Boolean automatic = null;

  @SerializedName("threshold")
  private BigDecimal threshold = null;

  public Setting automatic(Boolean automatic) {
    this.automatic = automatic;
    return this;
  }

   /**
   * Get automatic
   * @return automatic
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutomatic() {
    return automatic;
  }

  public void setAutomatic(Boolean automatic) {
    this.automatic = automatic;
  }

  public Setting threshold(BigDecimal threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getThreshold() {
    return threshold;
  }

  public void setThreshold(BigDecimal threshold) {
    this.threshold = threshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Setting setting = (Setting) o;
    return Objects.equals(this.automatic, setting.automatic) &&
        Objects.equals(this.threshold, setting.threshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automatic, threshold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Setting {\n");
    
    sb.append("    automatic: ").append(toIndentedString(automatic)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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

