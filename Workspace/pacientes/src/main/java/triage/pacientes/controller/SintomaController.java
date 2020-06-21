package triage.pacientes.controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;
import triage.pacientes.DTO.SintomaDTO;

@RestController
@RequestMapping("sintomas")
public class SintomaController {

	@GetMapping("/")
	public ArrayList<SintomaDTO> listaSintomas(){
		ArrayList<SintomaDTO> lista = new ArrayList<SintomaDTO>();
		SintomaDTO p;
		
		for(int i=0; i<10; i++){
			p = new SintomaDTO();
			
			p.setId(i);		
			p.setNombre("Nombre"+i);
			
			lista.add(p);
		}
		
		return lista;
	}
	
	@GetMapping("/{id}")
	public SintomaDTO sintomaId(@PathVariable int id){
		
		SintomaDTO p = new SintomaDTO();
		
			
		p.setId(id);		
		p.setNombre("Nombre"+id);
			
		return p;
	}
	
	@PostMapping("/")
	public String nuevoSintoma(@RequestBody SintomaDTO sintoma){
		return String.format("Se incluiran el sintoma %s a la base de datos:", sintoma.getNombre());
	}
	
	@PutMapping("/{id}")
	public String cambioSintoma(@RequestBody SintomaDTO sintoma, @PathVariable int id){
		return String.format("Se cambiara el sintoma del id %d por %s a la base de datos:", id, sintoma.getNombre());
	}
	
	@DeleteMapping("/{id}")
	public String eliminarSintoma(@PathVariable int id){
		return String.format("Eliminaria el sintoma correspondiente al id %d", id);
	}
}
