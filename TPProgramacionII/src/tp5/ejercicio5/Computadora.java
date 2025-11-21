package tp5.ejercicio5;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placa; // Composición
    private Propietario propietario; // Bidireccional

    // El constructor recibe los DATOS para crear la PlacaMadre internamente
    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        
        // COMPOSICIÓN: La instancia de PlacaMadre se crea AQUÍ DENTRO
        this.placa = new PlacaMadre(modeloPlaca, chipset); 
        
        // ASOCIACIÓN BIDIRECCIONAL:
        this.propietario = propietario;
        this.propietario.setComputadora(this); // Cierra el vínculo
    }

    // Getters
    public String getMarca() { return marca; }
    public String getNumeroSerie() { return numeroSerie; }
    public PlacaMadre getPlaca() { return placa; }
    public Propietario getPropietario() { return propietario; }
    
    // Setter opcional para la marca (ejemplo)
    public void setMarca(String marca) { this.marca = marca; }
}