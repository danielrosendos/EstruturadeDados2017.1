package questao05Lista01;

public class questao05Lista01 {
	/**
	 * Operação			  Saída			Fila
	 * enqueue(5)			-			(5)
	 * enqueue(3) 			-			(5,3)
	 * dequeue()			5			(3)
	 * enqueue(2)			-			(3,2)
	 * enqueue(8)			- 			(3,2,8)
	 * dequeue()			3			(2,8)
	 * dequeue()			2			(8)
	 * enqueue(9)			-			(8,9)
	 * enqueue(1)			-			(8,9,1)
	 * dequeue()			8			(9,1)
	 * enqueue(7)			-			(9,1,7)
	 * enqueue(6)			-			(9,1,7,6)
	 * dequeue()			9			(1,7,6)
	 * dequeue()			1			(7,6)
	 * enqueue(4)			-			(7,6,4)
	 * dequeue()			7			(6,4)
	 * dequeue()			6			(4)
	 * 
	 * Fila basta lembrar da fila de um banco vai chegando as pessoas
	 * formando uma fila (se formando um parado atras do outro) ao
	 * decorrer que é chamado pelos guiches o primero da fila sai
	 * então a priore o primeiro que chega na fila é o primeiro que sai
	 * (primeiro a ser chamado pelo guiche)
	 */
}
