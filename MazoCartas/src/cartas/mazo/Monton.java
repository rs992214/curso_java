package cartas.mazo;

import java.util.ArrayList;

public class Monton {
	ArrayList<Carta> cartas;
	
	public Monton() {
		super();
		this.cartas = new ArrayList<Carta>();
	}
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	
}
