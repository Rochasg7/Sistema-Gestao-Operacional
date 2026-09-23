package com.gabriel.gestao_operacional.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Template {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomePedido;

    @OneToMany(mappedBy = "template", cascade = CascadeType.ALL)
    private List<ItemTemplate> itens = new ArrayList<>();

    public Template() {
    }

    public Template(String nomePedido) {
        this.nomePedido = nomePedido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePedido() {
        return nomePedido;
    }

    public void setNomePedido(String nomePedido) {
        this.nomePedido = nomePedido;
    }

    public List<ItemTemplate> getItens() {
        return itens;
    }

    public void setItens(List<ItemTemplate> itens) {
        this.itens = itens;
    }
}