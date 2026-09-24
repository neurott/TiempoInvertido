package cl.tiempoInvertido.backend.exception;

public class EpisodeNotFoundException extends RuntimeException {
    public EpisodeNotFoundException(Long id) {
        super("Episode not found " + id);
    }
}
