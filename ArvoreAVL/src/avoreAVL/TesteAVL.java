package avoreAVL;

public class TesteAVL {
	public static void main(String[] args) {
		ArvoreBinAVL arvora = new ArvoreBinAVL();
		
		arvora.inserir(new NoAVL(50, null, null, null));
		arvora.inserir(new NoAVL(60, null, null, null));
		arvora.inserir(new NoAVL(40, null, null, null));
		arvora.inserir(new NoAVL(30, null, null, null));
		
		
		
		arvora.imprimirPrefixado();
	}
	
}
