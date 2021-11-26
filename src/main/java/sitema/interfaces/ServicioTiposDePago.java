import java.util.ArrayList;

import sitema.domain.BilleteraDigital;
import sitema.domain.Tarjeta;

public interface ServicioTiposDePago {
	
	
	Tarjeta getDatosTarjeta();
	BilleteraDigital getDatosBilletera();

	boolean insertarPago(String nombreProyecto, String monto, String formaDePago);
	
	ArrayList<String> ListarPagos();
	
	boolean eliminarPago(int idPago, ArrayList listarPagos);
	
	boolean verificarImpuesto(String tipoDeRemuneracion);
	
}
