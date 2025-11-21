package tp5.ejercicio5;

public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // Bidireccional

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }

    // Setter necesario para cerrar el vínculo bidireccional
    public void setComputadora(Computadora computadora) { this.computadora = computadora; }
    public Computadora getComputadora() { return computadora; }
}
