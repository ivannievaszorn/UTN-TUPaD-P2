package TP5.ejercicio1;

public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;       // Composición
    private Titular titular; // Asociación Bidireccional

    public Pasaporte(String numero, String fechaEmision, String img, String formato, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        
        // COMPOSICIÓN: La instancia de Foto se crea aquí dentro
        this.foto = new Foto(img, formato); 
        
        // ASOCIACIÓN BIDIRECCIONAL:
        this.titular = titular;
        this.titular.setPasaporte(this); // Cierra el vínculo
    }
    
    public String getNumero() { return numero; }
    public String getFechaEmision() { return fechaEmision; }
    public Foto getFoto() { return foto; }
    public Titular getTitular() { return titular; }
}
