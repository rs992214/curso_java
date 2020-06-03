package ar.tarea;

public class Foto {
	String fecha;
	String descripcion;
	String lugar;
	int cantPer;
	Persona personas[] = new Persona[cantPer];
	
	
	public Foto(String fecha, String descripcion, String lugar, Persona[] personas, int cantPer) {
		super();
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.lugar = lugar;
		this.personas = personas;
		this.cantPer = cantPer;
	}

	public String getFecha() {
		return fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getLugar() {
		return lugar;
	}

	public int getCantPer() {
		return cantPer;
	}

	public Persona[] getPersonas() {
		return personas;
	}
		

}
