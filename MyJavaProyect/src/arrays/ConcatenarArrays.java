package arrays;

import java.util.Arrays;
public class ConcatenarArrays {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };

		int[] concatenado = new int[array1.length + array2.length];
		System.arraycopy(array1, 0, concatenado, 0, array1.length);
		System.arraycopy(array2, 0, concatenado, array1.length, array2.length);

		System.out.println("Array concatenado: " + Arrays.toString(concatenado));
	}

}
