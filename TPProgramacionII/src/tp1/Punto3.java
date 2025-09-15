package tp1;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Punto3 {
    public static void main(String[] args) throws Exception {
        // Reconfigura System.out para UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        String nombre = "Iván";
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: 25");
        System.out.println("Altura: 1.78 metros");
        System.out.println("¿Es estudiante?: true");
    }
}

