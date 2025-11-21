package TP5.ejercicio1;

public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // Lado B de la bidireccionalidad

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }

    // Setter necesario para cerrar el vínculo bidireccional
    public void setPasaporte(Pasaporte pasaporte) { this.pasaporte = pasaporte; }
    public Pasaporte getPasaporte() { return pasaporte; }
}
