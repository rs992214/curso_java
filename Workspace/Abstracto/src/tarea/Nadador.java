package tarea;

public class Nadador extends Deportista{
	int tiempo;
	
	public void mostrarRutina(){
		System.out.println(this.nombre+" nadó 100 meetros en "+this.tiempo+" segundos.");
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	
}
