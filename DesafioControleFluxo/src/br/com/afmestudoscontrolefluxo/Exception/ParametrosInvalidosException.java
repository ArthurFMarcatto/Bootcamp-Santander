package br.com.afmestudoscontrolefluxo.Exception;

public class ParametrosInvalidosException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6364702024662352237L;

	public ParametrosInvalidosException() {
		super();
		System.out.println("O segundo parâmetro deve ser maior que o primeiro");
	}

}
