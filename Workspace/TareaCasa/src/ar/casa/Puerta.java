package ar.casa;

public class Puerta {
	String color;


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void showData(){
		System.out.println("Soy una puerta, mi color es " + this.color + ".");
	}

}
