package ejemplo.baseDatos.estadoAnimo.repository;

import org.springframework.data.repository.CrudRepository;

import ejemplo.baseDatos.estadoAnimo.model.Posteo;

public interface PosteoRepository extends CrudRepository<Posteo, Integer>{

}
