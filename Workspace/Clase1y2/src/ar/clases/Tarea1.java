package ar.clases;

import java.util.*;

public class Tarea1 {
	public static void main(String[] args) {
		System.out.println("Se determinaron 1000 números aleatorios entre 0 y 99.");
		
		Random ran = new Random();
		Scanner teclado = new Scanner(System.in);
		
		int numero_rand[] = new int[1000];
		int contador[] = new int[100];
		int numero_usuario;
		double probabilidad;
		double auxiliar;
		int i = 0;
		
		for(i=0; i<100; i++){
			contador[i] = 0;
		}
		
		for(i=0; i<1000; i++){
			numero_rand[i] = ran.nextInt(100);
		}
		
		for(i=0; i<1000; i++){
			contador[numero_rand[i]] +=1;
		}
		
		System.out.print("Ingrese un número para determinas su probabilidad de aparición: ");
		numero_usuario = teclado.nextInt();
		
		auxiliar = contador[numero_usuario];
		probabilidad = auxiliar/10;
		
		System.out.print("El número "+numero_usuario+" tiene una probabilidad de aparicion del ");
		System.out.println(probabilidad + "%.");
	}
}
