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
import sistema.domain.Organizacion;
import sistema.exceptions.ValidarDatosException;
import sistema.servicios.impl.ServicioOrganizacionImpl;

@RestController
@RequestMapping(ApiPaths.ORGANIZACION)
public class OrganizacionController {

	@Autowired
	private ServicioOrganizacionImpl servicioOrganizacion;
	
	//lamada a metodo para listar todas las organizaciones
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Organizacion> list() throws ValidarDatosException {
		try {
		return servicioOrganizacion.findAll();
		} catch (Exception error){
			System.out.println(error);
			throw new ValidarDatosException("Ocurrió un error inesperado al listar organizaciones.");
		}
	}	
	
	//llamada a metodo que lista organizaciones por un tipo especifico
	@RequestMapping(value = "/{tipoDeOrganizacion}", method = RequestMethod.GET)
	public List<Organizacion> greetings(@PathVariable("tipoDeOrganizacion") String tipoDeOrganizacion) throws ValidarDatosException {
		try {
		List<Organizacion> organizaciones = servicioOrganizacion.findByTipoDeOrganizacion(tipoDeOrganizacion);
		return organizaciones;
		} catch(Exception error){
			System.out.println(error);
			throw new ValidarDatosException("Ocurrió un error inesperado al buscar por tipo de organización.");
		}
	}
	
	//llamada a metodo para agregar una organizacion
	@PostMapping
	public void add(@RequestBody Organizacion organizaciones) throws ValidarDatosException {
		try {
		servicioOrganizacion.save(organizaciones);
		} catch(Exception error) {
			throw new ValidarDatosException("Ocurrió un error inesperado al guardar organizaciones.");
		}
	}
	
	//llamada a metodo para borrar organizacion por id
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") long id) throws ValidarDatosException {
		try {
		servicioOrganizacion.delete(id);
		} catch (Exception error) {
			System.out.println(error);
			throw new ValidarDatosException("Ocurrió un error inesperado al eliminar Organizacion.");
		}
	}
	
	
	
}
