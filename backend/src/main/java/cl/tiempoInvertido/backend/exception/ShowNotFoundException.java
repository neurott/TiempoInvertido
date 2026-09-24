package cl.tiempoInvertido.backend.exception;

public class ShowNotFoundException extends RuntimeException {
    public ShowNotFoundException(Long id) {
        super("Show not found " + id);
    }
}
