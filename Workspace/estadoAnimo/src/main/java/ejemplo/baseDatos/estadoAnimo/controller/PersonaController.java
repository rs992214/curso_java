package ejemplo.baseDatos.estadoAnimo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejemplo.baseDatos.estadoAnimo.dto.PersonaDto;
import ejemplo.baseDatos.estadoAnimo.model.Persona;
import ejemplo.baseDatos.estadoAnimo.repository.PersonaRepository;


@RestController
@RequestMapping("persona")
public class PersonaController {

	@Autowired
	private PersonaRepository personaRepository;
	
	@GetMapping("/")
	public ResponseEntity mostrarTodos(){
		try{
			Iterable<Persona> lista;
			lista = personaRepository.findAll();
			ArrayList<PersonaDto> listaSalida = new ArrayList<PersonaDto>();
			
			lista.forEach(registro ->{
				PersonaDto persona = new PersonaDto();
				persona.setId(registro.getId());
				persona.setNombre(registro.getNombre());
				persona.setApellido(registro.getApellido());
				persona.setEdad(registro.getEdad());
				persona.setNickname(registro.getNickname());
				persona.setMail(registro.getMail());
				
				listaSalida.add(persona);
			});
		
			return ResponseEntity.ok(listaSalida);
		}
		catch(Exception e){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Problema: "+e);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity mostrarUno(@PathVariable int id){
		try{
			Persona persona;
			PersonaDto unaPersona = new PersonaDto();
			
			if(!personaRepository.findById(id).isPresent()){
				throw new Exception("No existe registro con ese Id."); 
			}
			
			persona = personaRepository.findById(id).get();
			unaPersona.setId(persona.getId());
			unaPersona.setNombre(persona.getNombre());
			unaPersona.setApellido(persona.getApellido());
			unaPersona.setEdad(persona.getEdad());
			unaPersona.setNickname(persona.getNickname());
			unaPersona.setMail(persona.getMail());
			
			return ResponseEntity.ok(unaPersona);			
		}
		catch(Exception e){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Problema: "+e);
		}
	}
	
	@PostMapping("/")
	public ResponseEntity cargarPersona(@RequestBody PersonaDto persona){
		try{
			Persona unaPersona = new Persona();
			
			if(persona.getNombre().isEmpty()){
				//crear excepciones
				throw new Exception("Falta el Nombre.");
				
				//return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falta Nombre");
			}
			if(persona.getApellido().isEmpty()){
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falta Apellido");
			}
			if(persona.getEdad()<0){
				//probar edad nula
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Edad incorrecta");
			}
			if(persona.getNickname().isEmpty()){
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falta Nickname");
			}
			
			if(persona.getNombre().length()>20 || persona.getNombre().length() < 3){
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Longitud del nombre incorrecta");
			}
			if(persona.getApellido().length()>25 || persona.getApellido().length() < 3){
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Longitud del apellido incorrecta");
			}
			if(persona.getNickname().length()<3 || persona.getNickname().length()>10){
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Longitud del nickname incorreccta");
			}
			if(!persona.getMail().isEmpty()&&(persona.getMail().length()>70 || persona.getMail().length()<10)){
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Longitud del mail incorrecta");
			}
			
			//comprobacion de usuario y mails repetidos
			if(!persona.getMail().isEmpty() && personaRepository.findByMail(persona.getMail()).isPresent()){
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ese mail ya esta en uso.");
			}
			
			if(personaRepository.findByNickname(persona.getNickname()).isPresent()){
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ese Nickname ya esta en uso.");
			}
			
			
			//cargar persona
			unaPersona.setNombre(persona.getNombre());
			unaPersona.setApellido(persona.getApellido());
			unaPersona.setEdad(persona.getEdad());
			unaPersona.setNickname(persona.getNickname());
			if(!persona.getMail().isEmpty()){
				unaPersona.setMail(persona.getMail());
			}
			
			//no funcionaba por el generation type del id... creo
			personaRepository.save(unaPersona);
			persona.setId(unaPersona.getId());
			return ResponseEntity.ok(persona);
		}
		catch(Exception e){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Hubo un error grave: "+ e);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity cambiarDatos(@PathVariable int id, @RequestBody PersonaDto persona){
		try{
			Persona laPersona = new Persona();
			Optional<Persona> unaPersona = personaRepository.findById(id);
			
			if(!unaPersona.isPresent()){
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No hay persona con ese Id");
			}
			
			if(persona.getNombre().isEmpty()){
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falta Nombre");
			}
			if(persona.getApellido().isEmpty()){
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falta Apellido");
			}
			if(persona.getEdad()<0){
				//probar edad nula
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Edad incorrecta");
			}
			if(persona.getNickname().isEmpty()){
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falta Nickname");
			}
			
			if(persona.getNombre().length()>20 || persona.getNombre().length() < 3){
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Longitud del nombre incorrecta");
			}
			if(persona.getApellido().length()>25 || persona.getApellido().length() < 3){
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Longitud del apellido incorrecta");
			}
			if(persona.getNickname().length()<3 || persona.getNickname().length()>10){
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Longitud del nickname incorreccta");
			}
			if(!persona.getMail().isEmpty()&&(persona.getMail().length()>70 || persona.getMail().length()<10)){
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Longitud del mail incorrecta");
			}
			
			//comprobacion mails y nickname repetidos
			unaPersona = personaRepository.findByMail(persona.getMail());
			if(!persona.getMail().isEmpty() && (unaPersona.isPresent()&& unaPersona.get().getId()!=id)){
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ese mail ya esta en uso.");
			}
			unaPersona = personaRepository.findByNickname(persona.getNickname());
			if(unaPersona.isPresent()&&unaPersona.get().getId()!=id){
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ese Nickname ya esta en uso.");
			}
			
			
			laPersona.setId(id);
			laPersona.setNombre(persona.getNombre());
			laPersona.setApellido(persona.getApellido());
			laPersona.setEdad(persona.getEdad());
			laPersona.setNickname(persona.getNickname());
			if(!persona.getMail().isEmpty()){
				laPersona.setMail(persona.getMail());
			}
			
			//no funciona correctamente
			personaRepository.save(laPersona);
			persona.setId(id);
			return ResponseEntity.ok(persona);
			
		}
		catch(Exception e){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Hubo un error grave: "+ e);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity borrarPersona(@PathVariable int id){
		try{
			Optional<Persona> unaPersona = personaRepository.findById(id);
			if(!unaPersona.isPresent()){
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No hay persona con ese Id");
			}
			if(!unaPersona.get().getPosteos().isEmpty()){
				throw new Exception("No se puede elimina una persona con posteos.");
			}
			
			
			personaRepository.deleteById(id);
			
			return ResponseEntity.ok("Se elimino correctamente el registro");
		
		}
		catch(Exception e){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("hubo un problema grave: " + e);
		}
	}
}
