package cartas.mazo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Mazo miMazo = new Mazo();
		Scanner tac = new Scanner(System.in);
		
		miMazo.barajar();
		
		//miMazo.getCartas().forEach(carta ->{
			//System.out.println(carta.getPalo() + " " + carta.getNumero());
		//});
		
		for(int i =0; i < 10; i++){
			miMazo.cartasDisponibles();
			miMazo.siguienteCarta();
		}
		System.out.print("Ingrese la cantidad de cartas que desea sacar: ");
		miMazo.darCartas(tac.nextInt());
		
		miMazo.mostrarMonton();
		miMazo.mostrarMazo();
		
	}

}

//Random ran = new Random();
//int numero = 0;
//String aux;
//ArrayList<String> prueba = new ArrayList<String>();
//for(int i = 0; i<10; i++){
//	prueba.add("carta" + i);
//}
//prueba.add(1,"carta1,5");
//prueba.set(4, "Carta4.5");
//for(int j =0; j<10; j++){
//	numero = ran.nextInt(10);
//	aux = prueba.get(numero);
//	prueba.remove(numero);
//	prueba.add(ran.nextInt(10), aux);
//}
//for(int z = 0; z<10; z++){
//	System.out.println(prueba.get(z));
//}