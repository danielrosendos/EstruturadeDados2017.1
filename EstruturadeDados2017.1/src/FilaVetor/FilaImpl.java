package FilaVetor;

public class FilaImpl implements Fila {

	public static final int TAM_FILA = 5;
	
	public Integer[] fila;
	
	//Ponteiro para apontar para o proximo elemento
	public Integer pos = -1; 
	
	public FilaImpl() {
		
		fila = new Integer[TAM_FILA];
	}
	
	
	
	@Override
	public Integer insereFinal(Integer valor) {
		
		if(filaCheia()){
			return null;
		}
		
		fila[++pos] = valor;
		
		return valor;
	}

	@Override
	public Integer removeInicio() {
		
		//Verifica se ha posicoes para remover
		if(filaVazia()){
			return null;
		}
		
		Integer elementoRemovido = fila[0];
		
		for (int i = 0; i <= pos; i++) {
			
			fila[i] = fila[i + 1];
		}
		pos--;
		
		return elementoRemovido;
	}

	@Override
	public boolean filaCheia() {
		
		if(pos == TAM_FILA -1){
			System.out.println("Fila cheia!");
			return true;
		}
		
		return false;
	}

	@Override
	public boolean filaVazia() {
		
		if(pos == -1){
			System.out.println("Fila vazia");
			return true;
		}
		return false;
	}

	//@Override
	public void imprimeFila() {
		
		for (int i = 0; i < fila.length; i++) {
			System.out.println("Elemento[" + i + "]: " + fila[i]);
		}

	}

}
