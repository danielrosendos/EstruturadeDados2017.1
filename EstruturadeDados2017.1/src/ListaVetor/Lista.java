package ListaVetor;

public interface Lista<E> {
	public abstract E set(int pos, E e);
	
	public abstract void addPrimeiro(E e);
	public abstract void addUltimo(E e);
	
	public void addAntes(int pos, E e);
	public void addDepois(int pos, E e);
	
	public abstract void removeNumber(E e);
	public abstract void remove(int pos);
	
	public abstract E first(int pos);
	public abstract E last(int pos);
	
	public abstract E anterior(int pos);
	public abstract E posterior(int pos);
	
}
