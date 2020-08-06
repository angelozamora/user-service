package pe.com.proyecto.userservice.app.service;

import pe.com.proyecto.userservice.api.models.Resultado;
import pe.com.proyecto.userservice.api.models.Usuario;
import pe.com.proyecto.userservice.api.models.Usuarios;


public interface UsuarioService {
	
	Usuarios obtenerUsuarios();
	Usuarios obtenerUsuarioxId(String id);
	
	Usuarios registrarUsuario(Usuario usuario);
	Resultado eliminarUsuarioxId(String id);
	
	Usuarios validarUsuario(String user, String password);
	
}
