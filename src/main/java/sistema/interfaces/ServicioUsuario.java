package sistema.interfaces;

import java.util.ArrayList;
import java.util.List;

import sistema.domain.Usuario;
import sistema.exceptions.ValidarDatosException;

public interface ServicioUsuario {

	boolean registro(String nombreUsuario, String correo, String rol, String contrasenha);
	
	public Usuario asignarRol(String rol);
	
	boolean IniciarSesion(String nombreUsuario, String contrasenha);
	
	ArrayList<String> AgruparRoles(int idUsuario, String rol);

	String Financiar(int monto, String formaDePago);

	ArrayList ListarUsuarios(int idUsuario);

	boolean EliminarUsuario(int idUsuario);
	
	//listar todos los usuarios
	List<Usuario> findAll();

	List<Usuario> findByRol(String rol);
	
	public void notificarExpiracion() throws ValidarDatosException;

}
