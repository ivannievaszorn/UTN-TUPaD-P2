package tp6.caso2;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona la colección de Libros (implementa Composición).
 */
public class Biblioteca {

    private String nombre;
    private List<Libro> libros; // Usamos List como buena práctica

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        // Composición: La Biblioteca crea e inicializa su colección de Libros.
        this.libros = new ArrayList<>();
        System.out.println("🏛️ Biblioteca '" + nombre + "' creada.");
    }

    // Método requerido: agregarLibro
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        // Validación de existencia simple
        if (buscarLibroPorIsbn(isbn) != null) {
            System.out.println("❌ Error: Ya existe un libro con el ISBN: " + isbn);
            return;
        }
        
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
        System.out.println("✅ Libro agregado: " + titulo);
    }

    // Método requerido: listarLibros
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("\n--- 🚫 La biblioteca no tiene libros ---");
            return;
        }
        System.out.println("\n--- 📋 Libros Disponibles en " + nombre + " (" + libros.size() + " en total) ---");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    // Método requerido: buscarLibroPorIsbn
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }

    // Método requerido: eliminarLibro
    public boolean eliminarLibro(String isbn) {
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);
        if (libroAEliminar != null) {
            this.libros.remove(libroAEliminar);
            System.out.println("🗑️ Libro eliminado: " + libroAEliminar.getTitulo() + " (ISBN: " + isbn + ")");
            return true;
        } else {
            System.out.println("❌ Error: No se encontró libro con ISBN: " + isbn);
            return false;
        }
    }

    // Método requerido: obtenerCantidadLibros
    public int obtenerCantidadLibros() {
        return this.libros.size();
    }
    
    // Método requerido: filtrarLibrosPorAnio
    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> filtrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                filtrados.add(libro);
            }
        }
        return filtrados;
    }

    // Método requerido: mostrarAutoresDisponibles
    public void mostrarAutoresDisponibles() {
        ArrayList<String> autoresUnicos = new ArrayList<>(); // Para evitar duplicados
        
        System.out.println("\n--- ✍️ Autores Registrados ---");
        for (Libro libro : libros) {
            String nombreAutor = libro.getAutor().getNombre();
            if (!autoresUnicos.contains(nombreAutor)) {
                autoresUnicos.add(nombreAutor);
                System.out.println("- " + nombreAutor + " (" + libro.getAutor().getNacionalidad() + ")");
            }
        }
        if (autoresUnicos.isEmpty()) {
            System.out.println("No hay autores registrados.");
        }
    }
}