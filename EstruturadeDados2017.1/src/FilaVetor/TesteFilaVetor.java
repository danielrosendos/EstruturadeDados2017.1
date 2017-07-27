package FilaVetor;
public class TesteFilaVetor {

	public static void main(String[] args) {
		
		Fila fila = new FilaImpl();
		
		System.out.println("Valor removido: " + fila.removeInicio());
		
		fila.insereFinal(10);
		fila.insereFinal(12);
		fila.insereFinal(13);
		
		fila.imprimeFila();
		
		System.out.println("Valor removido: " + fila.removeInicio());
		fila.imprimeFila();
		
		System.out.println("Valor removido: " + fila.removeInicio());
		fila.imprimeFila();
		System.out.println("Valor removido: " + fila.removeInicio());
		fila.imprimeFila();
		
		System.out.println("Valor removido: " + fila.removeInicio());
		fila.imprimeFila();
		
//		System.out.println("+++++++++++++++++++++++++");
//		fila.insereFinal(15);
//		fila.insereFinal(19);
//		fila.imprimeFila();
//		
//		fila.insereFinal(21);
		
		
		
	}
	
}
