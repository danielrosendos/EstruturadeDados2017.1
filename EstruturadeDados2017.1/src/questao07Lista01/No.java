package questao07Lista01;

public class No {
	private Integer valor;
	private No proximo;
	
	//Getters and Setters
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	//Construtores
	public No(Integer valor, No proximo) {
		this.valor = valor;
		this.proximo = proximo;
	}
	
	public No() {
		
	}
	
	

}
