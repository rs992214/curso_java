package javaweb.basedabos.estadoAnimo.controller;

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

import javaweb.basedabos.estadoAnimo.dto.EstadoAnimoDto;
import javaweb.basedabos.estadoAnimo.model.EstadoAnimo;
import javaweb.basedabos.estadoAnimo.repository.EstadoAnimoRepository;



@RestController
@RequestMapping("estado")
public class EstadoAnimoCotroller {
	
	
	@Autowired
	private EstadoAnimoRepository estadoRepository;
	
    @GetMapping("/")
    public Iterable<EstadoAnimo> listarTodos() {
    	
    	Iterable<EstadoAnimo> lista;
    	
    	
    	lista = estadoRepository.findAll(); // SELECT * FROM estado_animo
    	
    	return lista;
    	
    }
 
    
    @GetMapping("/{id}")
    public ResponseEntity listarUno(@PathVariable int id) {
    	
    	Optional<EstadoAnimo> estado;
    	
    	estado = estadoRepository.findById(id);
    	
    	if(estado.isEmpty()) {
    		
    		return ResponseEntity.ok("No hay estado con ese id");
    		
    	}
    	
    	return ResponseEntity.ok(estado);
    	
    	
    }
    
    
    
    @PostMapping("/")
    public ResponseEntity guardar(@RequestBody EstadoAnimoDto unEstado) {
    	try {
    	
	    	EstadoAnimo estado = new EstadoAnimo();
	    	
	    	if(unEstado.getNombre().isEmpty()) {
	    		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falta nombre");
	    	}	    	
	    	
	    	estado.setNombre(unEstado.getNombre());
	    	
	    	estadoRepository.save(estado);
	    	
	    	return ResponseEntity.ok(estado);
    	}
    	catch(Exception e) {
    		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Hubo un error grave: "+e);
    		
    	}
    	
    }
	
	
	@PutMapping("/{id}")
	public ResponseEntity modificar(@PathVariable int id, @RequestBody EstadoAnimoDto unEstado) {
		try {
			Optional<EstadoAnimo> estado;
			EstadoAnimo estadoModificado;
			EstadoAnimo x;
			
	    	if(unEstado.getNombre().isEmpty()) {
	    		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falta nombre");
	    	}	    	
	    	
	    	// Para verificar que no haya otro registro con ese nombre que quiere guardar ahora

	    	x = estadoRepository.findByNombre(unEstado.getNombre());
	    	if(x != null && x.getId() != id) { // Si no esta vacio y el id no coincide => hay otro con el mismo nombre
	    		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ya existe ese estado de animo");
	    	}
	    	
	    	
	    	if(!estadoRepository.findById(id).isPresent()) {
	    		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Id no coincide");
	    	}
    	
	    	estado = estadoRepository.findById(id);
	    	estadoModificado = estado.get();
	    	
	    	estadoModificado.setNombre(unEstado.getNombre());
	    	
	    	estadoRepository.save(estadoModificado);
	    	
	    	return ResponseEntity.ok(estadoModificado);
			
		}
		catch(Exception e) {
    		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Hubo un error grave: "+e);
			
		}	
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity borrar(@PathVariable int id) {
		try {
		
			estadoRepository.deleteById(id);
			
			return ResponseEntity.ok("Se borro correctamente");
		}
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Hubo un error grave: "+e);
		}
		
	}
	

}
