package tp5.ejercicio10;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        // Configuración UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        System.out.println("--- PRUEBA: EJERCICIO 10 (Agregación y Bidireccional) ---");

        // 1. Crear las partes sueltas
        Avion miAvion = new Avion("LV-KFX", "Airbus 320-232");
        Piloto miPiloto = new Piloto("Cap. Ivan Nievas Zorn", "15487");
        
        System.out.println("-> Avión creado: " + miAvion.getMatricula());
        System.out.println("-> Piloto asignado: " + miPiloto.getNombre());

        // 2. Crear el Vuelo, asociando las partes
        Vuelo miVuelo = new Vuelo(
            "WJ-3115", 
            "Córdoba", 
            "Buenos Aires", 
            miAvion, 
            miPiloto
        );

        System.out.println("\n--- DATOS DEL VUELO ---");
        System.out.println("Vuelo N°" + miVuelo.getNumeroVuelo() + ": " + miVuelo.getOrigen() + " a " + miVuelo.getDestino());
        
        // Prueba 1: Vuelo -> Avión (Agregación)
        System.out.println("Avión asignado (por Vuelo): " + miVuelo.getAvion().getModelo() + 
                           " (" + miVuelo.getAvion().getMatricula() + ")");
        
        // Prueba 2: Piloto -> Vuelo (Bidireccionalidad)
        System.out.println("Vuelo asignado a " + miPiloto.getNombre() + 
                           " (por Piloto): " + miPiloto.getVuelo().getNumeroVuelo());

        System.out.println("\n--- FIN EJERCICIO 10 ---");
    }
}