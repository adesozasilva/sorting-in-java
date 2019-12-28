package br.com.adesozasilva;

import br.com.adesozasilva.model.Produto;

public class InsertionSort {
	
	private Produto[] produtos;

	public InsertionSort(Produto[] produtos) {
		this.produtos = produtos;
	}


	public void ordena() {
		for (int atual = 1; atual < produtos.length; atual++) {
			int analise = atual;
			
			while(analise > 0 && produtos[analise].getPreco() < produtos[analise-1].getPreco()) {
				Produto produtoAnalise = produtos[analise];
				Produto produtoAnaliseMenosUm = produtos[analise-1];
				
				produtos[analise] = produtoAnaliseMenosUm;
				produtos[analise-1] = produtoAnalise;
				
				analise--;
			}
		}
	}
}
	
