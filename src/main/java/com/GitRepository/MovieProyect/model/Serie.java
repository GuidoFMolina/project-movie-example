package com.GitRepository.MovieProyect.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "Serie")
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSerie;
    @Column(name = "Titulo", nullable = false, length = 225)
    private String title;
    @Column (name = "Año", nullable = false, length =6)
    private Integer yearSerie;
    @Column (name = "Calificacion", nullable = false, length = 6)
    private Integer calificacion;
    @ManyToMany(cascade = {CascadeType.ALL}, mappedBy = "listaSerie")
    private List<Personaje> listPersonajes;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="SerieGeneros", joinColumns={@JoinColumn(name="idSerie")},
            inverseJoinColumns={@JoinColumn(name="idGenero")})
    private Set<Genero> listaGeneros = new HashSet<Genero>();

    public Serie() {
    }

    public Serie(String title, Integer yearSerie, Integer calificacion,
                 List<Personaje> listPersonajes, Set<Genero> listaGeneros) {
        this.title = title;
        this.yearSerie = yearSerie;
        this.calificacion = calificacion;
        this.listPersonajes = listPersonajes;
        this.listaGeneros = listaGeneros;
    }

    public Long getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(Long idSerie) {
        this.idSerie = idSerie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYearSerie() {
        return yearSerie;
    }

    public void setYearSerie(Integer yearSerie) {
        this.yearSerie = yearSerie;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public List<Personaje> getListPersonajes() {
        return listPersonajes;
    }

    public void setListPersonajes(List<Personaje> listPersonajes) {
        this.listPersonajes = listPersonajes;
    }

    public Set<Genero> getListaGeneros() {
        return listaGeneros;
    }

    public void setListaGeneros(Set<Genero> listaGeneros) {
        this.listaGeneros = listaGeneros;
    }
}
