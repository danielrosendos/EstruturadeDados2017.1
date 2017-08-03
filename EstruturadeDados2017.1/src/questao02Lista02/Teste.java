package questao02Lista02;

public class Teste {
	public static void main(String[] args) {

		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		ListaDuplamenteEncadeada lista2 = new ListaDuplamenteEncadeada();
		
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
		
		lista2.insereInicio(n4);
		lista2.insereFinal(n1);
		lista2.insereFinal(n5);
		lista2.insereFinal(n2);
		
		lista2.imprimeLista();
		
		lista.verificarIgual(lista, lista2);

		
	}
}