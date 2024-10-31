package bucles;

import java.util.Scanner;
public class SumaPrimerosNNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número entero positivo N: ");
		int N = scanner.nextInt();
		int suma = 0;

		for (int i = 1; i <= N; i++) {
			suma += i;
		}

		System.out.println("La suma de los primeros " + N + " números es: " + suma);
		scanner.close();

	}

}
