package com.web_rpg.backend.model;

import jakarta.persistence.*;

@Entity
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String classe;
    private int nivel;

    // Getters e Setters
    public Long getId() { return id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getClasse() { return classe; }
    public void setClasse(String classe) { this.classe = classe; }

    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }
}