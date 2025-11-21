package tp5.ejercicio10;

public class Avion {
    private String matricula;
    private String modelo;

    public Avion(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    // Getters
    public String getMatricula() { return matricula; }
    public String getModelo() { return modelo; }
}