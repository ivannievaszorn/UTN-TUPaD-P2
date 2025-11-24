package tp8.ecommerce;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class MainECommerce {

    public static void main(String[] args) {
        // Configuración UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));      
        // Crear cliente
        Cliente cliente = new Cliente("Agustina Diaz", "agus@gmail.com");

        // Crear productos
        Producto p1 = new Producto("Camisa", 100);
        Producto p2 = new Producto("Pantalón", 200);

        // Crear pedido
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        System.out.println("\n--- Pedido inicial ---");
        System.out.println("Total del pedido: $" + pedido.calcularTotal());
        System.out.println("Estado: " + pedido.getEstado());

        // ------------------------
        // Pago con PayPal con 10% de descuento
        PayPal paypal = new PayPal("agus@gmail.com", 10);
        System.out.println("\n--- Realizando pago con PayPal ---");
        pedido.realizarPago(paypal);

        System.out.println("Estado final del pedido: " + pedido.getEstado());

        // ------------------------
        // Nuevo pedido con tarjeta de crédito (sin descuento)
        Pedido pedido2 = new Pedido(cliente);
        pedido2.agregarProducto(new Producto("Zapatos", 150));
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456");

        System.out.println("\n--- Pedido con Tarjeta de Crédito ---");
        System.out.println("Total del pedido: $" + pedido2.calcularTotal());
        pedido2.realizarPago(tarjeta);
        System.out.println("Estado final del pedido: " + pedido2.getEstado());
    }
}
