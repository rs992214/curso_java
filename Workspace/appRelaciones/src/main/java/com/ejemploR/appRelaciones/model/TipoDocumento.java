package com.ejemploR.appRelaciones.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="tipodocumento")
public class TipoDocumento {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotEmpty
	@Length(max=25)
	private String nombre;
	
	@Length(max=150)
	private String descripcion;
	
	@OneToMany(mappedBy="tipoDocumento")
	private Set<Persona> personas;
	
	

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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(Set<Persona> personas) {
		this.personas = personas;
	}

	
	public TipoDocumento(@NotEmpty @Length(max = 25) String nombre, @Length(max = 150) String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	
	public TipoDocumento() {
		super();
	}
	
}
