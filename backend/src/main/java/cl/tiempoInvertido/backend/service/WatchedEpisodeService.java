package cl.tiempoInvertido.backend.service;

import cl.tiempoInvertido.backend.model.Episode;
import cl.tiempoInvertido.backend.model.WatchedEpisode;
import cl.tiempoInvertido.backend.repository.EpisodeRepository;
import cl.tiempoInvertido.backend.repository.WatchedEpisodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WatchedEpisodeService {

    private final WatchedEpisodeRepository watchedEpisodeRepo;
    private final EpisodeRepository episodeRepo;

    public List<WatchedEpisode> findAll(){
        return watchedEpisodeRepo.findAll();
    }

    public WatchedEpisode markAsWatched(Long episodeId){
        Episode episode = episodeRepo
                .findById(episodeId)
                .orElseThrow(() -> new RuntimeException("EPISODE NOT FOUND: " + episodeId));


        WatchedEpisode watched = new WatchedEpisode();
        watched.setEpisode(episode);
        watched.setWatchedAt(LocalDateTime.now());

        return watchedEpisodeRepo.save(watched);
    }

    public long countWatches(Long episodeId){
        return watchedEpisodeRepo.countByEpisodeId(episodeId);
    }

    public void deleteById(Long episodeId){
        watchedEpisodeRepo.deleteById(episodeId);
    }


}
