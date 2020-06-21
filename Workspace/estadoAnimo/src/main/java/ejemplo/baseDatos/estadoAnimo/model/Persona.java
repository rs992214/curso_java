package ejemplo.baseDatos.estadoAnimo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

@Entity
public class Persona {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty
	@Length(min=3, max=20)
	private String nombre;
	
	@NotEmpty
	@Length(min=3, max=25)
	private String apellido;
	
	@NotNull
	private int edad;
	
	@NotEmpty
	@Length(min=3, max=10)
	private String nickname;
	
	@Length(min=10, max=70)
	@Email
	private String mail;
	
	@OneToMany(mappedBy="persona")
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
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Set<Posteo> getPosteos() {
		return posteos;
	}
	public void setPosteos(Set<Posteo> posteos) {
		this.posteos = posteos;
	}

}
