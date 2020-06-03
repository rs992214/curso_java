package ar.tarea;

public class Album {
	Foto fotos[] = new Foto[16];

	public Album(Foto[] fotos) {
		super();
		this.fotos = fotos;
	}

	public Foto[] getFotos() {
		return fotos;
	}
	
	
}
