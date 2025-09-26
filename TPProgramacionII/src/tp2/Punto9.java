/*
9.	Composición de funciones para calcular costo de envío y total de compra.

a.	calcularCostoEnvio(double peso, String zona): Calcula el costo de envío basado en la zona de envío (Nacional o Internacional) y el peso del paquete.

Nacional: $5 por kg Internacional: $10 por kg
b.	calcularTotalCompra(double precioProducto, double costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío.

Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. Luego, muestra el total a pagar.

Ejemplo de entrada/salida:

Ingrese el precio del producto: 50 Ingrese el peso del paquete en kg: 2
Ingrese la zona de envío (Nacional/Internacional): Nacional El costo de envío es: 10.0
El total a pagar es: 60.0

 */
package tp2;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Punto9 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));      
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();

        scanner.nextLine(); // Limpia buffer

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double totalAPagar = calcularTotalCompra(precio, costoEnvio);
                
        System.out.println("El costo del envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalAPagar);

        scanner.close();
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")){
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")){
            return peso * 10;
        } else {
            System.out.println("Zona inválida, se tomará costo 0.");
            return 0;
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
