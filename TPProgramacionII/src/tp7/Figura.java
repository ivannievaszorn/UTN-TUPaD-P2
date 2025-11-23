package tp7;

public abstract class Figura {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    // Método abstracto: obliga a las subclases a implementarlo
    public abstract double calcularArea(); 

    // Método concreto heredado
    public void describir() {
        System.out.print("Figura: " + nombre);
    }
}