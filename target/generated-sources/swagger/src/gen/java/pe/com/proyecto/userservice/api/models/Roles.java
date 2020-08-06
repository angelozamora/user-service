package pe.com.proyecto.userservice.api.models;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import pe.com.proyecto.userservice.api.models.Resultado;
import pe.com.proyecto.userservice.api.models.Rol;
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
public class Roles  {
  
  @ApiModelProperty(value = "Resultado de la operacion")
 /**
   * Resultado de la operacion  
  **/
  private Resultado resultado = null;

  @ApiModelProperty(value = "Lista de roles")
 /**
   * Lista de roles  
  **/
  private List<Rol> rol = null;
 /**
   * Resultado de la operacion
   * @return resultado
  **/
  @JsonProperty("resultado")
  public Resultado getResultado() {
    return resultado;
  }

  public void setResultado(Resultado resultado) {
    this.resultado = resultado;
  }

  public Roles resultado(Resultado resultado) {
    this.resultado = resultado;
    return this;
  }

 /**
   * Lista de roles
   * @return rol
  **/
  @JsonProperty("rol")
  public List<Rol> getRol() {
    return rol;
  }

  public void setRol(List<Rol> rol) {
    this.rol = rol;
  }

  public Roles rol(List<Rol> rol) {
    this.rol = rol;
    return this;
  }

  public Roles addRolItem(Rol rolItem) {
    this.rol.add(rolItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Roles {\n");
    
    sb.append("    resultado: ").append(toIndentedString(resultado)).append("\n");
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

