package triage.pacientes.controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;
import triage.pacientes.DTO.PacienteDTO;

@RestController
@RequestMapping("paciente")
public class PacienteController {
	
	@GetMapping("/")
	public ArrayList<PacienteDTO> listaPacientes(){
		ArrayList<PacienteDTO> lista = new ArrayList<PacienteDTO>();
		PacienteDTO p;
		
		for(int i=0; i<10; i++){
			p = new PacienteDTO();
			
			p.setId(i);		
			p.setNombre("Nombre"+i);
			p.setApellido("Apellido"+i);
			p.setEdad(15+i);
			p.getSintomas().add("sintoma"+i);
			p.setTriage_color("color"+i);
			p.setTiempo_maximo(i);
			p.setTriage_id(i);
			
			lista.add(p);
		}
		
		return lista;
	}

	@GetMapping("/{id}")
	public PacienteDTO pacienteId(@PathVariable int id){
		
		PacienteDTO p = new PacienteDTO();
		
			
		p.setId(id);		
		p.setNombre("Nombre"+id);
		p.setApellido("Apellido"+id);
		p.setEdad(15+id);
		p.getSintomas().add("sintoma"+id);
		p.setTriage_color("color"+id);
		p.setTiempo_maximo(id);
		p.setTriage_id(id);
			
		return p;
	}
	
	@PostMapping("/")
	public String nuevoPaciente(@RequestBody PacienteDTO unPaciente){

		return String.format("Se incluiran los datos del paciente %s %s a la base de datos:", unPaciente.getNombre(), unPaciente.getApellido());
	}

	@PutMapping("/{id}")
	public String cambiarPaciente(@PathVariable int id, @RequestBody PacienteDTO unPaciente){

		
		return String.format("Cambiaria los datos del paciente del id %d por los de %s %s.", id, unPaciente.getNombre(), unPaciente.getApellido());
	}

	@DeleteMapping("/{id}")
	public String eliminarPaciente(@PathVariable int id){
		
		return String.format("Eliminaria lo correspondiente al id %d", id);
	}
	
}


