package sistema.interfaces;

import sistema.domain.Usuario;

public interface ServicioMembresia {
	
	
	boolean verificarExpiracion(String fechaInvitacion, int idUsuario );
	
	boolean verificarTipoMembresia(String rol, int idUsuario);
	
	boolean otorgarMembresia(int idUsuario);

	boolean eliminarMembresia(int idUsuario);
	
}
