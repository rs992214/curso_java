package ar.clase03;

public class Juguete {
	String nombre;
	String tipo;
	
	//constructor, no tiene set el tipo
	public Juguete(String tipo) {
		super();
		this.tipo = tipo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	

}
