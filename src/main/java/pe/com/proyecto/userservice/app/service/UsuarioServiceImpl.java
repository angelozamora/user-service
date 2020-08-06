package pe.com.proyecto.userservice.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.proyecto.userservice.api.models.Persona;
import pe.com.proyecto.userservice.api.models.Resultado;
import pe.com.proyecto.userservice.api.models.Rol;
import pe.com.proyecto.userservice.api.models.Usuario;
import pe.com.proyecto.userservice.api.models.Usuarios;
import pe.com.proyecto.userservice.app.jpa.PersonaJpa;
import pe.com.proyecto.userservice.app.jpa.RolJpa;
import pe.com.proyecto.userservice.app.jpa.UsuarioJpa;
import pe.com.proyecto.userservice.app.repository.PersonaRepository;
import pe.com.proyecto.userservice.app.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	PersonaRepository personaRepository;

	@Override
	public Usuarios obtenerUsuarios() {
		// TODO Auto-generated method stub
		
		Usuarios usuarios= new Usuarios();
		List<Usuario> usuarioList=new ArrayList<Usuario>();
		Resultado resultado= new Resultado();
		
		try {
			
			for( UsuarioJpa usuarioJpa : usuarioRepository.findAll()){
				
				Usuario usuario=new Usuario();
				usuario.setId(usuarioJpa.getId()+"");
				usuario.setUser(usuarioJpa.getUser());
				usuario.setPassword(usuarioJpa.getPassword());
				
				
				Rol rol= new Rol();
				rol.setId(usuarioJpa.getRol().getId()+"");
				rol.setRol(usuarioJpa.getRol().getRol());
				usuario.setRol(rol);
				
				Persona persona=new Persona();
				persona.setId(usuarioJpa.getPersona().getId()+"");
				persona.setNombre(usuarioJpa.getPersona().getNombre());
				persona.setApellido(usuarioJpa.getPersona().getApellido());
				persona.setCorreo(usuarioJpa.getPersona().getCorreo());
				
				usuario.setPersona(persona);
				
				usuarioList.add(usuario);
				
			}
			
			if(usuarioList.isEmpty()) {
				usuarios.setUsuario(null);
				resultado.setCodigoRespuesta("400");
				resultado.setMensajeRespuesta("Datos de entrada incorrectos");
			}
			else {
				usuarios.setUsuario(usuarioList);
				resultado.setCodigoRespuesta("200");
				resultado.setMensajeRespuesta("Operacion correcta");
			}

			
		}
		catch(Exception e) {
			e.getMessage();
			resultado.setCodigoRespuesta("400");
			resultado.setMensajeRespuesta("Datos de entrada incorrectos");
		}
		
		usuarios.setResultado(resultado);
		
		return usuarios;
		
	}

	@Override
	public Usuarios obtenerUsuarioxId(String id) {
		// TODO Auto-generated method stub
		
		Usuarios usuarios= new Usuarios();
		List<Usuario> usuarioList=new ArrayList<Usuario>();
		Resultado resultado= new Resultado();
		Usuario usuario=new Usuario();
		
		long Id=Long.parseLong(id);
		
		try {
			
			UsuarioJpa usuarioJpa = usuarioRepository.findById(Id);

			if(usuarioJpa!=null){
				
				usuario.setId(usuarioJpa.getId()+"");
				usuario.setUser(usuarioJpa.getUser());
				usuario.setPassword(usuarioJpa.getPassword());
				
				
				Rol rol= new Rol();
				rol.setId(usuarioJpa.getRol().getId()+"");
				rol.setRol(usuarioJpa.getRol().getRol());
				usuario.setRol(rol);
				
				Persona persona=new Persona();
				persona.setId(usuarioJpa.getPersona().getId()+"");
				persona.setNombre(usuarioJpa.getPersona().getNombre());
				persona.setApellido(usuarioJpa.getPersona().getApellido());
				persona.setCorreo(usuarioJpa.getPersona().getCorreo());
				usuario.setPersona(persona);
				
				usuarioList.add(usuario);
				
				usuarios.setUsuario(usuarioList);
				
				resultado.setCodigoRespuesta("200");
				resultado.setMensajeRespuesta("Operacion correcta");
				
			}
			else {
				usuarios.setUsuario(null);
				resultado.setCodigoRespuesta("400");
				
				resultado.setMensajeRespuesta("Datos de entrada incorrectos");
			}

			
		}
		catch(Exception e) {
			e.getMessage();
			resultado.setCodigoRespuesta("400");
			resultado.setMensajeRespuesta("Datos de entrada incorrectos");
		}
		
		usuarios.setResultado(resultado);
		
		return usuarios;
		
	}

	@Override
	public Usuarios registrarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
		Usuarios usuarios= new Usuarios();
		List<Usuario> usuarioList=new ArrayList<Usuario>();
		UsuarioJpa usuarioJpa =new UsuarioJpa();
		Resultado resultado= new Resultado();
		String personaId=null;
		
		try {
			
			

			if(usuario.getId()!=null){
				usuarioJpa = usuarioRepository.findById(Long.parseLong(usuario.getId()));
				personaId=usuarioJpa.getPersona().getId()+"";

			}
			else {
				if(usuarioRepository.existsByUser(usuario.getUser())) {
					resultado.setCodigoRespuesta("400");
					resultado.setMensajeRespuesta("Datos de entrada incorrectos : Usuario duplicado");
					usuarios.setResultado(resultado);
					
					return usuarios;
				}
	
			}
				

			usuarioJpa.setUser(usuario.getUser());
			usuarioJpa.setPassword(usuario.getPassword());
				
				
			RolJpa rolJpa= new RolJpa();
			rolJpa.setId(Long.parseLong(usuario.getRol().getId()));
			rolJpa.setRol(usuario.getRol().getRol());
			
			usuarioJpa.setRol(rolJpa);
	
			
			PersonaJpa personaJpa=new PersonaJpa();
			if(personaId!=null) {
				personaJpa.setId(Long.parseLong(personaId));
			}
			personaJpa.setNombre(usuario.getPersona().getNombre());
			personaJpa.setApellido(usuario.getPersona().getApellido());
			personaJpa.setCorreo(usuario.getPersona().getCorreo());
			personaRepository.save(personaJpa);
			
			usuarioJpa.setPersona(personaJpa);
			
			usuarioRepository.save(usuarioJpa);

			usuario.setId(usuarioJpa.getId()+"");
			
			
			usuarioList.add(usuario);
			
			usuarios.setUsuario(usuarioList);
			
			resultado.setCodigoRespuesta("200");
			resultado.setMensajeRespuesta("Operacion correcta");
			
			
		}
		catch(Exception e) {
			e.getMessage();
			resultado.setCodigoRespuesta("400");
			resultado.setMensajeRespuesta("Datos de entrada incorrectos");
		}
		
		usuarios.setResultado(resultado);
		
		return usuarios;
		
	}

	@Override
	public Resultado eliminarUsuarioxId(String id) {
		// TODO Auto-generated method stub
		Resultado resultado=new Resultado();
		long Id=Long.parseLong(id);
		
		try {
			
			usuarioRepository.deleteById(Id);
			
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

	@Override
	public Usuarios validarUsuario(String user, String password) {
		// TODO Auto-generated method stub
		
		Usuarios usuarios= new Usuarios();
		List<Usuario> usuarioList=new ArrayList<Usuario>();
		Resultado resultado= new Resultado();
		Usuario usuario=new Usuario();
		
		
		try {
			
			UsuarioJpa usuarioJpa = usuarioRepository.findByUserAndPassword(user, password);

			if(usuarioJpa!=null){
				
				usuario.setId(usuarioJpa.getId()+"");
				usuario.setUser(usuarioJpa.getUser());
				usuario.setPassword(usuarioJpa.getPassword());
				
				
				Rol rol= new Rol();
				rol.setId(usuarioJpa.getRol().getId()+"");
				rol.setRol(usuarioJpa.getRol().getRol());
				usuario.setRol(rol);
				
				Persona persona=new Persona();
				persona.setId(usuarioJpa.getPersona().getId()+"");
				persona.setNombre(usuarioJpa.getPersona().getNombre());
				persona.setApellido(usuarioJpa.getPersona().getApellido());
				persona.setCorreo(usuarioJpa.getPersona().getCorreo());
				usuario.setPersona(persona);
				
				usuarioList.add(usuario);
				
				usuarios.setUsuario(usuarioList);
				
				resultado.setCodigoRespuesta("200");
				resultado.setMensajeRespuesta("Operacion correcta : Usuario valido");
				
			}
			else {
				usuarios.setUsuario(null);
				resultado.setCodigoRespuesta("400");
				
				resultado.setMensajeRespuesta("Datos de entrada incorrectos : Usuario invalido");
			}

			
		}
		catch(Exception e) {
			e.getMessage();
			resultado.setCodigoRespuesta("400");
			resultado.setMensajeRespuesta("Datos de entrada incorrectos");
		}
		
		usuarios.setResultado(resultado);
		
		return usuarios;
		
		
		
	}

}
