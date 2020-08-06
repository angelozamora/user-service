package pe.com.proyecto.userservice.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.com.proyecto.userservice.app.jpa.UsuarioJpa;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioJpa, Long>{
	
	UsuarioJpa findById(long id);
	boolean existsByUser(String user);
	
	UsuarioJpa findByUserAndPassword(String user, String password);


}
