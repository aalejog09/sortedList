package com.iqt.training.sortedList;

import ch.qos.logback.core.util.InvocationGate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class SortedListApplication {

	public static void main(String[] args) {
		SpringApplication.run(SortedListApplication.class, args);

		Integer[] nums1 = {1, 2, 3, 0, 0, 0, 0};
		Integer[] nums2 = {-4, 2, 3, 9};

		// Filtrar los valores no nulos (diferentes de 0) de nums1
		Integer[] filteredNums1 = Stream.of(nums1)
				.filter(num -> num != 0)
				.toArray(Integer[]::new);

		// Crear un nuevo arreglo con suficiente espacio para ambos arreglos
		Integer[] mergedArray = new Integer[filteredNums1.length + nums2.length];

		// Copiar los elementos de filteredNums1 al nuevo arreglo
		System.arraycopy(filteredNums1, 0, mergedArray, 0, filteredNums1.length);

		// Copiar los elementos de nums2 al nuevo arreglo
		System.arraycopy(nums2, 0, mergedArray, filteredNums1.length, nums2.length);

		// Ordenar el arreglo resultante
		Arrays.sort(mergedArray);
		System.out.println("Arreglo combinado y ordenado (sin valores 0):"+ Arrays.toString(Arrays.stream(mergedArray).toArray()));
	}
}

