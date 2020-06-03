package segundaClase;

import java.util.*;

public class tarea02 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int numeroAleatorio = 0;
		Numero numero[] = new Numero[100];
		int i = 0;
		
		for(i=0; i<100; i++){
			numeroAleatorio = ran.nextInt(1000);
			numero[i] = new Numero(numeroAleatorio);
			
			
			
			System.out.println("El número es: " + numero[i].getValor());
			if(numero[i].mayorCien()){
				System.out.println("Es Mayor que 100.");
			}
			else{
				System.out.println("Es Menor que 100");
			}
			System.out.println("El cuadrado del número es: " + numero[i].cuadrado());
			System.out.println("La raíz del número es: " + numero[i].raiz());
			System.out.println("------------------------------------");
		}

	}

}
