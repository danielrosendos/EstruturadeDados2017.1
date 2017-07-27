package FilaVetor;

public class Teste {

	public static void main(String[] args) {
		NewFila<Integer> fila = new NewFilaImpl<Integer>();
		
		System.out.println("Valor removido: " + fila.removeInicio());
		
		fila.insereFinal(10);
		fila.insereFinal(12);
		fila.insereFinal(14);
		
		fila.ImprimeFila();
		
		System.out.println("Valor removido: " + fila.removeInicio());
		fila.ImprimeFila();
		
		System.out.println("Valor removido: " + fila.removeInicio());
		fila.ImprimeFila();
		
		System.out.println("Valor removido: " + fila.removeInicio());
		fila.ImprimeFila();
		
		System.out.println("Valor removido: " + fila.removeInicio());
		fila.ImprimeFila();
		
	}

}
