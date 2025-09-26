package tp2;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Punto13 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios, 0);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirArrayRecursivo(precios, 0);
    }

    public static void imprimirArrayRecursivo(double[] array, int indice) {
        if (indice < array.length) {
            System.out.println("Precio: $" + array[indice]);
            imprimirArrayRecursivo(array, indice + 1);
        }
    }
}
