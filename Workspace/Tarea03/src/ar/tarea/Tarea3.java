package ar.tarea;

import java.util.*;

public class Tarea3 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		char letra;
		String nomRand = "";
		String apRand = "";
		Foto misFotos[] = new Foto[16];
		Persona misPersonas[];
		String fecha[] = {"13/10/98", "17/04/96", "04/04/03", "03/08/00", "15/12/65", "18/02/70"};
		String descripcion[] = {"Trabajo", "Vacaciones", "Cumpleaños"};
		String lugar[] = {"Buenos Aires", "Cordoba", "Mendosa", "Miami"};
		int cantPer;
		Album miAlbum;
		int i = 0;
		int j = 0;
		int z = 0;
		
		for(i=0; i<16 ; i++){
			cantPer = ran.nextInt(5) + 1;
			misPersonas = new Persona[cantPer];
			
			
			for (j = 0; j<cantPer; j++ ){
								
				for(z=0; z<7; z++){
					letra = (char) (ran.nextInt(25)+65 + ran.nextInt(2)*(32));
					nomRand += letra;
				}
				for(z=0; z<7; z++){
					letra = (char) (ran.nextInt(25)+65 + ran.nextInt(2)*(32));
					apRand += letra;
				}
				misPersonas[j] = new Persona(nomRand, apRand, ran.nextInt(100));
				nomRand = "";
				apRand = "";
			}
			
			misFotos[i] = new Foto(fecha[ran.nextInt(6)],descripcion[ran.nextInt(3)], lugar[ran.nextInt(4)], misPersonas , cantPer );
		}
		
		miAlbum = new Album(misFotos);

		for(i=0; i<16; i++){
			System.out.println("La foto " + (1+i) + " fue tomada el: " + miAlbum.getFotos()[i].getFecha());
			System.out.println("En: " + miAlbum.fotos[i].getLugar());
			System.out.println("El motivo fue " + miAlbum.fotos[i].getDescripcion());
			System.out.println("Eran " + miAlbum.fotos[i].getCantPer() + " personas, eran:");
			
			for(j=0; j<miAlbum.fotos[i].getCantPer(); j++){
				System.out.print("-" + miAlbum.fotos[i].personas[j].getNombre());
				System.out.print(" " + miAlbum.fotos[i].personas[j].getApellido());
				System.out.println(", tenia " + miAlbum.fotos[i].personas[j].getEdad() + " Años");
			}			
			System.out.println("------------------------------------------------------");
		}
		
	}

}

//NOMBRES ALEATORIOS
//int data;
//char aleatorio;
//String nombre = "";
//Random ran = new Random();
//
//for(int i = 0; i<7; i++){
//	data = ran.nextInt(25)+65 + ran.nextInt(2)*(32);
//	aleatorio = (char) data;
//	
//	System.out.println(data+ " "+ aleatorio);
//	nombre += aleatorio;
//}
//System.out.println(nombre);