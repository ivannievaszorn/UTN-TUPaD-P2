package tp7;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        // Configuración UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));        
        // --- TAREA 1: VEHÍCULOS Y HERENCIA BÁSICA ---
        System.out.println("=== 1. VEHÍCULOS ===");
        Auto miAuto = new Auto("Toyota", "Corolla", 4);
        miAuto.mostrarInfo();
        System.out.println("--------------------");

        // --- TAREA 2: FIGURAS GEOMÉTRICAS Y POLIMORFISMO ---
        System.out.println("=== 2. FIGURAS GEOMÉTRICAS (Polimorfismo) ===");
        
        // Array de tipo Figura (clase abstracta)
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo(5.0)); // Upcasting
        figuras.add(new Rectangulo(4.0, 6.0)); // Upcasting
        
        for (Figura f : figuras) {
            f.describir();
            System.out.printf(" | Área calculada: %.2f\n", f.calcularArea());
        }
        System.out.println("--------------------");
        
        // --- TAREA 3: EMPLEADOS Y INSTANCEOF ---
        System.out.println("=== 3. EMPLEADOS (Upcasting / Instanceof) ===");
        
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", "1001", 30000.0));
        empleados.add(new EmpleadoTemporal("Beto", "1002", 160, 150.0));
        empleados.add(new EmpleadoPlanta("Cami", "1003", 32000.0));

        for (Empleado e : empleados) {
            System.out.printf("Empleado %s (Legajo %s): Sueldo = $%.2f", 
                                e.nombre, e.legajo, e.calcularSueldo()); // Polimorfismo
            
            // Uso de instanceof para clasificación/downcasting
            if (e instanceof EmpleadoPlanta) {
                System.out.println(" -> CLASIFICADO: Planta");
                // (Se podría hacer downcasting aquí si fuera necesario un método específico)
            } else if (e instanceof EmpleadoTemporal) {
                 System.out.println(" -> CLASIFICADO: Temporal");
            }
        }
        System.out.println("--------------------");
        
        // --- TAREA 4: ANIMALES Y COMPORTAMIENTO SOBRESCRITO ---
        System.out.println("=== 4. ANIMALES (Sobrescritura Polimórfica) ===");
        
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro()); // Upcasting
        animales.add(new Gato());
        animales.add(new Animal("Genérico")); // Objeto de la clase base
        
        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido(); // Ejecuta la versión sobrescrita
        }
    }
}