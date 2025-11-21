package TP5.ejercicio2;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("--- INICIO PRUEBA: EJERCICIO 2 (Agregación y Bidireccional) ---");

        // 1. Crear la parte que EXISTE INDEPENDIENTEMENTE (Agregación)
        Bateria miBateria = new Bateria("Li-Ion X123", 5000);
        System.out.println("-> Batería creada de forma independiente: " + miBateria.getModelo());

        // 2. Crear el Usuario
        Usuario miUsuario = new Usuario("Ivan Nievas Zorn", "31923209");

        // 3. Crear el Celular pasándole las partes ya existentes
        //    (La lógica en Celular.java establece la relación de agregación y la bidireccionalidad)
        Celular miCelular = new Celular(
            "987654321", 
            "Samsung", 
            "Galaxy A54", 
            miBateria, // Objeto Bateria (Agregación)
            miUsuario  // Objeto Usuario (Asociación Bidireccional)
        );

        System.out.println("\n--- PRUEBA DE AGREGACIÓN ---");
        System.out.println("Celular: " + miCelular.getMarca() + " " + miCelular.getModelo());
        // Acceso: Celular -> Batería
        System.out.println("-> Batería asociada: " + miCelular.getBateria().getModelo() + 
                           " (" + miCelular.getBateria().getCapacidad() + "mAh)");
        
        System.out.println("\n--- PRUEBA DE BIDIRECCIONALIDAD ---");
        // Prueba 1: Celular -> Usuario
        System.out.println("Dueño del celular (por Celular): " + miCelular.getUsuario().getNombre());
        
        // Prueba 2: Usuario -> Celular (La bidireccionalidad)
        System.out.println("Celular asociado a " + miUsuario.getNombre() + 
                           " (por Usuario): " + miUsuario.getCelular().getModelo());

        System.out.println("\n--- FIN EJERCICIO 2 ---");
    }
}