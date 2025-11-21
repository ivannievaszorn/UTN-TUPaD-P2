package tp5.ejercicio9;

public class Profesional {
    private String nombre;
    private String especialidad;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
}