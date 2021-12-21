package sistema.repositorios;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import sistema.domain.Organizacion;

@Repository
public interface OrganizacionRepositorio extends PagingAndSortingRepository<Organizacion, Long>{

	List<Organizacion> findByTipoDeOrganizacion(String tipoDeOrganizacion);

}
