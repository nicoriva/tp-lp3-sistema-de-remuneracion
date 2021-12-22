package sistema.interfaces;

import java.util.ArrayList;
import java.util.List;

import sistema.domain.Usuario;
import sistema.exceptions.ValidarDatosException;

public interface ServicioUsuario {

	
	//listar todos los usuarios
	List<Usuario> findAll();

	/**
	 * Metodo para listar usuario por un rol especifico
	 * 
	 * @param  String rol a listar
	 * @return listado por rol
	 */
	List<Usuario> findByRol(String rol);
	
	/**
	 * Metodo para notificar usuarios con invitacion expirada
	 * 
	 * @throws ValidarDatosException 
	 */
	public void notificarExpiracion() throws ValidarDatosException;

	//metodo para registrar un usuario
	boolean registro(String nombreUsuario, String correo, String rol, String contrasenha);
	
	//metodo para asignar un rol
	public Usuario asignarRol(String rol);
	
	//metodo para iniciar sesion con usuario y contrasenha
	boolean IniciarSesion(String nombreUsuario, String contrasenha);
	
	//metodo para agrupar por roles con id y rol
	ArrayList<String> AgruparRoles(int idUsuario, String rol);

	//metodo para que un usuario financie con un monto y forma de pago
	String Financiar(int monto, String formaDePago);


}
