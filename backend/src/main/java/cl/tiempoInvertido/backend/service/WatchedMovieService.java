package cl.tiempoInvertido.backend.service;

import cl.tiempoInvertido.backend.exception.MovieNotFoundException;
import cl.tiempoInvertido.backend.model.Movie;
import cl.tiempoInvertido.backend.model.WatchedMovie;
import cl.tiempoInvertido.backend.repository.MovieRepository;
import cl.tiempoInvertido.backend.repository.WatchedMovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WatchedMovieService {

    private final WatchedMovieRepository watchedMovieRepo;
    private final MovieRepository movieRepo;

    public List<WatchedMovie> findAll(){
        return watchedMovieRepo.findAll();
    }

    public WatchedMovie markAsWatched(Long movieId){
        Movie movie = movieRepo.findById(movieId)
                .orElseThrow(() -> new MovieNotFoundException(movieId));

        WatchedMovie watched = new WatchedMovie();
        watched.setMovie(movie);
        watched.setWatchedAt(LocalDateTime.now());
        return watchedMovieRepo.save(watched);
    }

    public long countWatches(Long movieId){
        return watchedMovieRepo.countByMovieId(movieId);
    }

    public void deleteById(Long id){
        watchedMovieRepo.deleteById(id);
    }
}
