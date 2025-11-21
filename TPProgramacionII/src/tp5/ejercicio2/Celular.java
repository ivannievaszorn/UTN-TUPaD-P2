package TP5.ejercicio2;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // Agregación
    private Usuario usuario; // Asociación Bidireccional

    // AGREGACIÓN: Recibe el objeto Bateria ya creado
    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        
        this.usuario = usuario;
        this.usuario.setCelular(this);
    }
    
    public String getImei() { return imei; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public Bateria getBateria() { return bateria; }
    public Usuario getUsuario() { return usuario; }
    
    // Setter opcional para Agregación (cambiar la batería)
    public void setBateria(Bateria bateria) { this.bateria = bateria; } 
}