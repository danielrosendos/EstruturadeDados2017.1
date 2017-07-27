package PilhaVetor;

public class TestePilhaVetor {
	public static void main(String[] args) {
		PilhaImpl pilha = new PilhaImpl();

		pilha.insereTopo(10);
		pilha.insereTopo(12);
		pilha.insereTopo(14);

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
