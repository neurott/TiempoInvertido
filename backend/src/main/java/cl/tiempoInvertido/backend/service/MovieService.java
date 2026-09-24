package cl.tiempoInvertido.backend.service;

import cl.tiempoInvertido.backend.exception.MovieNotFoundException;
import cl.tiempoInvertido.backend.model.Movie;
import cl.tiempoInvertido.backend.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepo;

    public List<Movie> findAll(){
        return movieRepo.findAll();
    }

    public Movie findById(Long id){
        return movieRepo.findById(id).orElseThrow(() -> new MovieNotFoundException(id));
    }

    public Movie save(Movie movie){
        return movieRepo.save(movie);
    }

    public void deleteById(Long id){
        movieRepo.deleteById(id);
    }

}
