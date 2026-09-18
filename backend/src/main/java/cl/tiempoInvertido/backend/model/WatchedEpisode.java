package cl.tiempoInvertido.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "watched_episode")
public class WatchedEpisode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "episode_id")
    private Episode episode;

    private LocalDateTime watchedAt;


    //long countbyepisode
}
