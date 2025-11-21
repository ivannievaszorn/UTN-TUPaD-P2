package tp5.ejercicio7;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        // Configuración UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        System.out.println("--- PRUEBA: EJERCICIO 7 (Agregación y Bidireccional) ---");

        // 1. Crear las partes sueltas que serán asociadas
        Motor motorDiesel = new Motor("DW10", "d656d5a6s5da");
        Conductor miConductor = new Conductor("Ivan Nievas Zorn", "212335");
        
        System.out.println("-> Componente Motor creado: " + motorDiesel.getNumeroSerie());
        System.out.println("-> Entidad Conductor creada: " + miConductor.getNombre());

        // 2. Crear el Vehículo, asociando las partes
        Vehiculo miCoche = new Vehiculo(
            "IKP124", 
            "Peugeot 307 HDI", 
            motorDiesel, // Agregación
            miConductor  // Bidireccional
        );

        System.out.println("\n--- PRUEBA DE AGREGACIÓN ---");
        System.out.println("Vehículo: " + miCoche.getModelo());
        // Acceso: Vehículo -> Motor. Verifica el atributo 'tipo'
        System.out.println("-> Tipo de Motor: " + miCoche.getMotor().getTipo());
        
        System.out.println("\n--- PRUEBA DE BIDIRECCIONALIDAD ---");
        // Prueba 1: Vehículo -> Conductor. Verifica el atributo 'nombre'
        System.out.println("Conductor asignado (por Vehículo): " + miCoche.getConductor().getNombre());
        
        // Prueba 2: Conductor -> Vehículo. Verifica el atributo 'patente'
        System.out.println("Patente de " + miConductor.getNombre() + 
                           " (por Conductor): " + miConductor.getVehiculo().getPatente());

        System.out.println("\n--- FIN EJERCICIO 7 ---");
    }
}