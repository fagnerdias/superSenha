package exceptions;

/**
 * Excecao indicando que a senha ou tentativa e invalida
 */
public class SenhaInvalidaException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SenhaInvalidaException() {
		super("Cor inválida");
	}

}