package Caeluum;

public class TesteAdicionaNoComecoListaLigada {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adicionaNoComeco("Rafael");
		lista.adicionaNoComeco("Paulo");
		
		System.out.println(lista);
	}

}
