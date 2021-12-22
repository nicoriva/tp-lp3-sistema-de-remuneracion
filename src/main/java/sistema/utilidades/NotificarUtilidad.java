package sistema.utilidades;

import sistema.domain.Usuario;

public class NotificarUtilidad {

	public static void notificarVencimientoEmail(Usuario usuarioANotificar) {
		String correo = usuarioANotificar.getCorreo();
		String notificacionCorreo = "Se le notifica que su invitacion con fecha: " + usuarioANotificar.getFechaInvitacion()
		+ "esta por expirar. Tiene dos dias para unirse, luego de eso la invitacion ya no podra usarse";
		NotificarUtilidad.enviarNotificacion(correo, notificacionCorreo);
	}
	
	public static void enviarNotificacion(String correo, String mensaje) {
		System.out.println("Notificacion enviada al correo: " + correo);
		System.out.println("Con mensaje: " + mensaje);
	}
}
