package proyecto.posteo.controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;
import dto.EstadoDTO;

@RestController
@RequestMapping("estado")
public class EstadoAnimoController {

	@GetMapping("/")
	public ArrayList<EstadoDTO> listarEstados(){
		ArrayList<EstadoDTO> lista = new ArrayList<EstadoDTO>();
		
		EstadoDTO p = new EstadoDTO();
		
		for(int i=0; i<5; i++){
			p.setNombre("estado"+i);
			p.setId(i);
			
			lista.add(i, p);
		}
		return lista;
	}
	@GetMapping("/{id}")
	public EstadoDTO unEstado(@PathVariable int id){
		EstadoDTO h = new EstadoDTO();
		
		h.setNombre("blabla");
		h.setId(id);
		
		return h;
	}
	
	@PostMapping("/")
	public String crearEstado(@RequestBody EstadoDTO unEstado){
			
		return String.format("Se incorpura el estado %s", unEstado.getNombre());
	}
	
	@PutMapping("/{id}")
	public String cambiarEstado(@PathVariable int id, @RequestBody EstadoDTO estado){
	
		return String.format("cambia el estado %d por %s", id, estado.getNombre());
	}
	
	@DeleteMapping("/{id}")
	public String eliminarEstado(@PathVariable int id){
	
		return String.format("Eliminaria lo correspondiente al estado %d", id);
	}
	
}
