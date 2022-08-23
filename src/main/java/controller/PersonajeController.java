package controller;

import model.Personaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.PersonajeService;

@RestController
public class PersonajeController {

    @Autowired
    PersonajeService service;

    @PostMapping("/Personaje")
    public void addPerosnaje(@RequestBody Personaje personaje) {
        service.addPersonaje(personaje);
    }
}
