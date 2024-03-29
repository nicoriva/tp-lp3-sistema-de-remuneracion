package sistema.servicios.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.domain.Organizacion;
import sistema.interfaces.ServicioOrganizacion;
import sistema.repositorios.OrganizacionRepositorio;

@Service
public class ServicioOrganizacionImpl implements ServicioOrganizacion{

	@Autowired
	private OrganizacionRepositorio organizacionRepositorio;

	//metodo que lista todas las organizaciones
	@Override
	public List<Organizacion> findAll() {
		List<Organizacion> organizaciones = new ArrayList<>();
		Iterator<Organizacion> iteratorOrganizaciones = organizacionRepositorio.findAll().iterator();
		while (iteratorOrganizaciones.hasNext()) {
			organizaciones.add(iteratorOrganizaciones.next());
		}
		return organizaciones;
	}
	
	//metodo que guarda las organizaciones
	public void save(Organizacion organizaciones) {
		organizacionRepositorio.save(organizaciones);
		
	}

	//metodo para listar organizaciones por tipo especifico
	@Override
	public List<Organizacion> findByTipoDeOrganizacion(String tipoDeOrganizacion) {
		List<Organizacion> organizaciones = new ArrayList<>();
		Iterator<Organizacion> iteratorOrganizaciones = organizacionRepositorio.findByTipoDeOrganizacion(tipoDeOrganizacion).iterator();
		while (iteratorOrganizaciones.hasNext()) {
			organizaciones.add(iteratorOrganizaciones.next());
		}
		return organizaciones;
	}

	//metodo para eliminar organizacion por id
	public void delete(long id) {
		organizacionRepositorio.deleteById(id);
		
	}
	
}
