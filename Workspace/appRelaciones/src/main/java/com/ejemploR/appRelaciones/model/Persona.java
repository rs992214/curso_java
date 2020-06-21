package com.ejemploR.appRelaciones.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="persona")
public class Persona {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotEmpty
	@Length(max=25)
	private String nombre;
	
	@NotEmpty
	@Length(max=25)
	private String apellido;
	
	@NotEmpty
	@Length(max=15)
	private String numerodocumento;
	

	@ManyToOne()
    @JoinColumn(name="tipodocumento_id", nullable=false)
	private TipoDocumento tipoDocumento;


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


	public String getNumerodocumento() {
		return numerodocumento;
	}


	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}


	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}


	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	public Persona(@NotEmpty @Length(max = 25) String nombre, @NotEmpty @Length(max = 25) String apellido,
			@NotEmpty @Length(max = 15) String numerodocumento, TipoDocumento tipoDocumento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numerodocumento = numerodocumento;
		this.tipoDocumento = tipoDocumento;
	}
	
	public Persona() {
		super();
	}
	
	
	
}
