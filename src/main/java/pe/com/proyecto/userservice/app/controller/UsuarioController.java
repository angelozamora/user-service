package pe.com.proyecto.userservice.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.proyecto.userservice.api.models.Resultado;
import pe.com.proyecto.userservice.api.models.Rol;
import pe.com.proyecto.userservice.api.models.Roles;
import pe.com.proyecto.userservice.api.models.Usuario;
import pe.com.proyecto.userservice.api.models.Usuarios;
import pe.com.proyecto.userservice.app.service.UsuarioService;


@RestController
@RequestMapping("/user")
public class UsuarioController {
	
	
	@Autowired
	UsuarioService usuarioService;
	
	
	@GetMapping(value="/usuarios")
	public Usuarios obtenerRoles() {
		Usuarios usuarios=new Usuarios();
		usuarios=usuarioService.obtenerUsuarios();
		
		return usuarios;
	}
	
	
	@PostMapping(value="/usuarios")
	public Usuarios registrarUsuario(@RequestBody Usuario usuario) {
		Usuarios usuarios=new Usuarios();
		usuarios=usuarioService.registrarUsuario(usuario);
		
		return usuarios;
	}
	
	
	@GetMapping(value="/usuarios/{usuarioid}")
	public Usuarios obtenerUsuarioxId(@PathVariable(name="usuarioid") String usuarioid ) {
		Usuarios usuarios=new Usuarios();
		usuarios=usuarioService.obtenerUsuarioxId(usuarioid);
		
		return usuarios;
	}
	
	
	@GetMapping(value="/usuarios/validarusuario/user/{user}/password/{password}")
	public Usuarios validarUsuario(@PathVariable(name="user") String user,
			@PathVariable(name="password") String password) {
		Usuarios usuarios=new Usuarios();
		usuarios=usuarioService.validarUsuario(user, password);
		
		return usuarios;
	}
	
	
	@DeleteMapping(value="/usuarios/{usuarioid}")
	public Resultado eliminarUsuarioxId(@PathVariable(name="usuarioid") String usuarioid) {
		Resultado resultado=new Resultado();
		resultado=usuarioService.eliminarUsuarioxId(usuarioid);
		
		return resultado;
	}
	
	
	
}
