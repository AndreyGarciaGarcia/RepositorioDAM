package arrays;

import java.util.Arrays;
public class EliminarDuplicados {

	public static void main(String[] args) {
		int[] numeros = { 1, 2, 2, 3, 4, 4, 5 };
		int[] sinDuplicados = Arrays.stream(numeros).distinct().toArray();

		System.out.println("Array sin duplicados: " + Arrays.toString(sinDuplicados));

	}

}
