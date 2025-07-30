package com.web_rpg.backend.controller;

import com.web_rpg.backend.model.Personagem;
import com.web_rpg.backend.repository.PersonagemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personagens")
@CrossOrigin(origins = "http://localhost:3000") // Permite o React acessar
public class PersonagemController {

    private final PersonagemRepository personagemRepository;

    public PersonagemController(PersonagemRepository personagemRepository) {
        this.personagemRepository = personagemRepository;
    }

    @GetMapping
    public List<Personagem> listarTodos() {
        return personagemRepository.findAll();
    }

    @PostMapping
    public Personagem criar(@RequestBody Personagem personagem) {
        return personagemRepository.save(personagem);
    }
}
