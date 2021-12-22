package sistema.repositorios;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import sistema.domain.Pago;

/* repositorio para almacenar y manejar datos de pagos */

@Repository
public interface PagoRepositorio extends PagingAndSortingRepository<Pago, Long>{


}
