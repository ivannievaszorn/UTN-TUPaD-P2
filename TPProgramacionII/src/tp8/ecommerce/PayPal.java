package tp8.ecommerce;

// Implementa la interfaz extendida
public class PayPal implements PagoConDescuento {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("📧 Procesando pago de $" + monto + " con PayPal (" + email + ")");
    }

    // Implementación del método de PagoConDescuento
    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("✅ Se aplica un descuento de $" + porcentaje + " por usar PayPal.");
    }
}