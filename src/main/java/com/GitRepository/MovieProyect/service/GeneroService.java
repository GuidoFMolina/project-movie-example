package com.GitRepository.MovieProyect.service;

import com.GitRepository.MovieProyect.model.Genero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.GitRepository.MovieProyect.repository.GeneroRepository;

import java.util.List;

@Service
public class GeneroService {
    @Autowired
    private GeneroRepository repository;

    public List<Genero> getGenerosList() {
        return repository.findAll();
    }
    public Genero getGenero(Long id){
        return repository.findById(id).get();
    }
    public void addGenero(Genero genero){
        repository.save(genero);
    }
    public void removeGenero(Long id){
        repository.deleteById(id);
    }
}
