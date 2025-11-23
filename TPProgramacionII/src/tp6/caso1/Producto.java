package tp6.caso1;

/**
 * Clase que modela un Producto con su ID, nombre, precio, stock y categoría.
 */
public class Producto {
    
    // Atributos
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    // Constructor completo
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    // Constructor sobrecargado (opcional, sin cantidad inicial)
    public Producto(String id, String nombre, double precio, CategoriaProducto categoria) {
        this(id, nombre, precio, 0, categoria); // Llama al constructor completo con cantidad=0
    }

    // Getters y Setters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
    public CategoriaProducto getCategoria() { return categoria; }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    // Métodos requeridos
    
    /**
     * Muestra la información completa del producto en consola.
     */
    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Precio: $" + precio + 
                           " | Stock: " + cantidad + " | Categoría: " + categoria.name());
    }

    /**
     * Representación en cadena del objeto para depuración (cumple con las conclusiones esperadas).
     */
    @Override
    public String toString() {
        return "Producto{" + "ID=" + id + ", Nombre=" + nombre + ", Precio=$" + precio + 
               ", Stock=" + cantidad + ", Categoria=" + categoria.name() + '}';
    }
}