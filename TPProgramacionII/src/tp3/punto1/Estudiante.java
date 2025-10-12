/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.punto1;


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
