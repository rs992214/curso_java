package ar.casa;

public class Casa {
	int area;
	Puerta laPuerta;
	
	public Casa(int area) {
		this.area = area;
	}

	public double getArea() {
		return area;
	}

	public Puerta getLaPuerta() {
		return laPuerta;
	}

	public void setLaPuerta(Puerta laPuerta) {
		this.laPuerta = laPuerta;
	}
	
	public void showData(){
		System.out.println("Soy una casa, mi área es de " + this.area + " metros cuadrados.");
	}

}
