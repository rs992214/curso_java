package tarea;

public class Ciclista extends Deportista{
	int vueltas;
	int velocidad;
	
	public void mostrarRutina(){
		System.out.println(this.nombre +" realizó " + this.vueltas + " vueltas al velodromo a "+ this.velocidad + "km/h.");
	}

	public int getVueltas() {
		return vueltas;
	}

	public void setVueltas(int vueltas) {
		this.vueltas = vueltas;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
}
