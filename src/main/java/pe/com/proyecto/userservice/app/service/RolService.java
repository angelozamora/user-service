package pe.com.proyecto.userservice.app.service;

import pe.com.proyecto.userservice.api.models.Resultado;
import pe.com.proyecto.userservice.api.models.Rol;
import pe.com.proyecto.userservice.api.models.Roles;

public interface RolService {
	
	Roles obtenerRoles();
	Roles obtenerRolxId(String id);
	
	Roles registrarRol(Rol rol);
	Resultado eliminarRolxId(String id);
	
}
