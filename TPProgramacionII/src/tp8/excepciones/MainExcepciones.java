package tp8.excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExcepciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // -----------------------------------------------------
        System.out.println("--- 1. División Segura (ArithmeticException) ---");
        dividir(scanner);

        // -----------------------------------------------------
        System.out.println("\n--- 2. Conversión de Cadena (NumberFormatException) ---");
        convertir(scanner);
        
        // -----------------------------------------------------
        System.out.println("\n--- 3. Excepción Personalizada (EdadInvalidaException) ---");
        validarEdad(150); // Lanza excepción
        validarEdad(25);  // Válido

        // -----------------------------------------------------
        System.out.println("\n--- 4. Lectura de Archivo (try-with-resources) ---");
        // Asegúrate de tener un archivo llamado 'config.txt' o el programa lanzará FileNotFoundException
        leerConTryWithResources("config.txt"); 

        scanner.close();
    }

    // Tarea 1: División Segura
    public static void dividir(Scanner sc) {
        try {
            System.out.print("Dividendo: ");
            int a = sc.nextInt();
            System.out.print("Divisor: ");
            int b = sc.nextInt();
            
            int resultado = a / b; // Aquí puede ocurrir ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("❌ Error: No se puede dividir por cero.");
            sc.nextLine(); // Limpiar el buffer si hay error de entrada
        } catch (InputMismatchException e) {
            System.err.println("❌ Error: Debe ingresar números enteros.");
            sc.nextLine(); 
        }
    }

    // Tarea 2: Conversión de Cadena a Número
    public static void convertir(Scanner sc) {
        sc.nextLine(); // Consumir el salto de línea anterior
        System.out.print("Ingresa texto para convertir a número: ");
        String texto = sc.nextLine();

        try {
            int numero = Integer.parseInt(texto); // Aquí puede ocurrir NumberFormatException
            System.out.println("Conversión exitosa: " + numero);
        } catch (NumberFormatException e) {
            System.err.println("❌ Error: La cadena ingresada no es un número entero válido.");
        }
    }
    
    // Tarea 3: Excepción Personalizada
    public static void validarEdad(int edad) {
        try {
            if (edad < 0 || edad > 120) {
                // Lanzamos la excepción personalizada
                throw new EdadInvalidaException("La edad debe estar entre 0 y 120. Valor ingresado: " + edad); 
            }
            System.out.println("✅ Edad " + edad + " validada correctamente.");
        } catch (EdadInvalidaException e) {
            System.err.println("🚨 Error de negocio: " + e.getMessage());
        }
    }

    // Tarea 4: Uso de try-with-resources
    public static void leerConTryWithResources(String nombreArchivo) {
        // try-with-resources asegura que BufferedReader se cierre automáticamente.
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            System.out.println("Leyendo archivo: " + nombreArchivo);
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println("-> " + linea);
            }
        } catch (java.io.FileNotFoundException e) {
            System.err.println("❌ Error: Archivo no encontrado. Verifique la ruta."); // Excepción más específica
        } catch (IOException e) {
            System.err.println("❌ Error de lectura/escritura: " + e.getMessage()); // Excepción más genérica de I/O
        }
    }
}