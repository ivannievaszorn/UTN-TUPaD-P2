package tp8.ecommerce;

public class PayPal implements PagoConDescuento {
    private String email;
    private double porcentajeDescuento; // Porcentaje de descuento

    public PayPal(String email, double porcentajeDescuento) {
        this.email = email;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con PayPal (" + email + ")");
    }

    @Override
    public double aplicarDescuento(double monto) {
        double montoFinal = monto - (monto * porcentajeDescuento / 100);
        System.out.println("Se aplica un descuento de " + porcentajeDescuento + "% con PayPal. Monto final: $" + montoFinal);
        return montoFinal;
    }
}
