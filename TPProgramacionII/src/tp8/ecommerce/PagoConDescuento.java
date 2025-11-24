package tp8.ecommerce;

// Hereda el contrato Pago y añade uno nuevo
public interface PagoConDescuento extends Pago {
    // Ahora devuelve el monto final con el descuento aplicado
    double aplicarDescuento(double monto);
}