package tp5.ejercicio9;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        // Configuración UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        System.out.println("--- PRUEBA: EJERCICIO 9 (Doble Asociación Unidireccional) ---");

        // 1. Crear las partes (Paciente y Profesional)
        Paciente paciente = new Paciente("Rocio Carignano", "Swiss Medical");
        Profesional medico = new Profesional("Dr. Pérez", "Cardiología");
        
        System.out.println("-> Paciente registrado: " + paciente.getNombre());
        System.out.println("-> Profesional disponible: " + medico.getNombre());

        // 2. Crear la Cita Médica, asociando los dos objetos
        CitaMedica miCita = new CitaMedica(
            "2026-05-10", 
            "16:00", 
            paciente, 
            medico
        );

        System.out.println("\n--- DATOS DE LA CITA ---");
        System.out.println("Fecha y Hora: " + miCita.getFecha() + " " + miCita.getHora());
        
        // Prueba 1: Cita -> Paciente
        System.out.println("Paciente: " + miCita.getPaciente().getNombre() + 
                           " (Obra Social: " + miCita.getPaciente().getObraSocial() + ")");
        
        // Prueba 2: Cita -> Profesional
        System.out.println("Profesional: " + miCita.getProfesional().getNombre() + 
                           " (" + miCita.getProfesional().getEspecialidad() + ")");
        
        // Nota sobre la Unidireccionalidad: 
        // Ni el objeto 'paciente' ni el objeto 'medico' conocen la existencia de 'miCita'.
        
        System.out.println("\n--- FIN EJERCICIO 9 ---");
    }
}