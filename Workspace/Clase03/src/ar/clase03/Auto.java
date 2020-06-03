package ar.clase03;

public class Auto {
	String marca;
	String modelo;
	int anio;
	
	
	//constructor
	public Auto(String marca, String modelo, int anio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getAnio() {
		return anio;
	}


}
