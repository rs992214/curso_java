package com.ejemplor.relaciones.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ejemplor.relaciones.models.TipoDocumento;

public interface TipoDocumentoRepository extends CrudRepository<TipoDocumento, Integer>{

	Optional<TipoDocumento> findByNombre(String nombre);
}
