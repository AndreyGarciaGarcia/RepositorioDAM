package arrays;

import java.util.Arrays;
public class OrdenarArray {

	public static void main(String[] args) {
		int[] numeros = { 3, 1, 4, 1, 5, 9, 2 };
		Arrays.sort(numeros);

		System.out.println("Array ordenado: " + Arrays.toString(numeros));
	}

}
