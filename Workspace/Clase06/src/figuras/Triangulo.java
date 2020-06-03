package figuras;

public class Triangulo extends Figura{
	double base;
	double altura;
	
	public double calcularArea() {
		// TODO Auto-generated method stub
		this.area = this.base*this.altura/2;
		return this.area;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
