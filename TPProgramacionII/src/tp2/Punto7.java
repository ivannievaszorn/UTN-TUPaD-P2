/*
7.	Validación de Nota entre 0 y 10 (do-while).

Escribe un programa que solicite al usuario una nota entre 0 y 10. 
Si el usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota hasta que ingrese un valor válido.

Ejemplo de entrada/salida:

Ingrese una nota (0-10): 15

Error: Nota inválida. Ingrese una nota entre 0 y 10. Ingrese una nota (0-10): -2
Error: Nota inválida. Ingrese una nota entre 0 y 10. Ingrese una nota (0-10): 8
Nota guardada correctamente.

 */
package tp2;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Punto7 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una nota (0-10): ");
        int notaIngresada = scanner.nextInt();
        
        while (notaIngresada <0 || notaIngresada >10) {
            System.out.print("Error: Nota inválida. Ingrese una nota entre 0 y 10: ");
            notaIngresada = scanner.nextInt();
        }                
        System.out.println("Nota guardada correctamente");
        scanner.close();
    }
}

