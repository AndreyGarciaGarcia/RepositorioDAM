package arrays;

public class ContarParesImpares {

	public static void main(String[] args) {
		int[] numeros = { 2, 7, 4, 9, 12 };
		int pares = 0;
		int impares = 0;

		for (int numero : numeros) {
			if (numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}

		System.out.println("Pares: " + pares + ", Impares: " + impares);

	}

}
