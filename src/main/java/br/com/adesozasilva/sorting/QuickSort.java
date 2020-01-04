package br.com.adesozasilva.sorting;

public class QuickSort {
	
	public String[] ordena(String[] nomes, int de, int ate) {
		int elementos =  ate - de;
		if(elementos > 1) {
			int posicaoDoPivo = particiona(nomes, de, ate);
			ordena(nomes, de, posicaoDoPivo);
			ordena(nomes, posicaoDoPivo+1, ate);
		}
		
		return nomes;
		
	}

	private int particiona(String[] nomes, int de, int ate) {
		String pivo = nomes[ate -1];
		int menores = 0;
		for (int analise = 0; analise < ate -1; analise++) {
			String atual = nomes[analise];
			if(atual.compareTo(pivo) < 0) {
				troca(nomes, analise, menores);
				menores++;
			}
		}
		troca(nomes, ate-1, menores);
		return menores;
	}

	private void troca(String[] nomes, int de, int para) {
		String nomeDe =  nomes[de];
		String nomePara =  nomes[para];
		nomes[para] = nomeDe;
		nomes[de] = nomePara;
		
	}

}
