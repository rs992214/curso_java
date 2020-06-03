package ar.casa;

import java.util.Random;

public class Tarea {

	public static void main(String[] args) {
		Random ran = new Random();
		String nombres[] = {"Horacio", "Lorenzo", "Jimena", "Lucila"};
		String colores[] = {"rojo", "azul", "blanco", "verde"};
		SmallDepto hogar = new SmallDepto();
		Puerta miPuerta = new Puerta();
		miPuerta.setColor(colores[ran.nextInt(4)]);
		hogar.setLaPuerta(miPuerta);
		Persona miPersona = new Persona(nombres[ran.nextInt(4)], hogar);
		
		miPersona.showData();	
		
	}

}
