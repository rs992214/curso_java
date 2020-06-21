package com.ejemploR.appRelaciones.dto;

public class PersonaDto {

	
	private int id;
	private String nombre;
	private String apellido;
	private String numerodocumento;
	private int tipodocumento_id;
	
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
	public int getTipodocumento_id() {
		return tipodocumento_id;
	}
	public void setTipodocumento_id(int tipodocumento_id) {
		this.tipodocumento_id = tipodocumento_id;
	}
	
	
	
}
