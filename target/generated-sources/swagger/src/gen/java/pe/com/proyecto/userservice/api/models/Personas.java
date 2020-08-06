package pe.com.proyecto.userservice.api.models;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import pe.com.proyecto.userservice.api.models.Persona;
import pe.com.proyecto.userservice.api.models.Resultado;
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
public class Personas  {
  
  @ApiModelProperty(value = "Resultado de la operacion")
 /**
   * Resultado de la operacion  
  **/
  private Resultado resultado = null;

  @ApiModelProperty(value = "Lista de personas")
 /**
   * Lista de personas  
  **/
  private List<Persona> persona = null;
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

  public Personas resultado(Resultado resultado) {
    this.resultado = resultado;
    return this;
  }

 /**
   * Lista de personas
   * @return persona
  **/
  @JsonProperty("persona")
  public List<Persona> getPersona() {
    return persona;
  }

  public void setPersona(List<Persona> persona) {
    this.persona = persona;
  }

  public Personas persona(List<Persona> persona) {
    this.persona = persona;
    return this;
  }

  public Personas addPersonaItem(Persona personaItem) {
    this.persona.add(personaItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Personas {\n");
    
    sb.append("    resultado: ").append(toIndentedString(resultado)).append("\n");
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
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

