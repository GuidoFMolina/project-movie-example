package service;

import model.Serie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.SerieRepository;

import java.util.List;

@Service
public class SerieService {
    @Autowired
    SerieRepository repository;

    public List<Serie> getSerieList() {
        return repository.findAll();
    }
    public Serie getSerie(Long id) {
        return repository.findById(id).get();
    }
    public void deleteSerie(Long id) {
        repository.deleteById(id);
    }
    public void addSerie(Serie serie) {
        repository.save(serie);
    }
}
