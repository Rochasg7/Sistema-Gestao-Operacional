package com.gabriel.gestao_operacional.model;

import jakarta.persistence.*;

@Entity
public class ItemTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String materialCodigo;

    private String materialNome;

    @ManyToOne
    @JoinColumn(name = "setor_destino_id")
    private Setor setorDestino;

    private Double quantidadePadrao;

    private String unidade;

    @ManyToOne
    @JoinColumn(name = "template_id")
    private Template template;

    public ItemTemplate() {
    }

    public ItemTemplate(String materialCodigo, String materialNome, Setor setorDestino,
                         Double quantidadePadrao, String unidade, Template template) {
        this.materialCodigo = materialCodigo;
        this.materialNome = materialNome;
        this.setorDestino = setorDestino;
        this.quantidadePadrao = quantidadePadrao;
        this.unidade = unidade;
        this.template = template;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaterialCodigo() {
        return materialCodigo;
    }

    public void setMaterialCodigo(String materialCodigo) {
        this.materialCodigo = materialCodigo;
    }

    public String getMaterialNome() {
        return materialNome;
    }

    public void setMaterialNome(String materialNome) {
        this.materialNome = materialNome;
    }

    public Setor getSetorDestino() {
        return setorDestino;
    }

    public void setSetorDestino(Setor setorDestino) {
        this.setorDestino = setorDestino;
    }

    public Double getQuantidadePadrao() {
        return quantidadePadrao;
    }

    public void setQuantidadePadrao(Double quantidadePadrao) {
        this.quantidadePadrao = quantidadePadrao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }
}