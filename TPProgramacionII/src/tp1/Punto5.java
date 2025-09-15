package tp1;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;  // Importar Scanner para entrada por teclado

public class Punto5 {
    public static void main(String[] args) throws Exception {
        // Reconfigura para UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner sc = new Scanner(System.in);

        // Solicitar entero 1
        System.out.print("Ingrese el entero Nº 1: ");
        int entero1 = sc.nextInt();

        // Solicitar entero 2
        System.out.print("Ingrese el entero Nº 1: ");
        int entero2 = sc.nextInt();
        
        // suma
        int suma = entero1 + entero2;
        // resta
        int resta = entero1 - entero2;
        // multiplicacion
        int multiplicacion = entero1 * entero2;
        // division
        int division = entero1 / entero2;
        
        // Mostrar en pantalla
        System.out.println(entero1 + " + " + entero2 + " = " + suma);
        System.out.println(entero1 + " - " + entero2 + " = " + resta);
        System.out.println(entero1 + " x " + entero2 + " = " + multiplicacion);
        System.out.println(entero1 + " / " + entero2 + " = " + division);

        sc.close(); // Cerrar Scanner
    }
}