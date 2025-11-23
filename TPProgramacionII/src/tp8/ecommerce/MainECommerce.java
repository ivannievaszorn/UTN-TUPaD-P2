package tp8.ecommerce;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class MainECommerce {
    public static void main(String[] args) {
        // Configuración UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));    
        System.out.println("--- TP8: Parte 1 - E-Commerce y Interfaces ---");

        // 1. Creación de entidades
        Cliente cliente = new Cliente("Sofia Perez", "sofia.p@mail.com");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Laptop", 1200.00));
        pedido.agregarProducto(new Producto("Mouse Inalámbrico", 25.00));
        
        System.out.println("Pedido inicial. Total: $" + pedido.calcularTotal());

        // 2. Pago con Tarjeta (Implementa Pago)
        System.out.println("\n--- Pago con Tarjeta (Pago simple) ---");
        Pago tarjeta = new TarjetaCredito("4567-XXXX");
        
        // Uso de Pago polimórfico
        // El descuento se ignora ya que TarjetaCredito NO implementa PagoConDescuento
        pedido.realizarPago(tarjeta, 0.0); 
        
        // 3. Notificación al cliente (Implementa Notificable)
        pedido.cambiarEstado("ENVIADO");

        // 4. Nuevo Pedido para demostrar Pago con Descuento
        Pedido pedido2 = new Pedido(cliente);
        pedido2.agregarProducto(new Producto("Auriculares Pro", 150.00));
        
        System.out.println("\n--- Pago con PayPal (PagoConDescuento) ---");
        Pago payPal = new PayPal("sofia.p@mail.com");
        
        // Uso de Pago polimórfico que incluye descuento
        pedido2.realizarPago(payPal, 15.00); 
        pedido2.cambiarEstado("ENTREGADO");
    }
}