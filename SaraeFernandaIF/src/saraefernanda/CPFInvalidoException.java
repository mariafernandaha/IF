package saraefernanda;

public class CPFInvalidoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1061004082423448005L;

	public CPFInvalidoException() {
		super("O cpf não é válido");
	}	

}
