package triage.pacientes.controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;
import triage.pacientes.DTO.TriageDTO;


@RestController
@RequestMapping("traige")
public class TraigeController {
	@GetMapping("/")
	public ArrayList<TriageDTO> listaTriage(){
		ArrayList<TriageDTO> lista = new ArrayList<TriageDTO>();
		TriageDTO p;
		
		for(int i=0; i<3; i++){
			p = new TriageDTO();
			
			p.setId(i);		
			p.setColor("color"+i);
			p.setTiempo_maximo(i);
			
			lista.add(p);
		}
		
		return lista;
	}
	
	@GetMapping("/{id}")
	public TriageDTO triageId(@PathVariable int id){
		
		TriageDTO p = new TriageDTO();
					
		p.setId(id);		
		p.setColor("color"+id);
		p.setTiempo_maximo(id);
			
		return p;
	}
	
	@PostMapping("/")
	public String nuevoTriage(@RequestBody TriageDTO sintoma){
		return String.format("Se incluiran el triage %s a la base de datos:", sintoma.getColor());
	}
	
	@PutMapping("/{id}")
	public String cambioTriage(@RequestBody TriageDTO sintoma, @PathVariable int id){
		return String.format("Se cambiara el triage del id %d por %s a la base de datos:", id, sintoma.getColor());
	}
	
	@DeleteMapping("/{id}")
	public String eliminarTriage(@PathVariable int id){
		return String.format("Eliminaria el triage correspondiente al id %d", id);
	}

}
