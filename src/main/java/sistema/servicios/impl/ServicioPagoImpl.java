package sistema.servicios.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.domain.Pago;
import sistema.interfaces.ServicioPago;
import sistema.repositorios.PagoRepositorio;

@Service
public class ServicioPagoImpl implements ServicioPago {

	@Autowired
	private PagoRepositorio pagoRepositorio;
	
	//metodo que lista todos los pagos en una lista
	@Override
	public List<Pago> findAll() {
		List<Pago> pagos = new ArrayList<>();
		Iterator<Pago> iteratorPagos = pagoRepositorio.findAll().iterator();
		while (iteratorPagos.hasNext()) {
			pagos.add(iteratorPagos.next());
		}
		return pagos;
	}
	
	//metodo que guarda los nuevos pagos
	public void save(Pago pagos) {
		pagoRepositorio.save(pagos);
		
	}
	
	//metodo para eliminar un pago por id
	public void delete(long id) {
		pagoRepositorio.deleteById(id);
		
	}
}
