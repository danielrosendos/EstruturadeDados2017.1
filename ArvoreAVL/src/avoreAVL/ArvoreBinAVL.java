package avoreAVL;

public class ArvoreBinAVL {

	public NoAVL raiz;
	public NoAVL desbalanceada = null;

	public ArvoreBinAVL() {
		raiz = null;
	}

	// Insere um nó raiz na arvore vazia
	public NoAVL inserirRaiz(NoAVL no) {
		if (raiz != null)
			throw new IllegalStateException("A arvore ja tem raiz");
		raiz = no;
		return raiz;
	}

	// Insere um filho a esquerda do pai
	public NoAVL inserirEsquerda(NoAVL pai, NoAVL no) {
		if (pai.esq != null)
			throw new IllegalStateException("Este no ja tem filho a esquerda");
		no.pai = pai;
		pai.esq = no;
		return no;
	}

	// insere um filho a direita do pai
	public NoAVL inserirDireita(NoAVL pai, NoAVL no) {
		if (pai.dir != null)
			throw new IllegalStateException("Este no já tem filho a direita");
		no.pai = pai;
		pai.dir = no;
		return no;
	}

	public NoAVL inserir(NoAVL no) {
		if (raiz == null)
			return inserirRaiz(no);
		NoAVL aux = verifica(no, raiz); // aux recebe o pai do no a ser inserido

		if (no.valor > aux.valor) {
			NoAVL bkp = inserirDireita(aux, no); // insere a direita do pai
			atualizaFatb(no);

			balanceia(desbalanceada);
			atualizarFolha(raiz);

			return bkp;
		}

		else if (no.valor < aux.valor) {
			NoAVL bkp = inserirEsquerda(aux, no);
			atualizaFatb(no);

			balanceia(desbalanceada);
			atualizarFolha(raiz);
			return bkp;
		}

		return null;
	}

	// retorna o primeiro desbalanceado de baixo para cima
	public NoAVL desbalanced(NoAVL desbalanceada) {
		NoAVL aux = desbalanceada;

		if (aux != null) {
			if (aux.fatb == 2 || desbalanceada.fatb == -2)
				return aux;
			aux = aux.pai;
			desbalanced(aux);
		}

		return null;
	}

	// Verifica e retorna o pai do novo no
	public NoAVL verifica(NoAVL v, NoAVL r) {
		NoAVL aux = r;

		if (v.valor > aux.valor) {
			if (aux.dir == null) {
				return aux;
			} else {
				aux = aux.dir;
				return verifica(v, aux);
			}
		} else {
			if (aux.esq == null) {
				return aux;
			} else {
				aux = aux.esq;
				return verifica(v, aux);
			}
		}
	}

	public void atualizaFatb(NoAVL no) {
		if (no.esq == null && no.dir == null)
			no.fatb = 0;
		if (no.esq == null && no.dir != null)
			no.fatb = 0 - (altura(no.dir) + 1);
		if (no.esq != null && no.dir == null)
			no.fatb = (altura(no.esq) + 1) - 0;
		if (no.esq != null && no.dir != null)
			no.fatb = (altura(no.dir) + 1) - (altura(no.esq) + 1);
		desbalanceada = desbalanced(no);
		if (desbalanceada != null)
			return;
		if (no.pai != null) {
			atualizaFatb(no.pai);
		}
	}

	public void balanceia(NoAVL v) {
		if (v == null)
			return;
		if (v.fatb == 2) {
			if (v.esq.fatb == -1) {
				desbalanceada = null;
				RL(v);
			} else {
				desbalanceada = null;
				ll(v);
			}
		} else if (v.fatb == -2) {
			if (v.dir.fatb == 1) {
				desbalanceada = null;
				LR(v);
			} else {
				desbalanceada = null;
				rr(v);
			}
		}
	}

	public void atualizarFolha(NoAVL atualizar) {
		if (atualizar != null) {
			if (atualizar.dir == null && atualizar.esq == null) {
				atualizaFatb(atualizar);
			}
			atualizarFolha(atualizar.esq);
			atualizarFolha(atualizar.dir);
		}
	}

	public void remove(NoAVL remocao) {
		if (raiz == null)
			return;
		remove(raiz, remocao);
	}

	public NoAVL remove(NoAVL remocao, NoAVL no) {
		if (remocao == no) {
			if (remocao.esq == remocao.dir) {
				no = null;
			} else if (remocao.esq == null) {
				NoAVL aux = remocao.dir;
				aux.pai = remocao.pai;
				if (remocao == remocao.pai.dir)
					remocao.pai.dir = aux;
				else
					remocao.pai.esq = aux;
				remocao.dir = null;
				remocao.pai = null;
			} else if (remocao.dir == null) {
				NoAVL aux = remocao.esq;
				aux.pai = remocao.pai;
				if (remocao == remocao.pai.esq)
					remocao.pai.esq = aux;
				else
					remocao.pai.dir = aux;
			} else {
				NoAVL aux = no.esq;

				while (aux.dir != null)
					aux = aux.dir;

				if (aux != no.esq) {
					aux.pai.dir = null;
					aux.esq = no.esq;
				}

				aux.pai = no.pai;
				aux.dir = no.dir;

				if (no.pai == null)
					raiz = aux;
				else {
					if (no == no.pai.dir)
						no.pai.dir = aux;
					else
						no.pai.esq = aux;
				}

				if (aux.esq != null)
					aux.esq.pai = aux;

				no.esq = null;
				no.dir = null;
				no.pai = null;
			}
		}

		else if (remocao.valor > no.valor)
			remove(remocao.esq, no);
		else
			remove(remocao.dir, no);

		atualizaFatb(no);
		balanceia(desbalanceada);
		atualizarFolha(raiz);

		return no;
	}

	public NoAVL rr(NoAVL y) {
		NoAVL x = y.dir;

		y.dir = x.esq;

		if (y.dir != null)
			y.dir.pai = y;

		x.pai = y.pai;
		if (y.pai != null) {
			if (y == y.pai.esq)
				y.pai.esq = x;
			else if (y == y.pai.dir)
				y.pai.dir = x;
		}

		x.esq = y;
		y.pai = x;

		if (y == raiz)
			raiz = x;

		return x;
	}

	public NoAVL ll(NoAVL y) {
		NoAVL x = y.esq;

		y.esq = x.dir;

		if (y.esq != null)
			y.esq.pai = y;

		x.pai = y.pai;
		if (y.pai != null) {
			if (y == y.pai.esq)
				y.pai.esq = x;
			else if (y == y.pai.dir)
				y.pai.dir = x;
		}

		x.dir = y;
		y.pai = x;

		if (y == raiz)
			raiz = x;

		return x;
	}

	public NoAVL RL(NoAVL y) {
		y.esq = rr(y.esq);
		return ll(y);
	}

	public NoAVL LR(NoAVL y) {
		y.dir = ll(y.dir);
		return rr(y);
	}

	public int profundidadeRecursiva(NoAVL no) {
		if (no == null)
			return 0;
		if (no == raiz) {
			return 0;
		} else {
			return profundidadeRecursiva(no.pai) + 1;
		}
	}

	public int profundidadeIterativa(NoAVL no) {
		int profundidade = 0;

		while (no.pai != null) {
			profundidade++;
			no = no.pai;
		}
		return profundidade;
	}

	int maior(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	public int altura(NoAVL no) {
		if(no == null || (no.esq == null && no.dir == null)) {
			return 0;
		}else {
			return 1 + maior(altura(no.esq), altura(no.dir));
		}
		
	}
	
	public void imprimirPrefixado() {
		imprimirPrefixado2(raiz);
	}
	
	public void imprimirPrefixado2(NoAVL no) {
		if (no != null) {
			System.out.println(no.valor + "\t");
			imprimirPrefixado2(no.esq);
			imprimirPrefixado2(no.dir);
		}
	}

}
