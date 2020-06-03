package tarea;

public class Arquero extends Deportista {
	int tirosEnBlanco;
	
	public void mostrarRutina(){
		System.out.println(this.nombre + " acertó "+ this.tirosEnBlanco + " tiros en el blanco.");
	}

	public int getTirosEnBlanco() {
		return tirosEnBlanco;
	}

	public void setTirosEnBlanco(int tirosEnBlanco) {
		this.tirosEnBlanco = tirosEnBlanco;
	}
	
}
