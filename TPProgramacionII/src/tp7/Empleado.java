package tp7;

public abstract class Empleado {
    protected String nombre;
    protected String legajo;

    public Empleado(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }
    
    public abstract double calcularSueldo();
}