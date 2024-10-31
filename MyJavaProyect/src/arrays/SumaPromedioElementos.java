package arrays;

public class SumaPromedioElementos {

	public static void main(String[] args) {
		int[] numeros = { 10, 20, 30, 40, 50 };
		int suma = 0;

		for (int numero : numeros) {
			suma += numero;
		}

		double promedio = (double) suma / numeros.length;

		System.out.println("Suma: " + suma + ", Promedio: " + promedio);

	}

}
