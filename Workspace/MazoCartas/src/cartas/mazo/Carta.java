package cartas.mazo;

public class Carta {
	int numero;
	String palo;
	
	
	public Carta(int numero, String palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}

	public int getNumero() {
		return numero;
	}

	public String getPalo() {
		return palo;
	}
	

}
