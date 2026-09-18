package cl.tiempoInvertido.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "episode")
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;

    @Column(unique = true)
    private Long tmdbId;

    private Integer episodeNumber;

    private Integer seasonNumber;

    private String title;

    private LocalDate airDate;



}
