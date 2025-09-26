package tp2;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Punto2 {
    public static void main(String[] args) throws Exception {
        // Reconfigura para UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresá el N°1: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresá el N°2: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingresá el N°3: ");
        int num3 = scanner.nextInt();
        
        int mayor = Math.max(num1, (Math.max(num2, num3)));
        
        System.out.println("El mayor de los numeros ingresado es: " + mayor);
    }
}