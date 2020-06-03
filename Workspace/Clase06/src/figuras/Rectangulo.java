package figuras;

public class Rectangulo extends Figura {
	double base;
	double altura;
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		this.area = this.base*this.altura;
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
