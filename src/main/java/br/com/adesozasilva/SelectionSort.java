package br.com.adesozasilva;

import br.com.adesozasilva.model.Produto;

public class SelectionSort {
	
	private Produto[] produtos;

	public SelectionSort(Produto[] produtos) {
		this.produtos = produtos;
	}


	public void ordena() {
		for (int atual = 0; atual < produtos.length -1; atual++) {
			int menor = buscaMenor(produtos, atual, produtos.length);
			
			 Produto produtoAtual = produtos[atual];
	         Produto produtoMenor = produtos[menor];
	         
	         produtos[atual] = produtoMenor;
	         produtos[menor] = produtoAtual;

		}
	}
	
	private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
		int maisBarato = inicio;
		for (int atual = inicio; atual < termino; atual++) {
			if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = atual;
			}
			
		}
		return maisBarato;
	}

}
