import java.util.ArrayList;

public interface ServicioUsuario {

	boolean registro(string NombreUsuario, string correo, string rol, string contrasenha);
	
	public usuario asignarRol(string rol);
	
	boolean IniciarSesion(string NombreUsuario, string contrasenha);
	
	ArrayList<string> AgruparRoles(int IDusuario, string rol);

	string Financiar(int monto, string FormaDePago);

	ArrayList ListarUsuarios(int IDusuario);

	boolean EliminarUsuario(int IDusuario);

}
