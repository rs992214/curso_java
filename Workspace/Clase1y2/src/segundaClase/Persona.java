package segundaClase;

public class Persona {
	
	//Atributos
	String nombre;
	String apellido;
	int edad;
	String dni;
	String sexo;
	String direccion;
	int mesa;
	
	//Metodos
	
	//Metodos especiales =
	//metodo por cada atributo para mostrar ese atributo
	
	
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getMesa() {
		return mesa;
	}

	public void setMesa(int mesa) {
		this.mesa = mesa;
	}

	//Metodos generales/normales
	//int Nombre(par1, par2)
	public boolean voto(boolean votoRealizado){
		//lo que tiene q hacer
		return votoRealizado;
	}
	
	public String mostrarAntecedentes(){
		
		return "";
	}
	
	

}//definición de clase
