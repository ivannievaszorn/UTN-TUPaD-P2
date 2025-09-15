package tp1;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Punto6 {
    public static void main(String[] args) throws Exception {
        // Reconfigura para UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        // Cambia la salida estándar (la consola) para usar codificación UTF-8,
        // lo que permite mostrar correctamente caracteres con acento.        
        String nombre = "Juan Pérez";
        int edad = 30;
        String direccion = "Calle Falsa 123";
        System.out.println("Nombre: \"" + nombre + "\"\nEdad: " + edad + " años" + "\nDirección: " + direccion);        
    }
}
