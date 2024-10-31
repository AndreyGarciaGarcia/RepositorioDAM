package arrays;

public class SegundoMayorElemento {

	public static void main(String[] args) {
		int[] numeros = { 10, 5, 20, 15, 30 };
		int mayor = Integer.MIN_VALUE;
		int segundoMayor = Integer.MIN_VALUE;

		for (int numero : numeros) {
			if (numero > mayor) {
				segundoMayor = mayor;
				mayor = numero;
			} else if (numero > segundoMayor && numero < mayor) {
				segundoMayor = numero;
			}
		}

		System.out.println("El segundo mayor elemento es: " + segundoMayor);
	}

}
