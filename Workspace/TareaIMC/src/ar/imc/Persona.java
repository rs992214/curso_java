package ar.imc;

public class Persona {
	String nombre;
	String apellido;
	int edad;
	String dni;
	double peso;
	double altura;
	
	public Persona(String nombre, String apellido, int edad, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int calcularIMC(){
		if(this.peso/(this.altura*this.altura)>25){
			return 1;
		}
		else{
			if(this.peso/(this.altura*this.altura)<20){
				return -1;
			}
			else{
				return 0;
			}
		}
	}
	public boolean esMayorDeEdad(){
		if(this.edad>21){
			return true;
		}
		else{
			return false;
		}
	}

}
