package tp6.caso2;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Configuración UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        // ----------------------------------------------------
        // TAREA 1: Creamos una biblioteca.
        // ----------------------------------------------------
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central UNL");

        // ----------------------------------------------------
        // TAREA 2: Crear al menos tres autores
        // ----------------------------------------------------
        System.out.println("\n--- TAREA 2: CREANDO AUTORES ---");
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("A002", "Jane Austen", "Británica");
        Autor autor3 = new Autor("A003", "Jorge Luis Borges", "Argentino");
        
        // ----------------------------------------------------
        // TAREA 3: Agregar 5 libros asociados a los Autores a la biblioteca.
        // ----------------------------------------------------
        System.out.println("\n--- TAREA 3: AGREGANDO LIBROS ---");
        biblioteca.agregarLibro("978-0001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("978-0002", "Orgullo y Prejuicio", 1813, autor2);
        biblioteca.agregarLibro("978-0003", "Ficciones", 1944, autor3);
        biblioteca.agregarLibro("978-0004", "El amor en los tiempos del cólera", 1985, autor1); // Repite autor1
        biblioteca.agregarLibro("978-0005", "Emma", 1815, autor2); // Repite autor2

        // ----------------------------------------------------
        // TAREA 4: Listar todos los libros con su información y la del autor.
        // ----------------------------------------------------
        biblioteca.listarLibros();

        // ----------------------------------------------------
        // TAREA 5: Buscar un libro por su ISBN y mostrar su información.
        // ----------------------------------------------------
        String isbnBuscado = "978-0003";
        System.out.println("\n--- TAREA 5: BUSCAR LIBRO POR ISBN (" + isbnBuscado + ") ---");
        Libro libroBuscado = biblioteca.buscarLibroPorIsbn(isbnBuscado);
        if (libroBuscado != null) {
            System.out.println("✅ Libro encontrado:");
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("❌ Libro no encontrado con ISBN: " + isbnBuscado);
        }

        // ----------------------------------------------------
        // TAREA 6: Filtrar y mostrar los libros publicados en un año específico.
        // ----------------------------------------------------
        int anioFiltro = 1815;
        System.out.println("\n--- TAREA 6: FILTRAR LIBROS POR AÑO (" + anioFiltro + ") ---");
        List<Libro> filtrados = biblioteca.filtrarLibrosPorAnio(anioFiltro);
        if (!filtrados.isEmpty()) {
            System.out.println("Libros publicados en " + anioFiltro + ":");
            for (Libro libro : filtrados) {
                System.out.println("- " + libro.getTitulo());
            }
        } else {
            System.out.println("No se encontraron libros publicados en " + anioFiltro);
        }

        // ----------------------------------------------------
        // TAREA 7: Eliminar un libro por su ISBN y listar los libros restantes.
        // ----------------------------------------------------
        String isbnEliminar = "978-0005";
        System.out.println("\n--- TAREA 7: ELIMINAR LIBRO (" + isbnEliminar + ") ---");
        biblioteca.eliminarLibro(isbnEliminar);
        biblioteca.listarLibros(); // Listar restantes para verificar

        // ----------------------------------------------------
        // TAREA 8: Mostrar la cantidad total de libros en la biblioteca.
        // ----------------------------------------------------
        System.out.println("\n--- TAREA 8: CANTIDAD TOTAL DE LIBROS ---");
        System.out.println("Contador de libros: " + biblioteca.obtenerCantidadLibros() + " unidades.");

        // ----------------------------------------------------
        // TAREA 9: Listar todos los autores de los libros disponibles en la biblioteca.
        // ----------------------------------------------------
        biblioteca.mostrarAutoresDisponibles();
    }
}