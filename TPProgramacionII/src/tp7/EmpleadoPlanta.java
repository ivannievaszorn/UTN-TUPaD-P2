package tp7;

public class EmpleadoPlanta extends Empleado {
    private double sueldoFijo;

    public EmpleadoPlanta(String nombre, String legajo, double sueldoFijo) {
        super(nombre, legajo);
        this.sueldoFijo = sueldoFijo;
    }

    @Override
    public double calcularSueldo() {
        // Suponemos un sueldo fijo
        return sueldoFijo;
    }
}