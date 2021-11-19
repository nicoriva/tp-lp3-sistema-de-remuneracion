
public interface ServicioUsuario {

	boolean registro(string NombreUsuario, string correo, string rol, string contrasenha);
	boolean IniciarSesion(string NombreUsuario, string contrasenha);
	
	
}
