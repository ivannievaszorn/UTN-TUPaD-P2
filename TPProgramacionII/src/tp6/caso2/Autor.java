package tp6.caso2;

/**
 * Clase que modela la información de un Autor.
 */
public class Autor {

    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    
    // Método requerido
    public void mostrarInfo() {
        System.out.println("  > Autor ID: " + id + ", Nombre: " + nombre + ", Nacionalidad: " + nacionalidad);
    }
    
    // Mejora: toString para facilitar la impresión
    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }
}