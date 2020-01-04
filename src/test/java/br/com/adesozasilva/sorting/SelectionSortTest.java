package br.com.adesozasilva.sorting;

import java.util.Arrays;

import org.junit.Test;

import br.com.adesozasilva.sorting.SelectionSort;

public class SelectionSortTest {

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
		SelectionSort sort = new SelectionSort();
		sort.execute(nomes);
		Arrays.asList(nomes).forEach(System.out::println);
	}

}
