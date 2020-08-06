package pe.com.proyecto.userservice.app.service;

import pe.com.proyecto.userservice.api.models.Persona;
import pe.com.proyecto.userservice.api.models.Personas;
import pe.com.proyecto.userservice.api.models.Resultado;


public interface PersonaService {
	
	Personas obtenerPersonas();
	Personas obtenerPersonaxId(String id);
	
	Personas registrarPersona(Persona persona);
	Resultado eliminarPersonaxId(String id);
}
