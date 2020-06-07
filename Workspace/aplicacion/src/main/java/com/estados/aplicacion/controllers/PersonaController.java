package com.estados.aplicacion.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("persona")//con el RequesqMapping "persona" queda como ruta general
public class PersonaController {
	
	@GetMapping("/persona")
	public String hello(@RequestParam(value = "name", defaultValue = "persona")String name){
		return String.format("Hello %s!", name);
	}
	
	@GetMapping("/")
	public String listarPersonas(){
		return String.format("Aca irian todas las personas y sus datos");
	}
	
	@GetMapping("/{id}")
	public String listarPersona(@PathVariable int id){
		return String.format("Acá irian todos los datos de la  persona %d", id);
	}
	
	@PostMapping("/")
	public String guardarPersona(@RequestBody Persona unaPersona){
		return String.format("la persona que me mandaste se llama %s %s, su email es %s, y su usuario es %s", unaPersona.getNombre(), unaPersona.getApellido(), unaPersona.getMail(), unaPersona.getUsuario() );
	}
	
	//delete
	@DeleteMapping("/{id}")
	public String borrarPersona(@PathVariable int id){
		return String.format("Voy a borrar la persona %d", id);
	}
	
	//put
	@PutMapping("/{id}")
	public String cambiarPersona(@RequestBody Persona unaPersona, @PathVariable int id){
		return String.format("el id %d ahora se llama %s %s, su email es %s, y su usuario es %s", id, unaPersona.getNombre(), unaPersona.getApellido(), unaPersona.getMail(), unaPersona.getUsuario() );
	}
}
/*
 * GET persona/ 	listarPersonas
 * GET persona/12 	enviarPersona(id)
 * 
 */

