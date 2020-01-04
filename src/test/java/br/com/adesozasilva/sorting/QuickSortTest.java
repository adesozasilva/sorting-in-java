package br.com.adesozasilva.sorting;

import java.util.Arrays;

import org.junit.Test;

import br.com.adesozasilva.sorting.QuickSort;

public class QuickSortTest {

	@Test
	public void testOrdena() {
		String[] nomes = {
				"Andressa",
				"Camila",
				"Enzo",
				"Fernando",
				"Maria",
				"Alberto",
				"Jonas",
				"Junior",
				"Paloma",
				"Paulo"
		};
		 
		 QuickSort quickSort = new QuickSort();
		 String[] ordena = quickSort.ordena(nomes, 0, nomes.length);
		 Arrays.asList(ordena).forEach(System.out::println);
		
	}

}
