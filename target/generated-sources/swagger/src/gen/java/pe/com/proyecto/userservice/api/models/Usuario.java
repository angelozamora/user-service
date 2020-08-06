package pe.com.proyecto.userservice.api.models;

import io.swagger.annotations.ApiModel;
import pe.com.proyecto.userservice.api.models.Persona;
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
public class Usuario  {
  
  @ApiModelProperty(value = "Identificador del usuario")
 /**
   * Identificador del usuario  
  **/
  private String id = null;

  @ApiModelProperty(value = "Usuario de la persona")
 /**
   * Usuario de la persona  
  **/
  private String user = null;

  @ApiModelProperty(value = "Password de la persona")
 /**
   * Password de la persona  
  **/
  private String password = null;

  @ApiModelProperty(value = "Persona del usuario")
 /**
   * Persona del usuario  
  **/
  private Persona persona = null;

  @ApiModelProperty(value = "Rol del usuario")
 /**
   * Rol del usuario  
  **/
  private Rol rol = null;
 /**
   * Identificador del usuario
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Usuario id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Usuario de la persona
   * @return user
  **/
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public Usuario user(String user) {
    this.user = user;
    return this;
  }

 /**
   * Password de la persona
   * @return password
  **/
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Usuario password(String password) {
    this.password = password;
    return this;
  }

 /**
   * Persona del usuario
   * @return persona
  **/
  @JsonProperty("persona")
  public Persona getPersona() {
    return persona;
  }

  public void setPersona(Persona persona) {
    this.persona = persona;
  }

  public Usuario persona(Persona persona) {
    this.persona = persona;
    return this;
  }

 /**
   * Rol del usuario
   * @return rol
  **/
  @JsonProperty("rol")
  public Rol getRol() {
    return rol;
  }

  public void setRol(Rol rol) {
    this.rol = rol;
  }

  public Usuario rol(Rol rol) {
    this.rol = rol;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Usuario {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
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

