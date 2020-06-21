package proyecto.posteo.controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;
import dto.PersonaDTO;

@RestController
@RequestMapping("persona")
public class PersonaController {
		
	@GetMapping("/")
	public ArrayList<PersonaDTO> listarPersonas(){
		ArrayList<PersonaDTO> lista = new ArrayList<PersonaDTO>();
		
		PersonaDTO p = new PersonaDTO();
		
		for(int i=0; i<10; i++){
			
			p.setId(i);
			p.setNombre("Nombre"+i);
			p.setApellido("Aéllido"+i);
			p.setMail("mail"+i);
			p.setEdad(10+i);
			p.setNickname("Nick"+i);
			
			lista.add(p);
		}
				
		return lista;
	}
	
	@GetMapping("/{id}")
	public PersonaDTO listarPersonaID(@PathVariable int id){
		PersonaDTO p = new PersonaDTO();
		
		p.setNombre("Nombre");
		p.setApellido("Aéllido");
		p.setMail("mail");
		p.setEdad(10);
		p.setNickname("Nick");
		
		return p;
	}
	
	@PostMapping("/")
	public String crearPersona(@RequestBody PersonaDTO unaPersona){
	
		
		return String.format("Se incluirian los datos de %s %s a la array, incluyendo edad %d, mail %s y nickname %s", unaPersona.getNombre(), unaPersona.getApellido(), unaPersona.getEdad(), unaPersona.getMail(), unaPersona.getNickname());
	}
	
	@PutMapping("/{id}")
	public String cambiarPersona(@PathVariable int id, @RequestBody PersonaDTO unaPersona){
	
		
		return String.format("Cambiaria los datos de la persona del %d por los de %s %s.", id, unaPersona.getNombre(), unaPersona.getApellido());
	}
	
	@DeleteMapping("/{id}")
	public String eliminarPersona(@PathVariable int id){
	
		
		return String.format("Eliminaria lo correspondiente al id %d", id);
	}
	
	
	
}
