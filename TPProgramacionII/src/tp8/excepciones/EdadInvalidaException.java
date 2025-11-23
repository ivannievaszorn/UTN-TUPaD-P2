package tp8.excepciones;

// Por convención, extendemos RuntimeException si queremos que sea No Verificada (Unchecked)
public class EdadInvalidaException extends RuntimeException {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}