package tarea.ar;

public class Adulto extends Persona implements Inter{
	int sueldo;

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	public void cobrarSueldo(){
		System.out.println(this.nombre + " "+this.apellido+" cobr� $"+ this.sueldo + ".");
	}
	
	public void tomarLista(Persona persona){
		if(persona.darPresente()){
			System.out.println(persona.getNombre() + " " + persona.getApellido() + " esta presente.");
		}
		else{
			System.out.println(persona.getNombre() + " " + persona.getApellido() + " no esta presente.");
		}

	}
	

}
