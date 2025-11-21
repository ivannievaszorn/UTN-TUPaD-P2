package tp5.ejercicio8;

public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario; // Agregación

    // Recibe el Usuario ya existente
    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario; // Agregación: Guarda la referencia al objeto Usuario
    }

    // Getters
    public String getCodigoHash() { return codigoHash; }
    public String getFecha() { return fecha; }
    public Usuario getUsuario() { return usuario; }
}