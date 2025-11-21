package TP5.ejercicio2;

public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; // Bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }

    public void setCelular(Celular celular) { this.celular = celular; }
    public Celular getCelular() { return celular; }
}