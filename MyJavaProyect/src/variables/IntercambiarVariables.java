package variables;

public class IntercambiarVariables {

	public static void main(String[] args) {
		int a = 3;
		int b = 7;

		System.out.println("Antes del intercambio: a = " + a + ", b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Después del intercambio: a = " + a + ", b = " + b);

	}

}
