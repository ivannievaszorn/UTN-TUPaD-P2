package tp5.ejercicio13;

public class CodigoQR {
    private String valor;
    private Usuario usuario; // Asociación Unidireccional

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    // Getters
    public String getValor() { return valor; }
    public Usuario getUsuario() { return usuario; }
}