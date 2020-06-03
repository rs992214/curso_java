package ar.clase03;

public class Casa {
	String direccion;
	String telefono;
	
	
	//constructor
	public Casa(String direccion) {
		super();
		this.direccion = direccion;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
