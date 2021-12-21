package sistema.domain;

public class Implementador extends Usuario {
	String Tarea;
	String misMembresias;
	public Implementador() {
		// TODO Auto-generated constructor stub
	}
	public String getTarea() {
		return Tarea;
	}
	public void setTarea(String tarea) {
		Tarea = tarea;
	}
	public String getMisMembresias() {
		return misMembresias;
	}
	public void setMisMembresias(String misMembresias) {
		this.misMembresias = misMembresias;
	}

}
