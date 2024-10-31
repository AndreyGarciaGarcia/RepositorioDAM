package arrays;

public class MayorMenorElemento {

	public static void main(String[] args) {
		int[] numeros = { 5, 3, 9, 1, 6 };
		int mayor = numeros[0];
		int menor = numeros[0];

		for (int numero : numeros) {
			if (numero > mayor) {
				mayor = numero;
			}
			if (numero < menor) {
				menor = numero;
			}
		}

		System.out.println("Mayor: " + mayor + ", Menor: " + menor);

	}

}
