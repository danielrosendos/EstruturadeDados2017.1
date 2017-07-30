package ListaVetor;

public class TesteListaVetor {

	public static void main(String[] args) {
		ListaVetorImpl<String> lista = new ListaVetorImpl<String>();
		
		lista.addPrimeiro("10");
		lista.addPrimeiro("12");
		lista.addPrimeiro("13");
		
		lista.imprimeLista();
		
		lista.addUltimo("14");
		lista.addUltimo("15");
		
		lista.imprimeLista();
		
		lista.set(1, "20");
		lista.imprimeLista();
		
		lista.addAntes(2, "30");
		lista.imprimeLista();
		
		lista.remove("20");
		lista.imprimeLista();
		
	}

}
