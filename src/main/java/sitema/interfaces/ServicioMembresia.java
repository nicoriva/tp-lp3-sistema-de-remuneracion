package sitema.interfaces;

public interface ServicioMembresia {
	
	boolean verificarExpiracion(date fechaInvitacion, int IDusuario);
	boolean verificarTipoMembresia(string rol, int IDusuario);
	
}
