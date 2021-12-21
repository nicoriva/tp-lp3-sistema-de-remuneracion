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
	
	/*
	 * Llama a la funcion para ver a todos los usuarios
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Usuario> list() throws ValidarDatosException {
		try {
			return servicioUsuario.findAll();
		} catch (Exception error) {
			System.out.println(error);
			throw new ValidarDatosException("Ocurrió un error inesperado al listar usuarios.");
		}
	}
	
	@RequestMapping(value = "/{rol}", method = RequestMethod.GET)
	public List<Usuario> greetings(@PathVariable("rol") String rol) throws ValidarDatosException {
		try { List<Usuario> usuarios = servicioUsuario.findByRol(rol);
		return usuarios;
		} catch (Exception error) {
			System.out.println(error);
			throw new ValidarDatosException("Ocurrió un error inesperado al buscar por roles.");
		}
	}
	
	@PostMapping
	public void add(@RequestBody Usuario usuarios) throws ValidarDatosException{
		try {
			servicioUsuario.save(usuarios);
		} catch (Exception error){ 
			System.out.println(error);
			throw new ValidarDatosException("Ocurrió un error inesperado al agregar usuario.");
		}
	}
	
	@RequestMapping(value = "/notificar-expiracion", method = RequestMethod.GET)
	public void notificarExpiracionUsuarios() throws ValidarDatosException {
		try {
		servicioUsuario.notificarExpiracion();
		} catch(Exception error) {
			System.out.println(error);
			throw new ValidarDatosException("Ocurrió un error inesperado al notificar vencimiento a usuarios.");
			}
	}
	
	//
	/*
	@RequestMapping(value = "/bulk", method = RequestMethod.POST)
	public void addBulk(@RequestBody List<Usuario> usuarios) {
		servicioUsuario.saveList(usuarios);
	}
	*/

}
