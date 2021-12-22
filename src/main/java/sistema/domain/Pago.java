package sistema.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Pago{
	
	int monto;
	String formaDePago;
	String tipoDeRemuneracion;
	
	String usuarioQuePaga;
	String organizacionAPagar;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long idPago;
	
	
	public String getUsuarioQuePaga() {
		return usuarioQuePaga;
	}
	public void setUsuarioQuePaga(String usuarioQuePaga) {
		this.usuarioQuePaga = usuarioQuePaga;
	}
	public String getOrganizacionAPagar() {
		return organizacionAPagar;
	}
	public void setOrganizacionAPagar(String organizacionAPagar) {
		this.organizacionAPagar = organizacionAPagar;
	}
	public Long getIdPago() {
		return idPago;
	}
	public void setIdPago(Long idPago) {
		this.idPago = idPago;
	}
	public String getTipoDeRemuneracion() {
		return tipoDeRemuneracion;
	}
	public void setTipoDeRemuneracion(String tipoDeRemuneracion) {
		this.tipoDeRemuneracion = tipoDeRemuneracion;
	}
	
	//getters y setter
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	public String getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}
	
	
	
	
}
