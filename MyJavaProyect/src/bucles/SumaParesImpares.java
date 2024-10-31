package bucles;

import java.util.Scanner;
public class SumaParesImpares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sumaPares = 0, sumaImpares = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Introduce un número (" + i + " de 10): ");
			int numero = scanner.nextInt();

			if (numero % 2 == 0) {
				sumaPares += numero;
			} else {
				sumaImpares += numero;
			}
		}

		System.out.println("Suma de pares: " + sumaPares);
		System.out.println("Suma de impares: " + sumaImpares);
		scanner.close();

	}

}
