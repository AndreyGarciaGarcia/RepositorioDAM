package variables;

public class PrecioFinalConIVA {

	public static void main(String[] args) {
		double precio = 100.0;
		double iva = 0.21;
		double precioFinal = precio + (precio * iva);

		System.out.println("El precio final con IVA es: " + precioFinal);

	}

}
