package service;

import model.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PeliculaRepository;

import java.util.List;
@Service
public class PeliculaService {
    @Autowired
    private PeliculaRepository repository;

    public List<Pelicula> getPeliculaList() {
        return repository.findAll();
    }
    public void addPelicula(Pelicula pelicula) {
        repository.save(pelicula);
    }
    public Pelicula getPelicula(Long id) {
        return repository.findById(id).get();
    }
    public void removePelicula(Long id) {
        repository.deleteById(id);
    }
}
