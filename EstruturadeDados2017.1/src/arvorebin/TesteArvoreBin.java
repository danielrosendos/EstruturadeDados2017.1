package arvorebin;

public class TesteArvoreBin {

	public static void main(String[] args) {
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>();
		
		NoArvoreBin<Integer> noRaiz = arvore.inserirRaiz(50);
		
		NoArvoreBin<Integer> no01 = arvore.inserirDir(noRaiz, 60);
		NoArvoreBin<Integer> no02 = arvore.inserirEsq(noRaiz, 40);
		
		NoArvoreBin<Integer> no03 = arvore.inserirDir(no01, 70);
		NoArvoreBin<Integer> no04 = arvore.inserirEsq(no01, 55);
		
		//arvore.imprimirPosFixado();
		
		//arvore.imprimirInterFixado();
		
		//arvore.imprimirPrefixado();
		
		System.out.println(arvore.profundidadeRecursiva(no04));
		System.out.println(arvore.profundidadeIterativa(no04));
		
	}

}
