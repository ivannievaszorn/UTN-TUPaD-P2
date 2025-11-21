package tp5.ejercicio6;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("--- PRUEBA: EJERCICIO 6 (Asociación Uni y Agregación) ---");

        // 1. Crear las partes que existen independientemente (Agregación)
        Mesa mesa10 = new Mesa(10, 4);
        Cliente cliente1 = new Cliente("Agustin Baldini", "3512253265");
        
        System.out.println("-> Mesa creada: N°" + mesa10.getNumero());
        System.out.println("-> Cliente registrado: " + cliente1.getNombre());

        // 2. Crear la Reserva, asociando las partes
        Reserva miReserva = new Reserva(
            "2026-03-15", 
            "21:30", 
            cliente1, // Asociación Uni
            mesa10    // Agregación
        );

        System.out.println("\n--- DATOS DE LA RESERVA ---");
        System.out.println("Reserva para el: " + miReserva.getFecha() + " a las " + miReserva.getHora());
        
        // Prueba de Asociación (Reserva -> Cliente)
        System.out.println("Cliente: " + miReserva.getCliente().getNombre() + 
                           " (Tel: " + miReserva.getCliente().getTelefono() + ")");
        
        // Prueba de Agregación (Reserva -> Mesa)
        System.out.println("Mesa Asignada: N°" + miReserva.getMesa().getNumero() + 
                           " (Capacidad: " + miReserva.getMesa().getCapacidad() + " personas)");

        System.out.println("\n--- FIN EJERCICIO 6 ---");
    }
}