package avoreAVL;

public class NoAVL {

	public Integer valor, fatb;
	public NoAVL pai, esq, dir;

	public NoAVL(Integer valor, NoAVL pai, NoAVL dir, NoAVL esq) {
		this.valor = valor;
		this.pai = pai;
		this.esq = esq;
		this.dir = dir;
		this.fatb = 0;
	}

}
