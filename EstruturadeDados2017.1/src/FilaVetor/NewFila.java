package FilaVetor;

public interface NewFila<E> {
	
	/**
	 * M�todos Obrigatorios
	 */
	public E insereFinal(E valor);
	public E removeInicio();
	
	/**
	 * 
	 */
	
	public boolean filaCheia();
	public boolean filaVazia();
	
	public void ImprimeFila();

}
