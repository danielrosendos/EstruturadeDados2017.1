package ListaDuplamenteEncadeada;

public class Teste {
	public static void main(String[] args) {

		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

		NoDuplo n1 = new NoDuplo(10, null, null);
		NoDuplo n2 = new NoDuplo(9, null, null);
		NoDuplo n3 = new NoDuplo(8, null, null);
		NoDuplo n4 = new NoDuplo(7, null, null);
		NoDuplo n5 = new NoDuplo(6, null, null);

		lista.insereInicio(n4);
		lista.insereFinal(n1);
		lista.insereFinal(n5);
		lista.insereFinal(n2);

		lista.imprimeLista();

		lista.ordenarLista();

		lista.imprimeLista();
		
		lista.removePos(2);
		
		lista.imprimeLista();
		
		lista.procuraNumer(1);
		lista.procuraNumer(2);
		lista.procuraNumer(3);
		lista.procuraNumer(4);
		
		lista.removePos(1);
		lista.removePos(1);
		
		lista.imprimeLista();
		
		lista.removeFim();
		
		lista.imprimeLista();
		

	}
}