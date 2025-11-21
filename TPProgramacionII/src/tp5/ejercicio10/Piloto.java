package tp5.ejercicio10;

public class Piloto {
    private String nombre;
    private String legajo;
    private Vuelo vuelo; // Bidireccional

    public Piloto(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getLegajo() { return legajo; }

    // Setter necesario para cerrar el vínculo bidireccional
    public void setVuelo(Vuelo vuelo) { this.vuelo = vuelo; }
    public Vuelo getVuelo() { return vuelo; }
}