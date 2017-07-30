package PilhaSimplesEncadeada;

public class Teste {
	public static void main(String[] args) {
		PilhaSimplesEncadeada pilha = new PilhaSimplesEncadeada();
		
		pilha.insereTopo(new No(10, null));
		pilha.insereTopo(new No(15, null));
		pilha.insereTopo(new No(20, null));
		pilha.imprimePilha();
		
		pilha.insereTopo(new No(25, null));
		pilha.imprimePilha();
		
		pilha.insereTopo(new No(30, null));
		pilha.imprimePilha();
		
		pilha.removeTopo();
		pilha.imprimePilha();
		
		pilha.removeTopo();
		pilha.imprimePilha();
		
		pilha.removeTopo();
		pilha.imprimePilha();
		
		pilha.removeTopo();
		pilha.imprimePilha();
		
		pilha.removeTopo();
		pilha.imprimePilha();
		
		pilha.removeTopo();
		pilha.imprimePilha();
	}
}
