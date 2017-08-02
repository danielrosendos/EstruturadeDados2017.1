package Caeluum;

public class ListaLigada {
	private Celula primeira;
	private Celula ultima;
	private int totalDeElementos;

	public void adiciona(Object elemento) {
		if (this.totalDeElementos == 0) {
			this.adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(this.ultima, elemento);
			this.ultima.setProximo(nova);
			this.ultima = nova;
			this.totalDeElementos++;
		}
	}

	public void adiciona(int pos, Object elemento) throws IllegalAccessException {
		if (pos == 0) {
			this.adicionaNoComeco(elemento);
		} else if (pos == this.totalDeElementos) {
			this.adiciona(elemento);
		} else {
			Celula anterior = this.pegaCelula(pos - 1);
			Celula nova = new Celula(anterior.getProximo(), elemento);
			anterior.setProximo(nova);
			this.totalDeElementos++;
		}
	}

	public Object pega(int pos) throws IllegalAccessException {
		return this.pegaCelula(pos).getElemento();
	}

	public void remove(int pos) throws IllegalAccessException {
		if (!this.posicaoOcupada(pos)) {
			throw new IllegalAccessException("Pos n existe");
		}
		if (pos == 0) {
			this.removeDoComeco();
		} else if (pos == this.totalDeElementos - 1) {
			this.removeDoFim();
		} else {
			Celula anterior = this.pegaCelula(pos - 1);
			Celula atual = anterior.getProximo();
			Celula proximo = atual.getProximo();
			
			anterior.setProximo(proximo);
			proximo.setAnterior(anterior);
			
			this.totalDeElementos--;
		}
	}

	public int tamanho() {
		return this.totalDeElementos;
	}

	public boolean contem(Object elemento) {
		Celula atual = this.primeira;
		
		while(atual != null) {
			if(atual.getElemento().equals(elemento)) {
				return true;
			}
			atual = atual.getProximo();
		}
		
		return false;
	}

	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(this.primeira, elemento);
		this.primeira = nova;
		if (this.totalDeElementos == 0) {
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = nova;
		}else {
			
		}
		this.totalDeElementos++;
	}

	public void removeDoComeco() {
		if (!this.posicaoOcupada(0)) {
			throw new IllegalArgumentException("Pos não existe");
		}
		this.primeira = this.primeira.getProximo();
		this.totalDeElementos--;

		if (this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}

	public void removeDoFim() throws IllegalAccessException {
		if (!this.posicaoOcupada(this.totalDeElementos - 1)) {
			throw new IllegalAccessException("Pos não existe");
		}
		if (this.totalDeElementos == 1) {
			this.removeDoComeco();
		} else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProximo(null);
			this.ultima = penultima;
			this.totalDeElementos--;
		}
	}

	public String toString() {
		if (this.totalDeElementos == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder("[");
		Celula atual = primeira;

		for (int i = 0; i < this.totalDeElementos - 1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProximo();
		}

		builder.append(atual.getElemento());
		builder.append("]");

		return builder.toString();
	}

	private boolean posicaoOcupada(int pos) {
		return pos >= 0 && pos < this.totalDeElementos;
	}

	private Celula pegaCelula(int pos) throws IllegalAccessException {
		if (!this.posicaoOcupada(pos)) {
			throw new IllegalAccessException("Posicação não Existe");
		}

		Celula atual = primeira;
		for (int i = 0; i < pos; i++) {
			atual = atual.getProximo();
		}

		return atual;
	}

}
