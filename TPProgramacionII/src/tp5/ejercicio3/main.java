package tp5.ejercicio3;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("--- INICIO PRUEBA: EJERCICIO 3 (Asociación Unidireccional y Agregación) ---");

        // 1. Crear las partes que existen independientemente
        Autor miAutor = new Autor("Kip S. Thorne", "Estadounidense");
        Editorial miEditorial = new Editorial("W. W. Norton & Company", "500 Fifth Ave, NY");
        
        System.out.println("-> Autor Creado: " + miAutor.getNombre());
        System.out.println("-> Editorial Creada: " + miEditorial.getNombre());

        // 2. Crear el Libro, asociando las partes
        Libro miLibro = new Libro(
            "The Science of Interstellar", 
            "978-0393351378", 
            miAutor,      // Asociación Unidireccional
            miEditorial   // Agregación
        );

        System.out.println("\n--- DATOS DEL LIBRO ---");
        System.out.println("Título: " + miLibro.getTitulo());
        
        // Prueba de Asociación (Libro -> Autor)
        System.out.println("Autor: " + miLibro.getAutor().getNombre() + 
                           " (" + miLibro.getAutor().getNacionalidad() + ")");
        
        // Prueba de Agregación (Libro -> Editorial)
        System.out.println("Editorial: " + miLibro.getEditorial().getNombre() + 
                           " - Dir: " + miLibro.getEditorial().getDireccion());
        
        // Prueba de Unidireccionalidad:
        // El objeto Autor 'miAutor' no tiene ningún método getLibro() o setLibro()
        // El vínculo solo va de Libro hacia Autor.

        System.out.println("\n--- FIN EJERCICIO 3 ---");
    }
}