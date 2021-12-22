package sistema.exceptions;

/**
 * Excepcion para verificar datos de usuario
 * e indicar los mensajes correspondientes
 * 
 */
public class ValidarDatosException extends Exception{


	private static final long serialVersionUID = 1L;

	public ValidarDatosException() {
		// TODO Auto-generated constructor stub
	}

	public ValidarDatosException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ValidarDatosException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public ValidarDatosException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ValidarDatosException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
