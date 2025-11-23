package tp6.caso1;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Clase que gestiona la colección dinámica de productos (Inventario).
 */
public class Inventario {
    
    private ArrayList<Producto> productos;

    public Inventario() {
        // Inicialización del ArrayList
        this.productos = new ArrayList<>();
    }

    // 1. agregarProducto(Producto p)
    public void agregarProducto(Producto p) {
        // Opcional: Evitar IDs duplicados (aunque la consigna no lo pide, es buena práctica)
        if (buscarProductoPorId(p.getId()) == null) {
            this.productos.add(p);
            System.out.println("✅ Producto agregado: " + p.getNombre());
        } else {
            System.out.println("❌ ERROR: Ya existe un producto con el ID: " + p.getId());
        }
    }

    // 2. listarProductos()
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("\n--- 🚫 INVENTARIO VACÍO ---");
            return;
        }
        System.out.println("\n--- 📋 LISTA COMPLETA DE PRODUCTOS ---");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    // 3. buscarProductoPorId(String id)
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) { // Comparación ignorando mayúsculas/minúsculas
                return p;
            }
        }
        return null; // Devuelve null si no se encuentra
    }

    // 4. eliminarProducto(String id)
    public boolean eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            this.productos.remove(p);
            System.out.println("🗑️ Producto eliminado (ID: " + id + ", Nombre: " + p.getNombre() + ")");
            return true;
        } else {
            System.out.println("❌ ERROR: No se encontró producto con ID: " + id);
            return false;
        }
    }

    // 5. actualizarStock(String id, int nuevaCantidad)
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("🔄 Stock actualizado para " + p.getNombre() + ". Nuevo stock: " + nuevaCantidad);
            return true;
        } else {
            System.out.println("❌ ERROR: No se encontró producto con ID: " + id);
            return false;
        }
    }

    // 6. filtrarPorCategoria(CategoriaProducto categoria)
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    // 7. obtenerTotalStock()
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    // 8. obtenerProductoConMayorStock()
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        // Usamos el método de la API de Collections para encontrar el producto con la cantidad máxima
        return productos.stream()
                        .max(Comparator.comparing(Producto::getCantidad))
                        .orElse(null);
    }
    
    // 9. filtrarProductosPorPrecio(double min, double max)
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            double precio = p.getPrecio();
            if (precio >= min && precio <= max) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    // 10. mostrarCategoriasDisponibles()
    public void mostrarCategoriasDisponibles() {
        System.out.println("\n--- 🏷️ CATEGORÍAS DISPONIBLES ---");
        // Utilizamos el método values() del Enum para obtener todas las constantes
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("- " + categoria.name() + ": " + categoria.getDescripcion());
        }
    }
}