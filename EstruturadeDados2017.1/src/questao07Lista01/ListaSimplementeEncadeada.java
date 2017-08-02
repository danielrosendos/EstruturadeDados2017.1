package questao07Lista01;

public class ListaSimplementeEncadeada {
	private Integer tamanho;
	private No header;
	
	public ListaSimplementeEncadeada() {
		tamanho = 0;
		header = null;
	}
	
	public void adicionaCabeca(No no) {
		no.setProximo(header);
		this.header = no;
		tamanho++;
	}
	
}
