package ar.imc;

import java.util.*;

public class CalculadorIMC {

	public static void main(String[] args) {
		Scanner tec= new Scanner(System.in);
		String nombre;
		String apellido;
		String dni;
		int edad;
		Persona miPersona;
		
		System.out.println("\tCalculador IMC");
		System.out.print("Ingrese su nombre: ");
		nombre = tec.nextLine();
		System.out.print("Ingrese su apellido: ");
		apellido = tec.nextLine();
		System.out.print("Ingrese su DNI: ");
		dni = tec.nextLine();
		System.out.print("Ingrese su edad: ");
		edad = tec.nextInt();
		
		miPersona = new Persona(nombre, apellido, edad, dni);
		
		System.out.println("--------------------------------");
		System.out.print(miPersona.getNombre() + ", por favor ingrese su peso: ");
		miPersona.setPeso(tec.nextDouble());
		System.out.print("Ahora, ingrese su altura(en metros): ");
		miPersona.setAltura(tec.nextDouble());
		
		System.out.println("--------------------------------");
		System.out.print(miPersona.getNombre()+" "+miPersona.getApellido() +" segun el calculo de IMC, su condición actual es ");
		if(miPersona.calcularIMC()== -1){
			System.out.println("debajo del peso ideal.");
		}
		if(miPersona.calcularIMC()== 1){
			System.out.println("por encima del peso ideal.");
		}
		if(miPersona.calcularIMC()== 0){
			System.out.println("en peso.");
		}

	}

}
