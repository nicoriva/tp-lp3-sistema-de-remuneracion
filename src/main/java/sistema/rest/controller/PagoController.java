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
import sistema.domain.Pago;
import sistema.exceptions.ValidarDatosException;
import sistema.servicios.impl.ServicioPagoImpl;

@RestController
@RequestMapping(ApiPaths.PAGO)
public class PagoController {

	@Autowired
	private ServicioPagoImpl servicioPago;
	
	//llamada a metodo para listar todos los pagos
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Pago> list() throws ValidarDatosException {
		try {
			return servicioPago.findAll();
		} catch (Exception error) {
			System.out.println(error);
			throw new ValidarDatosException("Ocurrió un error inesperado al listar pagos.");
		}
	}
	
	//llamada a metodo para agregar pagos
	@PostMapping
	public void add(@RequestBody Pago pagos) throws ValidarDatosException{
		try {
			servicioPago.save(pagos);
		} catch (Exception error){ 
			System.out.println(error);
			throw new ValidarDatosException("Ocurrió un error inesperado al agregar pago.");
		}
	}
	
	//llamada a metodo para eliminar pago por id
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") long id) {
		servicioPago.delete(id);
	}
}
