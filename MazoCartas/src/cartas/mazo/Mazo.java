package cartas.mazo;

import java.util.*;

public class Mazo {
	ArrayList<Carta> cartas;
	Monton pozo;

	public Mazo() {
		super();
		String palos[] = {"espada","basto","copa","oro"};
		int numeros[] ={1,2,3,4,5,6,7,10,11,12};
		cartas = new ArrayList<Carta>();
		pozo = new Monton();
		
		for(int i = 0; i<4;i++){
			for(int j = 0; j<10; j++){
				this.cartas.add(new Carta(numeros[j],palos[i]));
			}
		}
	}
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void barajar(){
		Random ran = new Random();
		int numero = 0;
		Carta aux;
		
		for(int i =0; i<50; i++){
			numero = ran.nextInt(40);
			aux = this.cartas.get(numero);
			this.cartas.remove(numero);
			this.cartas.add(ran.nextInt(40), aux);
		}
	}
	
	public void siguienteCarta(){
		if(this.cartas.isEmpty()){
			System.out.println("No hay mas cartas en el Mazo.");
		}
		else{
			lanzarCarta();
		}
	}

	public void cartasDisponibles(){
		System.out.println("Cartas disponibles: "+ this.cartas.size());
	}
	
	public void darCartas(int cantidad){
		if(this.cartas.size() >= cantidad){
			for(int i = 0; i < cantidad; i++){
				lanzarCarta();
			}
		}
		else{
			System.out.println("No hay suficientes cartas.");
		}
	}
	
	public void mostrarMonton(){
		System.out.println("Cartas en el Monton:");
		this.pozo.getCartas().forEach(carta ->{
			System.out.println(carta.getNumero() + " " + carta.getPalo());
		});
	}
	
	public void mostrarMazo(){
		System.out.println("Cartas restantes en el Mazo:");
		cartas.forEach(carta ->{
			System.out.println(carta.getNumero() + " " + carta.getPalo());
		});
	}
	
	private void lanzarCarta(){
		Carta auxiliar = this.cartas.get(0);
		this.cartas.remove(0);
		pozo.getCartas().add(auxiliar);
		System.out.println("Sali� el " + auxiliar.getNumero() + " de " + auxiliar.getPalo());
	}
}
