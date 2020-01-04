package br.com.adesozasilva.sorting;

public class MergeSort {
	
	
	public String[] ordena(String[] nomes, int inicio, int termino) {
		int quantidade = termino - inicio;
		if(quantidade > 1) {
			int meio = (inicio + termino) / 2;
			ordena(nomes, inicio, meio);
			ordena(nomes, meio, termino);
			return intercala(nomes, inicio, meio, termino);
		}
		return nomes;
	}
	

	private String[] intercala(String[] nomes, int inicio, int miolo, int termino) {

		String[] nomesOrdenados = new String[termino - inicio];
		int i = inicio;
		int j = miolo;
		int contador = 0;

		while (i < miolo && j < termino) {

			if(nomes[i].compareTo(nomes[j]) < 0) {
				nomesOrdenados[contador] = nomes[i];
				i++;
			}else {
				nomesOrdenados[contador] = nomes[j];
				j++;
			}
			contador++;

		}

		while (j < termino) {
			nomesOrdenados[contador] = nomes[j];
			contador++;
			j++;
		}

		while (i < miolo) {
			nomesOrdenados[contador] = nomes[i];
			contador++;
			i++;
		}
		
		for (int k = 0; k < nomesOrdenados.length; k++) {
			nomes[inicio + k] = nomesOrdenados[k];
		}
		
		return nomes;

	}


	

}
