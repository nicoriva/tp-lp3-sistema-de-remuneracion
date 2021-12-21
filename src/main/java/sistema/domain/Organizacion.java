package sistema.domain;

public class Organizacion extends Usuario {
	String proyecto;
	String misMembresias;
	String tipoDeOrganizacion;
	public Organizacion() {
		// TODO Auto-generated constructor stub
	}
	public String getProyecto() {
		return proyecto;
	}
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	public String getMisMembresias() {
		return misMembresias;
	}
	public void setMisMembresias(String misMembresias) {
		this.misMembresias = misMembresias;
	}
	public String getTipoDeOrganizacion() {
		return tipoDeOrganizacion;
	}
	public void setTipoDeOrganizacion(String tipoDeOrganizacion) {
		this.tipoDeOrganizacion = tipoDeOrganizacion;
	}

}
