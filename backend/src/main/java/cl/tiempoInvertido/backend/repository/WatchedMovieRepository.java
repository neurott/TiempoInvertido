package cl.tiempoInvertido.backend.repository;

import cl.tiempoInvertido.backend.model.WatchedMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchedMovieRepository extends JpaRepository<WatchedMovie, Long> {
    long countByMovieId(Long movieId);
}
