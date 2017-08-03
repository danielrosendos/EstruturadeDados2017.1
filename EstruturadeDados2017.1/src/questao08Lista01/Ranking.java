package questao08Lista01;

public class Ranking {
	public static final int TAM = 10;
	public int pos = -1;
	PontuacaoJogador[] ranking;
	public Ranking() {
		ranking = new PontuacaoJogador[TAM];
	}
	
	public void addJogador(PontuacaoJogador j) {
		ranking[++pos] = j;
	}
	
	public void ordena() {
		PontuacaoJogador aux;
		for(int i = 0; i<TAM-1; i++) {
			for(int j = i+1; j <TAM; j++) {
				if (ranking[i].getPontuacao() < ranking[j].getPontuacao()) {
					aux = ranking[i];
					ranking[i] = ranking[j];
					ranking[j] = aux;
				}
			}
		}
	}
	
	public void mostraRanking() {
		for(int i=0; i<TAM; i++) {
			System.out.println("Colocacao["+ i +"]: "+ "Jogador " +ranking[i].getNome()+ " " +ranking[i].getPontuacao());
		}
		System.out.println("\n");
	}

}
