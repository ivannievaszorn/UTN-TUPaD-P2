package tp1;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;  // Importar Scanner para entrada por teclado

public class Punto4 {
    public static void main(String[] args) throws Exception {
        // Reconfigura System.out para UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner sc = new Scanner(System.in);

        // Solicitar nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        // Solicitar edad
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        // Mostrar en pantalla
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        sc.close(); // Cerrar Scanner
    }
}
