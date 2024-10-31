package sentenciasControl;

import java.util.Scanner;
public class MenuOperaciones {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("Menú de Operaciones:");
			System.out.println("1. Sumar dos números");
			System.out.println("2. Restar dos números");
			System.out.println("3. Multiplicar dos números");
			System.out.println("4. Dividir dos números");
			System.out.println("5. Salir");
			System.out.print("Elige una opción: ");
			opcion = scanner.nextInt();

			if (opcion >= 1 && opcion <= 4) {
				System.out.print("Introduce el primer número: ");
				double num1 = scanner.nextDouble();
				System.out.print("Introduce el segundo número: ");
				double num2 = scanner.nextDouble();

				switch (opcion) {
				case 1:
					System.out.println("Resultado: " + (num1 + num2));
					break;
				case 2:
					System.out.println("Resultado: " + (num1 - num2));
					break;
				case 3:
					System.out.println("Resultado: " + (num1 * num2));
					break;
				case 4:
					if (num2 != 0) {
						System.out.println("Resultado: " + (num1 / num2));
					} else {
						System.out.println("Error: No se puede dividir entre cero.");
					}
					break;
				}
			} else if (opcion != 5) {
				System.out.println("Opción no válida.");
			}
		} while (opcion != 5);

		System.out.println("Programa terminado.");
		scanner.close();

	}

}
