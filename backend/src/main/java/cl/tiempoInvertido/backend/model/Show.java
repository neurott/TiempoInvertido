package cl.tiempoInvertido.backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "shows")
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private Long tmdbId;

    private String title;

    private String posterPath;

    //Esto cambia pq en movies es release date, y acá sería first air date
    private LocalDate firstAirDate;

    private String overview;

}
