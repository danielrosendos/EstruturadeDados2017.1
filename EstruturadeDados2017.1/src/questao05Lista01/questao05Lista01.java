package questao05Lista01;

public class questao05Lista01 {
	/**
	 * Opera��o			  Sa�da			Fila
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
	 * decorrer que � chamado pelos guiches o primero da fila sai
	 * ent�o a priore o primeiro que chega na fila � o primeiro que sai
	 * (primeiro a ser chamado pelo guiche)
	 */
}
