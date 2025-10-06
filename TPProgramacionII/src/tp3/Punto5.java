/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;


import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

class NaveEspacial {
    private String nombre;
    private int combustible;
    private int consumoDespegue;
    
    public NaveEspacial(String nombre, int combustible, int consumoDespegue){
        this.nombre = nombre;
        this.combustible = combustible;
        this.consumoDespegue = consumoDespegue;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getCombustible(){
        return combustible;
    }
    
    public void mostrarEstado(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible);
    }
    
    public void despegar() {
        combustible -= consumoDespegue;
        System.out.println("Nave despegada. Combustible actual: " + combustible + " unidades");
    }
    
    public void avanzar(int distancia){
        int consumoPorUnidad = 1;
        int consumoViaje = distancia * consumoPorUnidad;
        int totalNecesario = consumoDespegue + consumoViaje;

        if (combustible >= totalNecesario){
            despegar();             
            combustible -= consumoViaje; 
            System.out.println("La nave avanzó " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            int combustibleFaltante = totalNecesario - combustible;
            System.out.println("No hay suficiente combustible para despegar y avanzar " + distancia + " unidades. "
                    + "Faltan " + combustibleFaltante + " unidades de combustible.");
        }       
    }
    
    public void recargarCombustible(int cantidad){
        int combustibleMaximo = 100;
        if (cantidad >0){
             if ((cantidad + combustible) <= combustibleMaximo){
                combustible += cantidad;
                System.out.println("Nave recargada con: " + cantidad + ". Combustible actual: " + combustible);
            } else {
                System.out.println("No se puede recargar por encima de la capacidad de 100 unidades");
            }
        } else {
            System.out.println("No se puede ingresar un numero negativo para la carga de combustible");
        }
    }
}


public class Punto5 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        NaveEspacial nave1 = new NaveEspacial("Cassini", 50, 10);
        
        nave1.mostrarEstado();
        nave1.avanzar(65);
        nave1.recargarCombustible(25);
        nave1.avanzar(65);
        nave1.mostrarEstado();
    }        
}
