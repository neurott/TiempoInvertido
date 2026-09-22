package cl.tiempoInvertido.backend.service;

import cl.tiempoInvertido.backend.model.Episode;
import cl.tiempoInvertido.backend.repository.EpisodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EpisodeService {

    private final EpisodeRepository episodeRepo;

    public List<Episode> findAll(){
        return episodeRepo.findAll();
    }

    public Episode findById(Long id){
        return episodeRepo.findById(id).orElseThrow(() -> new RuntimeException("Episode not found: " + id));
    }

    public List<Episode> findByShowId(Long showId){
        return episodeRepo.findByShowId(showId);
    }

    public Episode save(Episode episode){
        return episodeRepo.save(episode);
    }

    public void deleteById(Long id){
        episodeRepo.deleteById(id);
    }
}
