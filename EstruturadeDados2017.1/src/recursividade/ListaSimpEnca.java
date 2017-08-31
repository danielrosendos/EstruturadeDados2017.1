package recursividade;


public class ListaSimpEnca {
	private No cabeca;
	private int tamanho;

	public ListaSimpEnca() {
		cabeca = null;
		tamanho = 0;
	}

	public void insereFinal(No novoNo) {
		if (tamanho == 0) {
			cabeca = novoNo;
		} else {
			getCauda().setProximo(novoNo);
			novoNo.setProximo(null);
		}
		tamanho++;
	}
	
	public No getCabeca(){
		return cabeca;
	}

	public No getCauda() {
		No aux = cabeca;

		while (aux.getProximo() != null) {
			aux = aux.getProximo();
		}

		return aux;
	}

	public No removeInicio() {
		No noRemovido = cabeca;

		if (tamanho == 0) {
			System.out.println("Sem elemtos para remover");
		} else {
			cabeca = cabeca.getProximo();
			noRemovido.setProximo(null);
			tamanho--;
		}

		return noRemovido;
	}

	public void imprimeLista() {
		No aux = cabeca;

		while (aux != null) {
			System.out.print(aux.getValor() + " -->");
			aux = aux.getProximo();
		}
		System.out.println();
	}

	
	//Questao 4 - Metodo para contar a lista
	public int contaLista(No no){
		if (no == null){
			return 0;
		}else{
			int aux = 1 + contaLista(no.getProximo());
			return aux;
		}
	}

}
