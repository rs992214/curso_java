package ar.casa;

public class Persona {
	String nombre;
	Casa laCasa;
	
	public Persona(String nombre, Casa laCasa) {
		super();
		this.nombre = nombre;
		this.laCasa = laCasa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Casa getLaCasa() {
		return laCasa;
	}

	public void setLaCasa(Casa laCasa) {
		this.laCasa = laCasa;
	}
	
	public void showData(){
		System.out.println("Me llamo " + this.nombre +".");
		laCasa.showData();
		laCasa.getLaPuerta().showData();
	}

}
