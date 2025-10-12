/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.punto3;

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