package com.gabriel.gestao_operacional.model;

import jakarta.persistence.*;

@Entity
public class ItemOP {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String materialCodigo;

    private String materialNome;

    @ManyToOne
    @JoinColumn(name = "setor_destino_id")
    private Setor setorDestino;

    private Double quantidade;

    private String unidade;

    private String materialSubstitutoCodigo;

    private String materialSubstitutoNome;

    @ManyToOne
    @JoinColumn(name = "ordem_producao_id")
    private OrdemProducao ordemProducao;

    public ItemOP() {
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

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getMaterialSubstitutoCodigo() {
        return materialSubstitutoCodigo;
    }

    public void setMaterialSubstitutoCodigo(String materialSubstitutoCodigo) {
        this.materialSubstitutoCodigo = materialSubstitutoCodigo;
    }

    public String getMaterialSubstitutoNome() {
        return materialSubstitutoNome;
    }

    public void setMaterialSubstitutoNome(String materialSubstitutoNome) {
        this.materialSubstitutoNome = materialSubstitutoNome;
    }

    public OrdemProducao getOrdemProducao() {
        return ordemProducao;
    }

    public void setOrdemProducao(OrdemProducao ordemProducao) {
        this.ordemProducao = ordemProducao;
    }
}