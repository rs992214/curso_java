package figuras;

public class Circulo extends Figura {
	double radio;
	
	
	public double calcularArea() {
		// TODO Auto-generated method stub
		this.area = this.radio*this.radio*Math.PI;
		return this.area;
	}


	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}	
	
	
}
