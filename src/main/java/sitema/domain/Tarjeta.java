package sitema.domain;


public class Tarjeta extends Pago{

	String tipoDeTarjeta;
	String numeroDeTarjeta;
	String titutarTarjeta;
	String vencimiento;
	String digitoDeConfirmacion;
	
	
	public String getTipoDeTarjeta() {
		return tipoDeTarjeta;
	}
	public void setTipoDeTarjeta(String tipoDeTarjeta) {
		this.tipoDeTarjeta = tipoDeTarjeta;
	}
	public String getNumeroDeTarjeta() {
		return numeroDeTarjeta;
	}
	public void setNumeroDeTarjeta(String numeroDeTarjeta) {
		this.numeroDeTarjeta = numeroDeTarjeta;
	}
	public String getTitutarTarjeta() {
		return titutarTarjeta;
	}
	public void setTitutarTarjeta(String titutarTarjeta) {
		this.titutarTarjeta = titutarTarjeta;
	}
	public String getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}
	public String getDigitoDeConfirmacion() {
		return digitoDeConfirmacion;
	}
	public void setDigitoDeConfirmacion(String digitoDeConfirmacion) {
		this.digitoDeConfirmacion = digitoDeConfirmacion;
	}
	
	
	
	
}
