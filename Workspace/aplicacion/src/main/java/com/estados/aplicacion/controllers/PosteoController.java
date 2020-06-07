package com.estados.aplicacion.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("posteo")
public class PosteoController {

	@GetMapping("/")
	public String mostrarPosteos(){
		return String.format("Aca irian todos los posteos.");
	}
	
	@GetMapping("/{id}")
	public String mostrarPosteo(@PathVariable int id){
		return String.format("Mostraría el posteo correspontiente al id %d", id);
	}
	
	@PostMapping("/")
	public String publicarPosteo(@RequestBody Posteo unPosteo){
		return String.format("El posteo enviado contendria: \nNombre: %s \nAnimo: %s \nMensaje: %s", unPosteo.getPersona().getNombre(), unPosteo.getEstado(), unPosteo.getMensaje());
	}
	
	@DeleteMapping("/{id}")
	public String borrarPosteo(@PathVariable int id){
		return String.format("Eliminaria el posteo correspontiente al id %d", id);
	}
	
	@PutMapping("/{id}")
	public String cambiarPosteo(@RequestBody Posteo unPosteo, @PathVariable int id){
		return String.format("Remplazaría el posteo correspontiente al id %d por: \nNombre: %s \nAnimo: %s \nMensaje: %s", id, unPosteo.getPersona().getNombre(), unPosteo.getEstado(), unPosteo.getMensaje());
	}
	
}
