package br.com.adesozasilva;

import java.util.Arrays;

import org.junit.Test;

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
