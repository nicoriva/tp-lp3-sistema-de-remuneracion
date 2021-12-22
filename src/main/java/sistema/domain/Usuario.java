package sistema.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

	String nombreUsuario;
	String contrasenha;
	String rol;
	String correo;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long idUsuario;
	
	Date fechaInvitacion;
	
	
	
	public long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Date getFechaInvitacion() {
		return fechaInvitacion;
	}
	public void setFechaInvitacion(Date fechaInvitacion) {
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
