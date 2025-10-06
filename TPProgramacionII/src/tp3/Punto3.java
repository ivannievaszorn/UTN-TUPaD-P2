/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

class Libro{
    private String titulo;
    private String autor;
    private int anioDePublicacion;
    
    public Libro(String titulo, String autor, int anioDePublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioDePublicacion = anioDePublicacion;
    }
    
    public String getTitulo(){
        return titulo;
    }    
    public String getAutor(){
        return autor;
    }    
    public int getAnioDePublicacion(){
        return anioDePublicacion;
    }
    
    public void setAnioDePublicacion(int anioDePublicacion){
        if (anioDePublicacion >0){
            this.anioDePublicacion = anioDePublicacion;
        } else {
            System.out.println("Año inválido. No se actualizó año");
        }        
    }
}

public class Punto3 {
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
