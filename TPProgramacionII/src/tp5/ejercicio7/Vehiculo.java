package tp5.ejercicio7;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;        // Objeto necesario para la Agregación
    private Conductor conductor; // Objeto necesario para la Bidireccionalidad

    // Constructor que recibe objetos ya existentes (Motor y Conductor)
    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        
        this.conductor = conductor;
        // Cierra el vínculo bidireccional: le dice al conductor cuál es su vehículo
        this.conductor.setVehiculo(this); 
    }

    // Getters
    public String getPatente() { return patente; }
    public String getModelo() { return modelo; }
    public Motor getMotor() { return motor; }
    public Conductor getConductor() { return conductor; }
}