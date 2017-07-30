package FilaSimplesEncadeada;

public class FilaSimplesEncadeada {
	private No cabeca; // ou header
	private int tamanho;

	public FilaSimplesEncadeada() {
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
			System.out.println("Não há elementos para remoção");
		} else {
			cabeca = cabeca.getProximo();
			noRemovido.setProximo(null);
			tamanho--;
		}

		return noRemovido;
	}

	public void imprimeFila() {
		No aux = cabeca;

		while (aux != null) {
			System.out.print(aux.getValor() + " -->");
			aux = aux.getProximo();
		}
		System.out.println();
	}
}
