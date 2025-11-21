package tp5.ejercicio12;

public class Impuesto {
    private double monto;
    private Contribuyente contribuyente; // Asociación Unidireccional

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    // Getters
    public double getMonto() { return monto; }
    public Contribuyente getContribuyente() { return contribuyente; }
}