package ejemplo.baseDatos.estadoAnimo.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import ejemplo.baseDatos.estadoAnimo.model.Estado;

public interface EstadoRepository extends CrudRepository<Estado, Integer>{

	Optional<Estado> findByNombre(String nombre);

}
