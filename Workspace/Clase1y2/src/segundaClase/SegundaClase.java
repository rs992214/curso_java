package segundaClase;

import java.util.*;

public class SegundaClase {

	public static void main(String[] args) {
		
		//instancia Persoan
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		
		System.out.println("La persona1 voto? " + persona1.voto(true));
		
		System.out.println("La persona2 voto? " + persona2.voto(false));
		
		persona1.setNombre("Pepe");
		persona1.setApellido("Argento");
		
		System.out.println("Vos te llamas "+ persona1.getNombre() +" "+ persona1.getApellido() +".");
		
		Random ran = new Random();
		
		int numero = ran.nextInt(1000);

		Numero miNumero = new Numero(numero);
		
		//miNumero.setValor(25);
		System.out.println(numero);
		System.out.println(miNumero.cuadrado());
		System.out.println(miNumero.mayorCien());
		System.out.println(miNumero.raiz());

	}

}
//PARADIGMA DE OBJETOS
		// Ejemplo objeto: padron electoral
		
		//Clase = objeto de tipo molde
		//Persona
		
			//Atributos: dni, nombra, dirrección, sexo, mesa
			//Metodo: votar(), mostrarAntecedentes()
		
		//Insrancias = "Especialización"
		//Persona1
			//Atributos: dni=33666999, nombre="Pepe Argento", dirrección = "Calle Falsa 123", sexo = "Masculino", mesa = 51
			//Metodo: votar(); mostrarAntecedentes()