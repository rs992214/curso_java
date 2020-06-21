package proyecto.posteo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;

import dto.PosteoDTO;
//import proyecto.posteo.model.Persona;

@RestController
@RequestMapping("posteo")
public class PosteoController {
	
	@GetMapping("/")
	public ArrayList<PosteoDTO> listarPosteos(){
		PosteoDTO p;
		ArrayList<PosteoDTO> posts = new ArrayList<PosteoDTO>();
		//Persona persona = new Persona();
		//posteo.setPersona_id(persona.getId());
		
		for(int i=0;i<10;i++){
			p = new PosteoDTO();
			p.setEstado_id(i);
			p.setEstado_nombre("estado"+i);
			p.setPersona_id(i);
			p.setPersona_nickname("nick"+i);
			p.setMensaje("blablabla"+i);
			
			posts.add(p);
		}
		
		return posts;
		
	}

}
