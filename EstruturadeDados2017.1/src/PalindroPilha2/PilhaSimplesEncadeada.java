package PalindroPilha2;

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
	
	public void verificarPalindromo(PilhaSimplesEncadeada p1) {
		No aux = p1.topo;
		PilhaSimplesEncadeada p2 = new PilhaSimplesEncadeada();
		while(aux.getProximo() != null) {
			p2.insereTopo(aux);
			aux = aux.getProximo();
		}
		
		No aux1 = p1.topo;
		No aux2 = p2.topo;
		for(int i = 0; i < p1.tamanho; i++) {
			if(aux1.getValor() != aux2.getValor()) {
				System.out.println("Não é palindromo");
				return;
			}
			aux1 = aux1.getProximo();
			aux2 = aux2.getProximo();
		}
		System.out.println("é palindromo");
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
