package cl.tiempoInvertido.backend.service;


import cl.tiempoInvertido.backend.exception.ShowNotFoundException;
import cl.tiempoInvertido.backend.model.Show;
import cl.tiempoInvertido.backend.repository.ShowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShowService {

    private final ShowRepository showRepo;


    public List<Show> findAll(){
        return showRepo.findAll();
    }

    public Show findById(Long id){
        return showRepo.findById(id).orElseThrow(() -> new ShowNotFoundException(id));
    }

    public Show save(Show show){
        return showRepo.save(show);
    }

    public void deleteById(Long id){
        showRepo.deleteById(id);
    }
}
