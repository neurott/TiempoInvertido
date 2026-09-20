package cl.tiempoInvertido.backend.repository;

import cl.tiempoInvertido.backend.model.WatchedEpisode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchedEpisodeRepository extends JpaRepository<WatchedEpisode, Long> {
    long countByEpisodeId(Long episodeId);
}
