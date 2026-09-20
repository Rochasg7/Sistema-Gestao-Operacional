package com.gabriel.gestao_operacional.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Setor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Integer ordemPadrao;

    public Setor() {
    }

    public Setor(String nome, Integer ordemPadrao) {
        this.nome = nome;
        this.ordemPadrao = ordemPadrao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getOrdemPadrao() {
        return ordemPadrao;
    }

    public void setOrdemPadrao(Integer ordemPadrao) {
        this.ordemPadrao = ordemPadrao;
    }
}