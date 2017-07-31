package ListaVetor;

public class ListaVetorImpl<E> implements Lista<E> {

	public static final int TAM_LISTA = 5;
	public E[] lista;
	public E elRemovido;
	public int count = 0;

	@SuppressWarnings("unchecked")
	public ListaVetorImpl() {
		lista = (E[]) new Object[TAM_LISTA];
	}

	@Override
	public E set(int pos, E e) {

		lista[pos] = e;

		return null;
	}

	@Override
	public void addPrimeiro(E e) {

		if (lista[0] == null) {
			lista[0] = e;
		} else {
			for (int i = TAM_LISTA - 1; i > 0; i--) {
				lista[i] = lista[i - 1];
			}
			lista[0] = e;
		}

	}

	@Override
	public void addUltimo(E e) {

		if (lista[TAM_LISTA - 1] == null) {
			lista[TAM_LISTA - 1] = e;
		} else {
			for (int i = 0; i < TAM_LISTA - 1; i++) {
				lista[i] = lista[i + 1];
			}
			lista[TAM_LISTA - 1] = e;
		}

	}

	@Override
	public void addAntes(int pos, E e) {

		if (listaCheia()) {
			lista[pos - 1] = e;
		} else if (lista[pos - 1] == null) {
			lista[pos - 1] = e;
		} else {
			for (int i = TAM_LISTA - 1; i > pos; i--) {
				lista[i] = lista[i - 1];
			}
			lista[pos - 1] = e;
		}

	}

	@Override
	public void addDepois(int pos, E e) {

		if (listaCheia()) {
			lista[pos + 1] = e;
		} else if (lista[pos + 1] == null) {
			lista[pos + 1] = e;
		} else {
			for (int i = TAM_LISTA - 1; i > pos + 1; i--) {
				lista[i] = lista[i - 1];
			}
			lista[pos + 1] = e;
		}

	}

	@Override
	public void removeNumber(E e) {
		for (int i = 0; i < TAM_LISTA; i++) {
			if (lista[i] == e || lista[i].equals(e)) {
				elRemovido = e;
				lista[i] = null;
				break;
			}
		}
	}

	@Override
	public void remove(int pos) {
		elRemovido = lista[pos];
		lista[pos] = null;
	}

	@Override
	public E first(int pos) {

		if (lista[0] != null) {
			return lista[0];
		}

		return null;
	}
	
	@Override
	public E last(int pos) {
		if (lista[TAM_LISTA - 1] != null) {
			return lista[TAM_LISTA - 1];
		}

		return null;
	}
	
	@Override
	public E anterior(int pos) {
		if (lista[pos - 1] != null) {
			return lista[pos - 1];
		}

		return null;
	}

	@Override
	public E posterior(int pos) {

		if (lista[pos + 1] != null) {
			return lista[pos + 1];
		}

		return null;
	}

	public boolean listaCheia() {
		for (int i = 0; i < TAM_LISTA; i++) {
			if (lista[i] != null) {
				count++;
			}
		}
		
		if(count==5) {
			return true;
		}
		
		return false;
	}

	public void imprimeLista() {
		for (int i = 0; i < lista.length; i++) {
			System.out.print("Elemento: " + lista[i] + " ");
		}
		System.out.println();
	}

}
