package tp7;

public class EmpleadoTemporal extends Empleado {
    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoTemporal(String nombre, String legajo, int horasTrabajadas, double tarifaHora) {
        super(nombre, legajo);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSueldo() {
        // Sueldo por horas trabajadas
        return horasTrabajadas * tarifaHora;
    }
}