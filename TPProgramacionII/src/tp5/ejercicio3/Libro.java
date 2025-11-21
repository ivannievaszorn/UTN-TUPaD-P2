package tp5.ejercicio3;

public class Libro {
    private String titulo;
    private String isbn;
    
    // Asociación Unidireccional
    private Autor autor;       
    
    // Agregación
    private Editorial editorial; 

    // El constructor recibe Autor y Editorial (objetos ya creados, típico de Agregación/Asociación)
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;         // Asociación Unidireccional
        this.editorial = editorial; // Agregación
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }
}