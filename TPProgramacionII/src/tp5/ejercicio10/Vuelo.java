package tp5.ejercicio10;

public class Vuelo {
    private String numeroVuelo;
    private String origen;
    private String destino;
    private Avion avion; // Agregación
    private Piloto piloto; // Bidireccional

    // Constructor que recibe objetos ya existentes
    public Vuelo(String numeroVuelo, String origen, String destino, Avion avion, Piloto piloto) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.avion = avion; // Agregación
        
        this.piloto = piloto;
        this.piloto.setVuelo(this); // Cierra el vínculo bidireccional
    }

    // Getters
    public String getNumeroVuelo() { return numeroVuelo; }
    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public Avion getAvion() { return avion; }
    public Piloto getPiloto() { return piloto; }
}