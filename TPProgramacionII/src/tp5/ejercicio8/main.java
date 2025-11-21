package tp5.ejercicio8;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        // Configuración UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        System.out.println("--- PRUEBA: EJERCICIO 8 (Composición y Agregación) ---");

        // 1. Crear la parte que existe independientemente (Usuario para la Agregación)
        Usuario usuarioFirmante = new Usuario("Agustina Diaz", "agusdiaz@gmail.com");
        System.out.println("-> Usuario creado: " + usuarioFirmante.getNombre());

        // 2. Crear el Documento, que creará su propia Firma y agregará al Usuario
        Documento informe = new Documento(
            "Informe de Resultados Q3", 
            "Detalle de crecimiento...", 
            usuarioFirmante // Objeto Usuario (Agregación)
        );

        System.out.println("\n--- DATOS DEL DOCUMENTO Y SU FIRMA ---");
        System.out.println("Documento: " + informe.getTitulo());
        
        // Prueba 1: Documento -> Firma (Composición)
        System.out.println("-> Código de Firma (creado por el Doc): " + informe.getFirma().getCodigoHash());
        
        // Prueba 2: Firma -> Usuario (Agregación)
        System.out.println("-> Documento firmado por (por Firma): " + informe.getFirma().getUsuario().getNombre() +
                           " en la fecha: " + informe.getFirma().getFecha());
        
        System.out.println("\n--- FIN EJERCICIO 8 ---");
    }
}