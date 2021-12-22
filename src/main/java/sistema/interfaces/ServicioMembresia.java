package sistema.interfaces;

import java.util.Date;

import sistema.domain.Usuario;

public interface ServicioMembresia {
	
	/* Posibles metodos implementables */
	
	//metodo para verificar expiracion por fecha y id
	boolean verificarExpiracion(Date fechaInvitacion, long idUsuario );
	
	//metodo para verificar el tipo de membresia por rol y id
	boolean verificarTipoMembresia(String rol, long idUsuario);
	
	//metodo para asignar membresia
	boolean otorgarMembresia(long idUsuario);

	//metodo para eliminar membresia por id
	boolean eliminarMembresia(long idUsuario);
	
}
