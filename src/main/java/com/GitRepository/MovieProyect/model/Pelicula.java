package com.GitRepository.MovieProyect.model;


import javax.persistence.*;
import java.util.HashSet;

import java.util.Set;

@Entity(name = "Pelicula")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPelicula;
    @Column(name = "Titulo", nullable = false, length = 225)
    private String title;
    @Column(name = "Año", nullable = false, length = 6)
    private Integer yearPelicula;
    @Column(name = "Calificacion", nullable = false, length =2)
    private Integer calificacion;
    @ManyToMany(cascade = {CascadeType.ALL},mappedBy="listaPeliculas")
    private Set<Personaje> listPersonajes = new HashSet<Personaje>();
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="PeliculaGeneros", joinColumns={@JoinColumn(name="idPelicula")},
            inverseJoinColumns={ @JoinColumn(name="idGenero")})
    private Set<Genero> listaGeneros = new HashSet<Genero>();

    public Pelicula() {
    }

    public Pelicula(String title, Integer yearPelicula, Integer calificacion, Set<Personaje> listPersonajes, Set<Genero> listaGeneros) {
        this.title = title;
        this.yearPelicula = yearPelicula;
        this.calificacion = calificacion;
        this.listPersonajes = listPersonajes;
        this.listaGeneros = listaGeneros;
    }

    public Long getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Long idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYearPelicula() {
        return yearPelicula;
    }

    public void setYearPelicula(Integer yearPelicula) {
        this.yearPelicula = yearPelicula;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public Set<Personaje> getListPersonajes() {
        return listPersonajes;
    }

    public void setListPersonajes(Set<Personaje> listPersonajes) {
        this.listPersonajes = listPersonajes;
    }

    public Set<Genero> getListaGeneros() {
        return listaGeneros;
    }

    public void setListaGeneros(Set<Genero> listaGeneros) {
        this.listaGeneros = listaGeneros;
    }
}
