package TP5.ejercicio1;

public class Foto {
    private String imagen;
    private String formato;

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }
    public String getImagen() { return imagen; }
    public String getFormato() { return formato; }
    // No necesita setters si es parte de Composición (solo se configura al nacer)
}

