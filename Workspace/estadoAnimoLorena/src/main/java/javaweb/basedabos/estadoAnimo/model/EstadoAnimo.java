package javaweb.basedabos.estadoAnimo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;



@Entity
public class EstadoAnimo {

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  int id;
	
	  @NotEmpty
	  @Length(min=5, max=20)
	  String nombre;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	  
	
	
}
