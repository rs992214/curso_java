package dto;

public class PosteoDTO {
	
	int persona_id;
	String persona_nickname;
	int estado_id;
	String estado_nombre;
	String mensaje;
	public int getPersona_id() {
		return persona_id;
	}
	public void setPersona_id(int persona_id) {
		this.persona_id = persona_id;
	}
	public String getPersona_nickname() {
		return persona_nickname;
	}
	public void setPersona_nickname(String persona_nickname) {
		this.persona_nickname = persona_nickname;
	}
	public int getEstado_id() {
		return estado_id;
	}
	public void setEstado_id(int estado_id) {
		this.estado_id = estado_id;
	}
	public String getEstado_nombre() {
		return estado_nombre;
	}
	public void setEstado_nombre(String estado_nombre) {
		this.estado_nombre = estado_nombre;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
