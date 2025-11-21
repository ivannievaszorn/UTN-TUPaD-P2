package tp5.ejercicio8;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; // Composición

    // Recibe los datos base y el Usuario (la entidad agregada)
    public Documento(String titulo, String contenido, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        
        // COMPOSICIÓN: La instancia de FirmaDigital se crea AQUÍ DENTRO del Documento
        // y se le pasa el objeto Usuario que se AGREGÓ.
        this.firma = new FirmaDigital("HASH-" + titulo.hashCode(), "2025-11-20", usuario); 
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getContenido() { return contenido; }
    public FirmaDigital getFirma() { return firma; }
}