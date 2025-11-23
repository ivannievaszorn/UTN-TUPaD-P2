package tp8.ecommerce;

import java.util.ArrayList;
import java.util.List;

// Implementa Pagable (para calcular el total)
public class Pedido implements Pagable {
    private List<Producto> productos;
    private Cliente cliente;
    private String estado;
    private Pago tipoPago; // Objeto Pago polimórfico

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "PENDIENTE";
        this.tipoPago = null;
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }
    
    // Implementación de Pagable
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal(); // Polimorfismo: usar el total del producto
        }
        return total;
    }
    
    // Método que utiliza la interfaz Notificable
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        String mensaje = "Estado de tu pedido ha cambiado a: " + nuevoEstado;
        cliente.notificar(mensaje); // Polimorfismo: el cliente recibe la notificación
    }
    
    // Método que utiliza la interfaz Pago
    public void realizarPago(Pago pago, double montoDescuento) {
        double totalFinal = calcularTotal();
        this.tipoPago = pago;

        // Comprueba si el objeto Pago implementa PagoConDescuento
        if (pago instanceof PagoConDescuento) {
            // Downcasting seguro para acceder al método específico
            ((PagoConDescuento) pago).aplicarDescuento(montoDescuento);
            totalFinal -= montoDescuento;
        }

        System.out.println("Total a pagar: $" + totalFinal);
        pago.procesarPago(totalFinal); // Polimorfismo: se llama al método procesarPago()
        cambiarEstado("PAGADO");
    }

    public String getEstado() {
        return estado;
    }
}