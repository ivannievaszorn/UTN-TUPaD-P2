package tp5.ejercicio5;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("--- PRUEBA: EJERCICIO 5 (Composición y Bidireccional) ---");

        // 1. Crear el Propietario
        Propietario miPropietario = new Propietario("Gabriel Tamanini", "38776655");
        
        // 2. Crear la Computadora. Notar que NO creamos la PlacaMadre.
        //    Pasamos los datos de la placa para que la Computadora la cree (COMPOSICIÓN).
        Computadora miPC = new Computadora(
            "Asus", 
            "SN-3556546", 
            "Asus X570 AORUS ELITE", 
            "AMD X570", 
            miPropietario // Propietario para la Bidireccionalidad
        );

        System.out.println("\n--- PRUEBA DE COMPOSICIÓN (Computadora -> PlacaMadre) ---");
        System.out.println("PC Marca: " + miPC.getMarca());
        // Acceso: Computadora -> PlacaMadre
        System.out.println("-> Modelo de Placa (creada por la PC): " + miPC.getPlaca().getModelo());
        
        System.out.println("\n--- PRUEBA DE BIDIRECCIONALIDAD ---");
        // Prueba 1: Computadora -> Propietario
        System.out.println("Dueño de la PC (por Computadora): " + miPC.getPropietario().getNombre());
        
        // Prueba 2: Propietario -> Computadora (Vínculo cerrado)
        System.out.println("Computadora asociada a " + miPropietario.getNombre() + 
                           " (por Propietario): " + miPropietario.getComputadora().getNumeroSerie());

        System.out.println("\n--- FIN EJERCICIO 5 ---");
    }
}
