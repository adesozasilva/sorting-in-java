package br.com.adesozasilva.sorting;

public class InsertionSort {

	public void execute(String[] array) {
		for (int i = 1; i < array.length; i++) {
			int analysis = i;
			
			while(analysis > 0 && array[analysis].compareTo(array[analysis-1]) < 0) {
				String elementInAnalysis = array[analysis];
				String elementInAnalysisOneLess = array[analysis-1];
				
				array[analysis] = elementInAnalysisOneLess;
				array[analysis-1] = elementInAnalysis;
				
				analysis--;
			}
		}
	}
}
	
