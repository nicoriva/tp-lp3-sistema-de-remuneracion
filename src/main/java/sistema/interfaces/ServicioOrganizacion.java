package sistema.interfaces;

import java.util.List;

import sistema.domain.Organizacion;

public interface ServicioOrganizacion {

	
	List<Organizacion> findAll();

	List<Organizacion> findByTipoDeOrganizacion(String tipoDeOrganizacion);

	//List<Usuario> findByRol(String rol);
	
	
}
