package TP5.ejercicio1;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("--- INICIO PRUEBA: EJERCICIO 1 (Composición y Bidireccional) ---");

        // 1. Crear el Titular
        Titular miTitular = new Titular("Ivan Nievas Zorn", "25667788");
        
        // 2. Crear el Pasaporte. Notar que NO creamos la Foto.
        //    Pasamos los datos de la foto ("foto.jpg", "JPG") y el Pasaporte se encarga de crearla (COMPOSICIÓN).
        Pasaporte miPasaporte = new Pasaporte(
            "ARG009988", 
            "2025-11-20", 
            "foto_ivan.jpg", 
            "JPG", 
            miTitular
        );

        System.out.println("\n--- PRUEBA DE COMPOSICIÓN (Pasaporte -> Foto) ---");
        System.out.println("Pasaporte N°: " + miPasaporte.getNumero());
        // Acceso: Pasaporte -> Foto
        System.out.println("-> Datos de la Foto (creada internamente): " + 
                           miPasaporte.getFoto().getImagen() + " en formato " + 
                           miPasaporte.getFoto().getFormato());

        System.out.println("\n--- PRUEBA DE BIDIRECCIONALIDAD ---");
        // Prueba 1: Pasaporte -> Titular
        System.out.println("Titular asociado (por Pasaporte): " + miPasaporte.getTitular().getNombre());
        
        // Prueba 2: Titular -> Pasaporte (El vínculo cerrado)
        // El Titular puede acceder al Pasaporte gracias al setter llamado en el constructor de Pasaporte.
        System.out.println("Pasaporte asociado a " + miTitular.getNombre() + 
                           " (por Titular): " + miTitular.getPasaporte().getNumero());

        System.out.println("\n--- FIN EJERCICIO 1 ---");
    }
}
