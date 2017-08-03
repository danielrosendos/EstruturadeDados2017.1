package PalindroPilha2;

public class Teste {
	public static void main(String[] args) {
		PilhaSimplesEncadeada pilha = new PilhaSimplesEncadeada();
		
		pilha.insereTopo(new No(121111, null));
		pilha.verificarPalindromo(pilha);
	}
}
