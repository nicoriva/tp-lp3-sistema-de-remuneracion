package sistema.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import sistema.domain.Usuario;

/**
 * Repositorio para agregar datos de usuarios
 */
@Repository
public interface UsuarioRepositorio extends PagingAndSortingRepository<Usuario, Long>, QueryByExampleExecutor<Usuario>{

	//busca por rol con funcion findByRol
	public List<Usuario> findByRol(String rol);

	/*
	 *	Query para seleccionar fecha de invitacion
	 *	y comparar con fecha actual para notificar
	 *	si esta por expirar (2 dias antes)
	 */
	@Query("SELECT u FROM Usuario u WHERE u.fechaInvitacion + 28 < CURRENT_DATE")
	public List<Usuario> findUsuariosMembresiaPorExpirar();
}
