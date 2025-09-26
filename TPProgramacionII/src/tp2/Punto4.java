/*
Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el precio final
 */

package tp2;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Punto4 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String cat = scanner.nextLine();

        double porcentajeDescuento;
        if (cat.equalsIgnoreCase("A")) {
            porcentajeDescuento = 10.0;
        } else if (cat.equalsIgnoreCase("B")) {
            porcentajeDescuento = 15.0;
        } else {
            porcentajeDescuento = 20.0;
        }

        double descuento =  precio * (porcentajeDescuento/100);
        double precioFinal = precio - descuento;

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println(
            "Precio original: $" + df.format(precio) +
            "\nDescuento aplicado: " + porcentajeDescuento + "%" +
            "\nPrecio final: $" + df.format(precioFinal)
        );

        scanner.close();
    }
}

