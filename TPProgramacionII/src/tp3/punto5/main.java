/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.punto5;


import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        NaveEspacial nave1 = new NaveEspacial("Cassini", 50, 10);
        
        nave1.mostrarEstado();
        nave1.avanzar(65);
        nave1.recargarCombustible(25);
        nave1.avanzar(65);
        nave1.mostrarEstado();
    }        
}
