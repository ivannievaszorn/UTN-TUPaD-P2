package tp5.ejercicio11;

public class Artista {
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getGenero() { return genero; }
}