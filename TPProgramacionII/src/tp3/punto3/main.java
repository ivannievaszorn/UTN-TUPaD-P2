/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.punto3;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Libro libro1 = new Libro("Interstellar: La física del futuro", "Kip Thorne", 2014);
        
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Año de Publicación: " + libro1.getAnioDePublicacion());
        
        // Intentaremos modificar año con numero negativo
        System.out.println("--------------------");
        System.out.println("Intento de setear año negativo '-2014': ");
        libro1.setAnioDePublicacion(-2014);
        System.out.println("--------------------");
        System.out.println("Intento de setear año positio '2025': ");
        libro1.setAnioDePublicacion(2025);             
        System.out.println("Año actualizado a: " + libro1.getAnioDePublicacion());
        
        System.out.println("--------------------");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Año de Publicación: " + libro1.getAnioDePublicacion());
        System.out.println("--------------------");
    }
}
