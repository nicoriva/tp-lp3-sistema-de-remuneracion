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
import sistema.servicios.impl.ServicioOrganizacionImpl;

@RestController
@RequestMapping(ApiPaths.ORGANIZACION)
public class OrganizacionController {

	@Autowired
	private ServicioOrganizacionImpl servicioOrganizacion;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Organizacion> list() {
		return servicioOrganizacion.findAll();
	}
	
	@RequestMapping(value = "/{tipoDeOrganizacion}", method = RequestMethod.GET)
	public List<Organizacion> greetings(@PathVariable("tipoDeOrganizacion") String tipoDeOrganizacion) {
		List<Organizacion> organizaciones = servicioOrganizacion.findByTipoDeOrganizacion(tipoDeOrganizacion);
		return organizaciones;
	}
	
	@PostMapping
	public void add(@RequestBody Organizacion organizaciones) {
		servicioOrganizacion.save(organizaciones);
	}
	
	
	
	
	
}
