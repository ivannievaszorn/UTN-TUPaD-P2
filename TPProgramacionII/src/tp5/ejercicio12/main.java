package tp5.ejercicio12;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        System.out.println("--- PRUEBA: EJERCICIO 12 (Dependencia de Uso) ---");

        // 1. Crear el Contribuyente
        Contribuyente miContr = new Contribuyente("Ivan Nievas Zorn", "20-31231132-8");
        
        // 2. Crear el Impuesto, asociando al Contribuyente
        Impuesto miImpuesto = new Impuesto(4500.75, miContr);
        
        // 3. Crear la Calculadora
        Calculadora miCalculadora = new Calculadora();

        System.out.println("\n--- PRUEBA DE ASOCIACIÓN ---");
        System.out.println("Impuesto creado de: " + miImpuesto.getContribuyente().getNombre());
        
        System.out.println("\n--- PRUEBA DE DEPENDENCIA ---");
        // Se llama al método, se le pasa el impuesto (Dependencia)
        miCalculadora.calcular(miImpuesto);

        System.out.println("\n--- FIN EJERCICIO 12 ---");
    }
}