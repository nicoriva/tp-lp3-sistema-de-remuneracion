package sistema.interfaces;

import java.util.List;

import sistema.domain.Organizacion;

public interface ServicioOrganizacion {

	//metodo para listar todas las organizaciones
	List<Organizacion> findAll();

	//metodo para todas las organizaciones por tipo
	List<Organizacion> findByTipoDeOrganizacion(String tipoDeOrganizacion);


}
