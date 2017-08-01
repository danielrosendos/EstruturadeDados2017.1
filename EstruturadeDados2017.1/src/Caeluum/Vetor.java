package Caeluum;

public class Vetor {
	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;

	public void adiciona(Aluno aluno) {
		this.garantaEspaco();
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}

	public void adiciona(int posicao, Aluno aluno) throws IllegalAccessException {
		this.garantaEspaco();
		if (!this.posicaoValida(posicao)) {
			throw new IllegalAccessException("Posicao Invalida");
		}

		for (int i = this.totalDeAlunos - 1; i >= posicao; i -= 1) {
			this.alunos[i + 1] = this.alunos[i];
		}

		this.alunos[posicao] = aluno;
		this.totalDeAlunos++;
	}

	public Aluno pega(int posicao) throws IllegalAccessException {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalAccessException("Posição Invalida");
		}
		return this.alunos[posicao];
	}

	public void remove(int posicao) throws IllegalAccessException {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalAccessException("Posição Invalida");
		}

		for (int i = posicao; i < this.totalDeAlunos - 1; i++) {
			this.alunos[i] = this.alunos[i + 1];
		}
		this.totalDeAlunos--;
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < this.totalDeAlunos; i++) {
			if (aluno.equals(this.alunos[i])) {
				return true;
			}
		}
		return false;
	}

	public int tamanho() {
		return this.totalDeAlunos;
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.alunos.length;
	}

	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalDeAlunos;
	}

	public String toString() {
		if (this.totalDeAlunos == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder();
		builder.append("[");

		for (int i = 0; i < this.totalDeAlunos - 1; i++) {
			builder.append(this.alunos[i]);
			builder.append(", ");
		}

		builder.append(this.alunos[this.totalDeAlunos - 1]);
		builder.append("]");

		return builder.toString();
	}

	private void garantaEspaco() {
		if (this.totalDeAlunos == this.alunos.length) {
			Aluno[] novoArray = new Aluno[this.alunos.length * 2];
			for(int i = 0; i < this.alunos.length; i++) {
				novoArray[i] = this.alunos[i];
			}
			this.alunos = novoArray;
		}
	}

}
