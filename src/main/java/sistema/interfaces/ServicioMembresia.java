package sistema.interfaces;

import java.util.Date;

import sistema.domain.Usuario;

public interface ServicioMembresia {
	
	
	boolean verificarExpiracion(Date fechaInvitacion, int idUsuario );
	
	boolean verificarTipoMembresia(String rol, int idUsuario);
	
	boolean otorgarMembresia(int idUsuario);

	boolean eliminarMembresia(int idUsuario);
	
}
