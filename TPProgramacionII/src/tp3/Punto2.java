/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

class Mascota{
    private String nombre;
    private String especie;
    private int edad;
    
    public Mascota(String nombre, String especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }
    
    public void cumplirAnios(){
        edad++;
        System.out.println(nombre + " ha cumplido años. Ahora tiene " + edad + " años");
    }
}

public class Punto2 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Mascota m1 = new Mascota("Pupi", "Gato", 10);
        
        m1.mostrarInfo();
        
        m1.cumplirAnios();
        m1.mostrarInfo();
        
        m1.cumplirAnios();
        m1.mostrarInfo();
        
    }
}
