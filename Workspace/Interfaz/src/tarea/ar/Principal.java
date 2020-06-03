package tarea.ar;

public class Principal {

	public static void main(String[] args) {
		Persona alumno = new Persona();
		Adulto docente = new Adulto();
		
		alumno.setApellido("Rodriguez");
		alumno.setNombre("Jazmin");
		alumno.setEdad(13);
		
		docente.setApellido("Rubio");
		docente.setNombre("Raul");
		docente.setEdad(41);
		docente.setSueldo(4500);
		
		docente.tomarLista(alumno);
		docente.cobrarSueldo();

	}

}
