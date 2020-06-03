package segundaClase;

public class Numero {
	int valor;
	
	
	//Metodo Construcctor, te pide un valor inicial al generar la instancia
	public Numero(int numero) {
		super();
		this. valor = numero;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public boolean mayorCien(){
		if(valor > 100){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int cuadrado(){
		return this.valor * this.valor;
	}
	
	public double raiz(){
		return (float) Math.sqrt(this.valor);
	}
	
}
