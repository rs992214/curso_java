package tarea;

public class Principal {

	public static void main(String[] args) {
		Nadador miN = new Nadador();
		Ciclista miC = new Ciclista();
		Arquero miA = new Arquero();
		
		miN.setNombre("Steve");
		miN.setTiempo(9);
		miN.mostrarRutina();
		
		miC.setNombre("David");
		miC.setVelocidad(23);
		miC.setVueltas(5);
		miC.mostrarRutina();
		
		miA.setNombre("Diana");
		miA.setTirosEnBlanco(16);
		miA.mostrarRutina();
	}

}
