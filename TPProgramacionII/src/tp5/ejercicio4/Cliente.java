package tp5.ejercicio4;

public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; // Bidireccional

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }

    // Setter necesario para cerrar el vínculo bidireccional
    public void setTarjeta(TarjetaDeCredito tarjeta) { this.tarjeta = tarjeta; }
    public TarjetaDeCredito getTarjeta() { return tarjeta; }
}