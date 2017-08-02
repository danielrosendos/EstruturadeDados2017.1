package Caeluum;

public class Celula {
	private Celula proximo;
	private Celula anterior;
	private Object elemento;
	
	public Celula(Celula proximo, Object elemento) {
		this.proximo = proximo;
		this.elemento = elemento;
	}
	
	public Celula getProximo() {
		return proximo;
	}



	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}



	public Object getElemento() {
		return elemento;
	}



	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	


}
