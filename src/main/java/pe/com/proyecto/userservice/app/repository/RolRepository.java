package pe.com.proyecto.userservice.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.com.proyecto.userservice.app.jpa.RolJpa;

@Repository
public interface RolRepository extends CrudRepository<RolJpa, Long>{
	
	RolJpa findById(long id);
	boolean existsByRol(String rol);
	
}
