package pe.com.proyecto.userservice.api;

import pe.com.proyecto.userservice.api.models.Personas;
import pe.com.proyecto.userservice.api.models.Resultado;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * user-service.yaml
 *
 * <p>No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface PersonasApi  {

    @GET
    @Path("/user/personas")
    @ApiOperation(value = "", tags={ "Personas",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operacion correcta", response = Personas.class),
        @ApiResponse(code = 400, message = "Datos de entrada incorrectos", response = Personas.class) })
    public Personas userPersonasGet();

    @DELETE
    @Path("/user/personas/{personaid}")
    @ApiOperation(value = "", tags={ "Personas",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operacion correcta", response = Resultado.class),
        @ApiResponse(code = 400, message = "Datos de entrada incorrectos", response = Resultado.class) })
    public Resultado userPersonasPersonaidDelete(@PathParam("personaid") String personaid);

    @GET
    @Path("/user/personas/{personaid}")
    @ApiOperation(value = "", tags={ "Personas" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operacion correcta", response = Personas.class),
        @ApiResponse(code = 400, message = "Datos de entrada incorrectos", response = Personas.class) })
    public Personas userPersonasPersonaidGet(@PathParam("personaid") String personaid);
}

