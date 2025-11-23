package tp6.caso1;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        // Configuración UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Inventario inventario = new Inventario();
        
        System.out.println("==================================================");
        System.out.println("        INICIO DEL SISTEMA DE STOCK (TP6)");
        System.out.println("==================================================");

        // Tarea 1: Crear y agregar al menos 5 productos
        System.out.println("\n--- TAREA 1: AGREGAR PRODUCTOS ---");
        inventario.agregarProducto(new Producto("P001", "Smartphone X", 2500.0, 15, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P002", "Camiseta Algodón", 850.5, 50, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P003", "Pack Galletas", 150.0, 100, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P004", "Licuadora", 1500.0, 10, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("P005", "Portátil Z", 3500.0, 5, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P006", "Pantalón Denim", 1800.0, 30, CategoriaProducto.ROPA));


        // Tarea 2: Listar todos los productos
        inventario.listarProductos();

        // Tarea 3: Buscar un producto por ID
        String idBuscado = "P004";
        System.out.println("\n--- TAREA 3: BUSCAR PRODUCTO POR ID (" + idBuscado + ") ---");
        Producto pBuscado = inventario.buscarProductoPorId(idBuscado);
        if (pBuscado != null) {
            pBuscado.mostrarInfo();
        } else {
            System.out.println("Producto con ID " + idBuscado + " no encontrado.");
        }

        // Tarea 4: Filtrar por categoría
        CategoriaProducto catFiltro = CategoriaProducto.ELECTRONICA;
        System.out.println("\n--- TAREA 4: FILTRAR POR CATEGORÍA (" + catFiltro.name() + ") ---");
        ArrayList<Producto> electronicos = inventario.filtrarPorCategoria(catFiltro);
        if (!electronicos.isEmpty()) {
            for (Producto p : electronicos) {
                p.mostrarInfo();
            }
        } else {
            System.out.println("No hay productos en la categoría " + catFiltro.name());
        }

        // Tarea 5: Eliminar un producto por su ID
        String idEliminar = "P003";
        System.out.println("\n--- TAREA 5: ELIMINAR PRODUCTO (" + idEliminar + ") ---");
        inventario.eliminarProducto(idEliminar);
        inventario.listarProductos(); // Listar restantes

        // Tarea 6: Actualizar el stock
        String idActualizar = "P002";
        int nuevoStock = 75;
        System.out.println("\n--- TAREA 6: ACTUALIZAR STOCK DE " + idActualizar + " ---");
        inventario.actualizarStock(idActualizar, nuevoStock);
        inventario.listarProductos();

        // Tarea 7: Mostrar el total de stock disponible
        System.out.println("\n--- TAREA 7: STOCK TOTAL ---");
        System.out.println("🛒 Total de unidades en stock: " + inventario.obtenerTotalStock());

        // Tarea 8: Obtener y mostrar el producto con mayor stock
        System.out.println("\n--- TAREA 8: PRODUCTO CON MAYOR STOCK ---");
        Producto maxStock = inventario.obtenerProductoConMayorStock();
        if (maxStock != null) {
            System.out.print("👑 Mayor Stock: ");
            maxStock.mostrarInfo();
        }

        // Tarea 9: Filtrar productos por precio
        double min = 1000.0;
        double max = 3000.0;
        System.out.println("\n--- TAREA 9: FILTRAR PRODUCTOS POR PRECIO (Entre $" + min + " y $" + max + ") ---");
        ArrayList<Producto> filtradosPrecio = inventario.filtrarProductosPorPrecio(min, max);
        if (!filtradosPrecio.isEmpty()) {
            for (Producto p : filtradosPrecio) {
                p.mostrarInfo();
            }
        } else {
            System.out.println("No se encontraron productos en ese rango de precios.");
        }

        // Tarea 10: Mostrar categorías disponibles con descripciones
        inventario.mostrarCategoriasDisponibles();
        
        System.out.println("\n==================================================");
        System.out.println("        FIN DEL SISTEMA DE STOCK (TP6)");
        System.out.println("==================================================");
    }
}