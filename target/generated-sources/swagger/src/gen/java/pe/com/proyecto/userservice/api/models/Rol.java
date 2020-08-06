package pe.com.proyecto.userservice.api.models;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * 
 **/
@ApiModel(description="")
public class Rol  {
  
  @ApiModelProperty(value = "Identificador del rol")
 /**
   * Identificador del rol  
  **/
  private String id = null;

  @ApiModelProperty(value = "Nombre del rol")
 /**
   * Nombre del rol  
  **/
  private String rol = null;
 /**
   * Identificador del rol
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Rol id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Nombre del rol
   * @return rol
  **/
  @JsonProperty("rol")
  public String getRol() {
    return rol;
  }

  public void setRol(String rol) {
    this.rol = rol;
  }

  public Rol rol(String rol) {
    this.rol = rol;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rol {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rol: ").append(toIndentedString(rol)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

