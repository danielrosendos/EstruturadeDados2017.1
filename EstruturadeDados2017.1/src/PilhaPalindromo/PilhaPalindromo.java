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
		if(VerificarPal()) {
			System.out.println("É palindromo");
		}else {
			System.out.println("Não é palindromo");
		}
	}

	public boolean VerificarPal() {
		boolean ok = false;
		String aux = topo.getNome();
		int i = 0;
		int j = aux.length() - 1;
		while (i < aux.length() && j >= 0) {
			char c = aux.charAt(i);
			char d = aux.charAt(j);
			if(c == d) {
				ok = true;
			}
			i++;
			j--;
		}
		return ok;
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
