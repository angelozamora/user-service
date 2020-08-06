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
import pe.com.proyecto.userservice.app.service.RolService;


@RestController
@RequestMapping("/user")
public class RolController {
	
	@Autowired
	RolService rolService;
	
	
	@GetMapping(value="/roles")
	public Roles obtenerRoles() {
		Roles roles=new Roles();
		roles=rolService.obtenerRoles();
		
		return roles;
	}
	
	
	@PostMapping(value="/roles")
	public Roles registrarRol(@RequestBody Rol rol) {
		Roles roles=new Roles();
		roles=rolService.registrarRol(rol);
		
		return roles;
	}
	
	
	@GetMapping(value="/roles/{rolid}")
	public Roles obtenerRolxId(@PathVariable(name="rolid") String rolid ) {
		Roles roles=new Roles();
		roles=rolService.obtenerRolxId(rolid);
		
		return roles;
	}
	
	@DeleteMapping(value="/roles/{rolid}")
	public Resultado eliminarRolxId(@PathVariable(name="rolid") String rolid) {
		Resultado resultado=new Resultado();
		resultado=rolService.eliminarRolxId(rolid);
		
		return resultado;
	}
	

}
