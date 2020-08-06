package pe.com.proyecto.userservice.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pe.com.proyecto.userservice.api.models.Resultado;
import pe.com.proyecto.userservice.api.models.Rol;
import pe.com.proyecto.userservice.api.models.Roles;
import pe.com.proyecto.userservice.app.jpa.RolJpa;
import pe.com.proyecto.userservice.app.repository.RolRepository;

@Service
public class RolServiceImpl implements RolService{

	@Autowired
	RolRepository rolRepository;
	
	
	@Override
	public Roles obtenerRoles() {
		// TODO Auto-generated method stub
		
		Roles roles= new Roles();
		List<Rol> rolList=new ArrayList<Rol>();
		Resultado resultado= new Resultado();
		
		try {
			
			for( RolJpa rolJpa : rolRepository.findAll()){
				
				Rol rol= new Rol();
				rol.setId(rolJpa.getId()+"");
				rol.setRol(rolJpa.getRol());
				
				rolList.add(rol);
			}
			
			if(rolList.isEmpty()) {
				roles.setRol(null);
				resultado.setCodigoRespuesta("400");
				resultado.setMensajeRespuesta("Datos de entrada incorrectos");
			}
			else {
				roles.setRol(rolList);
				resultado.setCodigoRespuesta("200");
				resultado.setMensajeRespuesta("Operacion correcta");
			}

			
		}
		catch(Exception e) {
			e.getMessage();
			resultado.setCodigoRespuesta("400");
			resultado.setMensajeRespuesta("Datos de entrada incorrectos");
		}
		
		roles.setResultado(resultado);
		
		return roles;
	}

	@Override
	public Roles obtenerRolxId(String id) {
		// TODO Auto-generated method stub
		Roles roles= new Roles();
		Rol rol= new Rol();
		List<Rol> rolList=new ArrayList<Rol>();
		Resultado resultado= new Resultado();
		
		long Id=Long.parseLong(id);
		
		try {
			
			RolJpa rolJpa = rolRepository.findById(Id);
			
			if(rolJpa!=null) {
				
				rol.setId(rolJpa.getId()+"");
				rol.setRol(rolJpa.getRol());
				
				rolList.add(rol);
				roles.setRol(rolList);
				
				resultado.setCodigoRespuesta("200");
				resultado.setMensajeRespuesta("Operacion correcta");
			
			}
			else {
				roles.setRol(null);
				
				resultado.setCodigoRespuesta("400");
				resultado.setMensajeRespuesta("Datos de entrada incorrectos");
			}

			
		}
		catch(Exception e) {
			e.getMessage();
			resultado.setCodigoRespuesta("400");
			resultado.setMensajeRespuesta("Datos de entrada incorrectos");
		}
		
		roles.setResultado(resultado);
		
		return roles;
	}

	@Override
	public Roles registrarRol(Rol rol) {
		// TODO Auto-generated method stub
		Roles roles=new Roles();
		List<Rol> rolList=new ArrayList<Rol>();
		Resultado resultado= new Resultado();
		RolJpa rolJpa=new RolJpa();
		
		
		try {
			
			if(rol.getId()!=null) {
				rolJpa=rolRepository.findById(Long.parseLong(rol.getId()));
			}
			else {
				if(rolRepository.existsByRol(rol.getRol())) {
					resultado.setCodigoRespuesta("400");
					resultado.setMensajeRespuesta("Datos de entrada incorrectos : Rol duplicado");
					roles.setResultado(resultado);
					
					return roles;
				}
	
			}
			
			rolJpa.setRol(rol.getRol());
			
			rolRepository.save(rolJpa);
			rol.setId(rolJpa.getId()+"");
			
			rolList.add(rol);
			roles.setRol(rolList);
			
			resultado.setCodigoRespuesta("200");
			resultado.setMensajeRespuesta("Operacion correcta");
			
		}
		catch(Exception e) {
			e.getMessage();
			resultado.setCodigoRespuesta("400");
			resultado.setMensajeRespuesta("Datos de entrada incorrectos");
		}
		
		roles.setResultado(resultado);
		return roles;
	}

	@Override
	public Resultado eliminarRolxId(String id) {
		// TODO Auto-generated method stub
		Resultado resultado=new Resultado();
		long Id=Long.parseLong(id);
		
		try {
			
			rolRepository.deleteById(Id);
			
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
