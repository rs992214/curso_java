package ar.clase03;

public class Clase03 {

	public static void main(String[] args) {
		
		Adulto miAdulto = new Adulto();
		Auto primerAuto = new Auto("Ford", "xyz", 2020);
		
		miAdulto.setNombre("Martín");
		miAdulto.setApellido("Rubio");
		miAdulto.setEdad(21);
		miAdulto.setAuto(primerAuto);
		miAdulto.setCasa(new Casa ("Calle Falsa 123"));
		
		
		System.out.println(miAdulto.getApellido() + miAdulto.getNombre() + miAdulto.getEdad());
		System.out.println(miAdulto.getCasa().getDireccion());
		System.out.println(miAdulto.auto.getAnio());

		Juguete primerJuguete[] = new Juguete[10];
		
		for (int i=0; i<10; i++){
			primerJuguete[i] = new Juguete("tipo "+i );
		}
		
		Ninio miNinio = new Ninio();
		
		miNinio.setJuguetes(primerJuguete);
		
		System.out.println(miNinio.juguetes[2].getTipo());
		
		for(int j = 0; j<10; j++){
			System.out.println(miNinio.getJuguetes()[j].getTipo());
		}
		
		
	}

}
