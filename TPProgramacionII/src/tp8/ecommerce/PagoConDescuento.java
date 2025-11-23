package tp8.ecommerce;

// Hereda el contrato Pago y añade uno nuevo
public interface PagoConDescuento extends Pago { 
    void aplicarDescuento(double porcentaje);
}