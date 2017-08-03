package PilhaPalindromo;

public class PilhaPalindromo {
	public No topo;
	public String nome;

	public PilhaPalindromo() {
		topo = new No(nome, null);
		nome = null;
	}

	public String insereTopo(No novoNo) {
		novoNo.setProximo(topo);
		topo = novoNo;

		return novoNo.getNome();
	}

	public void EhPal() {
		if (VerificarPal()) {
			System.out.println("É palindromo");
		} else {
			System.out.println("Não é palindromo");
		}
	}

	public boolean VerificarPal() {
		// Recebe o nome passado
		String aux = topo.getNome();
		// Se o número de caracteres for impar, é impossível ser
		if (aux.length() % 2 != 0)
			return false;
		int i = 0; // Começando de I
		int j = aux.length() - 1; // Percorrendo o inverso de I
		while (i < aux.length() / 2) {
			// charAt = pega o caractere na posição informada
			char v1 = aux.charAt(i);
			char v2 = aux.charAt(j);
			// Se alguma variável for diferente
			if (v1 != v2) {
				return false;
			}
			// Altera os valores dos iteretors
			i++;
			j--;
		}
		return true;
	}

	public void imprimePilha() {
		No aux = topo;

		while (aux.getProximo() != null) {
			System.out.print(aux.getNome());
			aux = aux.getProximo();
		}

		System.out.println();
	}
}
