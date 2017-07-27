package FilaVetor;

public interface Fila {

	/**
	 * Metodos obrigatorios
	 */
	public Integer insereFinal(Integer valor);
	public Integer removeInicio();
	
	/**
	 * Metodos secundarios
	 */
	
	public boolean filaCheia();
	public boolean filaVazia();
	
	public void imprimeFila();
	
	
	
}
