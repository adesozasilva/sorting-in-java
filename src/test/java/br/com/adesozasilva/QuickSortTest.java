package br.com.adesozasilva;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import br.com.adesozasilva.model.Produto;

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
