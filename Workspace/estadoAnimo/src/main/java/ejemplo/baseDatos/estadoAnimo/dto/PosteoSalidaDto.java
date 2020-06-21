package ejemplo.baseDatos.estadoAnimo.dto;

public class PosteoSalidaDto {

	private int id;
	private String mensaje;
	private PersonaDto persona;
	private EstadoDto estado;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public PersonaDto getPersona() {
		return persona;
	}
	public void setPersona(PersonaDto persona) {
		this.persona = persona;
	}
	public EstadoDto getEstado() {
		return estado;
	}
	public void setEstado(EstadoDto estado) {
		this.estado = estado;
	}
	
	
}
