package com.web_rpg.backend.repository;

import com.web_rpg.backend.model.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonagemRepository extends JpaRepository<Personagem, Long> {
}
