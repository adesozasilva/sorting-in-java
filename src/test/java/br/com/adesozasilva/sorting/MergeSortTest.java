package br.com.adesozasilva.sorting;

import java.util.Arrays;

import org.junit.Test;

import br.com.adesozasilva.sorting.MergeSort;

public class MergeSortTest {

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

		MergeSort mergeSort = new MergeSort();
		String[] ordena = mergeSort.ordena(nomes, 0, nomes.length);
		Arrays.asList(ordena).forEach(System.out::println);
	}
}
