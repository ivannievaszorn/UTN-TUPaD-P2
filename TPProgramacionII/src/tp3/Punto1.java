/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    public Estudiante(String nombre, String apellido, String curso, double calificacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;        
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);        
    }
    
    public void subirCalificacion(double puntos){
        calificacion += puntos;
        System.out.println("Se ha subido la calificaciòn en: " + puntos + " puntos");
    }
    
    public void bajaCalificacion(double puntos){
        calificacion -= puntos;
        System.out.println("Se ha bajado la calificacion en: " + puntos + "puntos");
    }
   
}
public class Punto1 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Estudiante est1 = new Estudiante("Ivàn", "Nievas", "Programacion II", 9.5);
        
        est1.mostrarInfo();
        
        est1.subirCalificacion(0.5);
        est1.mostrarInfo();
        
        est1.bajaCalificacion(1.5);
        est1.mostrarInfo();

    }
}
