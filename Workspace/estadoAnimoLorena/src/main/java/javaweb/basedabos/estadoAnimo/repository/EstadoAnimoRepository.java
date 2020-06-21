package javaweb.basedabos.estadoAnimo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import javaweb.basedabos.estadoAnimo.model.EstadoAnimo;



public interface EstadoAnimoRepository extends CrudRepository<EstadoAnimo, Integer>{

	EstadoAnimo findByNombre(String nombre);

}
