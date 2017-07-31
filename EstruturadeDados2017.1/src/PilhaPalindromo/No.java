package PilhaPalindromo;

public class No {
	private String nome;

	private No proximo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	public No(String nome, No proximo) {
		this.nome = nome;
		this.proximo = proximo;
	}
}
