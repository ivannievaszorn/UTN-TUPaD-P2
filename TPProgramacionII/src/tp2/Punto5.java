/*Escribe un programa que solicite números al usuario y sume solo los números pares. 
El ciclo debe continuar hasta que el usuario ingrese el número 0, momento en el que se debe mostrar la suma total de los pares ingresados
 */
package tp2;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Punto5 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(System.in);
        int numeroIngresado;
        int sumaDePares = 0;
        
        System.out.print("Ingrese un número (0 para terminar)");
        numeroIngresado = scanner.nextInt();
        
        while (numeroIngresado != 0) {
            if (numeroIngresado % 2 == 0) {
                sumaDePares += numeroIngresado;
            }
            System.out.print("Ingrese otro número (0 para terminar): ");
            numeroIngresado = scanner.nextInt();
        }
                
        System.out.println("La suma de los numeros ingresados es: " + sumaDePares);
        scanner.close();
    }
}