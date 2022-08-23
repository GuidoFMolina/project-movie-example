package com.GitRepository.MovieProyect.controller;

import com.GitRepository.MovieProyect.model.Personaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.GitRepository.MovieProyect.service.PersonajeService;

import java.util.List;

@RestController
public class PersonajeController {

    @Autowired
    PersonajeService service;

    @GetMapping("/personaje")
    public List<Personaje> getPersonajeList() {
        return service.getPersonajeList();
    }
    @GetMapping("/personaje/{id}")
    ResponseEntity<Personaje> getPersonaje(@PathVariable Long id) {
       try{
           Personaje personaje = service.getPersonaje(id);
           return new ResponseEntity<> (personaje, HttpStatus.OK);
       }catch(Exception e){
           return new ResponseEntity (HttpStatus.NOT_FOUND);
       }
    }

    @PostMapping("/personaje")
    public void addPersonaje(@RequestBody Personaje personaje) {
        service.addPersonaje(personaje);
    }
    @PutMapping("/personaje/{id}")
    public ResponseEntity<?> updatePersonaje(@RequestBody Personaje personaje, @PathVariable Long id){
        try {
            Personaje personajeModificable = service.getPersonaje(id);
            personajeModificable.setAge_personaje(personaje.getAge_personaje());
            personajeModificable.setName_personaje(personaje.getName_personaje());
            personajeModificable.setPeso_personaje(personaje.getPeso_personaje());
            personajeModificable.setHistory(personaje.getHistory());
            return new ResponseEntity<Personaje>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Personaje>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/personaje/{id}")
    public void deletePersonaje(@PathVariable Long id) {
        service.removePersonaje(id);

    }

}
