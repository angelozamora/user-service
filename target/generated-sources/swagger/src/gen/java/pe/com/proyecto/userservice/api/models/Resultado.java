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
public class Resultado  {
  
  @ApiModelProperty(value = "Codigo de respuesta")
 /**
   * Codigo de respuesta  
  **/
  private String codigoRespuesta = null;

  @ApiModelProperty(value = "Mensaje de respuesta")
 /**
   * Mensaje de respuesta  
  **/
  private String mensajeRespuesta = null;
 /**
   * Codigo de respuesta
   * @return codigoRespuesta
  **/
  @JsonProperty("codigoRespuesta")
  public String getCodigoRespuesta() {
    return codigoRespuesta;
  }

  public void setCodigoRespuesta(String codigoRespuesta) {
    this.codigoRespuesta = codigoRespuesta;
  }

  public Resultado codigoRespuesta(String codigoRespuesta) {
    this.codigoRespuesta = codigoRespuesta;
    return this;
  }

 /**
   * Mensaje de respuesta
   * @return mensajeRespuesta
  **/
  @JsonProperty("mensajeRespuesta")
  public String getMensajeRespuesta() {
    return mensajeRespuesta;
  }

  public void setMensajeRespuesta(String mensajeRespuesta) {
    this.mensajeRespuesta = mensajeRespuesta;
  }

  public Resultado mensajeRespuesta(String mensajeRespuesta) {
    this.mensajeRespuesta = mensajeRespuesta;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resultado {\n");
    
    sb.append("    codigoRespuesta: ").append(toIndentedString(codigoRespuesta)).append("\n");
    sb.append("    mensajeRespuesta: ").append(toIndentedString(mensajeRespuesta)).append("\n");
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

