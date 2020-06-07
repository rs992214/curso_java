package PrimerProjecto.java.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;;


@SpringBootApplication 	
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	// /hello?name=Martín
	@GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
    }
	  
	// /persona/martin/rubio
	@GetMapping("/persona/{nombre}/{apellido}")
	public String recibirPersona(@PathVariable String nombre,@PathVariable String apellido) {
		return String.format("Hola %s %s!", nombre, apellido);
	}
	
}







  
    
   
    
   
