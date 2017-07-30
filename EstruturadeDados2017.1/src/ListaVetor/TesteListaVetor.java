package ListaVetor;

public class TesteListaVetor {

	public static void main(String[] args) {
		ListaVetorImpl<Integer> lista = new ListaVetorImpl<Integer>();
		
		lista.addPrimeiro(10);
		lista.addPrimeiro(12);
		lista.addPrimeiro(13);
		
		lista.imprimeLista();
		
		lista.addUltimo(14);
		lista.addUltimo(15);
		
		lista.imprimeLista();
		
		lista.set(1, 20);
		lista.imprimeLista();
		
		lista.addAntes(2, 30);
		lista.imprimeLista();
		
		lista.removeNumber(30);
		lista.imprimeLista();
		
	}

}
