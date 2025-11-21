package tp5.ejercicio9;

public class Paciente {
    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getObraSocial() { return obraSocial; }
}