package triage.pacientes.DTO;

import java.util.ArrayList;

public class PacienteDTO {
	int id;
	String nombre;
	String apellido;
	int edad;
	
	ArrayList<String> sintomas;
	
	int triage_id;
	String triage_color;
	int tiempo_maximo;
	
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
	public String getTriage_color() {
		return triage_color;
	}
	public void setTriage_color(String triage_color) {
		this.triage_color = triage_color;
	}
	public ArrayList<String> getSintomas() {
		return sintomas;
	}
	public void setSintomas(ArrayList<String> sintomas) {
		this.sintomas = sintomas;
	}
	public int getTriage_id() {
		return triage_id;
	}
	public void setTriage_id(int triage_id) {
		this.triage_id = triage_id;
	}
	public int getTiempo_maximo() {
		return tiempo_maximo;
	}
	public void setTiempo_maximo(int tiempo_maximo) {
		this.tiempo_maximo = tiempo_maximo;
	}
}
