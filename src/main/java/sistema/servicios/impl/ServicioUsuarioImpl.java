package sistema.servicios.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.domain.Usuario;
import sistema.exceptions.ValidarDatosException;
import sistema.interfaces.ServicioUsuario;
import sistema.repositorios.UsuarioRepositorio;
import sistema.utilidades.NotificarUtilidad;

@Service
public class ServicioUsuarioImpl implements ServicioUsuario{

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	//metodo para listar todos los usuarios
	@Override
	public List<Usuario> findAll() {
		List<Usuario> usuarios = new ArrayList<>();
		Iterator<Usuario> iteratorUsuarios = usuarioRepositorio.findAll().iterator();
		while (iteratorUsuarios.hasNext()) {
			usuarios.add(iteratorUsuarios.next());
		}
		return usuarios;
	}
	
	//metodo para agregar usuarios
	public void save(Usuario usuarios) throws ValidarDatosException {
		try {
			usuarioRepositorio.save(usuarios);
		} catch(Exception error) {
			System.out.println(error);
			throw new ValidarDatosException("Error inesperado al guardar usuario.");
		}
	}
	
	
	//metodo para listar usuarios por un rol especificado
	@Override
	public List<Usuario> findByRol(String rol) {
		List<Usuario> usuarios = new ArrayList<>();
		Iterator<Usuario> iteratorUsuarios = usuarioRepositorio.findByRol(rol).iterator();
		while (iteratorUsuarios.hasNext()) {
			usuarios.add(iteratorUsuarios.next());
		}
		return usuarios;
	}

	
	//metodo que verifica expiracion de invitacion y notifica a esos usuarios
	@Override
	public void notificarExpiracion() throws ValidarDatosException {
		try {
			List<Usuario> usuarios = usuarioRepositorio.findUsuariosMembresiaPorExpirar();
			if (usuarios != null) {
				for(Usuario usuarioANotificar : usuarios) {
					try {
						NotificarUtilidad.notificarVencimientoEmail(usuarioANotificar);
					} catch(Exception e) {
						System.out.println("No se pudo notificar vencimiento al usuario ID: " + usuarioANotificar.getIdUsuario());
					}
				}
			}
		} catch (Exception e) {
			throw new ValidarDatosException("Hubo un problema al notificar vencimiento a los usuarios.");
		}
	}

	
	//metodo para eliminar un usuario por id
	public void delete(long id) throws ValidarDatosException {
		if( usuarioRepositorio.existsById(id) ) {
			usuarioRepositorio.deleteById(id);
		}else {
			throw new ValidarDatosException("No se puede eliminar usuario porque no existe en la base de datos");
		}
		
	}
	
	/* Metodos con posible implementacion generados por ServicioUsuario*/
	
	@Override
	public boolean registro(String nombreUsuario, String correo, String rol, String contrasenha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Usuario asignarRol(String rol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean IniciarSesion(String nombreUsuario, String contrasenha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<String> AgruparRoles(int idUsuario, String rol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Financiar(int monto, String formaDePago) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
