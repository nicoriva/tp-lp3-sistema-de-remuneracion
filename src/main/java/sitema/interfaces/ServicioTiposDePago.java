import java.util.ArrayList;

public interface ServicioTiposDePago {

	boolean InsertarPago(string NombreProyecto, string monto, string FormaDePago);
	
	ArrayList<string> ListarPagos();
	
	boolean EliminarPago(int IDpago, ArrayList ListarPagos);
	
	boolean verificarImpuesto(string tipoDeRemuneracion);
	
}
