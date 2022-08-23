package com.GitRepository.MovieProyect.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "Personaje")
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_personaje;

    @Column (name = "Edad", nullable = false, length =2)
    private Integer age_personaje;
    @Column (name = "Peso", nullable = false, length =10)
    private Double peso_personaje;
    @Column (name = "Nombre", nullable = false, length =70)
    private String name_personaje;
    @Column (name = "Historia", nullable = false, length =225)
    private String history;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="PersonajePelicula", joinColumns={@JoinColumn(name="IdPersonaje")},
            inverseJoinColumns={@JoinColumn(name="IdPelicula")})
    private Set<Pelicula> listaPeliculas = new HashSet<Pelicula>();
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="PersonajeSerie", joinColumns={@JoinColumn(name="IdPersonaje")},
            inverseJoinColumns={@JoinColumn(name="IdSerie")})
    private Set<Serie> listaSerie = new HashSet<Serie>();


    public Personaje() {}

    public Personaje(Integer age_personaje, Double peso_personaje, String name_personaje,
                     String history, Set<Pelicula> listaPeliculas, Set<Serie> listaSerie) {
        this.age_personaje = age_personaje;
        this.peso_personaje = peso_personaje;
        this.name_personaje = name_personaje;
        this.history = history;
        this.listaPeliculas = listaPeliculas;
        this.listaSerie = listaSerie;
    }

    public Long getId_personaje() {
        return id_personaje;
    }

    public void setId_personaje(Long id_personaje) {
        this.id_personaje = id_personaje;
    }

    public Integer getAge_personaje() {
        return age_personaje;
    }

    public void setAge_personaje(Integer age_personaje) {
        this.age_personaje = age_personaje;
    }

    public Double getPeso_personaje() {
        return peso_personaje;
    }

    public void setPeso_personaje(Double peso_personaje) {
        this.peso_personaje = peso_personaje;
    }

    public String getName_personaje() {
        return name_personaje;
    }

    public void setName_personaje(String name_personaje) {
        this.name_personaje = name_personaje;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public Set<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(Set<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public Set<Serie> getListaSerie() {
        return listaSerie;
    }

    public void setListaSerie(Set<Serie> listaSerie) {
        this.listaSerie = listaSerie;
    }
}
