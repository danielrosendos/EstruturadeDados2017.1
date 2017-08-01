package ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada {
	private Integer tamanho;
	private NoDuplo header;
	private NoDuplo trailer;

	public ListaDuplamenteEncadeada() {
		tamanho = 0;
		header = new NoDuplo(null, null, null);
		trailer = new NoDuplo(null, null, null);
		header.setProximo(trailer);
		trailer.setAnterior(header);
	}

	public int getTamanho() {
		return tamanho;
	}

	public NoDuplo getPrimeiro() {
		if (tamanho == 0) {
			System.out.println("lista vazia");
			return null;
		}
		return header.getProximo();
	}

	public NoDuplo getUltimo() {
		if (tamanho == 0) {
			System.out.println("lista vazia");
			return null;
		}
		return trailer.getAnterior();
	}

	public void insereInicio(NoDuplo novoNo) {

		novoNo.setAnterior(header);
		novoNo.setProximo(header.getProximo());

		header.getProximo().setAnterior(novoNo);
		header.setProximo(novoNo);

		tamanho++;
		return;
	}

	public void insereFinal(NoDuplo novoNo) {
		novoNo.setAnterior(trailer.getAnterior());
		novoNo.setProximo(trailer);
		trailer.getAnterior().setProximo(novoNo);
		trailer.setAnterior(novoNo);

		tamanho++;
		return;
	}

	public void inserePos(NoDuplo novoNo, int pos) {
		if (pos < 1 || pos > tamanho + 1) {
			System.out.println("posição inválida");
			return;
		}
		if (tamanho == 0 || pos == 0) {
			insereInicio(novoNo);
			return;
		}
		if (pos == tamanho + 1) {
			insereFinal(novoNo);
			return;
		}

		NoDuplo aux = header.getProximo();
		for (int i = 1; i < pos; i++) {
			aux = aux.getProximo();
		}
		// novoNo REFERENCIA SEU PROXIMO E SEU ANTERIOR
		novoNo.setProximo(aux);
		novoNo.setAnterior(aux.getAnterior());

		// novoNo � REFERENCIADO PELO SEU ANTERIOR E PELO SEU PROXIMO
		aux.getAnterior().setProximo(novoNo);
		aux.setAnterior(novoNo);

		tamanho++;
	}

	public void removeInicio() {
		if (tamanho == 0) {
			System.out.println("lista vazia");
			return;
		}
		NoDuplo noRemovido = header.getProximo();
		header.setProximo(noRemovido.getProximo());
		header.getProximo().setAnterior(header);

		noRemovido.setAnterior(null);
		noRemovido.setProximo(null);

		tamanho--;
		return;
	}

	public void removeFim() {
		if (tamanho == 0) {
			System.out.println("lista vazia");
			return;
		}
		NoDuplo noRemovido = trailer.getAnterior();
		trailer.setAnterior(noRemovido.getAnterior());
		trailer.getAnterior().setProximo(trailer);

		noRemovido.setAnterior(null);
		noRemovido.setProximo(null);

		tamanho--;
	}

	public void removePos(int pos) {
		if (pos < 1 || pos > tamanho) {
			System.out.println("posi��o inv�lida");
			return;
		}

		if (pos == 1) {
			removeInicio();
			return;
		}

		if (pos == tamanho) {
			removeFim();
			return;
		}

		NoDuplo noRemovido = header.getProximo();
		for (int i = 1; i < pos; i++)
			noRemovido = noRemovido.getProximo();

		noRemovido.getAnterior().setProximo(noRemovido.getProximo());
		noRemovido.getProximo().setAnterior(noRemovido.getAnterior());

		noRemovido.setAnterior(null);
		noRemovido.setProximo(null);
		tamanho--;
	}

	public void ordenarLista() {
		NoDuplo atual = header.getProximo();
		NoDuplo prox = atual.getProximo();

		for (int i = 0; i < tamanho - 1; i++) {

			for (int j = i + 1; j < tamanho; j++) {
				if (atual.getElemento() > prox.getElemento()) {
					Integer Temp = atual.getElemento(); // Temp = x
					atual.setElemento(prox.getElemento()); // x = y
					prox.setElemento(Temp); // y = temp
				}
				prox = prox.getProximo();
			}
			atual = atual.getProximo();
			prox = atual.getProximo();

		}

	}

	public void insereOrdenado(Integer valor) {
		NoDuplo novo = new NoDuplo(valor, null, null);
		insereInicio(novo);
		ordenarLista();

	}

	public void procuraNumer(int pos) {
		NoDuplo aux = header.getProximo();

		if (pos < 0 || pos > tamanho) {
			System.out.println("Não pode fazer isso");
		} else {
			for (int i = 1; i < pos; i++) {
				aux = aux.getProximo();
			}

			System.out.println("O Numero pesquisado é: " + aux.getElemento());
		}

	}

	public void verificarIgual(ListaDuplamenteEncadeada l1, ListaDuplamenteEncadeada l2) {
		NoDuplo aux = l1.header.getProximo();
		NoDuplo aux2 = l2.header.getProximo();

		if (l1.tamanho != l2.tamanho) {
			System.out.println("Listas Diferentes");
			return;
		}
		for (int i = 0; i < l1.tamanho; i++) {
			if (aux.getElemento() != aux2.getElemento()) {
				System.out.println("Lista Diferentes");
				return;
			}

			aux = aux.getProximo();
			aux2 = aux2.getProximo();

		}
		System.out.println("Lista Iguais");
	}

	public void imprimeLista() {
		if (tamanho == 0) {
			System.out.println("lista vazia");
		}
		NoDuplo aux = header.getProximo();
		System.out.println("------------- LISTA ATUAL -----------");
		for (int i = 0; i < tamanho; i++) {
			System.out.print(" -> " + aux.getElemento() + "\t");
			aux = aux.getProximo();
		}
		System.out.println("Tamanho da Lista: " + tamanho);
		System.out.println();
	}
}
