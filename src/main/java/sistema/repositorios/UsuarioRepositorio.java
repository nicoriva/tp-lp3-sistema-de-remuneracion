package sistema.repositorios;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import sistema.domain.Usuario;

@Repository
public interface UsuarioRepositorio extends PagingAndSortingRepository<Usuario, Long>{ //, QueryByExampleExecutor<Usuario>{

	//@Query("SELECT rol FROM Usuario")
	public List<Usuario> findByRol(String rol);

	
	//public List<Usuario> findUsuariosMembresiaExpirada();
}
