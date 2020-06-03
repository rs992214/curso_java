package tarea;

public abstract class Deportista {
	String nombre;
	
	public abstract void mostrarRutina();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
