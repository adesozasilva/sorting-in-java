package br.com.adesozasilva.sorting;

import java.util.Arrays;

import org.junit.Test;

import br.com.adesozasilva.sorting.InsertionSort;

public class InsertionSortTest {

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
		InsertionSort sort = new InsertionSort();
		sort.execute(nomes);
		Arrays.asList(nomes).forEach(System.out::println);
	}
}
