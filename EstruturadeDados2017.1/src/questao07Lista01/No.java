package questao07Lista01;

public class No {
	private Integer elemento;
	private No proximo;
	
	public No(Integer elemento, No proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}
	
	public Integer getElemento() {
		return elemento;
	}
	public void setElemento(Integer elemento) {
		this.elemento = elemento;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	
}
