package tp5.ejercicio6;

public class Mesa {
    private int numero;
    private int capacidad;
    
    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    // Getters
    public int getNumero() { return numero; }
    public int getCapacidad() { return capacidad; }
}