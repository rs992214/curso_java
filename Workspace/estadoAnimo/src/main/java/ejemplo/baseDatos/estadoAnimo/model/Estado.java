package ejemplo.baseDatos.estadoAnimo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;


@Entity
public class Estado {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty
	@Length(min=5, max=15)
	private String nombre;

	@OneToMany(mappedBy="estado")
	private Set<Posteo> posteos;
	
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

	public Set<Posteo> getPosteos() {
		return posteos;
	}

	public void setPosteos(Set<Posteo> posteos) {
		this.posteos = posteos;
	}

}
