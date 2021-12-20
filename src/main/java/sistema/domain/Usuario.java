package sistema.domain;

public class Usuario {

	String nombreUsuario;
	String contrasenha;
	String rol;
	String correo;
	
	int idUsuario;
	String fechaInvitacion;
	
	
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getFechaInvitacion() {
		return fechaInvitacion;
	}
	public void setFechaInvitacion(String fechaInvitacion) {
		this.fechaInvitacion = fechaInvitacion;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getContrasenha() {
		return contrasenha;
	}
	public void setContrasenha(String contrasenha) {
		this.contrasenha = contrasenha;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}
