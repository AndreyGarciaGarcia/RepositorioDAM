package sentenciasControl;

import java.util.Scanner;

public class NumeroParOImpar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int numero = scanner.nextInt();

		if (numero % 2 == 0) {
			System.out.println("El número es par.");
		} else {
			System.out.println("El número es impar.");
		}

		scanner.close();

	}

}