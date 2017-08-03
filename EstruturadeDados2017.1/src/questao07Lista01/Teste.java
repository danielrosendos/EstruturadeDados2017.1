package questao07Lista01;

public class Teste {
	public static void main(String[] args) {

		ListaSimplementeEncadeada lista = new ListaSimplementeEncadeada();
		
		lista.insereInicio(7);
		lista.imprimeLista();
		lista.insereInicio(24);
		lista.imprimeLista();
		lista.insereInicio(35);
		lista.imprimeLista();
		lista.insereFinal(100);
		lista.imprimeLista();
		lista.insereFinal(124);
		lista.imprimeLista();
		lista.inserePosicao(2, 25);
		lista.imprimeLista();
		lista.inserePosicao(5, 66);
		lista.inserePosicao(5, 66);
		lista.imprimeLista();
		lista.removeFinal();
		lista.imprimeLista();
		lista.removeInicio();
		lista.imprimeLista();
		lista.removePosicao(3);
		lista.imprimeLista();
		lista.removeNumero(66);
		lista.imprimeLista();
		lista.removeNumero(7);
		lista.imprimeLista();
	}
}
