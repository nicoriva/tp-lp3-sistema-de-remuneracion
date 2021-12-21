package sistema.domain;

public class Remuneracion extends Pago {
	int MontoBruto;
	int MontoNeto;
	public Remuneracion() {
		// TODO Auto-generated constructor stub
	}
	public int getMontoBruto() {
		return MontoBruto;
	}
	public void setMontoBruto(int montoBruto) {
		MontoBruto = montoBruto;
	}
	public int getMontoNeto() {
		return MontoNeto;
	}
	public void setMontoNeto(int montoNeto) {
		MontoNeto = montoNeto;
	}

}
