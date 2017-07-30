package ListaVetor;

public class ListaVetorImpl<E> implements Lista<E> {

	public static final int TAM_LISTA = 5;
	public int pos = -1;
	public E[] lista;

	public ListaVetorImpl() {
		lista = (E[]) new Object[TAM_LISTA];
	}

	@Override
	public E set(int pos, E e) {

		lista[pos] = e;

		return e;
	}

	@Override
	public void addPrimeiro(E e) {

		for (Integer i = TAM_LISTA - 1; i > 0; i--) {
			lista[i] = lista[i - 1];
		}
		lista[0] = e;

	}

	@Override
	public void addUltimo(E e) {

		for (Integer i = 0; i < TAM_LISTA - 1; i++) {
			lista[i] = lista[i + 1];
		}
		lista[TAM_LISTA - 1] = e;

	}

	@Override
	public void addAntes(int pos, E e) {

		if (pos < 0) {
			System.out.println("Voce não pode fazer isto");
		}

		for (int i = TAM_LISTA - 1; i >= pos; i--) {
			lista[i] = lista[i - 1];
		}
		lista[pos - 1] = e;

	}

	@Override
	public void addDepois(int pos, E e) {
		if (pos > TAM_LISTA) {
			System.out.println("Você não pode fazer isto");
		}

		for (int i = 0; i <= pos; i++) {
			lista[i] = lista[i + 1];
		}

		lista[pos + 1] = e;
	}

	@Override
	public void remove(E e) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Entrei no FOR");
			if (lista[i].equals(e)) {
				lista[i] = null;
			}
		}
	}

	@Override
	public void remove(int pos) {
		lista[pos] = null;
	}

	@Override
	public E first(int pos) {

		return null;
	}

	@Override
	public E posterior(int pos) {

		return null;
	}

	public void imprimeLista() {
		for (int i = 0; i < lista.length; i++) {
			System.out.print("Elemento: " + lista[i] + " ");
		}
		System.out.println();
	}

}
