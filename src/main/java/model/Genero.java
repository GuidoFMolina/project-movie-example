package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGenero;

    private String name;
    @ManyToMany(cascade = {CascadeType.ALL}, mappedBy = "listaGeneros")
    private Set<Pelicula> listaPeliculas = new HashSet<Pelicula>();
    @ManyToMany(cascade = {CascadeType.ALL}, mappedBy = "listaGeneros")
    private Set<Serie> listaSerie = new HashSet<Serie>();

    public Genero() {
    }

    public Genero(String name, Set<Pelicula> listaPeliculas, Set<Serie> listaSerie) {
        this.name = name;
        this.listaPeliculas = listaPeliculas;
        this.listaSerie = listaSerie;
    }

    public Long getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Long idGenero) {
        this.idGenero = idGenero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
