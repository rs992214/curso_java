package ejemplo.baseDatos.estadoAnimo.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import ejemplo.baseDatos.estadoAnimo.model.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Integer>{
	Optional<Persona> findByNombre(String nombre);
	
	Optional<Persona> findByMail(String mail);
	
	Optional<Persona> findByNickname(String nickname);
	
}
