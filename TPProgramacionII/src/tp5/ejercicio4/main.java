package tp5.ejercicio4;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("--- PRUEBA: EJERCICIO 4 (Bidireccional y Agregación) ---");

        // 1. Crear las partes sueltas que serán asociadas
        Banco miBanco = new Banco("Banco Santander", "30-50000845-4");
        Cliente miCliente = new Cliente("Cynthia Ocaranza", "33252233");
        
        System.out.println("-> Banco creado: " + miBanco.getNombre());
        System.out.println("-> Cliente creado: " + miCliente.getNombre());

        // 2. Crear la Tarjeta, asociando las partes (Agregación y Bidireccionalidad)
        TarjetaDeCredito miTarjeta = new TarjetaDeCredito(
            "4567-9876-1234-5432", 
            "10/2028", 
            miCliente, 
            miBanco
        );

        System.out.println("\n--- PRUEBA DE AGREGACIÓN ---");
        System.out.println("Tarjeta N°: " + miTarjeta.getNumero());
        // Acceso: Tarjeta -> Banco (Agregación)
        System.out.println("-> Pertenece al Banco: " + miTarjeta.getBanco().getNombre());
        
        System.out.println("\n--- PRUEBA DE BIDIRECCIONALIDAD ---");
        // Prueba 1: Tarjeta -> Cliente
        System.out.println("Titular de la tarjeta (por Tarjeta): " + miTarjeta.getCliente().getNombre());
        
        // Prueba 2: Cliente -> Tarjeta (Vínculo cerrado)
        System.out.println("Tarjeta de " + miCliente.getNombre() + 
                           " (por Cliente): " + miCliente.getTarjeta().getNumero());

        System.out.println("\n--- FIN EJERCICIO 4 ---");
    }
}
