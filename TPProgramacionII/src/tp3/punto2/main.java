/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.punto2;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Mascota m1 = new Mascota("Pupi", "Gato", 10);
        
        m1.mostrarInfo();
        
        m1.cumplirAnios();
        m1.mostrarInfo();
        
        m1.cumplirAnios();
        m1.mostrarInfo();
        
    }
}
