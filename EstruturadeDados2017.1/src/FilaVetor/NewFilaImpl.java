package FilaVetor;

public class NewFilaImpl<E> implements NewFila<E> {

	public static final int TAM_FILA = 5;
	public E[] fila;
	// ponteiro para apontar para o proximo elemento
	public Integer pos = -1;

	public NewFilaImpl() {
		fila = (E[]) new Integer[TAM_FILA];
	}

	@Override
	public E insereFinal(E valor) {
		if (filaCheia()) {
			return null;
		}

		fila[++pos] = valor;

		return valor;

	}

	@Override
	public E removeInicio() {
		// Verifica se ha posições para remover
		if (filaVazia()) {
			return null;
		}

		E elementoRemovido = fila[0];

		for (int i = 0; i <= pos; i++) {
			fila[i] = fila[i + 1];
		}

		pos--;

		return elementoRemovido;
	}

	@Override
	public boolean filaCheia() {
		if (pos == TAM_FILA - 1) {
			System.out.println("Fila Cheia!");
			return true;
		}
		return false;
	}

	@Override
	public boolean filaVazia() {
		if (pos == 1) {
			System.out.println("Fila Vazia");
			return true;
		}
		return false;
	}

	@Override
	public void ImprimeFila() {

		for (int i = 0; i < fila.length; i++) {
			System.out.println("Elemento[" + i + "]: " + fila[i]);
		}

	}

}
