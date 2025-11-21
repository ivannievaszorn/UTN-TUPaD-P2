package tp5.ejercicio7;

public class Motor {
    private String tipo;
    private String numeroSerie;

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    // Getters
    public String getTipo() { return tipo; }
    public String getNumeroSerie() { return numeroSerie; }
}