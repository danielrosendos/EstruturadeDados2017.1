package questao08Lista01;

public class TesteRanking {

	public static void main(String[] args) {
		Ranking ranking = new Ranking();
		
		PontuacaoJogador j1 = new PontuacaoJogador("joao", 10);
		PontuacaoJogador j2 = new PontuacaoJogador("pedro", 20);
		PontuacaoJogador j3 = new PontuacaoJogador("Maria", 30);
		PontuacaoJogador j4 = new PontuacaoJogador("joana", 40);
		PontuacaoJogador j5 = new PontuacaoJogador("gui", 50);
		PontuacaoJogador j6 = new PontuacaoJogador("zuao", 50);
		PontuacaoJogador j7 = new PontuacaoJogador("professor", 24);
		PontuacaoJogador j8 = new PontuacaoJogador("sky", 80);
		PontuacaoJogador j9 = new PontuacaoJogador("thi", 55);
		PontuacaoJogador j10 = new PontuacaoJogador("viii", 100);
		
		ranking.addJogador(j1);
		ranking.addJogador(j2);
		ranking.addJogador(j3);
		ranking.addJogador(j4);
		ranking.addJogador(j5);
		ranking.addJogador(j6);
		ranking.addJogador(j7);
		ranking.addJogador(j8);
		ranking.addJogador(j9);
		ranking.addJogador(j10);
		
		ranking.mostraRanking();
		
		//ranking.ordena();
		
		//ranking.mostraRanking();
		

	}

}
