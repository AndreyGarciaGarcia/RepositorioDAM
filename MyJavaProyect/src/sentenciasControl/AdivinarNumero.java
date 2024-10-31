package sentenciasControl;

import java.util.Scanner;
public class AdivinarNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroAleatorio = (int) (Math.random() * 100) + 1;
		int intento;

		System.out.println("Adivina el número entre 1 y 100.");

		do {
			System.out.print("Introduce tu número: ");
			intento = scanner.nextInt();

			if (intento > numeroAleatorio) {
				System.out.println("El número es menor.");
			} else if (intento < numeroAleatorio) {
				System.out.println("El número es mayor.");
			} else {
				System.out.println("¡Has adivinado el número!");
			}
		} while (intento != numeroAleatorio);

		scanner.close();

	}

}
