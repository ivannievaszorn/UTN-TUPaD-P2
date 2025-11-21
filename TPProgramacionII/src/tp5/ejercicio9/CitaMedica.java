package tp5.ejercicio9;

public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;      // Asociación Unidireccional
    private Profesional profesional; // Asociación Unidireccional

    // Recibe ambos objetos ya existentes
    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    // Getters
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public Paciente getPaciente() { return paciente; }
    public Profesional getProfesional() { return profesional; }
}