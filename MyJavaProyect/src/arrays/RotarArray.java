package arrays;

import java.util.Arrays;

public class RotarArray {

	public static void main(String[] args) {
		int[] numeros = { 1, 2, 3, 4, 5 };
		int k = 2;

		int n = numeros.length;
		k = k % n; // Para manejar k mayor que n
		int[] rotado = new int[n];

		for (int i = 0; i < n; i++) {
			rotado[(i + k) % n] = numeros[i];
		}

		System.out.println("Array rotado: " + Arrays.toString(rotado));
	}

}
