
public interface ServicioUsuario {

	boolean registro(string NombreUsuario, string correo, string rol, string contrasenha);
	public usuario asignarRol(string rol);
	boolean IniciarSesion(string NombreUsuario, string contrasenha);
	
	
}
