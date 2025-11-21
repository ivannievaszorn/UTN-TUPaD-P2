package tp5.ejercicio12;

public class Contribuyente {
    private String nombre;
    private String cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getCuil() { return cuil; }
}