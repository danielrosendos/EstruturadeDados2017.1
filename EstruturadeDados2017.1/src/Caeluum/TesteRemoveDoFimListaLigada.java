package Caeluum;

public class TesteRemoveDoFimListaLigada {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		
		lista.removeDoFim();
		
		System.out.println(lista);

	}

}
