package com.ejemplor.relaciones.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ejemplor.relaciones.models.Persona;
import com.ejemplor.relaciones.models.TipoDocumento;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {

	public Optional<Persona> findByTipoDocumentoAndNumerodocumento(TipoDocumento tipoDocumento, String numerodocumento);
}
