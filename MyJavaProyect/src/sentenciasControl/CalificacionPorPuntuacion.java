package sentenciasControl;

import java.util.Scanner;
public class CalificacionPorPuntuacion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce la puntuación (0-100): ");
		int puntuacion = scanner.nextInt();

		if (puntuacion >= 90) {
			System.out.println("Calificación: A");
		} else if (puntuacion >= 80) {
			System.out.println("Calificación: B");
		} else if (puntuacion >= 70) {
			System.out.println("Calificación: C");
		} else if (puntuacion >= 60) {
			System.out.println("Calificación: D");
		} else {
			System.out.println("Calificación: F");
		}

		scanner.close();

	}

}
