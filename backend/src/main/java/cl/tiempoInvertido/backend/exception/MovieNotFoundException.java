package cl.tiempoInvertido.backend.exception;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException(Long id) {
        super("Movie not found " + id);
    }
}
