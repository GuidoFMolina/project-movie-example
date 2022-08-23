package service;

import model.Personaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PersonajeRepository;
import java.util.List;

@Service
public class PersonajeService {
    @Autowired
     private PersonajeRepository repository;

    public void addPersonaje(Personaje personaje) {
        repository.save(personaje);
    }
    public List<Personaje> getPersonajeList(){
        return  repository.findAll();
    }
    public Personaje getPersonaje(Long id) {
        return repository.findById(id).get();
    }

    public void removePersonaje(Long id) {
        repository.deleteById(id);
    }
}
