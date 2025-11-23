package tp7;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        // Inicialización de la clase base
        super(marca, modelo); 
        this.cantidadPuertas = cantidadPuertas;
    }

    // Sobrescritura (@Override)
    @Override
    public void mostrarInfo() {
        System.out.print("Tipo: Auto | ");
        // Reutilización del método de la superclase
        super.mostrarInfo(); 
        System.out.println("Cantidad de Puertas: " + cantidadPuertas);
    }
}