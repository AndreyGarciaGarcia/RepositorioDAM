package sentenciasControl;

import java.util.Scanner;
public class MayorDeTresNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		int num1 = scanner.nextInt();
		System.out.print("Introduce el segundo número: ");
		int num2 = scanner.nextInt();
		System.out.print("Introduce el tercer número: ");
		int num3 = scanner.nextInt();

		if (num1 == num2 && num2 == num3) {
			System.out.println("Los tres números son iguales.");
		} else if (num1 >= num2 && num1 >= num3) {
			System.out.println("El mayor es: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("El mayor es: " + num2);
		} else {
			System.out.println("El mayor es: " + num3);
		}

		scanner.close();

	}

}
