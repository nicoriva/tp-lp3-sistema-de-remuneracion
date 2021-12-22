package sistema.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sistema.constantes.ApiPaths;
import sistema.domain.Usuario;
import sistema.exceptions.ValidarDatosException;
import sistema.servicios.impl.ServicioUsuarioImpl;

@RestController
@RequestMapping(ApiPaths.USUARIO)
public class UsuarioController {
	
	@Autowired
	private ServicioUsuarioImpl servicioUsuario;
	
	//llamada a metodo para listar todos los usuarios registrados
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Usuario> list() throws ValidarDatosException {
		try {
			return servicioUsuario.findAll();
		} catch (Exception error) {
			System.out.println(error);
			throw new ValidarDatosException("Ocurrió un error inesperado al listar usuarios.");
		}
	}
	
	//llamada a metodo para listar todos los usuarios por un rol especifico
	@RequestMapping(value = "/{rol}", method = RequestMethod.GET)
	public List<Usuario> greetings(@PathVariable("rol") String rol) throws ValidarDatosException {
		try { List<Usuario> usuarios = servicioUsuario.findByRol(rol);
		return usuarios;
		} catch (Exception error) {
			System.out.println(error);
			throw new ValidarDatosException("Ocurrió un error inesperado al buscar por roles.");
		}
	}
	
	//llamada a metodo para agregar un usuario a la lista
	@PostMapping
	public void add(@RequestBody Usuario usuarios) throws ValidarDatosException{
		try {
			servicioUsuario.save(usuarios);
		} catch (ValidarDatosException validarDatosException) {
			throw validarDatosException;
		} catch (Exception error){ 
			System.out.println(error);
			throw new ValidarDatosException("Ocurrió un error inesperado al agregar usuario.");
		}
	}
	
	//llamada a metodo para notificar usuarios a los cuales su invitacion esta por expirar
	@RequestMapping(value = "/notificar-expiracion", method = RequestMethod.GET)
	public void notificarExpiracionUsuarios() throws ValidarDatosException {
		try {
			servicioUsuario.notificarExpiracion();
		} catch (ValidarDatosException validarDatosException) {
			throw validarDatosException;
		} catch(Exception error) {
			System.out.println(error);
			throw new ValidarDatosException("Ocurrió un error inesperado al notificar vencimiento a usuarios.");
			}
	}
	
	//llamada a metodo para borrar de la lista un usuario por su id
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") long id) throws ValidarDatosException {
		try {
			servicioUsuario.delete(id);
		} catch (ValidarDatosException validarDatosException) {
			throw validarDatosException;
		} catch (Exception error) {
			System.out.println(error);
			throw new ValidarDatosException("Ocurrió un error inesperado al eliminar usuario.");
		}
	}
	

}
