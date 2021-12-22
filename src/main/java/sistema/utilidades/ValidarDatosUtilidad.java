package sistema.utilidades;

import sistema.domain.Usuario;
import sistema.exceptions.ValidarDatosException;
import sistema.interfaces.ServicioMembresia;

public class ValidarDatosUtilidad {
	
	public static void validarDatosMembresia(ServicioMembresia datosMembresia, Usuario usuario) throws ValidarDatosException  {
		
		//verificarExpiracion devuelve true si ha expirado la invitacion
		if ( datosMembresia.verificarExpiracion(usuario.getFechaInvitacion(), usuario.getIdUsuario()) ) {
			throw new ValidarDatosException("La invitacion ha expirado");
		}

		
	}
	
	//utilidad para validar los datos de un usuario
	public static void validarDatosUsuario(Usuario usuario) throws ValidarDatosException {
		
		if (esCorto(usuario.getNombreUsuario()) ) {
			throw new ValidarDatosException("El nombre de usuario" + usuario.getNombreUsuario() + " es muy corto");
		}
		

	}
	
	
	//utilidad para poder validar cadenas que tienen que ser mayor o igual a 4 caracteres
	public static Boolean esCorto(String cadena) {
		if (cadena.length() < 4) {
			return true;
		}
		else{
			return false;
		}
	}
		
		
}
	
