package cl.tiempoInvertido.backend.controller;

import cl.tiempoInvertido.backend.model.Episode;
import cl.tiempoInvertido.backend.service.EpisodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/episodes")
@RequiredArgsConstructor
public class EpisodeController {

    private final EpisodeService episodeService;


    @GetMapping
    public ResponseEntity<List<Episode>> findAll(){
        return ResponseEntity.ok(episodeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Episode> findById(@PathVariable Long id) {
        return ResponseEntity.ok(episodeService.findById(id));
    }

    @GetMapping("/show/{showId}")
    public ResponseEntity<List<Episode>> findByShowId(@PathVariable Long showId){
        return ResponseEntity.ok(episodeService.findByShowId(showId));
    }

    @PostMapping
    public ResponseEntity<Episode> save(@RequestBody Episode episode){
        return ResponseEntity.status(201).body(episodeService.save(episode));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        episodeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
