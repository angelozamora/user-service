package pe.com.proyecto.userservice.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.proyecto.userservice.api.models.Persona;
import pe.com.proyecto.userservice.api.models.Personas;
import pe.com.proyecto.userservice.api.models.Resultado;
import pe.com.proyecto.userservice.api.models.Rol;
import pe.com.proyecto.userservice.api.models.Usuario;
import pe.com.proyecto.userservice.api.models.Usuarios;
import pe.com.proyecto.userservice.app.jpa.PersonaJpa;
import pe.com.proyecto.userservice.app.jpa.UsuarioJpa;
import pe.com.proyecto.userservice.app.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	PersonaRepository personaRepository;
	
	@Override
	public Personas obtenerPersonas() {
		// TODO Auto-generated method stub
		Personas personas= new Personas();
		List<Persona> personaList=new ArrayList<Persona>();
		Resultado resultado= new Resultado();
		
		try {
			
			for( PersonaJpa personaJpa : personaRepository.findAll()){
				
				Persona persona=new Persona();
				persona.setId(personaJpa.getId()+"");
				persona.setNombre(personaJpa.getNombre());
				persona.setApellido(personaJpa.getApellido());
				persona.setCorreo(personaJpa.getCorreo());

				
				personaList.add(persona);
				
			}
			
			if(personaList.isEmpty()) {
				personas.setPersona(null);
				resultado.setCodigoRespuesta("400");
				resultado.setMensajeRespuesta("Datos de entrada incorrectos");
			}
			else {
				personas.setPersona(personaList);
				resultado.setCodigoRespuesta("200");
				resultado.setMensajeRespuesta("Operacion correcta");
			}

			
		}
		catch(Exception e) {
			e.getMessage();
			resultado.setCodigoRespuesta("400");
			resultado.setMensajeRespuesta("Datos de entrada incorrectos");
		}
		
		personas.setResultado(resultado);
		
		return personas;
	}

	@Override
	public Personas obtenerPersonaxId(String id) {
		// TODO Auto-generated method stub
		
		Personas personas= new Personas();
		List<Persona> personaList=new ArrayList<Persona>();
		Resultado resultado= new Resultado();
		Persona persona=new Persona();
		
		long Id=Long.parseLong(id);
		
		try {
			
			PersonaJpa personaJpa = personaRepository.findById(Id);

			if(personaJpa!=null){
				
				persona.setId(personaJpa.getId()+"");
				persona.setNombre(personaJpa.getNombre());
				persona.setApellido(personaJpa.getApellido());
				persona.setCorreo(personaJpa.getCorreo());
				

				
				personaList.add(persona);
				
				personas.setPersona(personaList);
				
				resultado.setCodigoRespuesta("200");
				resultado.setMensajeRespuesta("Operacion correcta");
				
			}
			else {
				personas.setPersona(null);
				resultado.setCodigoRespuesta("400");
				
				resultado.setMensajeRespuesta("Datos de entrada incorrectos");
			}

			
		}
		catch(Exception e) {
			e.getMessage();
			resultado.setCodigoRespuesta("400");
			resultado.setMensajeRespuesta("Datos de entrada incorrectos");
		}
		
		personas.setResultado(resultado);
		
		return personas;
		
	}

	@Override
	public Personas registrarPersona(Persona persona) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resultado eliminarPersonaxId(String id) {
		// TODO Auto-generated method stub
		Resultado resultado=new Resultado();
		long Id=Long.parseLong(id);
		
		try {
			
			personaRepository.deleteById(Id);
			
			resultado.setCodigoRespuesta("200");
			resultado.setMensajeRespuesta("Operacion correcta");
		}
		catch(Exception e) {
			e.getMessage();
			resultado.setCodigoRespuesta("400");
			resultado.setMensajeRespuesta("Datos de entrada incorrectos");
		}
		
		
		return resultado;
	}

}
