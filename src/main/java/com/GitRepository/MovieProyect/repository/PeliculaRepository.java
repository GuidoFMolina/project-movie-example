package com.GitRepository.MovieProyect.repository;

import com.GitRepository.MovieProyect.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
}
