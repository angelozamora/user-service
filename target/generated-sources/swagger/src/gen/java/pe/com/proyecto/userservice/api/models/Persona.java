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
public class Persona  {
  
  @ApiModelProperty(value = "Nombre de la perona")
 /**
   * Nombre de la perona  
  **/
  private String nombre = null;

  @ApiModelProperty(value = "Apellido de la persona")
 /**
   * Apellido de la persona  
  **/
  private String apellido = null;

  @ApiModelProperty(value = "Identificador de la persona")
 /**
   * Identificador de la persona  
  **/
  private String id = null;

  @ApiModelProperty(value = "Correo de la persona")
 /**
   * Correo de la persona  
  **/
  private String correo = null;
 /**
   * Nombre de la perona
   * @return nombre
  **/
  @JsonProperty("nombre")
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Persona nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

 /**
   * Apellido de la persona
   * @return apellido
  **/
  @JsonProperty("apellido")
  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public Persona apellido(String apellido) {
    this.apellido = apellido;
    return this;
  }

 /**
   * Identificador de la persona
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Persona id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Correo de la persona
   * @return correo
  **/
  @JsonProperty("correo")
  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public Persona correo(String correo) {
    this.correo = correo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Persona {\n");
    
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    apellido: ").append(toIndentedString(apellido)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    correo: ").append(toIndentedString(correo)).append("\n");
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

