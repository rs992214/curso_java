package triage.pacientes.DTO;

public class TriageDTO {
	
	int id;
	String color;
	int tiempo_maximo;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getTiempo_maximo() {
		return tiempo_maximo;
	}
	public void setTiempo_maximo(int tiempo_maximo) {
		this.tiempo_maximo = tiempo_maximo;
	}

}
