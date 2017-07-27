package PilhaVetor;

public interface Pilha {

	public Integer insereTopo(Integer valor);
	public Integer removeTopo();
	
	public boolean pilhaCheia();
	public boolean pilhaVazia();
	
	public void imprimePilha();
	
}
