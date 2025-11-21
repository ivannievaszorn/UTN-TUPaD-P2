package tp5.ejercicio14;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        System.out.println("--- PRUEBA: EJERCICIO 14 (Dependencia de Creación) ---");

        // 1. Crear el objeto Proyecto (existencia previa)
        Proyecto miProyecto = new Proyecto("TPI Base de Datos I", 10);
        
        // 2. Crear el Editor
        EditorVideo miEditor = new EditorVideo("Shot Cut");

        System.out.println("\n-> Duración del proyecto: " + miProyecto.getDuracionMin() + " minutos.");
        
        // DEPENDENCIA DE CREACIÓN: Se llama al método que internamente crea el Render
        miEditor.exportar("MP4 (H.264)", miProyecto);

        System.out.println("\n--- FIN EJERCICIO 14 ---");
    }
}