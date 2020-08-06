package pe.com.proyecto.userservice.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.proyecto.userservice.api.models.Persona;
import pe.com.proyecto.userservice.api.models.Personas;
import pe.com.proyecto.userservice.api.models.Resultado;
import pe.com.proyecto.userservice.app.service.PersonaService;


@RequestMapping("/user")
@RestController
public class PersonaController {
	
	@Autowired
	PersonaService personaService;
	
	
	@GetMapping(value="/personas")
	public Personas obtenerRoles() {
		Personas personas=new Personas();
		personas=personaService.obtenerPersonas();
		
		return personas;
	}
	
	
	@PostMapping(value="/personas")
	public Personas registrarRol(@RequestBody Persona persona) {
		Personas personas=new Personas();
		personas=personaService.registrarPersona(persona);
		
		return personas;
	}
	
	
	@GetMapping(value="/personas/{personaid}")
	public Personas obtenerUsuarioxId(@PathVariable(name="personaid") String personaid ) {
		Personas personas=new Personas();
		personas=personaService.obtenerPersonaxId(personaid);
		
		return personas;
	}
	
	@DeleteMapping(value="/personas/{personaid}")
	public Resultado eliminarUsuarioxId(@PathVariable(name="personaid") String personaid) {
		Resultado resultado=new Resultado();
		resultado=personaService.eliminarPersonaxId(personaid);
		
		return resultado;
	}
	
}
