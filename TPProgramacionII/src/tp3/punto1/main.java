/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.punto1;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Estudiante est1 = new Estudiante("Ivàn", "Nievas", "Programacion II", 9.5);
        
        est1.mostrarInfo();
        
        est1.subirCalificacion(0.5);
        est1.mostrarInfo();
        
        est1.bajaCalificacion(1.5);
        est1.mostrarInfo();

    }
}
