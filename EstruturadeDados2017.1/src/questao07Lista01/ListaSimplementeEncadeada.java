package questao07Lista01;

public class ListaSimplementeEncadeada {
	private No cabeca;
	private int tam;
	
	//Construtor
	public ListaSimplementeEncadeada() {
		cabeca = new No();
		tam = 0;
	}
	
	public Integer insereInicio(Integer valor) {
		if (tam == 0) {
			cabeca.setValor(valor);
			cabeca.setProximo(null);
			tam++;
			return null;
		}
		
		No aux = new No(valor, cabeca);
		cabeca = aux;
		tam++;
		return valor;
		
	}
	
	public void insereFinal(Integer valor) {
		No aux = cabeca;
		while (aux.getProximo()!=null) {
			aux = aux.getProximo();
		}
		No fim = new No(valor, null);
		aux.setProximo(fim);
		tam++;
		
	}
	
	public Integer inserePosicao(int pos, Integer valor) {
		if (pos<=tam) {
			if (pos == 0) {
				insereInicio(valor);
				return null;
			}
			
			No aux = cabeca;
			No ant = null;
			for (int i = 0; i <pos; i++) {
				ant = aux;
				aux = aux.getProximo();
			}
			
			No novo = new No(valor, aux);
			ant.setProximo(novo);
			tam++;
			
			
			return null;
		}
		
		System.out.println("Posição inexistente!");
		
		return null;
	}
	
	public Integer removeInicio() {
		if (tam==0) {
			System.out.println("Não há elementos para remoção!");
			
			return null;
		}
	
		No noRemovido = cabeca;
		cabeca = cabeca.getProximo();
		noRemovido.setProximo(null);
		tam--;
		
		return null;
	}
	
	public Integer removeFinal() {
		if(tam == 0){
			System.out.println("Não há elementos para remoção!");
			return null;
		}
		No aux = cabeca;
		No ant = null;
		while (aux.getProximo()!=null) {
			ant = aux;
			aux = aux.getProximo();
		}
		
		No noRemovido = aux;
		ant.setProximo(null);
		tam--;
		
		return null;
		
	}
	
	public Integer removePosicao(int pos) {
		if (pos<=tam) {
			if (pos == 0) {
				removeInicio();
				return null;
			}
			
			if (pos == tam-1) {
				removeFinal();
				return null;
			}
			
			No aux = cabeca;
			No ant = null;
			for (int i = 0; i <pos; i++) {
				ant = aux;
				aux = aux.getProximo();
			}
			
			ant.setProximo(aux.getProximo());
			No noRemovido = aux;
			noRemovido.setProximo(null);
			tam--;
			
			
			return null;
		}
		
		System.out.println("Posição inexistente!");
		
		return null;
	}
	
	public void removeNumero(Integer y) {
		No aux = cabeca;
		No ant = null;
		for(int i = 0; i < tam; i++) {
			
			if(aux.getValor() == y) {
				ant.setProximo(aux.getProximo());
				No noRemovido = aux;
				noRemovido.setProximo(null);
				tam--;
				
			}
			
			ant = aux;
			aux = aux.getProximo();
			
		}
	}
	
	public void imprimeLista() {
		No aux = cabeca;
		for (int i = 0; i<tam; i++) {
			System.out.println("Valor["+i+"]: " + aux.getValor());
			aux = aux.getProximo();
		}
		System.out.println("\n");
	
	}

}
