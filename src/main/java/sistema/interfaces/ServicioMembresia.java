package sistema.interfaces;

import java.util.Date;

import sistema.domain.Usuario;

public interface ServicioMembresia {
	
	
	boolean verificarExpiracion(Date fechaInvitacion, long idUsuario );
	
	boolean verificarTipoMembresia(String rol, long idUsuario);
	
	boolean otorgarMembresia(long idUsuario);

	boolean eliminarMembresia(long idUsuario);
	
}
