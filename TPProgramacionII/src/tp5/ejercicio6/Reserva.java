package tp5.ejercicio6;

public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente; // Asociación Unidireccional
    private Mesa mesa;       // Agregación

    // Constructor que recibe objetos ya existentes
    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    // Getters
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public Cliente getCliente() { return cliente; }
    public Mesa getMesa() { return mesa; }
}