package sistema.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Organizacion{ 
	String proyecto;
	String misMembresias;
	String tipoDeOrganizacion;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idOrganizacion;
	


	public Long getIdOrganizacion() {
		return idOrganizacion;
	}
	public void setIdOrganizacion(Long idOrganizacion) {
		this.idOrganizacion = idOrganizacion;
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
