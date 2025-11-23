package tp8.ecommerce;

// Implementa Notificable
public class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Implementación del contrato Notificable
    @Override
    public void notificar(String mensaje) {
        System.out.println("🤖 Notificación a " + nombre + " (" + email + "): " + mensaje);
    }
}