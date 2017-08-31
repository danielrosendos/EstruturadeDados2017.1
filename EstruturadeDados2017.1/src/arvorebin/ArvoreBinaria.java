package arvorebin;

public class ArvoreBinaria<E> {
	public NoArvoreBin<E> raiz;

	public ArvoreBinaria() {
		raiz = null;
	}

	// Insere um nó raiz na árvore vazia
	public NoArvoreBin<E> inserirRaiz(E valor) {
		if (raiz != null)
			throw new IllegalStateException("A árvore já tem raiz");
		raiz = new NoArvoreBin<E>(valor, null, null, null);
		return raiz;
	}

	public NoArvoreBin<E> inserirEsq(NoArvoreBin<E> pai, E valor) {
		if (pai.esq != null)
			throw new IllegalStateException("Este nó já tem filho á esquerda");
		NoArvoreBin<E> aux = new NoArvoreBin<E>(valor, pai, null, null);
		pai.esq = aux;
		return aux;
	}

	public NoArvoreBin<E> inserirDir(NoArvoreBin<E> pai, E valor) {
		if (pai.dir != null)
			throw new IllegalStateException("Este nó já tem filho á direita");
		NoArvoreBin<E> aux = new NoArvoreBin<E>(valor, pai, null, null);
		pai.dir = aux;
		return aux;
	}

	public int profundidadeRecursiva(NoArvoreBin<E> no) {
		int profundidade = 0;

		while (no.pai != null) {
			profundidade++;
			no = no.pai;
		}

		return profundidade;
	}

	public int profundidadeIterativa(NoArvoreBin<E> no) {
		int profundidade = 0;

		while (no.pai != null) {
			profundidade++;
			no = no.pai;
		}

		return profundidade;
	}

	public void imprimirPrefixado() {
		imprimirPrefixado2(raiz);
	}

	private void imprimirPrefixado2(NoArvoreBin<E> v) {
		if (v != null) {
			System.out.print(v.valor + "\t");
			imprimirPrefixado2(v.esq);
			imprimirPrefixado2(v.dir);
		}
	}

	public void imprimirPosFixado() {
		imprimirPosFixado2(raiz);
	}

	private void imprimirPosFixado2(NoArvoreBin<E> v) {
		if (v != null) {
			imprimirPosFixado2(v.esq);
			imprimirPosFixado2(v.dir);

			System.out.print(v.valor + "\t");
		}
	}

	public void imprimirInterFixado() {
		imprimirInterFixado2(raiz);
	}

	private void imprimirInterFixado2(NoArvoreBin<E> v) {
		if (v != null) {
			imprimirInterFixado2(v.esq);
			System.out.println(v.valor + "\t");
			imprimirInterFixado2(v.dir);
		}
	}

}
