package FilaSimplesEncadeada;

public class Teste {
	public static void main(String[] args) {
		FilaSimplesEncadeada fila = new FilaSimplesEncadeada();
		
		fila.imprimeFila();
		fila.removeInicio();
		
		fila.insereFinal(new No(10, null));
		fila.insereFinal(new No(20, null));
		fila.insereFinal(new No(30, null));
		fila.insereFinal(new No(40, null));
		fila.insereFinal(new No(50, null));
		
		fila.imprimeFila();
		
		fila.removeInicio();
		fila.imprimeFila();
		
		fila.removeInicio();
		fila.imprimeFila();
		
		fila.removeInicio();
		fila.imprimeFila();
		
		fila.removeInicio();
		fila.imprimeFila();
		
		fila.removeInicio();
		fila.imprimeFila();
		
		fila.removeInicio();
		fila.imprimeFila();
	}
}
