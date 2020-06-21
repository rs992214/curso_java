package com.ejemploR.appRelaciones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemploR.appRelaciones.model.TipoDocumento;
import com.ejemploR.appRelaciones.repository.TipoDocumentoRepository;

@RestController
@RequestMapping("documento")
public class TipoDocumentoController {
	
	@Autowired
	TipoDocumentoRepository tipoDocumentoRepository;
	
	
	@GetMapping("/")
	public ResponseEntity listarTodos() {
		try {
			Iterable<TipoDocumento> lista;
			
			lista = tipoDocumentoRepository.findAll();
			
			return ResponseEntity.ok(lista);
			
		}
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e);
		}
	}
	
	@PostMapping("/")
	public ResponseEntity guardar(@RequestBody TipoDocumento tipoDocumento) {
  		try {
			
  			tipoDocumentoRepository.save(tipoDocumento);
  			
  			return ResponseEntity.ok(tipoDocumento);
			
		}
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e);
		}
	}

}


/*
 * 
  		try {
			
			
			
		}
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e);
		}

 * 
 */