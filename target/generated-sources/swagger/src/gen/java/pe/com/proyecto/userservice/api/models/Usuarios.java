package pe.com.proyecto.userservice.api.models;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import pe.com.proyecto.userservice.api.models.Resultado;
import pe.com.proyecto.userservice.api.models.Usuario;
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
public class Usuarios  {
  
  @ApiModelProperty(value = "Resultado de la operacion")
 /**
   * Resultado de la operacion  
  **/
  private Resultado resultado = null;

  @ApiModelProperty(value = "Lista de usuarios")
 /**
   * Lista de usuarios  
  **/
  private List<Usuario> usuario = null;
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

  public Usuarios resultado(Resultado resultado) {
    this.resultado = resultado;
    return this;
  }

 /**
   * Lista de usuarios
   * @return usuario
  **/
  @JsonProperty("usuario")
  public List<Usuario> getUsuario() {
    return usuario;
  }

  public void setUsuario(List<Usuario> usuario) {
    this.usuario = usuario;
  }

  public Usuarios usuario(List<Usuario> usuario) {
    this.usuario = usuario;
    return this;
  }

  public Usuarios addUsuarioItem(Usuario usuarioItem) {
    this.usuario.add(usuarioItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Usuarios {\n");
    
    sb.append("    resultado: ").append(toIndentedString(resultado)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
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

