package questao04Lista02;

public class Vetor {

	public static final int TAM_VETOR = 10;
	public static int[] vetor = new int[TAM_VETOR];

	public static void main(String[] args) {
		for (int i = 0; i < TAM_VETOR; i++) {
			vetor[i] = i;
		}

		for (int i = 0; i < TAM_VETOR; i++) {
			if (i % 2 != 0 && i != 9) {
				int aux = vetor[i];
				vetor[i] = vetor[i + 1];
				vetor[i + 1] = aux;
			} else if (i == 9) {
				int aux = vetor[0];
				vetor[0] = vetor[9];
				vetor[9] = aux;
			}
		}

		for (int i = 0; i < TAM_VETOR; i++) {
			System.out.println(vetor[i]);
		}

	}

}