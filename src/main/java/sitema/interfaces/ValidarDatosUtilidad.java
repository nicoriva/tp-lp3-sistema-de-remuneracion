package sitema.interfaces;

import sitema.domain.Usuario;

public class ValidarDatosUtilidad {
	
	
	public static void validarDatosMembresia(ServicioMembresia datosMembresia, Usuario usuario) {
		
		//verificarExpiracion devuelve true si ha expirado la invitacion
		if ( datosMembresia.verificarExpiracion(usuario.getFechaInvitacion(), usuario.getIdUsuario()) ) {
			//lanzar excepcion
			System.out.println("La invitacion ha expirado");
		}
		
		
		//
		
	}
	
	//utilidad para validar los datos de un usuario
	public static void validarDatosUsuario(Usuario usuario) {
		
		if (esCorto(usuario.getNombreUsuario()) ) {
			//lanzar excepcion
			System.out.println("El nombre de usuario" + usuario.getNombreUsuario() + " es muy corto");
		}
		
		
		//
		
		
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
	
