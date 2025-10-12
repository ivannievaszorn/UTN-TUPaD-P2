/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.punto4;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Gallina g1 = new Gallina("G1", 3, 10);
        
        g1.mostrarEstado();
        g1.envejecer();
        g1.ponerHuevo();
        g1.mostrarEstado();
        
        Gallina g2 = new Gallina("G2", 4, 12);
        g2.mostrarEstado();
        g2.envejecer();
        g2.ponerHuevo();
        g2.mostrarEstado();        
    }        
}
