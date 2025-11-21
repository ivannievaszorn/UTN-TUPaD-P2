package tp5.ejercicio7;

public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // Objeto necesario para la Bidireccionalidad

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getLicencia() { return licencia; }

    // Setter necesario para cerrar el vínculo bidireccional
    public void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }
    public Vehiculo getVehiculo() { return vehiculo; }
}