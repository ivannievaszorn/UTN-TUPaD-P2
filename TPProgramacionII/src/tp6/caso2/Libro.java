package tp6.caso2;

/**
 * Clase que modela un Libro.
 */
public class Libro {

    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor; // Relación con Autor

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
    
    // Método requerido
    public void mostrarInfo() {
        System.out.println("Título: " + titulo + " | ISBN: " + isbn + " | Año: " + anioPublicacion);
        // Muestra también la info del autor
        autor.mostrarInfo();
    }
    
    // Mejora: toString para depuración
    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", anio=" + anioPublicacion + ", " + autor.toString() + '}';
    }
}