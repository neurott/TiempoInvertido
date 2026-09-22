package cl.tiempoInvertido.backend.controller;

import cl.tiempoInvertido.backend.service.EpisodeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/episodes")
public class EpisodeController {

    private EpisodeService episodeService;


}
