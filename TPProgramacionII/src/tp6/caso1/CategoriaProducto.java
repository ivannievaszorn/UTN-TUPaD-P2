package tp6.caso1;

/**
 * Clase Enum que define las categorías de productos.
 * Incluye un constructor y un método getter para la descripción.
 */
public enum CategoriaProducto {
    
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");
    
    private final String descripcion;
    
    // Constructor (debe ser privado o package-private)
    CategoriaProducto(String descripcion) { 
        this.descripcion = descripcion;
    }
    
    // Getter para acceder a la descripción
    public String getDescripcion() { 
        return descripcion;
    }
}