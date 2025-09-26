/*
8.	Cálculo del Precio Final con impuesto y descuento.

Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto en un e-commerce. La fórmula es:

PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)

Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento, llama al método y muestra el precio final.

Ejemplo de entrada/salida:

Ingrese el precio base del producto: 100

Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10 Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5
El precio final del producto es: 105.0

 */
package tp2;


import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Punto8 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));      
        Scanner scanner = new Scanner(System.in);       
        
        System.out.print("Ingrese el precio base del producto: $");
        double precioBase = scanner.nextDouble();
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): %");
        double impuesto = scanner.nextDouble();
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): %");
        double descuento = scanner.nextDouble();
        
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        
        System.out.println("El precio final del producto es: $" + precioFinal);
        
        scanner.close();
}
    
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioConImpuesto = precioBase + (precioBase * (impuesto / 100));
        double precioConDescuento = precioConImpuesto - (precioConImpuesto * (descuento / 100));
        return precioConDescuento;
    }
}
