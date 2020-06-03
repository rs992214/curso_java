package ar.clases;

import java.util.*;

public class PrimeraClase {

	public static void main(String[] args) {
		
		//Definición de variables
		//primitivas - minuscula
		int edad = 20;
		double precio = 12.25;
		
		// objetos - mayusculas
		String nombre = "Pepe";
		String apellido = "Argento";
		
		//impresion de pantalla
		System.out.print("Hollo ");
		System.out.println("World");

		System.out.println("Hola " + nombre + " " + apellido);
		
		//Vectores
		int vector1[];
		vector1 = new int [10];
		int vector2[] = new int[1000];
		
		String[] vector3 = new String[10];
		
		//ciclo for
		for(int i = 0; i < 10; i++){
			vector1[i]= i * 2;
			System.out.println(vector1[i]);
		}
		
		//condicional if
		// condición con "y" &&
		//condición con "o" ||
		if(edad >= 18){
			System.out.println("Es mayor de edad");
		}
		else{
			System.out.println("Es menor de edad");
		}
		
		if(nombre == "Pepe" && apellido == "Argento"){
			System.out.println("Casado con hijos");
		}
		else{
			System.out.println("Algo más");
		}
		
		if(precio > 12 || precio < 5){
			System.out.println("Lo compro");
		}
		else{
			System.out.println("No lo compro");
		}
		
		//Ciclo While
		int j = 0;
		
		while(vector1[j] != 10){
			j++;
		}
		
		System.out.println("La posición "+ j+ " tiene el número 10.");
		
		//numero random - impot biblioteca
		
		Random ran = new Random();
		int otro_numero = ran.nextInt(100);
		System.out.println("numero random " + otro_numero);
		
		for(int z = 0; z < 1000; z++){
			vector2[z]=ran.nextInt(100);
			System.out.print(vector2[z] +" " );
		}
		
		//numeros repetidos - Mostrar la cantidad de veces que s erepite cada numero
		
		int contador = 0;
		
		for(int i = 0; i<100; i++ ){
			contador = 0;
			for( j =0; j<1000;j++){
				if(vector2[j]==i){
					contador++;
				}
			}
			System.out.println("El número "+ i+" se repite "+ contador + " veces");
		}
		
		//Entrada por teclado
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingresa tu nombre: ");
		String dato = teclado.nextLine();
		
		System.out.println(dato.toUpperCase());
		
		
	}

}
