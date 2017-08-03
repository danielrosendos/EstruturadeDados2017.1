package questao08Lista01;

public class PontuacaoJogador {
	private String nome;
	private int pontuacao;
	public PontuacaoJogador(String nome, int pontuacao) {
		this.nome = nome;
		this.pontuacao = pontuacao;
	}
	public int getPontuacao() {
		return this.pontuacao;
	}
	public String getNome() {
		return this.nome;
	}
}
