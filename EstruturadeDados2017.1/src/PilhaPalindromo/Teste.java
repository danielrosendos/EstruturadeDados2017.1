package PilhaPalindromo;

public class Teste {
	public static void main(String[] args) {
		PilhaPalindromo pilha = new PilhaPalindromo();
		
		pilha.insereTopo(new No("SATOR AREPO TENET OPERA ROTAS",null));
		
		pilha.imprimePilha();
		
		pilha.EhPal();
	}
}
