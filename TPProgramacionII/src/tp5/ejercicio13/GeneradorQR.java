package tp5.ejercicio13;

public class GeneradorQR {
    
    public GeneradorQR() {
        // Constructor vacío
    }

    // DEPENDENCIA DE CREACIÓN: Crea la instancia de CodigoQR DENTRO del método.
    // El GeneradorQR no guarda el CodigoQR como atributo propio.
    public void generar(String valor, Usuario usuario) {
        System.out.println("-> GeneradorQR preparando la creación del código...");
        
        // CREACIÓN: El GeneradorQR crea el objeto CodigoQR temporalmente
        CodigoQR nuevoCodigo = new CodigoQR(valor, usuario); 
        
        // Uso y Visualización del objeto creado
        System.out.println("   [QR Creado] Valor: " + nuevoCodigo.getValor());
        System.out.println("   Asociado al usuario: " + nuevoCodigo.getUsuario().getNombre());
        System.out.println("   El objeto CodigoQR 'nuevoCodigo' DEJA DE EXISTIR al salir del método.");
    }
}