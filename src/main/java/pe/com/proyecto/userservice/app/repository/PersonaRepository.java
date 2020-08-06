package pe.com.proyecto.userservice.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.com.proyecto.userservice.app.jpa.PersonaJpa;

@Repository
public interface PersonaRepository extends CrudRepository<PersonaJpa, Long>{
	
	
	PersonaJpa findById(long id);
	
}	
