package PilhaSimplesEncadeada;

public class PilhaSimplesEncadeada {
	public No topo;
	public int tamanho;

	public PilhaSimplesEncadeada() {
		topo = new No(tamanho, null);
		tamanho = 0;
	}

	public Integer insereTopo(No novoNo) {
		novoNo.setProximo(topo);
		topo = novoNo;
		tamanho++;

		return novoNo.getValor();
	}

	public Integer removeTopo() {
		if (tamanho == 0) {
			System.out.println("Não há elementos para remoção");
			return null;
		}

		No noRemovido = topo;

		topo = topo.getProximo();

		noRemovido.setProximo(null);
		tamanho--;

		return noRemovido.getValor();
	}
	
	public void imprimePilha() {
		
		No aux = topo;
		
		while(aux.getProximo() != null) {
			System.out.print(aux.getValor() + "-->");
			aux = aux.getProximo();
		}
		System.out.println();
	}
}
