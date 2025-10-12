/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.punto4;

/**
 *
 * @author djgri
 */

class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallina(String idGallina, int edad, int huevosPuestos){
        this.idGallina = idGallina;
        this.edad  = edad;
        this.huevosPuestos = huevosPuestos;
    }    
    
    public void ponerHuevo(){
        huevosPuestos++;
        System.out.println(idGallina + " ha puesto un huevo");
    }
    
    public void envejecer(){
        edad++;
        System.out.println(idGallina + " ahora tiene " + edad + " años");
    }
    
    public void mostrarEstado(){
        System.out.println("------------");
        System.out.println("Estado de Gallina: " + idGallina);
        System.out.println("ID Gallina: " + idGallina);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("------------");
    }        
}
