package arraysMultidimensionales;

public class FilaSumaMasAlta {

	public static void main(String[] args) {
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int indiceFilaMaxSuma = 0;
		int sumaMaxima = 0;

		for (int i = 0; i < matriz.length; i++) {
			int sumaFila = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				sumaFila += matriz[i][j];
			}

			if (sumaFila > sumaMaxima) {
				sumaMaxima = sumaFila;
				indiceFilaMaxSuma = i;
			}
		}

		System.out.println(
				"La fila con la suma más alta es la fila " + indiceFilaMaxSuma + " con una suma de " + sumaMaxima);
	}

}
