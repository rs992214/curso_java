package com.ejemploR.appRelaciones.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemploR.appRelaciones.dto.PersonaConTipoDocumentoDto;
import com.ejemploR.appRelaciones.dto.PersonaDto;
import com.ejemploR.appRelaciones.dto.TipoDocumentoDto;
import com.ejemploR.appRelaciones.model.Persona;
import com.ejemploR.appRelaciones.model.TipoDocumento;
import com.ejemploR.appRelaciones.repository.PersonaRepository;
import com.ejemploR.appRelaciones.repository.TipoDocumentoRepository;


@RestController
@RequestMapping("persona")
public class PersonaController {
	
	@Autowired
	PersonaRepository personaRepository;
	
	@Autowired
	TipoDocumentoRepository tipoDocumentoRepository;

	@GetMapping("/")
	public ResponseEntity listarTodos() {
		try {
			Iterable<Persona> lista;
			
			lista = personaRepository.findAll();
			
			return ResponseEntity.ok(lista);
			
		}
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e);
		}
	}
	
	@PostMapping("/")
	public ResponseEntity guardar(@RequestBody PersonaDto persona) {
  		try {
  			
			Optional<TipoDocumento> tipoDocumento;
			Persona personaGuardar;
			TipoDocumento tipo;
			PersonaConTipoDocumentoDto personaGuardada;
			TipoDocumentoDto tipoEnviar;
			
			tipoDocumento = tipoDocumentoRepository.findById(persona.getTipodocumento_id());
			
			if(tipoDocumento.isEmpty()) {
				throw new Exception("No encontre el numero de documuento");
			}
			
			tipo = tipoDocumento.get();
			
			tipoEnviar = new TipoDocumentoDto();
			tipoEnviar.setDescripcion(tipo.getDescripcion());
			tipoEnviar.setNombre(tipo.getNombre());
			tipoEnviar.setId(tipo.getId());
  			
  			personaGuardar = new Persona(persona.getNombre(), persona.getApellido(), persona.getNumerodocumento(), tipo);
			
			personaRepository.save(personaGuardar);
			
			personaGuardada = new PersonaConTipoDocumentoDto();
			
			personaGuardada.setId(personaGuardar.getId());
			personaGuardada.setApellido(personaGuardar.getApellido());
			personaGuardada.setNombre(personaGuardar.getNombre());
			personaGuardada.setNumerodocumento(personaGuardar.getNumerodocumento());
			personaGuardada.setTipoDocumento(tipoEnviar);
			
			
			return ResponseEntity.ok(personaGuardada);
			
		}
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e);
		}
	}
	
	
}














