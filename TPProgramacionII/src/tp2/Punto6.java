/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Punto6 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(System.in);
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int sumaCeros = 0;
        
        for (int i = 1; i <=10; i++){
            System.out.print("Ingrese un número entero: ");
            int numeroIngresado = scanner.nextInt();
                if (numeroIngresado == 0) {
                    sumaCeros++;
                } else if (numeroIngresado <0){
                    sumaNegativos++;
                } else {
                    sumaPositivos++;
                }
        }                
        System.out.println(
                "Resultados: " + 
                "\nPositivos: " + sumaPositivos + 
                "\nNegativos: " + sumaNegativos + 
                "\nCeros: " + sumaCeros);
        scanner.close();
    }
}