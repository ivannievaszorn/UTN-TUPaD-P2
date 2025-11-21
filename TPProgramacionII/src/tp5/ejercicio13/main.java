package tp5.ejercicio13;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        System.out.println("--- PRUEBA: EJERCICIO 13 (Dependencia de Creación) ---");

        // 1. Crear el objeto Usuario (existencia previa)
        Usuario miUsuario = new Usuario("Ivan Nievas Zorn", "inz@gmail.com");
        
        // 2. Crear el Generador
        GeneradorQR miGenerador = new GeneradorQR();

        System.out.println("\n-> Usuario para el QR: " + miUsuario.getNombre());
        
        // DEPENDENCIA DE CREACIÓN: Se llama al método que internamente crea el CódigoQR
        miGenerador.generar("http://qr.ejemplo.com/inz", miUsuario);

        System.out.println("\n--- FIN EJERCICIO 13 ---");
    }
}