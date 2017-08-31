package arvorebin;

public class NoArvoreBin<E> {
	
	public E valor;
	public NoArvoreBin<E> pai, esq, dir;
	
	public NoArvoreBin(E valor, NoArvoreBin<E> pai, NoArvoreBin<E> esq, NoArvoreBin<E> dir ) {
		this.valor = valor;
		this.pai = pai;
		this.esq = esq;
		this.dir = dir;
	}
	
}
