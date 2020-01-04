package br.com.adesozasilva.sorting;

public class SelectionSort {
	
	public void execute(String[] array) {
		for (int i = 0; i < array.length -1; i++) {
			int smaller = searchSmallerElement(array, i, array.length);
			
			 String elementInAnalysis = array[i];
	         String smallerElement = array[smaller];
	         
	         array[i] = smallerElement;
	         array[smaller] = elementInAnalysis;

		}
	}
	
	private static int searchSmallerElement(String[] array, int from, int to) {
		int smaller = from;
		for (int i = from; i < to; i++) {
			if(array[i].compareTo(array[smaller]) < 0) {
				smaller = i;
			}
			
		}
		return smaller;
	}

}
