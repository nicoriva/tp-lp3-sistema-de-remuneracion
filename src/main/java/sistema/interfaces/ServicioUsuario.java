package sistema.interfaces;

import java.util.ArrayList;

import sistema.domain.Usuario;

public interface ServicioUsuario {

	boolean registro(String nombreUsuario, String correo, String rol, String contrasenha);
	
	public Usuario asignarRol(String rol);
	
	boolean IniciarSesion(String nombreUsuario, String contrasenha);
	
	ArrayList<String> AgruparRoles(int idUsuario, String rol);

	String Financiar(int monto, String formaDePago);

	ArrayList ListarUsuarios(int idUsuario);

	boolean EliminarUsuario(int idUsuario);

}