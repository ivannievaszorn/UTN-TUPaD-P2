package tp5.ejercicio4;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // Bidireccional
    private Banco banco;     // Agregación

    // Constructor recibe objetos ya existentes
    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco; // Agregación: Se asocia a un Banco existente
        
        this.cliente = cliente;
        this.cliente.setTarjeta(this); // Cierra el vínculo bidireccional
    }

    // Getters
    public String getNumero() { return numero; }
    public String getFechaVencimiento() { return fechaVencimiento; }
    public Cliente getCliente() { return cliente; }
    public Banco getBanco() { return banco; }
    
    // Setter opcional para la fecha
    public void setFechaVencimiento(String fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }
}