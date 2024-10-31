package arrays;

public class EncontrarElemento {

	public static void main(String[] args) {
		int[] numeros = { 1, 4, 5, 7, 9 };
		int buscar = 5;
		int posicion = -1;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == buscar) {
				posicion = i;
				break;
			}
		}

		if (posicion != -1) {
			System.out.println("Elemento encontrado en posición: " + posicion);
		} else {
			System.out.println("Elemento no encontrado");
		}

	}

}
