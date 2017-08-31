package recursividade;

public class recursividadeprincipal {

		//Questao 1
		public static int fat(int fi){
			if(fi==0 || fi==1){
				return 1; //se for 0 ou 1 me retorna 1 como fibro ocorre
			}else{
				return fat(fi-1)*fi; //caso não faz a recursão de fibo
			}
		}
		
		//Questao 2
		public static int fibo(int posicao){
			int aux1=posicao-1;
			int aux2=posicao-2;
			if(posicao <= 1){
				return posicao;
			}else{
				return fibo(aux1)+fibo(aux2);
			}	
		}
		
		//metodo para imprimir fibonacci
		public static void imprimeFibo(int posicao){
			for(int i=1; i<=posicao; i++){
				System.out.println("["+i+"]"+fibo(i));
			}
		}
		
		//Questao 3 procurar o maior
		public static int maior(int[] lista, int i, int n){
			if( i == (n-1)){
				return lista[i];
			}else{
				int aux1=lista[i];
				int aux2=maior(lista, i+1, n);
				if(aux1 > aux2){
				return aux1;
				}else{
					return aux2;
				}
			}
		}
		public static void main(String[] args) {
			//Teste questao 1
			System.out.println("Questão 1");
			System.out.println(fat(4));
			
			//Teste questao 2
			System.out.println("Questão 2");
			imprimeFibo(10);
			
			//Teste questao 3
			System.out.println("Questão 3");
			int[] lista={15 ,20 ,10, 89};
			System.out.println(maior(lista, 0, lista.length));
			
			//Teste questao 4
			System.out.println("Questão 4:");
			ListaSimpEnca fila = new ListaSimpEnca();
			
			fila.insereFinal(new No(0, null));
			fila.insereFinal(new No(1, null));
			fila.insereFinal(new No(2, null));
			fila.insereFinal(new No(3, null));
			fila.insereFinal(new No(4, null));
			fila.imprimeLista();
			System.out.println(fila.contaLista(fila.getCabeca()));

		}
	
}
