package bucles;

import java.util.Scanner;
public class SerieFibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el número de términos de Fibonacci: ");
		int N = scanner.nextInt();

		int a = 0, b = 1;
		System.out.print("Serie de Fibonacci: " + a + " " + b);

		for (int i = 2; i < N; i++) {
			int siguiente = a + b;
			System.out.print(" " + siguiente);
			a = b;
			b = siguiente;
		}

		scanner.close();

	}

}
