package tp8.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "PENDIENTE";
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("Estado de tu pedido ha cambiado a: " + nuevoEstado);
    }

    public void realizarPago(Pago pago) {
        double total = calcularTotal();
        if (pago instanceof PagoConDescuento) {
            total = ((PagoConDescuento) pago).aplicarDescuento(total);
        }
        pago.procesarPago(total);
        cambiarEstado("PAGADO");
    }

    public String getEstado() {
        return estado;
    }
}
